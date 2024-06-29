import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class241 {

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Z")
    private boolean field3586 = false;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public int field3584 = 0;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "I")
    public int field3597 = 0;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Lth;")
    public static class57 field3591 = new class57(64);

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "I")
    public static int field3595 = 0;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public static int field3600 = -1;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "I")
    public int field3581;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public int field3590;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public int field3592;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
    public int field3598;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public int field3599;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "J")
    public long field3582;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 10)
    public static void method1772(int arg0) {
        if (arg0 != 2000) {
            field3595 = -75;
        }
        field3591 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IILmf;II)V", line = 20)
    public static final void method1773(int arg0, int arg1, class214 arg2, int arg3, int arg4) {
        field3579++;
        if (class264.field4043 >= 400) {
            return;
        }
        if (arg2.field3142 != null) {
            arg2 = arg2.method1539(false);
        }
        if (arg2 == null) {
            return;
        }
        if (arg4 != -1) {
            method1772(-87);
        }
        if (!arg2.field3136) {
            return;
        }
        String var5 = arg2.field3098;
        if (arg2.field3129 != 0) {
            String var6 = class164.field2335 == 1 ? class103.field1485 : class49.field730;
            var5 = var5 + class286.method2066(class1.field55.field3459, true, arg2.field3129) + " (" + var6 + arg2.field3129 + ")";
        }
        if (class239.field3562 == 1) {
            class261.method1920((short) 23, class357.field5471, class15.field231, arg1, class333.field5176 + " -> <col=ffff00>" + var5, -2, arg0, (long) arg3);
            class315.field4677++;
        } else if (class273.field4150) {
            class343 var7 = class158.field2284 == -1 ? null : class275.method2009(arg4 + 1, class158.field2284);
            if ((class49.field728 & 0x2) != 0 && (var7 == null || arg2.method1543(class158.field2284, var7.field5307, -32435) != var7.field5307)) {
                class261.method1920((short) 44, class247.field3655, class33.field475, arg1, class31.field449 + " -> <col=ffff00>" + var5, -2, arg0, (long) arg3);
                class178.field2557++;
            }
        } else {
            String[] var8 = arg2.field3110;
            if (class202.field2971) {
                var8 = class200.method1459(0, var8);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class164.field2335 != 0 || !var8[var9].equalsIgnoreCase(class74.field1084))) {
                        byte var10 = 0;
                        class97.field1368++;
                        if (var9 == 0) {
                            var10 = 28;
                        }
                        if (var9 == 1) {
                            var10 = 30;
                        }
                        int var11 = -1;
                        if (var9 == 2) {
                            var10 = 11;
                        }
                        if (arg2.field3137 == var9) {
                            var11 = arg2.field3135;
                        }
                        if (arg2.field3099 == var9) {
                            var11 = arg2.field3112;
                        }
                        if (var9 == 3) {
                            var10 = 32;
                        }
                        if (var9 == 4) {
                            var10 = 4;
                        }
                        class261.method1920(var10, var8[var9], var11, arg1, "<col=ffff00>" + var5, arg4 - 1, arg0, (long) arg3);
                    }
                }
            }
            class302.field4513++;
            if (class164.field2335 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class74.field1084)) {
                        class128.field1866++;
                        short var13 = 0;
                        if (class1.field55.field3459 < arg2.field3129) {
                            var13 = 2000;
                        }
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 28;
                        }
                        if (var12 == 1) {
                            var14 = 30;
                        }
                        if (var12 == 2) {
                            var14 = 11;
                        }
                        if (var12 == 3) {
                            var14 = 32;
                        }
                        if (var12 == 4) {
                            var14 = 4;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class261.method1920(var14, var8[var12], arg2.field3086, arg1, "<col=ffff00>" + var5, -2, arg0, (long) arg3);
                    }
                }
            }
            class261.method1920((short) 1001, class165.field2343, class137.field1986, arg1, "<col=ffff00>" + var5, -2, arg0, (long) arg3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lsb;BI)V", line = 199)
    private final void method1774(class190 arg0, byte arg1, int arg2) {
        field3594++;
        if (arg2 == 1) {
            this.field3585 = arg0.method1317((byte) 63);
        } else if (arg2 == 2) {
            arg0.method1319(255);
        } else if (arg2 == 3) {
            this.field3581 = arg0.method1371(-4);
            this.field3598 = arg0.method1371(-4);
            this.field3599 = arg0.method1371(-4);
        } else if (arg2 == 4) {
            this.field3583 = arg0.method1319(255);
            this.field3587 = arg0.method1371(-4);
        } else if (arg2 == 6) {
            this.field3592 = arg0.method1319(255);
        } else if (arg2 == 8) {
            this.field3584 = 1;
        } else if (arg2 == 9) {
            this.field3597 = 1;
        } else if (arg2 == 10) {
            this.field3586 = true;
        }
        if (arg1 < 100) {
            this.method1774((class190) null, (byte) 110, 97);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLsb;)V", line = 254)
    public final void method1775(byte arg0, class190 arg1) {
        if (arg0 != 63) {
            return;
        }
        field3596++;
        while (true) {
            int var3 = arg1.method1319(255);
            if (var3 == 0) {
                return;
            }
            this.method1774(arg1, (byte) 103, var3);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)V", line = 279)
    public static final void method1776(int arg0, boolean arg1, int arg2) {
        field3589++;
        class16 var3 = class252.field3762[class321.field4835][arg2][arg0];
        if (var3 == null) {
            class267.method1973(class321.field4835, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class158 var5 = null;
        for (class158 var6 = (class158) var3.method93((byte) -57); var6 != null; var6 = (class158) var3.method97(-93)) {
            class122 var7 = class175.method1228((byte) 54, var6.field2273.field4108);
            int var8 = var7.field1713;
            if (var7.field1745 == 1) {
                var8 = (var6.field2273.field4098 + 1) * var8;
            }
            if (var4 < var8) {
                var4 = var8;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class267.method1973(class321.field4835, arg2, arg0);
            return;
        }
        var3.method99(var5, (byte) 33);
        if (!arg1) {
            method1772(-123);
        }
        class158 var9 = (class158) var3.method93((byte) -83);
        class270 var10 = null;
        class270 var11 = null;
        while (var9 != null) {
            class270 var12 = var9.field2273;
            if (var5.field2273.field4108 != var12.field4108) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field4108 != var12.field4108 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class158) var3.method97(-122);
        }
        long var13 = (long) ((arg0 << 7) + arg2 + 1610612736);
        class48.method408(class321.field4835, arg2, arg0, class71.method584(class321.field4835, arg2 * 128 + 64, 90, arg0 * 128 + 64), var5.field2273, var13, var11, var10);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V", line = 360)
    public final void method1777(int arg0) {
        this.field3580 = class345.field5343[this.field3585];
        this.field3593 = (int) Math.sqrt((double) (this.field3581 * this.field3581 + (this.field3598 * this.field3598 + (this.field3599 * this.field3599))));
        if (this.field3587 == 0) {
            this.field3587 = 1;
        }
        field3588++;
        if (this.field3583 == arg0) {
            this.field3582 = 2147483647L;
        } else if (this.field3583 == 1) {
            this.field3582 = (long) (this.field3593 * 8 / this.field3587);
            this.field3582 *= this.field3582;
        } else if (this.field3583 == 2) {
            this.field3582 = (long) (this.field3593 * 8 / this.field3587);
        }
        if (this.field3586) {
            this.field3593 *= -1;
        }
    }
}
