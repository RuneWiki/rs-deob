import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Ljd;")
    public static class85 field235 = class221.method1499("lila:", (byte) -116);

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Ljd;")
    public static class85 field236 = class221.method1499("showingVideoAd", (byte) 111);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Ljd;")
    public static class85 field238 = class221.method1499("Stufe)2", (byte) -56);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)V")
    public static final void method118(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field239++;
        class44.field774[0].method713(arg1, arg4);
        int var6 = (arg5 - 32) * arg5 / arg0;
        class44.field774[1].method713(arg1, arg4 + arg5 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg5 - var6 - 32) * arg3 / (arg0 - arg5);
        class179.method1222(arg1, arg4 + 16, 16, arg5 - 32, class252.field4358);
        class179.method1222(arg1, arg4 + var7 + 16, 16, var6, class210.field3672);
        class179.method1220(arg1, arg4 + var7 + 16, var6, class39.field618);
        class179.method1220(arg1 + 1, arg4 + var7 + 16, var6, class39.field618);
        class179.method1214(arg1, arg4 + var7 + 16, 16, class39.field618);
        class179.method1214(arg1, arg4 + var7 + 17, 16, class39.field618);
        class179.method1220(arg1 + 15, arg4 + 16 + var7, var6, class122.field2146);
        class179.method1220(arg1 + 14, arg4 - (-var7 + -17), var6 - 1, class122.field2146);
        class179.method1214(arg1, arg4 - (-var7 - var6 - 15), 16, class122.field2146);
        class179.method1214(arg1 - arg2, var7 - -var6 + arg4 + 14, 15, class122.field2146);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[Ljb;)V")
    public static final void method119(int arg0, int arg1, class255[] arg2) {
        if (arg1 != -14874) {
            method120((byte) 4, (class255) null);
        }
        field231++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class255 var4 = arg2[var3];
            if (var4 != null && var4.field4530 == arg0 && (!var4.field4459 || !client.method994(var4))) {
                if (var4.field4436 == 0) {
                    if (!var4.field4459 && client.method994(var4) && class115.field2057 != var4) {
                        continue;
                    }
                    method119(var4.field4479, -14874, arg2);
                    if (var4.field4549 != null) {
                        method119(var4.field4479, arg1, var4.field4549);
                    }
                    class129 var5 = (class129) class121.field2126.method1398(1, (long) var4.field4479);
                    if (var5 != null) {
                        class66.method445(-19, var5.field2264);
                    }
                }
                if (var4.field4436 == 6) {
                    if (var4.field4426 != -1 || var4.field4477 != -1) {
                        boolean var6 = class8.method46(var4, 26);
                        int var7;
                        if (var6) {
                            var7 = var4.field4477;
                        } else {
                            var7 = var4.field4426;
                        }
                        if (var7 != -1) {
                            class106 var8 = class101.method704(1, var7);
                            if (var8 != null) {
                                var4.field4421 += class218.field3820;
                                while (var8.field1863[var4.field4497] < var4.field4421) {
                                    var4.field4421 -= var8.field1863[var4.field4497];
                                    var4.field4497++;
                                    if (var8.field1857.length <= var4.field4497) {
                                        var4.field4497 -= var8.field1853;
                                        if (var4.field4497 < 0 || var4.field4497 >= var8.field1857.length) {
                                            var4.field4497 = 0;
                                        }
                                    }
                                    method120((byte) -53, var4);
                                }
                            }
                        }
                    }
                    if (var4.field4422 != 0 && !var4.field4459) {
                        int var9 = var4.field4422 << 16 >> 16;
                        int var10 = class218.field3820 * var9;
                        var4.field4394 = var4.field4394 + var10 & 0x7FF;
                        int var11 = var4.field4422 >> 16;
                        int var12 = class218.field3820 * var11;
                        var4.field4416 = var4.field4416 + var12 & 0x7FF;
                        method120((byte) -76, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjb;)V")
    public static final void method120(byte arg0, class255 arg1) {
        if (class211.field3704 == arg1.field4499) {
            class20.field286[arg1.field4452] = true;
        }
        if (arg0 >= -9) {
            method121(false);
        }
        field240++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method121(boolean arg0) {
        field236 = null;
        field238 = null;
        field235 = null;
        if (arg0) {
            field236 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static final void method122(int arg0) {
        class201.field3511.method797(120);
        class230.field3983 = 1;
        if (arg0 >= -56) {
            method123(-17);
        }
        class269.field4788 = null;
        field234++;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static final void method123(int arg0) {
        field230++;
        class33 var1 = (class33) class195.field3327.method110(64);
        if (arg0 != -391352048) {
            method123(-26);
        }
        while (var1 != null) {
            class25 var2 = var1.field492;
            if (class116.field2066 != var2.field385 || class151.field2555 > var2.field364) {
                var1.method1753(arg0 + 391352185);
            } else if (var2.field403 <= class151.field2555) {
                if (var2.field388 > 0) {
                    class17 var3 = class194.field3320[var2.field388 - 1];
                    if (var3 != null && var3.field1042 >= 0 && var3.field1042 < 13312 && var3.field1027 >= 0 && var3.field1027 < 13312) {
                        var2.method166(class246.method1660(604124551, var3.field1042, var2.field385, var3.field1027) - var2.field389, class151.field2555, 68, var3.field1042, var3.field1027);
                    }
                }
                if (var2.field388 < 0) {
                    int var4 = -var2.field388 - 1;
                    class44 var5;
                    if (class213.field3748 == var4) {
                        var5 = class22.field308;
                    } else {
                        var5 = class249.field4291[var4];
                    }
                    if (var5 != null && var5.field1042 >= 0 && var5.field1042 < 13312 && var5.field1027 >= 0 && var5.field1027 < 13312) {
                        var2.method166(class246.method1660(604124551, var5.field1042, var2.field385, var5.field1027) - var2.field389, class151.field2555, 113, var5.field1042, var5.field1027);
                    }
                }
                var2.method164(class218.field3820, arg0 + 391352170);
                class130.method876(class116.field2066, (int) var2.field402, (int) var2.field393, (int) var2.field401, 60, var2, var2.field391, -1L, false);
            }
            var1 = (class33) class195.field3327.method117((byte) 122);
        }
    }
}
