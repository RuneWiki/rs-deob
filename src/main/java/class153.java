import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class153 {

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    private int field2294 = 0;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public int field2293;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "[Lid;")
    public class247[] field2286;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2276;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field2281;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2284;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
    private long field2279;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Lid;")
    private class247 field2292;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lid;")
    private class247 field2295;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILid;J)V")
    public final void method1054(int arg0, class247 arg1, long arg2) {
        if (arg1.field4017 != null) {
            arg1.method1764(64);
        }
        field2289++;
        class247 var5 = this.field2286[(int) ((long) (this.field2293 - 1) & arg2)];
        arg1.field4013 = var5;
        arg1.field4017 = var5.field4017;
        arg1.field4017.field4013 = arg1;
        arg1.field4013.field4017 = arg1;
        arg1.field4018 = arg2;
        if (arg0 != -3510) {
            this.method1068(81);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)V")
    public static final void method1055(byte arg0, int arg1) {
        field2284++;
        if (arg0 > -63) {
            field2288 = -111;
        }
        class181 var2 = class95.method652(4, (byte) 34, arg1);
        var2.method1283(192);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Z")
    public static final boolean method1056(boolean arg0) {
        field2280++;
        if (class293.field4697) {
            try {
                class25.method132(class95.field1425.field3832, "showVideoAd", (byte) 84);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0) {
            method1062(34);
        }
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method1057(int arg0) {
        field2277++;
        if (arg0 <= 87) {
            this.field2292 = null;
        }
        for (int var2 = 0; var2 < this.field2293; var2++) {
            class247 var3 = this.field2286[var2];
            while (true) {
                class247 var4 = var3.field4013;
                if (var3 == var4) {
                    break;
                }
                var4.method1764(64);
            }
        }
        this.field2295 = null;
        this.field2292 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLim;)V")
    public static final void method1058(boolean arg0, class170 arg1) {
        field2285++;
        byte[] var2 = new byte[24];
        if (arg0) {
            field2288 = 95;
        }
        if (class231.field3690 != null) {
            try {
                int var3 = 0;
                class231.field3690.method1815(0L, (byte) 98);
                class231.field3690.method1813(var2, (byte) -107);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1174(24, 897, 0, var2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method1059(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class68.field1016++;
        class59.field867 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class62.field904; var12 < class312.field5002; var12++) {
            class113[][] var38 = class184.field2892[var12];
            for (int var39 = class264.field4286; var39 < class232.field3755; var39++) {
                for (int var40 = class212.field3301; var40 < class304.field4834; var40++) {
                    class113 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class33.field394[var39 + class303.field4815 - class32.field386][var40 + class303.field4815 - class286.field4622] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field1632 = true;
                            var41.field1629 = true;
                            if (var41.field1646 > 0) {
                                var41.field1644 = true;
                            } else {
                                var41.field1644 = false;
                            }
                            class59.field867++;
                        } else {
                            var41.field1632 = false;
                            var41.field1629 = false;
                            var41.field1651 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field1640 != null) {
                                    class263 var42 = var41.field1640;
                                    var42.field4281.method3(0, var12, var42.field4274, var42.field4283, var42.field4280);
                                    if (var42.field4275 != null) {
                                        var42.field4275.method3(0, var12, var42.field4274, var42.field4283, var42.field4280);
                                    }
                                }
                                if (var41.field1649 != null) {
                                    class165 var43 = var41.field1649;
                                    var43.field2552.method3(var43.field2554, var12, var43.field2549, var43.field2545, var43.field2546);
                                    if (var43.field2555 != null) {
                                        var43.field2555.method3(var43.field2554, var12, var43.field2549, var43.field2545, var43.field2546);
                                    }
                                }
                                if (var41.field1650 != null) {
                                    class58 var44 = var41.field1650;
                                    var44.field856.method3(0, var12, var44.field860, var44.field854, var44.field851);
                                }
                                if (var41.field1634 != null) {
                                    for (int var45 = 0; var45 < var41.field1646; var45++) {
                                        class158 var46 = var41.field1634[var45];
                                        var46.field2365.method3(var46.field2362, var12, var46.field2355, var46.field2361, var46.field2353);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class8.field114 == class79.field1192;
        for (int var14 = class62.field904; var14 < class312.field5002; var14++) {
            class113[][] var27 = class184.field2892[var14];
            for (int var28 = -class303.field4815; var28 <= 0; var28++) {
                int var29 = class32.field386 + var28;
                int var30 = class32.field386 - var28;
                if (var29 >= class264.field4286 || var30 < class232.field3755) {
                    for (int var31 = -class303.field4815; var31 <= 0; var31++) {
                        int var32 = class286.field4622 + var31;
                        int var33 = class286.field4622 - var31;
                        if (var29 >= class264.field4286) {
                            if (var32 >= class212.field3301) {
                                class113 var34 = var27[var29][var32];
                                if (var34 != null && var34.field1632) {
                                    class302.method2032(var34, true);
                                }
                            }
                            if (var33 < class304.field4834) {
                                class113 var35 = var27[var29][var33];
                                if (var35 != null && var35.field1632) {
                                    class302.method2032(var35, true);
                                }
                            }
                        }
                        if (var30 < class232.field3755) {
                            if (var32 >= class212.field3301) {
                                class113 var36 = var27[var30][var32];
                                if (var36 != null && var36.field1632) {
                                    class302.method2032(var36, true);
                                }
                            }
                            if (var33 < class304.field4834) {
                                class113 var37 = var27[var30][var33];
                                if (var37 != null && var37.field1632) {
                                    class302.method2032(var37, true);
                                }
                            }
                        }
                        if (class59.field867 == 0) {
                            if (!var13) {
                                class198.field3142 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class62.field904; var15 < class312.field5002; var15++) {
            class113[][] var16 = class184.field2892[var15];
            for (int var17 = -class303.field4815; var17 <= 0; var17++) {
                int var18 = class32.field386 + var17;
                int var19 = class32.field386 - var17;
                if (var18 >= class264.field4286 || var19 < class232.field3755) {
                    for (int var20 = -class303.field4815; var20 <= 0; var20++) {
                        int var21 = class286.field4622 + var20;
                        int var22 = class286.field4622 - var20;
                        if (var18 >= class264.field4286) {
                            if (var21 >= class212.field3301) {
                                class113 var23 = var16[var18][var21];
                                if (var23 != null && var23.field1632) {
                                    class302.method2032(var23, false);
                                }
                            }
                            if (var22 < class304.field4834) {
                                class113 var24 = var16[var18][var22];
                                if (var24 != null && var24.field1632) {
                                    class302.method2032(var24, false);
                                }
                            }
                        }
                        if (var19 < class232.field3755) {
                            if (var21 >= class212.field3301) {
                                class113 var25 = var16[var19][var21];
                                if (var25 != null && var25.field1632) {
                                    class302.method2032(var25, false);
                                }
                            }
                            if (var22 < class304.field4834) {
                                class113 var26 = var16[var19][var22];
                                if (var26 != null && var26.field1632) {
                                    class302.method2032(var26, false);
                                }
                            }
                        }
                        if (class59.field867 == 0) {
                            if (!var13) {
                                class198.field3142 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class198.field3142 = false;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)[Lnj;")
    public static final class215[] method1060(byte arg0) {
        field2275++;
        class215[] var1 = new class215[class139.field2000];
        if (arg0 <= 99) {
            field2288 = 14;
        }
        for (int var2 = 0; var2 < class139.field2000; var2++) {
            int var3 = class64.field924[var2] * class284.field4603[var2];
            byte[] var4 = class190.field2959[var2];
            if (class281.field4576[var2]) {
                byte[] var7 = class50.field631[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class243.method1723(class205.method1411(255, var7[var9]) << 24, class229.field3539[class205.method1411(255, var4[var9])]);
                }
                var1[var2] = new class149(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class229.field3539[class205.method1411(var4[var6], 255)];
                }
                var1[var2] = new class48(class15.field215, class86.field1308, class166.field2569[var2], class277.field4480[var2], class64.field924[var2], class284.field4603[var2], var5);
            }
        }
        class115.method762((byte) -42);
        return var1;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1061(int arg0, int arg1, int arg2, int arg3) {
        if (class277.method1911(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class117.method773(var4 + 1, class8.field114[arg0][arg1][arg2] + arg3, var5 + 1) && class117.method773(var4 + 128 - 1, class8.field114[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class117.method773(var4 + 128 - 1, class8.field114[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class117.method773(var4 + 1, class8.field114[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method1062(int arg0) {
        if (arg0 != 8488) {
            method1061(103, -40, 18, -58);
        }
        class150.field2218.method445(58, 7);
        class45.field538++;
        class150.field2218.method1180(-17437, class233.field3770);
        field2278++;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I")
    public final int method1063(int arg0) {
        field2287++;
        int var2 = 0;
        for (int var3 = arg0; var3 < this.field2293; var3++) {
            class247 var4 = this.field2286[var3];
            class247 var5 = var4.field4013;
            while (var4 != var5) {
                var5 = var5.field4013;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)Lid;")
    public final class247 method1064(int arg0, long arg1) {
        this.field2279 = arg1;
        field2276++;
        class247 var4 = this.field2286[(int) ((long) (this.field2293 + arg0) & arg1)];
        for (this.field2292 = var4.field4013; this.field2292 != var4; this.field2292 = this.field2292.field4013) {
            if (this.field2292.field4018 == arg1) {
                class247 var5 = this.field2292;
                this.field2292 = this.field2292.field4013;
                return var5;
            }
        }
        this.field2292 = null;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Lid;")
    public final class247 method1065(byte arg0) {
        field2290++;
        if (arg0 != -59) {
            field2288 = -89;
        }
        this.field2294 = 0;
        return this.method1066(arg0 ^ 0x41);
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)Lid;")
    public final class247 method1066(int arg0) {
        if (arg0 >= -121) {
            return null;
        }
        field2291++;
        if (this.field2294 > 0 && this.field2286[this.field2294 - 1] != this.field2295) {
            class247 var2 = this.field2295;
            this.field2295 = var2.field4013;
            return var2;
        }
        while (this.field2293 > this.field2294) {
            class247 var3 = this.field2286[this.field2294++].field4013;
            if (this.field2286[this.field2294 - 1] != var3) {
                this.field2295 = var3.field4013;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)Lid;")
    public final class247 method1067(int arg0) {
        field2281++;
        if (this.field2292 == null) {
            return null;
        }
        class247 var2 = this.field2286[(int) (this.field2279 & (long) (this.field2293 + arg0))];
        while (this.field2292 != var2) {
            if (this.field2292.field4018 == this.field2279) {
                class247 var3 = this.field2292;
                this.field2292 = this.field2292.field4013;
                return var3;
            }
            this.field2292 = this.field2292.field4013;
        }
        this.field2292 = null;
        return null;
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)I")
    public final int method1068(int arg0) {
        if (arg0 != 1) {
            this.method1068(120);
        }
        field2282++;
        return this.field2293;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(I)V")
    public class153(int arg0) {
        this.field2293 = arg0;
        this.field2286 = new class247[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class247 var3 = this.field2286[var2] = new class247();
            var3.field4017 = var3;
            var3.field4013 = var3;
        }
    }
}
