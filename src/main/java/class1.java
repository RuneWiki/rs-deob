import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 extends class27 {

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "Z")
    private boolean field4 = false;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    private int field5;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field6;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "[B")
    private byte[] field3;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
    public final int method1() {
        return this.field5 - (this.field2.available() >> (class226.field3636 ? 2 : 1));
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public final void method2(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field6 == null ? (field6 = method7("javax.sound.sampled.SourceDataLine")) : field6, this.field1, arg0 << (class226.field3636 ? 2 : 1));
            this.field2 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2.open();
            this.field2.start();
            this.field5 = arg0;
        } catch (LineUnavailableException var4) {
            if (class45.method257(arg0, true) == 1) {
                this.field2 = null;
                throw var4;
            } else {
                this.method2(class137.method923(-120, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()V")
    public final void method3() {
        int var1 = 256;
        if (class226.field3636) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field362[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3[var2 * 2] = (byte) (var3 >> 8);
            this.field3[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2.write(this.field3, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
    public final void method4() {
        if (this.field2 != null) {
            this.field2.close();
            this.field2 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method5(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4 = true;
                    }
                }
            }
        }
        this.field1 = new AudioFormat((float) class280.field4448, 16, class226.field3636 ? 2 : 1, true, false);
        this.field3 = new byte[0x100 << (class226.field3636 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
    public final void method6() throws LineUnavailableException {
        this.field2.flush();
        if (!this.field4) {
            return;
        }
        this.field2.close();
        this.field2 = null;
        Info var1 = new Info(field6 == null ? (field6 = method7("javax.sound.sampled.SourceDataLine")) : field6, this.field1, this.field5 << (class226.field3636 ? 2 : 1));
        this.field2 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2.open();
        this.field2.start();
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method7(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
