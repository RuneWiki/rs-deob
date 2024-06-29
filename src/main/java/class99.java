import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class99 extends class167 {

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public int field1585 = 0;

    @OriginalMember(owner = "client!ja", name = "K", descriptor = "Z")
    public static boolean field1581 = false;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "I")
    public static volatile int field1586 = -1;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1584 = 100;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "[Lk;")
    public static class206[] field1588 = new class206[500];

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1582;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "[I")
    public static int[] field1583;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZLji;)V")
    private final void method615(int arg0, boolean arg1, class225 arg2) {
        field1590++;
        if (!arg1) {
            field1586 = 60;
        }
        if (arg0 == 2) {
            this.field1585 = arg2.method1593(arg1);
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lji;I)V")
    public final void method616(class225 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1580(-38);
            if (var3 == 0) {
                if (arg1 != -1) {
                    return;
                }
                field1587++;
                return;
            }
            this.method615(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIB)V")
    public static final void method617(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class242.method1700(7, arg0, arg1 + arg2, class232.field4151[arg3], arg1 - arg2);
        int var5 = 0;
        field1582++;
        int var6 = arg2;
        int var7 = -1;
        if (arg4 != 4) {
            method621(49);
        }
        int var8 = -arg2;
        while (var5 < var6) {
            var7 += 2;
            var5++;
            var8 += var7;
            if (var8 >= 0) {
                var6--;
                var8 -= var6 << 1;
                int[] var9 = class232.field4151[arg3 + var6];
                int var10 = arg1 + var5;
                int var11 = arg1 - var5;
                int[] var12 = class232.field4151[arg3 - var6];
                class242.method1700(7, arg0, var10, var9, var11);
                class242.method1700(7, arg0, var10, var12, var11);
            }
            int var13 = arg1 + var6;
            int[] var14 = class232.field4151[arg3 + var5];
            int var15 = arg1 - var6;
            int[] var16 = class232.field4151[arg3 - var5];
            class242.method1700(arg4 + 3, arg0, var13, var14, var15);
            class242.method1700(arg4 + 3, arg0, var13, var16, var15);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)Lo;")
    public static final class12 method618(int arg0, int arg1, int arg2) {
        class199 var3 = class201.field3608[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3550; var4++) {
            class12 var5 = var3.field3549[var4];
            if ((var5.field136 >> 29 & 0x3L) == 2L && var5.field152 == arg1 && var5.field144 == arg2) {
                class63.method424(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method619(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class10.field111++;
        class21.field288 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class227.field4091; var12 < class240.field4271; var12++) {
            class199[][] var38 = class201.field3608[var12];
            for (int var39 = class221.field3910; var39 < class262.field4641; var39++) {
                for (int var40 = class141.field2346; var40 < class101.field1621; var40++) {
                    class199 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class66.field1150[var39 + class81.field1368 - class161.field2720][var40 + class81.field1368 - class31.field440] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3547 = true;
                            var41.field3540 = true;
                            if (var41.field3550 > 0) {
                                var41.field3563 = true;
                            } else {
                                var41.field3563 = false;
                            }
                            class21.field288++;
                        } else {
                            var41.field3547 = false;
                            var41.field3540 = false;
                            var41.field3537 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3535 != null) {
                                    class254 var42 = var41.field3535;
                                    var42.field4499.method129(var42.field4504, (byte) -33, var42.field4504, var42.field4492, var42.field4492);
                                    if (var42.field4493 != null) {
                                        var42.field4493.method129(var42.field4504, (byte) -27, var42.field4504, var42.field4492, var42.field4492);
                                    }
                                }
                                if (var41.field3541 != null) {
                                    class9 var43 = var41.field3541;
                                    var43.field94.method129(var43.field100, (byte) -66, var43.field100, var43.field103, var43.field103);
                                    if (var43.field88 != null) {
                                        var43.field88.method129(var43.field100, (byte) -18, var43.field100, var43.field103, var43.field103);
                                    }
                                }
                                if (var41.field3556 != null) {
                                    class257 var44 = var41.field3556;
                                    var44.field4562.method129(var44.field4564, (byte) -105, var44.field4564, var44.field4560, var44.field4560);
                                }
                                if (var41.field3549 != null) {
                                    for (int var45 = 0; var45 < var41.field3550; var45++) {
                                        class12 var46 = var41.field3549[var45];
                                        var46.field155.method129(var46.field144, (byte) -51, var46.field150, var46.field146, var46.field152);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class32.field453 == class12.field143;
        for (int var14 = class227.field4091; var14 < class240.field4271; var14++) {
            class199[][] var27 = class201.field3608[var14];
            for (int var28 = -class81.field1368; var28 <= 0; var28++) {
                int var29 = class161.field2720 + var28;
                int var30 = class161.field2720 - var28;
                if (var29 >= class221.field3910 || var30 < class262.field4641) {
                    for (int var31 = -class81.field1368; var31 <= 0; var31++) {
                        int var32 = class31.field440 + var31;
                        int var33 = class31.field440 - var31;
                        if (var29 >= class221.field3910) {
                            if (var32 >= class141.field2346) {
                                class199 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3547) {
                                    class157.method1070(var34, true);
                                }
                            }
                            if (var33 < class101.field1621) {
                                class199 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3547) {
                                    class157.method1070(var35, true);
                                }
                            }
                        }
                        if (var30 < class262.field4641) {
                            if (var32 >= class141.field2346) {
                                class199 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3547) {
                                    class157.method1070(var36, true);
                                }
                            }
                            if (var33 < class101.field1621) {
                                class199 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3547) {
                                    class157.method1070(var37, true);
                                }
                            }
                        }
                        if (class21.field288 == 0) {
                            if (!var13) {
                                class53.field968 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class227.field4091; var15 < class240.field4271; var15++) {
            class199[][] var16 = class201.field3608[var15];
            for (int var17 = -class81.field1368; var17 <= 0; var17++) {
                int var18 = class161.field2720 + var17;
                int var19 = class161.field2720 - var17;
                if (var18 >= class221.field3910 || var19 < class262.field4641) {
                    for (int var20 = -class81.field1368; var20 <= 0; var20++) {
                        int var21 = class31.field440 + var20;
                        int var22 = class31.field440 - var20;
                        if (var18 >= class221.field3910) {
                            if (var21 >= class141.field2346) {
                                class199 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3547) {
                                    class157.method1070(var23, false);
                                }
                            }
                            if (var22 < class101.field1621) {
                                class199 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3547) {
                                    class157.method1070(var24, false);
                                }
                            }
                        }
                        if (var19 < class262.field4641) {
                            if (var21 >= class141.field2346) {
                                class199 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3547) {
                                    class157.method1070(var25, false);
                                }
                            }
                            if (var22 < class101.field1621) {
                                class199 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3547) {
                                    class157.method1070(var26, false);
                                }
                            }
                        }
                        if (class21.field288 == 0) {
                            if (!var13) {
                                class53.field968 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class53.field968 = false;
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public static final void method620(int arg0) {
        int var1 = -34 % ((arg0 + 7) / 58);
        field1589++;
        while (class107.field1776.method1100(class253.field4486, (byte) -108) >= 27) {
            int var2 = class107.field1776.method1099((byte) 126, 15);
            if (var2 == 32767) {
                break;
            }
            boolean var3 = false;
            if (class115.field1901[var2] == null) {
                class115.field1901[var2] = new class156();
                var3 = true;
            }
            class156 var4 = class115.field1901[var2];
            class256.field4542[class197.field3514++] = var2;
            var4.field2992 = class135.field2267;
            if (var4.field2663 != null && var4.field2663.method1241(-1)) {
                class111.method715(-2854, var4);
            }
            int var5 = class107.field1776.method1099((byte) 122, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class192.field3422[class107.field1776.method1099((byte) 126, 3)];
            if (var3) {
                var4.field2964 = var4.field2999 = var6;
            }
            var4.field2663 = class135.method904(-126, class107.field1776.method1099((byte) 116, 14));
            int var7 = class107.field1776.method1099((byte) 121, 1);
            if (var7 == 1) {
                class18.field247[class90.field1460++] = var2;
            }
            int var8 = class107.field1776.method1099((byte) 124, 5);
            int var9 = class107.field1776.method1099((byte) 122, 1);
            var4.method1185(1, var4.field2663.field3208);
            var4.field2995 = var4.field2663.field3181;
            if (var8 > 15) {
                var8 -= 32;
            }
            var4.field2970 = var4.field2663.field3214;
            var4.field3011 = var4.field2663.field3202;
            var4.field2960 = var4.field2663.field3170;
            var4.field2974 = var4.field2663.field3213;
            if (var4.field2960 == 0) {
                var4.field2999 = 0;
            }
            var4.field3007 = var4.field2663.field3186;
            var4.field3012 = var4.field2663.field3163;
            var4.field2969 = var4.field2663.field3227;
            var4.method1184(var9 == 1, class175.field2946.field2953[0] + var8, 3, class175.field2946.field3014[0] + var5, var4.method490((byte) -4));
            if (var4.field2663.method1241(-1)) {
                class87.method531((class102) null, var4.field3014[0], 0, (class76) null, var4.field2953[0], var4, (byte) -41, class261.field4598);
            }
        }
        class107.field1776.method1103((byte) -33);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1588 = null;
        if (arg0 != 0) {
            field1586 = 51;
        }
        field1583 = null;
    }
}
