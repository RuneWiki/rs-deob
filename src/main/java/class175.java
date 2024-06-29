import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class175 {

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field2682 = 0;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Ljf;")
    public static class227 field2681 = new class227(16);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lwf;")
    public static class306 field2679;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[[I")
    public static int[][] field2675;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1182(byte arg0) {
        class282.field4329++;
        class265.field4095.method2064(255, 174);
        class265.field4095.method2023(0L, 114);
        field2676++;
        if (arg0 <= 10) {
            field2684 = -111;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(JI)V", line = 21)
    public static final void method1183(long arg0, int arg1) {
        field2674++;
        if (class219.field3489 == 1 || class219.field3489 == 5) {
            class211.method1415(arg0, 32479);
        } else if (class219.field3489 == 2) {
            class40.method294(97);
        } else {
            class104.method707(65535);
        }
        if (!class260.field4036) {
            if (class310.field4923 != 0) {
                class302.field4661 = class286.field4384;
                class308.field4847 = class255.field3984;
            } else if (class256.field3994 == 0) {
                class302.field4661 = class199.field2985;
                class308.field4847 = class107.field1636;
            } else {
                class302.field4661 = class85.field1295;
                class308.field4847 = class7.field81;
            }
            class89.field1355[0] = class161.field2499;
            class194.field2925[0] = 1007;
            class242.field3830[0] = class79.field1176;
            class76.field1144[0] = "";
            class168.field2565 = 1;
        }
        if (class253.field3936 != -1) {
            class264.method1748(class253.field3936, arg1 ^ 0xFFFFFF62);
        }
        for (int var3 = 0; var3 < class64.field963; var3++) {
            if (class2.field12[var3]) {
                class19.field267[var3] = true;
            }
            class71.field1057[var3] = class2.field12[var3];
            class2.field12[var3] = false;
        }
        class80.field1190 = -1;
        class249.field3915 = null;
        class303.field4726 = -1;
        if (class333.field5166) {
            class270.field4159 = true;
        }
        class283.field4343 = class343.field5341;
        class222.field3537 = null;
        if (class253.field3936 != -1) {
            class64.field963 = 0;
            class197.method1335(64);
        }
        if (class333.field5166) {
            class238.method1629();
        } else {
            class57.method386();
        }
        class218.method1462((byte) -54);
        if (class260.field4036) {
            if (class151.field2373) {
                class194.method1321(-13);
            } else {
                class155.method1079(-3);
            }
        } else if (class222.field3537 != null) {
            class194.method1318(58, class222.field3537, class40.field575, class75.field1123);
        } else if (class80.field1190 != -1) {
            class194.method1318(61, (class207) null, class303.field4726, class80.field1190);
        }
        int var4 = class260.field4036 ? -1 : class68.method489(-113);
        if (var4 == -1) {
            var4 = class226.field3613;
        }
        if (arg1 != 128) {
            field2684 = -21;
        }
        class95.method648(var4, arg1 ^ 0xF8);
        if (class56.field790 == 1) {
            class56.field790 = 2;
        }
        if (class106.field1631 == 1) {
            class106.field1631 = 2;
        }
        if (class288.field4416 == 3) {
            for (int var5 = 0; var5 < class64.field963; var5++) {
                if (class71.field1057[var5]) {
                    if (class333.field5166) {
                        class238.method1627(class15.field159[var5], class194.field2932[var5], class167.field2563[var5], class233.field3750[var5], 16711935, 128);
                    } else {
                        class57.method382(class15.field159[var5], class194.field2932[var5], class167.field2563[var5], class233.field3750[var5], 16711935, 128);
                    }
                } else if (class19.field267[var5]) {
                    if (class333.field5166) {
                        class238.method1627(class15.field159[var5], class194.field2932[var5], class167.field2563[var5], class233.field3750[var5], 16711680, 128);
                    } else {
                        class57.method382(class15.field159[var5], class194.field2932[var5], class167.field2563[var5], class233.field3750[var5], 16711680, 128);
                    }
                }
            }
        }
        class332.method2278(class79.field1173.field537, class81.field1208, class79.field1173.field519, arg1 - 169, class77.field1154);
        class81.field1208 = 0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 175)
    public static void method1184(int arg0) {
        if (arg0 != 31465) {
            method1185(-128, 74, (class298) null, (byte) -103, 114);
        }
        field2675 = (int[][]) null;
        field2679 = null;
        field2681 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILsg;BI)V", line = 187)
    public static final void method1185(int arg0, int arg1, class298 arg2, byte arg3, int arg4) {
        field2677++;
        if (arg3 != -76) {
            field2679 = (class306) null;
        }
        if (class168.field2565 >= 400) {
            return;
        }
        if (arg2.field4588 != null) {
            arg2 = arg2.method1956(arg3 + 188);
        }
        if (arg2 == null || !arg2.field4583) {
            return;
        }
        String var5 = arg2.field4597;
        if (arg2.field4568 != 0) {
            String var6 = class2.field25 == 1 ? class27.field353 : class185.field2832;
            var5 = var5 + class234.method1595(class79.field1173.field1236, arg2.field4568, -22543) + " (" + var6 + arg2.field4568 + ")";
        }
        if (class81.field1199 == 1) {
            class85.method584((long) arg0, (short) 59, arg4, (byte) -122, class86.field1299 + " -> <col=ffff00>" + var5, arg1, class82.field1217, class165.field2545);
            class86.field1298++;
        } else if (class120.field1841) {
            class280 var7 = class133.field2097 == -1 ? null : class27.method209(11, class133.field2097);
            if ((class310.field4920 & 0x2) != 0 && (var7 == null || arg2.method1960(var7.field4315, 12, class133.field2097) != var7.field4315)) {
                class322.field5023++;
                class85.method584((long) arg0, (short) 60, arg4, (byte) -110, class302.field4663 + " -> <col=ffff00>" + var5, arg1, class227.field3638, class139.field2150);
            }
        } else {
            class318.field4987++;
            String[] var8 = arg2.field4594;
            if (class30.field375) {
                var8 = class288.method1876(var8, (byte) 114);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class2.field25 != 0 || !var8[var9].equalsIgnoreCase(class293.field4511))) {
                        class314.field4950++;
                        byte var10 = 0;
                        if (var9 == 0) {
                            var10 = 36;
                        }
                        if (var9 == 1) {
                            var10 = 42;
                        }
                        int var11 = -1;
                        if (arg2.field4596 == var9) {
                            var11 = arg2.field4591;
                        }
                        if (var9 == 2) {
                            var10 = 41;
                        }
                        if (var9 == 3) {
                            var10 = 28;
                        }
                        if (var9 == 4) {
                            var10 = 34;
                        }
                        if (arg2.field4571 == var9) {
                            var11 = arg2.field4576;
                        }
                        class85.method584((long) arg0, var10, arg4, (byte) -124, "<col=ffff00>" + var5, arg1, var8[var9], var11);
                    }
                }
            }
            if (class2.field25 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class293.field4511)) {
                        short var13 = 0;
                        if (class79.field1173.field1236 < arg2.field4568) {
                            var13 = 2000;
                        }
                        class168.field2568++;
                        short var14 = 0;
                        if (var12 == 0) {
                            var14 = 36;
                        }
                        if (var12 == 1) {
                            var14 = 42;
                        }
                        if (var12 == 2) {
                            var14 = 41;
                        }
                        if (var12 == 3) {
                            var14 = 28;
                        }
                        if (var12 == 4) {
                            var14 = 34;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class85.method584((long) arg0, var14, arg4, (byte) -110, "<col=ffff00>" + var5, arg1, var8[var12], arg2.field4581);
                    }
                }
            }
            class85.method584((long) arg0, (short) 1004, arg4, (byte) -121, "<col=ffff00>" + var5, arg1, class280.field4326, class261.field4044);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIB)I", line = 349)
    public static final int method1186(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        int var7 = arg0 & 0x3;
        field2686++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg4;
        } else if (var7 == 1) {
            return arg2;
        } else {
            int var9 = 22 % ((arg6 + 64) / 42);
            return var7 == 2 ? 1 + 7 - arg1 - arg4 : 1 - (arg3 - 7) - arg2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V", line = 380)
    public static final void method1187(boolean arg0, byte arg1) {
        field2683++;
        if (arg1 == 120) {
            class82.field1226 = arg0;
            class150.field2363 = !class148.method1042((byte) 54);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)I", line = 400)
    public static final int method1188(byte arg0, int arg1) {
        field2680++;
        return arg0 == -26 ? arg1 & 0x3FF : 40;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 421)
    public static final void method1189(int arg0) {
        field2685++;
        if (!class120.field1841) {
            return;
        }
        class207 var1 = class276.method1812(true, class197.field2954, class253.field3934);
        if (var1 != null && var1.field3194 != null) {
            class120 var2 = new class120();
            var2.field1837 = var1.field3194;
            var2.field1845 = var1;
            class122.method834((byte) 37, var2);
        }
        class120.field1841 = false;
        class161.field2499 = arg0;
        class277.method1822(4096, var1);
    }
}
