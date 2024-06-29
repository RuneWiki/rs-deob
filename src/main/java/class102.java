import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class102 extends class34 {

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    private int field1488 = 0;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field1495 = 1;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    private int field1498 = 0;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field1494 = 7759444;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "Lme;")
    public static class276 field1497 = null;

    @OriginalMember(owner = "client!uc", name = "fb", descriptor = "[I")
    public static int[] field1502 = new int[25];

    @OriginalMember(owner = "client!uc", name = "eb", descriptor = "I")
    public static int field1501 = 0;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!uc", name = "db", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "([BIII)Z")
    public static final boolean method742(byte[] arg0, int arg1, int arg2, int arg3) {
        boolean var4 = true;
        int var5 = -1;
        class54 var6 = new class54(arg0);
        label60: while (true) {
            int var7 = var6.method434(65280);
            if (var7 == 0) {
                if (arg1 != 19029) {
                    method747(41);
                }
                ++field1487;
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method436(arg1 ^ 18987);
                    if (var11 == 0) {
                        continue label60;
                    }
                    int var12 = var6.method407(255) >> 2;
                    var8 += var11 + -1;
                    int var13 = var8 & 63;
                    int var14 = (4033 & var8) >> 6;
                    int var15 = arg2 + var14;
                    int var16 = arg3 + var13;
                    if (var15 > 0 && ~var16 < -1 && var15 < 103 && var16 < 103) {
                        class188 var17 = class3.method42(-124, var5);
                        if (~var12 != -23 || class127.field1867 || var17.field2759 != 0 || ~var17.field2785 == -2 || var17.field2800) {
                            if (!var17.method1252(true)) {
                                var4 = false;
                                ++class259.field3968;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method436(126);
                if (~var10 == -1) {
                    break;
                }
                var6.method407(255);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field1496;
        int[] var3 = super.field610.method228(24856, arg1);
        if (super.field610.field597) {
            int var4 = class199.field2985[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class226.field3527 < ~var6; ++var6) {
                int var7 = class112.field1716[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field1498 == -1) {
                    var9 = (-var4 + var7) * this.field1495;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field1495 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field1488 != 0) {
                    if (this.field1488 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class87.field1321[(var12 & 4092) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 < 75) {
            this.field1488 = 64;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZILna;)V")
    public static final void method743(boolean arg0, int arg1, class123 arg2) {
        ++field1486;
        int var3 = arg2.field1823;
        int var4 = (int) arg2.field2628;
        arg2.method1193(110);
        if (arg0) {
            class181.method1189(var3, 14670);
        }
        class229.method1562(var3, 17916);
        class297 var5 = class151.method1023(-30464, var4);
        if (var5 != null) {
            class297.method1979((byte) -126, var5);
        }
        int var6 = class51.field826;
        int var7 = 0;
        if (arg1 == 100) {
            while (~var6 < ~var7) {
                if (class8.method68((byte) -42, class265.field4147[var7])) {
                    class259.method1744(var7, arg1 + -139);
                }
                ++var7;
            }
            if (~class51.field826 != -2) {
                class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 109, class19.field333);
                int var8 = class105.field1555.method1293(class194.field2938);
                for (int var9 = 0; class51.field826 > var9; ++var9) {
                    int var10 = class105.field1555.method1293(class170.method1143(-24448, var9));
                    if (var10 > var8) {
                        var8 = var10;
                    }
                }
                class106.field1561 = (!class197.field2979 ? 22 : 26) + class51.field826 * 15;
                class19.field333 = var8 + 8;
            } else {
                class66.field1093 = false;
                class210.method1386(class229.field3561, class67.field1116, class106.field1561, (byte) 127, class19.field333);
            }
            if (class184.field2677 != -1) {
                class188.method1241((byte) 61, 1, class184.field2677);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILgk;IILdg;ILul;)V")
    public static final void method744(int arg0, int arg1, class224 arg2, int arg3, int arg4, class87 arg5, int arg6, class188 arg7) {
        ++field1492;
        class269 var8 = new class269();
        var8.field4205 = arg0;
        var8.field4204 = arg4 * 128;
        var8.field4197 = arg1 * 128;
        if (arg6 == 8) {
            if (arg7 == null) {
                if (arg5 == null) {
                    if (arg2 != null) {
                        var8.field4184 = arg2;
                        var8.field4194 = (arg2.method168(-83) + arg1) * 128;
                        var8.field4182 = 128 * (arg4 + arg2.method168(arg6 ^ -126));
                        var8.field4189 = class124.method873(arg2, 2047);
                        var8.field4206 = arg2.field3508;
                        var8.field4179 = arg2.field3498 * 128;
                        class251.field3887.method309((byte) -8, var8, class37.method286(25077, arg2.field3488));
                        return;
                    }
                } else {
                    class189 var9 = arg5.field1323;
                    var8.field4208 = arg5;
                    if (var9.field2829 != null) {
                        var8.field4201 = true;
                        var9 = var9.method1257(arg6 + -32215);
                    }
                    if (var9 != null) {
                        var8.field4182 = (var9.field2813 + arg4) * 128;
                        var8.field4194 = (var9.field2813 + arg1) * 128;
                        var8.field4189 = class51.method385(arg5, 121);
                        var8.field4179 = var9.field2808 * 128;
                        var8.field4206 = var9.field2810;
                    }
                    class256.field3947.method1881(var8, (byte) -56);
                }
            } else {
                var8.field4179 = arg7.field2803 * 128;
                var8.field4190 = arg7.field2782;
                var8.field4196 = arg7.field2747;
                var8.field4189 = arg7.field2792;
                var8.field4191 = arg7.field2790;
                int var10 = arg7.field2757;
                int var11 = arg7.field2805;
                if (arg3 == 1 || ~arg3 == -4) {
                    var10 = arg7.field2805;
                    var11 = arg7.field2757;
                }
                var8.field4200 = arg7;
                var8.field4206 = arg7.field2739;
                var8.field4194 = (arg1 + var10) * 128;
                var8.field4182 = (arg4 + var11) * 128;
                if (arg7.field2804 != null) {
                    var8.field4201 = true;
                    var8.method1813(arg6 ^ 93);
                }
                if (var8.field4191 != null) {
                    var8.field4193 = var8.field4196 - -((int) ((double) (-var8.field4196 + var8.field4190) * Math.random()));
                }
                class249.field3864.method1881(var8, (byte) -56);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIZ)V")
    public static final void method745(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class117.field1761 = arg1;
        class137.field1992 = arg2;
        class121.field1807 = arg3;
        class123.field1826 = new class201[arg0][class117.field1761][class137.field1992];
        class287.field4389 = new int[arg0][class117.field1761 + 1][class137.field1992 + 1];
        if (arg4) {
            class277.field4277 = new class201[1][class117.field1761][class137.field1992];
            class114.field1738 = new int[class117.field1761][class137.field1992];
            class134.field1963 = new int[1][class117.field1761 + 1][class137.field1992 + 1];
        } else {
            class277.field4277 = null;
            class114.field1738 = null;
            class134.field1963 = null;
        }
        class22.method154(false);
        class130.field1920 = new class30[500];
        class259.field3971 = 0;
        class106.field1567 = new class30[500];
        class54.field899 = 0;
        class54.field863 = new int[arg0][class117.field1761 + 1][class137.field1992 + 1];
        class236.field3633 = new class128[5000];
        class239.field3689 = 0;
        class45.field779 = new class128[100];
        class71.field1168 = new boolean[class121.field1807 + class121.field1807 + 1][class121.field1807 + class121.field1807 + 1];
        class47.field798 = new boolean[class121.field1807 + class121.field1807 + 2][class121.field1807 + class121.field1807 + 2];
        class23.field383 = new byte[arg0][class117.field1761][class137.field1992];
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field1495 = arg2.method407(255);
                }
            } else {
                this.field1488 = arg2.method407(arg0 ^ 249);
            }
        } else {
            this.field1498 = arg2.method407(255);
        }
        ++field1493;
        if (arg0 != 6) {
            field1497 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final void method62(int arg0) {
        ++field1500;
        int var2 = 106 % ((arg0 - -2) / 43);
        class189.method1255((byte) 85);
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V")
    public static void method746(int arg0) {
        field1497 = null;
        field1502 = null;
        int var1 = -29 / ((15 - arg0) / 50);
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)V")
    public static final void method747(int arg0) {
        ++field1499;
        if (!class284.field4364) {
            if (class117.field1767) {
                class281.field4313 = (float) ((int) class281.field4313 + -17 & -16);
            } else {
                class215.field3310 += (-class215.field3310 + -12.0F) / 2.0F;
            }
            class284.field4364 = true;
            if (arg0 >= 79) {
                class36.field641 = true;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(BI)V")
    public static final void method748(byte arg0, int arg1) {
        class90.field1362 = (class283) class85.field1297.method306((long) arg1, 16216);
        if (arg0 != 39) {
            method742((byte[]) null, 13, 112, 3);
        }
        ++field1489;
    }
}
