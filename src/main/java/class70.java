import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class70 extends class64 {

    @OriginalMember(owner = "client!kl", name = "Q", descriptor = "Z")
    private boolean field1004 = false;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field1005;

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1002;

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1003;

    @OriginalMember(owner = "client!kl", name = "N", descriptor = "[B")
    private byte[] field1001;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()I", line = 11)
    public final int method532() {
        return this.field1000 - (this.field1003.available() >> (class193.field2808 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 18)
    public final void method524() throws LineUnavailableException {
        this.field1003.flush();
        if (!this.field1004) {
            return;
        }
        this.field1003.close();
        this.field1003 = null;
        Info var1 = new Info(field1005 == null ? (field1005 = method563("javax.sound.sampled.SourceDataLine")) : field1005, this.field1002, this.field1000 << (class193.field2808 ? 2 : 1));
        this.field1003 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1003.open();
        this.field1003.start();
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 25)
    public static Class method563(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 39)
    public final void method520(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1004 = true;
                    }
                }
            }
        }
        this.field1002 = new AudioFormat((float) class56.field812, 16, class193.field2808 ? 2 : 1, true, false);
        this.field1001 = new byte[0x100 << (class193.field2808 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)V", line = 79)
    public final void method528(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1005 == null ? (field1005 = method563("javax.sound.sampled.SourceDataLine")) : field1005, this.field1002, arg0 << (class193.field2808 ? 2 : 1));
            this.field1003 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1003.open();
            this.field1003.start();
            this.field1000 = arg0;
        } catch (LineUnavailableException var4) {
            if (class89.method713(arg0, (byte) 75) == 1) {
                this.field1003 = null;
                throw var4;
            } else {
                this.method528(class344.method2409(arg0, -24724));
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 102)
    public final void method529() {
        if (this.field1003 != null) {
            this.field1003.close();
            this.field1003 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()V", line = 123)
    public final void method526() {
        int var1 = 256;
        if (class193.field2808) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field931[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1001[var2 * 2] = (byte) (var3 >> 8);
            this.field1001[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1003.write(this.field1001, 0, var1 << 1);
    }
}
