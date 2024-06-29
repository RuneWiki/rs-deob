import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class244 {

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Ljava/lang/String;")
    public static String field3294 = "Loading world list data";

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lbd;")
    public static class38 field3291;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BIIII)V")
    public static final void method1539(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3296++;
        class169.field2360.field2888 = 0;
        class169.field2360.method1396(21375, 20);
        class169.field2360.method1396(21375, arg3);
        class169.field2360.method1396(21375, arg1);
        class169.field2360.method1380(arg2, (byte) -8);
        class169.field2360.method1380(arg4, (byte) -8);
        class392.field5734 = 1;
        class75.field841 = 0;
        class10.field120 = 0;
        if (arg0 > -70) {
            method1544((byte) 5, -108);
        }
        class430.field6238 = -3;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static final void method1540(int arg0) {
        field3295++;
        if (class400.field5813.length() == 0) {
            return;
        }
        if (arg0 >= 0) {
            method1541(-7);
        }
        class400.method2531("--> " + class400.field5813, (byte) 58);
        class6.method63(-11, false, class400.field5813);
        class400.field5813 = "";
        class306.field4385 = 0;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        field3297++;
        if (arg0 != -26064) {
            method1541(-60);
        }
        for (int var1 = 0; var1 < class45.field544; var1++) {
            int var10002 = class119.field1560[var1]--;
            if (class119.field1560[var1] >= -10) {
                class46 var3 = class236.field3210[var1];
                if (var3 == null) {
                    var3 = class46.method291(class151.field2113, class116.field1373[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class119.field1560[var1] += var3.method290();
                    class236.field3210[var1] = var3;
                }
                if (class119.field1560[var1] < 0) {
                    int var10;
                    if (class268.field3768[var1] == 0) {
                        var10 = class83.field932[var1] * class351.field5129 >> 8;
                    } else {
                        int var4 = (class268.field3768[var1] & 0xFF) * 128;
                        int var5 = (class268.field3768[var1] & 0xFF73A4) >> 16;
                        int var6 = var5 * 128 + 64 - class390.field5715.field1304;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class268.field3768[var1] & 0xFF5F) >> 8;
                        int var8 = var7 * 128 + 64 - class390.field5715.field1311;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var6 + var8 - 128;
                        if (var4 < var9) {
                            class119.field1560[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class308.field4405 * class83.field932[var1] / var4 >> 8;
                    }
                    if (var10 > 0) {
                        class177 var11 = var3.method289().method1165(class206.field2802);
                        class380 var12 = class380.method2436(var11, 100, var10);
                        var12.method2442(class56.field632[var1] - 1);
                        class135.field1884.method2810(var12);
                    }
                    class119.field1560[var1] = -100;
                }
            } else {
                class45.field544--;
                for (int var2 = var1; var2 < class45.field544; var2++) {
                    class116.field1373[var2] = class116.field1373[var2 + 1];
                    class236.field3210[var2] = class236.field3210[var2 + 1];
                    class56.field632[var2] = class56.field632[var2 + 1];
                    class119.field1560[var2] = class119.field1560[var2 + 1];
                    class268.field3768[var2] = class268.field3768[var2 + 1];
                    class83.field932[var2] = class83.field932[var2 + 1];
                }
                var1--;
            }
        }
        if (class343.field5049 && !class269.method1708((byte) -113)) {
            if (class75.field834 != 0 && class423.field6072 != -1) {
                class8.method80(class423.field6072, false, class354.field5165, 0, -74, class75.field834);
            }
            class343.field5049 = false;
        } else if (class75.field834 != 0 && class423.field6072 != -1 && !class269.method1708((byte) -113)) {
            class169.field2360.method809(255, -28022);
            class248.field3371++;
            class169.field2360.method1361((byte) -125, class423.field6072);
            class423.field6072 = -1;
        }
    }

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
    public static void method1542(int arg0) {
        if (arg0 != 0) {
            method1543(-18);
        }
        field3294 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "(I)V")
    public static final void method1543(int arg0) {
        class331 var1 = class238.field3243;
        synchronized (class238.field3243) {
            class238.field3243.method2043(-101);
        }
        int var2 = 36 % ((arg0 + 13) / 49);
        field3293++;
        class331 var3 = class402.field5855;
        synchronized (class402.field5855) {
            class402.field5855.method2043(-57);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)V")
    public static final void method1544(byte arg0, int arg1) {
        field3292++;
        class348 var2 = class385.method2464(11, arg0 ^ 0xFFFFFAC9, arg1);
        if (arg0 == -33) {
            var2.method2214((byte) 121);
        }
    }
}
