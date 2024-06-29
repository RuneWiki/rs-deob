import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class147 {

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "[I")
    private int[] field2812;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "Ldc;")
    public static class37 field2799 = class185.method1233((byte) 86, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Ldc;")
    public static class37 field2806 = class185.method1233((byte) 86, "rect_debug=");

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field2811 = -1;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public static int field2798 = 0;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "[J")
    public static long[] field2795 = new long[200];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public static int field2803;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "Lmb;")
    public static class132 field2809;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "[Lma;")
    public static class131[] field2794;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "[[S")
    public static short[][] field2797;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)I")
    public static final int method1010(int arg0, byte arg1) {
        if (arg1 == -122) {
            field2796++;
            return arg0 >>> 10;
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)I")
    public final int method1011(int arg0, int arg1) {
        int var3 = 3 / ((arg0 + 52) / 57);
        field2813++;
        int var4 = (this.field2812.length >> 1) - 1;
        int var5 = var4 & arg1;
        while (true) {
            int var6 = this.field2812[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2812[var5 + var5] == arg1) {
                return var6;
            }
            var5 = var5 + 1 & var4;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lwa;III)[Ljc;")
    public static final class100[] method1012(class238 arg0, int arg1, int arg2, int arg3) {
        field2802++;
        return class192.method1278(arg0, arg3, arg2, arg1) ? class79.method543(-16037) : null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II[IIIIII[BI)V")
    public static final void method1013(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8, int arg9) {
        field2800++;
        int var10 = -(arg9 >> 2);
        int var11 = -(arg9 & 0x3);
        int var12 = -arg6;
        if (arg0 >= -80) {
            method1012(null, 118, -100, 52);
        }
        while (var12 < 0) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg8[arg3++] == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg7;
                }
                if (arg8[arg3++] == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg7;
                }
                if (arg8[arg3++] == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg7;
                }
                if (arg8[arg3++] == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg7;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg8[arg3++] == 0) {
                    arg4++;
                } else {
                    arg2[arg4++] = arg7;
                }
            }
            arg4 += arg5;
            arg3 += arg1;
            var12++;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lwa;Ldc;Lwa;BLdc;)Lig;")
    public static final class93 method1014(class238 arg0, class37 arg1, class238 arg2, byte arg3, class37 arg4) {
        field2808++;
        int var5 = arg2.method1543(102, arg4);
        if (arg3 <= 83) {
            method1012(null, 64, -88, 39);
        }
        int var6 = arg2.method1546(arg1, -121, var5);
        return class76.method529(arg2, 21095, var6, var5, arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)I")
    public static final int method1015(boolean arg0, int arg1) {
        if (arg0) {
            return -112;
        } else {
            field2803++;
            return arg1 == 16711935 ? -1 : class157.method1065(arg1, 4);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BILwa;ZLwa;)Lpd;")
    public static final class167 method1016(byte arg0, int arg1, class238 arg2, boolean arg3, class238 arg4) {
        field2805++;
        if (arg0 <= 14) {
            method1017(-95, -65, 115);
        }
        boolean var5 = true;
        int[] var6 = arg2.method1541(arg1, false);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method1556(var6[var7], 15059, arg1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg4.method1556(var9, 15059, 0);
                } else {
                    var10 = arg4.method1556(0, 15059, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class167(arg2, arg4, arg1, arg3);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method1017(int arg0, int arg1, int arg2) {
        field2801++;
        class117 var3 = (class117) class41.field831.method1047((byte) -91, (long) arg2);
        if (arg1 != -1) {
            return -93;
        } else if (var3 == null) {
            return -1;
        } else if (arg0 >= 0 && var3.field2104.length > arg0) {
            return var3.field2104[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public static void method1018(int arg0) {
        field2806 = null;
        field2809 = null;
        if (arg0 != 0) {
            method1010(56, (byte) 21);
        }
        field2797 = null;
        field2799 = null;
        field2794 = null;
        field2795 = null;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([I)V")
    public class147(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field2812 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2812[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2812[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field2812[var5 + var5] = arg0[var4];
            this.field2812[var5 + var5 + 1] = var4++;
        }
    }
}
