import java.awt.Component;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 extends class72 {

    @OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
    private int field1999;

    @OriginalMember(owner = "client!mb", name = "Y", descriptor = "Ljava/lang/Class;")
    public static Class field2001;

    @OriginalMember(owner = "client!mb", name = "X", descriptor = "Ljavax/sound/sampled/AudioFormat;")
    private AudioFormat field2000;

    @OriginalMember(owner = "client!mb", name = "V", descriptor = "Ljavax/sound/sampled/SourceDataLine;")
    private SourceDataLine field1998;

    @OriginalMember(owner = "client!mb", name = "P", descriptor = "[B")
    private byte[] field1997;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()I")
    public final int method166() {
        return this.field1999 - (this.field1998.available() >> (class78.field1824 ? 2 : 1));
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method165(Component arg0) {
        this.field2000 = new AudioFormat((float) class48.field1164, 16, class78.field1824 ? 2 : 1, true, false);
        this.field1997 = new byte[0x100 << (class78.field1824 ? 2 : 1)];
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
    public final void method162() {
        int var1 = 256;
        if (class78.field1824) {
            var1 <<= 0x1;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            int var3 = this.field1610[var2];
            if ((var3 + 8388608 & 0xFF000000) != 0) {
                var3 = var3 >> 31 ^ 0x7FFFFF;
            }
            this.field1997[var2 * 2] = (byte) (var3 >> 8);
            this.field1997[var2 * 2 + 1] = (byte) (var3 >> 16);
        }
        this.field1998.write(this.field1997, 0, var1 << 1);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method160(int arg0) throws LineUnavailableException {
        try {
            Info var2 = new Info(field2001 == null ? (field2001 = method706("javax.sound.sampled.SourceDataLine")) : field2001, this.field2000, arg0 << (class78.field1824 ? 2 : 1));
            this.field1998 = (SourceDataLine) AudioSystem.getLine(var2);
            this.field1998.open();
            this.field1998.start();
            this.field1999 = arg0;
        } catch (LineUnavailableException var4) {
            if (class109.method868(arg0, 1431655765) == 1) {
                this.field1998 = null;
                throw var4;
            } else {
                this.method160(class98.method799(arg0, (byte) -115));
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
    public final void method163() {
        if (this.field1998 != null) {
            this.field1998.close();
            this.field1998 = null;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V")
    public final void method164() {
        this.field1998.flush();
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method706(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw (new NoClassDefFoundError()).initCause(var2);
        }
    }
}
