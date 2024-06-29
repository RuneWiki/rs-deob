import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class90 extends class291 {

    @OriginalMember(owner = "client!aq", name = "R", descriptor = "Z")
    private boolean field1010 = false;

    @OriginalMember(owner = "client!aq", name = "D", descriptor = "I")
    private int field1006;

    @OriginalMember(owner = "client!aq", name = "S", descriptor = "Ljava/lang/Class;")
    public static Class field1011;

    @OriginalMember(owner = "client!aq", name = "M", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field1007;

    @OriginalMember(owner = "client!aq", name = "Q", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1009;

    @OriginalMember(owner = "client!aq", name = "P", descriptor = "[B")
    private byte[] field1008;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "()V")
    public final void method486() throws LineUnavailableException {
        this.field1009.flush();
        if (!this.field1010) {
            return;
        }
        this.field1009.close();
        this.field1009 = null;
        Info var1 = new Info(field1011 == null ? (field1011 = method492("javax.sound.sampled.SourceDataLine")) : field1011, this.field1007, this.field1006 << (class134.field1882 ? 2 : 1));
        this.field1009 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field1009.open();
        this.field1009.start();
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "(I)V")
    public final void method487(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field1011 == null ? (field1011 = method492("javax.sound.sampled.SourceDataLine")) : field1011, this.field1007, arg0 << (class134.field1882 ? 2 : 1));
            this.field1009 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1009.open();
            this.field1009.start();
            this.field1006 = arg0;
        } catch (LineUnavailableException var4) {
            if (class437.method2713(arg0, (byte) -123) == 1) {
                this.field1009 = null;
                throw var4;
            } else {
                this.method487(class279.method1761(false, arg0));
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "()V")
    public final void method488() {
        int var1 = 256;
        if (class134.field1882) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field4183[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1008[var2 * 2] = (byte) (var3 >> 8);
            this.field1008[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1009.write(this.field1008, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method489(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field1010 = true;
                    }
                }
            }
        }
        this.field1007 = new AudioFormat((float) class233.field3158, 16, class134.field1882 ? 2 : 1, true, false);
        this.field1008 = new byte[0x100 << (class134.field1882 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "()V")
    public final void method490() {
        if (this.field1009 != null) {
            this.field1009.close();
            this.field1009 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "()I")
    public final int method491() {
        return this.field1006 - (this.field1009.available() >> (class134.field1882 ? 2 : 1));
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method492(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
