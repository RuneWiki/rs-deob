import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class265 extends class91 {

    @OriginalMember(owner = "client!tk", name = "Q", descriptor = "Z")
    private boolean field4189 = false;

    @OriginalMember(owner = "client!tk", name = "S", descriptor = "I")
    private int field4191;

    @OriginalMember(owner = "client!tk", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4192;

    @OriginalMember(owner = "client!tk", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4190;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4188;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "[B")
    private byte[] field4187;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()I", line = 10)
    public final int method6() {
        return this.field4191 - (this.field4188.available() >> (class98.field1499 ? 2 : 1));
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()V", line = 17)
    public final void method7() throws LineUnavailableException {
        this.field4188.flush();
        if (!this.field4189) {
            return;
        }
        this.field4188.close();
        this.field4188 = null;
        Info var1 = new Info(field4192 == null ? (field4192 = method1887("javax.sound.sampled.SourceDataLine")) : field4192, this.field4190, this.field4191 << (class98.field1499 ? 2 : 1));
        this.field4188 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4188.open();
        this.field4188.start();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 24)
    public static Class method1887(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 40)
    public final void method5(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4192 == null ? (field4192 = method1887("javax.sound.sampled.SourceDataLine")) : field4192, this.field4190, arg0 << (class98.field1499 ? 2 : 1));
            this.field4188 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4188.open();
            this.field4188.start();
            this.field4191 = arg0;
        } catch (LineUnavailableException var4) {
            if (class136.method921(arg0, (byte) 83) == 1) {
                this.field4188 = null;
                throw var4;
            } else {
                this.method5(class290.method2032(53, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 64)
    public final void method4(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4189 = true;
                    }
                }
            }
        }
        this.field4190 = new AudioFormat((float) class264.field4185, 16, class98.field1499 ? 2 : 1, true, false);
        this.field4187 = new byte[0x100 << (class98.field1499 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()V", line = 101)
    public final void method3() {
        int var1 = 256;
        if (class98.field1499) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1383[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4187[var2 * 2] = (byte) (var3 >> 8);
            this.field4187[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4188.write(this.field4187, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()V", line = 142)
    public final void method1() {
        if (this.field4188 != null) {
            this.field4188.close();
            this.field4188 = null;
        }
    }
}
