import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class152 extends class182 {

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "I")
    public static int field2537 = 0;

    @OriginalMember(owner = "client!fm", name = "O", descriptor = "I")
    public static int field2532 = -1;

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field2533 = new String[100];

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "[I")
    public static int[] field2541 = new int[2500];

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    public static int field2543 = 0;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2545 = " ";

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "[Lmd;")
    public static class273[] field2539;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "[Lkd;")
    private class63[] field2546;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILhg;I)V")
    public static final void method1159(int arg0, int arg1, int arg2, class207 arg3, int arg4) {
        ++field2538;
        if (~class292.field4791 > -4) {
            ((class92) class62.field1058).method648(arg1, arg0, arg3.field3484, arg3.field3481, class62.field1058.field4564 / 2, class62.field1058.field4574 / 2, (int) class265.field4432, 256, arg3.field3363, arg3.field3359);
        } else {
            class211.method1492(arg1, arg0, 0, arg3.field3363, arg3.field3359);
        }
        if (arg2 != 8311) {
            field2533 = null;
        }
        class236.field3988[arg4] = true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "([[IB)V")
    private final void method1160(int[][] arg0, byte arg1) {
        ++field2540;
        if (arg1 <= -15) {
            int var3 = class4.field116;
            int var4 = class16.field318;
            class232.method1668(arg0, 2);
            class155.method1177(0, class107.field1749, 0, 0, class103.field1644);
            if (this.field2546 != null) {
                for (int var5 = 0; this.field2546.length > var5; ++var5) {
                    class63 var6 = this.field2546[var5];
                    int var7 = var6.field1062;
                    int var8 = var6.field1066;
                    if (~var7 <= -1) {
                        if (~var8 <= -1) {
                            var6.method210(var4, var3, 8846);
                        } else {
                            var6.method216(var4, true, var3);
                        }
                    } else if (~var8 <= -1) {
                        var6.method214(var3, var4, (byte) -114);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)V")
    public static final void method1161(int arg0, boolean arg1) {
        ++field2544;
        class34.field537.method98(1, arg0);
        if (arg1) {
            field2539 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "(I)V")
    public static void method1162(int arg0) {
        field2539 = null;
        field2533 = null;
        field2541 = null;
        field2545 = null;
        if (arg0 != 16218) {
            field2545 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int[][] var3 = super.field2905.method50(arg1, (byte) 111);
        ++field2535;
        int var4 = -60 / ((-64 - arg0) / 49);
        if (super.field2905.field158) {
            int var5 = class16.field318;
            int var6 = class4.field116;
            int[][] var7 = new int[var5][var6];
            int[][][] var8 = super.field2905.method46(0);
            this.method1160(var7, (byte) -127);
            for (int var9 = 0; class16.field318 > var9; ++var9) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[1];
                int[] var13 = var11[0];
                int[] var14 = var11[2];
                for (int var15 = 0; ~var15 > ~class4.field116; ++var15) {
                    int var16 = var10[var15];
                    var14[var15] = class15.method84(var16 << 4, 4080);
                    var12[var15] = class15.method84(var16 >> 4, 4080);
                    var13[var15] = class15.method84(var16 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    public static final void method1163(boolean arg0) {
        if (arg0) {
            field2545 = null;
        }
        for (int var1 = 0; class289.field4761 > var1; ++var1) {
            int var2 = class41.field619[var1];
            class307 var3 = class57.field1002[var2];
            int var4 = class136.field2239.method1802((byte) 92);
            if ((var4 & 8) != 0) {
                var4 += class136.field2239.method1802((byte) -113) << 8;
            }
            if ((var4 & 1) != 0) {
                var3.field764 = class136.field2239.method1806(-1);
                if (~var3.field764 == -65536) {
                    var3.field764 = -1;
                }
            }
            if ((var4 & 64) != 0) {
                var3.field746 = class136.field2239.method1769(1);
                var3.field726 = 100;
            }
            if (~(var4 & 2) != -1) {
                int var5 = class136.field2239.method1767(255);
                int var6 = class136.field2239.method1794((byte) 76);
                var3.method290(class275.field4598, var5, var6, 0);
            }
            if ((var4 & 16) != 0) {
                int var7 = class136.field2239.method1794((byte) -74);
                int var8 = class136.field2239.method1767(255);
                var3.method290(class275.field4598, var7, var8, 0);
                var3.field733 = class275.field4598 + 300;
                var3.field748 = class136.field2239.method1767(255);
            }
            if ((var4 & 32) != 0) {
                int var9 = class136.field2239.method1787(-1);
                boolean var10 = true;
                if (~var9 == -65536) {
                    var9 = -1;
                }
                int var11 = class136.field2239.method1815(-1);
                if (var9 != -1 && var3.field757 != -1 && ~class34.method211(class258.method1847(-122, var9).field1404, 3).field2662 > ~class34.method211(class258.method1847(-120, var3.field757).field1404, 3).field2662) {
                    var10 = false;
                }
                if (var10) {
                    var3.field742 = 1;
                    var3.field757 = var9;
                    var3.field767 = 0;
                    var3.field747 = 0;
                    var3.field751 = class275.field4598 - -(var11 & 65535);
                    if (~class275.field4598 > ~var3.field751) {
                        var3.field747 = -1;
                    }
                    var3.field727 = var11 >> 16;
                    if (var3.field757 != -1 && ~class275.field4598 == ~var3.field751) {
                        int var12 = class258.method1847(-120, var3.field757).field1404;
                        if (var12 != -1) {
                            class163 var13 = class34.method211(var12, 3);
                            if (var13 != null && var13.field2639 != null) {
                                class131.method980(false, var3.field771, var3.field715, 0, (byte) -101, var13);
                            }
                        }
                    }
                }
            }
            if (~(var4 & 128) != -1) {
                if (var3.field4960.method341(true)) {
                    class115.method882(var3, (byte) -118);
                }
                var3.method2078(73, class217.method1551(7, class136.field2239.method1806(-1)));
                var3.method289((byte) -105, var3.field4960.field915);
                var3.field785 = var3.field4960.field959;
                var3.field792 = var3.field4960.field955;
                if (var3.field4960.method341(true)) {
                    class169.method1264(class182.field2898, var3, 0, var3.field717[0], var3.field711[0], (class1) null, (class123) null, 128, 0);
                }
            }
            if ((var4 & 256) != 0) {
                int var14 = class136.field2239.method1794((byte) 73);
                int[] var15 = new int[var14];
                int[] var16 = new int[var14];
                int[] var17 = new int[var14];
                for (int var18 = 0; var18 < var14; ++var18) {
                    int var19 = class136.field2239.method1787(-1);
                    if (var19 == 65535) {
                        var19 = -1;
                    }
                    var17[var18] = var19;
                    var16[var18] = class136.field2239.method1794((byte) 77);
                    var15[var18] = class136.field2239.method1818(arg0);
                }
                class145.method1072(var15, var16, var17, var3, -100);
            }
            if ((512 & var4) != 0) {
                var3.field781 = class136.field2239.method1787(-1);
                var3.field758 = class136.field2239.method1818(false);
            }
            if (~(4 & var4) != -1) {
                int var20 = class136.field2239.method1821((byte) 51);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class136.field2239.method1794((byte) 107);
                class182.method1326(var3, var20, var21, 229);
            }
        }
        ++field2542;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field2534;
        if (!arg0) {
            if (arg2 == 0) {
                this.field2546 = new class63[arg1.method1802((byte) 122)];
                for (int var4 = 0; var4 < this.field2546.length; ++var4) {
                    int var5 = arg1.method1802((byte) -123);
                    if (~var5 != -1) {
                        if (var5 != 1) {
                            if (var5 != 2) {
                                if (var5 == 3) {
                                    this.field2546[var4] = class260.method1857(arg1, 7269);
                                }
                            } else {
                                this.field2546[var4] = class40.method242(arg1, 20263);
                            }
                        } else {
                            this.field2546[var4] = class47.method297(arg1, 3162);
                        }
                    } else {
                        this.field2546[var4] = class246.method1754((byte) -98, arg1);
                    }
                }
            } else if (arg2 == 1) {
                super.field2896 = ~arg1.method1802((byte) 118) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method1162(95);
        }
        int[] var3 = super.field2911.method77(arg1, -108);
        if (super.field2911.field287) {
            this.method1160(super.field2911.method73(0), (byte) -89);
        }
        ++field2536;
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V")
    public class152() {
        super(0, true);
    }
}
