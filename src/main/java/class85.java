import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dha")
public class class85 extends class387 {

    @OriginalMember(owner = "client!dha", name = "o", descriptor = "I")
    private int field948 = 0;

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field955 = new String[] { method725(method724("Kb>C\u001b\u0007")), method725(method724("Kb>C\u001f\u0007")), method725(method724("Kb>C\u001a\u0007")), method725(method724("Kb>C\u0014\u0007")) };

    @OriginalMember(owner = "client!dha", name = "m", descriptor = "Lwia;")
    public static class790 field945 = new class790(63, 3);

    @OriginalMember(owner = "client!dha", name = "p", descriptor = "I")
    public static int field949 = 0;

    @OriginalMember(owner = "client!dha", name = "n", descriptor = "Leh;")
    public static class379 field950 = new class379(0);

    @OriginalMember(owner = "client!dha", name = "s", descriptor = "[I")
    public static int[] field953 = new int[50];

    @OriginalMember(owner = "client!dha", name = "u", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!dha", name = "w", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!dha", name = "v", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!dha", name = "r", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!dha", name = "q", descriptor = "Lla;")
    public static class476 field952;

    @OriginalMember(owner = "client!dha", name = "t", descriptor = "[I")
    public static int[] field951;

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IB)V")
    public static final void method721(int arg0, byte arg1) {
        try {
            ++field947;
            if (~class289.field4305.field804.method1290(false) == -1) {
                arg0 = -1;
            }
            if (class559.field8330 != arg0) {
                if (arg1 == 39) {
                    if (arg0 != -1) {
                        class446 var2 = class208.field3189.method3055(arg0, false);
                        class481 var3 = var2.method3426((byte) 54);
                        if (var3 != null) {
                            class580.field8601.method228(var3.method3670(), var3.method3678(), var3.method3674(), true, class502.field7252, new Point(var2.field6537, var2.field6545));
                            class559.field8330 = arg0;
                        } else {
                            arg0 = -1;
                        }
                    }
                    if (~arg0 == 0 && ~class559.field8330 != 0) {
                        class580.field8601.method228(-1, (int[]) null, -1, true, class502.field7252, new Point());
                        class559.field8330 = -1;
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field955[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "b", descriptor = "(I)V")
    public static void method722(int arg0) {
        try {
            if (arg0 != -31019) {
                field949 = -124;
            }
            field952 = null;
            field953 = null;
            field951 = null;
            field950 = null;
            field945 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field955[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(ZB)V")
    public final void method368(boolean arg0, byte arg1) {
        try {
            ++field944;
            int var3 = -127 % ((38 - arg1) / 37);
            int var4 = super.field5845.field1789.method4532(super.field5843.method988(), 0, class604.field8861) - -super.field5845.field1785;
            int var5 = super.field5845.field1781.method2339(super.field5843.method997(), (byte) -34, class524.field7654) - -super.field5845.field1782;
            super.field5843.method4342((float) (super.field5843.method988() / 2 + var4), (float) (super.field5843.method997() / 2 + var5), 4096, this.field948);
            this.field948 += ((class630) super.field5845).field9212;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field955[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "<init>", descriptor = "(Lla;Lcf;)V")
    public class85(class476 arg0, class630 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method723(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        try {
            ++field946;
            int var8 = 0;
            int var9 = arg3;
            int var10 = 0;
            int var11 = -arg5 + arg2;
            int var12 = -arg5 + arg3;
            int var13 = arg2 * arg2;
            int var14 = arg3 * arg3;
            int var15 = var11 * var11;
            int var16 = var12 * var12;
            int var17 = var14 << 1;
            int var18 = var13 << 1;
            int var19 = var16 << 1;
            int var20 = var15 << 1;
            int var21 = arg3 << 1;
            int var22 = var12 << 1;
            int var23 = (-var21 + 1) * var13 + var17;
            int var24 = -((var21 + -1) * var18) + var14;
            int var25 = (-var22 + 1) * var15 + var19;
            int var26 = -((var22 + -1) * var20) + var16;
            int var27 = var13 << 2;
            int var28 = var14 << 2;
            int var29 = var15 << 2;
            int var30 = var16 << 2;
            if (arg4 != 39) {
                method722(-42);
            }
            int var31 = var17 * 3;
            int var32 = (var21 + -3) * var18;
            int var33 = var19 * 3;
            int var34 = (var22 + -3) * var20;
            int var35 = var28;
            int var36 = (arg3 + -1) * var27;
            int var37 = var30;
            if (class676.field9807 <= arg6 && arg6 <= class381.field5786) {
                int[] var38 = class243.field3731[arg6];
                int var39 = class541.method4089(class200.field3119, class676.field9797, arg0 - arg2, 18286);
                int var40 = class541.method4089(class200.field3119, class676.field9797, arg0 + arg2, arg4 ^ 18249);
                int var41 = class541.method4089(class200.field3119, class676.field9797, -var11 + arg0, 18286);
                int var42 = class541.method4089(class200.field3119, class676.field9797, arg0 + var11, arg4 ^ 18249);
                class319.method2702(var38, var39, var41, true, arg7);
                class319.method2702(var38, var41, var42, true, arg1);
                class319.method2702(var38, var42, var40, true, arg7);
            }
            int var43 = (var12 + -1) * var29;
            while (var9 > 0) {
                boolean var44 = ~var12 <= ~var9;
                if (var23 < 0) {
                    while (~var23 > -1) {
                        var23 += var31;
                        var24 += var35;
                        ++var8;
                        var35 += var28;
                        var31 += var28;
                    }
                }
                if (var44) {
                    if (var25 < 0) {
                        while (~var25 > -1) {
                            var25 += var33;
                            var26 += var37;
                            var37 += var30;
                            var33 += var30;
                            ++var10;
                        }
                    }
                    if (var26 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var33 += var30;
                        ++var10;
                        var37 += var30;
                    }
                    var26 += -var34;
                    var25 += -var43;
                    var43 -= var29;
                    var34 -= var29;
                }
                if (var24 < 0) {
                    var24 += var35;
                    var23 += var31;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
                var24 += -var32;
                var23 += -var36;
                var36 -= var27;
                --var9;
                var32 -= var27;
                int var45 = -var9 + arg6;
                int var46 = arg6 + var9;
                if (class676.field9807 <= var46 && var45 <= class381.field5786) {
                    int var47 = class541.method4089(class200.field3119, class676.field9797, arg0 + var8, arg4 ^ 18249);
                    int var48 = class541.method4089(class200.field3119, class676.field9797, -var8 + arg0, arg4 + 18247);
                    if (var44) {
                        int var49 = class541.method4089(class200.field3119, class676.field9797, arg0 + var10, 18286);
                        int var50 = class541.method4089(class200.field3119, class676.field9797, -var10 + arg0, 18286);
                        if (var45 >= class676.field9807) {
                            int[] var51 = class243.field3731[var45];
                            class319.method2702(var51, var48, var50, true, arg7);
                            class319.method2702(var51, var50, var49, true, arg1);
                            class319.method2702(var51, var49, var47, true, arg7);
                        }
                        if (class381.field5786 >= var46) {
                            int[] var52 = class243.field3731[var46];
                            class319.method2702(var52, var48, var50, true, arg7);
                            class319.method2702(var52, var50, var49, true, arg1);
                            class319.method2702(var52, var49, var47, true, arg7);
                        }
                    } else {
                        if (var45 >= class676.field9807) {
                            class319.method2702(class243.field3731[var45], var48, var47, true, arg7);
                        }
                        if (var46 <= class381.field5786) {
                            class319.method2702(class243.field3731[var46], var48, var47, true, arg7);
                        }
                    }
                }
            }
        } catch (RuntimeException var54) {
            throw class759.method5498(var54, field955[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method724(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 94);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dha", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method725(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 47;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 95;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 94;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
