import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class105 extends class5 {

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    private int field2670 = 128;

    @OriginalMember(owner = "client!rc", name = "fb", descriptor = "I")
    private int field2681 = 0;

    @OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
    private int field2673 = 0;

    @OriginalMember(owner = "client!rc", name = "eb", descriptor = "I")
    private int field2680 = 0;

    @OriginalMember(owner = "client!rc", name = "jb", descriptor = "[I")
    private int[] field2685 = new int[6];

    @OriginalMember(owner = "client!rc", name = "pb", descriptor = "I")
    private int field2691 = 128;

    @OriginalMember(owner = "client!rc", name = "W", descriptor = "I")
    public int field2672 = -1;

    @OriginalMember(owner = "client!rc", name = "nb", descriptor = "[I")
    private int[] field2689 = new int[6];

    @OriginalMember(owner = "client!rc", name = "bb", descriptor = "Lhb;")
    private static class44 field2677 = class102.method810("cyan:", -28606);

    @OriginalMember(owner = "client!rc", name = "qb", descriptor = "Lhb;")
    public static class44 field2692 = field2677;

    @OriginalMember(owner = "client!rc", name = "ob", descriptor = "[Lwd;")
    public static class131[] field2690 = new class131[2048];

    @OriginalMember(owner = "client!rc", name = "kb", descriptor = "I")
    public static int field2686 = 0;

    @OriginalMember(owner = "client!rc", name = "lb", descriptor = "I")
    public static int field2687 = 0;

    @OriginalMember(owner = "client!rc", name = "ab", descriptor = "Lfc;")
    public static class34 field2676 = new class34(64);

    @OriginalMember(owner = "client!rc", name = "V", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!rc", name = "Y", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!rc", name = "Z", descriptor = "I")
    public int field2675;

    @OriginalMember(owner = "client!rc", name = "cb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!rc", name = "gb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!rc", name = "hb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!rc", name = "ib", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rc", name = "rb", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!rc", name = "sb", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!rc", name = "tb", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!rc", name = "ub", descriptor = "I")
    private int field2696;

    @OriginalMember(owner = "client!rc", name = "vb", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!rc", name = "wb", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!rc", name = "mb", descriptor = "Lqd;")
    public static class100 field2688;

    @OriginalMember(owner = "client!rc", name = "xb", descriptor = "Lqd;")
    public static class100 field2699;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "Lpc;")
    public static class93 field2669;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lwd;I)V", line = 4)
    public final void method823(class131 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method971(true);
            if (var3 == 0) {
                int var4 = 88 / ((arg1 + 70) / 56);
                field2679++;
                return;
            }
            this.method827(arg0, 50, var3);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 32)
    public static void method824(byte arg0) {
        field2676 = null;
        field2692 = null;
        field2690 = null;
        field2677 = null;
        if (arg0 < -64) {
            field2699 = null;
            field2688 = null;
            field2669 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILtd;)Z", line = 48)
    public static final boolean method825(int arg0, int arg1, class116 arg2) {
        byte[] var3 = arg2.method894(0, arg1);
        field2695++;
        if (arg0 > -19) {
            return true;
        } else if (var3 == null) {
            return false;
        } else {
            class49.method458(30686, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)Lde;", line = 76)
    public final class24 method826(int arg0, int arg1) {
        field2671++;
        class24 var3 = (class24) class31.field765.method330((long) this.field2675, arg0);
        if (var3 == null) {
            var3 = class24.method183(class44.field1050, this.field2696, 0);
            if (var3 == null) {
                return null;
            }
            for (int var4 = 0; var4 < 6; var4++) {
                if (this.field2689[0] != 0) {
                    var3.method192(this.field2689[var4], this.field2685[var4]);
                }
            }
            var3.method181();
            var3.method193(this.field2673 + 64, 850 - -this.field2681, -30, -50, -30, true);
            class31.field765.method332(var3, 0, (long) this.field2675);
        }
        class24 var5;
        if (this.field2672 == -1 || arg1 == -1) {
            var5 = var3.method208(true);
        } else {
            var5 = client.method139(1, this.field2672).method912((byte) 102, arg1, var3);
        }
        if (this.field2670 != 128 || this.field2691 != 128) {
            var5.method204(this.field2670, this.field2691, this.field2670);
        }
        if (this.field2680 != 0) {
            if (this.field2680 == 90) {
                var5.method194();
            }
            if (this.field2680 == 180) {
                var5.method194();
                var5.method194();
            }
            if (this.field2680 == 270) {
                var5.method194();
                var5.method194();
                var5.method194();
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lwd;II)V", line = 141)
    private final void method827(class131 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field2696 = arg0.method1001(65280);
        } else if (arg2 == 2) {
            this.field2672 = arg0.method1001(arg1 ^ 0xFF32);
        } else if (arg2 == 4) {
            this.field2670 = arg0.method1001(65280);
        } else if (arg2 == 5) {
            this.field2691 = arg0.method1001(65280);
        } else if (arg2 == 6) {
            this.field2680 = arg0.method1001(65280);
        } else if (arg2 == 7) {
            this.field2673 = arg0.method971(true);
        } else if (arg2 == 8) {
            this.field2681 = arg0.method971(true);
        } else if (arg2 >= 40 && arg2 < 50) {
            this.field2689[arg2 - 40] = arg0.method1001(65280);
        } else if (arg2 >= 50 && arg2 < 60) {
            this.field2685[arg2 - 50] = arg0.method1001(65280);
        }
        field2697++;
        if (arg1 != 50) {
            method828(-71);
        }
    }

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "(I)V", line = 231)
    public static final void method828(int arg0) {
        if (arg0 == 20183) {
            field2693++;
            class116.field2842.method335((byte) 98);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BZ)V", line = 258)
    public static final void method829(byte arg0, boolean arg1) {
        field2694++;
        if (class72.field1820.field1384 >> 7 == class90.field2301 && class72.field1820.field1371 >> 7 == class116.field2838) {
            class90.field2301 = 0;
        }
        int var2 = class125.field3020;
        if (arg1) {
            var2 = 1;
        }
        int var3 = 7 % ((-arg0 - 57) / 63);
        for (int var4 = 0; var4 < var2; var4++) {
            int var5;
            class103 var6;
            if (arg1) {
                var6 = class72.field1820;
                var5 = 33538048;
            } else {
                var5 = class118.field2913[var4] << 14;
                var6 = class82.field2110[class118.field2913[var4]];
            }
            if (var6 != null && var6.method432((byte) -106)) {
                int var7 = var6.field1384 >> 7;
                var6.field2636 = false;
                if ((class81.field2085 && class125.field3020 > 50 || class125.field3020 > 200) && !arg1 && var6.field1388 == var6.field1361) {
                    var6.field2636 = true;
                }
                int var8 = var6.field1371 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field2639 == null || class2.field73 < var6.field2627 || var6.field2647 <= class2.field73) {
                        if ((var6.field1384 & 0x7F) == 64 && (var6.field1371 & 0x7F) == 64) {
                            if (class72.field1815[var7][var8] == class34.field840) {
                                continue;
                            }
                            class72.field1815[var7][var8] = class34.field840;
                        }
                        var6.field2644 = class55.method507(var6.field1371, class79.field1993, var6.field1384, -1);
                        class89.field2283.method259(class79.field1993, var6.field1384, var6.field1371, var6.field2644, 60, var6, var6.field1419, var5, var6.field1339);
                    } else {
                        var6.field2636 = false;
                        var6.field2644 = class55.method507(var6.field1371, class79.field1993, var6.field1384, -1);
                        class89.field2283.method255(class79.field1993, var6.field1384, var6.field1371, var6.field2644, 60, var6, var6.field1419, var5, var6.field2621, var6.field2638, var6.field2637, var6.field2643);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V", line = 348)
    public static final void method830(boolean arg0) {
        if (class56.field1423.toLowerCase().indexOf("microsoft") == -1) {
            class69.field1710[44] = 71;
            class69.field1710[45] = 26;
            class69.field1710[46] = 72;
            class69.field1710[47] = 73;
            class69.field1710[59] = 57;
            class69.field1710[61] = 27;
            class69.field1710[91] = 42;
            class69.field1710[92] = 74;
            class69.field1710[93] = 43;
            if (class56.field1424 == null) {
                class69.field1710[192] = 58;
                class69.field1710[222] = 59;
            } else {
                class69.field1710[192] = 28;
                class69.field1710[222] = 58;
                class69.field1710[520] = 59;
            }
        } else {
            class69.field1710[186] = 57;
            class69.field1710[187] = 27;
            class69.field1710[188] = 71;
            class69.field1710[189] = 26;
            class69.field1710[190] = 72;
            class69.field1710[191] = 73;
            class69.field1710[192] = 58;
            class69.field1710[219] = 42;
            class69.field1710[220] = 74;
            class69.field1710[221] = 43;
            class69.field1710[222] = 59;
            class69.field1710[223] = 28;
        }
        if (!arg0) {
            method824((byte) -95);
        }
        field2698++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[BB)I", line = 398)
    public static final int method831(int arg0, byte[] arg1, byte arg2) {
        field2674++;
        return arg2 < 80 ? 69 : class102.method804((byte) -23, 0, arg0, arg1);
    }
}
