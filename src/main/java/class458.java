import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class458 {

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Z")
    private boolean field6197 = true;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    private int field6216 = -1;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    private int field6198;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private int field6211;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    private int field6210;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field6203;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[Lja;")
    private class167[] field6204;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Lja;")
    private class167 field6207;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "[Lja;")
    private class167[] field6206;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Ljava/lang/String;")
    public static String field6215 = "";

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Z")
    public static boolean field6212 = false;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field6208 = 0;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lld;")
    public static class105 field6213 = new class105();

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field6220 = 1401;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field6196;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    private int field6202;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field6205;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field6218;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ljd;")
    private class139 field6199;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Lrb;")
    public static class215 field6219;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method2690(byte arg0) {
        field6217++;
        if (class18.field258 == 10 || class18.field258 == 28) {
            class364.method2218(5000, class197.field2680 >> 10, 27496, class412.field5637 >> 10);
        } else {
            int var1 = class233.field3103.field1193[0] >> 3;
            int var2 = class233.field3103.field1197[0] >> 3;
            if (var1 >= 0 && var1 < (class295.field3947 >> 3) && var2 >= 0 && (class39.field567 >> 3) > var2) {
                class364.method2218(5000, var1, 27496, var2);
            } else {
                class364.method2218(0, class295.field3947 >> 4, 27496, class39.field567 >> 4);
            }
        }
        class76.method504(16711680);
        class306.method1698(true);
        class121.method756(11490);
        if (arg0 < 38) {
            field6219 = null;
        }
        class88.method571((byte) -122);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILwm;IIIIIII)V")
    public final void method2691(int arg0, int arg1, class364 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg1 & 0x3FFF;
        if (arg7 != 0) {
            this.field6218 = -81;
        }
        field6196++;
        if (this.field6211 == -1) {
            arg2.method2003(arg6, arg9, arg8, arg3, arg5, 0);
        } else {
            class23 var12 = class245.field3257.method1621(18318, this.field6211);
            if (this.field6199 == null && class245.field3257.method1620(-3810, this.field6211)) {
                int[] var13 = var12.field310 ? class245.field3257.method1622(this.field6211, false, arg7 - 122, this.field6218, 0.7F, this.field6218) : class245.field3257.method1619(0.7F, -6322, this.field6218, false, this.field6218, this.field6211);
                this.field6199 = arg2.method1982(var13, 0, this.field6218, this.field6218, this.field6218);
            }
            if (!var12.field310) {
                arg2.method2003(arg6, arg9, arg8, arg3, arg5, 0);
            }
            if (this.field6199 != null) {
                int var14 = var12.field310 ? 0 : 1;
                int var15 = arg3 * arg4 / -4096;
                int var16;
                for (var16 = arg3 * var11 / 4096 + (arg8 - arg3) / 2; var16 > arg3; var16 -= arg3) {
                }
                while (arg3 < var15) {
                    var15 -= arg3;
                }
                while (var16 < 0) {
                    var16 += arg3;
                }
                while (var15 < 0) {
                    var15 += arg3;
                }
                for (int var17 = var16 - arg3; var17 < arg8; var17 += arg3) {
                    for (int var18 = var15 - arg3; var18 < arg3; var18 += arg3) {
                        this.field6199.method773(arg6 + var17, arg9 + var18, arg3, arg3, 0, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field6202 - 1; var19 >= 0; var19--) {
            this.field6206[var19].method979(arg2, arg6, arg9, arg8, arg3, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILll;)V")
    public static final void method2692(int arg0, class224 arg1) {
        arg1.field2970 = false;
        if (arg1.field2969 != null) {
            arg1.field2969.field1098 = 0;
        }
        field6201++;
        if (arg0 != 0) {
            method2692(28, (class224) null);
        }
        for (class224 var2 = arg1.method53(); var2 != null; var2 = arg1.method56()) {
            method2692(0, var2);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method2693(int arg0) {
        field6209++;
        if (class200.field2718 != null) {
            if (class200.field2718.field6534 == 1) {
                class200.field2718 = null;
                return;
            }
            if (class200.field2718.field6534 == 2) {
                class332.method1901(class233.field3105, 2, class203.field2745, arg0 ^ 0xFFFFFF83);
                class200.field2718 = null;
                return;
            }
        }
        if (arg0 != 2) {
            method2694(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method2694(boolean arg0) {
        field6213 = null;
        field6215 = null;
        if (!arg0) {
            method2690((byte) -112);
        }
        field6219 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)V")
    public static final void method2695(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6205++;
        for (class279 var5 = (class279) class192.field2607.method652((byte) 37); var5 != null; var5 = (class279) class192.field2607.method653(arg3 ^ 0xFFFFC2DF)) {
            class210.method1194(arg2, arg4, var5, arg1, arg0, -27082);
        }
        for (class279 var6 = (class279) class94.field1395.method652((byte) 37); var6 != null; var6 = (class279) class94.field1395.method653(55)) {
            byte var11 = 1;
            class280 var12 = var6.field3698.method549(-113);
            if (var6.field3698.field1111) {
                var11 = 0;
            } else if (var6.field3698.field1122 == var12.field3717 || var6.field3698.field1122 == var12.field3753 || var6.field3698.field1122 == var12.field3763 || var6.field3698.field1122 == var12.field3726) {
                var11 = 2;
            } else if (var6.field3698.field1122 == var12.field3719 || var6.field3698.field1122 == var12.field3761 || var6.field3698.field1122 == var12.field3722 || var6.field3698.field1122 == var12.field3741) {
                var11 = 3;
            }
            if (var6.field3700 != var11) {
                int var13 = class342.method1939((byte) -47, var6.field3698);
                if (var6.field3690 != var13) {
                    if (var6.field3706 != null) {
                        class181.field2494.method2204(var6.field3706);
                        var6.field3706 = null;
                    }
                    var6.field3690 = var13;
                }
                var6.field3700 = var11;
            }
            var6.field3697 = var6.field3698.field6501;
            var6.field3692 = var6.field3698.field6501 + (var6.field3698.method545(false) * 64);
            var6.field3713 = var6.field3698.field6507;
            var6.field3704 = var6.field3698.field6507 + (var6.field3698.method545(false) * 64);
            class210.method1194(arg2, arg4, var6, arg1, arg0, -27082);
        }
        for (class279 var7 = (class279) class208.field2806.method1518((byte) -79); var7 != null; var7 = (class279) class208.field2806.method1517(arg3 ^ 0x45B6)) {
            byte var8 = 1;
            class280 var9 = var7.field3689.method549(-69);
            if (var7.field3689.field1111) {
                var8 = 0;
            } else if (var7.field3689.field1122 == var9.field3717 || var7.field3689.field1122 == var9.field3753 || var7.field3689.field1122 == var9.field3763 || var7.field3689.field1122 == var9.field3726) {
                var8 = 2;
            } else if (var7.field3689.field1122 == var9.field3719 || var7.field3689.field1122 == var9.field3761 || var7.field3689.field1122 == var9.field3722 || var7.field3689.field1122 == var9.field3741) {
                var8 = 3;
            }
            if (var7.field3700 != var8) {
                int var10 = class90.method577(false, var7.field3689);
                if (var7.field3690 != var10) {
                    if (var7.field3706 != null) {
                        class181.field2494.method2204(var7.field3706);
                        var7.field3706 = null;
                    }
                    var7.field3690 = var10;
                }
                var7.field3700 = var8;
            }
            var7.field3697 = var7.field3689.field6501;
            var7.field3692 = var7.field3689.field6501 + var7.field3689.method545(false) * 64;
            var7.field3713 = var7.field3689.field6507;
            var7.field3704 = var7.field3689.field6507 + (var7.field3689.method545(false) * 64);
            class210.method1194(arg2, arg4, var7, arg1, arg0, arg3 - 11358);
        }
        if (arg3 != -15724) {
            method2690((byte) 95);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BILwm;)Z")
    public final boolean method2696(byte arg0, int arg1, class364 arg2) {
        field6200++;
        if (this.field6216 != arg1) {
            this.field6216 = arg1;
            int var4 = class100.method616(arg1, true);
            if (arg1 < var4) {
                var4 = class363.method2210(arg1, (byte) 34);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6218 != var4) {
                this.field6199 = null;
                this.field6218 = var4;
            }
            if (this.field6204 != null) {
                this.field6202 = 0;
                int[] var5 = new int[this.field6204.length];
                for (int var6 = 0; var6 < this.field6204.length; var6++) {
                    class167 var7 = this.field6204[var6];
                    if (var7.method989(this.field6210, this.field6198, this.field6203, this.field6216)) {
                        var5[this.field6202] = var7.field2319;
                        this.field6206[this.field6202++] = var7;
                    }
                }
                class233.method1301(this.field6206, (byte) -97, var5, 0, this.field6202 - 1);
            }
            this.field6197 = true;
        }
        boolean var8 = false;
        if (this.field6197) {
            this.field6197 = false;
            for (int var9 = this.field6202 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6206[var9].method987(arg2, this.field6207);
                var8 |= var10;
                this.field6197 |= !var10;
            }
        }
        int var11 = -102 % ((arg0 - 58) / 41);
        return var8;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V")
    public final void method2697(boolean arg0) {
        field6214++;
        if (this.field6204 != null) {
            for (int var2 = 0; var2 < this.field6204.length; var2++) {
                this.field6204[var2].method984();
            }
        }
        this.field6199 = null;
        if (!arg0) {
            field6208 = -4;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[Lja;IIII)V")
    public class458(int arg0, class167[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6198 = arg4;
        this.field6211 = arg0;
        this.field6210 = arg3;
        this.field6203 = arg5;
        this.field6204 = arg1;
        if (arg1 == null) {
            this.field6207 = null;
            this.field6206 = null;
        } else {
            this.field6206 = new class167[arg1.length];
            this.field6207 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
