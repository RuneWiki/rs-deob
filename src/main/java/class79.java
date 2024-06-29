import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class79 {

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public int field1371;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public int field1366;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "Lbh;")
    public class210 field1363;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/lang/String;")
    public static String field1368 = "level: ";

    @OriginalMember(owner = "client!q", name = "k", descriptor = "I")
    public static int field1372 = 0;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!q", name = "l", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lof;")
    public static class222 field1364;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 7)
    public static final void method650(byte arg0) {
        if (arg0 > -20) {
            field1364 = (class222) null;
        }
        for (int var1 = 0; var1 < class356.field5645; var1++) {
            int var2 = class330.field5248[var1];
            class288 var3 = class165.field2621[var2];
            int var4 = class29.field383.method1720((byte) -55);
            if ((var4 & 0x4) != 0) {
                var4 += class29.field383.method1720((byte) -33) << 8;
            }
            if ((var4 & 0x2) != 0) {
                var3.field3570 = class29.field383.method1758((byte) -47);
                var3.field3565 = 100;
            }
            if ((var4 & 0x20) != 0) {
                var3.field3567 = class29.field383.method1759(-26608);
                if (var3.field3567 == 65535) {
                    var3.field3567 = -1;
                }
            }
            if ((var4 & 0x200) != 0) {
                var3.field3488 = class29.field383.method1765(true);
                var3.field3545 = class29.field383.method1765(true);
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class29.field383.method1748(3);
                int var6 = class29.field383.method1762((byte) 17);
                var3.method1637(var5, 0, var6, class332.field5261);
            }
            if ((var4 & 0x100) != 0) {
                int var7 = class29.field383.method1750(17852);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class29.field383.method1763((byte) 110);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var10[var11] = var12;
                    var8[var11] = class29.field383.method1750(17852);
                    var9[var11] = class29.field383.method1765(true);
                }
                class298.method2136(var10, var3, true, var8, var9);
            }
            if ((var4 & 0x8) != 0) {
                boolean var13 = true;
                int var14 = class29.field383.method1765(true);
                int var15 = class29.field383.method1715((byte) -82);
                if (var14 == 65535) {
                    var14 = -1;
                }
                if (var14 != -1 && var3.field3552 != -1 && class198.method1524(class282.method2071(var14, 0).field1594, -68).field660 < class198.method1524(class282.method2071(var3.field3552, 0).field1594, -120).field660) {
                    var13 = false;
                }
                if (var13) {
                    var3.field3499 = 1;
                    var3.field3527 = 0;
                    var3.field3509 = var15 >> 16;
                    var3.field3566 = 0;
                    var3.field3500 = (var15 & 0xFFFF) + class332.field5261;
                    var3.field3552 = var14;
                    if (class332.field5261 < var3.field3500) {
                        var3.field3566 = -1;
                    }
                    if (var3.field3552 != -1 && class332.field5261 == var3.field3500) {
                        int var16 = class282.method2071(var3.field3552, 0).field1594;
                        if (var16 != -1) {
                            class43 var17 = class198.method1524(var16, 77);
                            if (var17 != null && var17.field677 != null) {
                                class334.method2338(false, var3.field3577, var3.field3511, 0, (byte) -13, var17);
                            }
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                int var18 = class29.field383.method1750(17852);
                int var19 = class29.field383.method1720((byte) -102);
                var3.method1637(var18, 0, var19, class332.field5261);
                var3.field3481 = class332.field5261 + 300;
                var3.field3525 = class29.field383.method1762((byte) 17);
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field4692.method961(false)) {
                    class123.method969((byte) 22, var3);
                }
                var3.method2092(-1, class222.method1683(-116, class29.field383.method1763((byte) 80)));
                var3.method1635(var3.field4692.field2025, -1);
                var3.field3514 = var3.field4692.field2050;
                var3.field3561 = var3.field4692.field2065;
                if (var3.field4692.method961(false)) {
                    class340.method2386(0, var3, 0, class186.field2991, var3.field3519[0], (byte) -113, (class29) null, (class258) null, var3.field3553[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                int var20 = class29.field383.method1765(true);
                if (var20 == 65535) {
                    var20 = -1;
                }
                int var21 = class29.field383.method1720((byte) -75);
                class339.method2385(var21, var3, var20, 121);
            }
        }
        field1370++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III)V", line = 194)
    public static final void method651(int arg0, int arg1, int arg2) {
        class36.field520.method2228(arg2, arg2 + 16520);
        class357.field5665++;
        field1369++;
        class36.field520.method1731(arg2 ^ 0xFFFFFF90, arg0);
        class36.field520.method1749((byte) -20, arg1);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Ljk;I)V", line = 207)
    public static final void method652(class363 arg0, int arg1) {
        arg0.field5747 = false;
        if (arg0.field5750 != null) {
            arg0.field5750.field3476 = 0;
        }
        for (class363 var2 = arg0.method43(); var2 != null; var2 = arg0.method47()) {
            method652(var2, 23744);
        }
        field1367++;
        if (arg1 != 23744) {
            method652((class363) null, 16);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V", line = 233)
    public static void method653(int arg0) {
        if (arg0 <= -16) {
            field1364 = null;
            field1368 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BI)V", line = 250)
    public static final void method654(byte arg0, int arg1) {
        class118.field1998.method2334(4, arg1);
        class101.field1657.method2334(4, arg1);
        field1373++;
        class362.field5740.method2334(4, arg1);
        class230.field3831.method2334(4, arg1);
        if (arg0 <= 43) {
            field1368 = (String) null;
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(IIII)V", line = 263)
    public class79(int arg0, int arg1, int arg2, int arg3) {
        class210 var5 = class130.method997(arg0, (byte) 100);
        this.field1371 = arg2;
        this.field1366 = arg3;
        this.field1365 = arg1;
        if (class42.field607 || var5.field3355 == -1) {
            this.field1363 = var5;
        } else {
            this.field1363 = class130.method997(var5.field3355, (byte) 100);
        }
    }

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lbh;III)V", line = 279)
    public class79(class210 arg0, int arg1, int arg2, int arg3) {
        this.field1366 = arg3;
        this.field1363 = arg0;
        this.field1371 = arg2;
        this.field1365 = arg1;
    }
}
