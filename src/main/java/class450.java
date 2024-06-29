import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class450 extends class86 {

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "[I")
    private int[] field6448 = new int[16];

    @OriginalMember(owner = "client!gj", name = "U", descriptor = "[I")
    private int[] field6467 = new int[16];

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "[I")
    public int[] field6456 = new int[16];

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "[[Lrt;")
    private class152[][] field6472 = new class152[16][128];

    @OriginalMember(owner = "client!gj", name = "X", descriptor = "[I")
    private int[] field6470 = new int[16];

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "[I")
    private int[] field6473 = new int[16];

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    private int field6459 = 256;

    @OriginalMember(owner = "client!gj", name = "lb", descriptor = "I")
    private int field6484 = 1000000;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "[I")
    private int[] field6441 = new int[16];

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "[I")
    private int[] field6462 = new int[16];

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "[I")
    private int[] field6457 = new int[16];

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "[I")
    private int[] field6458 = new int[16];

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "[I")
    private int[] field6445 = new int[16];

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "[I")
    private int[] field6465 = new int[16];

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "[I")
    public int[] field6479 = new int[16];

    @OriginalMember(owner = "client!gj", name = "qb", descriptor = "[[Lrt;")
    private class152[][] field6489 = new class152[16][128];

    @OriginalMember(owner = "client!gj", name = "W", descriptor = "[I")
    private int[] field6469 = new int[16];

    @OriginalMember(owner = "client!gj", name = "Ab", descriptor = "[I")
    private int[] field6499 = new int[16];

    @OriginalMember(owner = "client!gj", name = "zb", descriptor = "[I")
    private int[] field6498 = new int[16];

    @OriginalMember(owner = "client!gj", name = "xb", descriptor = "[I")
    public int[] field6496 = new int[16];

    @OriginalMember(owner = "client!gj", name = "kb", descriptor = "Lkk;")
    private class127 field6483 = new class127();

    @OriginalMember(owner = "client!gj", name = "Jb", descriptor = "Lqq;")
    private class334 field6508 = new class334(this);

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "Lek;")
    private class352 field6450 = new class352(128);

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "Ldq;")
    public static class493 field6442 = new class493(65, -2);

    @OriginalMember(owner = "client!gj", name = "tb", descriptor = "F")
    public static float field6492;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "I")
    public static int field6447;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "I")
    public static int field6461;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field6463;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "I")
    public static int field6466;

    @OriginalMember(owner = "client!gj", name = "V", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "I")
    public static int field6477;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    public static int field6481;

    @OriginalMember(owner = "client!gj", name = "jb", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!gj", name = "mb", descriptor = "I")
    public static int field6485;

    @OriginalMember(owner = "client!gj", name = "nb", descriptor = "I")
    public static int field6486;

    @OriginalMember(owner = "client!gj", name = "ob", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!gj", name = "pb", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!gj", name = "rb", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!gj", name = "sb", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!gj", name = "ub", descriptor = "I")
    public static int field6493;

    @OriginalMember(owner = "client!gj", name = "vb", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!gj", name = "wb", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!gj", name = "yb", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!gj", name = "Bb", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!gj", name = "Cb", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!gj", name = "Db", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!gj", name = "Eb", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!gj", name = "Fb", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!gj", name = "Kb", descriptor = "I")
    private int field6509;

    @OriginalMember(owner = "client!gj", name = "Lb", descriptor = "I")
    private int field6510;

    @OriginalMember(owner = "client!gj", name = "Mb", descriptor = "I")
    private int field6511;

    @OriginalMember(owner = "client!gj", name = "Hb", descriptor = "J")
    private long field6506;

    @OriginalMember(owner = "client!gj", name = "Ib", descriptor = "J")
    private long field6507;

    @OriginalMember(owner = "client!gj", name = "Ob", descriptor = "Lhr;")
    private class366 field6513;

    @OriginalMember(owner = "client!gj", name = "Gb", descriptor = "Z")
    private boolean field6505;

    @OriginalMember(owner = "client!gj", name = "Nb", descriptor = "Z")
    private boolean field6512;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "[[B")
    public static byte[][] field6476;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2649(int arg0, int arg1) {
        field6466++;
        if (class301.field3876[arg0]) {
            return true;
        } else if (class293.field3754.method476(arg0, 10859)) {
            int var2 = class293.field3754.method469(arg1 + 9140, arg0);
            if (var2 == 0) {
                class301.field3876[arg0] = true;
                return true;
            }
            if (class293.field3725[arg0] == null) {
                class293.field3725[arg0] = new class523[var2];
            }
            if (arg1 != 21182) {
                return true;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class293.field3725[arg0][var3] == null) {
                    byte[] var4 = class293.field3754.method481(arg0, var3, -113);
                    if (var4 != null) {
                        class523 var5 = class293.field3725[arg0][var3] = new class523();
                        var5.field7723 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method3111(new class463(var4), -66);
                    }
                }
            }
            class301.field3876[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)V", line = 65)
    public final synchronized void method2650(byte arg0, int arg1, int arg2) {
        field6434++;
        int var4 = 45 % ((arg0 + 41) / 62);
        this.method2683(-66, arg2, arg1);
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "()Lhu;", line = 88)
    public final synchronized class86 method692() {
        field6493++;
        return null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljj;Lqn;Lhr;II)Z", line = 96)
    public final synchronized boolean method2651(class76 arg0, class47 arg1, class366 arg2, int arg3, int arg4) {
        arg2.method2100();
        field6461++;
        boolean var6 = true;
        int[] var7 = null;
        if (~arg3 < arg4) {
            var7 = new int[] { arg3 };
        }
        for (class443 var8 = (class443) arg2.field4753.method2021(-118); var8 != null; var8 = (class443) arg2.field4753.method2017(arg4 ^ 0x31)) {
            int var9 = (int) var8.field5043;
            class353 var10 = (class353) this.field6450.method2022(-1, (long) var9);
            if (var10 == null) {
                var10 = class423.method2482(var9, 60, arg1);
                if (var10 == null) {
                    var6 = false;
                    continue;
                }
                this.field6450.method2019((byte) -111, var10, (long) var9);
            }
            if (!var10.method2027(var7, var8.field6356, (byte) 86, arg0)) {
                var6 = false;
            }
        }
        if (var6) {
            arg2.method2102();
        }
        return var6;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZI)V", line = 147)
    private final synchronized void method2652(boolean arg0, int arg1) {
        field6440++;
        this.field6483.method895();
        this.field6513 = null;
        if (arg1 == 16) {
            this.method2676(arg1 + 7172, arg0);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)V", line = 160)
    private final void method2653(int arg0, byte arg1) {
        field6501++;
        if (arg1 >= -4) {
            this.method2667(null, (byte) 105);
        }
        if (arg0 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method2653(var3, (byte) -18);
            }
            return;
        }
        this.field6465[arg0] = 12800;
        this.field6467[arg0] = 8192;
        this.field6445[arg0] = 16383;
        this.field6498[arg0] = 8192;
        this.field6470[arg0] = 0;
        this.field6448[arg0] = 8192;
        this.method2659(arg0, 0);
        this.method2677(arg0, 119);
        this.field6479[arg0] = 0;
        this.field6469[arg0] = 32767;
        this.field6473[arg0] = 256;
        this.field6456[arg0] = 0;
        this.method2662(arg0, (byte) -15, 8192);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrt;I)I", line = 199)
    private final int method2654(class152 arg0, int arg1) {
        field6495++;
        int var3 = this.field6467[arg0.field1906];
        if (arg1 == 128) {
            return var3 >= 8192 ? 16384 - ((128 - arg0.field1909) * (16384 - var3) + 32 >> 6) : arg0.field1909 * var3 + 32 >> 6;
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(Lrt;I)I", line = 217)
    private final int method2655(class152 arg0, int arg1) {
        field6497++;
        if (this.field6499[arg0.field1906] == 0) {
            return 0;
        }
        if (arg1 != 1171951848) {
            this.method2677(2, 116);
        }
        class186 var3 = arg0.field1914;
        int var4 = this.field6465[arg0.field1906] * this.field6445[arg0.field1906] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg0.field1916 * var5 + 16384 >> 15;
        int var7 = this.field6459 * var6 + 128 >> 8;
        int var8 = this.field6499[arg0.field1906] * var7 + 128 >> 8;
        if (var3.field2425 > 0) {
            var8 = (int) ((double) var8 * Math.pow(0.5D, (double) arg0.field1900 * 1.953125E-5D * (double) var3.field2425) + 0.5D);
        }
        if (var3.field2432 != null) {
            int var9 = arg0.field1903;
            int var10 = var3.field2432[arg0.field1905 + 1];
            if (var3.field2432.length - 2 > arg0.field1905) {
                int var11 = (var3.field2432[arg0.field1905] & 0xFF) << 8;
                int var12 = var3.field2432[arg0.field1905 + 2] & 0xFF << 8;
                var10 += (var3.field2432[arg0.field1905 + 3] - var10) * (var9 - var11) / (var12 - var11);
            }
            var8 = var8 * var10 + 32 >> 6;
        }
        if (arg0.field1904 > 0 && var3.field2433 != null) {
            int var13 = arg0.field1904;
            int var14 = var3.field2433[arg0.field1899 + 1];
            if (arg0.field1899 < var3.field2433.length - 2) {
                int var15 = var3.field2433[arg0.field1899] & 0xFF << 8;
                int var16 = var3.field2433[arg0.field1899 + 2] & 0xFF << 8;
                var14 += (var13 - var15) * (var3.field2433[arg0.field1899 + 3] - var14) / (var16 - var15);
            }
            var8 = var8 * var14 + 32 >> 6;
        }
        return var8;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)V", line = 285)
    private final void method2656(byte arg0, int arg1) {
        class152 var3 = (class152) this.field6508.field4219.method153(0);
        if (arg0 < 86) {
            field6476 = null;
        }
        while (var3 != null) {
            if ((arg1 < 0 || var3.field1906 == arg1) && var3.field1904 < 0) {
                this.field6472[var3.field1906][var3.field1918] = null;
                var3.field1904 = 0;
            }
            var3 = (class152) this.field6508.field4219.method161(-53);
        }
        field6446++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BIII)V", line = 313)
    private final void method2657(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 == 71) {
            field6494++;
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V", line = 324)
    public static void method2658(int arg0) {
        field6442 = null;
        field6476 = null;
        if (arg0 != -2103) {
            field6452 = 22;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(II)V", line = 337)
    private final void method2659(int arg0, int arg1) {
        if ((this.field6479[arg0] & 0x2) != 0) {
            for (class152 var3 = (class152) this.field6508.field4219.method153(0); var3 != null; var3 = (class152) this.field6508.field4219.method161(-85)) {
                if (var3.field1906 == arg0 && this.field6472[arg0][var3.field1918] == null && var3.field1904 < 0) {
                    var3.field1904 = 0;
                }
            }
        }
        field6502++;
        if (arg1 != 0) {
            field6492 = 0.63013756F;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 1636)
    public class450() {
        this.method2679((byte) -58, 256, -1);
        this.method2676(7188, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V", line = 372)
    private final void method2660(int arg0, int arg1, int arg2) {
        if (arg2 != 128) {
            this.method2651(null, null, null, 15, 89);
        }
        if (this.field6457[arg0] != arg1) {
            this.field6457[arg0] = arg1;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field6489[arg0][var4] = null;
            }
        }
        field6481++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V", line = 395)
    private final void method2661(int arg0, byte arg1, int arg2) {
        field6453++;
        if (arg1 != -1) {
            this.field6457 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IBI)V", line = 409)
    private final void method2662(int arg0, byte arg1, int arg2) {
        this.field6462[arg0] = arg2;
        field6439++;
        if (arg1 != -15) {
            this.field6457 = null;
        }
        this.field6496[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(ZI)V", line = 424)
    private final void method2663(boolean arg0, int arg1) {
        field6503++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = (arg1 & 0x7FBF) >> 8;
            int var6 = (arg1 & 0x7FE9D6) >> 16;
            this.method2671(var4, -126, var5, var6);
        } else if (!arg0) {
            if (var3 == 144) {
                int var7 = arg1 & 0xF;
                int var8 = arg1 >> 8 & 0x7F;
                int var9 = arg1 >> 16 & 0x7F;
                if (var9 <= 0) {
                    this.method2671(var7, -18, var8, 64);
                } else {
                    this.method2672(var7, -17341, var9, var8);
                }
            } else if (var3 == 160) {
                int var10 = arg1 & 0xF;
                int var11 = arg1 >> 8 & 0x7F;
                int var12 = (arg1 & 0x7FD253) >> 16;
                this.method2657((byte) 71, var11, var12, var10);
            } else if (var3 == 176) {
                int var13 = arg1 & 0xF;
                int var14 = arg1 >> 8 & 0x7F;
                int var15 = arg1 >> 16 & 0x7F;
                if (var14 == 0) {
                    this.field6458[var13] = class378.method2145(this.field6458[var13], -2080769) + (var15 << 14);
                }
                if (var14 == 32) {
                    this.field6458[var13] = (var15 << 7) + class378.method2145(-16257, this.field6458[var13]);
                }
                if (var14 == 1) {
                    this.field6470[var13] = class378.method2145(this.field6470[var13], -16257) + (var15 << 7);
                }
                if (var14 == 33) {
                    this.field6470[var13] = var15 + class378.method2145(-128, this.field6470[var13]);
                }
                if (var14 == 5) {
                    this.field6448[var13] = class378.method2145(-16257, this.field6448[var13]) + (var15 << 7);
                }
                if (var14 == 37) {
                    this.field6448[var13] = var15 + class378.method2145(this.field6448[var13], -128);
                }
                if (var14 == 7) {
                    this.field6465[var13] = class378.method2145(-16257, this.field6465[var13]) + (var15 << 7);
                }
                if (var14 == 39) {
                    this.field6465[var13] = class378.method2145(this.field6465[var13], -128) + var15;
                }
                if (var14 == 10) {
                    this.field6467[var13] = class378.method2145(this.field6467[var13], -16257) + (var15 << 7);
                }
                if (var14 == 42) {
                    this.field6467[var13] = var15 + class378.method2145(-128, this.field6467[var13]);
                }
                if (var14 == 11) {
                    this.field6445[var13] = (var15 << 7) + class378.method2145(-16257, this.field6445[var13]);
                }
                if (var14 == 43) {
                    this.field6445[var13] = class378.method2145(this.field6445[var13], -128) + var15;
                }
                if (var14 == 64) {
                    if (var15 < 64) {
                        this.field6479[var13] = class378.method2145(this.field6479[var13], -2);
                    } else {
                        this.field6479[var13] = class215.method1323(this.field6479[var13], 1);
                    }
                }
                if (var14 == 65) {
                    if (var15 < 64) {
                        this.method2659(var13, 0);
                        this.field6479[var13] = class378.method2145(this.field6479[var13], -3);
                    } else {
                        this.field6479[var13] = class215.method1323(this.field6479[var13], 2);
                    }
                }
                if (var14 == 99) {
                    this.field6469[var13] = class378.method2145(127, this.field6469[var13]) + (var15 << 7);
                }
                if (var14 == 98) {
                    this.field6469[var13] = var15 + class378.method2145(this.field6469[var13], 16256);
                }
                if (var14 == 101) {
                    this.field6469[var13] = (var15 << 7) + class378.method2145(this.field6469[var13], 127) + 16384;
                }
                if (var14 == 100) {
                    this.field6469[var13] = var15 + class378.method2145(16256, this.field6469[var13]) + 16384;
                }
                if (var14 == 120) {
                    this.method2674(var13, (byte) -72);
                }
                if (var14 == 121) {
                    this.method2653(var13, (byte) -38);
                }
                if (var14 == 123) {
                    this.method2656((byte) 123, var13);
                }
                if (var14 == 6) {
                    int var16 = this.field6469[var13];
                    if (var16 == 16384) {
                        this.field6473[var13] = class378.method2145(-16257, this.field6473[var13]) + (var15 << 7);
                    }
                }
                if (var14 == 38) {
                    int var17 = this.field6469[var13];
                    if (var17 == 16384) {
                        this.field6473[var13] = class378.method2145(this.field6473[var13], -128) + var15;
                    }
                }
                if (var14 == 16) {
                    this.field6456[var13] = class378.method2145(-16257, this.field6456[var13]) + (var15 << 7);
                }
                if (var14 == 48) {
                    this.field6456[var13] = var15 + class378.method2145(-128, this.field6456[var13]);
                }
                if (var14 == 81) {
                    if (var15 >= 64) {
                        this.field6479[var13] = class215.method1323(this.field6479[var13], 4);
                    } else {
                        this.method2677(var13, 114);
                        this.field6479[var13] = class378.method2145(this.field6479[var13], -5);
                    }
                }
                if (var14 == 17) {
                    this.method2662(var13, (byte) -15, (var15 << 7) + (this.field6462[var13] & 0xFFFFC07F));
                }
                if (var14 == 49) {
                    this.method2662(var13, (byte) -15, (this.field6462[var13] & 0xFFFFFF80) + var15);
                }
            } else if (var3 == 192) {
                int var18 = arg1 & 0xF;
                int var19 = (arg1 & 0x7FE4) >> 8;
                this.method2660(var18, this.field6458[var18] + var19, 128);
            } else if (var3 == 208) {
                int var20 = arg1 & 0xF;
                int var21 = arg1 >> 8 & 0x7F;
                this.method2661(var20, (byte) -1, var21);
            } else if (var3 == 224) {
                int var22 = arg1 & 0xF;
                int var23 = ((arg1 & 0x7F4E) >> 8) + (arg1 >> 9 & 0x3F80);
                this.method2684(false, var23, var22);
            } else {
                int var24 = arg1 & 0xFF;
                if (var24 == 255) {
                    this.method2676(7188, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lhu;", line = 660)
    public final synchronized class86 method689() {
        field6443++;
        return this.field6508;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BI)V", line = 676)
    public final synchronized void method2664(byte arg0, int arg1) {
        this.field6459 = arg1;
        field6477++;
        if (arg0 != -78) {
            this.method2668(-27);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrt;[IIII)Z", line = 696)
    public final boolean method2665(class152 arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field6485++;
        arg0.field1908 = class94.field1140 / 100;
        if (arg0.field1904 >= 0 && (arg0.field1913 == null || arg0.field1913.method2244())) {
            arg0.method996(-11658);
            arg0.method2165(16225);
            if (arg0.field1902 > 0 && this.field6489[arg0.field1906][arg0.field1902] == arg0) {
                this.field6489[arg0.field1906][arg0.field1902] = null;
            }
            return true;
        }
        int var6 = arg0.field1907;
        if (var6 > 0) {
            int var7 = var6 - (int) (Math.pow(2.0D, (double) this.field6448[arg0.field1906] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var7 < 0) {
                var7 = 0;
            }
            arg0.field1907 = var7;
        }
        arg0.field1913.method2231(this.method2667(arg0, (byte) 51));
        if (arg3 > -61) {
            this.method2657((byte) -89, 0, 59, -110);
        }
        class186 var8 = arg0.field1914;
        boolean var9 = false;
        arg0.field1901++;
        arg0.field1919 += var8.field2430;
        double var10 = (double) ((arg0.field1918 - 60 << 8) + (arg0.field1911 * arg0.field1907 >> 12)) * 5.086263020833333E-6D;
        if (var8.field2425 > 0) {
            if (var8.field2424 > 0) {
                arg0.field1900 += (int) (Math.pow(2.0D, (double) var8.field2424 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field1900 += 128;
            }
            if ((arg0.field1900 * var8.field2425) >= 819200) {
                var9 = true;
            }
        }
        if (var8.field2432 != null) {
            if (var8.field2436 > 0) {
                arg0.field1903 += (int) (Math.pow(2.0D, (double) var8.field2436 * var10) * 128.0D + 0.5D);
            } else {
                arg0.field1903 += 128;
            }
            while (var8.field2432.length - 2 > arg0.field1905 && (var8.field2432[arg0.field1905 + 2] & 0xFF << 8) < arg0.field1903) {
                arg0.field1905 += 2;
            }
            if ((var8.field2432.length - 2) == arg0.field1905 && var8.field2432[arg0.field1905 + 1] == 0) {
                var9 = true;
            }
        }
        if (arg0.field1904 >= 0 && var8.field2433 != null && (this.field6479[arg0.field1906] & 0x1) == 0 && (arg0.field1902 < 0 || this.field6489[arg0.field1906][arg0.field1902] != arg0)) {
            if (var8.field2435 <= 0) {
                arg0.field1904 += 128;
            } else {
                arg0.field1904 += (int) (Math.pow(2.0D, (double) var8.field2435 * var10) * 128.0D + 0.5D);
            }
            while (var8.field2433.length - 2 > arg0.field1899 && ((var8.field2433[arg0.field1899 + 2] & 0xFF) << 8) < arg0.field1904) {
                arg0.field1899 += 2;
            }
            if ((var8.field2433.length - 2) == arg0.field1899) {
                var9 = true;
            }
        }
        if (!var9) {
            arg0.field1913.method2230(arg0.field1908, this.method2655(arg0, 1171951848), this.method2654(arg0, 128));
            return false;
        }
        arg0.field1913.method2239(arg0.field1908);
        if (arg1 == null) {
            arg0.field1913.method688(arg2);
        } else {
            arg0.field1913.method693(arg1, arg4, arg2);
        }
        if (arg0.field1913.method2257()) {
            this.field6508.field4223.method2530(arg0.field1913);
        }
        arg0.method996(-11658);
        if (arg0.field1904 >= 0) {
            arg0.method2165(16225);
            if (arg0.field1902 > 0 && this.field6489[arg0.field1906][arg0.field1902] == arg0) {
                this.field6489[arg0.field1906][arg0.field1902] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZLhr;)V", line = 823)
    public final synchronized void method2666(int arg0, boolean arg1, class366 arg2) {
        this.method2685((byte) 84, arg1, arg2, true);
        int var4 = -111 % ((arg0 + 9) / 59);
        field6480++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lrt;B)I", line = 834)
    private final int method2667(class152 arg0, byte arg1) {
        field6487++;
        int var3 = (arg0.field1911 * arg0.field1907 >> 12) + arg0.field1921;
        int var4 = ((this.field6498[arg0.field1906] - 8192) * this.field6473[arg0.field1906] >> 12) + var3;
        class186 var5 = arg0.field1914;
        if (var5.field2430 > 0 && (var5.field2437 > 0 || this.field6470[arg0.field1906] > 0)) {
            int var6 = var5.field2437 << 2;
            int var7 = var5.field2439 << 1;
            if (var7 > arg0.field1901) {
                var6 = arg0.field1901 * var6 / var7;
            }
            int var8 = (this.field6470[arg0.field1906] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field1919 & 0x1FF) * 0.01227184630308513D);
            var4 += (int) ((double) var8 * var9);
        }
        if (arg1 != 51) {
            this.field6465 = null;
        }
        int var11 = (int) ((double) (arg0.field1910.field3901 * 256) * Math.pow(2.0D, (double) var4 * 3.255208333333333E-4D) / (double) class94.field1140 + 0.5D);
        return var11 < 1 ? 1 : var11;
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V", line = 868)
    public final synchronized void method2668(int arg0) {
        for (class353 var2 = (class353) this.field6450.method2021(117); var2 != null; var2 = (class353) this.field6450.method2017(-43)) {
            var2.method2028(true);
        }
        field6500++;
        if (arg0 < 82) {
            this.method2667(null, (byte) -7);
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 885)
    public static final void method2669(int arg0) {
        field6474++;
        class210 var1 = null;
        try {
            if (arg0 != -12308) {
                return;
            }
            class121 var2 = class219.field2794.method2882("2", true, (byte) -48);
            while (var2.field1628 == 0) {
                class199.method1251(1L, (byte) 126);
            }
            if (var2.field1628 == 1) {
                var1 = (class210) var2.field1627;
                byte[] var3 = new byte[(int) var1.method1306(0)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method1305(0, var4, var3, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class184.method1162(new class463(var3), (byte) -120);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method1303((byte) -66);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([III)V", line = 936)
    public final synchronized void method693(int[] arg0, int arg1, int arg2) {
        field6504++;
        if (this.field6483.method890()) {
            int var4 = this.field6483.field1695 * this.field6484 / class94.field1140;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field6506;
                if ((this.field6507 - var5) >= 0L) {
                    this.field6506 = var5;
                    break;
                }
                int var7 = (int) ((this.field6507 + (long) var4 - this.field6506 - 1L) / (long) var4);
                this.field6506 += (long) var4 * (long) var7;
                this.field6508.method693(arg0, arg1, var7);
                arg2 -= var7;
                arg1 += var7;
                this.method2675(124);
            } while (this.field6483.method890());
        }
        this.field6508.method693(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(Lrt;I)Z", line = 974)
    public final boolean method2670(class152 arg0, int arg1) {
        if (arg1 != -1231185848) {
            return false;
        }
        field6460++;
        if (arg0.field1913 != null) {
            return false;
        }
        if (arg0.field1904 >= 0) {
            arg0.method2165(16225);
            if (arg0.field1902 > 0 && this.field6489[arg0.field1906][arg0.field1902] == arg0) {
                this.field6489[arg0.field1906][arg0.field1902] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V", line = 1004)
    private final void method2671(int arg0, int arg1, int arg2, int arg3) {
        field6464++;
        class152 var5 = this.field6472[arg0][arg2];
        int var6 = -127 / ((-arg1 - 72) / 54);
        if (var5 == null) {
            return;
        }
        this.field6472[arg0][arg2] = null;
        if ((this.field6479[arg0] & 0x2) == 0) {
            var5.field1904 = 0;
            return;
        }
        for (class152 var7 = (class152) this.field6508.field4219.method153(0); var7 != null; var7 = (class152) this.field6508.field4219.method161(-43)) {
            if (var5.field1906 == var7.field1906 && var7.field1904 < 0 && var5 != var7) {
                var5.field1904 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IIII)V", line = 1043)
    private final void method2672(int arg0, int arg1, int arg2, int arg3) {
        this.method2671(arg0, 35, arg3, 64);
        field6468++;
        if ((this.field6479[arg0] & 0x2) != 0) {
            for (class152 var5 = (class152) this.field6508.field4219.method157(arg1 ^ 0x43C1); var5 != null; var5 = (class152) this.field6508.field4219.method165(-61)) {
                if (var5.field1906 == arg0 && var5.field1904 < 0) {
                    this.field6472[arg0][var5.field1918] = null;
                    this.field6472[arg0][arg3] = var5;
                    int var6 = (var5.field1911 * var5.field1907 >> 12) + var5.field1921;
                    var5.field1921 += arg3 - var5.field1918 << 8;
                    var5.field1907 = 4096;
                    var5.field1918 = arg3;
                    var5.field1911 = var6 - var5.field1921;
                    return;
                }
            }
        }
        class353 var7 = (class353) this.field6450.method2022(-1, (long) this.field6457[arg0]);
        if (var7 == null) {
            return;
        }
        class305 var8 = var7.field4539[arg3];
        if (var8 == null) {
            return;
        }
        class152 var9 = new class152();
        var9.field1906 = arg0;
        if (arg1 != -17341) {
            this.method2663(false, -46);
        }
        var9.field1912 = var7;
        var9.field1910 = var8;
        var9.field1914 = var7.field4533[arg3];
        var9.field1902 = var7.field4536[arg3];
        var9.field1918 = arg3;
        var9.field1916 = var7.field4531[arg3] * var7.field4530 * arg2 * arg2 + 1024 >> 11;
        var9.field1909 = var7.field4537[arg3] & 0xFF;
        var9.field1921 = (arg3 << 8) - (var7.field4529[arg3] & 0x7FFF);
        var9.field1900 = 0;
        var9.field1905 = 0;
        var9.field1903 = 0;
        var9.field1899 = 0;
        var9.field1904 = -1;
        if (this.field6456[arg0] == 0) {
            var9.field1913 = class393.method2245(var8, this.method2667(var9, (byte) 51), this.method2655(var9, arg1 ^ 0xBA252CAB), this.method2654(var9, arg1 + 17469));
        } else {
            var9.field1913 = class393.method2245(var8, this.method2667(var9, (byte) 51), 0, this.method2654(var9, arg1 + 17469));
            this.method2680(var7.field4529[arg3] < 0, (byte) 112, var9);
        }
        if (var7.field4529[arg3] < 0) {
            var9.field1913.method2246(-1);
        }
        if (var9.field1902 >= 0) {
            class152 var10 = this.field6489[arg0][var9.field1902];
            if (var10 != null && var10.field1904 < 0) {
                this.field6472[arg0][var10.field1918] = null;
                var10.field1904 = 0;
            }
            this.field6489[arg0][var9.field1902] = var9;
        }
        this.field6508.field4219.method163(var9, 0);
        this.field6472[arg0][arg3] = var9;
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)V", line = 1144)
    public final synchronized void method2673(int arg0) {
        for (class353 var2 = (class353) this.field6450.method2021(86); var2 != null; var2 = (class353) this.field6450.method2017(-59)) {
            var2.method2165(16225);
        }
        if (arg0 != 22915) {
            this.field6450 = null;
        }
        field6436++;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(IB)V", line = 1161)
    private final void method2674(int arg0, byte arg1) {
        field6491++;
        if (arg1 >= -36) {
            this.field6467 = null;
        }
        for (class152 var3 = (class152) this.field6508.field4219.method153(0); var3 != null; var3 = (class152) this.field6508.field4219.method161(-13)) {
            if (arg0 < 0 || var3.field1906 == arg0) {
                if (var3.field1913 != null) {
                    var3.field1913.method2239(class94.field1140 / 100);
                    if (var3.field1913.method2257()) {
                        this.field6508.field4223.method2530(var3.field1913);
                    }
                    var3.method996(-11658);
                }
                if (var3.field1904 < 0) {
                    this.field6472[var3.field1906][var3.field1918] = null;
                }
                var3.method2165(16225);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V", line = 1198)
    private final void method2675(int arg0) {
        field6490++;
        int var2 = this.field6509;
        int var3 = this.field6510;
        long var4 = this.field6507;
        if (this.field6513 != null && this.field6511 == var3) {
            this.method2685((byte) 84, this.field6505, this.field6513, this.field6512);
            this.method2675(121);
            return;
        }
        while (this.field6510 == var3) {
            while (this.field6483.field1694[var2] == var3) {
                this.field6483.method901(var2);
                int var6 = this.field6483.method899(var2);
                if (var6 == 1) {
                    this.field6483.method897();
                    this.field6483.method889(var2);
                    if (this.field6483.method896()) {
                        if (this.field6513 != null) {
                            this.method2666(-86, this.field6505, this.field6513);
                            this.method2675(116);
                            return;
                        }
                        if (!this.field6505 || var3 == 0) {
                            this.method2676(7188, true);
                            this.field6483.method895();
                            return;
                        }
                        this.field6483.method891(var4);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method2663(false, var6);
                }
                this.field6483.method904(var2);
                this.field6483.method889(var2);
            }
            var2 = this.field6483.method900();
            var3 = this.field6483.field1694[var2];
            var4 = this.field6483.method893(var3);
        }
        this.field6507 = var4;
        this.field6509 = var2;
        this.field6510 = var3;
        if (this.field6513 != null && var3 > this.field6511) {
            this.field6510 = this.field6511;
            this.field6509 = -1;
            this.field6507 = this.field6483.method893(this.field6510);
        }
        if (arg0 <= 91) {
            this.method2676(123, false);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V", line = 1285)
    private final void method2676(int arg0, boolean arg1) {
        if (arg1) {
            this.method2674(-1, (byte) -66);
        } else {
            this.method2656((byte) 112, -1);
        }
        field6463++;
        this.method2653(-1, (byte) -76);
        if (arg0 != 7188) {
            this.method689();
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field6457[var3] = this.field6441[var3];
        }
        for (int var4 = 0; var4 < 16; var4++) {
            this.field6458[var4] = class378.method2145(-128, this.field6441[var4]);
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(II)V", line = 1330)
    private final void method2677(int arg0, int arg1) {
        if (arg1 <= 112) {
            return;
        }
        field6435++;
        if ((this.field6479[arg0] & 0x4) == 0) {
            return;
        }
        for (class152 var3 = (class152) this.field6508.field4219.method153(0); var3 != null; var3 = (class152) this.field6508.field4219.method161(-42)) {
            if (var3.field1906 == arg0) {
                var3.field1917 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z", line = 1355)
    public final synchronized boolean method2678(byte arg0) {
        field6449++;
        int var2 = -116 % ((arg0 - 36) / 43);
        return this.field6483.method890();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 1366)
    public final synchronized void method688(int arg0) {
        field6438++;
        if (this.field6483.method890()) {
            int var2 = this.field6483.field1695 * this.field6484 / class94.field1140;
            do {
                long var3 = (long) arg0 * (long) var2 + this.field6506;
                if ((this.field6507 - var3) >= 0L) {
                    this.field6506 = var3;
                    break;
                }
                int var5 = (int) (((long) var2 + this.field6507 - this.field6506 - 1L) / (long) var2);
                this.field6506 += (long) var2 * (long) var5;
                this.field6508.method688(var5);
                arg0 -= var5;
                this.method2675(99);
            } while (this.field6483.method890());
        }
        this.field6508.method688(arg0);
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "()I", line = 1402)
    public final synchronized int method691() {
        field6488++;
        return 0;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(BII)V", line = 1413)
    private final synchronized void method2679(byte arg0, int arg1, int arg2) {
        field6486++;
        if (arg2 >= 0) {
            this.field6499[arg2] = arg1;
        } else {
            for (int var4 = 0; var4 < 16; var4++) {
                this.field6499[var4] = arg1;
            }
        }
        if (arg0 != -58) {
            this.method2657((byte) -90, -44, -21, 69);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZBLrt;)V", line = 1440)
    public final void method2680(boolean arg0, byte arg1, class152 arg2) {
        field6447++;
        int var4 = arg2.field1910.field3899.length;
        int var6;
        if (arg0 && arg2.field1910.field3902) {
            int var5 = var4 + var4 - arg2.field1910.field3898;
            var6 = (int) ((long) this.field6456[arg2.field1906] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var6 >= var7) {
                arg2.field1913.method2247(true);
                var6 = var7 + var7 - var6 - 1;
            }
        } else {
            var6 = (int) ((long) this.field6456[arg2.field1906] * (long) var4 >> 6);
        }
        if (arg1 <= 62) {
            this.field6505 = true;
        }
        arg2.field1913.method2235(var6);
    }

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "(I)I", line = 1474)
    public final int method2681(int arg0) {
        field6471++;
        if (arg0 != 42) {
            this.field6508 = null;
        }
        return this.field6459;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lqn;IBI)Llf;", line = 1487)
    public static final class159 method2682(class47 arg0, int arg1, byte arg2, int arg3) {
        field6451++;
        class463 var4 = new class463(arg0.method481(arg3, arg1, -67));
        class159 var5 = new class159(arg1, var4.method2768((byte) 68), var4.method2768((byte) 90), var4.method2727(-86), var4.method2727(-102), var4.method2737(false) == 1, var4.method2737(false), var4.method2737(false));
        int var6 = -77 % ((33 - arg2) / 51);
        int var7 = var4.method2737(false);
        for (int var8 = 0; var8 < var7; var8++) {
            var5.field2024.method163(new class46(var4.method2737(false), var4.method2758((byte) 80), var4.method2758((byte) 91), var4.method2758((byte) 78), var4.method2758((byte) 75), var4.method2758((byte) 98), var4.method2758((byte) 107), var4.method2758((byte) 123), var4.method2758((byte) 83)), 0);
        }
        var5.method1029(-126);
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V", line = 1520)
    private final void method2683(int arg0, int arg1, int arg2) {
        this.field6441[arg1] = arg2;
        field6444++;
        this.field6458[arg1] = class378.method2145(arg2, -128);
        this.method2660(arg1, arg2, 128);
        if (arg0 > -40) {
            this.field6441 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ZII)V", line = 1544)
    private final void method2684(boolean arg0, int arg1, int arg2) {
        field6454++;
        this.field6498[arg2] = arg1;
        if (arg0) {
            this.method688(-126);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZLhr;Z)V", line = 1566)
    private final synchronized void method2685(byte arg0, boolean arg1, class366 arg2, boolean arg3) {
        this.method2652(arg3, arg0 ^ 0x44);
        field6482++;
        this.field6483.method892(arg2.field4752);
        this.field6506 = 0L;
        this.field6505 = arg1;
        int var5 = this.field6483.method894();
        for (int var6 = 0; var6 < var5; var6++) {
            this.field6483.method901(var6);
            this.field6483.method904(var6);
            this.field6483.method889(var6);
        }
        this.field6509 = this.field6483.method900();
        this.field6510 = this.field6483.field1694[this.field6509];
        if (arg0 != 84) {
            this.field6512 = false;
        }
        this.field6507 = this.field6483.method893(this.field6510);
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 1611)
    public final synchronized void method2686(byte arg0) {
        field6475++;
        int var2 = 88 / ((arg0 - 16) / 40);
        this.method2652(true, 16);
    }
}
