import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class129 extends class53 {

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "Z")
    private boolean field1977 = false;

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    private int field1975;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field1980;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1978;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1976;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "[B")
    private byte[] field1979;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()V", line = 12)
    public final void method394() {
        if (this.field1976 != null) {
            this.field1976.close();
            this.field1976 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 29)
    public final void method398(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1977 = true;
                    }
                }
            }
        }
        this.field1978 = new AudioFormat((float) class168.field2603, 16, class26.field395 ? 2 : 1, true, false);
        this.field1979 = new byte[0x100 << (class26.field395 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 69)
    public final void method384(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1980 == null ? (field1980 = method870("javax.sound.sampled.SourceDataLine")) : field1980, this.field1978, arg0 << (class26.field395 ? 2 : 1));
            this.field1976 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1976.open();
            this.field1976.start();
            this.field1975 = arg0;
        } catch (LineUnavailableException var4) {
            if (class189.method1291(arg0, -125) == 1) {
                this.field1976 = null;
                throw var4;
            } else {
                this.method384(class313.method2175((byte) 76, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 69)
    public static Class method870(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V", line = 94)
    public final void method385() throws LineUnavailableException {
        this.field1976.flush();
        if (!this.field1977) {
            return;
        }
        this.field1976.close();
        this.field1976 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1980 == null ? (field1980 = method870("javax.sound.sampled.SourceDataLine")) : field1980, this.field1978, this.field1975 << (class26.field395 ? 2 : 1));
        this.field1976 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1976.open();
        this.field1976.start();
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I", line = 114)
    public final int method391() {
        return this.field1975 - (this.field1976.available() >> (class26.field395 ? 2 : 1));
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 125)
    public final void method383() {
        int var1 = 256;
        if (class26.field395) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field839[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1979[var2 * 2] = (byte) (var3 >> 8);
            this.field1979[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1976.write(this.field1979, 0, var1 << 1);
    }
}
