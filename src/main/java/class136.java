import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class136 extends class12 {

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    private int field2488 = 3072;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    private int field2476 = 1024;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    private int field2482 = 2048;

    @OriginalMember(owner = "client!od", name = "P", descriptor = "Ltg;")
    public static class184 field2470 = class135.method812("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 3);

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field2471 = 1;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    public static int field2480 = 255;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "Ltg;")
    public static class184 field2483 = class135.method812("Wir vermuten)1 dass jemand Ihr Passwort kennt)3", 3);

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "Ltg;")
    public static class184 field2479 = class135.method812("headicons_pk", 3);

    @OriginalMember(owner = "client!od", name = "N", descriptor = "Ltg;")
    public static class184 field2468 = class135.method812("Clientscript error in: ", 3);

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "[J")
    public static long[] field2481 = new long[200];

    @OriginalMember(owner = "client!od", name = "O", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "[I")
    public static int[] field2474;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B[[I)V")
    public static final void method818(byte arg0, int[][] arg1) {
        if (arg0 == -16) {
            ++field2477;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 != 57) {
            field2468 = null;
        }
        this.field2482 = this.field2488 - this.field2476;
        ++field2475;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        int[] var3 = super.field224.method7((byte) -50, arg0);
        if (arg1 != 17) {
            this.method80(-83, -8);
        }
        if (super.field224.field53) {
            int[] var4 = this.method77(0, arg0, -122);
            for (int var5 = 0; ~class201.field3889 < ~var5; ++var5) {
                var3[var5] = (var4[var5] * this.field2482 >> 12) + this.field2476;
            }
        }
        ++field2485;
        return var3;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field211 = ~arg0.method588((byte) -69) == -2;
                }
            } else {
                this.field2488 = arg0.method611(arg2);
            }
        } else {
            this.field2476 = arg0.method611(arg2);
        }
        ++field2473;
        if (arg2) {
            field2481 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
    public static final void method819(int arg0) {
        for (int var1 = -1; class26.field466 > var1; ++var1) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class200.field3880[var1];
            }
            class67 var3 = class57.field1024[var2];
            if (var3 != null) {
                class55.method294(1, (byte) -48, var3);
            }
        }
        if (arg0 <= 31) {
            method819(114);
        }
        ++field2486;
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(III)V")
    public static final void method820(int arg0, int arg1, int arg2) {
        ++field2469;
        class69 var3 = class157.field2813[class47.field892][arg0][arg1];
        if (arg2 == 0) {
            if (var3 == null) {
                class134.method807(class47.field892, arg0, arg1);
            } else {
                int var4 = -99999999;
                class3 var5 = null;
                for (class3 var6 = (class3) var3.method404(false); var6 != null; var6 = (class3) var3.method414(arg2 ^ -119)) {
                    class122 var12 = class60.method336(var6.field59, 10);
                    int var13 = var12.field2200;
                    if (var12.field2223 == 1) {
                        var13 = (var6.field60 + 1) * var13;
                    }
                    if (~var13 < ~var4) {
                        var4 = var13;
                        var5 = var6;
                    }
                }
                if (var5 == null) {
                    class134.method807(class47.field892, arg0, arg1);
                } else {
                    var3.method403(true, var5);
                    class3 var7 = (class3) var3.method404(false);
                    class3 var8 = null;
                    class3 var9 = null;
                    while (var7 != null) {
                        if (var5.field59 != var7.field59) {
                            if (var8 == null) {
                                var8 = var7;
                            }
                            if (var7.field59 != var8.field59 && var9 == null) {
                                var9 = var7;
                            }
                        }
                        var7 = (class3) var3.method414(-119);
                    }
                    long var10 = (long) ((arg1 << 7) + 1610612736 + arg0);
                    class131.method796(class47.field892, arg0, arg1, class115.method706(arg0 * 128 + 64, class47.field892, arg2 ^ 127, arg1 * 128 + 64), var5, var10, var8, var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(II)Z")
    public static final boolean method821(int arg0, int arg1) {
        ++field2487;
        if (arg0 != -49) {
            return true;
        } else {
            return ~arg1 <= -49 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)V")
    public static void method822(boolean arg0) {
        field2483 = null;
        field2468 = null;
        field2479 = null;
        if (arg0) {
            field2474 = null;
        }
        field2470 = null;
        field2474 = null;
        field2481 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
    public class136() {
        super(1, false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIB)V")
    public static final void method823(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = 42 % ((arg3 - -17) / 59);
        for (int var5 = 0; ~var5 > -9; ++var5) {
            for (int var8 = 0; ~var8 > -9; ++var8) {
                class179.field3418[arg2][arg1 + var5][arg0 + var8] = 0;
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; ++var6) {
                class179.field3418[arg2][arg1][arg0 + var6] = class179.field3418[arg2][arg1 + -1][arg0 - -var6];
            }
        }
        ++field2484;
        if (arg0 > 0) {
            for (int var7 = 1; ~var7 > -9; ++var7) {
                class179.field3418[arg2][arg1 + var7][arg0] = class179.field3418[arg2][arg1 + var7][arg0 + -1];
            }
        }
        if (arg1 > 0 && ~class179.field3418[arg2][arg1 - 1][arg0] != -1) {
            class179.field3418[arg2][arg1][arg0] = class179.field3418[arg2][arg1 - 1][arg0];
        } else if (~arg0 < -1 && ~class179.field3418[arg2][arg1][arg0 + -1] != -1) {
            class179.field3418[arg2][arg1][arg0] = class179.field3418[arg2][arg1][arg0 + -1];
        } else if (arg1 > 0 && arg0 > 0 && ~class179.field3418[arg2][arg1 + -1][arg0 + -1] != -1) {
            class179.field3418[arg2][arg1][arg0] = class179.field3418[arg2][arg1 - 1][arg0 + -1];
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field2489;
        int var3 = 6 / ((arg1 - -58) / 34);
        int[][] var4 = super.field232.method673(arg0, 102);
        if (super.field232.field1962) {
            int[][] var5 = this.method76(arg0, 6218, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var4[1];
            int[] var9 = var5[1];
            int[] var10 = var4[0];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class201.field3889; ++var12) {
                var10[var12] = (var6[var12] * this.field2482 >> 12) + this.field2476;
                var8[var12] = (var9[var12] * this.field2482 >> 12) + this.field2476;
                var11[var12] = (var7[var12] * this.field2482 >> 12) + this.field2476;
            }
        }
        return var4;
    }
}
