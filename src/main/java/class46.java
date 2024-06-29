import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class46 extends class25 {

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "Z")
    private boolean field994 = false;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    private int field993;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field996;

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field992;

    @OriginalMember(owner = "client!ea", name = "F", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field991;

    @OriginalMember(owner = "client!ea", name = "R", descriptor = "[B")
    private byte[] field995;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method221() {
        return this.field993 - (this.field991.available() >> (class66.field1271 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public final void method228(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field996 == null ? (field996 = method378("javax.sound.sampled.SourceDataLine")) : field996, this.field992, arg0 << (class66.field1271 ? 2 : 1));
            this.field991 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field991.open();
            this.field991.start();
            this.field993 = arg0;
        } catch (LineUnavailableException var4) {
            if (class133.method888(126, arg0) == 1) {
                this.field991 = null;
                throw var4;
            } else {
                this.method228(class68.method479(arg0, 102));
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
    public final void method224() throws LineUnavailableException {
        this.field991.flush();
        if (!this.field994) {
            return;
        }
        this.field991.close();
        this.field991 = null;
        Info var1 = new Info(field996 == null ? (field996 = method378("javax.sound.sampled.SourceDataLine")) : field996, this.field992, this.field993 << (class66.field1271 ? 2 : 1));
        this.field991 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field991.open();
        this.field991.start();
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public final void method213() {
        int var1 = 256;
        if (class66.field1271) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field636[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field995[var2 * 2] = (byte) (var3 >> 8);
            this.field995[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field991.write(this.field995, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
    public final void method216() {
        if (this.field991 != null) {
            this.field991.close();
            this.field991 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method223(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field994 = true;
                    }
                }
            }
        }
        this.field992 = new AudioFormat((float) class214.field3883, 16, class66.field1271 ? 2 : 1, true, false);
        this.field995 = new byte[0x100 << (class66.field1271 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method378(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
