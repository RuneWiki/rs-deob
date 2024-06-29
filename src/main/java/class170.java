import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class170 extends class62 {

    @OriginalMember(owner = "client!qd", name = "z", descriptor = "I")
    public static int field2831 = -1;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "[J")
    public static long[] field2849 = new long[32];

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "Leg;")
    public static class37 field2854 = class174.method1167("<col=ffffff>", -45);

    @OriginalMember(owner = "client!qd", name = "D", descriptor = "Leg;")
    public static class37 field2835 = class174.method1167("<br>(X", 117);

    @OriginalMember(owner = "client!qd", name = "x", descriptor = "Leg;")
    private static class37 field2829 = class174.method1167(")2", -99);

    @OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
    public static int field2827;

    @OriginalMember(owner = "client!qd", name = "w", descriptor = "I")
    public int field2828;

    @OriginalMember(owner = "client!qd", name = "y", descriptor = "I")
    public int field2830;

    @OriginalMember(owner = "client!qd", name = "A", descriptor = "I")
    public static int field2832;

    @OriginalMember(owner = "client!qd", name = "B", descriptor = "I")
    public int field2833;

    @OriginalMember(owner = "client!qd", name = "C", descriptor = "I")
    public int field2834;

    @OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
    public int field2836;

    @OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
    public int field2837;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public int field2839;

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "I")
    public int field2840;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public int field2842;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "I")
    public int field2843;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public int field2844;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public int field2850;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public int field2852;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public int field2856;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "Lbk;")
    public class142 field2838;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "Lkc;")
    public class45 field2846;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "Lg;")
    public class57 field2841;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lok;")
    public class93 field2861;

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "[I")
    public static int[] field2851;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "[[B")
    public static byte[][] field2848;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(BI)Ll;")
    public static final class9 method1134(byte arg0, int arg1) {
        class9 var2 = (class9) class71.field1118.method344((byte) 14, (long) arg1);
        field2858++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field291.method666(0, arg1, (byte) -51);
        if (var3 == null) {
            return null;
        }
        class9 var4 = new class9();
        class187 var5 = new class187(var3);
        var5.field3169 = var5.field3175.length - 2;
        int var6 = var5.method1244(false);
        int var7 = var5.field3175.length - var6 - 2 - 12;
        var5.field3169 = var7;
        int var8 = var5.method1290((byte) 90);
        var4.field153 = var5.method1244(false);
        var4.field162 = var5.method1244(false);
        var4.field155 = var5.method1244(false);
        if (arg0 != -22) {
            field2848 = null;
        }
        var4.field160 = var5.method1244(false);
        int var9 = var5.method1268(255);
        if (var9 > 0) {
            var4.field150 = new class140[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1244(false);
                class140 var12 = new class140(class263.method1777(var11, (byte) -122));
                var4.field150[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1290((byte) 90);
                    int var14 = var5.method1290((byte) 90);
                    var12.method986(new class120(var14), (long) var13, -1);
                }
            }
        }
        var5.field3169 = 0;
        var4.field158 = var5.method1252(-123);
        var4.field161 = new int[var8];
        var4.field146 = new int[var8];
        var4.field159 = new class37[var8];
        int var15 = 0;
        while (var5.field3169 < var7) {
            int var16 = var5.method1244(false);
            if (var16 == 3) {
                var4.field159[var15] = var5.method1253(98);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field146[var15] = var5.method1268(arg0 + 277);
            } else {
                var4.field146[var15] = var5.method1290((byte) 90);
            }
            var4.field161[var15++] = var16;
        }
        class71.field1118.method341((byte) 16, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIBII)V")
    public static final void method1135(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2832++;
        int var6 = arg2 - arg5;
        int var7 = arg0 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class1.method1(arg4, arg2, arg5, arg1, arg3 + 13);
            }
        } else if (var6 == 0) {
            class55.method358(arg0, arg1, arg4, -17071, arg5);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                arg5 = var9;
                int var10 = arg0;
                arg0 = arg2;
                arg2 = var10;
            }
            if (arg0 < arg1) {
                int var11 = arg1;
                arg1 = arg0;
                arg0 = var11;
                int var12 = arg5;
                arg5 = arg2;
                arg2 = var12;
            }
            if (arg3 != 108) {
                method1134((byte) -1, 105);
            }
            int var13 = arg5;
            int var14 = arg0 - arg1;
            int var15 = arg2 - arg5;
            int var16 = -(var14 >> 1);
            int var17 = arg2 > arg5 ? 1 : -1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var18 = arg1; var18 <= arg0; var18++) {
                    class210.field3617[var18][var13] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            } else {
                for (int var19 = arg1; var19 <= arg0; var19++) {
                    var16 += var15;
                    class210.field3617[var13][var19] = arg4;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
    public final void method1136(byte arg0) {
        this.field2838 = null;
        this.field2841 = null;
        this.field2846 = null;
        if (arg0 >= 73) {
            this.field2861 = null;
            field2827++;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLbe;Lbe;ZI)I")
    public static final int method1137(boolean arg0, class17 arg1, class17 arg2, boolean arg3, int arg4) {
        field2860++;
        if (arg4 == 1) {
            int var5 = arg2.field4613;
            int var6 = arg1.field4613;
            if (!arg3) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return arg2.method118(0).field1047.method240(arg1.method118(0).field1047, false);
        } else if (arg4 == 3) {
            if (arg2.field240.method223(field2829, (byte) 63)) {
                if (arg1.field240.method223(field2829, (byte) 63)) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg1.field240.method223(field2829, (byte) 63)) {
                return arg3 ? 1 : -1;
            } else {
                return arg2.field240.method240(arg1.field240, arg0);
            }
        } else if (arg0) {
            return 110;
        } else if (arg4 == 4) {
            if (arg2.method1767(26552)) {
                return arg1.method1767(26552) ? 0 : 1;
            } else if (arg1.method1767(26552)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method1773(-110)) {
                return arg1.method1773(-94) ? 0 : 1;
            } else if (arg1.method1773(-99)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg2.method1774((byte) 113)) {
                return arg1.method1774((byte) 104) ? 0 : 1;
            } else if (arg1.method1774((byte) 96)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 7) {
            return arg2.field241 - arg1.field241;
        } else if (arg2.method1771(arg0)) {
            return arg1.method1771(arg0) ? 0 : 1;
        } else if (arg1.method1771(false)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
    public static void method1138(int arg0) {
        if (arg0 != -18502) {
            method1134((byte) -60, 53);
        }
        field2835 = null;
        field2849 = null;
        field2829 = null;
        field2854 = null;
        field2848 = null;
        field2851 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BILjl;)Z")
    public static final boolean method1139(byte arg0, int arg1, class101 arg2) {
        field2853++;
        if (arg0 != 26) {
            return false;
        }
        byte[] var3 = arg2.method669(arg1, (byte) 50);
        if (var3 == null) {
            return false;
        } else {
            class280.method1882((byte) 43, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLpe;)Z")
    public static final boolean method1140(boolean arg0, class237 arg1) {
        field2855++;
        if (arg1.field4214 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field4214.length; var2++) {
            int var3 = class121.method858(var2, -59, arg1);
            int var4 = arg1.field4210[var2];
            if (arg1.field4214[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field4214[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field4214[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0) {
            return false;
        } else {
            return true;
        }
    }
}
