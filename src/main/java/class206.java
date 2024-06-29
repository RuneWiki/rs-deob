import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class206 extends class79 {

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "Z")
    private boolean field4024 = false;

    @OriginalMember(owner = "client!uh", name = "M", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "Ljava/lang/Class;")
    public static Class field4025;

    @OriginalMember(owner = "client!uh", name = "P", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field4023;

    @OriginalMember(owner = "client!uh", name = "N", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field4021;

    @OriginalMember(owner = "client!uh", name = "O", descriptor = "[B")
    private byte[] field4022;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "()V")
    public final void method482() {
        int var1 = 256;
        if (class125.field2344) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1542[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field4022[var2 * 2] = (byte) (var3 >> 8);
            this.field4022[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field4021.write(this.field4022, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "()V")
    public final void method496() throws LineUnavailableException {
        this.field4021.flush();
        if (!this.field4024) {
            return;
        }
        this.field4021.close();
        this.field4021 = null;
        Info var1 = new Info(field4025 == null ? (field4025 = method1367("javax.sound.sampled.SourceDataLine")) : field4025, this.field4023, this.field4020 << (class125.field2344 ? 2 : 1));
        this.field4021 = (SourceDataLine) AudioSystem.getLine(var1);
        this.field4021.open();
        this.field4021.start();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public final void method493(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field4025 == null ? (field4025 = method1367("javax.sound.sampled.SourceDataLine")) : field4025, this.field4023, arg0 << (class125.field2344 ? 2 : 1));
            this.field4021 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field4021.open();
            this.field4021.start();
            this.field4020 = arg0;
        } catch (LineUnavailableException var4) {
            if (class9.method62(arg0, -1) == 1) {
                this.field4021 = null;
                throw var4;
            } else {
                this.method493(class144.method907(arg0, -113));
            }
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "()I")
    public final int method490() {
        return this.field4020 - (this.field4021.available() >> (class125.field2344 ? 2 : 1));
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method479(Component arg0) {
        javax.sound.sampled.Mixer.Info[] var2 = AudioSystem.getMixerInfo();
        if (var2 != null) {
            javax.sound.sampled.Mixer.Info[] var3 = var2;
            for (int var4 = 0; var4 < var3.length; var4++) {
                javax.sound.sampled.Mixer.Info var5 = var3[var4];
                if (var5 != null) {
                    String var6 = var5.getName();
                    if (var6 != null && var6.toLowerCase().indexOf("soundmax") >= 0) {
                        this.field4024 = true;
                    }
                }
            }
        }
        this.field4023 = new AudioFormat((float) class52.field1072, 16, class125.field2344 ? 2 : 1, true, false);
        this.field4022 = new byte[0x100 << (class125.field2344 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "()V")
    public final void method488() {
        if (this.field4021 != null) {
            this.field4021.close();
            this.field4021 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1367(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
