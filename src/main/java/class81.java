import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class81 extends class222 {

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    private int field1429 = 4096;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "Z")
    private boolean field1432 = true;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    public static int field1436 = 0;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field1433 = 0;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "Lca;")
    public static class102 field1425;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "Lve;")
    public static class174 field1424;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIILui;Lq;Lui;)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, class73 arg5, class148 arg6, class73 arg7) {
        class245.field4256 = arg1;
        class245.field4286 = arg4;
        class229.field3941 = arg6;
        class146.field2563 = arg2;
        ++field1428;
        class106.field1908 = arg3;
        if (class252.field4416 == null) {
            class99.field1744 = true;
            if (class117.field2101 == null) {
                class117.field2101 = client.method770(class125.field2258, 0, class31.field549, 0);
            }
            if (class108.field1940 == null) {
                class108.field1940 = class49.method384(class31.field549, 0, 0, class194.field3365);
            }
            if (class157.field2854 == null) {
                class157.field2854 = class49.method384(class31.field549, 0, 0, class189.field3272);
            }
            if (class153.field2801 == null) {
                class153.field2801 = class49.method384(class31.field549, 0, arg0 + -18550, class166.field2968);
            }
            int var8 = class146.field2563 / 5;
            int var9 = class146.field2563 / 5 * 4;
            class128.method968(class106.field1908, class245.field4256, class146.field2563, class245.field4286, 0, 168);
            class128.method977(class106.field1908, class245.field4256, var8, 23, 12425273, 9135624);
            class128.method977(class106.field1908 + var8, class245.field4256, var9, 23, 5197647, 2697513);
            arg5.method543(class11.field220, var8 / 2 + class106.field1908, class245.field4256 + 15, 0, -1);
            if (class153.field2801 != null) {
                class153.field2801[1].method259(class106.field1908 + var8 + 2, class245.field4256 - -1);
                arg7.method531(class206.field3515, class106.field1908 - -var8 + 12, class245.field4256 - -10, 16777215, -1);
                class153.field2801[0].method259(class106.field1908 + 2 + var8, class245.field4256 - -12);
                arg7.method531(class33.field582, class106.field1908 + var8 + 12, class245.field4256 + 21, 16777215, -1);
            }
            if (class157.field2854 != null) {
                int var10 = var8 - -140 + class106.field1908;
                if (~class202.field3451[0] == -1 && ~class43.field724[0] == -1) {
                    class157.field2854[2].method259(var10, class245.field4256 + 4);
                } else {
                    class157.field2854[0].method259(var10, class245.field4256 - -4);
                }
                if (class202.field3451[0] == 0 && class43.field724[0] == 1) {
                    class157.field2854[3].method259(var10 + 15, class245.field4256 - -4);
                } else {
                    class157.field2854[1].method259(var10 + 15, class245.field4256 - -4);
                }
                arg5.method531(class74.field1264, var10 + 32, class245.field4256 + 17, 16777215, -1);
                int var11 = var8 + 250 + class106.field1908;
                if (~class202.field3451[0] == -2 && ~class43.field724[0] == -1) {
                    class157.field2854[2].method259(var11, class245.field4256 + 4);
                } else {
                    class157.field2854[0].method259(var11, class245.field4256 + 4);
                }
                if (~class202.field3451[0] == -2 && ~class43.field724[0] == -2) {
                    class157.field2854[3].method259(var11 + 15, class245.field4256 + 4);
                } else {
                    class157.field2854[1].method259(var11 + 15, class245.field4256 + 4);
                }
                arg5.method531(class206.field3527, var11 + 32, class245.field4256 + 17, 16777215, -1);
                int var12 = class106.field1908 + 360 + var8;
                if (~class202.field3451[0] == -3 && ~class43.field724[0] == -1) {
                    class157.field2854[2].method259(var12, class245.field4256 + 4);
                } else {
                    class157.field2854[0].method259(var12, class245.field4256 + 4);
                }
                if (~class202.field3451[0] == -3 && class43.field724[0] == 1) {
                    class157.field2854[3].method259(var12 + 15, class245.field4256 + 4);
                } else {
                    class157.field2854[1].method259(var12 + 15, class245.field4256 + 4);
                }
                arg5.method531(class194.field3367, var12 + 32, class245.field4256 - -17, 16777215, -1);
                int var13 = class106.field1908 - -var8 + 470;
                if (class202.field3451[0] == 3 && class43.field724[0] == 0) {
                    class157.field2854[2].method259(var13, class245.field4256 + 4);
                } else {
                    class157.field2854[0].method259(var13, class245.field4256 + 4);
                }
                if (~class202.field3451[0] == -4 && ~class43.field724[0] == -2) {
                    class157.field2854[3].method259(var13 + 15, class245.field4256 + 4);
                } else {
                    class157.field2854[1].method259(var13 - -15, class245.field4256 - -4);
                }
                arg5.method531(class146.field2561, var13 + 32, class245.field4256 + 17, 16777215, -1);
            }
            class128.method967(class146.field2563 + -58 - 10, class245.field4256 + 4, 58, 16, 0);
            class10.field219 = -1;
            if (class117.field2101 != null) {
                byte var14 = 88;
                int var15 = class146.field2563 / (var14 + 1);
                byte var16 = 19;
                int var17 = (class245.field4286 + -23) / (var16 + 1);
                int var18;
                int var19;
                do {
                    var18 = var15;
                    if (~class155.field2842 >= ~((var15 - 1) * var17)) {
                        --var15;
                    }
                    var19 = var17;
                    if ((var17 + -1) * var15 >= class155.field2842) {
                        --var17;
                    }
                    if (class155.field2842 <= (var17 + -1) * var15) {
                        --var17;
                    }
                } while (var17 != var19 || var15 != var18);
                int var20 = (-(var14 * var15) + class146.field2563) / (var15 + 1);
                if (~var20 < -6) {
                    var20 = 5;
                }
                int var21 = (-(var16 * var17) + class245.field4286 + -23) / (var17 + 1);
                int var22 = (-(var14 * var15) + class146.field2563 + -((var15 + -1) * var20)) / 2;
                int var23 = var22;
                if (~var21 < -6) {
                    var21 = 5;
                }
                int var24 = 0;
                int var25 = (class245.field4286 - (var16 * var17 - -((var17 + -1) * var21) + 23)) / 2;
                int var26 = var25 + 23;
                for (int var27 = 0; class155.field2842 > var27; ++var27) {
                    class189 var28 = class229.field3947[var27];
                    boolean var29 = true;
                    class98 var30 = class125.method930(arg0 + 7354, var28.field3265);
                    if (~var28.field3265 == 0) {
                        var30 = class242.field4200;
                        var29 = false;
                    } else if (~var28.field3265 < -1981) {
                        var29 = false;
                        var30 = class265.field4631;
                    }
                    if (~class75.field1322 <= ~var23 && class199.field3426 >= var26 && var14 + var23 > class75.field1322 && class199.field3426 < var16 + var26 && var29) {
                        class10.field219 = var27;
                        class117.field2101[var28.field3269 ? 1 : 0].method612(class106.field1908 - -var23, class245.field4256 - -var26, 128, 16777215);
                    } else {
                        class117.field2101[!var28.field3269 ? 0 : 1].method618(class106.field1908 - -var23, class245.field4256 - -var26);
                    }
                    if (class108.field1940 != null) {
                        class108.field1940[var28.field3262 + (!var28.field3269 ? 0 : class108.field1940.length / 2)].method259(class106.field1908 - -var23 + 29, class245.field4256 + var26);
                    }
                    arg5.method543(class125.method930(25904, var28.field3276), class106.field1908 + var23 - -15, var16 / 2 + class245.field4256 - -var26 + 5, 0, -1);
                    arg7.method543(var30, var23 + 60 + class106.field1908, var16 / 2 + var26 + class245.field4256 + 5, 268435455, -1);
                    var26 += var16 + var21;
                    ++var24;
                    if (var17 <= var24) {
                        var24 = 0;
                        var26 = 23 - -var25;
                        var23 += var20 - -var14;
                    }
                }
            }
            if (arg0 != 18550) {
                method608(-104);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(I)V")
    public static final void method607(int arg0) {
        ++field1437;
        int var1 = field1434;
        int var2 = class14.field258;
        int var3 = class88.field1553;
        int var4 = class41.field670;
        int var5 = 6116423;
        class128.method967(var1, var3, var2, var4, var5);
        class128.method967(var1 - -1, var3 + 1, var2 + -2, 16, 0);
        if (arg0 <= -11) {
            class128.method963(var1 + 1, var3 + 18, var2 + -2, var4 + -19, 0);
            class90.field1581.method531(class161.field2923, var1 + 3, var3 + 14, var5, -1);
            int var6 = class199.field3426;
            int var7 = class75.field1322;
            for (int var8 = 0; ~class226.field3894 < ~var8; ++var8) {
                int var9 = (class226.field3894 + -1 + -var8) * 15 + 31 + var3;
                int var10 = 16777215;
                if (var7 > var1 && var7 < var1 + var2 && var9 + -13 < var6 && var6 < var9 + 3) {
                    var10 = 16776960;
                }
                class90.field1581.method531(class36.method302(var8, 0), var1 + 3, var9, var10, 0);
            }
            class15.method126(field1434, class41.field670, class14.field258, -122, class88.field1553);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (arg1) {
            field1425 = null;
        }
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field1432 = arg0.method1446(5350) == 1;
            }
        } else {
            this.field1429 = arg0.method1487(80);
        }
        ++field1426;
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class81() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field1431;
        if (arg1 != 1) {
            this.method4(4, -102);
        }
        int[][] var3 = super.field3834.method627(arg1 + 4102, arg0);
        if (super.field3834.field1486) {
            int[] var4 = this.method1537((byte) 101, 0, class191.field3299 & arg0 + -1);
            int[] var5 = this.method1537((byte) 47, 0, arg0);
            int[] var6 = this.method1537((byte) 47, 0, class191.field3299 & arg0 - -1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class13.field253; ++var10) {
                int var11 = (var6[var10] - var4[var10]) * this.field1429;
                int var12 = (var5[class162.field2924 & var10 + 1] + -var5[var10 - 1 & class162.field2924]) * this.field1429;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 + 4096 - -var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var18 = 16777216 / var17;
                    var19 = var12 / var17;
                }
                if (this.field1432) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(I)V")
    public static void method608(int arg0) {
        field1425 = null;
        field1424 = null;
        if (arg0 != 470) {
            method609(-83, 115);
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(II)I")
    public static final int method609(int arg0, int arg1) {
        int var2 = 86 / ((arg0 - 35) / 37);
        ++field1438;
        return arg1 & 255;
    }
}
