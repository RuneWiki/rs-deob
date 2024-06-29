import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class193 {

    @OriginalMember(owner = "client!le", name = "e", descriptor = "Lmh;")
    public static class62 field3243 = class201.method1405(true, "sch-Utteln:");

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field3239;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field3249;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    public int field3250;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field3252;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Lhi;")
    public static class26 field3251;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lgi;")
    public static class285 field3246;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "Lmh;")
    public class62 field3240;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Z")
    public boolean field3242;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BIZIIIIIF)[[I", line = 26)
    public static final int[][] method1352(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, float arg8) {
        int[][] var9 = new int[arg1][arg3];
        field3254++;
        class262 var10 = new class262();
        var10.field4400 = arg7;
        var10.field4416 = arg2;
        var10.field4399 = arg4;
        if (arg0 != 126) {
            method1356((class62) null, -9, -25);
        }
        var10.field4423 = (int) (arg8 * 4096.0F);
        var10.field4410 = arg6;
        var10.method231((byte) 90);
        class122.method934(97, arg3, arg1);
        for (int var11 = 0; var11 < arg1; var11++) {
            var10.method1812((byte) -15, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 64)
    public static void method1353(int arg0) {
        if (arg0 == 30393) {
            field3243 = null;
            field3251 = null;
            field3246 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I", line = 82)
    public static final int method1354(byte arg0) {
        field3244++;
        if ((double) class169.field2758 == 3.0D) {
            return 37;
        }
        if (arg0 != -116) {
            method1353(6);
        }
        if ((double) class169.field2758 == 4.0D) {
            return 50;
        } else if ((double) class169.field2758 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(BZIII)V", line = 105)
    public static final void method1355(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field3253++;
        if (class20.method95(true, arg3)) {
            class236.method1665((byte) 115, arg2, arg1, -1, arg4, class275.field4713[arg3]);
            if (arg0 != -20) {
                method1353(-88);
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lmh;II)V", line = 126)
    public static final void method1356(class62 arg0, int arg1, int arg2) {
        class170.field2772.method1693(124, false);
        class170.field2772.method730(arg2, 106);
        class248.field4224++;
        if (arg1 >= -58) {
            field3243 = (class62) null;
        }
        class170.field2772.method729(-11776, arg0.method451(48));
        field3247++;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 142)
    public static final void method1357(int arg0) {
        for (int var1 = 0; var1 < class39.field603; var1++) {
            int var10002 = class37.field524[var1]--;
            if (class37.field524[var1] >= -10) {
                class223 var3 = class162.field2624[var1];
                if (var3 == null) {
                    var3 = class223.method1584(class272.field4629, class164.field2653[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class37.field524[var1] += var3.method1586();
                    class162.field2624[var1] = var3;
                }
                if (class37.field524[var1] < 0) {
                    int var10;
                    if (class151.field2383[var1] == 0) {
                        var10 = class169.field2744;
                    } else {
                        int var4 = (class151.field2383[var1] & 0xFF) * 128;
                        int var5 = class151.field2383[var1] >> 16 & 0xFF;
                        int var6 = var5 * 128 + 64 - class268.field4551.field3821;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        int var7 = (class151.field2383[var1] & 0xFF65) >> 8;
                        int var8 = var7 * 128 + 64 - class268.field4551.field3814;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var8 + var6 - 128;
                        if (var4 < var9) {
                            class37.field524[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class114.field1902 / var4;
                    }
                    if (var10 > 0) {
                        class9 var11 = var3.method1587().method39(class22.field238);
                        class132 var12 = class132.method992(var11, 100, var10);
                        var12.method1005(class261.field4382[var1] - 1);
                        class27.field331.method128(var12);
                    }
                    class37.field524[var1] = -100;
                }
            } else {
                class39.field603--;
                for (int var2 = var1; var2 < class39.field603; var2++) {
                    class164.field2653[var2] = class164.field2653[var2 + 1];
                    class162.field2624[var2] = class162.field2624[var2 + 1];
                    class261.field4382[var2] = class261.field4382[var2 + 1];
                    class37.field524[var2] = class37.field524[var2 + 1];
                    class151.field2383[var2] = class151.field2383[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 < 88) {
            method1356((class62) null, 69, -92);
        }
        field3241++;
        if (class91.field1429 && !class109.method841(116)) {
            if (class100.field1650 != 0 && class182.field2909 != -1) {
                class198.method1387(0, false, 84, class163.field2649, class182.field2909, class100.field1650);
            }
            class91.field1429 = false;
        } else if (class100.field1650 != 0 && class182.field2909 != -1 && !class109.method841(120)) {
            class170.field2772.method1693(216, false);
            class170.field2772.method712(class182.field2909, -50);
            class182.field2909 = -1;
            class97.field1598++;
        }
    }
}
