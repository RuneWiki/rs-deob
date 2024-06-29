import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class130 extends class12 {

    @OriginalMember(owner = "client!ng", name = "N", descriptor = "I")
    private int field2347 = 204;

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
    private int field2357 = 0;

    @OriginalMember(owner = "client!ng", name = "P", descriptor = "I")
    private int field2349 = 409;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    private int field2363 = 1024;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "I")
    private int field2360 = 1024;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    private int field2366 = 8;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "I")
    private int field2369 = 81;

    @OriginalMember(owner = "client!ng", name = "S", descriptor = "I")
    private int field2352 = 4;

    @OriginalMember(owner = "client!ng", name = "O", descriptor = "I")
    public static int field2348 = 0;

    @OriginalMember(owner = "client!ng", name = "W", descriptor = "Ltg;")
    public static class184 field2356 = class135.method812("M", 3);

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "Ltg;")
    public static class184 field2358 = class135.method812("hint_headicons", 3);

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "B")
    public static byte field2361 = 0;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "[[S")
    public static short[][] field2365 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "Ltg;")
    public static class184 field2367 = class135.method812(" ", 3);

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "Ltg;")
    public static class184 field2372 = class135.method812("Lade Eingabe)2Steuerungsprogramm)3)3)3", 3);

    @OriginalMember(owner = "client!ng", name = "Q", descriptor = "I")
    private int field2350;

    @OriginalMember(owner = "client!ng", name = "V", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field2359;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "I")
    private int field2368;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "I")
    private int field2373;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "Lie;")
    public static class84 field2362;

    @OriginalMember(owner = "client!ng", name = "T", descriptor = "[I")
    private int[] field2353;

    @OriginalMember(owner = "client!ng", name = "R", descriptor = "[[I")
    private int[][] field2351;

    @OriginalMember(owner = "client!ng", name = "U", descriptor = "[[I")
    private int[][] field2354;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (~arg1 == -8) {
                                        this.field2360 = arg0.method611(false);
                                    }
                                } else {
                                    this.field2369 = arg0.method611(false);
                                }
                            } else {
                                this.field2357 = arg0.method611(false);
                            }
                        } else {
                            this.field2363 = arg0.method611(false);
                        }
                    } else {
                        this.field2347 = arg0.method611(false);
                    }
                } else {
                    this.field2349 = arg0.method611(false);
                }
            } else {
                this.field2366 = arg0.method588((byte) -80);
            }
        } else {
            this.field2352 = arg0.method588((byte) -118);
        }
        if (arg2) {
            this.method59((class97) null, 65, false);
        }
        ++field2359;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(B)V")
    public static void method788(byte arg0) {
        field2372 = null;
        field2367 = null;
        field2356 = null;
        field2362 = null;
        if (arg0 < -55) {
            field2365 = null;
            field2358 = null;
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "(III)Lja;")
    public static final class88 method789(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        return var3 != null && var3.field1690 != null ? var3.field1690 : null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 != 57) {
            this.method78((byte) -127);
        }
        ++field2370;
        this.method791(false);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
    public static final void method790(byte arg0) {
        class101.field1865 = new int[104];
        class83.field1475 = new int[104];
        class170.field3234 = new int[104];
        class60.field1124 = 99;
        class191.field3724 = new byte[4][105][105];
        ++field2374;
        class145.field2618 = new int[104];
        class167.field2987 = new byte[4][104][104];
        class129.field2327 = new byte[4][104][104];
        class189.field3679 = new int[4][105][105];
        class123.field2237 = new byte[4][104][104];
        if (arg0 == 65) {
            class29.field492 = new byte[4][104][104];
            class71.field1341 = new int[104];
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field2364;
        if (arg1 != 17) {
            return null;
        } else {
            int[] var3 = super.field224.method7((byte) 123, arg0);
            if (super.field224.field53) {
                int var4;
                for (var4 = class37.field698[arg0] + this.field2357; var4 < 0; var4 += 4096) {
                }
                int var5 = 0;
                while (var4 > 4096) {
                    var4 -= 4096;
                }
                while (~var5 > ~this.field2366 && var4 >= this.field2353[var5]) {
                    ++var5;
                }
                float var6 = (float) this.field2353[var5];
                float var7 = (float) this.field2353[var5 + -1];
                if ((float) this.field2350 + var7 < (float) var4 && (float) var4 < (float) (-this.field2350) + var6) {
                    for (int var8 = 0; ~class201.field3889 < ~var8; ++var8) {
                        int var9 = 0;
                        int var10 = ~(var5 % 2) == -1 ? this.field2363 : -this.field2363;
                        int var11;
                        for (var11 = (this.field2373 * var10 >> 12) + class131.field2381[var8]; ~var11 > -1; var11 += 4096) {
                        }
                        while (var11 > 4096) {
                            var11 -= 4096;
                        }
                        while (~this.field2352 < ~var9 && var11 >= this.field2351[var5 - 1][var9]) {
                            ++var9;
                        }
                        float var12 = (float) this.field2351[var5 - 1][var9];
                        float var13 = (float) this.field2351[var5 - 1][var9 + -1];
                        if ((float) this.field2350 + var13 < (float) var11 && (float) var11 < (float) (-this.field2350) + var12) {
                            var3[var8] = this.field2354[var5 + -1][var9 + -1];
                        } else {
                            var3[var8] = 0;
                        }
                    }
                } else {
                    class93.method536(var3, 0, class201.field3889, 0);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    private final void method791(boolean arg0) {
        Random var2 = new Random((long) this.field2366);
        this.field2373 = 4096 / this.field2352;
        this.field2368 = 4096 / this.field2366;
        int var3 = this.field2373 / 2;
        this.field2353 = new int[this.field2366 - -1];
        ++field2371;
        this.field2351 = new int[this.field2366][this.field2352 - -1];
        this.field2353[0] = 0;
        this.field2354 = new int[this.field2366][this.field2352];
        this.field2350 = this.field2369 / 2;
        int var4 = this.field2368 / 2;
        for (int var5 = 0; ~var5 > ~this.field2366; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2368;
                int var7 = (-2048 + class116.method712(4096, arg0, var2)) * this.field2347 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2353[var5] = this.field2353[var5 + -1] + var8;
            }
            this.field2351[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2352; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2373;
                    int var11 = (-2048 + class116.method712(4096, arg0, var2)) * this.field2349 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2351[var5][var9] = this.field2351[var5][var9 + -1] - -var12;
                }
                this.field2354[var5][var9] = this.field2360 <= 0 ? 4096 : -class116.method712(this.field2360, false, var2) + 4096;
            }
            this.field2351[var5][this.field2352] = 4096;
        }
        this.field2353[this.field2366] = 4096;
        if (arg0) {
            this.field2373 = 51;
        }
    }
}
