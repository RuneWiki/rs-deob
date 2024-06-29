import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class164 extends class67 {

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "Z")
    private boolean field2667 = false;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    private int field2663;

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "Ljava/lang/Class;")
    public static Class field2668;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2664;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field2666;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[B")
    private byte[] field2665;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 12)
    public final void method560(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2668 == null ? (field2668 = method1163("javax.sound.sampled.SourceDataLine")) : field2668, this.field2664, arg0 << (class274.field4723 ? 2 : 1));
            this.field2666 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field2666.open();
            this.field2666.start();
            this.field2663 = arg0;
        } catch (LineUnavailableException var4) {
            if (class19.method127(arg0, 104) == 1) {
                this.field2666 = null;
                throw var4;
            } else {
                this.method560(class43.method293(true, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 12)
    public static Class method1163(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "()V", line = 35)
    public final void method562() {
        if (this.field2666 != null) {
            this.field2666.close();
            this.field2666 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 50)
    public final void method548(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field2667 = true;
                    }
                }
            }
        }
        this.field2664 = new AudioFormat((float) class84.field1322, 16, class274.field4723 ? 2 : 1, true, false);
        this.field2665 = new byte[0x100 << (class274.field4723 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "()I", line = 86)
    public final int method554() {
        return this.field2663 - (this.field2666.available() >> (class274.field4723 ? 2 : 1));
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "()V", line = 94)
    public final void method559() throws LineUnavailableException {
        this.field2666.flush();
        if (!this.field2667) {
            return;
        }
        this.field2666.close();
        this.field2666 = null;
        Info var1 = new Info(field2668 == null ? (field2668 = method1163("javax.sound.sampled.SourceDataLine")) : field2668, this.field2664, this.field2663 << (class274.field4723 ? 2 : 1));
        this.field2666 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field2666.open();
        this.field2666.start();
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "()V", line = 118)
    public final void method551() {
        int var1 = 256;
        if (class274.field4723) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1024[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field2665[var2 * 2] = (byte) (var3 >> 8);
            this.field2665[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field2666.write(this.field2665, 0, var1 << 1);
    }
}
