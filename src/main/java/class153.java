import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class153 extends class239 {

    @OriginalMember(owner = "client!gm", name = "P", descriptor = "Z")
    private boolean field2551 = false;

    @OriginalMember(owner = "client!gm", name = "N", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!gm", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2552;

    @OriginalMember(owner = "client!gm", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2548;

    @OriginalMember(owner = "client!gm", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2550;

    @OriginalMember(owner = "client!gm", name = "L", descriptor = "[B")
    private byte[] field2547;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
    public final void method1164(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2552 == null ? (field2552 = method1170("javax.sound.sampled.SourceDataLine")) : field2552, this.field2548, arg0 << (class54.field970 ? 2 : 1));
            this.field2550 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2550.open();
            this.field2550.start();
            this.field2549 = arg0;
        } catch (LineUnavailableException var4) {
            if (class65.method445((byte) -80, arg0) == 1) {
                this.field2550 = null;
                throw var4;
            } else {
                this.method1164(class91.method633(arg0, (byte) 52));
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "()I")
    public final int method1165() {
        return this.field2549 - (this.field2550.available() >> (class54.field970 ? 2 : 1));
    }

    @OriginalMember(owner = "client!gm", name = "d", descriptor = "()V")
    public final void method1166() throws LineUnavailableException {
        this.field2550.flush();
        if (!this.field2551) {
            return;
        }
        this.field2550.close();
        this.field2550 = null;
        Info var1 = new Info(field2552 == null ? (field2552 = method1170("javax.sound.sampled.SourceDataLine")) : field2552, this.field2548, this.field2549 << (class54.field970 ? 2 : 1));
        this.field2550 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2550.open();
        this.field2550.start();
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "()V")
    public final void method1167() {
        if (this.field2550 != null) {
            this.field2550.close();
            this.field2550 = null;
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1168(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2551 = true;
                    }
                }
            }
        }
        this.field2548 = new AudioFormat((float) class142.field2343, 16, class54.field970 ? 2 : 1, true, false);
        this.field2547 = new byte[0x100 << (class54.field970 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "()V")
    public final void method1169() {
        int var1 = 256;
        if (class54.field970) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4037[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2547[var2 * 2] = (byte) (var3 >> 8);
            this.field2547[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2550.write(this.field2547, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1170(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
