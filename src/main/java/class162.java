import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class162 extends class160 {

    @OriginalMember(owner = "client!l", name = "S", descriptor = "I")
    private int field2533 = 4096;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    private int field2537 = 0;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2535 = "Drop";

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field2539 = 0;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field2541 = 0;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "[I")
    public static int[] field2543 = new int[128];

    @OriginalMember(owner = "client!l", name = "X", descriptor = "Lca;")
    public static class271 field2538 = new class271(0, -1);

    @OriginalMember(owner = "client!l", name = "fb", descriptor = "I")
    public static int field2546 = 0;

    @OriginalMember(owner = "client!l", name = "eb", descriptor = "I")
    public static int field2545 = 2301979;

    @OriginalMember(owner = "client!l", name = "T", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!l", name = "db", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public static void method1101(int arg0) {
        field2543 = null;
        if (arg0 < 98) {
            field2541 = -9;
        }
        field2535 = null;
        field2538 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILhc;Lhc;Lhc;Lhc;)V")
    public static final void method1102(int arg0, class235 arg1, class235 arg2, class235 arg3, class235 arg4) {
        class127.field2000 = arg3;
        class286.field4533 = arg4;
        if (arg0 != 0) {
            method1104(70, 116, 20);
        }
        ++field2536;
        class7.field154 = arg1;
        class256.field4094 = arg2;
        class193.field3052 = new class228[class256.field4094.method1618(0)][];
        class177.field2771 = new boolean[class256.field4094.method1618(0)];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method3(int arg0, boolean arg1) {
        if (!arg1) {
            method1103((class235) null, (byte) -85);
        }
        ++field2544;
        int[][] var3 = super.field2476.method839(!arg1, arg0);
        if (super.field2476.field1950) {
            int[][] var4 = this.method1079(arg0, 106, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~var11 > ~class240.field3896; ++var11) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var9[var11];
                if (~this.field2537 < ~var13) {
                    var10[var11] = this.field2537;
                } else if (~this.field2533 <= ~var13) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field2533;
                }
                if (~var12 > ~this.field2537) {
                    var7[var11] = this.field2537;
                } else if (~var12 >= ~this.field2533) {
                    var7[var11] = var12;
                } else {
                    var7[var11] = this.field2533;
                }
                if (var14 < this.field2537) {
                    var8[var11] = this.field2537;
                } else if (~this.field2533 <= ~var14) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field2533;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        ++field2534;
        int[] var3 = super.field2488.method15((byte) 122, arg0);
        if (arg1 != 57) {
            this.field2533 = 93;
        }
        if (super.field2488.field42) {
            int[] var4 = this.method1085(0, arg0, (byte) 85);
            for (int var5 = 0; ~class240.field3896 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field2537 < ~var6) {
                    var3[var5] = this.field2537;
                } else if (this.field2533 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field2533;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhc;B)V")
    public static final void method1103(class235 arg0, byte arg1) {
        ++field2542;
        class38.field542 = arg0;
        if (arg1 < 126) {
            field2541 = -77;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(III)Z")
    public static final boolean method1104(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class16.field250; ++var3) {
            class163 var4 = class218.field3366[var3];
            if (var4.field2570 == 1) {
                int var5 = var4.field2565 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2553 * var5 >> 8) + var4.field2548;
                    int var7 = (var4.field2561 * var5 >> 8) + var4.field2564;
                    int var8 = (var4.field2568 * var5 >> 8) + var4.field2572;
                    int var9 = (var4.field2556 * var5 >> 8) + var4.field2573;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2570 == 2) {
                int var10 = arg0 - var4.field2565;
                if (var10 > 0) {
                    int var11 = (var4.field2553 * var10 >> 8) + var4.field2548;
                    int var12 = (var4.field2561 * var10 >> 8) + var4.field2564;
                    int var13 = (var4.field2568 * var10 >> 8) + var4.field2572;
                    int var14 = (var4.field2556 * var10 >> 8) + var4.field2573;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2570 == 3) {
                int var15 = var4.field2548 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2566 * var15 >> 8) + var4.field2565;
                    int var17 = (var4.field2569 * var15 >> 8) + var4.field2554;
                    int var18 = (var4.field2568 * var15 >> 8) + var4.field2572;
                    int var19 = (var4.field2556 * var15 >> 8) + var4.field2573;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2570 == 4) {
                int var20 = arg2 - var4.field2548;
                if (var20 > 0) {
                    int var21 = (var4.field2566 * var20 >> 8) + var4.field2565;
                    int var22 = (var4.field2569 * var20 >> 8) + var4.field2554;
                    int var23 = (var4.field2568 * var20 >> 8) + var4.field2572;
                    int var24 = (var4.field2556 * var20 >> 8) + var4.field2573;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2570 == 5) {
                int var25 = arg1 - var4.field2572;
                if (var25 > 0) {
                    int var26 = (var4.field2566 * var25 >> 8) + var4.field2565;
                    int var27 = (var4.field2569 * var25 >> 8) + var4.field2554;
                    int var28 = (var4.field2553 * var25 >> 8) + var4.field2548;
                    int var29 = (var4.field2561 * var25 >> 8) + var4.field2564;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        ++field2540;
        if (arg1 > 11) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 == -3) {
                        super.field2494 = ~arg0.method633(127) == -2;
                    }
                } else {
                    this.field2533 = arg0.method645(11596);
                }
            } else {
                this.field2537 = arg0.method645(11596);
            }
        }
    }
}
