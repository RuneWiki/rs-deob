import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class56 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Z")
    public boolean field1213 = true;

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
    public int field1215;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public int field1220;

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
    public int field1222;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public int field1214;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public int field1219;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "Lae;")
    public static class6 field1218 = class64.method474(116, "Passwort: ");

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "Lae;")
    private static class6 field1221 = class64.method474(104, "Private chat");

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lae;")
    public static class6 field1217 = field1221;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "Lrb;")
    public static class105 field1224 = new class105();

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lae;")
    public static class6 field1230 = class64.method474(125, "::fpsoff");

    @OriginalMember(owner = "client!ja", name = "x", descriptor = "Lae;")
    public static class6 field1235 = class64.method474(111, "_");

    @OriginalMember(owner = "client!ja", name = "v", descriptor = "Lae;")
    private static class6 field1233 = class64.method474(125, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "Lae;")
    public static class6 field1234 = field1233;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1231 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1216;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "I")
    public static int field1226;

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lsd;")
    public static class114 field1227;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lbb;")
    public static class9 field1229;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "[I")
    public static int[] field1228;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I", line = 25)
    public static final int method423(int arg0, int arg1, int arg2, int arg3) {
        field1216++;
        int var4 = arg2 / arg0;
        int var5 = arg3 / arg0;
        int var6 = arg0 - 1 & arg2;
        int var7 = arg3 & arg0 - 1;
        if (arg1 < 7) {
            field1235 = null;
        }
        int var8 = class139.method1121(-26, var5, var4);
        int var9 = class139.method1121(-26, var5, var4 + 1);
        int var10 = class139.method1121(-26, var5 + 1, var4);
        int var11 = class139.method1121(-26, var5 + 1, var4 + 1);
        int var12 = class78.method677(var6, var9, var8, arg0, -247888528);
        int var13 = class78.method677(var6, var11, var10, arg0, -247888528);
        return class78.method677(var7, var13, var12, arg0, -247888528);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 59)
    public static void method424(int arg0) {
        field1230 = null;
        field1228 = null;
        field1221 = null;
        field1233 = null;
        field1224 = null;
        field1235 = null;
        field1229 = null;
        field1218 = null;
        field1234 = null;
        field1227 = null;
        if (arg0 != 239) {
            method426(79);
        }
        field1217 = null;
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "(IIIIIIZ)V", line = 411)
    public class56(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field1225 = arg5;
        this.field1215 = arg1;
        this.field1220 = arg2;
        this.field1213 = arg6;
        this.field1222 = arg3;
        this.field1214 = arg0;
        this.field1219 = arg4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V", line = 83)
    public static final void method425(byte arg0) {
        class102.field2405 = true;
        class117.method963(-1540585334);
        if (class125.field3048) {
            field1229.method88(class133.field3242, 239, 40, 0);
            field1229.method88(class85.method731(new class6[] { class133.field3247, class38.field878 }, 14569), 239, 60, 128);
        } else if (class76.field1765 == 1) {
            field1229.method88(class82.field2009, 239, 40, 0);
            field1229.method88(class85.method731(new class6[] { class133.field3244, class38.field878 }, 14569), 239, 60, 128);
        } else if (class76.field1765 == 2) {
            field1229.method88(class126.field3088, 239, 40, 0);
            field1229.method88(class85.method731(new class6[] { class133.field3244, class38.field878 }, 14569), 239, 60, 128);
        } else if (class76.field1765 == 3) {
            if (class133.field3254 != class133.field3244) {
                class5.method23(class133.field3244, false);
                class133.field3254 = class133.field3244;
            }
            class9 var1 = class102.field2397;
            class74.method587(0, 0, 463, 77);
            for (int var2 = 0; var2 < class137.field3340; var2++) {
                int var3 = var2 * 14 + 18 - class139.field3368;
                if (var3 > 0 && var3 < 110) {
                    var1.method88(class58.field1256[var2], 239, var3, 0);
                }
            }
            class74.method583();
            if (class137.field3340 > 5) {
                class7.method73(463, class139.field3368, class137.field3340 * 14 + 7, 0, 18734, 77);
            }
            if (class133.field3244.method41(-8521) == 0) {
                field1229.method88(class117.field2781, 239, 40, 255);
            } else if (class137.field3340 == 0) {
                field1229.method88(class116.field2724, 239, 40, 0);
            }
            var1.method88(class85.method731(new class6[] { class133.field3244, class38.field878 }, 14569), 239, 90, 0);
            class74.method584(0, 77, 479, 0);
        } else if (class34.field803 != null) {
            field1229.method84(class34.field803, 10, 20, 459, 40, 0, false, 1, 1, 0);
            field1229.method88(class32.field788, 239, 80, 128);
        } else if (class102.field2410 != -1) {
            boolean var19 = class95.method784(96, 479, 0, class102.field2410, 0, -1, 2);
            if (!var19) {
                class20.field427 = true;
            }
        } else if (class117.field2776 == -1) {
            class9 var5 = class102.field2397;
            class74.method587(0, 0, 463, 77);
            int var6 = 0;
            for (int var7 = 0; var7 < 100; var7++) {
                if (class5.field66[var7] != null) {
                    int var9 = client.field464[var7];
                    class6 var10 = class103.field2431[var7];
                    int var11 = class68.field1510 + 70 - var6 * 14;
                    byte var12 = 0;
                    if (var10 != null && var10.method36(class67.field1488, false)) {
                        var10 = var10.method56(-58, 5);
                        var12 = 1;
                    }
                    if (var10 != null && var10.method36(class104.field2466, false)) {
                        var10 = var10.method56(-58, 5);
                        var12 = 2;
                    }
                    if (var9 == 0) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            var5.method106(class5.field66[var7], 4, var11, 0);
                        }
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || class116.field2725 == 0 || class116.field2725 == 1 && class6.method31(21469, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                class108.field2585[0].method1036(var13, var11 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                class108.field2585[1].method1036(var13, var11 - 12);
                                var13 += 14;
                            }
                            var5.method106(class85.method731(new class6[] { var10, class34.field813 }, 14569), var13, var11, 0);
                            int var14 = var13 + var5.method96(var10) + 8;
                            var5.method106(class5.field66[var7], var14, var11, 255);
                        }
                        var6++;
                    }
                    if ((var9 == 3 || var9 == 7) && class5.field67 == 0 && (var9 == 7 || class15.field304 == 0 || class15.field304 == 1 && class6.method31(21469, var10))) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            byte var15 = 4;
                            var5.method106(class118.field2818, var15, var11, 0);
                            int var16 = var15 + var5.method96(class118.field2818);
                            int var17 = var16 + var5.method104(32);
                            if (var12 == 1) {
                                class108.field2585[0].method1036(var17, var11 - 12);
                                var17 += 14;
                            }
                            if (var12 == 2) {
                                class108.field2585[1].method1036(var17, var11 - 12);
                                var17 += 14;
                            }
                            var5.method106(class85.method731(new class6[] { var10, class34.field813 }, 14569), var17, var11, 0);
                            int var18 = var17 + var5.method96(var10) + 8;
                            var5.method106(class5.field66[var7], var18, var11, 8388608);
                        }
                    }
                    if (var9 == 4 && (class12.field244 == 0 || class12.field244 == 1 && class6.method31(21469, var10))) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method106(class85.method731(new class6[] { var10, class75.field1710, class5.field66[var7] }, 14569), 4, var11, 8388736);
                        }
                        var6++;
                    }
                    if (var9 == 5 && class5.field67 == 0 && class15.field304 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method106(class5.field66[var7], 4, var11, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 6 && class5.field67 == 0 && class15.field304 < 2) {
                        if (var11 > 0 && var11 < 110) {
                            var5.method106(class85.method731(new class6[] { class139.field3371, class75.field1710, var10, class34.field813 }, 14569), 4, var11, 0);
                            var5.method106(class5.field66[var7], var5.method96(class85.method731(new class6[] { class139.field3371, class75.field1710, var10 }, 14569)) + 12, var11, 8388608);
                        }
                        var6++;
                    }
                    if (var9 == 8 && (class12.field244 == 0 || class12.field244 == 1 && class6.method31(21469, var10))) {
                        var6++;
                        if (var11 > 0 && var11 < 110) {
                            var5.method106(class85.method731(new class6[] { var10, class75.field1710, class5.field66[var7] }, 14569), 4, var11, 8270336);
                        }
                    }
                }
            }
            class74.method583();
            class95.field2235 = var6 * 14 + 7;
            if (class95.field2235 < 78) {
                class95.field2235 = 78;
            }
            class7.method73(463, class95.field2235 - class68.field1510 - 77, class95.field2235, 0, 18734, 77);
            class6 var8;
            if (class12.field229 == null || class12.field229.field1456 == null) {
                var8 = class102.field2390;
            } else {
                var8 = class12.field229.field1456;
            }
            var5.method106(class85.method731(new class6[] { var8, class34.field813 }, 14569), 4, 90, 0);
            var5.method106(class85.method731(new class6[] { class133.field3256, class38.field878 }, 14569), var5.method96(class85.method731(new class6[] { var8, class59.field1286 }, 14569)) + 6, 90, 255);
            class74.method584(0, 77, 479, 0);
        } else {
            boolean var4 = class95.method784(96, 479, 0, class117.field2776, 0, -1, 3);
            if (!var4) {
                class20.field427 = true;
            }
        }
        int var20 = 32 % ((24 - arg0) / 50);
        if (class125.field3052 && class67.field1473 == 2) {
            class4.method20(-53);
        }
        class8.method81(17);
        field1212++;
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)I", line = 429)
    public static final int method426(int arg0) {
        field1223++;
        return arg0 == -2 ? class129.field3142++ : 40;
    }
}
