import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class251 extends class74 {

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "Z")
    private boolean field4015 = false;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "I")
    private int field4016;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field4019;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4014;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4017;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "[B")
    private byte[] field4018;

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()I")
    public final int method187() {
        return this.field4016 - (this.field4017.available() >> (class259.field4107 ? 2 : 1));
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    public final void method185(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4019 == null ? (field4019 = method1705("javax.sound.sampled.SourceDataLine")) : field4019, this.field4014, arg0 << (class259.field4107 ? 2 : 1));
            this.field4017 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4017.open();
            this.field4017.start();
            this.field4016 = arg0;
        } catch (LineUnavailableException var4) {
            if (class219.method1504(arg0, (byte) -40) == 1) {
                this.field4017 = null;
                throw var4;
            } else {
                this.method185(class126.method945(arg0, true));
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()V")
    public final void method186() {
        if (this.field4017 != null) {
            this.field4017.close();
            this.field4017 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()V")
    public final void method188() throws LineUnavailableException {
        this.field4017.flush();
        if (!this.field4015) {
            return;
        }
        this.field4017.close();
        this.field4017 = null;
        Info var1 = new Info(field4019 == null ? (field4019 = method1705("javax.sound.sampled.SourceDataLine")) : field4019, this.field4014, this.field4016 << (class259.field4107 ? 2 : 1));
        this.field4017 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4017.open();
        this.field4017.start();
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method189(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4015 = true;
                    }
                }
            }
        }
        this.field4014 = new AudioFormat((float) class174.field2695, 16, class259.field4107 ? 2 : 1, true, false);
        this.field4018 = new byte[0x100 << (class259.field4107 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()V")
    public final void method184() {
        int var1 = 256;
        if (class259.field4107) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1127[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4018[var2 * 2] = (byte) (var3 >> 8);
            this.field4018[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4017.write(this.field4018, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1705(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
