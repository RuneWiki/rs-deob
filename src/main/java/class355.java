import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class355 extends class11 {

    @OriginalMember(owner = "client!dk", name = "R", descriptor = "Z")
    private boolean field4572 = false;

    @OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
    private int field4569;

    @OriginalMember(owner = "client!dk", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4573;

    @OriginalMember(owner = "client!dk", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4568;

    @OriginalMember(owner = "client!dk", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4571;

    @OriginalMember(owner = "client!dk", name = "P", descriptor = "[B")
    private byte[] field4570;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 12)
    public final void method79(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4573 == null ? (field4573 = method2036("javax.sound.sampled.SourceDataLine")) : field4573, this.field4568, arg0 << (class8.field72 ? 2 : 1));
            this.field4571 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4571.open();
            this.field4571.start();
            this.field4569 = arg0;
        } catch (LineUnavailableException var4) {
            if (class161.method1035((byte) -68, arg0) == 1) {
                this.field4571 = null;
                throw var4;
            } else {
                this.method79(class60.method550(108, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method2036(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "()V", line = 36)
    public final void method86() {
        int var1 = 256;
        if (class8.field72) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field168[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4570[var2 * 2] = (byte) (var3 >> 8);
            this.field4570[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4571.write(this.field4570, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "()V", line = 71)
    public final void method81() throws LineUnavailableException {
        this.field4571.flush();
        if (!this.field4572) {
            return;
        }
        this.field4571.close();
        this.field4571 = null;
        Info var1 = new Info(field4573 == null ? (field4573 = method2036("javax.sound.sampled.SourceDataLine")) : field4573, this.field4568, this.field4569 << (class8.field72 ? 2 : 1));
        this.field4571 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4571.open();
        this.field4571.start();
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 90)
    public final void method90(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4572 = true;
                    }
                }
            }
        }
        this.field4568 = new AudioFormat((float) class94.field1140, 16, class8.field72 ? 2 : 1, true, false);
        this.field4570 = new byte[0x100 << (class8.field72 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "()I", line = 126)
    public final int method84() {
        return this.field4569 - (this.field4571.available() >> (class8.field72 ? 2 : 1));
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "()V", line = 136)
    public final void method82() {
        if (this.field4571 != null) {
            this.field4571.close();
            this.field4571 = null;
        }
    }
}
