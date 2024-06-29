import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class565 extends class211 {

    @OriginalMember(owner = "client!vi", name = "P", descriptor = "I")
    private int field8376 = 1024;

    @OriginalMember(owner = "client!vi", name = "T", descriptor = "I")
    private int field8377 = 2048;

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "I")
    private int field8382 = 819;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    private int field8383 = 0;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    private int field8387 = 1024;

    @OriginalMember(owner = "client!vi", name = "O", descriptor = "I")
    private int field8388 = 1024;

    @OriginalMember(owner = "client!vi", name = "Q", descriptor = "I")
    private int field8385 = 0;

    @OriginalMember(owner = "client!vi", name = "R", descriptor = "I")
    private int field8378 = 409;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    private int field8386 = 1024;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field8391 = new String[] { method4218(method4217("UH)eK")), method4218(method4217("X\u000f)\u000f\u001e")), method4218(method4217("UH)bK")), method4218(method4217("MTkM")), method4218(method4217("UH)cK")), method4218(method4217("UH)`K")), method4218(method4217("UH)jK")) };

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Lel;")
    public static class573 field8389 = new class573(32, -2);

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field8375;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!vi", name = "S", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!vi", name = "U", descriptor = "I")
    private int field8384;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!vi", name = "N", descriptor = "Z")
    public static boolean field8379;

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V", line = 113)
    public class565() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 8)
    public final void method437(int arg0) {
        try {
            ++field8375;
            if (arg0 != 27132) {
                this.field8384 = -115;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8391[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILib;)V", line = 21)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field8380;
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (arg1 != 3) {
                            if (~arg1 != -5) {
                                if (arg1 != 5) {
                                    if (~arg1 != -7) {
                                        if (~arg1 != -8) {
                                            if (~arg1 == -9) {
                                                this.field8388 = arg2.method1445((byte) 110);
                                            }
                                        } else {
                                            this.field8376 = arg2.method1445((byte) 110);
                                        }
                                    } else {
                                        this.field8383 = arg2.method1455((byte) 62);
                                    }
                                } else {
                                    this.field8387 = arg2.method1445((byte) 111);
                                }
                            } else {
                                this.field8382 = arg2.method1445((byte) 107);
                            }
                        } else {
                            this.field8378 = arg2.method1445((byte) 104);
                        }
                    } else {
                        this.field8377 = arg2.method1445((byte) 107);
                    }
                } else {
                    this.field8386 = arg2.method1445((byte) 106);
                }
            } else {
                this.field8385 = arg2.method1455((byte) 62);
            }
            if (arg0 < 67) {
                this.method197(95, 77);
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8391[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8391[1] : field8391[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[I", line = 119)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field8381;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                method4216(61);
            }
            if (super.field3231.field57) {
                int[][] var4 = super.field3231.method32(-13509);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class343.field5332 * this.field8386 >> 12;
                int var15 = class343.field5332 * this.field8377 >> 12;
                int var16 = class463.field6744 * this.field8378 >> 12;
                int var17 = class463.field6744 * this.field8382 >> 12;
                if (~var17 >= -2) {
                    return var4[arg1];
                } else {
                    this.field8384 = class343.field5332 / 8 * this.field8387 >> 12;
                    int var18 = class343.field5332 / var14 + 1;
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field8385);
                    while (true) {
                        while (true) {
                            int var22 = var14 - -class656.method4817(-var14 + var15, var21, (byte) -75);
                            int var23 = class656.method4817(-var16 + var17, var21, (byte) -41) + var16;
                            int var24 = var8 + var22;
                            if (class343.field5332 < var24) {
                                var22 = -var8 + class343.field5332;
                                var24 = class343.field5332;
                            }
                            int var29;
                            if (var11) {
                                var29 = 0;
                            } else {
                                int var25 = var9;
                                int[] var26 = var20[var9];
                                int var27 = 0;
                                int var28 = var24 - -var5;
                                if (var28 < 0) {
                                    var28 += class343.field5332;
                                }
                                if (~var28 < ~class343.field5332) {
                                    var28 -= class343.field5332;
                                }
                                var29 = var26[2];
                                while (true) {
                                    int[] var30 = var20[var25];
                                    if (~var28 <= ~var30[0] && ~var28 >= ~var30[1]) {
                                        if (~var9 != ~var25) {
                                            int var31 = var5 + var8;
                                            if (~var31 > -1) {
                                                var31 += class343.field5332;
                                            }
                                            if (var31 > class343.field5332) {
                                                var31 -= class343.field5332;
                                            }
                                            for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                                int[] var33 = var20[(var9 + var32) % var12];
                                                var29 = Math.max(var29, var33[2]);
                                            }
                                            for (int var34 = 0; var34 <= var27; ++var34) {
                                                int[] var35 = var20[(var9 + var34) % var12];
                                                int var36 = var35[2];
                                                if (var29 != var36) {
                                                    int var37 = var35[0];
                                                    int var38 = var35[1];
                                                    int var39;
                                                    int var40;
                                                    if (var28 <= var31) {
                                                        if (~var37 == -1) {
                                                            var39 = Math.min(var28, var38);
                                                            var40 = 0;
                                                        } else {
                                                            var40 = Math.max(var31, var37);
                                                            var39 = class343.field5332;
                                                        }
                                                    } else {
                                                        var40 = Math.max(var31, var37);
                                                        var39 = Math.min(var28, var38);
                                                    }
                                                    this.method4215(var7 + var40, var36, false, -var36 + var29, var4, var21, var39 - var40);
                                                }
                                            }
                                        }
                                        var9 = var25;
                                        break;
                                    }
                                    ++var27;
                                    ++var25;
                                    if (var25 >= var12) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (class463.field6744 >= var23 + var29) {
                                var10 = false;
                            } else {
                                var23 = -var29 + class463.field6744;
                            }
                            if (class343.field5332 == var24) {
                                this.method4215(var8 - -var6, var29, false, var23, var4, var21, var22);
                                if (var10) {
                                    return var3;
                                }
                                var10 = true;
                                int[] var41 = var19[var13++];
                                var41[2] = var23 + var29;
                                var41[0] = var8;
                                var41[1] = var24;
                                int[][] var42 = var20;
                                var20 = var19;
                                var12 = var13;
                                var19 = var42;
                                var7 = var6;
                                var13 = 0;
                                var6 = class656.method4817(class343.field5332, var21, (byte) -40);
                                var8 = 0;
                                var5 = -var7 + var6;
                                int var43 = var5;
                                if (~var5 > -1) {
                                    var43 = class343.field5332 + var5;
                                }
                                var9 = 0;
                                if (var43 > class343.field5332) {
                                    var43 -= class343.field5332;
                                }
                                while (true) {
                                    int[] var44 = var20[var9];
                                    if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                        var11 = false;
                                        break;
                                    }
                                    int var10000 = ~var12;
                                    ++var9;
                                    if (var10000 >= ~var9) {
                                        var9 = 0;
                                    }
                                }
                            } else {
                                int[] var45 = var19[var13++];
                                var45[2] = var29 - -var23;
                                var45[0] = var8;
                                var45[1] = var24;
                                this.method4215(var6 + var8, var29, false, var23, var4, var21, var22);
                                var8 = var24;
                            }
                        }
                    }
                }
            } else {
                return var3;
            }
        } catch (RuntimeException var47) {
            throw class759.method5498(var47, field8391[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIZI[[ILjava/util/Random;I)V", line = 373)
    private final void method4215(int arg0, int arg1, boolean arg2, int arg3, int[][] arg4, Random arg5, int arg6) {
        try {
            ++field8390;
            if (arg2) {
                this.method4215(-62, -126, false, -72, (int[][]) null, (Random) null, -14);
            }
            int var8 = ~this.field8388 < -1 ? -class656.method4817(this.field8388, arg5, (byte) -106) + 4096 : 4096;
            int var9 = this.field8384 * this.field8376 >> 12;
            int var10 = this.field8384 + -(var9 <= 0 ? 0 : class656.method4817(var9, arg5, (byte) -80));
            if (~arg0 <= ~class343.field5332) {
                arg0 -= class343.field5332;
            }
            if (~var10 >= -1) {
                if (arg0 + arg6 > class343.field5332) {
                    int var11 = -arg0 + class343.field5332;
                    for (int var12 = 0; ~arg3 < ~var12; ++var12) {
                        int[] var13 = arg4[arg1 + var12];
                        class467.method3551(var13, arg0, var11, var8);
                        class467.method3551(var13, 0, -var11 + arg6, var8);
                    }
                } else {
                    for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                        class467.method3551(arg4[arg1 + var14], arg0, arg6, var8);
                    }
                }
            } else if (arg3 > 0 && arg6 > 0) {
                int var15 = arg6 / 2;
                int var16 = arg3 / 2;
                int var17 = var15 < var10 ? var15 : var10;
                int var18 = ~var10 < ~var16 ? var16 : var10;
                int var19 = arg0 - -var17;
                int var20 = arg6 - var17 * 2;
                for (int var21 = 0; arg3 > var21; ++var21) {
                    int[] var22 = arg4[arg1 + var21];
                    if (var18 > var21) {
                        int var23 = var8 * var21 / var18;
                        if (this.field8383 == 0) {
                            for (int var24 = 0; ~var24 > ~var17; ++var24) {
                                int var25 = var8 * var24 / var17;
                                var22[class291.method2359(arg0 + var24, class3.field28)] = var22[class291.method2359(class3.field28, -var24 + arg0 - (-arg6 + 1))] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; ~var17 < ~var26; ++var26) {
                                int var27 = var8 * var26 / var17;
                                var22[class291.method2359(arg0 + var26, class3.field28)] = var22[class291.method2359(arg0 + arg6 - 1 + -var26, class3.field28)] = var23 > var27 ? var27 : var23;
                            }
                        }
                        if (~(var19 + var20) < ~class343.field5332) {
                            int var28 = -var19 + class343.field5332;
                            class467.method3551(var22, var19, var28, var23);
                            class467.method3551(var22, 0, -var28 + var20, var23);
                        } else {
                            class467.method3551(var22, var19, var20, var23);
                        }
                    } else {
                        int var29 = -var21 + -1 + arg3;
                        if (var29 < var18) {
                            int var30 = var8 * var29 / var18;
                            if (this.field8383 != 0) {
                                for (int var31 = 0; var31 < var17; ++var31) {
                                    int var32 = var8 * var31 / var17;
                                    var22[class291.method2359(arg0 - -var31, class3.field28)] = var22[class291.method2359(class3.field28, arg6 - var31 + arg0 + -1)] = ~var32 > ~var30 ? var32 : var30;
                                }
                            } else {
                                for (int var33 = 0; var33 < var17; ++var33) {
                                    int var34 = var8 * var33 / var17;
                                    var22[class291.method2359(arg0 + var33, class3.field28)] = var22[class291.method2359(class3.field28, -var33 + -1 + arg0 + arg6)] = var30 * var34 >> 12;
                                }
                            }
                            if (var19 + var20 <= class343.field5332) {
                                class467.method3551(var22, var19, var20, var30);
                            } else {
                                int var35 = class343.field5332 - var19;
                                class467.method3551(var22, var19, var35, var30);
                                class467.method3551(var22, 0, -var35 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; ~var36 > ~var17; ++var36) {
                                var22[class291.method2359(arg0 + var36, class3.field28)] = var22[class291.method2359(arg0 + arg6 + -var36 + -1, class3.field28)] = var8 * var36 / var17;
                            }
                            if (class343.field5332 < var19 + var20) {
                                int var37 = -var19 + class343.field5332;
                                class467.method3551(var22, var19, var37, var8);
                                class467.method3551(var22, 0, var20 - var37, var8);
                            } else {
                                class467.method3551(var22, var19, var20, var8);
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var39) {
            throw class759.method5498(var39, field8391[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8391[1] : field8391[3]) + ',' + (arg5 != null ? field8391[1] : field8391[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V", line = 571)
    public static void method4216(int arg0) {
        try {
            if (arg0 == 3) {
                field8389 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8391[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4217(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 99);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4218(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 35;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 7;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
