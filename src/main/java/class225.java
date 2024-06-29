import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class225 extends class86 {

    @OriginalMember(owner = "client!gh", name = "eb", descriptor = "Z")
    private boolean field3966 = false;

    @OriginalMember(owner = "client!gh", name = "fb", descriptor = "I")
    private int field3967;

    @OriginalMember(owner = "client!gh", name = "hb", descriptor = "Ljava/lang/Class;")
    public static Class field3969;

    @OriginalMember(owner = "client!gh", name = "gb", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3968;

    @OriginalMember(owner = "client!gh", name = "db", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3965;

    @OriginalMember(owner = "client!gh", name = "J", descriptor = "[B")
    private byte[] field3964;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 11)
    public final void method749(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3966 = true;
                    }
                }
            }
        }
        this.field3968 = new AudioFormat((float) class312.field5524, 16, class287.field5132 ? 2 : 1, true, false);
        this.field3964 = new byte[0x100 << (class287.field5132 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()V", line = 47)
    public final void method753() {
        if (this.field3965 != null) {
            this.field3965.close();
            this.field3965 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()V", line = 67)
    public final void method750() {
        int var1 = 256;
        if (class287.field5132) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1633[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3964[var2 * 2] = (byte) (var3 >> 8);
            this.field3964[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3965.write(this.field3964, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()V", line = 104)
    public final void method746() throws LineUnavailableException {
        this.field3965.flush();
        if (!this.field3966) {
            return;
        }
        this.field3965.close();
        this.field3965 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3969 == null ? (field3969 = method1648("javax.sound.sampled.SourceDataLine")) : field3969, this.field3968, this.field3967 << (class287.field5132 ? 2 : 1));
        this.field3965 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3965.open();
        this.field3965.start();
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 110)
    public static Class method1648(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()I", line = 123)
    public final int method756() {
        return this.field3967 - (this.field3965.available() >> (class287.field5132 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V", line = 133)
    public final void method757(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3969 == null ? (field3969 = method1648("javax.sound.sampled.SourceDataLine")) : field3969, this.field3968, arg0 << (class287.field5132 ? 2 : 1));
            this.field3965 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3965.open();
            this.field3965.start();
            this.field3967 = arg0;
        } catch (LineUnavailableException var4) {
            if (class87.method762(123, arg0) == 1) {
                this.field3965 = null;
                throw var4;
            } else {
                this.method757(class189.method1440(1, arg0));
            }
        }
    }
}
