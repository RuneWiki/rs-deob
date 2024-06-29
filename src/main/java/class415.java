import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class415 extends class544 {

    @OriginalMember(owner = "client!np", name = "p", descriptor = "Lvi;")
    public class459 field5390;

    @OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
    public static int[] field5393 = new int[4];

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field5387;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!np", name = "q", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!np", name = "r", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!np", name = "t", descriptor = "I")
    public static int field5394;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public static int field5395;

    @OriginalMember(owner = "client!np", name = "v", descriptor = "I")
    public static int field5396;

    @OriginalMember(owner = "client!np", name = "w", descriptor = "[[[I")
    public static int[][][] field5397;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2365(int arg0) {
        if (arg0 != -29229) {
            field5393 = null;
        }
        field5389++;
        class102.field1254 = 0;
        class67.field648 = 0;
        class98.field1206 = 0;
        class545.field8003 = 0;
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Z", line = 16)
    public static final boolean method2366(int arg0, int arg1) {
        field5388++;
        if (arg0 > -121) {
            return true;
        } else {
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V", line = 28)
    public static final void method2367(int arg0) {
        for (int var1 = 0; var1 < class570.field8370; var1++) {
            class114 var2 = class250.field3228[var1];
            boolean var3 = false;
            if (var2.field1424 == null) {
                var2.field1419--;
                if (var2.field1419 < (var2.field1415 == 2 ? -1500 : -10)) {
                    var3 = true;
                } else {
                    if (var2.field1415 == 1 && var2.field1427 == null) {
                        var2.field1427 = class26.method159(class173.field2110, var2.field1426, 0);
                        if (var2.field1427 == null) {
                            continue;
                        }
                        var2.field1419 += var2.field1427.method160();
                    } else if (var2.field1415 == 2 && (var2.field1422 == null || var2.field1418 == null)) {
                        if (var2.field1422 == null) {
                            var2.field1422 = class568.method3310(class479.field6729, var2.field1426);
                        }
                        if (var2.field1422 == null) {
                            continue;
                        }
                        if (var2.field1418 == null) {
                            var2.field1418 = var2.field1422.method3312(new int[] { 22050 });
                            if (var2.field1418 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field1419 < 0) {
                        int var5;
                        if (var2.field1416 == 0) {
                            var5 = class565.field8299.field2167 * var2.field1421 >> 8;
                        } else {
                            int var4 = var2.field1416 >> 24 & 0x3;
                            if (class103.field1265.field8660 == var4) {
                                int var6 = (var2.field1416 & 0xFF) << 7;
                                int var7 = (var2.field1416 & 0xFFCDB0) >> 16;
                                int var8 = (var7 << 7) + 64 - class103.field1265.field8661;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field1416 >> 8 & 0xFF;
                                int var10 = (var9 << 7) + 64 - class103.field1265.field8652;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 - (128 - var10);
                                if (var6 < var11) {
                                    var2.field1419 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var5 = (var6 - var11) * class565.field8299.field2177 * var2.field1421 / var6 >> 8;
                            } else {
                                var5 = 0;
                            }
                        }
                        if (var5 > 0) {
                            class123 var12 = null;
                            if (var2.field1415 == 1) {
                                var12 = var2.field1427.method158().method708(class80.field957);
                            } else if (var2.field1415 == 2) {
                                var12 = var2.field1418;
                            }
                            class375 var13 = var2.field1424 = class375.method2181(var12, 100, var5);
                            var13.method2175(var2.field1423 - 1);
                            class534.field7500.method810(var13);
                        }
                    }
                }
            } else if (!var2.field1424.method3189(-9613)) {
                var3 = true;
            }
            if (var3) {
                class570.field8370--;
                for (int var14 = var1; var14 < class570.field8370; var14++) {
                    class250.field3228[var14] = class250.field3228[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0 != -1) {
            field5392 = 89;
        }
        field5395++;
        if (class157.field1921 && !class528.method3007(-1)) {
            if (class565.field8299.field2192 != 0 && class225.field2766 != -1) {
                class448.method2621(class565.field8299.field2192, 0, false, true, class225.field2766, class282.field3709);
            }
            class157.field1921 = false;
        } else if (class565.field8299.field2192 != 0 && class225.field2766 != -1 && !class528.method3007(arg0)) {
            class584.field8483++;
            class418.method2378(17984, class625.field9000);
            class136.field1663.method2131(class225.field2766, -1495157560);
            class225.field2766 = -1;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZI)I", line = 200)
    public static final int method2368(int arg0, int arg1, boolean arg2, int arg3) {
        field5391++;
        if (class138.field1682 < 100) {
            return -2;
        }
        if (arg2) {
            field5397 = null;
        }
        int var4 = -2;
        int var5 = Integer.MAX_VALUE;
        int var6 = arg3 - class353.field4621;
        int var7 = arg0 - class353.field4607;
        for (class258 var8 = (class258) class353.field4597.method1050((byte) 73); var8 != null; var8 = (class258) class353.field4597.method1047(-7962)) {
            if (var8.field3313 == arg1) {
                int var9 = var8.field3320;
                int var10 = var8.field3317;
                int var11 = var10 + class353.field4607 | class353.field4621 + var9 << 14;
                int var12 = (var7 - var10) * (var7 - var10) + (var6 - var9) * (var6 - var9);
                if (var4 < 0 || var5 > var12) {
                    var4 = var11;
                    var5 = var12;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 250)
    public static void method2369(byte arg0) {
        field5397 = null;
        field5393 = null;
        if (arg0 != -22) {
            method2366(55, 11);
        }
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(I)Lf;", line = 261)
    public static final class642 method2370(int arg0) {
        field5396++;
        try {
            return new class321();
        } catch (Throwable var2) {
            if (arg0 != 255) {
                field5397 = null;
            }
            try {
                return (class642) Class.forName("nw").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class417();
            }
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lvi;)V", line = 287)
    public class415(class459 arg0) {
        this.field5390 = arg0;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Let;III)V", line = 301)
    public static final void method2371(class509 arg0, int arg1, int arg2, int arg3) {
        class469.field6563 = arg3;
        if (arg2 != 255) {
            method2368(29, -48, true, 100);
        }
        class450.field6228 = arg1;
        class561.field8249 = arg0;
        field5394++;
    }
}
