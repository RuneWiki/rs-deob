import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class225 extends class42 {

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "Z")
    private boolean field3426 = false;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "I")
    private int field3428;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field3431;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3427;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3430;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "[B")
    private byte[] field3429;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "()V")
    public final void method239() {
        int var1 = 256;
        if (class278.field4229) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field520[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3429[var2 * 2] = (byte) (var3 >> 8);
            this.field3429[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3430.write(this.field3429, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "()V")
    public final void method237() throws LineUnavailableException {
        this.field3430.flush();
        if (!this.field3426) {
            return;
        }
        this.field3430.close();
        this.field3430 = null;
        Info var1 = new Info(field3431 == null ? (field3431 = method1368("javax.sound.sampled.SourceDataLine")) : field3431, this.field3427, this.field3428 << (class278.field4229 ? 2 : 1));
        this.field3430 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3430.open();
        this.field3430.start();
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method243(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3426 = true;
                    }
                }
            }
        }
        this.field3427 = new AudioFormat((float) class81.field1082, 16, class278.field4229 ? 2 : 1, true, false);
        this.field3429 = new byte[0x100 << (class278.field4229 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "()V")
    public final void method236() {
        if (this.field3430 != null) {
            this.field3430.close();
            this.field3430 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
    public final void method242(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3431 == null ? (field3431 = method1368("javax.sound.sampled.SourceDataLine")) : field3431, this.field3427, arg0 << (class278.field4229 ? 2 : 1));
            this.field3430 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3430.open();
            this.field3430.start();
            this.field3428 = arg0;
        } catch (LineUnavailableException var4) {
            if (class230.method1394((byte) -96, arg0) == 1) {
                this.field3430 = null;
                throw var4;
            } else {
                this.method242(class196.method1174(45, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "()I")
    public final int method234() {
        return this.field3428 - (this.field3430.available() >> (class278.field4229 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1368(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
