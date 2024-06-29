import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class108 extends class179 {

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "Z")
    private boolean field1679 = false;

    @OriginalMember(owner = "client!uk", name = "I", descriptor = "I")
    private int field1677;

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1681;

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1678;

    @OriginalMember(owner = "client!uk", name = "B", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1676;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "[B")
    private byte[] field1680;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "()V", line = 10)
    public final void method243() {
        if (this.field1676 != null) {
            this.field1676.close();
            this.field1676 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 25)
    public final void method239(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1681 == null ? (field1681 = method758("javax.sound.sampled.SourceDataLine")) : field1681, this.field1678, arg0 << (class242.field3627 ? 2 : 1));
            this.field1676 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1676.open();
            this.field1676.start();
            this.field1677 = arg0;
        } catch (LineUnavailableException var4) {
            if (class129.method961(160, arg0) == 1) {
                this.field1676 = null;
                throw var4;
            } else {
                this.method239(class104.method731(arg0, -88));
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 25)
    public static Class method758(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "()V", line = 48)
    public final void method244() {
        int var1 = 256;
        if (class242.field3627) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2659[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1680[var2 * 2] = (byte) (var3 >> 8);
            this.field1680[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1676.write(this.field1680, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 83)
    public final void method245(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1679 = true;
                    }
                }
            }
        }
        this.field1678 = new AudioFormat((float) class248.field3696, 16, class242.field3627 ? 2 : 1, true, false);
        this.field1680 = new byte[0x100 << (class242.field3627 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 119)
    public final void method241() throws LineUnavailableException {
        this.field1676.flush();
        if (!this.field1679) {
            return;
        }
        this.field1676.close();
        this.field1676 = null;
        Info var1 = new Info(field1681 == null ? (field1681 = method758("javax.sound.sampled.SourceDataLine")) : field1681, this.field1678, this.field1677 << (class242.field3627 ? 2 : 1));
        this.field1676 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1676.open();
        this.field1676.start();
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "()I", line = 147)
    public final int method242() {
        return this.field1677 - (this.field1676.available() >> (class242.field3627 ? 2 : 1));
    }
}
