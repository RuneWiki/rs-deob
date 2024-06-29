import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class228 extends class156 {

    @OriginalMember(owner = "client!d", name = "O", descriptor = "Z")
    private boolean field3895 = false;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field3900;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field3896;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field3898;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "[B")
    private byte[] field3897;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "()V")
    public final void method1087() throws LineUnavailableException {
        this.field3898.flush();
        if (!this.field3895) {
            return;
        }
        this.field3898.close();
        this.field3898 = null;
        Info var1 = new Info(field3900 == null ? (field3900 = method1513("javax.sound.sampled.SourceDataLine")) : field3900, this.field3896, this.field3899 << (class268.field4571 ? 2 : 1));
        this.field3898 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field3898.open();
        this.field3898.start();
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "()V")
    public final void method1084() {
        if (this.field3898 != null) {
            this.field3898.close();
            this.field3898 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
    public final void method1077() {
        int var1 = 256;
        if (class268.field4571) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2772[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field3897[var2 * 2] = (byte) (var3 >> 8);
            this.field3897[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field3898.write(this.field3897, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method1086(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            int var3 = 0;
            javax.sound.sampled.Mixer.Info[] var4 = var2;
            while (var3 < var4.length) {
                javax.sound.sampled.Mixer.Info var5 = var4[var3];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field3895 = true;
                    }
                }
                var3++;
            }
        }
        this.field3896 = new AudioFormat((float) class255.field4372, 16, class268.field4571 ? 2 : 1, true, false);
        this.field3897 = new byte[0x100 << (class268.field4571 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
    public final int method1081() {
        return this.field3899 - (this.field3898.available() >> (class268.field4571 ? 2 : 1));
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public final void method1072(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field3900 == null ? (field3900 = method1513("javax.sound.sampled.SourceDataLine")) : field3900, this.field3896, arg0 << (class268.field4571 ? 2 : 1));
            this.field3898 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field3898.open();
            this.field3898.start();
            this.field3899 = arg0;
        } catch (LineUnavailableException var4) {
            if (class37.method379(15228, arg0) == 1) {
                this.field3898 = null;
                throw var4;
            } else {
                this.method1072(class10.method114(arg0, (byte) -120));
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1513(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
