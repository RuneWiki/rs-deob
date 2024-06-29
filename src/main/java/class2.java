import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class2 extends class427 {

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field15 = 999999;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field18 = 3;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field20;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ar", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field21;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method12(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lpd;Lna;ZIILuo;)Z", line = 7)
    public static final boolean method7(class278 arg0, class222 arg1, boolean arg2, int arg3, int arg4, class118 arg5) {
        field13++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg1.field2773 != null) {
            var8 = class224.field2819 - ((arg0.field3593 + arg1.field2762 - class224.field2834) * (class224.field2819 - class224.field2835) / (class224.field2836 - class224.field2834));
            var7 = class224.field2829 + ((arg0.field3601 + arg1.field2764 - class224.field2818) * (class224.field2830 - class224.field2829) / (class224.field2821 - class224.field2818));
            var6 = class224.field2829 + ((arg0.field3601 + arg1.field2761 - class224.field2818) * (class224.field2830 - class224.field2829) / (class224.field2821 - class224.field2818));
            var9 = class224.field2819 - ((class224.field2819 - class224.field2835) * (arg1.field2781 + arg0.field3593 - class224.field2834) / (class224.field2836 - class224.field2834));
        }
        class436 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg1.field2783 != -1) {
            if (arg0.field3598 && arg1.field2749 != -1) {
                var10 = arg1.method1353(0, true, arg5);
            } else {
                var10 = arg1.method1353(0, false, arg5);
            }
            if (var10 != null) {
                var11 = arg0.field3603 - (var10.method235() + 1 >> 1);
                var12 = arg0.field3603 + (var10.method235() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var13 = arg0.field3605 - (var10.method236() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg0.field3605 + (var10.method236() + 1 >> 1);
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class117 var15 = null;
        int var16 = 0;
        if (arg2) {
            method9(109);
        }
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg1.field2785 != null) {
            var15 = class332.method2129(arg1.field2765, !arg2);
            if (var15 != null) {
                var16 = class207.field2509.method2202(class386.field5280, (class436[]) null, (int[]) null, arg1.field2785, (byte) 126);
                int var23 = arg0.field3605;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method685() / 2;
                } else {
                    var17 = var23 - ((var10.method236() >> 1) + (var15.method679() * var16));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class386.field5280[var24];
                    if (var24 < (var16 - 1)) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method683(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg0.field3603 + arg4 - var18 / 2;
                if (var6 > var19) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg0.field3603 + arg4;
                var21 = arg3 + var17;
                if (var7 < var20) {
                    var7 = var20;
                }
                if (var8 > var21) {
                    var8 = var21;
                }
                var22 = var17 + (var15.method679() * var16) + arg3;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class224.field2829 || class224.field2830 < var6 || var9 < class224.field2835 || class224.field2819 < var8) {
            return true;
        }
        if (arg1.field2773 != null) {
            int[] var27 = new int[arg1.field2773.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg1.field2773[var28 * 2] + arg0.field3601;
                int var31 = arg1.field2773[var28 * 2 + 1] + arg0.field3593;
                var27[var28 * 2] = class224.field2829 + ((class224.field2830 - class224.field2829) * (var30 - class224.field2818) / (class224.field2821 - class224.field2818));
                var27[var28 * 2 + 1] = class224.field2819 - (class224.field2819 - class224.field2835) * (var31 - class224.field2834) / (class224.field2836 - class224.field2834);
            }
            class88.method549(arg5, var27, arg1.field2767);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg5.method733(var27[var29 * 2 + 2 + 1], var27[var29 * 2], 2, arg1.field2744, var27[var29 * 2 + 1], var27[(var29 + 1) * 2]);
            }
            arg5.method733(var27[1], var27[var27.length - 2], 2, arg1.field2744, var27[var27.length - 1], var27[0]);
        }
        if (var10 != null) {
            if (class76.field943 > 0 && (class42.field501 != -1 && class42.field501 == arg0.field3596 || class373.field5052 != -1 && class373.field5052 == arg1.field2784)) {
                int var32;
                if (class390.field5325 > 50) {
                    var32 = (100 - class390.field5325) * 2;
                } else {
                    var32 = class390.field5325 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg5.method753(1, arg0.field3605, arg0.field3603, var33, var10.method230() / 2 + 7);
                arg5.method753(1, arg0.field3605, arg0.field3603, var33, var10.method230() / 2 + 5);
                arg5.method753(1, arg0.field3605, arg0.field3603, var33, var10.method230() / 2 + 3);
                arg5.method753(1, arg0.field3605, arg0.field3603, var33, var10.method230() / 2 + 1);
                arg5.method753(1, arg0.field3605, arg0.field3603, var33, var10.method230() / 2);
            }
            var10.method2659(arg0.field3603 - (var10.method235() >> 1), arg0.field3605 + -(var10.method236() >> 1));
        }
        if (arg1.field2785 != null && var15 != null) {
            class223.method1361(var17, arg5, arg1, var15, var16, (byte) 103, arg0, var18);
        }
        if (arg1.field2783 != -1 || arg1.field2785 != null) {
            class428 var34 = new class428(arg0);
            var34.field5852 = var12;
            var34.field5859 = var20;
            var34.field5848 = var13;
            var34.field5855 = var22;
            var34.field5863 = var21;
            var34.field5850 = var11;
            var34.field5846 = var19;
            var34.field5861 = var14;
            class141.field1663.method1696(false, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIB)Z", line = 225)
    public static final boolean method8(int arg0, int arg1, int arg2, byte arg3) {
        field16++;
        class171 var4 = (class171) class440.method2708(arg0, arg1, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class3.method14(var4, true);
        }
        class171 var6 = (class171) class246.method1610(arg0, arg1, arg2, field21 == null ? (field21 = method12("ol")) : field21);
        if (var6 != null) {
            var5 &= class3.method14(var6, true);
        }
        class171 var7 = (class171) class451.method2792(arg0, arg1, arg2);
        if (var7 != null) {
            var5 &= class3.method14(var7, true);
        }
        return arg3 == -54 ? var5 : false;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)Loo;", line = 253)
    public static final class27 method9(int arg0) {
        field19++;
        field15 = 0;
        if (arg0 != 2) {
            field18 = -19;
        }
        return class234.method1511(1);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILaq;II)V", line = 267)
    public static final void method10(int arg0, class453 arg1, int arg2, int arg3) {
        class153.field1779 = arg2;
        class342.field4669 = arg1;
        class290.field3823 = arg3;
        int var4 = 99 / ((-arg0 - 24) / 36);
        field14++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lbg;B)Lrl;", line = 284)
    public static final class447 method11(class242 arg0, byte arg1) {
        field17++;
        return arg1 == 117 ? new class447(arg0.method1582(false), arg0.method1582(false), arg0.method1582(false), arg0.method1582(false), arg0.method1545(8), arg0.method1563(arg1 - 245)) : null;
    }
}
