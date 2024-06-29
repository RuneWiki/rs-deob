import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class199 extends class147 {

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "Lqj;")
    private class196 field3536 = class72.field1048;

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field3534 = 1;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "D")
    public static double field3530;

    @OriginalMember(owner = "client!oi", name = "E", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!oi", name = "G", descriptor = "I")
    private int field3525;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public int field3529;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Ldf;")
    private class231 field3528;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "[I")
    public static int[] field3538;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "[S")
    public static short[] field3533;

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field3533 = null;
        field3538 = null;
        if (arg0 != 0) {
            field3534 = -121;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIZI)V")
    public static final void method1344(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field3535++;
        int var7 = 0;
        int var8 = arg1;
        class118.method721((byte) 116, arg1);
        int var9 = arg1 - arg0;
        int var10 = -arg1;
        if (!arg5) {
            method1343(-114);
        }
        if (var9 < 0) {
            var9 = 0;
        }
        if (arg3 >= class93.field1361 && class23.field291 >= arg3) {
            int[] var11 = class95.field1380[arg3];
            int var12 = class186.method1217(class188.field3296, class95.field1388, arg4 - arg1, 18291);
            int var13 = class186.method1217(class188.field3296, class95.field1388, arg1 + arg4, 18291);
            int var14 = class186.method1217(class188.field3296, class95.field1388, arg4 - var9, 18291);
            int var15 = class186.method1217(class188.field3296, class95.field1388, arg4 + var9, 18291);
            class25.method147(arg6, 7, var12, var11, var14);
            class25.method147(arg2, 7, var14, var11, var15);
            class25.method147(arg6, 7, var15, var11, var13);
        }
        int var16 = var9;
        int var17 = -var9;
        int var18 = -1;
        int var19 = -1;
        while (var8 > var7) {
            var19 += 2;
            var17 += var19;
            if (var17 >= 0 && var16 >= 1) {
                var16--;
                class188.field3297[var16] = var7;
                var17 -= var16 << 1;
            }
            var18 += 2;
            var10 += var18;
            var7++;
            if (var10 >= 0) {
                var8--;
                int var20 = arg3 + var8;
                var10 -= var8 << 1;
                int var21 = arg3 - var8;
                if (var20 >= class93.field1361 && var21 <= class23.field291) {
                    if (var8 >= var9) {
                        int var22 = class186.method1217(class188.field3296, class95.field1388, arg4 + var7, 18291);
                        int var23 = class186.method1217(class188.field3296, class95.field1388, arg4 - var7, 18291);
                        if (var20 <= class23.field291) {
                            class25.method147(arg6, 7, var23, class95.field1380[var20], var22);
                        }
                        if (class93.field1361 <= var21) {
                            class25.method147(arg6, 7, var23, class95.field1380[var21], var22);
                        }
                    } else {
                        int var24 = class188.field3297[var8];
                        int var25 = class186.method1217(class188.field3296, class95.field1388, arg4 + var7, 18291);
                        int var26 = class186.method1217(class188.field3296, class95.field1388, arg4 - var7, 18291);
                        int var27 = class186.method1217(class188.field3296, class95.field1388, arg4 + var24, 18291);
                        int var28 = class186.method1217(class188.field3296, class95.field1388, arg4 - var24, 18291);
                        if (var20 <= class23.field291) {
                            int[] var29 = class95.field1380[var20];
                            class25.method147(arg6, 7, var26, var29, var28);
                            class25.method147(arg2, 7, var28, var29, var27);
                            class25.method147(arg6, 7, var27, var29, var25);
                        }
                        if (var21 >= class93.field1361) {
                            int[] var30 = class95.field1380[var21];
                            class25.method147(arg6, 7, var26, var30, var28);
                            class25.method147(arg2, 7, var28, var30, var27);
                            class25.method147(arg6, 7, var27, var30, var25);
                        }
                    }
                }
            }
            int var31 = arg3 + var7;
            int var32 = arg3 - var7;
            if (var31 >= class93.field1361 && var32 <= class23.field291) {
                int var33 = arg4 + var8;
                int var34 = arg4 - var8;
                if (class188.field3296 <= var33 && class95.field1388 >= var34) {
                    int var35 = class186.method1217(class188.field3296, class95.field1388, var33, 18291);
                    int var36 = class186.method1217(class188.field3296, class95.field1388, var34, 18291);
                    if (var7 >= var9) {
                        if (class23.field291 >= var31) {
                            class25.method147(arg6, 7, var36, class95.field1380[var31], var35);
                        }
                        if (var32 >= class93.field1361) {
                            class25.method147(arg6, 7, var36, class95.field1380[var32], var35);
                        }
                    } else {
                        int var37 = var16 < var7 ? class188.field3297[var7] : var16;
                        int var38 = class186.method1217(class188.field3296, class95.field1388, arg4 + var37, 18291);
                        int var39 = class186.method1217(class188.field3296, class95.field1388, arg4 - var37, 18291);
                        if (var31 <= class23.field291) {
                            int[] var40 = class95.field1380[var31];
                            class25.method147(arg6, 7, var36, var40, var39);
                            class25.method147(arg2, 7, var39, var40, var38);
                            class25.method147(arg6, 7, var38, var40, var35);
                        }
                        if (class93.field1361 <= var32) {
                            int[] var41 = class95.field1380[var32];
                            class25.method147(arg6, 7, var36, var41, var39);
                            class25.method147(arg2, 7, var39, var41, var38);
                            class25.method147(arg6, 7, var38, var41, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILp;B)V")
    private final void method1345(int arg0, class56 arg1, byte arg2) {
        field3526++;
        if (arg2 <= 92) {
            this.method1345(-50, null, (byte) -3);
        }
        if (arg0 == 1) {
            this.field3532 = arg1.method367(1);
        } else if (arg0 == 2) {
            this.field3529 = arg1.method367(1);
        } else if (arg0 == 3) {
            this.field3536 = arg1.method326(true);
        } else if (arg0 == 4) {
            this.field3525 = arg1.method311(0);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method318(true);
            this.field3528 = new class231(class251.method1697(var4, true));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method311(0);
                class130 var7;
                if (arg0 == 5) {
                    var7 = new class11(arg1.method326(true));
                } else {
                    var7 = new class206(arg1.method311(0));
                }
                this.field3528.method1552(var7, (long) var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(II)I")
    public final int method1346(int arg0, int arg1) {
        field3524++;
        if (this.field3528 == null) {
            return this.field3525;
        }
        if (arg0 != 5) {
            method1343(-14);
        }
        class206 var3 = (class206) this.field3528.method1551(32768, (long) arg1);
        return var3 == null ? this.field3525 : var3.field3702;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lp;I)V")
    public final void method1347(class56 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method367(1);
            if (var3 == 0) {
                if (arg1 != -1) {
                    this.method1347(null, -49);
                }
                field3523++;
                return;
            }
            this.method1345(var3, arg0, (byte) 96);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(II)Lqj;")
    public final class196 method1348(int arg0, int arg1) {
        field3527++;
        if (this.field3528 == null) {
            return this.field3536;
        } else if (arg1 == 1) {
            class11 var3 = (class11) this.field3528.method1551(32768, (long) arg0);
            return var3 == null ? this.field3536 : var3.field126;
        } else {
            return null;
        }
    }
}
