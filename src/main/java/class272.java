import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class272 extends class117 {

    @OriginalMember(owner = "client!ld", name = "I", descriptor = "I")
    private int field4361 = 4096;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    private int field4367 = 0;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field4371 = 0;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field4364 = -1;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4372 = null;

    @OriginalMember(owner = "client!ld", name = "J", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field4375;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4368;

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class272() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIII)V")
    public static final void method1818(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4374;
        int var5 = -122 % ((23 - arg0) / 33);
        if (class183.field3011 != 0 && arg4 != 0 && ~class195.field3163 > -51 && arg3 != -1) {
            class199.field3203[class195.field3163] = arg3;
            class4.field47[class195.field3163] = arg4;
            class291.field4678[class195.field3163] = arg1;
            class30.field371[class195.field3163] = null;
            class11.field118[class195.field3163] = 0;
            class126.field1995[class195.field3163] = arg2;
            ++class195.field3163;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I")
    public final int[] method46(int arg0, int arg1) {
        ++field4362;
        int[] var3 = super.field1883.method531(arg1, (byte) 79);
        if (arg0 != 2) {
            return null;
        } else {
            if (super.field1883.field1313) {
                int[] var4 = this.method837(0, 0, arg1);
                for (int var5 = 0; ~class168.field2737 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    if (var6 < this.field4367) {
                        var3[var5] = this.field4367;
                    } else if (var6 <= this.field4361) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field4361;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)V")
    public static void method1819(int arg0) {
        field4372 = null;
        if (arg0 != 1011) {
            field4371 = -52;
        }
        field4368 = null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(III)V")
    public static final void method1820(int arg0, int arg1, int arg2) {
        class148.field2313 = true;
        class160.field2549 = arg0;
        class237.field3808 = arg1;
        class214.field3539 = arg2;
        field4364 = -1;
        class298.field4746 = -1;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljh;Led;III)V")
    public static final void method1821(class269 arg0, class50 arg1, int arg2, int arg3, int arg4) {
        ++field4363;
        if (arg1.field829 != null) {
            boolean var5 = false;
            int[] var6 = new int[arg1.field829.length];
            for (int var7 = 0; var6.length / 2 > var7; ++var7) {
                int var9 = arg1.field829[var7 * 2] + arg0.field4334;
                int var10 = -arg1.field829[var7 * 2 + 1] - -arg0.field4328;
                int var11 = var6[var7 * 2] = (-class275.field4427 + var9) * (-class275.field4420 + class275.field4423) / (-class275.field4427 + class275.field4422) + class275.field4420;
                int var12 = var6[var7 * 2 + 1] = (var10 - class275.field4428) * (-class275.field4424 + class275.field4434) / (class275.field4425 - class275.field4428) + class275.field4424;
                if (class275.field4420 < var11 && class275.field4423 > var11 && var12 > class275.field4424 && ~var12 > ~class275.field4434) {
                    var5 = true;
                }
            }
            if (!var5) {
                return;
            }
            class76.method515(var6, arg1.field830, arg1.field830 >>> 24);
            for (int var8 = 0; ~var8 > ~(var6.length / 2 + -1); ++var8) {
                class127.method880(var6[var8 * 2], var6[var8 * 2 - -1], var6[(var8 - -1) * 2], var6[(var8 + 1) * 2 - -1], arg1.field836, arg1.field836 >>> 24);
            }
            class127.method880(var6[var6.length + -2], var6[var6.length - 1], var6[0], var6[1], arg1.field836, arg1.field836 >>> 24);
        } else if (arg0.field4331) {
            return;
        }
        class260 var13 = null;
        if (arg4 > -31) {
            method1823((byte) -58, 113);
        }
        class18 var14 = new class18(arg0);
        if (~arg1.field831 != 0) {
            if (arg0.field4326 && ~arg1.field848 != 0) {
                var13 = (class260) arg1.method351(true, true, 101);
            } else {
                var13 = (class260) arg1.method351(true, false, 68);
            }
            if (var13 != null) {
                if (~class274.field4401 < -1 && (class119.field1907 != -1 && class119.field1907 == arg0.field4333 || class26.field331 != -1 && ~class26.field331 == ~arg1.field845)) {
                    int var15;
                    if (~class98.field1584 >= -51) {
                        var15 = class98.field1584 * 3;
                    } else {
                        var15 = (-class98.field1584 + 100) * 3;
                    }
                    class127.method901(arg0.field4327, arg0.field4335, var13.field3603 / 2 + 7, 16776960, var15);
                    class127.method901(arg0.field4327, arg0.field4335, var13.field3603 / 2 - -5, 16776960, var15);
                    class127.method901(arg0.field4327, arg0.field4335, var13.field3603 / 2 + 3, 16776960, var15);
                    class127.method901(arg0.field4327, arg0.field4335, var13.field3603 / 2 + 1, 16776960, var15);
                    class127.method901(arg0.field4327, arg0.field4335, var13.field3603 / 2, 16776960, var15);
                }
                var13.method1517(-(var13.field3603 >> 1) + arg0.field4327, -(var13.field3605 >> 1) + arg0.field4335);
                var14.field220 = (var13.field3605 >> 1) + arg3 - -arg0.field4335;
                var14.field216 = (var13.field3603 >> 1) + arg0.field4327 + arg2;
                var14.field225 = arg0.field4327 + arg2 - (var13.field3603 >> 1);
                var14.field212 = arg3 - -arg0.field4335 + -(var13.field3605 >> 1);
            }
        }
        if (arg1.field819 != null) {
            if (var13 != null) {
                class57.method391((var13.field3605 >> 1) + 5, false, var14, arg0, arg1, arg3, -80, arg2);
            } else {
                class57.method391(0, true, var14, arg0, arg1, arg3, -111, arg2);
            }
        }
        if (var14.method93(class77.field1281, class269.field4344, (byte) -1) && arg1.field833 != null) {
            if (arg1.field833[4] != null) {
                class266.method1789(arg1.field844, arg1.field845, 0, arg1.field833[4], (long) arg0.field4333, -1, -100, (short) 1006);
            }
            if (arg1.field833[3] != null) {
                class266.method1789(arg1.field844, arg1.field845, 0, arg1.field833[3], (long) arg0.field4333, -1, 118, (short) 1012);
            }
            if (arg1.field833[2] != null) {
                class266.method1789(arg1.field844, arg1.field845, 0, arg1.field833[2], (long) arg0.field4333, -1, 125, (short) 1009);
            }
            if (arg1.field833[1] != null) {
                class266.method1789(arg1.field844, arg1.field845, 0, arg1.field833[1], (long) arg0.field4333, -1, -85, (short) 1010);
            }
            if (arg1.field833[0] != null) {
                class266.method1789(arg1.field844, arg1.field845, 0, arg1.field833[0], (long) arg0.field4333, -1, -73, (short) 1011);
            }
        }
        class94.field1523.method1646(true, var14);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILaa;)V")
    public static final void method1822(int arg0, class43 arg1) {
        ++field4375;
        if (arg0 != -30671) {
            method1821((class269) null, (class50) null, 35, -24, -103);
        }
        int var2 = -class29.field360 + arg1.field657;
        int var3 = arg1.field665 * 128 - -(arg1.method279(arg0 ^ -11436) * 64);
        int var4 = arg1.field632 * 128 + 64 * arg1.method279(23397);
        arg1.field710 += (-arg1.field710 + var4) / var2;
        arg1.field637 += (-arg1.field637 + var3) / var2;
        if (arg1.field649 == 0) {
            arg1.field702 = 1024;
        }
        if (arg1.field649 == 1) {
            arg1.field702 = 1536;
        }
        if (~arg1.field649 == -3) {
            arg1.field702 = 0;
        }
        arg1.field697 = 0;
        if (~arg1.field649 == -4) {
            arg1.field702 = 512;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lwd;II)V")
    public final void method44(class162 arg0, int arg1, int arg2) {
        ++field4373;
        if (arg1 != 255) {
            method1824(-61);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field1885 = ~arg0.method1133((byte) 53) == -2;
                }
            } else {
                this.field4361 = arg0.method1142(-18970);
            }
        } else {
            this.field4367 = arg0.method1142(-18970);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(BI)V")
    public static final void method1823(byte arg0, int arg1) {
        if (arg0 != -89) {
            field4368 = null;
        }
        class233.field3742.method1262(arg1, arg0 ^ -2793);
        ++field4370;
    }

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "(I)V")
    public static final void method1824(int arg0) {
        if (arg0 != -1) {
            field4376 = 36;
        }
        ++field4366;
        for (class134 var1 = (class134) class1.field10.method1643((byte) 127); var1 != null; var1 = (class134) class1.field10.method1642((byte) 52)) {
            class141 var2 = var1.field2125;
            if (~class56.field941 == ~var2.field2257 && !var2.field2245) {
                if (var2.field2249 <= class29.field360) {
                    var2.method991(118, class223.field3630);
                    if (!var2.field2245) {
                        class51.method358(var2.field2257, var2.field2243, var2.field2265, var2.field2258, 60, var2, 0, -1L, false);
                    } else {
                        var1.method913(-3542);
                    }
                }
            } else {
                var1.method913(arg0 ^ 3541);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(II)[[I")
    public final int[][] method47(int arg0, int arg1) {
        int[][] var3 = super.field1886.method419(arg0, (byte) -9);
        ++field4369;
        if (super.field1886.field1022) {
            int[][] var4 = this.method838(0, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class168.field2737 < ~var11; ++var11) {
                int var12 = var10[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (~var14 <= ~this.field4367) {
                    if (this.field4361 < var14) {
                        var7[var11] = this.field4361;
                    } else {
                        var7[var11] = var14;
                    }
                } else {
                    var7[var11] = this.field4367;
                }
                if (~this.field4367 < ~var13) {
                    var8[var11] = this.field4367;
                } else if (~var13 < ~this.field4361) {
                    var8[var11] = this.field4361;
                } else {
                    var8[var11] = var13;
                }
                if (this.field4367 > var12) {
                    var9[var11] = this.field4367;
                } else if (var12 <= this.field4361) {
                    var9[var11] = var12;
                } else {
                    var9[var11] = this.field4361;
                }
            }
        }
        int var15 = 13 / ((37 - arg1) / 38);
        return var3;
    }
}
