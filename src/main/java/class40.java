import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class40 extends class93 {

    @OriginalMember(owner = "client!di", name = "W", descriptor = "Z")
    private boolean field899 = true;

    @OriginalMember(owner = "client!di", name = "S", descriptor = "Z")
    private boolean field895 = true;

    @OriginalMember(owner = "client!di", name = "X", descriptor = "Ljd;")
    public static class92 field900 = class202.method1325((byte) 90, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!di", name = "ab", descriptor = "Ljd;")
    private static class92 field903 = class202.method1325((byte) 90, "Select a world");

    @OriginalMember(owner = "client!di", name = "V", descriptor = "Ljd;")
    public static class92 field898 = field903;

    @OriginalMember(owner = "client!di", name = "Z", descriptor = "Loe;")
    public static class139 field902 = new class139(50);

    @OriginalMember(owner = "client!di", name = "eb", descriptor = "[I")
    public static int[] field907 = new int[256];

    @OriginalMember(owner = "client!di", name = "gb", descriptor = "Ljd;")
    public static class92 field909 = class202.method1325((byte) 90, "mn");

    @OriginalMember(owner = "client!di", name = "db", descriptor = "I")
    public static int field906 = -1;

    @OriginalMember(owner = "client!di", name = "T", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!di", name = "U", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!di", name = "Y", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!di", name = "cb", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!di", name = "fb", descriptor = "[[S")
    public static short[][] field908;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V")
    public static void method257(int arg0) {
        if (arg0 == 0) {
            field908 = null;
            field902 = null;
            field907 = null;
            field903 = null;
            field898 = null;
            field909 = null;
            field900 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, false);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIII)V")
    public static final void method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class64.field1310 * 128) {
            arg0 = class64.field1310 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class93.field1872 * 128) {
            arg2 = class93.field1872 * 128 - 1;
        }
        ++class96.field1931;
        class58.field1219 = class194.field3787[arg3];
        class89.field1753 = class194.field3803[arg3];
        class61.field1264 = class194.field3787[arg4];
        class202.field3915 = class194.field3803[arg4];
        class151.field2993 = class80.field1622[(arg3 - 128) / 32][arg4 / 64];
        class129.field2601 = arg0;
        class99.field2020 = arg1;
        class92.field1829 = arg2;
        class111.field2266 = arg0 / 128;
        class70.field1447 = arg2 / 128;
        class133.field2661 = arg5;
        class101.field2081 = class111.field2266 - class155.field3088;
        if (class101.field2081 < 0) {
            class101.field2081 = 0;
        }
        class34.field777 = class70.field1447 - class155.field3088;
        if (class34.field777 < 0) {
            class34.field777 = 0;
        }
        class179.field3436 = class155.field3088 + class111.field2266;
        if (class179.field3436 > class64.field1310) {
            class179.field3436 = class64.field1310;
        }
        class94.field1899 = class70.field1447 + class155.field3088;
        if (class94.field1899 > class93.field1872) {
            class94.field1899 = class93.field1872;
        }
        class208.method1355();
        class144.field2878 = 0;
        for (int var6 = class195.field3810; var6 < class151.field3003; ++var6) {
            class43[][] var31 = class31.field698[var6];
            for (int var32 = class101.field2081; var32 < class179.field3436; ++var32) {
                for (int var33 = class34.field777; var33 < class94.field1899; ++var33) {
                    class43 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field971 <= arg5 && (class151.field2993[var32 - class111.field2266 + class155.field3088][var33 - class70.field1447 + class155.field3088] || class158.field3146[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field982 = true;
                            var34.field955 = true;
                            if (var34.field979 > 0) {
                                var34.field964 = true;
                            } else {
                                var34.field964 = false;
                            }
                            ++class144.field2878;
                        } else {
                            var34.field982 = false;
                            var34.field955 = false;
                            var34.field980 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class195.field3810; var7 < class151.field3003; ++var7) {
            class43[][] var20 = class31.field698[var7];
            for (int var21 = -class155.field3088; var21 <= 0; ++var21) {
                int var22 = class111.field2266 + var21;
                int var23 = class111.field2266 - var21;
                if (var22 >= class101.field2081 || var23 < class179.field3436) {
                    for (int var24 = -class155.field3088; var24 <= 0; ++var24) {
                        int var25 = class70.field1447 + var24;
                        int var26 = class70.field1447 - var24;
                        if (var22 >= class101.field2081) {
                            if (var25 >= class34.field777) {
                                class43 var27 = var20[var22][var25];
                                if (var27 != null && var27.field982) {
                                    class108.method748(var27, true);
                                }
                            }
                            if (var26 < class94.field1899) {
                                class43 var28 = var20[var22][var26];
                                if (var28 != null && var28.field982) {
                                    class108.method748(var28, true);
                                }
                            }
                        }
                        if (var23 < class179.field3436) {
                            if (var25 >= class34.field777) {
                                class43 var29 = var20[var23][var25];
                                if (var29 != null && var29.field982) {
                                    class108.method748(var29, true);
                                }
                            }
                            if (var26 < class94.field1899) {
                                class43 var30 = var20[var23][var26];
                                if (var30 != null && var30.field982) {
                                    class108.method748(var30, true);
                                }
                            }
                        }
                        if (class144.field2878 == 0) {
                            class31.field714 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class195.field3810; var8 < class151.field3003; ++var8) {
            class43[][] var9 = class31.field698[var8];
            for (int var10 = -class155.field3088; var10 <= 0; ++var10) {
                int var11 = class111.field2266 + var10;
                int var12 = class111.field2266 - var10;
                if (var11 >= class101.field2081 || var12 < class179.field3436) {
                    for (int var13 = -class155.field3088; var13 <= 0; ++var13) {
                        int var14 = class70.field1447 + var13;
                        int var15 = class70.field1447 - var13;
                        if (var11 >= class101.field2081) {
                            if (var14 >= class34.field777) {
                                class43 var16 = var9[var11][var14];
                                if (var16 != null && var16.field982) {
                                    class108.method748(var16, false);
                                }
                            }
                            if (var15 < class94.field1899) {
                                class43 var17 = var9[var11][var15];
                                if (var17 != null && var17.field982) {
                                    class108.method748(var17, false);
                                }
                            }
                        }
                        if (var12 < class179.field3436) {
                            if (var14 >= class34.field777) {
                                class43 var18 = var9[var12][var14];
                                if (var18 != null && var18.field982) {
                                    class108.method748(var18, false);
                                }
                            }
                            if (var15 < class94.field1899) {
                                class43 var19 = var9[var12][var15];
                                if (var19 != null && var19.field982) {
                                    class108.method748(var19, false);
                                }
                            }
                        }
                        if (class144.field2878 == 0) {
                            class31.field714 = false;
                            return;
                        }
                    }
                }
            }
        }
        class31.field714 = false;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public static final void method259(int arg0, int arg1, int arg2) {
        class43 var3 = class31.field698[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field972 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        ++field905;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field1885 = ~arg1.method443(255) == -2;
                }
            } else {
                this.field899 = arg1.method443(255) == 1;
            }
        } else {
            this.field895 = ~arg1.method443(255) == -2;
        }
        if (arg2 != 0) {
            method259(32, 88, -61);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field901;
        int[] var3 = super.field1887.method916(arg0, -58);
        if (super.field1887.field2757) {
            int[] var4 = this.method648((byte) 55, this.field899 ? -arg0 + class5.field279 : arg0, 0);
            if (this.field895) {
                for (int var5 = 0; ~var5 > ~class150.field2985; ++var5) {
                    var3[var5] = var4[-var5 + class2.field163];
                }
            } else {
                class11.method76(var4, 0, var3, 0, class150.field2985);
            }
        }
        int var6 = 19 / ((arg1 - 67) / 42);
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field904;
        int[][] var3 = super.field1873.method553(arg0, 0);
        if (arg1 != 4096) {
            this.method66(-22, (byte) 106);
        }
        if (super.field1873.field1656) {
            int[][] var4 = this.method649(0, true, !this.field899 ? arg0 : -arg0 + class5.field279);
            int[] var5 = var3[0];
            int[] var6 = var4[0];
            int[] var7 = var3[2];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var3[1];
            if (this.field895) {
                for (int var11 = 0; ~var11 > ~class150.field2985; ++var11) {
                    var5[var11] = var6[class2.field163 - var11];
                    var10[var11] = var9[class2.field163 - var11];
                    var7[var11] = var8[-var11 + class2.field163];
                }
            } else {
                for (int var12 = 0; ~class150.field2985 < ~var12; ++var12) {
                    var5[var12] = var6[var12];
                    var10[var12] = var9[var12];
                    var7[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/awt/Component;Lrh;III)Lmg;")
    public static final class123 method260(Component arg0, class169 arg1, int arg2, int arg3, int arg4) {
        if (arg4 != 1) {
            return null;
        } else {
            ++field897;
            if (class175.field3378 == 0) {
                throw new IllegalStateException();
            } else if (~arg3 <= -1 && arg3 < 2) {
                if (arg2 < 256) {
                    arg2 = 256;
                }
                try {
                    class123 var5 = (class123) Class.forName("mf").newInstance();
                    var5.field2497 = arg2;
                    var5.field2478 = new int[256 * (!class76.field1583 ? 1 : 2)];
                    var5.method557(arg0);
                    var5.field2496 = (-1024 & arg2) + 1024;
                    if (~var5.field2496 < -16385) {
                        var5.field2496 = 16384;
                    }
                    var5.method559(var5.field2496);
                    if (class20.field492 > 0 && class175.field3385 == null) {
                        class175.field3385 = new class90();
                        class175.field3385.field1766 = arg1;
                        arg1.method1125(class175.field3385, class20.field492, 17258);
                    }
                    if (class175.field3385 != null) {
                        if (class175.field3385.field1770[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class175.field3385.field1770[arg3] = var5;
                    }
                    return var5;
                } catch (Throwable var8) {
                    try {
                        class83 var6 = new class83(arg1, arg3);
                        var6.field2497 = arg2;
                        var6.field2478 = new int[(!class76.field1583 ? 1 : 2) * 256];
                        var6.method557(arg0);
                        var6.field2496 = 16384;
                        var6.method559(var6.field2496);
                        if (class20.field492 > 0 && class175.field3385 == null) {
                            class175.field3385 = new class90();
                            class175.field3385.field1766 = arg1;
                            arg1.method1125(class175.field3385, class20.field492, arg4 ^ 17259);
                        }
                        if (class175.field3385 != null) {
                            if (class175.field3385.field1770[arg3] != null) {
                                throw new IllegalArgumentException();
                            }
                            class175.field3385.field1770[arg3] = var6;
                        }
                        return var6;
                    } catch (Throwable var7) {
                        return new class123();
                    }
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }
}
