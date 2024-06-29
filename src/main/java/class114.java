import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class114 extends class52 {

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field2063 = 0;

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
    private int field2065 = 0;

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "Z")
    private boolean field2064 = false;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!m", name = "ob", descriptor = "I")
    private int field2073;

    @OriginalMember(owner = "client!m", name = "ub", descriptor = "I")
    private int field2079;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
    public int field2071;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    private int field2056;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
    public int field2069;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!m", name = "qb", descriptor = "Lub;")
    private class188 field2075;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2058 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!m", name = "P", descriptor = "D")
    private double field2048;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "D")
    public double field2049;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "D")
    private double field2054;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "D")
    private double field2062;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "D")
    private double field2067;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "D")
    public double field2068;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "D")
    private double field2070;

    @OriginalMember(owner = "client!m", name = "sb", descriptor = "D")
    public double field2077;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!m", name = "nb", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!m", name = "pb", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!m", name = "rb", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!m", name = "tb", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(III)V")
    public static final void method699(int arg0, int arg1, int arg2) {
        field2057++;
        int[] var3 = new int[4];
        var3[0] = arg2;
        int[] var4 = new int[4];
        int var5 = 1;
        var4[0] = arg1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class84.field1509[var6] != arg2) {
                var3[var5] = class84.field1509[var6];
                var4[var5] = class162.field2912[var6];
                var5++;
            }
        }
        class84.field1509 = var3;
        class162.field2912 = var4;
        class127.method768(class186.field3601.length - 1, class186.field3601, 0, arg0 ^ arg0, class162.field2912, class84.field1509);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBIII)V")
    public static final void method700(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class4.method31(arg4, arg2, arg0 + arg4, arg2 + arg3);
        class23.method157();
        if (arg1 >= -6) {
            method704(116, -105, null, -34, 4, -68, 123, 58);
        }
        class105.field1904++;
        field2052++;
        class17.method105(true, 28958);
        class43.method251((byte) 123, true);
        class17.method105(false, 28958);
        class43.method251((byte) 123, false);
        class131.method794((byte) 74);
        class73.method430(-78);
        if (!class209.field4012) {
            int var5 = class24.field439;
            if (var5 < class176.field3356 / 256) {
                var5 = class176.field3356 / 256;
            }
            int var6 = class38.field716 + class1.field5 & 0x7FF;
            if (class37.field691[4] && class82.field1469[4] + 128 > var5) {
                var5 = class82.field1469[4] + 128;
            }
            class105.method654(var5 * 3 + 600, var5, (byte) 75, var6, class131.field2378, class3.field66, class115.method706(class46.field872.field635, class47.field892, 127, class46.field872.field614) - 50);
        }
        int var7;
        if (class209.field4012) {
            var7 = class16.method100(true);
        } else {
            var7 = class29.method178(-126);
        }
        int var8 = class59.field1096;
        int var9 = class143.field2585;
        int var10 = class78.field1418;
        int var11 = class119.field2147;
        int var12 = class34.field590;
        for (int var13 = 0; var13 < 5; var13++) {
            if (class37.field691[var13]) {
                int var16 = (int) ((double) -class21.field408[var13] + (double) (class21.field408[var13] * 2 + 1) * Math.random() + Math.sin((double) class19.field354[var13] / 100.0D * (double) class108.field1958[var13]) * (double) class82.field1469[var13]);
                if (var13 == 3) {
                    class34.field590 = class34.field590 + var16 & 0x7FF;
                }
                if (var13 == 2) {
                    class78.field1418 += var16;
                }
                if (var13 == 0) {
                    class59.field1096 += var16;
                }
                if (var13 == 4) {
                    class119.field2147 += var16;
                    if (class119.field2147 < 128) {
                        class119.field2147 = 128;
                    }
                    if (class119.field2147 > 383) {
                        class119.field2147 = 383;
                    }
                }
                if (var13 == 1) {
                    class143.field2585 += var16;
                }
            }
        }
        int var14 = class39.field736;
        int var15 = class195.field3793;
        if (arg4 <= var14 && arg0 + arg4 > var14 && arg2 <= var15 && var15 < arg2 + arg3) {
            class140.field2536 = class39.field736 - arg4;
            class140.field2551 = class195.field3793 - arg2;
            class140.field2543 = true;
            class140.field2554 = 0;
        } else {
            class140.field2543 = false;
            class140.field2554 = 0;
        }
        class91.method530(-117);
        class4.method27(arg4, arg2, arg0, arg3, 0);
        class91.method530(90);
        class205.method1300(class59.field1096, class143.field2585, class78.field1418, class119.field2147, class34.field590, var7);
        class91.method530(62);
        class78.method446();
        class29.method179(arg0, arg2, arg3, (byte) -121, arg4);
        class210.method1332(arg2, arg4, (byte) 55);
        ((class64) class23.field427).method369(110, class170.field3231);
        class159.method959(arg3, arg2, 16730, arg0, arg4);
        class34.field590 = var12;
        class143.field2585 = var9;
        class59.field1096 = var8;
        class78.field1418 = var10;
        class119.field2147 = var11;
        if (class206.field3951 && class68.method400(false, true, false) == 0) {
            class206.field3951 = false;
        }
        if (class206.field3951) {
            class4.method27(arg4, arg2, arg0, arg3, 0);
            class69.method405(false, class81.field1460, 32549);
        }
        if (!class206.field3951 && !class170.field3244 && var14 >= arg4 && var14 < arg0 + arg4 && var15 >= arg2 && arg2 + arg3 > var15) {
            class200.method1278(arg4, 119, arg2, var15, var14);
        }
    }

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)Loh;")
    public final class140 method15(int arg0) {
        if (arg0 != 7) {
            this.field2061 = 72;
        }
        field2060++;
        class57 var2 = class74.method438((byte) 121, this.field2079);
        class140 var3 = var2.method304(this.field2063, 217);
        if (var3 == null) {
            return null;
        } else {
            var3.method862(this.field2078);
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    public final void method701(int arg0, int arg1) {
        this.field2064 = true;
        this.field2077 += (double) arg1 * this.field2048;
        this.field2068 += (double) arg1 * this.field2054;
        field2051++;
        this.field2049 += this.field2070 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field2062;
        this.field2062 += (double) arg1 * this.field2070;
        this.field2076 = (int) (Math.atan2(this.field2054, this.field2048) * 325.949D) + 1024 & 0x7FF;
        this.field2078 = (int) (Math.atan2(this.field2062, this.field2067) * 325.949D) & 0x7FF;
        if (this.field2075 != null) {
            this.field2065 += arg1;
            label30: while (true) {
                do {
                    do {
                        if (this.field2065 <= this.field2075.field3638[this.field2063]) {
                            break label30;
                        }
                        this.field2065 -= this.field2075.field3638[this.field2063];
                        this.field2063++;
                    } while (this.field2075.field3645.length > this.field2063);
                    this.field2063 -= this.field2075.field3627;
                } while (this.field2063 >= 0 && this.field2075.field3645.length > this.field2063);
                this.field2063 = 0;
            }
        }
        if (arg0 != -1) {
            this.field2079 = -14;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)V")
    public final void method702(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field2064) {
            double var6 = (double) (arg4 - this.field2073);
            double var8 = (double) (arg0 - this.field2066);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field2077 = (double) this.field2059 * var6 / var10 + (double) this.field2073;
            this.field2049 = this.field2056;
            this.field2068 = (double) this.field2059 * var8 / var10 + (double) this.field2066;
        }
        field2072++;
        double var12 = (double) (this.field2046 + 1 - arg1);
        this.field2054 = ((double) arg0 - this.field2068) / var12;
        this.field2048 = ((double) arg4 - this.field2077) / var12;
        this.field2067 = Math.sqrt(this.field2054 * this.field2054 + this.field2048 * this.field2048);
        if (!this.field2064) {
            this.field2062 = -this.field2067 * Math.tan((double) this.field2053 * 0.02454369D);
        }
        this.field2070 = ((double) arg3 - this.field2049 - this.field2062 * var12) * 2.0D / (var12 * var12);
        if (arg2 != -10253) {
            this.field2075 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static final void method703(int arg0) {
        if (arg0 >= -124) {
            return;
        }
        class108.field1945.method770(false);
        class170.field3240.method770(false);
        field2055++;
        class131.field2377.method770(false);
        class176.field3371.method770(false);
        class73.field1367.method770(false);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IILgf;IIIII)V")
    public static final void method704(int arg0, int arg1, class65 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2047++;
        if (class55.field970 && (class46.field878[0][arg3][arg5] & 0x2) == 0) {
            if ((class46.field878[arg6][arg3][arg5] & 0x10) != 0) {
                return;
            }
            if (class189.method1203(0, arg3, arg5, arg6) != class87.field1598) {
                return;
            }
        }
        if (arg6 < class60.field1124) {
            class60.field1124 = arg6;
        }
        class58 var8 = class14.method88(-76, arg7);
        int var9;
        int var10;
        if (arg1 == 1 || arg1 == 3) {
            var9 = var8.field1027;
            var10 = var8.field1084;
        } else {
            var9 = var8.field1084;
            var10 = var8.field1027;
        }
        int var11;
        int var12;
        if (arg3 + var10 <= 104) {
            var11 = (var10 >> 1) + arg3;
            var12 = (var10 + 1 >> 1) + arg3;
        } else {
            var11 = arg3;
            var12 = arg3 + 1;
        }
        int var13;
        int var14;
        if (arg5 + var9 > 104) {
            var13 = arg5;
            var14 = arg5 + 1;
        } else {
            var14 = (var9 + 1 >> 1) + arg5;
            var13 = (var9 >> 1) + arg5;
        }
        if (arg0 != -10182) {
            method704(-95, 38, null, 10, 86, 13, -50, 125);
        }
        int[][] var15 = class179.field3418[arg6];
        int var16 = var15[var11][var13] + var15[var12][var13] + var15[var12][var14] + var15[var11][var14] >> 2;
        int var17 = (arg3 << 7) + (var10 << 6);
        int var18 = (arg5 << 7) + (var9 << 6);
        long var19 = (long) ((arg1 | 0x400) << 20 | arg5 << 7 | arg3 | arg4 << 14);
        if (var8.field1053 == 0) {
            var19 |= Long.MIN_VALUE;
        }
        if (var8.field1046 == 1) {
            var19 |= 0x400000L;
        }
        long var21 = var19 | (long) arg7 << 32;
        if (var8.method311((byte) 74)) {
            class156.method948(arg6, arg5, arg1, true, arg3, var8);
        }
        if (arg4 == 22) {
            if (!class55.field970 || var8.field1053 != 0 || var8.field1060 == 1 || var8.field1088) {
                class52 var24;
                if (var8.field1075 == -1 && var8.field1083 == null) {
                    class123 var23 = var8.method320(var16, arg1, var17, var18, 22, arg0 ^ 0x13015E90, var15);
                    var24 = var23.field2235;
                } else {
                    var24 = new class13(arg7, 22, arg1, arg6, arg3, arg5, var8.field1075, true, null);
                }
                class201.method1284(arg6, arg3, arg5, var16, var24, var21);
                if (var8.field1060 == 1 && arg2 != null) {
                    arg2.method371(arg5, 126, arg3);
                }
            }
        } else if (arg4 == 10 || arg4 == 11) {
            class52 var64;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var63 = var8.method320(var16, arg1, var17, var18, 10, -318863702, var15);
                var64 = var63.field2235;
            } else {
                var64 = new class13(arg7, 10, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            if (var64 != null && class193.method1228(arg6, arg3, arg5, var16, var10, var9, var64, arg4 == 11 ? 256 : 0, var21) && var8.field1086) {
                int var65 = 15;
                if (var64 instanceof class140) {
                    var65 = ((class140) var64).method867() / 4;
                    if (var65 > 30) {
                        var65 = 30;
                    }
                }
                for (int var66 = 0; var66 <= var10; var66++) {
                    for (int var67 = 0; var67 <= var9; var67++) {
                        if (class191.field3724[arg6][arg3 + var66][arg5 + var67] < var65) {
                            class191.field3724[arg6][arg3 + var66][arg5 + var67] = (byte) var65;
                        }
                    }
                }
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method383(var8.field1047, arg3, arg5, var9, var10, 101);
            }
        } else if (arg4 >= 12) {
            class52 var26;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var25 = var8.method320(var16, arg1, var17, var18, arg4, -318863702, var15);
                var26 = var25.field2235;
            } else {
                var26 = new class13(arg7, arg4, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class193.method1228(arg6, arg3, arg5, var16, 1, 1, var26, 0, var21);
            if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg6 > 0) {
                class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 2340);
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method383(var8.field1047, arg3, arg5, var9, var10, 96);
            }
        } else if (arg4 == 0) {
            class52 var28;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var27 = var8.method320(var16, arg1, var17, var18, 0, -318863702, var15);
                var28 = var27.field2235;
            } else {
                var28 = new class13(arg7, 0, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class100.method621(arg6, arg3, arg5, var16, var28, null, class76.field1399[arg1], 0, var21);
            if (arg1 == 0) {
                if (var8.field1086) {
                    class191.field3724[arg6][arg3][arg5] = 50;
                    class191.field3724[arg6][arg3][arg5 + 1] = 50;
                }
                if (var8.field1068) {
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 585);
                }
            } else if (arg1 == 1) {
                if (var8.field1086) {
                    class191.field3724[arg6][arg3][arg5 + 1] = 50;
                    class191.field3724[arg6][arg3 + 1][arg5 + 1] = 50;
                }
                if (var8.field1068) {
                    class189.field3679[arg6][arg3][arg5 + 1] = class123.method748(class189.field3679[arg6][arg3][arg5 + 1], 1170);
                }
            } else if (arg1 == 2) {
                if (var8.field1086) {
                    class191.field3724[arg6][arg3 + 1][arg5] = 50;
                    class191.field3724[arg6][arg3 + 1][arg5 + 1] = 50;
                }
                if (var8.field1068) {
                    class189.field3679[arg6][arg3 + 1][arg5] = class123.method748(class189.field3679[arg6][arg3 + 1][arg5], 585);
                }
            } else if (arg1 == 3) {
                if (var8.field1086) {
                    class191.field3724[arg6][arg3][arg5] = 50;
                    class191.field3724[arg6][arg3 + 1][arg5] = 50;
                }
                if (var8.field1068) {
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 1170);
                }
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method373(arg5, arg1, var8.field1047, arg4, arg3, (byte) -115);
            }
            if (var8.field1050 != 16) {
                class196.method1246(arg6, arg3, arg5, var8.field1050);
            }
        } else if (arg4 == 1) {
            class52 var30;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var29 = var8.method320(var16, arg1, var17, var18, 1, -318863702, var15);
                var30 = var29.field2235;
            } else {
                var30 = new class13(arg7, 1, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class100.method621(arg6, arg3, arg5, var16, var30, null, class133.field2415[arg1], 0, var21);
            if (var8.field1086) {
                if (arg1 == 0) {
                    class191.field3724[arg6][arg3][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    class191.field3724[arg6][arg3 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    class191.field3724[arg6][arg3 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    class191.field3724[arg6][arg3][arg5] = 50;
                }
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method373(arg5, arg1, var8.field1047, arg4, arg3, (byte) -108);
            }
        } else if (arg4 == 2) {
            int var31 = arg1 + 1 & 0x3;
            class52 var34;
            class52 var35;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var32 = var8.method320(var16, arg1 + 4, var17, var18, 2, -318863702, var15);
                class123 var33 = var8.method320(var16, var31, var17, var18, 2, -318863702, var15);
                var34 = var33.field2235;
                var35 = var32.field2235;
            } else {
                var35 = new class13(arg7, 2, arg1 + 4, arg6, arg3, arg5, var8.field1075, true, null);
                var34 = new class13(arg7, 2, var31, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class100.method621(arg6, arg3, arg5, var16, var35, var34, class76.field1399[arg1], class76.field1399[var31], var21);
            if (var8.field1068) {
                if (arg1 == 0) {
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 585);
                    class189.field3679[arg6][arg3][arg5 + 1] = class123.method748(class189.field3679[arg6][arg3][arg5 + 1], 1170);
                } else if (arg1 == 1) {
                    class189.field3679[arg6][arg3][arg5 + 1] = class123.method748(class189.field3679[arg6][arg3][arg5 + 1], 1170);
                    class189.field3679[arg6][arg3 + 1][arg5] = class123.method748(class189.field3679[arg6][arg3 + 1][arg5], 585);
                } else if (arg1 == 2) {
                    class189.field3679[arg6][arg3 + 1][arg5] = class123.method748(class189.field3679[arg6][arg3 + 1][arg5], 585);
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 1170);
                } else if (arg1 == 3) {
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 1170);
                    class189.field3679[arg6][arg3][arg5] = class123.method748(class189.field3679[arg6][arg3][arg5], 585);
                }
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method373(arg5, arg1, var8.field1047, arg4, arg3, (byte) -108);
            }
            if (var8.field1050 != 16) {
                class196.method1246(arg6, arg3, arg5, var8.field1050);
            }
        } else if (arg4 == 3) {
            class52 var37;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var36 = var8.method320(var16, arg1, var17, var18, 3, -318863702, var15);
                var37 = var36.field2235;
            } else {
                var37 = new class13(arg7, 3, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class100.method621(arg6, arg3, arg5, var16, var37, null, class133.field2415[arg1], 0, var21);
            if (var8.field1086) {
                if (arg1 == 0) {
                    class191.field3724[arg6][arg3][arg5 + 1] = 50;
                } else if (arg1 == 1) {
                    class191.field3724[arg6][arg3 + 1][arg5 + 1] = 50;
                } else if (arg1 == 2) {
                    class191.field3724[arg6][arg3 + 1][arg5] = 50;
                } else if (arg1 == 3) {
                    class191.field3724[arg6][arg3][arg5] = 50;
                }
            }
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method373(arg5, arg1, var8.field1047, arg4, arg3, (byte) -128);
            }
        } else if (arg4 == 9) {
            class52 var39;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var38 = var8.method320(var16, arg1, var17, var18, arg4, -318863702, var15);
                var39 = var38.field2235;
            } else {
                var39 = new class13(arg7, arg4, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class193.method1228(arg6, arg3, arg5, var16, 1, 1, var39, 0, var21);
            if (var8.field1060 != 0 && arg2 != null) {
                arg2.method383(var8.field1047, arg3, arg5, var9, var10, arg0 ^ 0xFFFFD843);
            }
            if (var8.field1050 != 16) {
                class196.method1246(arg6, arg3, arg5, var8.field1050);
            }
        } else if (arg4 == 4) {
            class52 var41;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var40 = var8.method320(var16, arg1, var17, var18, 4, -318863702, var15);
                var41 = var40.field2235;
            } else {
                var41 = new class13(arg7, 4, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class188.method1195(arg6, arg3, arg5, var16, var41, null, class76.field1399[arg1], 0, 0, 0, var21);
        } else if (arg4 == 5) {
            long var42 = class21.method131(arg6, arg3, arg5);
            int var44 = 16;
            if (var42 != 0L) {
                var44 = class14.method88(110, Integer.MAX_VALUE & (int) (var42 >>> 32)).field1050;
            }
            class52 var46;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var45 = var8.method320(var16, arg1, var17, var18, 4, -318863702, var15);
                var46 = var45.field2235;
            } else {
                var46 = new class13(arg7, 4, arg1, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class188.method1195(arg6, arg3, arg5, var16, var46, null, class76.field1399[arg1], 0, class72.field1348[arg1] * var44, class79.field1433[arg1] * var44, var21);
        } else if (arg4 == 6) {
            int var47 = 8;
            long var48 = class21.method131(arg6, arg3, arg5);
            if (var48 != 0L) {
                var47 = class14.method88(16, (int) (var48 >>> 32) & Integer.MAX_VALUE).field1050 / 2;
            }
            class52 var51;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var50 = var8.method320(var16, arg1 + 4, var17, var18, 4, -318863702, var15);
                var51 = var50.field2235;
            } else {
                var51 = new class13(arg7, 4, arg1 + 4, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class188.method1195(arg6, arg3, arg5, var16, var51, null, 256, arg1, class60.field1130[arg1] * var47, class73.field1369[arg1] * var47, var21);
        } else if (arg4 == 7) {
            int var52 = arg1 + 2 & 0x3;
            class52 var54;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var53 = var8.method320(var16, var52 + 4, var17, var18, 4, -318863702, var15);
                var54 = var53.field2235;
            } else {
                var54 = new class13(arg7, 4, var52 + 4, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class188.method1195(arg6, arg3, arg5, var16, var54, null, 256, var52, 0, 0, var21);
        } else if (arg4 == 8) {
            int var55 = 8;
            long var56 = class21.method131(arg6, arg3, arg5);
            if (var56 != 0L) {
                var55 = class14.method88(arg0 ^ 0xFFFFD829, Integer.MAX_VALUE & (int) (var56 >>> 32)).field1050 / 2;
            }
            int var58 = arg1 + 2 & 0x3;
            class52 var61;
            class52 var62;
            if (var8.field1075 == -1 && var8.field1083 == null) {
                class123 var59 = var8.method320(var16, arg1 + 4, var17, var18, 4, arg0 ^ 0x13015E90, var15);
                class123 var60 = var8.method320(var16, var58 + 4, var17, var18, 4, -318863702, var15);
                var61 = var60.field2235;
                var62 = var59.field2235;
            } else {
                var62 = new class13(arg7, 4, arg1 + 4, arg6, arg3, arg5, var8.field1075, true, null);
                var61 = new class13(arg7, 4, var58 + 4, arg6, arg3, arg5, var8.field1075, true, null);
            }
            class188.method1195(arg6, arg3, arg5, var16, var62, var61, 256, arg1, class60.field1130[arg1] * var55, class73.field1369[arg1] * var55, var21);
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method705(int arg0) {
        if (arg0 == -9040) {
            field2058 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field2064 = false;
        this.field2050 = arg5;
        this.field2073 = arg3;
        this.field2079 = arg0;
        this.field2061 = arg10;
        this.field2059 = arg8;
        this.field2046 = arg6;
        this.field2071 = arg9;
        this.field2056 = arg4;
        this.field2053 = arg7;
        this.field2069 = arg1;
        this.field2066 = arg2;
        int var12 = class74.method438((byte) 89, this.field2079).field1017;
        if (var12 == -1) {
            this.field2075 = null;
        } else {
            this.field2075 = class83.method465(var12, -1);
        }
    }
}
