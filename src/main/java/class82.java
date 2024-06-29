import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class82 {

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "Lob;")
    private static class141 field1632 = class175.method1195(40, "Login");

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lob;")
    public static class141 field1635 = class175.method1195(40, "<img=1>");

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Lob;")
    public static class141 field1634 = field1632;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lob;")
    public static class141 field1639 = class175.method1195(40, "null");

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lqb;")
    public static class161 field1633 = new class161();

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "Lra;")
    public static class170 field1637;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIILaa;IJ)Z")
    public static final boolean method565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class95.method642(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method566(int arg0) {
        field1639 = null;
        field1637 = null;
        field1632 = null;
        if (arg0 != 128) {
            field1640 = -122;
        }
        field1633 = null;
        field1634 = null;
        field1635 = null;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method567(int arg0) {
        field1636++;
        if (arg0 >= -2) {
            field1633 = null;
        }
        for (class68 var1 = (class68) class135.field2576.method1103((byte) -9); var1 != null; var1 = (class68) class135.field2576.method1106((byte) 122)) {
            if (class66.field1287 != var1.field1330 || var1.field1334) {
                var1.method1392(128);
            } else if (var1.field1345 <= class20.field344) {
                var1.method450(class34.field695, false);
                if (var1.field1334) {
                    var1.method1392(128);
                } else {
                    class108.method715(var1.field1330, var1.field1335, var1.field1333, var1.field1321, 60, var1, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class141.field2734[arg0][var8][var14] == -class209.field3942) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class110.field2119[arg0][arg1][arg3] + arg5;
            if (!class214.method1399(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class214.method1399(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class214.method1399(var9, var11, var13)) {
                return false;
            } else if (class214.method1399(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class15.method97(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class214.method1399(var6 + 1, class110.field2119[arg0][arg1][arg3] + arg5, var7 + 1) && class214.method1399(var6 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class214.method1399(var6 + 128 - 1, class110.field2119[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class214.method1399(var6 + 1, class110.field2119[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
