import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class281 {

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    private int field4208 = -1;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    private int field4205 = 0;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field4198;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Lpf;")
    public static class294 field4201;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)V")
    public static void method1852(byte arg0) {
        int var1 = 34 / ((arg0 + 79) / 42);
        field4201 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZILrf;I)V")
    public static final void method1853(boolean arg0, int arg1, class289 arg2, int arg3) {
        if (arg2.field4548 == 1) {
            class205.field3079++;
            client.method957(-1, 0, (short) 11, 0, 0L, arg2.field4504, arg2.field4554, "");
        }
        if (arg0) {
            method1853(true, -113, (class289) null, 44);
        }
        field4197++;
        if (arg2.field4548 == 2 && !class153.field2305) {
            String var4 = class237.method1503(arg2, -100);
            if (var4 != null) {
                client.method957(-1, -1, (short) 41, 0, 0L, arg2.field4504, var4, "<col=00ff00>" + arg2.field4543);
                class226.field3390++;
            }
        }
        if (arg2.field4548 == 3) {
            class148.field2149++;
            client.method957(-1, 0, (short) 5, 0, 0L, arg2.field4504, class267.field4021, "");
        }
        if (arg2.field4548 == 4) {
            client.method957(-1, 0, (short) 9, 0, 0L, arg2.field4504, arg2.field4554, "");
            class132.field1942++;
        }
        if (arg2.field4548 == 5) {
            class1.field13++;
            client.method957(-1, 0, (short) 46, 0, 0L, arg2.field4504, arg2.field4554, "");
        }
        if (arg2.field4548 == 6 && class224.field3355 == null) {
            client.method957(-1, -1, (short) 37, 0, 0L, arg2.field4504, arg2.field4554, "");
            class66.field1050++;
        }
        if (arg2.field4394 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4561; var6++) {
                for (int var7 = 0; var7 < arg2.field4493; var7++) {
                    int var8 = (arg2.field4499 + 32) * var7;
                    int var9 = (arg2.field4442 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field4455[var5];
                        var8 += arg2.field4533[var5];
                    }
                    if (var8 <= arg1 && arg3 >= var9 && (var8 + 32) > arg1 && arg3 < (var9 + 32)) {
                        class120.field1814 = arg2;
                        class49.field791 = var5;
                        if (arg2.field4513[var5] > 0) {
                            class268 var10 = client.method972(arg2);
                            class43 var11 = class160.method999(arg2.field4513[var5] - 1, 0);
                            if (class114.field1738 == 1 && var10.method1796(-1)) {
                                if (class192.field2940 != arg2.field4504 || class53.field868 != var5) {
                                    client.method957(-1, var5, (short) 60, 0, (long) var11.field680, arg2.field4504, class251.field3817, class241.field3624 + " -> <col=ff9040>" + var11.field626);
                                    class90.field1418++;
                                }
                            } else if (class153.field2305 && var10.method1796(-1)) {
                                class144 var12 = class233.field3510 == -1 ? null : class24.method155(class233.field3510, (byte) -33);
                                if ((class206.field3092 & 0x10) != 0 && (var12 == null || var11.method288(4, class233.field3510, var12.field2107) != var12.field2107)) {
                                    class187.field2831++;
                                    client.method957(class289.field4390, var5, (short) 59, 0, (long) var11.field680, arg2.field4504, class48.field770, class210.field3163 + " -> <col=ff9040>" + var11.field626);
                                }
                            } else {
                                String[] var13 = var11.field622;
                                class84.field1346++;
                                if (class71.field1131) {
                                    var13 = class10.method46(arg0, var13);
                                }
                                if (var10.method1796(-1)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class16.field190++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 47;
                                            } else {
                                                var15 = 49;
                                            }
                                            client.method957(-1, var5, var15, 0, (long) var11.field680, arg2.field4504, var13[var14], "<col=ff9040>" + var11.field626);
                                        }
                                    }
                                }
                                if (var10.method1795((byte) 116)) {
                                    class297.field4698++;
                                    client.method957(class84.field1337, var5, (short) 1, 0, (long) var11.field680, arg2.field4504, class251.field3817, "<col=ff9040>" + var11.field626);
                                }
                                if (var10.method1796(-1) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class8.field117++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 25;
                                            }
                                            if (var16 == 1) {
                                                var17 = 45;
                                            }
                                            if (var16 == 2) {
                                                var17 = 22;
                                            }
                                            client.method957(-1, var5, var17, 0, (long) var11.field680, arg2.field4504, var13[var16], "<col=ff9040>" + var11.field626);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field4485;
                                if (class71.field1131) {
                                    var18 = class10.method46(false, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class16.field196++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 29;
                                            }
                                            if (var19 == 1) {
                                                var20 = 26;
                                            }
                                            if (var19 == 2) {
                                                var20 = 38;
                                            }
                                            if (var19 == 3) {
                                                var20 = 14;
                                            }
                                            if (var19 == 4) {
                                                var20 = 58;
                                            }
                                            client.method957(-1, var5, var20, 0, (long) var11.field680, arg2.field4504, var18[var19], "<col=ff9040>" + var11.field626);
                                        }
                                    }
                                }
                                client.method957(class116.field1766, var5, (short) 1003, 0, (long) var11.field680, arg2.field4504, class67.field1068, "<col=ff9040>" + var11.field626);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field4495) {
            return;
        }
        if (!class153.field2305) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var25 = class101.method650(var21, (byte) 58, arg2);
                if (var25 != null) {
                    client.method957(class256.method1693(arg2, var21, -110), arg2.field4530, (short) 1006, 0, (long) (var21 + 1), arg2.field4504, var25, arg2.field4407);
                    class226.field3388++;
                }
            }
            String var22 = class237.method1503(arg2, -73);
            if (var22 != null) {
                client.method957(-1, arg2.field4530, (short) 41, 0, 0L, arg2.field4504, var22, arg2.field4407);
                class226.field3390++;
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                String var24 = class101.method650(var23, (byte) 58, arg2);
                if (var24 != null) {
                    class226.field3388++;
                    client.method957(class256.method1693(arg2, var23, -113), arg2.field4530, (short) 13, 0, (long) (var23 + 1), arg2.field4504, var24, arg2.field4407);
                }
            }
            if (client.method972(arg2).method1800(false)) {
                if (arg2.field4419 == null) {
                    client.method957(-1, arg2.field4530, (short) 37, 0, 0L, arg2.field4504, class69.field1094, "");
                } else {
                    client.method957(-1, arg2.field4530, (short) 37, 0, 0L, arg2.field4504, arg2.field4419, "");
                }
                class66.field1050++;
                return;
            }
            return;
        }
        if (client.method972(arg2).method1793(-103) && (class206.field3092 & 0x20) != 0) {
            client.method957(class289.field4390, arg2.field4530, (short) 43, 0, 0L, arg2.field4504, class48.field770, class210.field3163 + " -> " + arg2.field4407);
            class93.field1469++;
            return;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILpf;)V")
    public static final void method1854(int arg0, class294 arg1) {
        if (arg0 != 7616) {
            method1852((byte) 123);
        }
        field4199++;
        class155.field2330 = arg1;
        class107.field1672 = class155.field2330.method1976(1, 4);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
    private final void method1855(int arg0, int arg1) {
        field4203++;
        double var3 = (double) ((arg1 & 0xFF56) >> 8) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF2A58) >> 16) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var5;
        double var11 = var5;
        if (var5 < var3) {
            var11 = var3;
        }
        if (var3 < var5) {
            var9 = var3;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        if (var7 < var9) {
            var9 = var7;
        }
        if (arg0 != 256) {
            method1852((byte) -85);
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field4209 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field4204 = (int) (var17 * 256.0D);
        if (var17 > 0.5D) {
            this.field4198 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field4198 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field4198 < 1) {
            this.field4198 = 1;
        }
        if (this.field4209 < 0) {
            this.field4209 = 0;
        } else if (this.field4209 > 255) {
            this.field4209 = 255;
        }
        this.field4206 = (int) ((double) this.field4198 * var19);
        if (this.field4204 < 0) {
            this.field4204 = 0;
        } else if (this.field4204 > 255) {
            this.field4204 = 255;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILfl;I)V")
    public final void method1856(int arg0, class248 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method1593((byte) 27);
            if (var4 == 0) {
                if (arg2 != 5953) {
                    this.field4204 = 6;
                }
                field4202++;
                return;
            }
            this.method1857(arg1, arg0, 15537, var4);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lfl;III)V")
    private final void method1857(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 15537) {
            return;
        }
        if (arg3 == 1) {
            this.field4205 = arg0.method1587(arg2 ^ 0xFFFFC337);
            this.method1855(arg2 - 15281, this.field4205);
        } else if (arg3 == 2) {
            this.field4208 = arg0.method1575(false);
            if (this.field4208 == 65535) {
                this.field4208 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method1575(false);
        }
        field4200++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static final void method1858(int arg0) {
        field4210++;
        if (class44.field706 != null) {
            class44.field706.method955((byte) 68);
            class44.field706 = null;
        }
        class42.method280(103);
        class272.method1805();
        for (int var1 = 0; var1 < 4; var1++) {
            class202.field3052[var1].method201(true);
        }
        class282.method1863(false, true);
        System.gc();
        class119.method758(-25289, 2);
        class150.field2168 = -1;
        class254.field3869 = false;
        class144.method881(-2, true);
        class177.field2721 = 0;
        class81.field1303 = 0;
        class147.field2141 = 0;
        class132.field1940 = 0;
        class120.field1808 = false;
        for (int var2 = 0; var2 < class101.field1591.length; var2++) {
            class101.field1591[var2] = null;
        }
        class24.field295 = 0;
        class141.field2069 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class96.field1521[var3] = null;
            class114.field1749[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class18.field220[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class251.field3816[var5][var6][var7] = null;
                }
            }
        }
        class137.method838(arg0 - 11633);
        class255.field3885 = 0;
        class122.method774(arg0 ^ arg0);
        class236.method1500(true, 8);
        try {
            class73.method498(class209.field3147.field150, "loggedout", (byte) 126);
        } catch (Throwable var8) {
        }
    }
}
