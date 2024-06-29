import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.Mixer.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class114 extends class175 {

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "Z")
    private boolean field1898 = false;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    private int field1895;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field1900;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1897;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1899;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
    private byte[] field1896;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V")
    public final void method836() {
        int var1 = 256;
        if (class133.field2128) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field2747[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1896[var2 * 2] = (byte) (var3 >> 8);
            this.field1896[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1899.write(this.field1896, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method837(Component arg0) {
        Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1898 = true;
                    }
                }
            }
        }
        this.field1897 = new AudioFormat((float) class99.field1621, 16, class133.field2128 ? 2 : 1, true, false);
        this.field1896 = new byte[0x100 << (class133.field2128 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method838(int arg0) throws LineUnavailableException {
        try {
            javax.sound.sampled.DataLine.Info var2 = new javax.sound.sampled.DataLine.Info(field1900 == null ? (field1900 = method842("javax.sound.sampled.SourceDataLine")) : field1900, this.field1897, arg0 << (class133.field2128 ? 2 : 1));
            this.field1899 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1899.open();
            this.field1899.start();
            this.field1895 = arg0;
        } catch (LineUnavailableException var4) {
            if (class258.method1762((byte) 6, arg0) == 1) {
                this.field1899 = null;
                throw var4;
            } else {
                this.method838(class120.method871(arg0, -621722364));
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()I")
    public final int method839() {
        return this.field1895 - (this.field1899.available() >> (class133.field2128 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V")
    public final void method840() throws LineUnavailableException {
        this.field1899.flush();
        if (!this.field1898) {
            return;
        }
        this.field1899.close();
        this.field1899 = null;
        javax.sound.sampled.DataLine.Info var1 = new javax.sound.sampled.DataLine.Info(field1900 == null ? (field1900 = method842("javax.sound.sampled.SourceDataLine")) : field1900, this.field1897, this.field1895 << (class133.field2128 ? 2 : 1));
        this.field1899 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1899.open();
        this.field1899.start();
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V")
    public final void method841() {
        if (this.field1899 != null) {
            this.field1899.close();
            this.field1899 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method842(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
