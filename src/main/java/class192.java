import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class192 extends class67 {

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field3700;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "Li;")
    private static class88 field3691 = class208.method1425(105, "glow3:");

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Li;")
    public static class88 field3694 = class208.method1425(105, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!rg", name = "A", descriptor = "Li;")
    public static class88 field3697 = field3691;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "Li;")
    private static class88 field3701 = class208.method1425(105, "flash2:");

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Li;")
    public static class88 field3692 = field3701;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Li;")
    public static class88 field3693 = field3701;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "Li;")
    private static class88 field3698 = class208.method1425(105, "Hidden");

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Li;")
    public static class88 field3695 = field3698;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Li;")
    public static class88 field3705 = field3691;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)I")
    public static final int method1332(int arg0, int arg1, int arg2) {
        if (arg2 != 16911) {
            method1335(126, 98, false, -14, -101, -98, -2, -58);
        }
        field3690++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "()V")
    public static final void method1333() {
        int var0 = class62.field1148[class155.field2995];
        class13[] var1 = class62.field1149[class155.field2995];
        class71.field1316 = 0;
        label191: for (int var2 = 0; var2 < var0; var2++) {
            class13 var3 = var1[var2];
            if (class246.field4512 != null) {
                for (int var4 = 0; var4 < class246.field4512.length; var4++) {
                    if (class246.field4512[var4] != -1000000 && (var3.field189 <= class246.field4512[var4] || var3.field196 <= class246.field4512[var4]) && (var3.field185 <= class184.field3607[var4] || var3.field193 <= class184.field3607[var4]) && (var3.field185 >= class44.field740[var4] || var3.field193 >= class44.field740[var4]) && (var3.field191 <= class144.field2715[var4] || var3.field205 <= class144.field2715[var4]) && (var3.field191 >= class204.field3884[var4] || var3.field205 >= class204.field3884[var4])) {
                        continue label191;
                    }
                }
            }
            if (var3.field190 == 1) {
                int var5 = var3.field204 + class150.field2913 - class79.field1435;
                if (var5 >= 0 && var5 <= class150.field2913 + class150.field2913) {
                    int var6 = var3.field187 + class150.field2913 - class88.field1636;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    int var7 = var3.field200 + class150.field2913 - class88.field1636;
                    if (var7 > class150.field2913 + class150.field2913) {
                        var7 = class150.field2913 + class150.field2913;
                    }
                    boolean var8 = false;
                    while (var6 <= var7) {
                        if (class18.field304[var5][var6++]) {
                            var8 = true;
                            break;
                        }
                    }
                    if (var8) {
                        int var9 = class74.field1353 - var3.field185;
                        if (var9 > 32) {
                            var3.field206 = 1;
                        } else {
                            if (var9 >= -32) {
                                continue;
                            }
                            var3.field206 = 2;
                            var9 = -var9;
                        }
                        var3.field199 = (var3.field191 - class216.field4050 << 8) / var9;
                        var3.field186 = (var3.field205 - class216.field4050 << 8) / var9;
                        var3.field188 = (var3.field189 - class241.field4463 << 8) / var9;
                        var3.field201 = (var3.field196 - class241.field4463 << 8) / var9;
                        class159.field3077[class71.field1316++] = var3;
                    }
                }
            } else if (var3.field190 == 2) {
                int var10 = var3.field187 + class150.field2913 - class88.field1636;
                if (var10 >= 0 && var10 <= class150.field2913 + class150.field2913) {
                    int var11 = var3.field204 + class150.field2913 - class79.field1435;
                    if (var11 < 0) {
                        var11 = 0;
                    }
                    int var12 = var3.field194 + class150.field2913 - class79.field1435;
                    if (var12 > class150.field2913 + class150.field2913) {
                        var12 = class150.field2913 + class150.field2913;
                    }
                    boolean var13 = false;
                    while (var11 <= var12) {
                        if (class18.field304[var11++][var10]) {
                            var13 = true;
                            break;
                        }
                    }
                    if (var13) {
                        int var14 = class216.field4050 - var3.field191;
                        if (var14 > 32) {
                            var3.field206 = 3;
                        } else {
                            if (var14 >= -32) {
                                continue;
                            }
                            var3.field206 = 4;
                            var14 = -var14;
                        }
                        var3.field197 = (var3.field185 - class74.field1353 << 8) / var14;
                        var3.field195 = (var3.field193 - class74.field1353 << 8) / var14;
                        var3.field188 = (var3.field189 - class241.field4463 << 8) / var14;
                        var3.field201 = (var3.field196 - class241.field4463 << 8) / var14;
                        class159.field3077[class71.field1316++] = var3;
                    }
                }
            } else if (var3.field190 == 4) {
                int var15 = var3.field189 - class241.field4463;
                if (var15 > 128) {
                    int var16 = var3.field187 + class150.field2913 - class88.field1636;
                    if (var16 < 0) {
                        var16 = 0;
                    }
                    int var17 = var3.field200 + class150.field2913 - class88.field1636;
                    if (var17 > class150.field2913 + class150.field2913) {
                        var17 = class150.field2913 + class150.field2913;
                    }
                    if (var16 <= var17) {
                        int var18 = var3.field204 + class150.field2913 - class79.field1435;
                        if (var18 < 0) {
                            var18 = 0;
                        }
                        int var19 = var3.field194 + class150.field2913 - class79.field1435;
                        if (var19 > class150.field2913 + class150.field2913) {
                            var19 = class150.field2913 + class150.field2913;
                        }
                        boolean var20 = false;
                        label163: for (int var21 = var18; var21 <= var19; var21++) {
                            for (int var22 = var16; var22 <= var17; var22++) {
                                if (class18.field304[var21][var22]) {
                                    var20 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var20) {
                            var3.field206 = 5;
                            var3.field197 = (var3.field185 - class74.field1353 << 8) / var15;
                            var3.field195 = (var3.field193 - class74.field1353 << 8) / var15;
                            var3.field199 = (var3.field191 - class216.field4050 << 8) / var15;
                            var3.field186 = (var3.field205 - class216.field4050 << 8) / var15;
                            class159.field3077[class71.field1316++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)Loe;")
    public static final class157 method1334(int arg0, int arg1, int arg2) {
        class52 var3 = class29.field489[arg0][arg1][arg2];
        return var3 == null ? null : var3.field959;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method1335(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = arg1 + arg4;
        field3703++;
        int var9 = arg3 - arg4;
        int var10 = arg4 + arg5;
        if (!arg2) {
            method1332(-83, -116, 55);
        }
        for (int var11 = arg1; var11 < var8; var11++) {
            class230.method1536(arg5, arg7, -7, arg6, class3.field42[var11]);
        }
        int var12 = arg6 - arg4;
        for (int var13 = arg3; var13 > var9; var13--) {
            class230.method1536(arg5, arg7, -7, arg6, class3.field42[var13]);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class3.field42[var14];
            class230.method1536(arg5, arg7, -7, var10, var15);
            class230.method1536(var10, arg0, -7, var12, var15);
            class230.method1536(var12, arg7, -7, arg6, var15);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
    public static final void method1336(int arg0, boolean arg1) {
        if (arg0 > 74) {
            field3696++;
            class212.method1451(class222.field4194, class43.field723, (byte) 10, class145.field2727, arg1);
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(Z)V")
    public static void method1337(boolean arg0) {
        field3694 = null;
        field3701 = null;
        field3693 = null;
        field3697 = null;
        field3692 = null;
        field3691 = null;
        field3698 = null;
        field3705 = null;
        if (!arg0) {
            field3695 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class192() {
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
    public class192(int arg0) {
        this.field3700 = arg0;
    }
}
