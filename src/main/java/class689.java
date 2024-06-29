import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class689 implements Runnable {

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "Lan;")
    private class22 field9828 = new class22();

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public int field9831 = 0;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Z")
    private boolean field9832 = false;

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Ljava/lang/Thread;")
    private Thread field9833;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "Z")
    public static boolean field9822 = false;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "[I")
    public static int[] field9826 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Z")
    public static boolean field9830 = false;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field9821;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public static int field9823;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field9824;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field9825;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "I")
    public static int field9829;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljq;)V")
    public static final void method3891(class475 arg0) {
        if (class100.field1342 >= 65535) {
            return;
        }
        class530 var1 = arg0.field6647;
        class436.field6249[class100.field1342] = arg0;
        class638.field9133[class100.field1342] = false;
        class100.field1342++;
        int var2 = arg0.field6636;
        if (arg0.field6635) {
            var2 = 0;
        }
        int var3 = arg0.field6636;
        if (arg0.field6640) {
            var3 = class663.field9391 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3115(-30190) + class480.field6727 - var1.method3122(-11184) >> class295.field3981;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3115(-30190) + var1.method3122(-11184) - class480.field6727 >> class295.field3981;
            if (var7 >= class302.field4057) {
                var7 = class302.field4057 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field6641[var5++];
                int var10 = (var1.method3118(34037) + class480.field6727 - var1.method3122(-11184) >> class295.field3981) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class455.field6393) {
                    var11 = class455.field6393 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class321.field4226[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class321.field4226[var4][var12][var8] = var13 | (long) class100.field1342;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class321.field4226[var4][var12][var8] = var13 | (long) class100.field1342 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class321.field4226[var4][var12][var8] = var13 | (long) class100.field1342 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class321.field4226[var4][var12][var8] = var13 | (long) class100.field1342 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILvp;I)Lg;")
    public final class139 method3892(int arg0, class171 arg1, int arg2) {
        field9829++;
        class139 var4 = new class139();
        var4.field1749 = 1;
        class22 var5 = this.field9828;
        synchronized (this.field9828) {
            class139 var6 = (class139) this.field9828.method347(0);
            while (true) {
                if (var6 == null) {
                    break;
                }
                if ((long) arg0 == var6.field2006 && var6.field1750 == arg1 && var6.field1749 == 2) {
                    var4.field2557 = false;
                    var4.field1752 = var6.field1752;
                    return var4;
                }
                var6 = (class139) this.field9828.method344((byte) 24);
            }
        }
        int var8 = 26 % ((-arg2 - 70) / 33);
        var4.field1752 = arg1.method1076(21946, arg0);
        var4.field2557 = false;
        var4.field2555 = true;
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method3893(int arg0) {
        this.field9832 = true;
        field9824++;
        class22 var2 = this.field9828;
        synchronized (this.field9828) {
            if (arg0 <= 17) {
                this.field9832 = true;
            }
            this.field9828.notifyAll();
        }
        try {
            this.field9833.join();
        } catch (InterruptedException var3) {
        }
        this.field9833 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILvp;[BI)Lg;")
    public final class139 method3894(int arg0, class171 arg1, byte[] arg2, int arg3) {
        field9821++;
        class139 var5 = new class139();
        var5.field1750 = arg1;
        var5.field2006 = arg3;
        var5.field2555 = false;
        if (arg0 != 2465) {
            method3891(null);
        }
        var5.field1752 = arg2;
        var5.field1749 = 2;
        this.method3898(true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public static void method3895(int arg0) {
        field9826 = null;
        if (arg0 < 107) {
            field9822 = false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IB)[[[B")
    public static final byte[][][] method3896(int arg0, byte arg1) {
        field9823++;
        byte[][][] var2 = new byte[8][4][];
        int var3 = arg0;
        int var4 = arg0;
        byte[] var5 = new byte[arg0 * arg0];
        if (arg1 != -88) {
            return null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var4; var7++) {
            for (int var132 = 0; var132 < var3; var132++) {
                if (var132 <= var7) {
                    var5[var6] = -1;
                }
                var6++;
            }
        }
        var2[0][0] = var5;
        int var8 = 0;
        byte[] var9 = new byte[var3 * var4];
        for (int var10 = var4 - 1; var10 >= 0; var10--) {
            for (int var131 = 0; var131 < var4; var131++) {
                if (var10 >= var131) {
                    var9[var8] = -1;
                }
                var8++;
            }
        }
        var2[0][1] = var9;
        byte[] var11 = new byte[var3 * var4];
        int var12 = 0;
        for (int var13 = 0; var13 < var4; var13++) {
            for (int var130 = 0; var130 < var3; var130++) {
                if (var13 <= var130) {
                    var11[var12] = -1;
                }
                var12++;
            }
        }
        var2[0][2] = var11;
        int var14 = 0;
        byte[] var15 = new byte[var3 * var4];
        for (int var16 = var4 - 1; var16 >= 0; var16--) {
            for (int var129 = 0; var129 < var3; var129++) {
                if (var129 >= var16) {
                    var15[var14] = -1;
                }
                var14++;
            }
        }
        var2[0][3] = var15;
        int var17 = 0;
        byte[] var18 = new byte[var3 * var4];
        for (int var19 = var4 - 1; var19 >= 0; var19--) {
            for (int var128 = 0; var128 < var3; var128++) {
                if (var128 <= var19 >> 1) {
                    var18[var17] = -1;
                }
                var17++;
            }
        }
        var2[1][0] = var18;
        int var20 = 0;
        byte[] var21 = new byte[var3 * var4];
        for (int var22 = 0; var22 < var4; var22++) {
            for (int var127 = 0; var127 < var3; var127++) {
                if (var20 >= 0 && var20 < var21.length) {
                    if (var127 >= (var22 << 1)) {
                        var21[var20] = -1;
                    }
                    var20++;
                } else {
                    var20++;
                }
            }
        }
        var2[1][1] = var21;
        byte[] var23 = new byte[var3 * var4];
        int var24 = 0;
        for (int var25 = 0; var25 < var4; var25++) {
            for (int var126 = var3 - 1; var126 >= 0; var126--) {
                if (var126 <= (var25 >> 1)) {
                    var23[var24] = -1;
                }
                var24++;
            }
        }
        var2[1][2] = var23;
        byte[] var26 = new byte[var3 * var4];
        int var27 = 0;
        for (int var28 = var4 - 1; var28 >= 0; var28--) {
            for (int var125 = var3 - 1; var125 >= 0; var125--) {
                if (var125 >= var28 << 1) {
                    var26[var27] = -1;
                }
                var27++;
            }
        }
        var2[1][3] = var26;
        int var29 = 0;
        byte[] var30 = new byte[var3 * var4];
        for (int var31 = var4 - 1; var31 >= 0; var31--) {
            for (int var124 = var3 - 1; var124 >= 0; var124--) {
                if ((var31 >> 1) >= var124) {
                    var30[var29] = -1;
                }
                var29++;
            }
        }
        var2[2][0] = var30;
        byte[] var32 = new byte[var3 * var4];
        int var33 = 0;
        for (int var34 = var4 - 1; var34 >= 0; var34--) {
            for (int var123 = 0; var123 < var3; var123++) {
                if (var123 >= var34 << 1) {
                    var32[var33] = -1;
                }
                var33++;
            }
        }
        var2[2][1] = var32;
        int var35 = 0;
        byte[] var36 = new byte[var3 * var4];
        for (int var37 = 0; var37 < var4; var37++) {
            for (int var122 = 0; var122 < var3; var122++) {
                if ((var37 >> 1) >= var122) {
                    var36[var35] = -1;
                }
                var35++;
            }
        }
        var2[2][2] = var36;
        int var38 = 0;
        byte[] var39 = new byte[var3 * var4];
        for (int var40 = 0; var40 < var4; var40++) {
            for (int var121 = var3 - 1; var121 >= 0; var121--) {
                if ((var40 << 1) <= var121) {
                    var39[var38] = -1;
                }
                var38++;
            }
        }
        var2[2][3] = var39;
        int var41 = 0;
        byte[] var42 = new byte[var3 * var4];
        for (int var43 = var4 - 1; var43 >= 0; var43--) {
            for (int var120 = 0; var120 < var3; var120++) {
                if (var120 >= var43 >> 1) {
                    var42[var41] = -1;
                }
                var41++;
            }
        }
        var2[3][0] = var42;
        byte[] var44 = new byte[var3 * var4];
        int var45 = 0;
        for (int var46 = 0; var46 < var4; var46++) {
            for (int var119 = 0; var119 < var3; var119++) {
                if ((var46 << 1) >= var119) {
                    var44[var45] = -1;
                }
                var45++;
            }
        }
        var2[3][1] = var44;
        byte[] var47 = new byte[var3 * var4];
        int var48 = 0;
        for (int var49 = 0; var49 < var4; var49++) {
            for (int var118 = var3 - 1; var118 >= 0; var118--) {
                if (var118 >= (var49 >> 1)) {
                    var47[var48] = -1;
                }
                var48++;
            }
        }
        var2[3][2] = var47;
        byte[] var50 = new byte[var3 * var4];
        int var51 = 0;
        for (int var52 = var4 - 1; var52 >= 0; var52--) {
            for (int var117 = var3 - 1; var117 >= 0; var117--) {
                if ((var52 << 1) >= var117) {
                    var50[var51] = -1;
                }
                var51++;
            }
        }
        var2[3][3] = var50;
        byte[] var53 = new byte[var3 * var4];
        int var54 = 0;
        for (int var55 = var4 - 1; var55 >= 0; var55--) {
            for (int var116 = var3 - 1; var116 >= 0; var116--) {
                if (var116 >= var55 >> 1) {
                    var53[var54] = -1;
                }
                var54++;
            }
        }
        var2[4][0] = var53;
        byte[] var56 = new byte[var3 * var4];
        int var57 = 0;
        for (int var58 = var4 - 1; var58 >= 0; var58--) {
            for (int var115 = 0; var115 < var3; var115++) {
                if ((var58 << 1) >= var115) {
                    var56[var57] = -1;
                }
                var57++;
            }
        }
        var2[4][1] = var56;
        int var59 = 0;
        byte[] var60 = new byte[var3 * var4];
        for (int var61 = 0; var61 < var4; var61++) {
            for (int var114 = 0; var114 < var3; var114++) {
                if ((var61 >> 1) <= var114) {
                    var60[var59] = -1;
                }
                var59++;
            }
        }
        var2[4][2] = var60;
        byte[] var62 = new byte[var3 * var4];
        int var63 = 0;
        for (int var64 = 0; var64 < var4; var64++) {
            for (int var113 = var3 - 1; var113 >= 0; var113--) {
                if ((var64 << 1) >= var113) {
                    var62[var63] = -1;
                }
                var63++;
            }
        }
        var2[4][3] = var62;
        int var65 = 0;
        byte[] var66 = new byte[var3 * var4];
        for (int var67 = 0; var67 < var4; var67++) {
            for (int var112 = 0; var112 < var3; var112++) {
                if ((var3 / 2) >= var112) {
                    var66[var65] = -1;
                }
                var65++;
            }
        }
        var2[5][0] = var66;
        int var68 = 0;
        byte[] var69 = new byte[var3 * var4];
        for (int var70 = 0; var70 < var4; var70++) {
            for (int var111 = 0; var111 < var3; var111++) {
                if (var70 <= var4 / 2) {
                    var69[var68] = -1;
                }
                var68++;
            }
        }
        var2[5][1] = var69;
        byte[] var71 = new byte[var3 * var4];
        int var72 = 0;
        for (int var73 = 0; var73 < var4; var73++) {
            for (int var110 = 0; var110 < var3; var110++) {
                if (var110 >= (var3 / 2)) {
                    var71[var72] = -1;
                }
                var72++;
            }
        }
        var2[5][2] = var71;
        byte[] var74 = new byte[var3 * var4];
        int var75 = 0;
        for (int var76 = 0; var76 < var4; var76++) {
            for (int var109 = 0; var109 < var3; var109++) {
                if (var76 >= var4 / 2) {
                    var74[var75] = -1;
                }
                var75++;
            }
        }
        var2[5][3] = var74;
        int var77 = 0;
        byte[] var78 = new byte[var3 * var4];
        for (int var79 = 0; var79 < var4; var79++) {
            for (int var108 = 0; var108 < var3; var108++) {
                if ((var79 - (var4 / 2)) >= var108) {
                    var78[var77] = -1;
                }
                var77++;
            }
        }
        var2[6][0] = var78;
        byte[] var80 = new byte[var3 * var4];
        int var81 = 0;
        for (int var82 = var4 - 1; var82 >= 0; var82--) {
            for (int var107 = 0; var107 < var3; var107++) {
                if (var107 <= var82 - (var4 / 2)) {
                    var80[var81] = -1;
                }
                var81++;
            }
        }
        var2[6][1] = var80;
        byte[] var83 = new byte[var3 * var4];
        int var84 = 0;
        for (int var85 = var4 - 1; var85 >= 0; var85--) {
            for (int var106 = var3 - 1; var106 >= 0; var106--) {
                if (var85 - (var4 / 2) >= var106) {
                    var83[var84] = -1;
                }
                var84++;
            }
        }
        var2[6][2] = var83;
        int var86 = 0;
        byte[] var87 = new byte[var3 * var4];
        for (int var88 = 0; var88 < var4; var88++) {
            for (int var105 = var3 - 1; var105 >= 0; var105--) {
                if (var105 <= var88 - (var4 / 2)) {
                    var87[var86] = -1;
                }
                var86++;
            }
        }
        var2[6][3] = var87;
        int var89 = 0;
        byte[] var90 = new byte[var3 * var4];
        for (int var91 = 0; var91 < var4; var91++) {
            for (int var104 = 0; var104 < var3; var104++) {
                if (var91 - (var4 / 2) <= var104) {
                    var90[var89] = -1;
                }
                var89++;
            }
        }
        var2[7][0] = var90;
        int var92 = 0;
        byte[] var93 = new byte[var3 * var4];
        for (int var94 = var4 - 1; var94 >= 0; var94--) {
            for (int var103 = 0; var103 < var3; var103++) {
                if (var103 >= var94 - var4 / 2) {
                    var93[var92] = -1;
                }
                var92++;
            }
        }
        var2[7][1] = var93;
        byte[] var95 = new byte[var3 * var4];
        int var96 = 0;
        for (int var97 = var4 - 1; var97 >= 0; var97--) {
            for (int var102 = var3 - 1; var102 >= 0; var102--) {
                if (var97 - (var4 / 2) <= var102) {
                    var95[var96] = -1;
                }
                var96++;
            }
        }
        var2[7][2] = var95;
        int var98 = 0;
        byte[] var99 = new byte[var3 * var4];
        for (int var100 = 0; var100 < var4; var100++) {
            for (int var101 = var3 - 1; var101 >= 0; var101--) {
                if (var100 - (var4 / 2) <= var101) {
                    var99[var98] = -1;
                }
                var98++;
            }
        }
        var2[7][3] = var99;
        return var2;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILvp;)Lg;")
    public final class139 method3897(int arg0, int arg1, class171 arg2) {
        field9820++;
        class139 var4 = new class139();
        if (arg0 != 10426) {
            return null;
        }
        var4.field2006 = arg1;
        var4.field2555 = false;
        var4.field1750 = arg2;
        var4.field1749 = 3;
        this.method3898(true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!qc", name = "run", descriptor = "()V")
    public final void run() {
        field9825++;
        while (!this.field9832) {
            class22 var1 = this.field9828;
            class139 var2;
            synchronized (this.field9828) {
                var2 = (class139) this.field9828.method352((byte) 115);
                if (var2 == null) {
                    try {
                        this.field9828.wait();
                    } catch (InterruptedException var7) {
                    }
                    continue;
                }
                this.field9831--;
            }
            try {
                if (var2.field1749 == 2) {
                    var2.field1750.method1075(var2.field1752, var2.field1752.length, 88, (int) var2.field2006);
                } else if (var2.field1749 == 3) {
                    var2.field1752 = var2.field1750.method1076(21946, (int) var2.field2006);
                }
            } catch (Exception var6) {
                class544.method3184(23383, null, var6);
            }
            var2.field2557 = false;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLg;)V")
    private final void method3898(boolean arg0, class139 arg1) {
        class22 var3 = this.field9828;
        synchronized (this.field9828) {
            this.field9828.method345(arg1, -1);
            this.field9831++;
            if (!arg0) {
                this.field9831 = -71;
            }
            this.field9828.notifyAll();
        }
        field9827++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lwd;)V")
    public class689(class248 arg0) {
        class477 var2 = arg0.method1521(this, 5, 120);
        while (var2.field6693 == 0) {
            class151.method974((byte) -102, 10L);
        }
        if (var2.field6693 == 2) {
            throw new RuntimeException();
        }
        this.field9833 = (Thread) var2.field6695;
    }
}
