import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class178 extends class115 {

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    private int field2522 = 204;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field2523 = 409;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field2530 = 81;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    private int field2529 = 4;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    private int field2532 = 1024;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    private int field2534 = 0;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    private int field2539 = 1024;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    private int field2536 = 8;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field2519 = 0;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "S")
    public static short field2537 = 1;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Ljl;")
    public static class231 field2520 = new class231(64);

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "Lqd;")
    public static class37 field2541 = new class37(4);

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "Ljava/lang/String;")
    public static String field2543 = "flash3:";

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    private int field2524;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    private int field2531;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    private int field2535;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "Lil;")
    public static class48 field2542;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "[I")
    private int[] field2518;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "[[I")
    private int[][] field2521;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "[[I")
    private int[][] field2533;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BIIII)V")
    public static final void method1154(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 <= -81) {
            if (arg4 >= class93.field1412 && ~class142.field2061 <= ~arg4) {
                int var5 = class177.method1152(class93.field1418, class254.field3857, arg1, -122);
                int var6 = class177.method1152(class93.field1418, class254.field3857, arg3, -62);
                class79.method530(arg4, var6, arg2, var5, false);
            }
            ++field2540;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V")
    public static final void method1155(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5) {
        ++field2517;
        for (int var6 = 99; var6 > 0; --var6) {
            class101.field1503[var6] = class101.field1503[var6 - 1];
            class184.field2635[var6] = class184.field2635[var6 + -1];
            class166.field2423[var6] = class166.field2423[var6 + -1];
            class286.field4549[var6] = class286.field4549[var6 + -1];
            class57.field876[var6] = class57.field876[var6 + -1];
        }
        if (arg3 != 4096) {
            method1155((String) null, (String) null, (String) null, 73, -78, 92);
        }
        class57.field884 = class213.field3063;
        class101.field1503[0] = arg5;
        ++class175.field2493;
        class57.field876[0] = arg4;
        class184.field2635[0] = arg2;
        class166.field2423[0] = arg1;
        class286.field4549[0] = arg0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)V")
    public static void method1156(boolean arg0) {
        field2543 = null;
        field2542 = null;
        if (!arg0) {
            method1157(true);
        }
        field2520 = null;
        field2541 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field2532 = arg1.method756(-29901);
                                    }
                                } else {
                                    this.field2530 = arg1.method756(arg0 ^ 29900);
                                }
                            } else {
                                this.field2534 = arg1.method756(arg0 ^ 29900);
                            }
                        } else {
                            this.field2539 = arg1.method756(-29901);
                        }
                    } else {
                        this.field2522 = arg1.method756(arg0 + -29900);
                    }
                } else {
                    this.field2523 = arg1.method756(arg0 ^ 29900);
                }
            } else {
                this.field2536 = arg1.method760(false);
            }
        } else {
            this.field2529 = arg1.method760(false);
        }
        if (arg0 != -1) {
            method1155((String) null, (String) null, (String) null, 111, 65, 3);
        }
        ++field2538;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V")
    public static final void method1157(boolean arg0) {
        if (class10.field180 != null) {
            class10.field180.method362(false);
            class10.field180 = null;
        }
        class25.method190((byte) 112);
        ++field2526;
        class211.method1345();
        for (int var1 = 0; var1 < 4; ++var1) {
            class246.field3681[var1].method583(16777216);
        }
        class146.method979(false, arg0);
        System.gc();
        class280.method1886(1000000, 2);
        class200.field2884 = false;
        if (!arg0) {
            method1157(true);
        }
        class229.field3429 = -1;
        class277.method1863(true, (byte) 25);
        class200.field2893 = 0;
        class156.field2280 = 0;
        class95.field1445 = 0;
        class113.field1615 = 0;
        class217.field3209 = false;
        for (int var2 = 0; ~class210.field3024.length < ~var2; ++var2) {
            class210.field3024[var2] = null;
        }
        class193.field2770 = 0;
        class51.field756 = 0;
        for (int var3 = 0; ~var3 > -2049; ++var3) {
            class194.field2777[var3] = null;
            class275.field4412[var3] = null;
        }
        for (int var4 = 0; ~var4 > -32769; ++var4) {
            class82.field1268[var4] = null;
        }
        for (int var5 = 0; var5 < 4; ++var5) {
            for (int var6 = 0; ~var6 > -105; ++var6) {
                for (int var7 = 0; var7 < 104; ++var7) {
                    class162.field2335[var5][var6][var7] = null;
                }
            }
        }
        class148.method987((byte) -102);
        class30.field426 = 0;
        class13.method110((byte) 65);
        class283.method1902(true, 105);
    }

    @OriginalMember(owner = "client!og", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        ++field2527;
        int[] var3 = super.field1705.method463(arg1, false);
        if (arg0 != 242152972) {
            this.method1158(false);
        }
        if (super.field1705.field1072) {
            int var4 = 0;
            int var5;
            for (var5 = class187.field2664[arg1] + this.field2534; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field2536 < ~var4 && this.field2518[var4] <= var5) {
                ++var4;
            }
            boolean var6 = ~(var4 & 1) == -1;
            int var7 = var4 + -1;
            int var8 = this.field2518[var4];
            int var9 = this.field2518[var4 + -1];
            if (~(this.field2535 + var9) > ~var5 && -this.field2535 + var8 > var5) {
                for (int var10 = 0; ~class77.field1178 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field2539 : this.field2539;
                    int var13;
                    for (var13 = class169.field2444[var10] - -(this.field2531 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field2529 < ~var11 && ~var13 <= ~this.field2533[var7][var11]) {
                        ++var11;
                    }
                    int var14 = this.field2533[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field2533[var7][var15];
                    if (~(var16 - -this.field2535) > ~var13 && ~var13 > ~(var14 - this.field2535)) {
                        var3[var10] = this.field2521[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class164.method1094(var3, 0, class77.field1178, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        this.method1158(false);
        ++field2528;
        int var2 = 12 % ((78 - arg0) / 42);
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(Z)V")
    private final void method1158(boolean arg0) {
        ++field2525;
        Random var2 = new Random((long) this.field2536);
        this.field2521 = new int[this.field2536][this.field2529];
        this.field2533 = new int[this.field2536][this.field2529 + 1];
        this.field2518 = new int[this.field2536 - -1];
        this.field2524 = 4096 / this.field2536;
        this.field2531 = 4096 / this.field2529;
        int var3 = this.field2524 / 2;
        this.field2518[0] = 0;
        int var4 = this.field2531 / 2;
        this.field2535 = this.field2530 / 2;
        if (arg0) {
            method1155((String) null, (String) null, (String) null, 25, -15, -2);
        }
        for (int var5 = 0; this.field2536 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field2524;
                int var7 = (-2048 + class259.method1734(4096, false, var2)) * this.field2522 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field2518[var5] = this.field2518[var5 + -1] + var8;
            }
            this.field2533[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2529; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field2531;
                    int var11 = (class259.method1734(4096, arg0, var2) - 2048) * this.field2523 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field2533[var5][var9] = this.field2533[var5][var9 + -1] + var12;
                }
                this.field2521[var5][var9] = this.field2532 <= 0 ? 4096 : 4096 - class259.method1734(this.field2532, false, var2);
            }
            this.field2533[var5][this.field2529] = 4096;
        }
        this.field2518[this.field2536] = 4096;
    }
}
