import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 extends class14 {

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    private int field472 = 1024;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    private int field475 = 81;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    private int field470 = 0;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    private int field461 = 4;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    private int field467 = 1024;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "I")
    private int field473 = 8;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    private int field478 = 204;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    private int field483 = 409;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "[Lwa;")
    public static class433[] field477 = new class433[30];

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "Lff;")
    public static class9 field466 = new class9(73, -1);

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "[I")
    public static int[] field481 = new int[100];

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field482 = 0;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bh", name = "N", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    private int field476;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "[I")
    private int[] field480;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "[[I")
    private int[][] field460;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "[[I")
    private int[][] field474;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBLmd;)V")
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 == -8) {
                                        this.field472 = arg2.method2212((byte) 83);
                                    }
                                } else {
                                    this.field475 = arg2.method2212((byte) 83);
                                }
                            } else {
                                this.field470 = arg2.method2212((byte) 83);
                            }
                        } else {
                            this.field467 = arg2.method2212((byte) 83);
                        }
                    } else {
                        this.field478 = arg2.method2212((byte) 83);
                    }
                } else {
                    this.field483 = arg2.method2212((byte) 83);
                }
            } else {
                this.field473 = arg2.method2238(255);
            }
        } else {
            this.field461 = arg2.method2238(255);
        }
        int var5 = -35 % ((-51 - arg1) / 37);
        ++field463;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)[I")
    public final int[] method140(int arg0, byte arg1) {
        ++field464;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 >= -2) {
            this.field473 = -31;
        }
        if (super.field270.field5222) {
            int var4 = 0;
            int var5;
            for (var5 = class273.field3590[arg0] + this.field470; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field473 > var4 && var5 >= this.field480[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field480[var4];
            int var9 = this.field480[var4 + -1];
            if (var5 > this.field476 + var9 && var5 < -this.field476 + var8) {
                for (int var10 = 0; ~class115.field1637 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field467 : this.field467;
                    int var13;
                    for (var13 = class195.field2715[var10] - -(this.field471 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field461 && ~this.field474[var6][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field474[var6][var11];
                    int var16 = this.field474[var6][var14];
                    if (this.field476 + var16 < var13 && var13 < -this.field476 + var15) {
                        var3[var10] = this.field460[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class254.method1530(var3, 0, class115.field1637, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
    public final void method142(byte arg0) {
        this.method232(100);
        int var2 = -58 % ((arg0 - 39) / 59);
        ++field479;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)Z")
    public static final boolean method230(int arg0, int arg1) {
        ++field468;
        if (class489.field6793[arg0]) {
            return true;
        } else if (!class14.field279.method2712(arg0, 0)) {
            return false;
        } else {
            int var2 = class14.field279.method2710(arg0, (byte) -99);
            if (~var2 == -1) {
                class489.field6793[arg0] = true;
                return true;
            } else {
                if (class238.field3185[arg0] == null) {
                    class238.field3185[arg0] = new class403[var2];
                }
                for (int var3 = 0; var2 > var3; ++var3) {
                    if (class238.field3185[arg0][var3] == null) {
                        byte[] var4 = class14.field279.method2708(arg0, var3, (byte) 54);
                        if (var4 != null) {
                            class403 var5 = class238.field3185[arg0][var3] = new class403();
                            var5.field5431 = (arg0 << 16) + var3;
                            if (~var4[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var5.method2339((byte) 64, new class379(var4));
                        }
                    }
                }
                class489.field6793[arg0] = true;
                if (arg1 < 105) {
                    field466 = null;
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIZ)I")
    public static final int method231(int arg0, int arg1, int arg2, boolean arg3) {
        ++field465;
        if (arg1 < 42) {
            return 80;
        } else {
            class32 var4 = class222.method1397(arg3, arg2, false);
            if (var4 == null) {
                return -1;
            } else {
                return arg0 >= 0 && ~arg0 > ~var4.field527.length ? var4.field527[arg0] : -1;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "(I)V")
    private final void method232(int arg0) {
        ++field462;
        Random var2 = new Random((long) this.field473);
        this.field476 = this.field475 / 2;
        this.field471 = 4096 / this.field461;
        this.field469 = 4096 / this.field473;
        if (arg0 != 100) {
            this.method147(-87, (byte) -88, (class379) null);
        }
        int var3 = this.field471 / 2;
        this.field474 = new int[this.field473][this.field461 + 1];
        this.field460 = new int[this.field473][this.field461];
        int var4 = this.field469 / 2;
        this.field480 = new int[this.field473 + 1];
        this.field480[0] = 0;
        for (int var5 = 0; var5 < this.field473; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field469;
                int var7 = (-2048 + class363.method2116(4096, var2, true)) * this.field478 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field480[var5] = this.field480[var5 + -1] + var8;
            }
            this.field474[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field461; ++var9) {
                if (var9 > 0) {
                    int var10 = this.field471;
                    int var11 = (-2048 + class363.method2116(4096, var2, true)) * this.field483 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field474[var5][var9] = this.field474[var5][var9 + -1] + var12;
                }
                this.field460[var5][var9] = ~this.field472 >= -1 ? 4096 : 4096 - class363.method2116(this.field472, var2, true);
            }
            this.field474[var5][this.field461] = 4096;
        }
        this.field480[this.field473] = 4096;
    }

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
    public static void method233(int arg0) {
        if (arg0 != 22940) {
            method230(23, -14);
        }
        field477 = null;
        field481 = null;
        field466 = null;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V")
    public class28() {
        super(0, true);
    }
}
