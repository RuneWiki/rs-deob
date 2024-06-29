import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class240 extends class323 {

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "Z")
    public static boolean field3810 = false;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "Lnk;")
    public static class2 field3812 = new class2();

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "[Z")
    public static boolean[] field3819 = new boolean[100];

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public static int field3817;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "I")
    public static int field3818;

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "Lw;")
    public static class210 field3820;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIZ)I", line = 9)
    public static final int method1638(int arg0, int arg1, boolean arg2) {
        field3816++;
        if (arg2) {
            return -22;
        } else {
            int var3 = class274.method1799(-2, arg0 - 1, arg1 + -1) - (-class274.method1799(-2, arg0 + 1, arg1 + -1) - class274.method1799(-2, arg0 - 1, arg1 - -1)) + class274.method1799(-2, arg0 + 1, arg1 + 1);
            int var4 = class274.method1799(-2, arg0 - 1, arg1) + class274.method1799(-2, arg0 + 1, arg1) - (-class274.method1799(-2, arg0, arg1 + -1) + -class274.method1799(-2, arg0, arg1 + 1));
            int var5 = class274.method1799(-2, arg0, arg1);
            return var3 / 16 + var4 / 8 + var5 / 4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 28)
    public static final boolean method1639(String arg0, int arg1) {
        field3817++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class116.field1795; var2++) {
            if (arg0.equalsIgnoreCase(class120.field1851[var2])) {
                return true;
            }
        }
        if (arg0.equalsIgnoreCase(class79.field1173.field1218)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(III)Lwg;", line = 60)
    public static final class277 method1640(int arg0, int arg1, int arg2) {
        class277 var3 = new class277();
        class200 var4 = (class200) class207.field3164.method1549((byte) -102);
        if (arg0 <= 36) {
            method1643(-14, true);
        }
        while (var4 != null) {
            if (var4.field3015 && var4.method1351(arg2, arg1, (byte) -86)) {
                var3.method1824(var4, (byte) -109);
            }
            var4 = (class200) class207.field3164.method1546(-1);
        }
        field3818++;
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 84)
    public static void method1641(int arg0) {
        field3819 = null;
        field3820 = null;
        field3812 = null;
        int var1 = -84 % ((arg0 - 49) / 51);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIILjh;II)V", line = 104)
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, class207 arg5, int arg6, int arg7) {
        field3811++;
        if (arg6 != 8) {
            return;
        }
        if (class204.field3089) {
            class121.field1870 = 32;
        } else {
            class121.field1870 = 0;
        }
        class204.field3089 = false;
        if (class63.field941 != 0) {
            if (arg0 >= arg1 && arg0 < arg1 + 16 && arg3 >= arg7 && (arg7 + 16) > arg3) {
                arg5.field3270 -= 4;
                class277.method1822(arg6 + 4088, arg5);
            } else if (arg1 <= arg0 && arg0 < (arg1 + 16) && arg3 >= arg7 + arg4 - 16 && arg3 < arg4 + arg7) {
                arg5.field3270 += 4;
                class277.method1822(4096, arg5);
            } else if (arg0 >= arg1 - class121.field1870 && arg1 - (-class121.field1870 - 16) > arg0 && (arg7 + 16) <= arg3 && arg3 < arg4 + arg7 - 16) {
                int var8 = (arg4 - 32) * arg4 / arg2;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - (var8 / 2) - arg7 - 16;
                int var10 = arg4 - var8 - 32;
                arg5.field3270 = (arg2 - arg4) * var9 / var10;
                class277.method1822(4096, arg5);
                class204.field3089 = true;
            }
        }
        if (class3.field28 == 0) {
            return;
        }
        int var11 = arg5.field3169;
        if (arg0 >= (arg1 - var11) && arg7 <= arg3 && (arg1 + 16) > arg0 && arg3 <= (arg4 + arg7)) {
            arg5.field3270 += class3.field28 * 45;
            class277.method1822(4096, arg5);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)I", line = 178)
    public static final int method1643(int arg0, boolean arg1) {
        if (arg1) {
            return 97;
        } else {
            field3814++;
            return arg0 >>> 10;
        }
    }
}
