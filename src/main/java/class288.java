import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class288 extends class67 {

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "[J")
    private long[] field4665 = new long[10];

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    private int field4667 = 1;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "I")
    private int field4678 = 256;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    private int field4666 = 0;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "J")
    private long field4679 = class247.method1762(19166);

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "Lok;")
    private static class41 field4670 = class137.method956("Prepared sound engine", 45);

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "Lok;")
    public static class41 field4673 = class137.method956("lila:", 45);

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "Lok;")
    public static class41 field4677 = class137.method956(":", 45);

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "Lok;")
    public static class41 field4664 = field4670;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "Lok;")
    public static class41 field4675 = class137.method956(":", 45);

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Lok;")
    private static class41 field4668 = class137.method956("glow2:", 45);

    @OriginalMember(owner = "client!pf", name = "j", descriptor = "Lok;")
    public static class41 field4661 = field4668;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "Lok;")
    public static class41 field4671 = class137.method956(" (X", 45);

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "Lok;")
    public static class41 field4676 = field4668;

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public static int field4680 = 0;

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public static int field4662;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    private int field4669;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "Lmh;")
    public static class65 field4681;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IILbc;II)V", line = 5)
    public static final void method2010(int arg0, int arg1, class302 arg2, int arg3, int arg4) {
        field4682++;
        if (arg4 != 256) {
            return;
        }
        class234.method1685(-20783);
        if (class166.field2625) {
            class190.method1369(arg1, arg0, arg1 + arg2.field4936, arg2.field4949 + arg0);
        } else {
            class54.method375(arg1, arg0, arg1 + arg2.field4936, arg2.field4949 + arg0);
        }
        if (class5.field49 != 2 && class5.field49 != 5 && class88.field1298 != null) {
            int var5 = class8.field101 + class136.field2032 & 0x7FF;
            int var6 = class62.field913.field4280 / 32 + 48;
            int var7 = 464 - (class62.field913.field4311 / 32);
            if (class166.field2625) {
                ((class17) class88.field1298).method82(arg1, arg0, arg2.field4936, arg2.field4949, var6, var7, var5, class136.field2038 + 256, (class17) arg2.method2086(true, false));
            } else {
                ((class72) class88.field1298).method532(arg1, arg0, arg2.field4936, arg2.field4949, var6, var7, var5, class136.field2038 + 256, arg2.field4960, arg2.field5038);
            }
            if (class278.field4546 != null) {
                for (int var8 = 0; var8 < class278.field4546.field4760; var8++) {
                    if (class278.field4546.method2036(0, var8)) {
                        int var9 = (class278.field4546.field4759[var8] - class55.field809) * 4 + 2 - (class62.field913.field4311 / 32);
                        int var10 = (class278.field4546.field4762[var8] - class88.field1300) * 4 + 2 - (class62.field913.field4280 / 32);
                        int var11 = class31.field450[var5];
                        int var12 = class31.field455[var5];
                        int var13 = var11 * 256 / (class136.field2038 + 256);
                        int var14 = var12 * 256 / (class136.field2038 + 256);
                        int var15 = var9 * var14 - (var10 * var13) >> 16;
                        class253 var16 = class48.field749;
                        int var17 = var9 * var13 + var10 * var14 >> 16;
                        if (class278.field4546.method2032(var8, arg4 - 14436) == 1) {
                            var16 = class244.field3898;
                        }
                        if (class278.field4546.method2032(var8, -14180) == 2) {
                            var16 = class140.field2165;
                        }
                        int var18 = var16.method1786(class278.field4546.field4754[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg2.field4936 && arg2.field4936 >= var19 && -arg2.field4949 <= var15 && var15 <= arg2.field4949) {
                            int var20 = 16777215;
                            if (class278.field4546.field4768[var8] != -1) {
                                var20 = class278.field4546.field4768[var8];
                            }
                            if (class166.field2625) {
                                class190.method1367((class17) arg2.method2086(true, false));
                            } else {
                                class54.method374(arg2.field4960, arg2.field5038);
                            }
                            var16.method1792(class278.field4546.field4754[var8], arg2.field4936 / 2 + var19 + arg1, arg2.field4949 / 2 + arg0 - var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class166.field2625) {
                                class190.method1368();
                            } else {
                                class54.method384();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class5.field61; var21++) {
                int var22 = class8.field99[var21] * 4 - ((class62.field913.field4280 / 32) - 2);
                int var23 = class144.field2199[var21] * 4 + 2 - (class62.field913.field4311 / 32);
                class171 var24 = class234.method1684(-2441, class59.field845[var21]);
                if (var24.field2745 != null) {
                    var24 = var24.method1230(false);
                    if (var24 == null || var24.field2774 == -1) {
                        continue;
                    }
                }
                class305.method2106(false, arg2, arg1, arg0, var23, class8.field98[var24.field2774], var22);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class212 var27 = class81.field1199[class55.field807][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class62.field913.field4280 / 32);
                        int var29 = var26 * 4 + 2 - (class62.field913.field4311 / 32);
                        class305.method2106(false, arg2, arg1, arg0, var29, class139.field2141[0], var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class97.field1419; var30++) {
                class50 var31 = class216.field3471[class101.field1441[var30]];
                if (var31 != null && var31.method351(true)) {
                    class147 var32 = var31.field758;
                    if (var32 != null && var32.field2284 != null) {
                        var32 = var32.method1015(arg4 ^ 0xFFFFFEFF);
                    }
                    if (var32 != null && var32.field2268 && var32.field2235) {
                        int var33 = var31.field4280 / 32 - (class62.field913.field4280 / 32);
                        int var34 = var31.field4311 / 32 - (class62.field913.field4311 / 32);
                        class305.method2106(false, arg2, arg1, arg0, var34, class139.field2141[1], var33);
                    }
                }
            }
            for (int var35 = 0; var35 < class85.field1248; var35++) {
                class245 var36 = class246.field3955[class118.field1737[var35]];
                if (var36 != null && var36.method351(true)) {
                    int var37 = var36.field4280 / 32 - class62.field913.field4280 / 32;
                    int var38 = var36.field4311 / 32 - class62.field913.field4311 / 32;
                    boolean var39 = false;
                    long var40 = var36.field3933.method291((byte) 65);
                    for (int var42 = 0; var42 < class118.field1741; var42++) {
                        if (class65.field1001[var42] == var40 && class159.field2496[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class88.field1299; var44++) {
                        if (class271.field4379[var44].field844 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class62.field913.field3925 != 0 && var36.field3925 != 0 && class62.field913.field3925 == var36.field3925) {
                        var45 = true;
                    }
                    if (var39) {
                        class305.method2106(false, arg2, arg1, arg0, var38, class139.field2141[3], var37);
                    } else if (var43) {
                        class305.method2106(false, arg2, arg1, arg0, var38, class139.field2141[5], var37);
                    } else if (var45) {
                        class305.method2106(false, arg2, arg1, arg0, var38, class139.field2141[4], var37);
                    } else {
                        class305.method2106(false, arg2, arg1, arg0, var38, class139.field2141[2], var37);
                    }
                }
            }
            int var46 = 0;
            class162[] var47 = class35.field529;
            while (var47.length > var46) {
                class162 var48 = var47[var46];
                if (var48 != null && var48.field2584 != 0 && class18.field234 % 20 < 10) {
                    if (var48.field2584 == 1 && var48.field2571 >= 0 && var48.field2571 < class216.field3471.length) {
                        class50 var49 = class216.field3471[var48.field2571];
                        if (var49 != null) {
                            int var50 = var49.field4280 / 32 - (class62.field913.field4280 / 32);
                            int var51 = var49.field4311 / 32 - class62.field913.field4311 / 32;
                            class216.method1560(arg0, arg2, arg1, var48.field2583, var51, (byte) 101, var50);
                        }
                    }
                    if (var48.field2584 == 2) {
                        int var52 = (var48.field2580 - class55.field809) * 4 + 2 - (class62.field913.field4311 / 32);
                        int var53 = (var48.field2577 - class88.field1300) * 4 + 2 - (class62.field913.field4280 / 32);
                        class216.method1560(arg0, arg2, arg1, var48.field2583, var52, (byte) 101, var53);
                    }
                    if (var48.field2584 == 10 && var48.field2571 >= 0 && class246.field3955.length > var48.field2571) {
                        class245 var54 = class246.field3955[var48.field2571];
                        if (var54 != null) {
                            int var55 = var54.field4280 / 32 - (class62.field913.field4280 / 32);
                            int var56 = var54.field4311 / 32 - (class62.field913.field4311 / 32);
                            class216.method1560(arg0, arg2, arg1, var48.field2583, var56, (byte) 101, var55);
                        }
                    }
                }
                var46++;
            }
            if (class124.field1846 != 0) {
                int var57 = class124.field1846 * 4 + 2 - class62.field913.field4280 / 32;
                int var58 = class107.field1506 * 4 + 2 - (class62.field913.field4311 / 32);
                class305.method2106(false, arg2, arg1, arg0, var58, class105.field1493, var57);
            }
            if (class166.field2625) {
                class190.method1363(arg2.field4936 / 2 + arg1 - 1, arg0 - -(arg2.field4949 / 2) - 1, 3, 3, 16777215);
            } else {
                class54.method383(arg1 + (arg2.field4936 / 2) - 1, arg2.field4949 / 2 + arg0 + -1, 3, 3, 16777215);
            }
        } else if (class166.field2625) {
            class199 var59 = arg2.method2086(true, false);
            if (var59 != null) {
                var59.method83(arg1, arg0);
            }
        } else {
            class54.method385(arg1, arg0, 0, arg2.field4960, arg2.field5038);
        }
        class165.field2615[arg3] = true;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 342)
    public final int method489(int arg0, int arg1, int arg2) {
        field4674++;
        if (arg2 >= -12) {
            method2013(-35);
        }
        int var4 = this.field4678;
        this.field4678 = 300;
        int var5 = this.field4667;
        this.field4667 = 1;
        this.field4679 = class247.method1762(19166);
        if (this.field4665[this.field4669] == 0L) {
            this.field4678 = var4;
            this.field4667 = var5;
        } else if (this.field4679 > this.field4665[this.field4669]) {
            this.field4678 = (int) ((long) (arg0 * 2560) / (this.field4679 - this.field4665[this.field4669]));
        }
        if (this.field4678 < 25) {
            this.field4678 = 25;
        }
        if (this.field4678 > 256) {
            this.field4678 = 256;
            this.field4667 = (int) ((long) arg0 - ((this.field4679 - this.field4665[this.field4669]) / 10L));
        }
        if (this.field4667 > arg0) {
            this.field4667 = arg0;
        }
        this.field4665[this.field4669] = this.field4679;
        this.field4669 = (this.field4669 + 1) % 10;
        if (this.field4667 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4665[var6] != 0L) {
                    this.field4665[var6] -= -((long) this.field4667);
                }
            }
        }
        if (this.field4667 < arg1) {
            this.field4667 = arg1;
        }
        class300.method2068(123, (long) this.field4667);
        int var7 = 0;
        while (this.field4666 < 256) {
            this.field4666 += this.field4678;
            var7++;
        }
        this.field4666 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 423)
    public final void method490(boolean arg0) {
        if (!arg0) {
            method2011(7, -30, (class302[]) null);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4665[var2] = 0L;
        }
        field4662++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II[Lbc;)V", line = 445)
    public static final void method2011(int arg0, int arg1, class302[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class302 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4951 == 0) {
                    if (var4.field4988 != null) {
                        method2011(arg0, -25695, var4.field4988);
                    }
                    class187 var5 = (class187) class113.field1658.method617((long) var4.field4910, false);
                    if (var5 != null) {
                        class228.method1635(arg0, var5.field3052, 23);
                    }
                }
                if (arg0 == 0 && var4.field4942 != null) {
                    class73 var6 = new class73();
                    var6.field1083 = var4.field4942;
                    var6.field1079 = var4;
                    class161.method1141(var6, true);
                }
                if (arg0 == 1 && var4.field4954 != null) {
                    if (var4.field4996 >= 0) {
                        class302 var7 = class165.method1157(false, var4.field4910);
                        if (var7 == null || var7.field4988 == null || var7.field4988.length <= var4.field4996 || var7.field4988[var4.field4996] != var4) {
                            continue;
                        }
                    }
                    class73 var8 = new class73();
                    var8.field1083 = var4.field4954;
                    var8.field1079 = var4;
                    class161.method1141(var8, true);
                }
            }
        }
        if (arg1 != -25695) {
            method2013(-108);
        }
        field4672++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V", line = 527)
    public static final void method2012(byte arg0, int arg1) {
        field4663++;
        if (arg0 == -85) {
            class70.field1060.method138(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V", line = 573)
    public class288() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4665[var1] = this.field4679;
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V", line = 556)
    public static void method2013(int arg0) {
        field4681 = null;
        field4677 = null;
        field4671 = null;
        field4673 = null;
        field4676 = null;
        field4670 = null;
        field4664 = null;
        field4661 = null;
        field4668 = null;
        field4675 = null;
        if (arg0 != 24884) {
            field4664 = (class41) null;
        }
    }
}
