import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class30 extends class326 {

    @OriginalMember(owner = "client!i", name = "O", descriptor = "I")
    private int field392 = 4096;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    private int field396 = 0;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "Ljh;")
    public static class100 field393 = new class100(8);

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Z")
    public static boolean field401 = false;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field397 = 10;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field400 = 0;

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
    public static int field402 = 0;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "Lad;")
    public static class268 field399 = new class268(8);

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "Z")
    public static boolean field405 = true;

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "F")
    public static float field404;

    @OriginalMember(owner = "client!i", name = "N", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IB)[[I", line = 4)
    public final int[][] method48(int arg0, byte arg1) {
        ++field395;
        int[][] var3 = super.field4343.method2356(arg0, 127);
        if (arg1 > -52) {
            this.method30((byte) 106, -50);
        }
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class181.field2495; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field396) {
                    if (var12 <= this.field392) {
                        var8[var11] = var12;
                    } else {
                        var8[var11] = this.field392;
                    }
                } else {
                    var8[var11] = this.field396;
                }
                if (~this.field396 < ~var13) {
                    var9[var11] = this.field396;
                } else if (~this.field392 > ~var13) {
                    var9[var11] = this.field392;
                } else {
                    var9[var11] = var13;
                }
                if (~this.field396 < ~var14) {
                    var10[var11] = this.field396;
                } else if (this.field392 < var14) {
                    var10[var11] = this.field392;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(B)V", line = 80)
    public static void method174(byte arg0) {
        if (arg0 >= -57) {
            method174((byte) 26);
        }
        field399 = null;
        field393 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z[IIIIIILdg;III[IIII)I", line = 91)
    public static final int method175(boolean arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class261 arg7, int arg8, int arg9, int arg10, int[] arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; ~var15 > -129; ++var15) {
            for (int var35 = 0; ~var35 > -129; ++var35) {
                class65.field860[var15][var35] = 0;
                class173.field2376[var15][var35] = 99999999;
            }
        }
        ++field394;
        boolean var16;
        if (~arg12 == -2) {
            var16 = class445.method2609(arg7, arg2, arg5, arg14, arg13, arg10, arg3, 1, arg6, arg9, arg8);
        } else if (arg12 == 2) {
            var16 = class191.method1095(arg14, arg4 ^ 9480, arg13, arg6, arg5, arg10, arg9, arg8, arg7, arg3, arg2);
        } else {
            var16 = class14.method94(arg3, arg12, arg6, arg5, (byte) 112, arg13, arg10, arg7, arg9, arg2, arg14, arg8);
        }
        int var17 = arg8 + -64;
        int var18 = arg14 + -64;
        int var19 = class216.field2911;
        if (arg4 != 1) {
            return 94;
        } else {
            int var20 = class114.field1712;
            if (!var16) {
                if (!arg0) {
                    return -1;
                }
                int var21 = Integer.MAX_VALUE;
                int var22 = Integer.MAX_VALUE;
                byte var23 = 10;
                for (int var24 = -var23 + arg10; ~var24 >= ~(arg10 + var23); ++var24) {
                    for (int var25 = -var23 + arg13; arg13 - -var23 >= var25; ++var25) {
                        int var26 = -var17 + var24;
                        int var27 = -var18 + var25;
                        if (~var26 <= -1 && ~var27 <= -1 && var26 < 128 && ~var27 > -129 && class173.field2376[var26][var27] < 100) {
                            int var28 = 0;
                            if (~var24 > ~arg10) {
                                var28 = arg10 - var24;
                            } else if (arg10 - 1 + arg2 < var24) {
                                var28 = -arg2 + -arg10 + var24 + 1;
                            }
                            int var29 = 0;
                            if (var25 < arg13) {
                                var29 = -var25 + arg13;
                            } else if (var25 > arg9 + -1 + arg13) {
                                var29 = -arg9 + 1 + -arg13 + var25;
                            }
                            int var30 = var28 * var28 - -(var29 * var29);
                            if (~var30 > ~var21 || ~var21 == ~var30 && ~class173.field2376[var26][var27] > ~var22) {
                                var19 = var24;
                                var20 = var25;
                                var21 = var30;
                                var22 = class173.field2376[var26][var27];
                            }
                        }
                    }
                }
                if (~var21 == Integer.MIN_VALUE) {
                    return -1;
                }
            }
            if (arg8 == var19 && arg14 == var20) {
                return 0;
            } else {
                byte var31 = 0;
                class68.field933[var31] = var19;
                int var37 = var31 + 1;
                class203.field2752[var31] = var20;
                int var32;
                int var33 = var32 = class65.field860[-var17 + var19][-var18 + var20];
                while (arg8 != var19 || arg14 != var20) {
                    if (var32 != var33) {
                        var32 = var33;
                        class68.field933[var37] = var19;
                        class203.field2752[var37++] = var20;
                    }
                    if (~(var33 & 2) == -1) {
                        if (~(8 & var33) != -1) {
                            --var19;
                        }
                    } else {
                        ++var19;
                    }
                    if ((1 & var33) != 0) {
                        ++var20;
                    } else if (~(4 & var33) != -1) {
                        --var20;
                    }
                    var33 = class65.field860[-var17 + var19][-var18 + var20];
                }
                int var34 = 0;
                while (var37-- > 0) {
                    arg1[var34] = class68.field933[var37];
                    arg11[var34++] = class203.field2752[var37];
                    if (~arg1.length >= ~var34) {
                        break;
                    }
                }
                return var34;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V", line = 267)
    public class30() {
        super(1, false);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)[I", line = 274)
    public final int[] method30(byte arg0, int arg1) {
        ++field398;
        if (arg0 >= -6) {
            field404 = -0.7099882F;
        }
        int[] var3 = super.field4344.method130(arg1, -96);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            for (int var5 = 0; var5 < class181.field2495; ++var5) {
                int var6 = var4[var5];
                if (~this.field396 >= ~var6) {
                    if (var6 <= this.field392) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field392;
                    }
                } else {
                    var3[var5] = this.field396;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILbt;I)V", line = 317)
    public final void method33(int arg0, class32 arg1, int arg2) {
        if (arg2 >= -3) {
            this.method48(-59, (byte) 53);
        }
        ++field403;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field4358 = arg1.method201((byte) -127) == 1;
                }
            } else {
                this.field392 = arg1.method215((byte) 117);
            }
        } else {
            this.field396 = arg1.method215((byte) 101);
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 370)
    public static final void method176(int arg0) {
        ++field391;
        if (arg0 != 8) {
            method176(103);
        }
        if (~field402 < -1) {
            int var1 = 0;
            for (int var2 = 0; var2 < class471.field6495.length; ++var2) {
                if (class471.field6495[var2].startsWith("--> ")) {
                    ++var1;
                    if (field402 == var1) {
                        class309.field4083 = class471.field6495[var2].substring(4);
                        return;
                    }
                }
            }
        } else {
            class309.field4083 = "";
        }
    }
}
