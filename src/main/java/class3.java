import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class224 {

    @OriginalMember(owner = "client!qd", name = "K", descriptor = "Z")
    private boolean field28 = true;

    @OriginalMember(owner = "client!qd", name = "N", descriptor = "Z")
    private boolean field31 = true;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Z")
    public static boolean field37 = true;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "[I")
    public static int[] field36 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field39 = null;

    @OriginalMember(owner = "client!qd", name = "L", descriptor = "[I")
    public static int[] field29 = new int[50];

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
    public static int field40 = -1;

    @OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!qd", name = "I", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!qd", name = "J", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qd", name = "M", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qd", name = "Q", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!qd", name = "P", descriptor = "[Z")
    public static boolean[] field33;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIILhi;IZJ)Z")
    public static final boolean method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class219 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class235.field3772 == class200.field3128;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class158.field2433 || var24 >= class54.field749) {
                    return false;
                }
                class49 var25 = class90.field1382[arg0][var15][var24];
                if (var25 != null && var25.field639 >= 5) {
                    return false;
                }
            }
        }
        class284 var16 = new class284();
        var16.field4497 = arg11;
        var16.field4505 = arg0;
        var16.field4511 = arg5;
        var16.field4495 = arg6;
        var16.field4502 = arg7;
        var16.field4500 = arg8;
        var16.field4507 = arg9;
        var16.field4494 = arg1;
        var16.field4498 = arg2;
        var16.field4504 = arg1 + arg3 - 1;
        var16.field4510 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class90.field1382[var22][var17][var20] == null) {
                        class90.field1382[var22][var17][var20] = new class49(var22, var17, var20);
                    }
                }
                class49 var23 = class90.field1382[arg0][var17][var20];
                var23.field643[var23.field639] = var16;
                var23.field645[var23.field639] = var21;
                var23.field650 |= var21;
                ++var23.field639;
                if (var13 && class103.field1601[var17][var20] != 0) {
                    var14 = class103.field1601[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class103.field1601[var18][var19] == 0) {
                        class103.field1601[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class190.field2993[class243.field3890++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLlj;)Lwk;")
    public static final class272 method10(boolean arg0, class25 arg1) {
        ++field34;
        if (!arg0) {
            method13(101);
        }
        return new class272(arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method226(255), arg1.method215((byte) 117), arg1.method201(255));
    }

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
    public static void method11(int arg0) {
        field33 = null;
        if (arg0 != 3) {
            field30 = -34;
        }
        field39 = null;
        field36 = null;
        field29 = null;
    }

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(II)I")
    public static final int method12(int arg0, int arg1) {
        if (arg1 != 29092) {
            field37 = false;
        }
        ++field38;
        return arg0 & 255;
    }

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
    public static final void method13(int arg0) {
        ++field25;
        class235.field3766.method893(22452);
        int var1 = class235.field3766.method887(true, 8);
        if (~class236.field3774 < ~var1) {
            for (int var2 = var1; ~class236.field3774 < ~var2; ++var2) {
                class178.field2775[class218.field3542++] = class248.field3967[var2];
            }
        }
        if (~var1 < ~class236.field3774) {
            throw new RuntimeException("gnpov1");
        } else {
            class236.field3774 = 0;
            if (arg0 != -3297) {
                method13(18);
            }
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class248.field3967[var3];
                class56 var5 = class100.field1566[var4];
                int var6 = class235.field3766.method887(true, 1);
                if (~var6 == -1) {
                    class248.field3967[class236.field3774++] = var4;
                    var5.field1210 = class111.field1684;
                } else {
                    int var7 = class235.field3766.method887(true, 2);
                    if (var7 == 0) {
                        class248.field3967[class236.field3774++] = var4;
                        var5.field1210 = class111.field1684;
                        class84.field1316[class164.field2553++] = var4;
                    } else if (~var7 == -2) {
                        class248.field3967[class236.field3774++] = var4;
                        var5.field1210 = class111.field1684;
                        int var8 = class235.field3766.method887(true, 3);
                        var5.method570((byte) -90, 1, var8);
                        int var9 = class235.field3766.method887(true, 1);
                        if (var9 == 1) {
                            class84.field1316[class164.field2553++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class248.field3967[class236.field3774++] = var4;
                        var5.field1210 = class111.field1684;
                        if (~class235.field3766.method887(true, 1) == -2) {
                            int var10 = class235.field3766.method887(true, 3);
                            var5.method570((byte) -112, 2, var10);
                            int var11 = class235.field3766.method887(true, 3);
                            var5.method570((byte) -124, 2, var11);
                        } else {
                            int var12 = class235.field3766.method887(true, 3);
                            var5.method570((byte) -112, 0, var12);
                        }
                        int var13 = class235.field3766.method887(true, 1);
                        if (~var13 == -2) {
                            class84.field1316[class164.field2553++] = var4;
                        }
                    } else if (var7 == 3) {
                        class178.field2775[class218.field3542++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field27;
        if (!arg1) {
            method9(-78, 34, 72, -77, 101, 113, -93, 47, (class219) null, -74, true, 14L);
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(this.field31 ? -arg0 + class261.field4217 : arg0, 0, (byte) 84);
            if (this.field28) {
                for (int var5 = 0; ~var5 > ~class78.field1108; ++var5) {
                    var3[var5] = var4[-var5 + class206.field3220];
                }
            } else {
                class196.method1354(var4, 0, var3, 0, class78.field1108);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field35;
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(99, 0, this.field31 ? -arg0 + class261.field4217 : arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field28) {
                for (int var11 = 0; class78.field1108 > var11; ++var11) {
                    var7[var11] = var6[var11];
                    var9[var11] = var5[var11];
                    var10[var11] = var8[var11];
                }
            } else {
                for (int var12 = 0; var12 < class78.field1108; ++var12) {
                    var7[var12] = var6[class206.field3220 - var12];
                    var9[var12] = var5[-var12 + class206.field3220];
                    var10[var12] = var8[-var12 + class206.field3220];
                }
            }
        }
        if (arg1 != 1) {
            this.field28 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field3624 = ~arg0.method201(255) == -2;
                }
            } else {
                this.field31 = ~arg0.method201(255) == -2;
            }
        } else {
            this.field28 = arg0.method201(255) == 1;
        }
        ++field26;
        if (arg2 > -46) {
            field39 = null;
        }
    }
}
