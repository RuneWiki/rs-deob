import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class30 extends class148 {

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "I")
    private int field306 = 1024;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    private int field317 = 0;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    private int field313 = 819;

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "I")
    private int field315 = 1024;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    private int field312 = 1024;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "I")
    private int field318 = 0;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    private int field320 = 1024;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    private int field319 = 409;

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    private int field310 = 2048;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "[I")
    public static int[] field322 = new int[2];

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "Llt;")
    public static class475 field321 = new class475("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "I")
    public static int field323 = 104;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!vd", name = "cb", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class30() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
    public static void method173(boolean arg0) {
        if (!arg0) {
            field321 = null;
            field322 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(IIIIII)Z")
    public static final boolean method174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class186.method1279(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class192.field2815;
                int var7 = arg3 << class192.field2815;
                return class382.method2333(var6 + 1, class86.field1324[arg0].method201(arg1, arg3) + arg5, var7 + 1) && class382.method2333(class352.field5398 + var6 - 1, class86.field1324[arg0].method201(arg1 + 1, arg3) + arg5, var7 + 1) && class382.method2333(class352.field5398 + var6 - 1, class86.field1324[arg0].method201(arg1 + 1, arg3 + 1) + arg5, class352.field5398 + var7 - 1) && class382.method2333(var6 + 1, class86.field1324[arg0].method201(arg1, arg3 + 1) + arg5, class352.field5398 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class4.field58[arg0][var8][var14] == -class337.field4744) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class192.field2815) + 1;
            int var10 = (arg3 << class192.field2815) + 2;
            int var11 = class86.field1324[arg0].method201(arg1, arg3) + arg5;
            if (!class382.method2333(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class192.field2815) - 1;
                if (!class382.method2333(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class192.field2815) - 1;
                    if (!class382.method2333(var9, var11, var13)) {
                        return false;
                    } else if (!class382.method2333(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method175(int arg0) {
        ++field314;
        if (arg0 != -1285532468) {
            method174(-48, -92, -97, 47, 83, 19);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field306 = arg1.method1450((byte) 91);
                                        }
                                    } else {
                                        this.field312 = arg1.method1450((byte) 30);
                                    }
                                } else {
                                    this.field317 = arg1.method1428(32122);
                                }
                            } else {
                                this.field315 = arg1.method1450((byte) 39);
                            }
                        } else {
                            this.field313 = arg1.method1450((byte) 117);
                        }
                    } else {
                        this.field319 = arg1.method1450((byte) 46);
                    }
                } else {
                    this.field310 = arg1.method1450((byte) 95);
                }
            } else {
                this.field320 = arg1.method1450((byte) 81);
            }
        } else {
            this.field318 = arg1.method1428(32122);
        }
        ++field316;
        int var5 = 111 / ((-88 - arg2) / 33);
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(ZI)V")
    public static final void method176(boolean arg0, int arg1) {
        if (!class426.field6401.field1016) {
            arg1 = -1;
        }
        ++field311;
        if (~class518.field7545 != ~arg1) {
            if (arg1 != -1) {
                class31 var2 = class26.field282.method213(118, arg1);
                class408 var3 = var2.method182(87);
                if (var3 == null) {
                    arg1 = -1;
                } else {
                    class483.field7077.method2583(var3.method2464(), new Point(var2.field329, var2.field325), class364.field5570, var3.method2456(), var3.method2454(), 17);
                    class518.field7545 = arg1;
                }
            }
            if (!arg0) {
                if (arg1 == -1 && ~class518.field7545 != 0) {
                    class483.field7077.method2583(-1, new Point(), class364.field5570, (int[]) null, -1, 17);
                    class518.field7545 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[[ILjava/util/Random;I)V")
    private final void method177(int arg0, int arg1, int arg2, int arg3, int[][] arg4, Random arg5, int arg6) {
        ++field308;
        int var8 = this.field306 > 0 ? -class317.method1984(-39, arg5, this.field306) + 4096 : 4096;
        int var9 = this.field312 * this.field307 >> 12;
        if (arg1 != -1) {
            field324 = -125;
        }
        int var10 = this.field307 - (var9 <= 0 ? 0 : class317.method1984(arg1 ^ -104, arg5, var9));
        if (~class320.field4579 >= ~arg0) {
            arg0 -= class320.field4579;
        }
        if (var10 > 0) {
            if (~arg3 < -1 && arg2 > 0) {
                int var11 = arg2 / 2;
                int var12 = arg3 / 2;
                int var13 = ~var10 < ~var11 ? var11 : var10;
                int var14 = ~var12 > ~var10 ? var12 : var10;
                int var15 = arg0 + var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; var17 < arg3; ++var17) {
                    int[] var18 = arg4[var17 - -arg6];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field317 != 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class286.method1847(arg0 + var20, class304.field4339)] = var18[class286.method1847(arg0 + arg2 - 1 + -var20, class304.field4339)] = ~var21 > ~var19 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class286.method1847(arg0 - -var22, class304.field4339)] = var18[class286.method1847(class304.field4339, arg0 - -arg2 - 1 + -var22)] = var19 * var24 >> 12;
                            }
                        }
                        if (var15 - -var16 <= class320.field4579) {
                            class520.method3074(var18, var15, var16, var19);
                        } else {
                            int var23 = class320.field4579 - var15;
                            class520.method3074(var18, var15, var23, var19);
                            class520.method3074(var18, 0, var16 - var23, var19);
                        }
                    } else {
                        int var25 = -var17 + -1 + arg3;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field317 == -1) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class286.method1847(arg0 + var27, class304.field4339)] = var18[class286.method1847(class304.field4339, arg0 - -arg2 + -var27 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class286.method1847(arg0 + var29, class304.field4339)] = var18[class286.method1847(class304.field4339, -var29 + arg2 + arg0 + -1)] = var31 < var26 ? var31 : var26;
                                }
                            }
                            if (var15 + var16 > class320.field4579) {
                                int var30 = -var15 + class320.field4579;
                                class520.method3074(var18, var15, var30, var26);
                                class520.method3074(var18, 0, -var30 + var16, var26);
                            } else {
                                class520.method3074(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class286.method1847(class304.field4339, arg0 - -var32)] = var18[class286.method1847(class304.field4339, arg0 - -arg2 + -var32 + -1)] = var8 * var32 / var13;
                            }
                            if (class320.field4579 >= var15 + var16) {
                                class520.method3074(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class320.field4579;
                                class520.method3074(var18, var15, var33, var8);
                                class520.method3074(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class320.field4579 <= ~(arg0 - -arg2)) {
            for (int var34 = 0; ~arg3 < ~var34; ++var34) {
                class520.method3074(arg4[arg6 + var34], arg0, arg2, var8);
            }
        } else {
            int var35 = class320.field4579 - arg0;
            for (int var36 = 0; ~var36 > ~arg3; ++var36) {
                int[] var37 = arg4[arg6 + var36];
                class520.method3074(var37, arg0, var35, var8);
                class520.method3074(var37, 0, -var35 + arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLdh;Ljava/lang/String;)I")
    public static final int method178(boolean arg0, class209 arg1, String arg2) {
        ++field305;
        int var3 = arg1.field3037;
        byte[] var4 = class187.method1285(-129, arg2);
        arg1.method1441(var4.length, arg0);
        arg1.field3037 += class284.field4084.method3005(0, arg1.field3037, var4, arg1.field3036, var4.length, (byte) 43);
        return arg1.field3037 - var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        if (arg0 > -65) {
            this.method175(121);
        }
        ++field309;
        int[] var3 = super.field2193.method497(arg1, false);
        if (super.field2193.field1312) {
            int[][] var4 = super.field2193.method500(-108);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class320.field4579 * this.field320 >> 12;
            int var15 = class320.field4579 * this.field310 >> 12;
            int var16 = class238.field3506 * this.field319 >> 12;
            int var17 = class238.field3506 * this.field313 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field307 = class320.field4579 / 8 * this.field315 >> 12;
                int var18 = class320.field4579 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field318);
                while (true) {
                    while (true) {
                        int var22 = class317.method1984(95, var21, -var14 + var15) + var14;
                        int var23 = class317.method1984(-6, var21, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (var24 > class320.field4579) {
                            var24 = class320.field4579;
                            var22 = -var8 + class320.field4579;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (var29 < 0) {
                                var29 += class320.field4579;
                            }
                            if (var29 > class320.field4579) {
                                var29 -= class320.field4579;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                    var25 = var27[2];
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class320.field4579;
                                        }
                                        if (class320.field4579 < var31) {
                                            var31 -= class320.field4579;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var25 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class320.field4579;
                                                }
                                                this.method177(var7 + var38, -1, -var38 + var39, -var35 + var25, var4, var21, var35);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (~class238.field3506 > ~(var23 + var25)) {
                            var23 = -var25 + class238.field3506;
                        } else {
                            var10 = false;
                        }
                        if (~class320.field4579 == ~var24) {
                            this.method177(var6 + var8, -1, var22, var23, var4, var21, var25);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[2] = var25 - -var23;
                            var41[0] = var8;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var13 = 0;
                            var7 = var6;
                            var6 = class317.method1984(-75, var21, class320.field4579);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class320.field4579 + var5;
                            }
                            var9 = 0;
                            if (~var43 < ~class320.field4579) {
                                var43 -= class320.field4579;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var44[1] >= var43) {
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
                            var45[0] = var8;
                            var45[1] = var24;
                            var45[2] = var25 - -var23;
                            this.method177(var6 + var8, -1, var22, var23, var4, var21, var25);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
