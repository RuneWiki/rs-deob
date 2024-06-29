import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class193 extends class157 {

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Ljava/lang/Object;")
    private Object field3083;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lck;")
    public static class119 field3088 = class298.method1987((byte) 26, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field3089 = 0;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "Lck;")
    public static class119 field3091 = class298.method1987((byte) 108, "l");

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3082;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 9)
    public final Object method447(int arg0) {
        if (arg0 != 1) {
            field3090 = 89;
        }
        field3084++;
        return this.field3083;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 24)
    public class193(Object arg0) {
        this.field3083 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V", line = 36)
    public static void method1239(boolean arg0) {
        if (arg0) {
            field3091 = null;
            field3082 = null;
            field3088 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBII)V", line = 60)
    public static final void method1240(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 <= 96) {
            method1239(true);
        }
        field3085++;
        for (int var5 = 0; var5 < class36.field499; var5++) {
            if ((class46.field681[var5] + class164.field2586[var5]) > arg4 && (arg4 + arg0) > class46.field681[var5] && class151.field2392[var5] + class139.field2235[var5] > arg1 && arg1 + arg3 > class151.field2392[var5]) {
                class187.field2940[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIZIII)V", line = 85)
    public static final void method1241(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class181.field2871 = 0;
        for (int var7 = -1; var7 < (class233.field3757 + class157.field2499); var7++) {
            class297 var8;
            if (var7 == -1) {
                var8 = class124.field1917;
            } else if (class233.field3757 > var7) {
                var8 = class23.field346[class226.field3609[var7]];
            } else {
                var8 = class70.field1103[class23.field348[var7 - class233.field3757]];
            }
            if (var8 != null && var8.method1038((byte) -105)) {
                if (var8 instanceof class163) {
                    class50 var9 = ((class163) var8).field2575;
                    if (var9.field826 != null) {
                        var9 = var9.method378((byte) -81);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class233.field3757 <= var7) {
                    class50 var15 = ((class163) var8).field2575;
                    if (var15.field826 != null) {
                        var15 = var15.method378((byte) -121);
                    }
                    if (var15.field818 >= 0 && var15.field818 < class140.field2245.length) {
                        class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) + 15, var8);
                        if (class49.field741 > -1) {
                            class140.field2245[var15.field818].method139(arg1 + class49.field741 - 12, class283.field4672 + arg6 + -30);
                        }
                    }
                    int var16 = 0;
                    class229[] var17 = class292.field4857;
                    while (var17.length > var16) {
                        class229 var18 = var17[var16];
                        if (var18 != null && var18.field3708 == 1 && class23.field348[var7 - class233.field3757] == var18.field3718 && (class1.field15 % 20) < 10) {
                            class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) + 15, var8);
                            if (class49.field741 > -1) {
                                class174.field2791[var18.field3707].method139(arg1 + class49.field741 - 12, class283.field4672 + -28 + arg6);
                            }
                        }
                        var16++;
                    }
                } else {
                    int var10 = 30;
                    class292 var11 = (class292) var8;
                    if (var11.field4847 != -1 || var11.field4854 != -1) {
                        class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) + 15, var8);
                        if (class49.field741 > -1) {
                            if (var11.field4847 != -1) {
                                class189.field2982[var11.field4847].method139(arg1 + class49.field741 - 12, class283.field4672 + arg6 - var10);
                                var10 += 25;
                            }
                            if (var11.field4854 != -1) {
                                class140.field2245[var11.field4854].method139(class49.field741 + arg1 - 12, class283.field4672 + arg6 - var10);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class229[] var13 = class292.field4857;
                        while (var12 < var13.length) {
                            class229 var14 = var13[var12];
                            if (var14 != null && var14.field3708 == 10 && class226.field3609[var7] == var14.field3718) {
                                class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) + 15, var8);
                                if (class49.field741 > -1) {
                                    class174.field2791[var14.field3707].method139(class49.field741 + arg1 - 12, -var10 + arg6 + class283.field4672);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field4994 != null && (class233.field3757 <= var7 || class144.field2302 == 0 || class144.field2302 == 3 || class144.field2302 == 1 && class61.method451(((class292) var8).field4861, !arg3))) {
                    class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1), var8);
                    if (class49.field741 > -1 && class79.field1216 > class181.field2871) {
                        class79.field1213[class181.field2871] = class110.field1683.method1833(var8.field4994) / 2;
                        class79.field1222[class181.field2871] = class110.field1683.field4590;
                        class79.field1217[class181.field2871] = class49.field741;
                        class79.field1214[class181.field2871] = class283.field4672;
                        class79.field1225[class181.field2871] = var8.field4940;
                        class79.field1208[class181.field2871] = var8.field4944;
                        class79.field1210[class181.field2871] = var8.field4997;
                        class79.field1224[class181.field2871] = var8.field4994;
                        class181.field2871++;
                    }
                }
                if (class1.field15 < var8.field4961) {
                    class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) + 15, var8);
                    if (class49.field741 > -1) {
                        class121.method811(class49.field741 + arg1 - 15, class283.field4672 + arg6 + -3, var8.field4972, 5, 65280);
                        class121.method811(class49.field741 + var8.field4972 + arg1 - 15, arg6 - 3 + class283.field4672, 30 - var8.field4972, 5, 16711680);
                    }
                }
                for (int var19 = 0; var19 < 4; var19++) {
                    if (class1.field15 < var8.field4966[var19]) {
                        class233.method1501(arg2, arg4 >> 1, arg5, arg0 >> 1, (byte) 127, var8.method1978(-1) / 2, var8);
                        if (class49.field741 > -1) {
                            if (var19 == 1) {
                                class283.field4672 -= 20;
                            }
                            if (var19 == 2) {
                                class49.field741 -= 15;
                                class283.field4672 -= 10;
                            }
                            if (var19 == 3) {
                                class283.field4672 -= 10;
                                class49.field741 += 15;
                            }
                            class102.field1558[var8.field4986[var19]].method139(class49.field741 + arg1 - 12, arg6 - -class283.field4672 - 12);
                            class281.field4639.method1835(class234.method1506(var8.field5011[var19], (byte) -79), class49.field741 + arg1 - 1, class283.field4672 + 3 + arg6, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var20 = 0; var20 < class181.field2871; var20++) {
            int var21 = class79.field1214[var20];
            int var22 = class79.field1213[var20];
            int var23 = class79.field1217[var20];
            int var24 = class79.field1222[var20];
            boolean var25 = true;
            while (var25) {
                var25 = false;
                for (int var26 = 0; var26 < var20; var26++) {
                    if ((var21 + 2) > (class79.field1214[var26] - class79.field1222[var26]) && (class79.field1214[var26] + 2) > (var21 - var24) && var23 - var22 < class79.field1217[var26] + class79.field1213[var26] && (class79.field1217[var26] - class79.field1213[var26]) < (var22 + var23) && var21 > (class79.field1214[var26] - class79.field1222[var26])) {
                        var21 = class79.field1214[var26] - class79.field1222[var26];
                        var25 = true;
                    }
                }
            }
            class49.field741 = class79.field1217[var20];
            class283.field4672 = class79.field1214[var20] = var21;
            class119 var27 = class79.field1224[var20];
            if (class244.field3945 == 0) {
                int var28 = 16776960;
                if (class79.field1225[var20] < 6) {
                    var28 = class22.field298[class79.field1225[var20]];
                }
                if (class79.field1225[var20] == 6) {
                    var28 = class132.field2012 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class79.field1225[var20] == 7) {
                    var28 = class132.field2012 % 20 >= 10 ? 65535 : 255;
                }
                if (class79.field1225[var20] == 8) {
                    var28 = class132.field2012 % 20 < 10 ? 45056 : 8454016;
                }
                if (class79.field1225[var20] == 9) {
                    int var29 = 150 - class79.field1210[var20];
                    if (var29 < 50) {
                        var28 = var29 * 1280 + 16711680;
                    } else if (var29 < 100) {
                        var28 = 16776960 - ((var29 - 50) * 327680);
                    } else if (var29 < 150) {
                        var28 = var29 * 5 + 64780;
                    }
                }
                if (class79.field1225[var20] == 10) {
                    int var30 = 150 - class79.field1210[var20];
                    if (var30 < 50) {
                        var28 = var30 * 5 + 16711680;
                    } else if (var30 < 100) {
                        var28 = 16711935 - (var30 - 50) * 327680;
                    } else if (var30 < 150) {
                        var28 = var30 * 327680 + 500 - (var30 * 5) - 32767745;
                    }
                }
                if (class79.field1225[var20] == 11) {
                    int var31 = 150 - class79.field1210[var20];
                    if (var31 < 50) {
                        var28 = 16777215 - var31 * 327685;
                    } else if (var31 < 100) {
                        var28 = var31 * 327685 - 16318970;
                    } else if (var31 < 150) {
                        var28 = 16777215 - (var31 - 100) * 327680;
                    }
                }
                if (class79.field1208[var20] == 0) {
                    class110.field1683.method1835(var27, arg1 + class49.field741, class283.field4672 + arg6, var28, 0);
                }
                if (class79.field1208[var20] == 1) {
                    class110.field1683.method1842(var27, class49.field741 + arg1, arg6 - -class283.field4672, var28, 0, class132.field2012);
                }
                if (class79.field1208[var20] == 2) {
                    class110.field1683.method1829(var27, class49.field741 + arg1, class283.field4672 + arg6, var28, 0, class132.field2012);
                }
                if (class79.field1208[var20] == 3) {
                    class110.field1683.method1839(var27, class49.field741 + arg1, class283.field4672 + arg6, var28, 0, class132.field2012, 150 - class79.field1210[var20]);
                }
                if (class79.field1208[var20] == 4) {
                    int var32 = (150 - class79.field1210[var20]) * (class110.field1683.method1833(var27) + 100) / 150;
                    class121.method814(arg1 - (50 - class49.field741), arg6, arg1 + class49.field741 + 50, arg0 + arg6);
                    class110.field1683.method1827(var27, arg1 + class49.field741 + 50 - var32, class283.field4672 + arg6, var28, 0);
                    class121.method804(arg1, arg6, arg1 + arg4, arg0 + arg6);
                }
                if (class79.field1208[var20] == 5) {
                    int var33 = 150 - class79.field1210[var20];
                    class121.method814(arg1, class283.field4672 + arg6 - class110.field1683.field4590 - 1, arg1 - -arg4, arg6 + class283.field4672 + 5);
                    int var34 = 0;
                    if (var33 < 25) {
                        var34 = var33 - 25;
                    } else if (var33 > 125) {
                        var34 = var33 - 125;
                    }
                    class110.field1683.method1835(var27, class49.field741 + arg1, arg6 - -var34 + class283.field4672, var28, 0);
                    class121.method804(arg1, arg6, arg1 + arg4, arg0 + arg6);
                }
            } else {
                class110.field1683.method1835(var27, class49.field741 + arg1, class283.field4672 + arg6, 16776960, 0);
            }
        }
        if (!arg3) {
            field3088 = (class119) null;
        }
        field3086++;
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(B)Z", line = 481)
    public final boolean method448(byte arg0) {
        if (arg0 != 104) {
            field3090 = -65;
        }
        field3087++;
        return false;
    }
}
