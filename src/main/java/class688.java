import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class688 extends class245 {

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "Z")
    private boolean field9661 = false;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    private int field9658;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field9662;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field9660;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field9659;

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "[B")
    private byte[] field9657;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "()I", line = 12)
    public final int method986() {
        return this.field9658 - (this.field9659.available() >> (class3.field23 ? 2 : 1));
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 23)
    public final void method990(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field9662 == null ? (field9662 = method3902("javax.sound.sampled.SourceDataLine")) : field9662, this.field9660, arg0 << (class3.field23 ? 2 : 1));
            this.field9659 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field9659.open();
            this.field9659.start();
            this.field9658 = arg0;
        } catch (LineUnavailableException var4) {
            if (class226.method1659(arg0, true) == 1) {
                this.field9659 = null;
                throw var4;
            } else {
                this.method990(class413.method2636(arg0, 127));
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 23)
    public static Class method3902(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 46)
    public final void method987() {
        int var1 = 256;
        if (class3.field23) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field3891[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field9657[var2 * 2] = (byte) (var3 >> 8);
            this.field9657[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field9659.write(this.field9657, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "()V", line = 79)
    public final void method985() throws LineUnavailableException {
        this.field9659.flush();
        if (!this.field9661) {
            return;
        }
        this.field9659.close();
        this.field9659 = null;
        Info var1 = new Info(field9662 == null ? (field9662 = method3902("javax.sound.sampled.SourceDataLine")) : field9662, this.field9660, this.field9658 << (class3.field23 ? 2 : 1));
        this.field9659 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field9659.open();
        this.field9659.start();
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "()V", line = 98)
    public final void method989() {
        if (this.field9659 != null) {
            this.field9659.close();
            this.field9659 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 119)
    public final void method984(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field9661 = true;
                    }
                }
            }
        }
        this.field9660 = new AudioFormat((float) class41.field581, 16, class3.field23 ? 2 : 1, true, false);
        this.field9657 = new byte[0x100 << (class3.field23 ? 2 : 1)];
    }
}
