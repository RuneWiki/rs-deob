import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Lhe;")
    public static class54 field3181 = class6.method58("Anmelde)2Zeitlimit -Uberschritten)3", false);

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3182 = 0;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static volatile int field3185 = 0;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lhe;")
    private static class54 field3186 = class6.method58("Please wait)3)3)3", false);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "Lhe;")
    public static class54 field3180 = field3186;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field3187 = 0;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "I")
    public static int field3190 = 127;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "Lef;")
    public static class35 field3184;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ILnc;)V")
    public static final void method1076(int arg0, class93 arg1) {
        field3183++;
        int var2 = arg1.field2328;
        if (var2 == 324) {
            if (class87.field2157 == -1) {
                class87.field2157 = arg1.field2248;
                class123.field2835 = arg1.field2329;
            }
            if (class143.field3267.field1685) {
                arg1.field2248 = class87.field2157;
            } else {
                arg1.field2248 = class123.field2835;
            }
            return;
        }
        if (arg0 <= 106) {
            method1080((byte) 88);
        }
        if (var2 == 325) {
            if (class87.field2157 == -1) {
                class123.field2835 = arg1.field2329;
                class87.field2157 = arg1.field2248;
            }
            if (class143.field3267.field1685) {
                arg1.field2248 = class123.field2835;
            } else {
                arg1.field2248 = class87.field2157;
            }
        } else if (var2 == 327) {
            arg1.field2314 = 150;
            arg1.field2337 = (int) (Math.sin((double) class4.field138 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2238 = 5;
            arg1.field2351 = 0;
        } else if (var2 == 328) {
            arg1.field2314 = 150;
            arg1.field2337 = (int) (Math.sin((double) class4.field138 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field2238 = 5;
            arg1.field2351 = 1;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BLnc;II)V")
    public static final void method1077(byte arg0, class93 arg1, int arg2, int arg3) {
        field3177++;
        if (arg1.field2272 == 1) {
            class43.field1094++;
            class27.method208(class24.field671, arg1.field2273, 0, 24, 0, (byte) 51, arg1.field2365);
        }
        if (arg1.field2272 == 2 && !class141.field3216) {
            class54 var4 = class144.method1107(-97, arg1);
            if (var4 != null) {
                class27.method208(class143.method1105(new class54[] { class94.field2379, arg1.field2303 }, -842), arg1.field2273, -1, 5, 0, (byte) 106, var4);
                class75.field1850++;
            }
        }
        if (arg1.field2272 == 3) {
            class13.field355++;
            class27.method208(class24.field671, arg1.field2273, 0, 51, 0, (byte) 68, class22.field625);
        }
        if (arg1.field2272 == 4) {
            class27.method208(class24.field671, arg1.field2273, 0, 8, 0, (byte) 28, arg1.field2365);
            class18.field532++;
        }
        if (arg1.field2272 == 5) {
            class44.field1139++;
            class27.method208(class24.field671, arg1.field2273, 0, 33, 0, (byte) 88, arg1.field2365);
        }
        if (arg1.field2272 == 6 && class93.field2242 == null) {
            class132.field2980++;
            class27.method208(class24.field671, arg1.field2273, -1, 19, 0, (byte) 49, arg1.field2365);
        }
        int var5 = 97 / ((arg0 + 56) / 42);
        if (arg1.field2359 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field2286; var7++) {
                for (int var8 = 0; var8 < arg1.field2257; var8++) {
                    int var9 = (arg1.field2291 + 32) * var8;
                    int var10 = (arg1.field2333 + 32) * var7;
                    if (var6 < 20) {
                        var10 += arg1.field2358[var6];
                        var9 += arg1.field2324[var6];
                    }
                    if (arg3 >= var9 && arg2 >= var10 && arg3 < var9 + 32 && var10 + 32 > arg2) {
                        class66.field1601 = var6;
                        class79.field1946 = arg1;
                        if (arg1.field2280[var6] > 0) {
                            class67 var11 = class141.method1088(arg1.field2280[var6] - 1, (byte) -107);
                            if (class3.field76 == 1 && class155.method1196((byte) -127, class105.method810(arg1, -22389))) {
                                if (class111.field2670 != arg1.field2273 || class80.field1978 != var6) {
                                    class27.method208(class143.method1105(new class54[] { class124.field2866, class79.field1933, var11.field1652 }, -842), arg1.field2273, var6, 23, var11.field1615, (byte) 106, class111.field2682);
                                    class130.field2951++;
                                }
                            } else if (!class141.field3216 || !class155.method1196((byte) -127, class105.method810(arg1, -22389))) {
                                class54[] var12 = var11.field1649;
                                if (class114.field2706) {
                                    var12 = class17.method153(false, var12);
                                }
                                if (class155.method1196((byte) -127, class105.method810(arg1, -22389))) {
                                    for (int var13 = 4; var13 >= 3; var13--) {
                                        if (var12 != null && var12[var13] != null) {
                                            class53.field1283++;
                                            byte var14;
                                            if (var13 == 3) {
                                                var14 = 41;
                                            } else {
                                                var14 = 45;
                                            }
                                            class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, var14, var11.field1615, (byte) 74, var12[var13]);
                                        } else if (var13 == 4) {
                                            class70.field1730++;
                                            class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, 45, var11.field1615, (byte) 26, class49.field1188);
                                        }
                                    }
                                }
                                if (class8.method69((byte) -108, class105.method810(arg1, -22389))) {
                                    class88.field2172++;
                                    class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, 50, var11.field1615, (byte) 23, class111.field2682);
                                }
                                if (class155.method1196((byte) -127, class105.method810(arg1, -22389)) && var12 != null) {
                                    for (int var15 = 2; var15 >= 0; var15--) {
                                        if (var12[var15] != null) {
                                            class71.field1764++;
                                            byte var16 = 0;
                                            if (var15 == 0) {
                                                var16 = 37;
                                            }
                                            if (var15 == 1) {
                                                var16 = 28;
                                            }
                                            if (var15 == 2) {
                                                var16 = 4;
                                            }
                                            class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, var16, var11.field1615, (byte) 48, var12[var15]);
                                        }
                                    }
                                }
                                class21.field580++;
                                class54[] var17 = arg1.field2334;
                                if (class114.field2706) {
                                    var17 = class17.method153(false, var17);
                                }
                                if (var17 != null) {
                                    for (int var18 = 4; var18 >= 0; var18--) {
                                        if (var17[var18] != null) {
                                            class1.field17++;
                                            byte var19 = 0;
                                            if (var18 == 0) {
                                                var19 = 29;
                                            }
                                            if (var18 == 1) {
                                                var19 = 39;
                                            }
                                            if (var18 == 2) {
                                                var19 = 20;
                                            }
                                            if (var18 == 3) {
                                                var19 = 21;
                                            }
                                            if (var18 == 4) {
                                                var19 = 31;
                                            }
                                            class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, var19, var11.field1615, (byte) 18, var17[var18]);
                                        }
                                    }
                                }
                                class27.method208(class143.method1105(new class54[] { class124.field2857, var11.field1652 }, -842), arg1.field2273, var6, 1002, var11.field1615, (byte) 127, class63.field1518);
                            } else if ((class68.field1700 & 0x10) == 16) {
                                class57.field1418++;
                                class27.method208(class143.method1105(new class54[] { class8.field246, class79.field1933, var11.field1652 }, -842), arg1.field2273, var6, 40, var11.field1615, (byte) 82, class157.field3576);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field2279) {
            return;
        }
        if (!class141.field3216) {
            for (int var20 = 9; var20 >= 5; var20--) {
                class54 var24 = class73.method566(-10706, arg1, var20);
                if (var24 != null) {
                    class27.method208(arg1.field2297, arg1.field2273, arg1.field2264, 1006, var20 + 1, (byte) 98, var24);
                    class87.field2145++;
                }
            }
            class54 var21 = class144.method1107(-121, arg1);
            if (var21 != null) {
                class75.field1850++;
                class27.method208(arg1.field2297, arg1.field2273, arg1.field2264, 5, 0, (byte) 86, var21);
            }
            for (int var22 = 4; var22 >= 0; var22--) {
                class54 var23 = class73.method566(-10706, arg1, var22);
                if (var23 != null) {
                    class87.field2145++;
                    class27.method208(arg1.field2297, arg1.field2273, arg1.field2264, 10, var22 + 1, (byte) 72, var23);
                }
            }
            if (!class11.method84(-127, class105.method810(arg1, -22389))) {
                return;
            }
            class27.method208(class24.field671, arg1.field2273, arg1.field2264, 19, 0, (byte) 119, class67.field1628);
            class132.field2980++;
        } else if (class149.method1137(class105.method810(arg1, -22389), (byte) 121) && (class68.field1700 & 0x20) == 32) {
            field3178++;
            class27.method208(class143.method1105(new class54[] { class8.field246, class7.field220, arg1.field2297 }, -842), arg1.field2273, arg1.field2264, 49, 0, (byte) 59, class157.field3576);
            return;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Lba;")
    public static final class9 method1078(int arg0, int arg1) {
        field3179++;
        class9 var2 = (class9) class112.field2696.method991((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field1476.method266(9, (byte) 92, arg1);
        class9 var4 = new class9();
        var4.field281 = arg1;
        if (var3 != null) {
            var4.method73((byte) 120, new class83(var3));
        }
        var4.method72(0);
        if (arg0 >= -23) {
            field3186 = null;
        }
        class112.field2696.method990(true, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(ILnc;)Lnc;")
    public static final class93 method1079(int arg0, class93 arg1) {
        field3188++;
        class93 var2 = class6.method54(arg1, true);
        if (arg0 == -20274) {
            if (var2 == null) {
                var2 = arg1.field2306;
            }
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V")
    public static final void method1080(byte arg0) {
        if (arg0 == 124) {
            class118.field2768 = false;
            field3191++;
            class136.field3083 = false;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        if (arg0 < 16) {
            method1078(71, -24);
        }
        field3184 = null;
        field3186 = null;
        field3180 = null;
        field3181 = null;
    }
}
