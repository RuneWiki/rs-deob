import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class240 extends class184 {

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "Ldq;")
    public static class493 field3080 = new class493(67, 4);

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "Ljk;")
    public static class449 field3085 = new class449(50);

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field3088 = 0;

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)Z", line = 3)
    public static final boolean method1448(int arg0, byte arg1, int arg2) {
        if (arg1 <= 83) {
            return false;
        } else {
            ++field3082;
            return ~(544 & arg2) == -545 | ~(24 & arg2) != -1;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "([BIIIII)Z", line = 17)
    public static final boolean method1449(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3084;
        boolean var6 = true;
        class463 var7 = new class463(arg0);
        if (arg2 <= 16) {
            method1449((byte[]) null, -69, 25, 47, 107, 101);
        }
        int var8 = -1;
        label74: while (true) {
            int var9 = var7.method2725((byte) -63);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class102 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method2763(-514944944);
                                        if (var19 == 0) {
                                            continue label74;
                                        }
                                        var7.method2737(false);
                                    }
                                    int var12 = var7.method2763(-514944944);
                                    if (~var12 == -1) {
                                        continue label74;
                                    }
                                    var10 += var12 + -1;
                                    int var13 = 63 & var10;
                                    int var14 = (var10 & 4048) >> 6;
                                    var15 = var7.method2737(false) >> 2;
                                    var16 = var14 - -arg3;
                                    var17 = arg1 + var13;
                                } while (var16 <= 0);
                            } while (~var17 >= -1);
                        } while (var16 >= arg5 + -1);
                    } while (~(arg4 + -1) >= ~var17);
                    var18 = class315.field4017.method1958(-10091, var8);
                } while (var15 == 22 && !class407.field5817.field3618 && var18.field1305 == 0 && ~var18.field1246 != -2 && !var18.field1262);
                if (!var18.method768(127)) {
                    var6 = false;
                    ++class308.field3948;
                }
                var11 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(III)V", line = 104)
    public static final void method1450(int arg0, int arg1, int arg2) {
        if (class241.field3106 > class241.field3107) {
            class241.field3107 = (float) ((double) class241.field3107 / 30.0D + (double) class241.field3107);
            if (class241.field3106 < class241.field3107) {
                class241.field3107 = class241.field3106;
            }
            class95.method729(0);
            class241.field3105 = (int) class241.field3107 >> 1;
            class241.field3100 = class70.method623(class241.field3105, -91);
        } else if (class241.field3106 < class241.field3107) {
            class241.field3107 = (float) ((double) class241.field3107 - (double) class241.field3107 / 30.0D);
            if (class241.field3107 < class241.field3106) {
                class241.field3107 = class241.field3106;
            }
            class95.method729(0);
            class241.field3105 = (int) class241.field3107 >> 1;
            class241.field3100 = class70.method623(class241.field3105, -109);
        }
        ++field3087;
        if (arg2 > -25) {
            field3080 = null;
        }
        if (~class9.field144 != 0 && class179.field2366 != -1) {
            int var3 = -class175.field2277 + class9.field144;
            if (~var3 > -3 || ~var3 < -3) {
                var3 /= 8;
            }
            int var4 = -class38.field496 + class179.field2366;
            class175.field2277 += var3;
            if (~var4 > -3 || var4 > 2) {
                var4 /= 8;
            }
            if (~var3 == -1 && ~var4 == -1) {
                class9.field144 = -1;
                class179.field2366 = -1;
            }
            class38.field496 -= -var4;
            class95.method729(0);
        }
        if (class118.field1593 <= 0) {
            class24.field352 = -1;
            class50.field664 = -1;
        } else {
            --class298.field3833;
            if (class298.field3833 == 0) {
                class298.field3833 = 100;
                --class118.field1593;
            }
        }
        if (class173.field2250 && class490.field7145 != null) {
            for (class52 var5 = (class52) class490.field7145.method153(0); var5 != null; var5 = (class52) class490.field7145.method161(-107)) {
                class36 var6 = class241.field3097.method1620(var5.field696.field2035, 36);
                if (!var5.method521(Integer.MIN_VALUE, arg0, arg1)) {
                    if (var5.field696.field2040) {
                        var5.field696.field2040 = false;
                        class239.method1445(class34.field432, var5.field696.field2035, var6.field483);
                    }
                } else {
                    if (var6.field459 != null) {
                        if (var6.field459[4] != null) {
                            class8.method45(22461, (long) var5.field696.field2035, -1, 0, var6.field483, -1, var6.field448, 1009, false, var6.field459[4], true);
                        }
                        if (var6.field459[3] != null) {
                            class8.method45(22461, (long) var5.field696.field2035, -1, 0, var6.field483, -1, var6.field448, 1010, false, var6.field459[3], true);
                        }
                        if (var6.field459[2] != null) {
                            class8.method45(22461, (long) var5.field696.field2035, -1, 0, var6.field483, -1, var6.field448, 1011, false, var6.field459[2], true);
                        }
                        if (var6.field459[1] != null) {
                            class8.method45(22461, (long) var5.field696.field2035, -1, 0, var6.field483, -1, var6.field448, 1006, false, var6.field459[1], true);
                        }
                        if (var6.field459[0] != null) {
                            class8.method45(22461, (long) var5.field696.field2035, -1, 0, var6.field483, -1, var6.field448, 1007, false, var6.field459[0], true);
                        }
                    }
                    if (!var5.field696.field2040) {
                        var5.field696.field2040 = true;
                        class239.method1445(class502.field7248, var5.field696.field2035, var6.field483);
                    }
                    if (var5.field696.field2040) {
                        class239.method1445(class126.field1675, var5.field696.field2035, var6.field483);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)[I", line = 241)
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            field3080 = null;
        }
        ++field3081;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int[] var4 = this.method1159(25, arg0, 0);
            for (int var5 = 0; ~var5 > ~class245.field3167; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)[[I", line = 276)
    public final int[][] method13(int arg0, int arg1) {
        ++field3086;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            return null;
        } else {
            if (super.field2416.field7271) {
                int[][] var4 = this.method1163(1, arg0, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class245.field3167; ++var11) {
                    var8[var11] = 4096 - var5[var11];
                    var9[var11] = -var6[var11] + 4096;
                    var10[var11] = -var7[var11] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "(I)V", line = 327)
    public static void method1451(int arg0) {
        field3080 = null;
        field3085 = null;
        if (arg0 <= 58) {
            field3080 = null;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BILfh;)V", line = 338)
    public final void method7(byte arg0, int arg1, class463 arg2) {
        ++field3083;
        if (arg1 == 0) {
            super.field2406 = arg2.method2737(false) == 1;
        }
        int var4 = -59 % ((arg0 - -13) / 51);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V", line = 353)
    public class240() {
        super(1, false);
    }
}
