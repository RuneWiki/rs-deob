import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class103 extends class241 {

    @OriginalMember(owner = "client!c", name = "n", descriptor = "[I")
    public int[] field1951 = new int[1];

    @OriginalMember(owner = "client!c", name = "A", descriptor = "[I")
    public int[] field1964 = new int[] { -1 };

    @OriginalMember(owner = "client!c", name = "q", descriptor = "[Lpg;")
    public static class73[] field1954 = new class73[4];

    @OriginalMember(owner = "client!c", name = "w", descriptor = "Loh;")
    private static class263 field1960 = class253.method1681(-117, " has logged out)3");

    @OriginalMember(owner = "client!c", name = "x", descriptor = "Loh;")
    private static class263 field1961 = class253.method1681(-123, "Loading wordpack )2 ");

    @OriginalMember(owner = "client!c", name = "t", descriptor = "Loh;")
    public static class263 field1957 = field1960;

    @OriginalMember(owner = "client!c", name = "y", descriptor = "Loh;")
    public static class263 field1962 = class253.method1681(-118, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!c", name = "C", descriptor = "Loh;")
    public static class263 field1966 = field1961;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "Llb;")
    public static class127 field1956 = new class127(5);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!c", name = "r", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!c", name = "v", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!c", name = "z", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Lbc;")
    public static class171 field1958;

    @OriginalMember(owner = "client!c", name = "B", descriptor = "[I")
    public static int[] field1965;

    @OriginalMember(owner = "client!c", name = "D", descriptor = "[[[B")
    public static byte[][][] field1967;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BIJI)Z")
    public static final boolean method692(byte arg0, int arg1, long arg2, int arg3) {
        field1963++;
        int var5 = ((int) arg2 & 0x7DC23) >> 14;
        int var6 = (int) arg2 >> 20 & 0x3;
        int var7 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        if (arg0 != -122) {
            field1960 = null;
        }
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class12 var8 = class117.method763(var7, (byte) -112);
            int var9 = var8.field334;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var11 = var8.field329;
                var10 = var8.field308;
            } else {
                var10 = var8.field329;
                var11 = var8.field308;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 0xF) + (var9 >> 4 - var6);
            }
            class131.method845(true, class229.field4018.field4713[0], 2, var10, arg3, var11, class229.field4018.field4714[0], arg1, var9, 0, 0, (byte) -103);
        } else {
            class131.method845(true, class229.field4018.field4713[0], 2, 0, arg3, 0, class229.field4018.field4714[0], arg1, 0, var5 + 1, var6, (byte) -128);
        }
        class184.field3338 = class57.field1173;
        class3.field58 = 0;
        class143.field2623 = 2;
        class108.field2032 = class31.field777;
        return true;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V")
    public static void method693(byte arg0) {
        field1961 = null;
        field1960 = null;
        field1954 = null;
        if (arg0 >= -120) {
            field1967 = null;
        }
        field1962 = null;
        field1958 = null;
        field1966 = null;
        field1957 = null;
        field1967 = null;
        field1965 = null;
        field1956 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIIIB)V")
    public static final void method694(boolean arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg1 < 1) {
            arg1 = 1;
        }
        int var6 = -79 % ((arg5 - 65) / 56);
        field1953++;
        class143.field2613 = (short) arg2;
        class146.field2666 = (short) arg1;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIII)V")
    public static final void method695(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1955++;
        if (arg4 < 66) {
            method693((byte) -102);
        }
        int var6 = arg0 - arg3;
        int var7 = arg5 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class142.method939(arg2, arg1, arg5, arg3, false);
            }
        } else if (var7 == 0) {
            class267.method1806(arg0, arg3, 10, arg2, arg1);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class51.field1099 > arg3) {
                var10 = (class51.field1099 * var8 >> 12) + var9;
                var11 = class51.field1099;
            } else if (class198.field3587 >= arg3) {
                var10 = arg1;
                var11 = arg3;
            } else {
                var10 = (class198.field3587 * var8 >> 12) + var9;
                var11 = class198.field3587;
            }
            int var12;
            int var13;
            if (class51.field1099 > arg0) {
                var13 = var9 + (class51.field1099 * var8 >> 12);
                var12 = class51.field1099;
            } else if (arg0 <= class198.field3587) {
                var12 = arg0;
                var13 = arg5;
            } else {
                var12 = class198.field3587;
                var13 = (class198.field3587 * var8 >> 12) + var9;
            }
            if (class11.field249 > var10) {
                var11 = (class11.field249 - var9 << 12) / var8;
                var10 = class11.field249;
            } else if (class276.field4831 < var10) {
                var11 = (class276.field4831 - var9 << 12) / var8;
                var10 = class276.field4831;
            }
            if (class11.field249 > var13) {
                var13 = class11.field249;
                var12 = (class11.field249 - var9 << 12) / var8;
            } else if (var13 > class276.field4831) {
                var13 = class276.field4831;
                var12 = (class276.field4831 - var9 << 12) / var8;
            }
            class216.method1462(43, var10, var12, arg2, var13, var11);
        }
    }
}
