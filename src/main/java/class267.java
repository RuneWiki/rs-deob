import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class267 extends class331 {

    @OriginalMember(owner = "client!md", name = "N", descriptor = "Z")
    private boolean field4108 = false;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    private int field4110;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field4113;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4111;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4109;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "[B")
    private byte[] field4112;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 14)
    public final void method1852(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4113 == null ? (field4113 = method1858("javax.sound.sampled.SourceDataLine")) : field4113, this.field4111, arg0 << (class52.field774 ? 2 : 1));
            this.field4109 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4109.open();
            this.field4109.start();
            this.field4110 = arg0;
        } catch (LineUnavailableException var4) {
            if (class170.method1272(-119, arg0) == 1) {
                this.field4109 = null;
                throw var4;
            } else {
                this.method1852(class319.method2255(1, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 14)
    public static Class method1858(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V", line = 37)
    public final void method1853() {
        int var1 = 256;
        if (class52.field774) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field5140[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4112[var2 * 2] = (byte) (var3 >> 8);
            this.field4112[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4109.write(this.field4112, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 73)
    public final void method1854(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4108 = true;
                    }
                }
            }
        }
        this.field4111 = new AudioFormat((float) class297.field4778, 16, class52.field774 ? 2 : 1, true, false);
        this.field4112 = new byte[0x100 << (class52.field774 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "()V", line = 108)
    public final void method1855() throws LineUnavailableException {
        this.field4109.flush();
        if (!this.field4108) {
            return;
        }
        this.field4109.close();
        this.field4109 = null;
        Info var1 = new Info(field4113 == null ? (field4113 = method1858("javax.sound.sampled.SourceDataLine")) : field4113, this.field4111, this.field4110 << (class52.field774 ? 2 : 1));
        this.field4109 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4109.open();
        this.field4109.start();
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "()I", line = 129)
    public final int method1856() {
        return this.field4110 - (this.field4109.available() >> (class52.field774 ? 2 : 1));
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "()V", line = 143)
    public final void method1857() {
        if (this.field4109 != null) {
            this.field4109.close();
            this.field4109 = null;
        }
    }
}
