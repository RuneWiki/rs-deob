import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class69 {

    @OriginalMember(owner = "client!k", name = "l", descriptor = "Lme;")
    public class88 field1451 = new class88();

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "Ltd;")
    public static class136 field1453 = class145.method1172("und loggen sich dann erneut ein)3", 45);

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Ltd;")
    public static class136 field1456 = class145.method1172("Abbrechen", 45);

    @OriginalMember(owner = "client!k", name = "s", descriptor = "Ltd;")
    public static class136 field1458 = class145.method1172("Keine Antwort vom Server)3", 45);

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "Ltd;")
    private static class136 field1462 = class145.method1172("Sorry invited players only)3", 45);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "Ltd;")
    public static class136 field1440 = field1462;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field1442 = 127;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!k", name = "i", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!k", name = "j", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Lmd;")
    public static class87 field1466;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lme;")
    private class88 field1465;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)V")
    public static final void method506(int arg0, int arg1, byte arg2) {
        field1463++;
        int[] var3 = new int[4];
        int[] var4 = new int[4];
        var3[0] = arg1;
        var4[0] = arg0;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class127.field3021[var6] != arg1) {
                var3[var5] = class127.field3021[var6];
                var4[var5] = class107.field2529[var6];
                var5++;
            }
        }
        class107.field2529 = var4;
        class127.field3021 = var3;
        class89.method679(class11.field189.length - 1, 0, class107.field2529, 17322, class127.field3021, class11.field189);
        int var7 = -35 % ((32 - arg2) / 57);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V")
    public final void method507(int arg0) {
        field1444++;
        if (arg0 > -67) {
            this.field1451 = null;
        }
        while (true) {
            class88 var2 = this.field1451.field2085;
            if (this.field1451 == var2) {
                return;
            }
            var2.method674(32);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Ltd;")
    public static final class136 method508(int arg0, byte arg1) {
        field1452++;
        if (arg1 >= -72) {
            return null;
        } else if (class65.field1407[arg0].method1119(-10511) > 0) {
            return class79.method570(0, new class136[] { class119.field2713[arg0], class37.field859, class65.field1407[arg0] });
        } else {
            return class119.field2713[arg0];
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILme;)V")
    public final void method509(int arg0, class88 arg1) {
        field1441++;
        if (arg1.field2087 != null) {
            arg1.method674(arg0 + 31);
        }
        arg1.field2087 = this.field1451.field2087;
        arg1.field2085 = this.field1451;
        arg1.field2087.field2085 = arg1;
        if (arg0 != 1) {
            field1466 = null;
        }
        arg1.field2085.field2087 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIII)V")
    public static final void method510(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class147.field3410 == 0 && !class40.field933) {
            class108.field2542++;
            class19.method134(-124, 12, arg4 - arg2, class118.field2694, class37.field871, 0, arg3 - arg0);
        }
        int var5 = -1;
        int var6 = 0;
        if (arg1 != 18) {
            method510(-28, -77, -83, 44, 1);
        }
        while (var6 < class23.field518) {
            int var7 = class23.field538[var6];
            int var8 = var7 & 0x7F;
            int var9 = var7 >> 29 & 0x3;
            int var10 = var7 >> 7 & 0x7F;
            int var11 = var7 >> 14 & 0x7FFF;
            if (var5 != var7) {
                label274: {
                    var5 = var7;
                    if (var9 == 2 && class146.field3366.method759(class62.field1331, var8, var10, var7) >= 0) {
                        class128 var12 = class142.method1154(var11, arg1 + 63);
                        if (var12.field3065 != null) {
                            var12 = var12.method1044(-12536);
                        }
                        if (var12 == null) {
                            break label274;
                        }
                        if (class147.field3410 == 1) {
                            class19.method134(-116, 29, var10, class152.field3483, class79.method570(0, new class136[] { class49.field1126, class141.field3270, var12.field3047 }), var7, var8);
                            class152.field3471++;
                        } else if (!class40.field933) {
                            class139.field3255++;
                            class136[] var13 = var12.field3059;
                            if (class80.field1845) {
                                var13 = class147.method1182(true, var13);
                            }
                            if (var13 != null) {
                                for (int var14 = 4; var14 >= 0; var14--) {
                                    if (var13[var14] != null) {
                                        class71.field1485++;
                                        short var15 = 0;
                                        if (var14 == 0) {
                                            var15 = 5;
                                        }
                                        if (var14 == 1) {
                                            var15 = 2;
                                        }
                                        if (var14 == 2) {
                                            var15 = 4;
                                        }
                                        if (var14 == 3) {
                                            var15 = 45;
                                        }
                                        if (var14 == 4) {
                                            var15 = 1006;
                                        }
                                        class19.method134(arg1 - 139, var15, var10, var13[var14], class79.method570(arg1 ^ 0x12, new class136[] { class109.field2568, var12.field3047 }), var7, var8);
                                    }
                                }
                            }
                            class19.method134(-121, 1001, var10, class106.field2496, class79.method570(0, new class136[] { class109.field2568, var12.field3047 }), var12.field3067 << 14, var8);
                        } else if ((class5.field97 & 0x4) == 4) {
                            class19.method134(-113, 23, var10, class27.field602, class79.method570(0, new class136[] { class28.field620, class141.field3270, var12.field3047 }), var7, var8);
                            class100.field2411++;
                        }
                    }
                    if (var9 == 1) {
                        class67 var16 = class122.field2846[var11];
                        if (var16.field1428.field2307 == 1 && (var16.field3580 & 0x7F) == 64 && (var16.field3578 & 0x7F) == 64) {
                            for (int var17 = 0; var17 < class51.field1145; var17++) {
                                class67 var20 = class122.field2846[class139.field3237[var17]];
                                if (var20 != null && var16 != var20 && var20.field1428.field2307 == 1 && var16.field3580 == var20.field3580 && var16.field3578 == var20.field3578) {
                                    class61.method464(var10, var20.field1428, var8, class139.field3237[var17], (byte) -87);
                                }
                            }
                            for (int var18 = 0; var18 < class55.field1255; var18++) {
                                class13 var19 = class154.field3518[class24.field564[var18]];
                                if (var19 != null && var16.field3580 == var19.field3580 && var16.field3578 == var19.field3578) {
                                    class85.method634(var10, class24.field564[var18], var19, (byte) 61, var8);
                                }
                            }
                        }
                        class61.method464(var10, var16.field1428, var8, var11, (byte) -87);
                    }
                    if (var9 == 0) {
                        class13 var21 = class154.field3518[var11];
                        if ((var21.field3580 & 0x7F) == 64 && (var21.field3578 & 0x7F) == 64) {
                            for (int var22 = 0; var22 < class51.field1145; var22++) {
                                class67 var25 = class122.field2846[class139.field3237[var22]];
                                if (var25 != null && var25.field1428.field2307 == 1 && var21.field3580 == var25.field3580 && var21.field3578 == var25.field3578) {
                                    class61.method464(var10, var25.field1428, var8, class139.field3237[var22], (byte) -87);
                                }
                            }
                            for (int var23 = 0; var23 < class55.field1255; var23++) {
                                class13 var24 = class154.field3518[class24.field564[var23]];
                                if (var24 != null && var21 != var24 && var21.field3580 == var24.field3580 && var21.field3578 == var24.field3578) {
                                    class85.method634(var10, class24.field564[var23], var24, (byte) 104, var8);
                                }
                            }
                        }
                        class85.method634(var10, var11, var21, (byte) 70, var8);
                    }
                    if (var9 == 3) {
                        class69 var26 = class93.field2197[class62.field1331][var8][var10];
                        if (var26 != null) {
                            for (class106 var27 = (class106) var26.method515(true); var27 != null; var27 = (class106) var26.method516(arg1 ^ 0xFFFFFF9B)) {
                                class121 var28 = class63.method472(var27.field2499, (byte) 127);
                                if (class147.field3410 == 1) {
                                    class77.field1753++;
                                    class19.method134(-121, 3, var10, class152.field3483, class79.method570(0, new class136[] { class49.field1126, class116.field2651, var28.field2789 }), var27.field2499, var8);
                                } else if (!class40.field933) {
                                    class63.field1355++;
                                    class136[] var29 = var28.field2800;
                                    if (class80.field1845) {
                                        var29 = class147.method1182(true, var29);
                                    }
                                    for (int var30 = 4; var30 >= 0; var30--) {
                                        if (var29 != null && var29[var30] != null) {
                                            class87.field2058++;
                                            byte var31 = 0;
                                            if (var30 == 0) {
                                                var31 = 18;
                                            }
                                            if (var30 == 1) {
                                                var31 = 7;
                                            }
                                            if (var30 == 2) {
                                                var31 = 34;
                                            }
                                            if (var30 == 3) {
                                                var31 = 11;
                                            }
                                            if (var30 == 4) {
                                                var31 = 49;
                                            }
                                            class19.method134(-118, var31, var10, var29[var30], class79.method570(arg1 ^ 0x12, new class136[] { class41.field961, var28.field2789 }), var27.field2499, var8);
                                        } else if (var30 == 2) {
                                            class63.field1340++;
                                            class19.method134(-126, 34, var10, class145.field3350, class79.method570(0, new class136[] { class41.field961, var28.field2789 }), var27.field2499, var8);
                                        }
                                    }
                                    class19.method134(arg1 ^ 0xFFFFFF94, 1004, var10, class106.field2496, class79.method570(0, new class136[] { class41.field961, var28.field2789 }), var27.field2499, var8);
                                } else if ((class5.field97 & 0x1) == 1) {
                                    class63.field1341++;
                                    class19.method134(-126, 47, var10, class27.field602, class79.method570(0, new class136[] { class28.field620, class116.field2651, var28.field2789 }), var27.field2499, var8);
                                }
                            }
                        }
                    }
                }
            }
            var6++;
        }
        field1445++;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static final void method511(int arg0) {
        if (arg0 < 6) {
            return;
        }
        field1443++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class14.field274 - 1; var2++) {
                if (class27.field600[var2] < 1000 && class27.field600[var2 + 1] > 1000) {
                    class136 var3 = class65.field1407[var2];
                    var1 = false;
                    class65.field1407[var2] = class65.field1407[var2 + 1];
                    class65.field1407[var2 + 1] = var3;
                    class136 var4 = class119.field2713[var2];
                    class119.field2713[var2] = class119.field2713[var2 + 1];
                    class119.field2713[var2 + 1] = var4;
                    int var5 = class27.field600[var2];
                    class27.field600[var2] = class27.field600[var2 + 1];
                    class27.field600[var2 + 1] = var5;
                    int var6 = class61.field1301[var2];
                    class61.field1301[var2] = class61.field1301[var2 + 1];
                    class61.field1301[var2 + 1] = var6;
                    int var7 = class132.field3122[var2];
                    class132.field3122[var2] = class132.field3122[var2 + 1];
                    class132.field3122[var2 + 1] = var7;
                    int var8 = class28.field618[var2];
                    class28.field618[var2] = class28.field618[var2 + 1];
                    class28.field618[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Lme;")
    public final class88 method512(int arg0) {
        class88 var2 = this.field1451.field2085;
        field1461++;
        if (this.field1451 == var2) {
            this.field1465 = null;
            return null;
        }
        if (arg0 != 0) {
            this.method514(-31);
        }
        this.field1465 = var2.field2085;
        return var2;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lme;I)V")
    public final void method513(class88 arg0, int arg1) {
        if (arg0.field2087 != null) {
            arg0.method674(32);
        }
        if (arg1 <= 25) {
            return;
        }
        arg0.field2085 = this.field1451.field2085;
        arg0.field2087 = this.field1451;
        field1464++;
        arg0.field2087.field2085 = arg0;
        arg0.field2085.field2087 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)Lme;")
    public final class88 method514(int arg0) {
        field1448++;
        class88 var2 = this.field1451.field2085;
        if (this.field1451 == var2) {
            return null;
        } else {
            var2.method674(32);
            return arg0 == -1 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)Lme;")
    public final class88 method515(boolean arg0) {
        field1447++;
        if (!arg0) {
            this.method509(78, null);
        }
        class88 var2 = this.field1451.field2087;
        if (this.field1451 == var2) {
            this.field1465 = null;
            return null;
        } else {
            this.field1465 = var2.field2087;
            return var2;
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)Lme;")
    public final class88 method516(int arg0) {
        field1446++;
        if (arg0 > -113) {
            this.method515(true);
        }
        class88 var2 = this.field1465;
        if (this.field1451 == var2) {
            this.field1465 = null;
            return null;
        } else {
            this.field1465 = var2.field2087;
            return var2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Lme;ILme;)V")
    public final void method517(class88 arg0, int arg1, class88 arg2) {
        if (arg0.field2087 != null) {
            arg0.method674(32);
        }
        arg0.field2087 = arg2.field2087;
        field1455++;
        arg0.field2085 = arg2;
        arg0.field2087.field2085 = arg0;
        if (arg1 != 0) {
            field1453 = null;
        }
        arg0.field2085.field2087 = arg0;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static void method518(byte arg0) {
        field1440 = null;
        field1462 = null;
        field1453 = null;
        field1458 = null;
        if (arg0 != -98) {
            method510(-25, -119, 80, 93, -73);
        }
        field1456 = null;
        field1466 = null;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)Lme;")
    public final class88 method519(int arg0) {
        field1460++;
        class88 var2 = this.field1451.field2087;
        if (this.field1451 == var2) {
            return null;
        } else {
            var2.method674(32);
            return arg0 == -5 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)Lme;")
    public final class88 method520(byte arg0) {
        field1449++;
        if (arg0 <= 29) {
            return null;
        }
        class88 var2 = this.field1465;
        if (this.field1451 == var2) {
            this.field1465 = null;
            return null;
        } else {
            this.field1465 = var2.field2085;
            return var2;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "()V")
    public class69() {
        this.field1451.field2085 = this.field1451;
        this.field1451.field2087 = this.field1451;
    }
}
