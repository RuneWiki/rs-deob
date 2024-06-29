import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class1 extends class493 {

    @OriginalMember(owner = "client!is", name = "J", descriptor = "Z")
    private boolean field5 = false;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field6;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4;

    @OriginalMember(owner = "client!is", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "[B")
    private byte[] field2;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "()I", line = 15)
    public final int method1() {
        return this.field3 - (this.field1.available() >> (class414.field5502 ? 2 : 1));
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "()V", line = 22)
    public final void method2() {
        if (this.field1 != null) {
            this.field1.close();
            this.field1 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "()V", line = 38)
    public final void method3() {
        int var1 = 256;
        if (class414.field5502) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field7205[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2[var2 * 2] = (byte) (var3 >> 8);
            this.field2[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1.write(this.field2, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 72)
    public final void method4(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5 = true;
                    }
                }
            }
        }
        this.field4 = new AudioFormat((float) class426.field5847, 16, class414.field5502 ? 2 : 1, true, false);
        this.field2 = new byte[0x100 << (class414.field5502 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "()V", line = 109)
    public final void method5() throws LineUnavailableException {
        this.field1.flush();
        if (!this.field5) {
            return;
        }
        this.field1.close();
        this.field1 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field6 == null ? (field6 = method7("javax.sound.sampled.SourceDataLine")) : field6, this.field4, this.field3 << (class414.field5502 ? 2 : 1));
        this.field1 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1.open();
        this.field1.start();
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 115)
    public static Class method7(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V", line = 133)
    public final void method6(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field6 == null ? (field6 = method7("javax.sound.sampled.SourceDataLine")) : field6, this.field4, arg0 << (class414.field5502 ? 2 : 1));
            this.field1 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1.open();
            this.field1.start();
            this.field3 = arg0;
        } catch (LineUnavailableException var4) {
            if (class208.method1352(true, arg0) == 1) {
                this.field1 = null;
                throw var4;
            } else {
                this.method6(class124.method788(arg0, -116));
            }
        }
    }
}
