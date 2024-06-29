import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class136 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Z")
    public static boolean field1881 = true;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "Z")
    public static boolean field1884 = false;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public int field1889;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/awt/Image;")
    public Image field1887;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public int[] field1883;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 4)
    public final void method904(byte arg0) {
        if (arg0 != -28) {
            this.method909((Graphics) null, -21, -54, (byte) -69);
        }
        field1879++;
        class144.method973(this.field1883, this.field1889, this.field1885);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIIII)I", line = 36)
    public static final int method907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1888++;
        int var7 = arg5 & 0x3;
        if ((arg2 & 0x1) == arg6) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 - arg1 - (arg4 - 1);
        } else if (var7 == 2) {
            return 7 + 1 - arg0 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 66)
    public static final void method908(int arg0) {
        class67.field884 = (byte[][][]) null;
        class149.field2075 = null;
        class85.field1082 = (byte[][][]) null;
        class73.field930 = null;
        class292.field4586 = (byte[][][]) null;
        class138.field1934 = null;
        if (arg0 < 117) {
            method907(-12, 56, 31, 30, -59, 68, 74);
        }
        class113.field1610 = null;
        class21.field268 = (int[][][]) null;
        class59.field711 = null;
        class239.field3573 = (byte[][][]) null;
        class283.field4448 = null;
        class21.field270 = (byte[][][]) null;
        field1882++;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V", line = 86)
    protected class136() {
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method905(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIZLjava/awt/Graphics;II)V")
    public abstract void method906(int arg0, int arg1, boolean arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Graphics;IIB)V")
    public abstract void method909(Graphics arg0, int arg1, int arg2, byte arg3);
}
