import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class145 {

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "J")
    public long field2175 = 0L;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field2162;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public int field2176;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "I")
    public int field2177;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Lao;")
    public static class194 field2178;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "Lh;")
    public class232 field2166;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Lh;")
    public class232 field2174;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lkb;")
    public static class39 field2164;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "[Ltf;")
    public static class271[] field2165;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "[[[B")
    public static byte[][][] field2163;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILim;)Lic;", line = 7)
    public static final class126 method1017(int arg0, class192 arg1) {
        if (arg0 != -31541) {
            field2178 = (class194) null;
        }
        field2168++;
        return new class126(arg1.method1389(106), arg1.method1389(117), arg1.method1389(108), arg1.method1389(120), arg1.method1378(false), arg1.method1378(false), arg1.method1399(-1172389784));
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V", line = 19)
    public static final void method1018(int arg0, int arg1) {
        class231.field3698 = arg1;
        if (arg0 > -38) {
            method1022(51, -98, 53);
        }
        class206.field3363 = -1;
        class206.field3363 = -1;
        class319.method2235((byte) -107);
        field2161++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)I", line = 42)
    public static final int method1019(byte arg0, int arg1) {
        int var2 = -1 % ((arg0 - 83) / 38);
        field2171++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method1020(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2172++;
        int var6 = arg3 - arg0;
        int var7 = arg4 - arg2;
        if (~var7 == arg1) {
            if (var6 != 0) {
                class55.method393(arg2, arg1 - 5440, arg3, arg5, arg0);
            }
        } else if (var6 == 0) {
            class52.method360(25031, arg2, arg0, arg5, arg4);
        } else {
            int var8 = (var6 << 12) / var7;
            int var9 = arg0 - (arg2 * var8 >> 12);
            int var10;
            int var11;
            if (arg4 < class224.field3575) {
                var10 = class224.field3575;
                var11 = (class224.field3575 * var8 >> 12) + var9;
            } else if (arg4 > class231.field3697) {
                var10 = class231.field3697;
                var11 = (class231.field3697 * var8 >> 12) + var9;
            } else {
                var11 = arg3;
                var10 = arg4;
            }
            if (var11 < class233.field3721) {
                var10 = (class233.field3721 - var9 << 12) / var8;
                var11 = class233.field3721;
            } else if (class235.field3735 < var11) {
                var10 = (class235.field3735 - var9 << 12) / var8;
                var11 = class235.field3735;
            }
            int var12;
            int var13;
            if (class224.field3575 > arg2) {
                var12 = class224.field3575;
                var13 = (class224.field3575 * var8 >> 12) + var9;
            } else if (class231.field3697 < arg2) {
                var12 = class231.field3697;
                var13 = (class231.field3697 * var8 >> 12) + var9;
            } else {
                var13 = arg0;
                var12 = arg2;
            }
            if (var13 < class233.field3721) {
                var13 = class233.field3721;
                var12 = (class233.field3721 - var9 << 12) / var8;
            } else if (var13 > class235.field3735) {
                var12 = (class235.field3735 - var9 << 12) / var8;
                var13 = class235.field3735;
            }
            class251.method1774(var12, var11, var10, var13, arg5, 24687);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 157)
    public static void method1021(boolean arg0) {
        field2165 = null;
        field2164 = null;
        if (!arg0) {
            field2178 = null;
            field2163 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Lvh;", line = 176)
    public static final class59 method1022(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class59 var4 = var3.field3689;
            var3.field3689 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)V", line = 187)
    public static final void method1023(int arg0, int arg1) {
        class310.field4845 = -1;
        field2170++;
        class226.field3585 = arg1;
        class64.field853 = null;
        if (arg0 <= -36) {
            class12.field147 = 0;
            class37.field497 = 1;
            class305.field4753 = -1;
            class59.field770 = false;
        }
    }
}
