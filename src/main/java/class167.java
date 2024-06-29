import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class167 extends class86 {

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    private int field2657 = 0;

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    private int field2666 = 0;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    private int field2653 = 0;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "[[S")
    public static short[][] field2648 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    private int field2650;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    private int field2654;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    private int field2656;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    private int field2659;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "I")
    private int field2663;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "Lsf;")
    public static class139 field2651;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "[Lho;")
    public static class215[] field2665;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V", line = 7)
    public static final void method1327(int arg0) {
        field2662++;
        if (arg0 != -1) {
            method1328(-78);
        }
        if (class331.field5086 != class119.field1826 && class246.method1853(true, class119.field1826)) {
            class331.field5086 = class119.field1826;
        }
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)V", line = 25)
    public static final void method1328(int arg0) {
        if (arg0 != 4923) {
            return;
        }
        class249.field3857 = null;
        field2655++;
        class131.method1130(0, 0, 0, false, 0, class164.field2604, -1, class362.field5740, class126.field2113);
        if (class249.field3857 != null) {
            class355.method2494(class348.field5523.field5271, class362.field5740, -1412584499, class23.field352, class170.field2685, true, 0, 0, class126.field2113, class249.field3857);
            class249.field3857 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBII)V", line = 47)
    private final void method1329(int arg0, byte arg1, int arg2, int arg3) {
        field2649++;
        int var5 = arg3 >= arg2 ? arg2 : arg3;
        int var6 = var5 > arg0 ? arg0 : var5;
        int var7 = arg2 >= arg3 ? arg2 : arg3;
        int var8 = var7 >= arg0 ? var7 : arg0;
        this.field2659 = (var6 + var8) / 2;
        int var9 = var8 - var6;
        int var10 = 51 / ((arg1 - 68) / 34);
        if (var9 <= 0) {
            this.field2661 = 0;
        } else {
            int var11 = (var8 - arg2 << 12) / var9;
            int var12 = (var8 - arg3 << 12) / var9;
            int var13 = (var8 - arg0 << 12) / var9;
            if (arg3 == var8) {
                this.field2661 = arg2 == var6 ? var13 + 20480 : -var11 + 4096;
            } else if (arg2 == var8) {
                this.field2661 = arg0 == var6 ? var12 + 4096 : -var13 + 12288;
            } else {
                this.field2661 = arg3 == var6 ? var11 + 12288 : 20480 - var12;
            }
            this.field2661 /= 6;
        }
        if (this.field2659 > 0 && this.field2659 < 4096) {
            this.field2656 = (var9 << 12) / (this.field2659 <= 2048 ? this.field2659 * 2 : 8192 - (this.field2659 * 2));
        } else {
            this.field2656 = 0;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZIII)V", line = 109)
    private final void method1330(boolean arg0, int arg1, int arg2, int arg3) {
        field2664++;
        int var5 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
        if (arg0) {
            return;
        }
        if (var5 <= 0) {
            this.field2650 = this.field2654 = this.field2663 = arg1;
            return;
        }
        int var6 = arg3 * 6;
        int var7 = arg1 + arg1 - var5;
        int var8 = (var5 - var7 << 12) / var5;
        int var9 = var6 >> 12;
        int var10 = var6 - (var9 << 12);
        int var12 = var8 * var5 >> 12;
        int var13 = var10 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var9 == 0) {
            this.field2650 = var5;
            this.field2654 = var15;
            this.field2663 = var7;
        } else if (var9 == 1) {
            this.field2663 = var7;
            this.field2654 = var5;
            this.field2650 = var14;
        } else if (var9 == 2) {
            this.field2654 = var5;
            this.field2650 = var7;
            this.field2663 = var15;
        } else if (var9 == 3) {
            this.field2663 = var5;
            this.field2650 = var7;
            this.field2654 = var14;
        } else if (var9 == 4) {
            this.field2654 = var7;
            this.field2663 = var5;
            this.field2650 = var15;
        } else if (var9 == 5) {
            this.field2663 = var14;
            this.field2650 = var5;
            this.field2654 = var7;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(IB)[[I", line = 224)
    public final int[][] method156(int arg0, byte arg1) {
        if (arg1 >= -126) {
            method1328(63);
        }
        field2667++;
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class93.field1424; var11++) {
                this.method1329(var8[var11], (byte) 113, var6[var11], var5[var11]);
                this.field2659 += this.field2653;
                this.field2656 += this.field2657;
                if (this.field2659 < 0) {
                    this.field2659 = 0;
                }
                if (this.field2656 < 0) {
                    this.field2656 = 0;
                }
                if (this.field2656 > 4096) {
                    this.field2656 = 4096;
                }
                if (this.field2659 > 4096) {
                    this.field2659 = 4096;
                }
                for (this.field2661 += this.field2666; this.field2661 < 0; this.field2661 += 4096) {
                }
                while (this.field2661 > 4096) {
                    this.field2661 -= 4096;
                }
                this.method1330(false, this.field2659, this.field2656, this.field2661);
                var7[var11] = this.field2650;
                var9[var11] = this.field2654;
                var10[var11] = this.field2663;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI[Lrg;)V", line = 296)
    public static final void method1331(byte arg0, int arg1, class342[] arg2) {
        field2660++;
        int var3 = 0;
        if (arg0 > -109) {
            return;
        }
        while (var3 < arg2.length) {
            class342 var4 = arg2[var3];
            if (var4 != null && var4.field5296 == arg1 && (!var4.field5340 || !client.method1043(var4))) {
                label121: {
                    if (var4.field5279 == 0) {
                        if (!var4.field5340 && client.method1043(var4) && class53.field804 != var4) {
                            break label121;
                        }
                        method1331((byte) -113, var4.field5433, arg2);
                        if (var4.field5312 != null) {
                            method1331((byte) -126, var4.field5433, var4.field5312);
                        }
                        class36 var5 = (class36) class135.field2251.method370((byte) -120, (long) var4.field5433);
                        if (var5 != null) {
                            class222.method1672(8, var5.field540);
                        }
                    }
                    if (var4.field5279 == 6) {
                        if (var4.field5440 != -1 || var4.field5275 != -1) {
                            boolean var6 = class170.method1342(var4, (byte) 124);
                            int var7;
                            if (var6) {
                                var7 = var4.field5275;
                            } else {
                                var7 = var4.field5440;
                            }
                            if (var7 != -1) {
                                class93 var8 = class126.method1091((byte) 91, var7);
                                if (var8 != null) {
                                    var4.field5310 += class247.field3840;
                                    while (var4.field5310 > var8.field1429[var4.field5361]) {
                                        var4.field5310 -= var8.field1429[var4.field5361];
                                        var4.field5361++;
                                        if (var8.field1428.length <= var4.field5361) {
                                            var4.field5361 -= var8.field1430;
                                            if (var4.field5361 < 0 || var4.field5361 >= var8.field1428.length) {
                                                var4.field5361 = 0;
                                            }
                                        }
                                        var4.field5364 = var4.field5361 + 1;
                                        if (var8.field1428.length <= var4.field5364) {
                                            var4.field5364 -= var8.field1430;
                                            if (var4.field5364 < 0 || var4.field5364 >= var8.field1428.length) {
                                                var4.field5364 = -1;
                                            }
                                        }
                                        class339.method2380(var4, 107);
                                    }
                                }
                            }
                        }
                        if (var4.field5368 != 0 && !var4.field5340) {
                            int var9 = var4.field5368 >> 16;
                            int var10 = class247.field3840 * var9;
                            var4.field5299 = var4.field5299 + var10 & 0x7FF;
                            int var11 = var4.field5368 << 16 >> 16;
                            int var12 = class247.field3840 * var11;
                            var4.field5435 = var4.field5435 + var12 & 0x7FF;
                            class339.method2380(var4, 126);
                        }
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V", line = 415)
    public class167() {
        super(1, false);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 424)
    public static final void method1332(String arg0, int arg1, int arg2) {
        class148.field2399++;
        class99.field1491.method1628((byte) -95, 119);
        field2646++;
        class99.field1491.method273(0, class34.method354(arg0, (byte) 51) + 1);
        if (arg2 < 7) {
            method1331((byte) 98, -43, (class342[]) null);
        }
        class99.field1491.method285(0, arg1);
        class99.field1491.method280(-18345, arg0);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLug;)V", line = 447)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        if (arg1) {
            this.field2657 = -5;
        }
        if (arg0 == 0) {
            this.field2666 = arg2.method296(-85);
        } else if (arg0 == 1) {
            this.field2657 = (arg2.method286((byte) 96) << 12) / 100;
        } else if (arg0 == 2) {
            this.field2653 = (arg2.method286((byte) 122) << 12) / 100;
        }
        field2658++;
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V", line = 489)
    public static void method1333(int arg0) {
        if (arg0 == 21528) {
            field2648 = (short[][]) null;
            field2651 = null;
            field2665 = null;
        }
    }
}
