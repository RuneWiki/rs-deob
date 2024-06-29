import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class78 extends class33 {

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    private int field1516 = 1024;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    private int field1511 = 204;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    private int field1519 = 409;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "I")
    private int field1520 = 8;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    private int field1505 = 1024;

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
    private int field1530 = 0;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    private int field1523 = 4;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "I")
    private int field1532 = 81;

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "Lrd;")
    private static class173 field1510 = class133.method843("Login server offline)3", 101);

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "Lrd;")
    public static class173 field1512 = field1510;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "[Lrd;")
    public static class173[] field1526 = new class173[1000];

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "[[I")
    public static int[][] field1531 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field1517 = 0;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "Lrd;")
    public static class173 field1524 = class133.method843(" (X", 68);

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "I")
    private int field1508;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field1515;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    private int field1518;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    private int field1525;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "[I")
    private int[] field1522;

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "[[I")
    private int[][] field1504;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "[[I")
    private int[][] field1513;

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)V")
    public static void method472(int arg0) {
        field1512 = null;
        field1510 = null;
        field1526 = null;
        if (arg0 != 3) {
            field1510 = null;
        }
        field1524 = null;
        field1531 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1521;
        int var3 = 0 % ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -6);
        if (super.field718.field1615) {
            int var5 = 0;
            int var6;
            for (var6 = class105.field1937[arg0] + this.field1530; var6 < 0; var6 += 4096) {
            }
            while (~var6 < -4097) {
                var6 -= 4096;
            }
            while (this.field1520 > var5 && var6 >= this.field1522[var5]) {
                ++var5;
            }
            float var7 = (float) this.field1522[var5 - 1];
            float var8 = (float) this.field1522[var5];
            if ((float) var6 > (float) this.field1525 + var7 && var8 - (float) this.field1525 > (float) var6) {
                for (int var9 = 0; ~var9 > ~class117.field2173; ++var9) {
                    int var10 = ~(var5 % 2) == -1 ? this.field1516 : -this.field1516;
                    int var11 = 0;
                    int var12;
                    for (var12 = (this.field1518 * var10 >> 12) + class138.field2585[var9]; ~var12 > -1; var12 += 4096) {
                    }
                    while (~var12 < -4097) {
                        var12 -= 4096;
                    }
                    while (this.field1523 > var11 && var12 >= this.field1513[var5 - 1][var11]) {
                        ++var11;
                    }
                    float var13 = (float) this.field1513[var5 + -1][var11];
                    float var14 = (float) this.field1513[var5 + -1][var11 + -1];
                    if ((float) var12 > (float) this.field1525 + var14 && (float) var12 < var13 - (float) this.field1525) {
                        var4[var9] = this.field1504[var5 + -1][var11 + -1];
                    } else {
                        var4[var9] = 0;
                    }
                }
            } else {
                class85.method554(var4, 0, class117.field2173, 0);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 == -8) {
                                        this.field1505 = arg2.method755((byte) -75);
                                    }
                                } else {
                                    this.field1532 = arg2.method755((byte) -112);
                                }
                            } else {
                                this.field1530 = arg2.method755((byte) -50);
                            }
                        } else {
                            this.field1516 = arg2.method755((byte) -83);
                        }
                    } else {
                        this.field1511 = arg2.method755((byte) -52);
                    }
                } else {
                    this.field1519 = arg2.method755((byte) -37);
                }
            } else {
                this.field1520 = arg2.method751((byte) -36);
            }
        } else {
            this.field1523 = arg2.method751((byte) 88);
        }
        ++field1506;
        if (arg1 > -99) {
            this.field1518 = 9;
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    private final void method473(byte arg0) {
        ++field1514;
        Random var2 = new Random((long) this.field1520);
        this.field1522 = new int[this.field1520 + 1];
        this.field1513 = new int[this.field1520][this.field1523 + 1];
        this.field1504 = new int[this.field1520][this.field1523];
        this.field1522[0] = 0;
        this.field1508 = 4096 / this.field1520;
        this.field1525 = this.field1532 / 2;
        int var3 = this.field1508 / 2;
        this.field1518 = 4096 / this.field1523;
        int var4 = this.field1518 / 2;
        int var5 = 0;
        if (arg0 >= 14) {
            while (this.field1520 > var5) {
                if (~var5 < -1) {
                    int var6 = this.field1508;
                    int var7 = (class159.method1044(4096, (byte) 121, var2) - 2048) * this.field1511 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field1522[var5] = this.field1522[var5 + -1] - -var8;
                }
                this.field1513[var5][0] = 0;
                for (int var9 = 0; ~this.field1523 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1518;
                        int var11 = (-2048 + class159.method1044(4096, (byte) 110, var2)) * this.field1519 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field1513[var5][var9] = this.field1513[var5][var9 + -1] + var12;
                    }
                    this.field1504[var5][var9] = ~this.field1505 >= -1 ? 4096 : -class159.method1044(this.field1505, (byte) 96, var2) + 4096;
                }
                this.field1513[var5][this.field1523] = 4096;
                ++var5;
            }
            this.field1522[this.field1520] = 4096;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lqf;I)I")
    public static final int method474(class165 arg0, int arg1) {
        class76 var2 = (class76) class57.field1126.method677(-2755, ((long) arg0.field3132 << 32) + (long) arg0.field3173);
        if (arg1 < 88) {
            method475((class173) null, (byte) 92);
        }
        ++field1529;
        return var2 != null ? var2.field1495 : arg0.field3099;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lrd;B)I")
    public static final int method475(class173 arg0, byte arg1) {
        ++field1528;
        return arg1 < 55 ? 35 : arg0.method1153((byte) -128) + 1;
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class78() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIII)V")
    public static final void method476(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < -85) {
            ++field1527;
            if (~arg2 >= ~class20.field445 && class37.field790 <= arg4) {
                boolean var6;
                if (~arg3 <= ~class194.field3778) {
                    if (~class96.field1766 > ~arg3) {
                        arg3 = class96.field1766;
                        var6 = false;
                    } else {
                        var6 = true;
                    }
                } else {
                    arg3 = class194.field3778;
                    var6 = false;
                }
                boolean var7;
                if (~arg1 <= ~class194.field3778) {
                    if (arg1 <= class96.field1766) {
                        var7 = true;
                    } else {
                        arg1 = class96.field1766;
                        var7 = false;
                    }
                } else {
                    arg1 = class194.field3778;
                    var7 = false;
                }
                if (~class37.field790 < ~arg2) {
                    arg2 = class37.field790;
                } else {
                    class51.method350(arg3, arg0, (byte) -128, class107.field1998[arg2++], arg1);
                }
                if (class20.field445 >= arg4) {
                    class51.method350(arg3, arg0, (byte) -120, class107.field1998[arg4--], arg1);
                } else {
                    arg4 = class20.field445;
                }
                if (var6 && var7) {
                    for (int var8 = arg2; ~var8 >= ~arg4; ++var8) {
                        int[] var9 = class107.field1998[var8];
                        var9[arg3] = var9[arg1] = arg0;
                    }
                } else {
                    if (!var6) {
                        if (var7) {
                            for (int var10 = arg2; arg4 >= var10; ++var10) {
                                class107.field1998[var10][arg1] = arg0;
                            }
                            return;
                        }
                    } else {
                        for (int var11 = arg2; var11 <= arg4; ++var11) {
                            class107.field1998[var11][arg3] = arg0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B[B)V")
    public static final void method477(byte arg0, byte[] arg1) {
        class121 var2 = new class121(arg1);
        var2.field2222 = arg1.length + -2;
        class71.field1387 = var2.method755((byte) -121);
        class30.field622 = new int[class71.field1387];
        ++field1515;
        class97.field1775 = new int[class71.field1387];
        class20.field458 = new int[class71.field1387];
        class188.field3676 = new byte[class71.field1387][];
        class55.field1099 = new int[class71.field1387];
        var2.field2222 = arg1.length + -7 + -(class71.field1387 * 8);
        class166.field3189 = var2.method755((byte) -102);
        class197.field3845 = var2.method755((byte) -58);
        int var3 = (255 & var2.method751((byte) 88)) + 1;
        for (int var4 = 0; class71.field1387 > var4; ++var4) {
            class55.field1099[var4] = var2.method755((byte) -84);
        }
        for (int var5 = 0; ~class71.field1387 < ~var5; ++var5) {
            class20.field458[var5] = var2.method755((byte) -59);
        }
        for (int var6 = 0; ~var6 > ~class71.field1387; ++var6) {
            class97.field1775[var6] = var2.method755((byte) -80);
        }
        for (int var7 = 0; ~var7 > ~class71.field1387; ++var7) {
            class30.field622[var7] = var2.method755((byte) -36);
        }
        var2.field2222 = arg1.length + -(class71.field1387 * 8) + -7 + -((var3 + -1) * 3);
        class112.field2074 = new int[var3];
        for (int var8 = 1; ~var8 > ~var3; ++var8) {
            class112.field2074[var8] = var2.method780(16711680);
            if (class112.field2074[var8] == 0) {
                class112.field2074[var8] = 1;
            }
        }
        int var9 = -28 / ((arg0 - 82) / 38);
        var2.field2222 = 0;
        for (int var10 = 0; ~var10 > ~class71.field1387; ++var10) {
            int var11 = class97.field1775[var10];
            int var12 = class30.field622[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class188.field3676[var10] = var14;
            int var15 = var2.method751((byte) -105);
            if (~var15 == -1) {
                for (int var16 = 0; ~var16 > ~var13; ++var16) {
                    var14[var16] = var2.method767(-89);
                }
            } else if (~var15 == -2) {
                for (int var17 = 0; ~var11 < ~var17; ++var17) {
                    for (int var18 = 0; var12 > var18; ++var18) {
                        var14[var11 * var18 + var17] = var2.method767(-111);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        this.method473((byte) 72);
        ++field1507;
        if (arg0 != -1) {
            this.field1525 = 2;
        }
    }
}
