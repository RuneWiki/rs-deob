import java.awt.Point;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public class class205 extends class82 {

    @OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
    private int field2448 = 81;

    @OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
    private int field2454 = 8;

    @OriginalMember(owner = "client!cca", name = "T", descriptor = "I")
    private int field2456 = 204;

    @OriginalMember(owner = "client!cca", name = "bb", descriptor = "I")
    private int field2464 = 409;

    @OriginalMember(owner = "client!cca", name = "Y", descriptor = "I")
    private int field2461 = 1024;

    @OriginalMember(owner = "client!cca", name = "N", descriptor = "I")
    private int field2450 = 0;

    @OriginalMember(owner = "client!cca", name = "Z", descriptor = "I")
    private int field2462 = 1024;

    @OriginalMember(owner = "client!cca", name = "gb", descriptor = "I")
    private int field2469 = 4;

    @OriginalMember(owner = "client!cca", name = "M", descriptor = "[J")
    public static long[] field2449 = new long[32];

    @OriginalMember(owner = "client!cca", name = "P", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!cca", name = "Q", descriptor = "I")
    private int field2453;

    @OriginalMember(owner = "client!cca", name = "S", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!cca", name = "V", descriptor = "I")
    public static int field2458;

    @OriginalMember(owner = "client!cca", name = "W", descriptor = "I")
    private int field2459;

    @OriginalMember(owner = "client!cca", name = "ab", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!cca", name = "cb", descriptor = "I")
    private int field2465;

    @OriginalMember(owner = "client!cca", name = "db", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!cca", name = "eb", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!cca", name = "fb", descriptor = "I")
    public static int field2468;

    @OriginalMember(owner = "client!cca", name = "O", descriptor = "[I")
    private int[] field2451;

    @OriginalMember(owner = "client!cca", name = "U", descriptor = "[[I")
    private int[][] field2457;

    @OriginalMember(owner = "client!cca", name = "X", descriptor = "[[I")
    private int[][] field2460;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(ZII)Z", line = 6)
    public static final boolean method1096(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method1097((byte) 99, 121);
        }
        ++field2466;
        return (2048 & arg2) != 0 && (arg1 & 55) != 0;
    }

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V", line = 17)
    public class205() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILos;)V", line = 21)
    public final void method198(int arg0, int arg1, class374 arg2) {
        ++field2458;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field2461 = arg2.method2136(false);
                                    }
                                } else {
                                    this.field2448 = arg2.method2136(false);
                                }
                            } else {
                                this.field2450 = arg2.method2136(false);
                            }
                        } else {
                            this.field2462 = arg2.method2136(false);
                        }
                    } else {
                        this.field2456 = arg2.method2136(false);
                    }
                } else {
                    this.field2464 = arg2.method2136(false);
                }
            } else {
                this.field2454 = arg2.method2129(-62);
            }
        } else {
            this.field2469 = arg2.method2129(-109);
        }
        int var5 = 29 % ((-69 - arg1) / 42);
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)V", line = 103)
    public static final void method1097(byte arg0, int arg1) {
        ++field2468;
        if (!class565.field8299.field2196) {
            arg1 = -1;
        }
        int var2 = -66 / ((arg0 - -11) / 61);
        if (class387.field5113 != arg1) {
            if (arg1 != -1) {
                class243 var3 = class290.field3765.method2042(arg1, true);
                class3 var4 = var3.method1382(20285);
                if (var4 != null) {
                    class74.field873.method915(var4.method20(), var4.method15(), class41.field331, new Point(var3.field3132, var3.field3129), 113, var4.method22());
                    class387.field5113 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (~arg1 == 0 && ~class387.field5113 != 0) {
                class74.field873.method915(-1, -1, class41.field331, new Point(), 75, (int[]) null);
                class387.field5113 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V", line = 145)
    public final void method438(int arg0) {
        if (arg0 == -2) {
            this.method1098(121);
            ++field2467;
        }
    }

    @OriginalMember(owner = "client!cca", name = "h", descriptor = "(I)V", line = 156)
    private final void method1098(int arg0) {
        ++field2455;
        if (arg0 >= 55) {
            Random var2 = new Random((long) this.field2454);
            this.field2465 = 4096 / this.field2469;
            this.field2459 = this.field2448 / 2;
            this.field2453 = 4096 / this.field2454;
            int var3 = this.field2465 / 2;
            this.field2451 = new int[this.field2454 - -1];
            this.field2460 = new int[this.field2454][this.field2469];
            this.field2457 = new int[this.field2454][this.field2469 - -1];
            int var4 = this.field2453 / 2;
            this.field2451[0] = 0;
            for (int var5 = 0; ~this.field2454 < ~var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field2453;
                    int var7 = (-2048 + class242.method1375(4096, false, var2)) * this.field2456 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field2451[var5] = this.field2451[var5 - 1] + var8;
                }
                this.field2457[var5][0] = 0;
                for (int var9 = 0; ~var9 > ~this.field2469; ++var9) {
                    if (~var9 < -1) {
                        int var10 = this.field2465;
                        int var11 = (class242.method1375(4096, false, var2) + -2048) * this.field2464 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field2457[var5][var9] = this.field2457[var5][var9 + -1] + var12;
                    }
                    this.field2460[var5][var9] = this.field2461 > 0 ? 4096 - class242.method1375(this.field2461, false, var2) : 4096;
                }
                this.field2457[var5][this.field2469] = 4096;
            }
            this.field2451[this.field2454] = 4096;
        }
    }

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(II)[I", line = 225)
    public final int[] method201(int arg0, int arg1) {
        ++field2452;
        int[] var3 = super.field990.method1566((byte) 116, arg0);
        if (arg1 != 12218) {
            return null;
        } else {
            if (super.field990.field3641) {
                int var4 = 0;
                int var5;
                for (var5 = class85.field1036[arg0] - -this.field2450; ~var5 > -1; var5 += 4096) {
                }
                while (~var5 < -4097) {
                    var5 -= 4096;
                }
                while (var4 < this.field2454 && this.field2451[var4] <= var5) {
                    ++var4;
                }
                int var6 = var4 + -1;
                boolean var7 = (var4 & 1) == 0;
                int var8 = this.field2451[var4];
                int var9 = this.field2451[var4 - 1];
                if (~(this.field2459 + var9) > ~var5 && ~(-this.field2459 + var8) < ~var5) {
                    for (int var10 = 0; class629.field9033 > var10; ++var10) {
                        int var11 = var7 ? this.field2462 : -this.field2462;
                        int var12 = 0;
                        int var13;
                        for (var13 = (this.field2465 * var11 >> 12) + class366.field4817[var10]; var13 < 0; var13 += 4096) {
                        }
                        while (var13 > 4096) {
                            var13 -= 4096;
                        }
                        while (~this.field2469 < ~var12 && ~this.field2457[var6][var12] >= ~var13) {
                            ++var12;
                        }
                        int var14 = var12 - 1;
                        int var15 = this.field2457[var6][var14];
                        int var16 = this.field2457[var6][var12];
                        if (~var13 < ~(this.field2459 + var15) && var13 < -this.field2459 + var16) {
                            var3[var10] = this.field2460[var6][var14];
                        } else {
                            var3[var10] = 0;
                        }
                    }
                } else {
                    class345.method1928(var3, 0, class629.field9033, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Z)V", line = 355)
    public static void method1099(boolean arg0) {
        if (!arg0) {
            field2449 = null;
        }
    }
}
