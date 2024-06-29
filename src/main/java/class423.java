import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class423 extends class481 {

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "[I")
    public static int[] field6155 = new int[200];

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field6152;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "Ll;")
    public static class127 field6147;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lhq;")
    public class423 field6146;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Lhq;")
    public class423 field6150;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "Lrg;")
    public static class465 field6154;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V")
    public static void method2525(byte arg0) {
        field6155 = null;
        if (arg0 != -56) {
            field6154 = null;
        }
        field6154 = null;
        field6147 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBIIII)V")
    public static final void method2526(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6153++;
        int var6 = -113 % ((arg1 + 2) / 44);
        int var7 = arg0 - arg5;
        int var8 = arg4 - arg2;
        if (var7 == 0) {
            if (var8 != 0) {
                class157.method1128((byte) -107, arg5, arg3, arg2, arg4);
            }
        } else if (var8 == 0) {
            class266.method1571(-25984, arg5, arg3, arg2, arg0);
        } else {
            int var9 = (var8 << 12) / var7;
            int var10 = arg2 - (arg5 * var9 >> 12);
            int var11;
            int var12;
            if (arg0 < class519.field7633) {
                var11 = (class519.field7633 * var9 >> 12) + var10;
                var12 = class519.field7633;
            } else if (class375.field5387 >= arg0) {
                var11 = arg4;
                var12 = arg0;
            } else {
                var12 = class375.field5387;
                var11 = (class375.field5387 * var9 >> 12) + var10;
            }
            int var13;
            int var14;
            if (class519.field7633 > arg5) {
                var13 = (class519.field7633 * var9 >> 12) + var10;
                var14 = class519.field7633;
            } else if (arg5 <= class375.field5387) {
                var13 = arg2;
                var14 = arg5;
            } else {
                var13 = (class375.field5387 * var9 >> 12) + var10;
                var14 = class375.field5387;
            }
            if (class23.field320 > var13) {
                var13 = class23.field320;
                var14 = (class23.field320 - var10 << 12) / var9;
            } else if (var13 > class233.field3241) {
                var14 = (class233.field3241 - var10 << 12) / var9;
                var13 = class233.field3241;
            }
            if (class23.field320 > var11) {
                var11 = class23.field320;
                var12 = (class23.field320 - var10 << 12) / var9;
            } else if (var11 > class233.field3241) {
                var11 = class233.field3241;
                var12 = (class233.field3241 - var10 << 12) / var9;
            }
            class467.method2717(var14, var11, arg3, -124, var12, var13);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILza;Lti;Lfk;ZI)Z")
    public static final boolean method2527(int arg0, class295 arg1, class237 arg2, class92 arg3, boolean arg4, int arg5) {
        field6156++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg3.field1507 != null) {
            var7 = class472.field6834 + ((arg3.field1465 - (class472.field6828 - arg2.field3277)) * (class472.field6826 - class472.field6834) / (class472.field6836 - class472.field6828));
            var6 = (arg3.field1509 - (class472.field6828 - arg2.field3277)) * (class472.field6826 - class472.field6834) / (class472.field6836 - class472.field6828) + class472.field6834;
            var8 = class472.field6823 - ((arg3.field1480 + arg2.field3274 - class472.field6830) * (class472.field6823 - class472.field6832) / (class472.field6829 - class472.field6830));
            var9 = class472.field6823 - ((arg3.field1483 + arg2.field3274 - class472.field6830) * (class472.field6823 - class472.field6832) / (class472.field6829 - class472.field6830));
        }
        class359 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg3.field1471 != -1) {
            if (arg2.field3282 && arg3.field1475 != -1) {
                var10 = arg3.method750(arg1, true, -2);
            } else {
                var10 = arg3.method750(arg1, false, -2);
            }
            if (var10 != null) {
                var11 = arg2.field3279 - (var10.method204() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg2.field3279 + (var10.method204() + 1 >> 1);
                var13 = arg2.field3286 - (var10.method207() + 1 >> 1);
                if (var12 > var7) {
                    var7 = var12;
                }
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg2.field3286 + (var10.method207() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class155 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg3.field1495 != null) {
            var15 = class157.method1129(arg3.field1504, false);
            if (var15 != null) {
                var16 = class249.field3394.method412(null, (byte) 2, null, arg3.field1495, class312.field4241);
                int var23 = arg2.field3286;
                if (var10 == null) {
                    var17 = var23 - var15.method1114() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method207() >> 1) + var16 * var15.method1115());
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class312.field4241[var24];
                    if (var16 - 1 > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1118(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg2.field3279 + arg5 - (var18 / 2);
                var20 = arg2.field3279 + (var18 / 2) + arg5;
                if (var19 < var6) {
                    var6 = var19;
                }
                if (var7 < var20) {
                    var7 = var20;
                }
                var21 = arg0 + var17;
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var15.method1115() * var16 + arg0 + var17;
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (class472.field6834 > var7 || var6 > class472.field6826 || var9 < class472.field6832 || var8 > class472.field6823) {
            return true;
        }
        if (arg3.field1507 != null) {
            int[] var27 = new int[arg3.field1507.length];
            for (int var28 = 0; var28 < var27.length / 2; var28++) {
                int var30 = arg3.field1507[var28 * 2] + arg2.field3277;
                int var31 = arg3.field1507[var28 * 2 + 1] + arg2.field3274;
                var27[var28 * 2] = class472.field6834 + ((class472.field6826 - class472.field6834) * (var30 - class472.field6828) / (class472.field6836 - class472.field6828));
                var27[var28 * 2 + 1] = class472.field6823 - ((class472.field6823 - class472.field6832) * (var31 - class472.field6830) / (class472.field6829 - class472.field6830));
            }
            class352.method2109(arg1, var27, arg3.field1498);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg1.method1706(true, var27[(var29 + 1) * 2], var27[var29 * 2 + 1], var27[(var29 + 1) * 2 + 1], var27[var29 * 2], arg3.field1470);
            }
            arg1.method1706(true, var27[0], var27[var27.length - 1], var27[1], var27[var27.length - 2], arg3.field1470);
        }
        if (!arg4) {
            method2526(6, (byte) 106, -37, 25, 45, 35);
        }
        if (var10 != null) {
            if (class149.field2304 > 0 && (class437.field6306 != -1 && class437.field6306 == arg2.field3280 || class65.field944 != -1 && class65.field944 == arg3.field1502)) {
                int var32;
                if (class203.field2940 <= 50) {
                    var32 = class203.field2940 * 2;
                } else {
                    var32 = (100 - class203.field2940) * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg1.method1709(var33, arg2.field3279, 12581, var10.method205() / 2 + 7, arg2.field3286);
                arg1.method1709(var33, arg2.field3279, 12581, var10.method205() / 2 + 5, arg2.field3286);
                arg1.method1709(var33, arg2.field3279, 12581, var10.method205() / 2 + 3, arg2.field3286);
                arg1.method1709(var33, arg2.field3279, 12581, var10.method205() / 2 + 1, arg2.field3286);
                arg1.method1709(var33, arg2.field3279, 12581, var10.method205() / 2, arg2.field3286);
            }
            var10.method2142(arg2.field3279 - (var10.method204() >> 1), arg2.field3286 + -(var10.method207() >> 1));
        }
        if (arg3.field1495 != null && var15 != null) {
            class391.method2319(arg2, arg1, var18, var15, var17, var16, arg3, false);
        }
        if (arg3.field1471 != -1 || arg3.field1495 != null) {
            class191 var34 = new class191(arg2);
            var34.field2792 = var22;
            var34.field2790 = var13;
            var34.field2795 = var21;
            var34.field2796 = var19;
            var34.field2787 = var11;
            var34.field2800 = var14;
            var34.field2784 = var20;
            var34.field2799 = var12;
            class377.field5430.method3139(0, var34);
        }
        return false;
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)V")
    public static final void method2528(byte arg0) {
        if (arg0 <= -126) {
            class2.field33.method2764(-769);
            field6152++;
        }
    }

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "(B)V")
    public final void method2529(byte arg0) {
        field6151++;
        if (this.field6150 == null) {
            return;
        }
        this.field6150.field6146 = this.field6146;
        this.field6146.field6150 = this.field6150;
        this.field6150 = null;
        this.field6146 = null;
        if (arg0 <= 90) {
            method2526(70, (byte) -58, 10, -41, 108, 29);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIII)V")
    public static final void method2530(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class286.field3881 = arg4;
        class422.field6129 = arg5;
        class137.field2067 = arg0;
        class50.field714 = arg3;
        field6149++;
        class22.field302 = arg1;
        if (class137.field2067 >= 100) {
            int var6 = class22.field302 * 128 + 64;
            int var7 = class422.field6129 * 128 + 64;
            int var8 = class123.method893(var7, var6, (byte) -13, class366.field5260) - class286.field3881;
            int var9 = var6 - class118.field1848;
            int var10 = var8 - class159.field2421;
            int var11 = var7 - class108.field1747;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class153.field2357 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class49.field706 = (int) (Math.atan2((double) var9, (double) var11) * -2607.5945876176133D) & 0x3FFF;
            if (class153.field2357 < 1024) {
                class153.field2357 = 1024;
            }
            class455.field6641 = 0;
            if (class153.field2357 > 3072) {
                class153.field2357 = 3072;
            }
        }
        if (arg2 != 16631) {
            field6147 = null;
        }
        class247.field3363 = 2;
    }
}
