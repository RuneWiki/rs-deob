import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class282 extends class111 {

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "Z")
    private boolean field4321 = false;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    private int field4319;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field4324;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4322;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4320;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "[B")
    private byte[] field4323;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()V")
    public final void method202() throws LineUnavailableException {
        this.field4320.flush();
        if (!this.field4321) {
            return;
        }
        this.field4320.close();
        this.field4320 = null;
        Info var1 = new Info(field4324 == null ? (field4324 = method1871("javax.sound.sampled.SourceDataLine")) : field4324, this.field4322, this.field4319 << (class133.field1955 ? 2 : 1));
        this.field4320 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4320.open();
        this.field4320.start();
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method198(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4321 = true;
                    }
                }
            }
        }
        this.field4322 = new AudioFormat((float) class174.field2547, 16, class133.field1955 ? 2 : 1, true, false);
        this.field4323 = new byte[0x100 << (class133.field1955 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
    public final void method199() {
        int var1 = 256;
        if (class133.field1955) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1698[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4323[var2 * 2] = (byte) (var3 >> 8);
            this.field4323[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4320.write(this.field4323, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public final void method201(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4324 == null ? (field4324 = method1871("javax.sound.sampled.SourceDataLine")) : field4324, this.field4322, arg0 << (class133.field1955 ? 2 : 1));
            this.field4320 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4320.open();
            this.field4320.start();
            this.field4319 = arg0;
        } catch (LineUnavailableException var4) {
            if (class286.method1901(arg0, 8) == 1) {
                this.field4320 = null;
                throw var4;
            } else {
                this.method201(class239.method1637(arg0, 0));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "()I")
    public final int method203() {
        return this.field4319 - (this.field4320.available() >> (class133.field1955 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()V")
    public final void method197() {
        if (this.field4320 != null) {
            this.field4320.close();
            this.field4320 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1871(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
