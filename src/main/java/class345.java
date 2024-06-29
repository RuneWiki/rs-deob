import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class345 extends class107 {

    @OriginalMember(owner = "client!hda", name = "K", descriptor = "Z")
    private boolean field5100 = false;

    @OriginalMember(owner = "client!hda", name = "I", descriptor = "I")
    private int field5098;

    @OriginalMember(owner = "client!hda", name = "N", descriptor = "Ljava/lang/Class;")
    public static Class field5103;

    @OriginalMember(owner = "client!hda", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5101;

    @OriginalMember(owner = "client!hda", name = "J", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5099;

    @OriginalMember(owner = "client!hda", name = "M", descriptor = "[B")
    private byte[] field5102;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "()V")
    public final void method865() {
        if (this.field5099 != null) {
            this.field5099.close();
            this.field5099 = null;
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "()V")
    public final void method866() throws LineUnavailableException {
        this.field5099.flush();
        if (!this.field5100) {
            return;
        }
        this.field5099.close();
        this.field5099 = null;
        Info var1 = new Info(field5103 == null ? (field5103 = method2209("javax.sound.sampled.SourceDataLine")) : field5103, this.field5101, this.field5098 << (class53.field849 ? 2 : 1));
        this.field5099 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5099.open();
        this.field5099.start();
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
    public final void method876(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5103 == null ? (field5103 = method2209("javax.sound.sampled.SourceDataLine")) : field5103, this.field5101, arg0 << (class53.field849 ? 2 : 1));
            this.field5099 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5099.open();
            this.field5099.start();
            this.field5098 = arg0;
        } catch (LineUnavailableException var4) {
            if (class114.method917(arg0, -2089) == 1) {
                this.field5099 = null;
                throw var4;
            } else {
                this.method876(class567.method3292(arg0, -108));
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method867(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5100 = true;
                    }
                }
            }
        }
        this.field5101 = new AudioFormat((float) class608.field8585, 16, class53.field849 ? 2 : 1, true, false);
        this.field5102 = new byte[0x100 << (class53.field849 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "()I")
    public final int method870() {
        return this.field5098 - (this.field5099.available() >> (class53.field849 ? 2 : 1));
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "()V")
    public final void method861() {
        int var1 = 256;
        if (class53.field849) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1567[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5102[var2 * 2] = (byte) (var3 >> 8);
            this.field5102[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5099.write(this.field5102, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2209(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
