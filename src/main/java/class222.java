import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class222 extends class289 {

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "Z")
    private boolean field3615 = false;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    private int field3613;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field3618;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3616;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3617;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "[B")
    private byte[] field3614;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method777(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3615 = true;
                    }
                }
            }
        }
        this.field3616 = new AudioFormat((float) class133.field2103, 16, class262.field4214 ? 2 : 1, true, false);
        this.field3614 = new byte[0x100 << (class262.field4214 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public final void method774(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field3618 == null ? (field3618 = method1522("javax.sound.sampled.SourceDataLine")) : field3618, this.field3616, arg0 << (class262.field4214 ? 2 : 1));
            this.field3617 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3617.open();
            this.field3617.start();
            this.field3613 = arg0;
        } catch (LineUnavailableException var4) {
            if (class126.method878(10953, arg0) == 1) {
                this.field3617 = null;
                throw var4;
            } else {
                this.method774(class247.method1654(arg0, 455314946));
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()I")
    public final int method778() {
        return this.field3613 - (this.field3617.available() >> (class262.field4214 ? 2 : 1));
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    public final void method772() {
        int var1 = 256;
        if (class262.field4214) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4637[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3614[var2 * 2] = (byte) (var3 >> 8);
            this.field3614[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3617.write(this.field3614, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
    public final void method776() throws LineUnavailableException {
        this.field3617.flush();
        if (!this.field3615) {
            return;
        }
        this.field3617.close();
        this.field3617 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field3618 == null ? (field3618 = method1522("javax.sound.sampled.SourceDataLine")) : field3618, this.field3616, this.field3613 << (class262.field4214 ? 2 : 1));
        this.field3617 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3617.open();
        this.field3617.start();
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
    public final void method775() {
        if (this.field3617 != null) {
            this.field3617.close();
            this.field3617 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1522(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
