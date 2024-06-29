import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class205 extends class278 {

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "I")
    private int field2904 = 204;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    private int field2901 = 1;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    private int field2908 = 1;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "[[I")
    public static int[][] field2906 = new int[128][128];

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "Z")
    public static boolean field2910 = false;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "Z")
    public static boolean field2911 = false;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "F")
    public static float field2907;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field2903;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "(I)V")
    public static final void method1243(int arg0) {
        ++field2909;
        if (arg0 <= -32) {
            if (class479.field6994) {
                while (true) {
                    while (class97.field1337 < class1.field10.length) {
                        class320 var1 = class1.field10[class97.field1337];
                        if (var1 != null && var1.field4425 == -1) {
                            if (class367.field5150 == null) {
                                class367.field5150 = class309.field4235.method1552(32, var1.field4427);
                            }
                            int var2 = class367.field5150.field4733;
                            if (var2 == -1) {
                                return;
                            }
                            ++class97.field1337;
                            var1.field4425 = var2;
                            class367.field5150 = null;
                        } else {
                            ++class97.field1337;
                        }
                    }
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lpp;III)V")
    public static final void method1244(class267 arg0, int arg1, int arg2, int arg3) {
        long var4 = class171.field2450[arg1][arg2][arg3];
        long var6 = 0L;
        arg0.field3660 = 0;
        while (var6 <= 48L) {
            int var8 = (int) (var4 >> (int) var6 & 65535L);
            if (var8 <= 0) {
                break;
            }
            arg0.field3665[arg0.field3660++] = class461.field6699[var8 - 1].field4681;
            var6 += 16L;
        }
        for (int var9 = arg0.field3660; var9 < 4; ++var9) {
            arg0.field3665[var9] = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Llh;II)V")
    public final void method210(class365 arg0, int arg1, int arg2) {
        if (arg1 != -30446) {
            this.field2908 = -92;
        }
        ++field2900;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2904 = arg0.method2062((byte) 14);
                }
            } else {
                this.field2901 = arg0.method2099(arg1 ^ -30227);
            }
        } else {
            this.field2908 = arg0.method2099(255);
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(B)V")
    public static final void method1245(byte arg0) {
        ++field2903;
        class508.method2988((long) class393.field5484, (byte) 37, class418.field6109);
        if (class319.field4419 != -1) {
            class143.method924(class319.field4419, (byte) -92);
        }
        for (int var1 = 0; ~class196.field2829 < ~var1; ++var1) {
            if (class451.field6504[var1]) {
                class9.field83[var1] = true;
            }
            class501.field7378[var1] = class451.field6504[var1];
            class451.field6504[var1] = false;
        }
        if (arg0 != 56) {
            method1243(42);
        }
        class54.field754 = class393.field5484;
        if (class418.field6109.method450()) {
            class81.field1147 = true;
        }
        if (~class319.field4419 != 0) {
            class196.field2829 = 0;
            class314.method1777(true);
        }
        class418.field6109.method526();
        class528.method3101(arg0 ^ -122, class367.field5160);
        class424.field6196 = 0;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)[I")
    public final int[] method208(int arg0, int arg1) {
        ++field2912;
        int[] var3 = super.field3750.method256(arg1, -30359);
        if (super.field3750.field554) {
            for (int var4 = 0; ~var4 > ~class507.field7456; ++var4) {
                int var5 = class192.field2736[var4];
                int var6 = class454.field6637[arg1];
                int var7 = this.field2908 * var5 >> 12;
                int var8 = this.field2901 * var6 >> 12;
                int var9 = var5 % (4096 / this.field2908) * this.field2908;
                int var10 = var6 % (4096 / this.field2901) * this.field2901;
                if (~this.field2904 < ~var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (~var7 < -4) {
                        var7 -= 4;
                    }
                    if (var7 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field2904 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field2904) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg0 != -9) {
            method1247((byte) -104);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IILqa;ILtr;Lls;)Z")
    public static final boolean method1246(int arg0, int arg1, class162 arg2, int arg3, class191 arg4, class92 arg5) {
        ++field2902;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = 83 % ((arg3 - -59) / 37);
        int var10 = Integer.MIN_VALUE;
        if (arg4.field2683 != null) {
            var6 = class481.field7045 - -((-class481.field7063 + arg4.field2659 + arg5.field1241) * (-class481.field7045 + class481.field7065) / (-class481.field7063 + class481.field7047));
            var8 = -((arg4.field2686 + arg5.field1237 + -class481.field7058) * (-class481.field7053 + class481.field7064) / (-class481.field7058 + class481.field7060)) + class481.field7064;
            var10 = -((arg4.field2663 + arg5.field1237 + -class481.field7058) * (-class481.field7053 + class481.field7064) / (class481.field7060 - class481.field7058)) + class481.field7064;
            var7 = (-class481.field7063 + arg4.field2668 - -arg5.field1241) * (-class481.field7045 + class481.field7065) / (-class481.field7063 + class481.field7047) + class481.field7045;
        }
        class529 var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        if (~arg4.field2669 != 0) {
            if (arg5.field1239 && arg4.field2649 != -1) {
                var11 = arg4.method1155(true, (byte) -48, arg2);
            } else {
                var11 = arg4.method1155(false, (byte) -57, arg2);
            }
            if (var11 != null) {
                var12 = arg5.field1235 - (var11.method126() + 1 >> 1);
                if (~var6 < ~var12) {
                    var6 = var12;
                }
                var13 = arg5.field1235 - -(var11.method126() + 1 >> 1);
                if (var7 < var13) {
                    var7 = var13;
                }
                var14 = arg5.field1238 + -(1 + var11.method121() >> 1);
                if (var14 < var8) {
                    var8 = var14;
                }
                var15 = arg5.field1238 - -(1 + var11.method121() >> 1);
                if (~var10 > ~var15) {
                    var10 = var15;
                }
            }
        }
        class462 var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg4.field2662 != null) {
            var16 = class172.method1065(-71, arg4.field2670);
            if (var16 != null) {
                var17 = class483.field7097.method367((class529[]) null, (int[]) null, arg4.field2662, false, class131.field1812);
                int var24 = arg5.field1238;
                if (var11 != null) {
                    var18 = var24 - ((var11.method121() >> 1) + var17 * var16.method2720());
                } else {
                    var18 = var24 - var16.method2721() * var17 / 2;
                }
                for (int var25 = 0; ~var17 < ~var25; ++var25) {
                    String var26 = class131.field1812[var25];
                    if (var17 + -1 > var25) {
                        var26 = var26.substring(0, -4 + var26.length());
                    }
                    int var27 = var16.method2718(var26);
                    if (~var27 < ~var19) {
                        var19 = var27;
                    }
                }
                var20 = arg5.field1235 - -arg1 + -(var19 / 2);
                var21 = var19 / 2 + arg5.field1235 + arg1;
                if (var6 > var20) {
                    var6 = var20;
                }
                var22 = arg0 + var18;
                if (var7 < var21) {
                    var7 = var21;
                }
                var23 = arg0 + var17 * var16.method2720() + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                if (~var23 < ~var10) {
                    var10 = var23;
                }
            }
        }
        if (~class481.field7045 >= ~var7 && ~var6 >= ~class481.field7065 && ~var10 <= ~class481.field7053 && var8 <= class481.field7064) {
            if (arg4.field2683 != null) {
                int[] var28 = new int[arg4.field2683.length];
                for (int var29 = 0; var29 < var28.length / 2; ++var29) {
                    int var31 = arg4.field2683[var29 * 2] + arg5.field1241;
                    int var32 = arg4.field2683[var29 * 2 - -1] + arg5.field1237;
                    var28[var29 * 2] = (class481.field7065 - class481.field7045) * (-class481.field7063 + var31) / (-class481.field7063 + class481.field7047) + class481.field7045;
                    var28[var29 * 2 - -1] = -((-class481.field7058 + var32) * (-class481.field7053 + class481.field7064) / (-class481.field7058 + class481.field7060)) + class481.field7064;
                }
                class182.method1106(arg2, var28, arg4.field2664);
                for (int var30 = 0; ~(var28.length / 2 + -1) < ~var30; ++var30) {
                    arg2.method1008(var28[(var30 + 1) * 2 + 1], (byte) 48, var28[var30 * 2 + 1], var28[var30 * 2 - -2], arg4.field2674, var28[var30 * 2]);
                }
                arg2.method1008(var28[1], (byte) -128, var28[var28.length + -1], var28[0], arg4.field2674, var28[var28.length - 2]);
            }
            if (var11 != null) {
                if (class319.field4418 > 0 && (class279.field3768 != -1 && ~class279.field3768 == ~arg5.field1236 || class210.field2971 != -1 && class210.field2971 == arg4.field2682)) {
                    int var33;
                    if (class52.field706 > 50) {
                        var33 = -(class52.field706 * 2) + 200;
                    } else {
                        var33 = class52.field706 * 2;
                    }
                    int var34 = var33 << 24 | 16776960;
                    arg2.method1009(var11.method125() / 2 + 7, -29464, arg5.field1235, arg5.field1238, var34);
                    arg2.method1009(var11.method125() / 2 - -5, -29464, arg5.field1235, arg5.field1238, var34);
                    arg2.method1009(var11.method125() / 2 - -3, -29464, arg5.field1235, arg5.field1238, var34);
                    arg2.method1009(var11.method125() / 2 - -1, -29464, arg5.field1235, arg5.field1238, var34);
                    arg2.method1009(var11.method125() / 2, -29464, arg5.field1235, arg5.field1238, var34);
                }
                var11.method3111(arg5.field1235 - (var11.method126() >> 1), arg5.field1238 + -(var11.method121() >> 1));
            }
            if (arg4.field2662 != null && var16 != null) {
                class438.method2615(var17, arg5, var19, var18, 4044, arg4, arg2, var16);
            }
            if (~arg4.field2669 != 0 || arg4.field2662 != null) {
                class208 var35 = new class208(arg5);
                var35.field2945 = var23;
                var35.field2944 = var20;
                var35.field2949 = var22;
                var35.field2953 = var14;
                var35.field2943 = var21;
                var35.field2947 = var15;
                var35.field2952 = var13;
                var35.field2941 = var12;
                class496.field7297.method3070(var35, (byte) -119);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
    public static void method1247(byte arg0) {
        field2906 = null;
        if (arg0 >= -82) {
            field2911 = true;
        }
    }
}
