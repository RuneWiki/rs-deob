import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class382 extends class386 {

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Z")
    private boolean field5362 = false;

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "I")
    private int field5360;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field5365;

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field5364;

    @OriginalMember(owner = "client!mf", name = "H", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field5363;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "[B")
    private byte[] field5361;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 14)
    public final void method2011(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field5365 == null ? (field5365 = method2206("javax.sound.sampled.SourceDataLine")) : field5365, this.field5364, arg0 << (class581.field8101 ? 2 : 1));
            this.field5363 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field5363.open();
            this.field5363.start();
            this.field5360 = arg0;
        } catch (LineUnavailableException var4) {
            if (class385.method2212((byte) -125, arg0) == 1) {
                this.field5363 = null;
                throw var4;
            } else {
                this.method2011(class350.method2082(126, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 14)
    public static Class method2206(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 36)
    public final void method2008(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field5362 = true;
                    }
                }
            }
        }
        this.field5364 = new AudioFormat((float) class29.field359, 16, class581.field8101 ? 2 : 1, true, false);
        this.field5361 = new byte[0x100 << (class581.field8101 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "()V", line = 71)
    public final void method2009() {
        if (this.field5363 != null) {
            this.field5363.close();
            this.field5363 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()V", line = 87)
    public final void method2006() {
        int var1 = 256;
        if (class581.field8101) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5414[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field5361[var2 * 2] = (byte) (var3 >> 8);
            this.field5361[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field5363.write(this.field5361, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "()V", line = 123)
    public final void method2010() throws LineUnavailableException {
        this.field5363.flush();
        if (!this.field5362) {
            return;
        }
        this.field5363.close();
        this.field5363 = null;
        Info var1 = new Info(field5365 == null ? (field5365 = method2206("javax.sound.sampled.SourceDataLine")) : field5365, this.field5364, this.field5360 << (class581.field8101 ? 2 : 1));
        this.field5363 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field5363.open();
        this.field5363.start();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "()I", line = 145)
    public final int method2007() {
        return this.field5360 - (this.field5363.available() >> (class581.field8101 ? 2 : 1));
    }
}
