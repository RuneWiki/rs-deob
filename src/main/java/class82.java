import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class82 extends class170 {

    @OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
    private int field1503 = 204;

    @OriginalMember(owner = "client!b", name = "wb", descriptor = "I")
    private int field1513 = 8;

    @OriginalMember(owner = "client!b", name = "tb", descriptor = "I")
    private int field1510 = 409;

    @OriginalMember(owner = "client!b", name = "zb", descriptor = "I")
    private int field1516 = 1024;

    @OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
    private int field1493 = 4;

    @OriginalMember(owner = "client!b", name = "Ab", descriptor = "I")
    private int field1517 = 81;

    @OriginalMember(owner = "client!b", name = "gb", descriptor = "I")
    private int field1497 = 0;

    @OriginalMember(owner = "client!b", name = "vb", descriptor = "I")
    private int field1512 = 1024;

    @OriginalMember(owner = "client!b", name = "db", descriptor = "[S")
    public static short[] field1494 = new short[500];

    @OriginalMember(owner = "client!b", name = "Y", descriptor = "Lqk;")
    public static class207 field1489 = class24.method212(255, "Stufe: ");

    @OriginalMember(owner = "client!b", name = "W", descriptor = "Lqk;")
    public static class207 field1487 = class24.method212(255, "<br>");

    @OriginalMember(owner = "client!b", name = "qb", descriptor = "I")
    public static int field1507 = 0;

    @OriginalMember(owner = "client!b", name = "yb", descriptor = "[I")
    public static int[] field1515 = new int[128];

    @OriginalMember(owner = "client!b", name = "ub", descriptor = "I")
    public static int field1511 = 0;

    @OriginalMember(owner = "client!b", name = "X", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!b", name = "Z", descriptor = "I")
    private int field1490;

    @OriginalMember(owner = "client!b", name = "bb", descriptor = "I")
    private int field1492;

    @OriginalMember(owner = "client!b", name = "eb", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!b", name = "fb", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!b", name = "ib", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!b", name = "kb", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!b", name = "lb", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!b", name = "nb", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!b", name = "ob", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!b", name = "rb", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!b", name = "sb", descriptor = "I")
    private int field1509;

    @OriginalMember(owner = "client!b", name = "ab", descriptor = "[I")
    private int[] field1491;

    @OriginalMember(owner = "client!b", name = "jb", descriptor = "[[I")
    private int[][] field1500;

    @OriginalMember(owner = "client!b", name = "xb", descriptor = "[[I")
    private int[][] field1514;

    @OriginalMember(owner = "client!b", name = "hb", descriptor = "[[[Lbc;")
    public static class174[][][] field1498;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)V")
    public static void method612(byte arg0) {
        if (arg0 != -95) {
            method616(true, (byte[]) null);
        }
        field1489 = null;
        field1494 = null;
        field1487 = null;
        field1498 = null;
        field1515 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BLmd;)Lmd;")
    public static final class220 method613(byte arg0, class220 arg1) {
        class220 var2 = client.method1110(arg1);
        if (arg0 < 77) {
            method614((byte) -37, (class220) null);
        }
        ++field1506;
        if (var2 == null) {
            var2 = arg1.field4006;
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BLmd;)V")
    public static final void method614(byte arg0, class220 arg1) {
        if (arg0 <= 34) {
            field1511 = 5;
        }
        if (class154.field2672 == arg1.field3897) {
            class140.field2431[arg1.field4042] = true;
        }
        ++field1495;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        ++field1499;
        if (arg0 != -30) {
            method616(false, (byte[]) null);
        }
        int[] var3 = super.field3001.method1538(arg0 ^ -116, arg1);
        if (super.field3001.field3835) {
            int var4 = 0;
            int var5;
            for (var5 = class282.field4964[arg1] + this.field1497; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field1513 && ~this.field1491[var4] >= ~var5) {
                ++var4;
            }
            boolean var6 = ~(1 & var4) == -1;
            int var7 = var4 - 1;
            int var8 = this.field1491[var4];
            int var9 = this.field1491[var4 + -1];
            if (~(var9 - -this.field1490) > ~var5 && var5 < var8 - this.field1490) {
                for (int var10 = 0; class88.field1595 > var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var6 ? -this.field1516 : this.field1516;
                    int var13;
                    for (var13 = class68.field1211[var10] - -(this.field1492 * var12 >> 12); ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field1493 > var11 && ~this.field1514[var7][var11] >= ~var13) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field1514[var7][var14];
                    int var16 = this.field1514[var7][var11];
                    if (this.field1490 + var15 < var13 && var13 < -this.field1490 + var16) {
                        var3[var10] = this.field1500[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class274.method1862(var3, 0, class88.field1595, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "(I)Ldg;")
    public static final class139 method615(int arg0) {
        if (arg0 != 12339) {
            field1507 = -34;
        }
        int var1 = class241.field4402[0] * class107.field1895[0];
        int[] var2 = new int[var1];
        byte[] var3 = class185.field3286[0];
        ++field1502;
        for (int var4 = 0; var1 > var4; ++var4) {
            var2[var4] = class243.field4421[class121.method860(var3[var4], 255)];
        }
        class139 var5 = new class139(class242.field4406, class230.field4224, class287.field5127[0], class170.field3021[0], class107.field1895[0], class241.field4402[0], var2);
        class116.method821((byte) -127);
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 != 5877) {
            method613((byte) -101, (class220) null);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 == -8) {
                                        this.field1512 = arg0.method1050(1272006568);
                                    }
                                } else {
                                    this.field1517 = arg0.method1050(1272006568);
                                }
                            } else {
                                this.field1497 = arg0.method1050(1272006568);
                            }
                        } else {
                            this.field1516 = arg0.method1050(1272006568);
                        }
                    } else {
                        this.field1503 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field1510 = arg0.method1050(1272006568);
                }
            } else {
                this.field1513 = arg0.method1045((byte) -34);
            }
        } else {
            this.field1493 = arg0.method1045((byte) 79);
        }
        ++field1501;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        ++field1508;
        this.method617(true);
        if (arg0 < 14) {
            field1488 = 10;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z[B)V")
    public static final void method616(boolean arg0, byte[] arg1) {
        ++field1504;
        class149 var2 = new class149(arg1);
        var2.field2593 = arg1.length + -2;
        class280.field4928 = var2.method1050(1272006568);
        class170.field3021 = new int[class280.field4928];
        class287.field5127 = new int[class280.field4928];
        class44.field865 = new boolean[class280.field4928];
        class134.field2327 = new byte[class280.field4928][];
        class107.field1895 = new int[class280.field4928];
        class241.field4402 = new int[class280.field4928];
        class185.field3286 = new byte[class280.field4928][];
        var2.field2593 = arg1.length + -7 - class280.field4928 * 8;
        class242.field4406 = var2.method1050(1272006568);
        class230.field4224 = var2.method1050(1272006568);
        int var3 = 1 + (255 & var2.method1045((byte) 122));
        for (int var4 = 0; ~var4 > ~class280.field4928; ++var4) {
            class287.field5127[var4] = var2.method1050(1272006568);
        }
        for (int var5 = 0; class280.field4928 > var5; ++var5) {
            class170.field3021[var5] = var2.method1050(1272006568);
        }
        for (int var6 = 0; var6 < class280.field4928; ++var6) {
            class107.field1895[var6] = var2.method1050(1272006568);
        }
        for (int var7 = 0; ~var7 > ~class280.field4928; ++var7) {
            class241.field4402[var7] = var2.method1050(1272006568);
        }
        var2.field2593 = arg1.length - (var3 + -1) * 3 + -(class280.field4928 * 8) + -7;
        class243.field4421 = new int[var3];
        int var8 = 1;
        if (arg0) {
            field1511 = 89;
        }
        while (var8 < var3) {
            class243.field4421[var8] = var2.method1065((byte) 27);
            if (~class243.field4421[var8] == -1) {
                class243.field4421[var8] = 1;
            }
            ++var8;
        }
        var2.field2593 = 0;
        for (int var9 = 0; ~class280.field4928 < ~var9; ++var9) {
            int var10 = class107.field1895[var9];
            int var11 = class241.field4402[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class185.field3286[var9] = var13;
            class134.field2327[var9] = var14;
            int var15 = var2.method1045((byte) 96);
            boolean var16 = false;
            if ((var15 & 1) != 0) {
                int var17 = 0;
                label90: while (true) {
                    if (var10 <= var17) {
                        if (~(var15 & 2) == -1) {
                            break;
                        }
                        int var18 = 0;
                        while (true) {
                            if (var10 <= var18) {
                                break label90;
                            }
                            for (int var19 = 0; ~var19 > ~var11; ++var19) {
                                byte var20 = var14[var10 * var19 + var18] = var2.method1084((byte) 49);
                                var16 |= ~var20 != 0;
                            }
                            ++var18;
                        }
                    }
                    for (int var21 = 0; var21 < var11; ++var21) {
                        var13[var10 * var21 + var17] = var2.method1084((byte) 49);
                    }
                    ++var17;
                }
            } else {
                for (int var22 = 0; ~var22 > ~var12; ++var22) {
                    var13[var22] = var2.method1084((byte) 49);
                }
                if ((2 & var15) != 0) {
                    for (int var23 = 0; ~var12 < ~var23; ++var23) {
                        byte var24 = var14[var23] = var2.method1084((byte) 49);
                        var16 |= var24 != -1;
                    }
                }
            }
            class44.field865[var9] = var16;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)V")
    private final void method617(boolean arg0) {
        ++field1496;
        Random var2 = new Random((long) this.field1513);
        this.field1514 = new int[this.field1513][this.field1493 + 1];
        this.field1509 = 4096 / this.field1513;
        this.field1492 = 4096 / this.field1493;
        int var3 = this.field1492 / 2;
        if (arg0) {
            this.field1500 = new int[this.field1513][this.field1493];
            int var4 = this.field1509 / 2;
            this.field1490 = this.field1517 / 2;
            this.field1491 = new int[this.field1513 - -1];
            this.field1491[0] = 0;
            for (int var5 = 0; ~var5 > ~this.field1513; ++var5) {
                if (~var5 < -1) {
                    int var6 = this.field1509;
                    int var7 = (class93.method667(4096, 15901, var2) + -2048) * this.field1503 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field1491[var5] = this.field1491[var5 + -1] + var8;
                }
                this.field1514[var5][0] = 0;
                for (int var9 = 0; this.field1493 > var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1492;
                        int var11 = (-2048 + class93.method667(4096, 15901, var2)) * this.field1510 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field1514[var5][var9] = this.field1514[var5][var9 - 1] + var12;
                    }
                    this.field1500[var5][var9] = this.field1512 > 0 ? 4096 - class93.method667(this.field1512, 15901, var2) : 4096;
                }
                this.field1514[var5][this.field1493] = 4096;
            }
            this.field1491[this.field1513] = 4096;
        }
    }
}
