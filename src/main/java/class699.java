import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class699 {

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "I")
    public static int field9841 = -1;

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "[I")
    public static int[] field9851 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "Lph;")
    public static class598 field9833 = new class598(4, 1);

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "Laea;")
    public static class47 field9854 = null;

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    public static int field9855 = 0;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "B")
    public byte field9829;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "B")
    public byte field9834;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "B")
    public byte field9838;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "B")
    public byte field9842;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "B")
    public byte field9843;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "B")
    public byte field9849;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "B")
    public byte field9852;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public int field9826;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field9830;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!nca", name = "j", descriptor = "I")
    public int field9835;

    @OriginalMember(owner = "client!nca", name = "l", descriptor = "I")
    public static int field9837;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field9845;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field9853;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "S")
    public short field9828;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "Z")
    public boolean field9827;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "Z")
    public boolean field9832;

    @OriginalMember(owner = "client!nca", name = "k", descriptor = "Z")
    public boolean field9836;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "Z")
    public boolean field9839;

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "Z")
    public boolean field9840;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "Z")
    public boolean field9844;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "Z")
    public boolean field9846;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "Z")
    public boolean field9847;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "Z")
    public boolean field9848;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "Z")
    public boolean field9850;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3904(int arg0) {
        if (arg0 != 6000) {
            field9855 = -59;
        }
        field9833 = null;
        field9853 = null;
        field9854 = null;
        field9851 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
    public static final String method3905(int arg0, int arg1, boolean arg2, int arg3) {
        field9830++;
        int var4 = 126 % ((-arg3 - 20) / 53);
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg1 >= 0) {
            int var5 = 2;
            int var6 = arg1 / arg0;
            while (var6 != 0) {
                var6 /= arg0;
                var5++;
            }
            char[] var7 = new char[var5];
            var7[0] = '+';
            for (int var8 = var5 - 1; var8 > 0; var8--) {
                int var9 = arg1;
                arg1 /= arg0;
                int var10 = var9 - arg0 * arg1;
                if (var10 >= 10) {
                    var7[var8] = (char) (var10 + 87);
                } else {
                    var7[var8] = (char) (var10 + 48);
                }
            }
            return new String(var7);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIILus;I)Ldea;")
    public static final class225 method3906(int arg0, int arg1, int arg2, class1 arg3, int arg4) {
        field9845++;
        if (arg2 != 34037) {
            return null;
        } else if (!arg3.field350 && (!class141.method1144(0, arg0) || !class141.method1144(0, arg1))) {
            return arg3.field259 ? new class225(arg3, 34037, arg4, arg0, arg1) : new class225(arg3, arg4, arg0, arg1, class455.method2740(-1675135295, arg0), class455.method2740(-1675135295, arg1));
        } else {
            return new class225(arg3, 3553, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)I")
    public static final int method3907(int arg0, int arg1, int arg2) {
        field9831++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg0 >= -56) {
            return -42;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }
}
