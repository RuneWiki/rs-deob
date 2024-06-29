import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class81 implements class242 {

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    private int field1547 = 50;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    private int field1568 = 128;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "Leh;")
    private class52 field1565;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "Leh;")
    private class52 field1556;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Ls;")
    private class194 field1546;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1555 = 0;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lqe;")
    public static class179 field1554 = null;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lqe;")
    public static class179 field1569 = class206.method1380("Wir vermuten)1 dass Ihr Konto gestohlen wurde", (byte) -128);

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Lai;")
    public static class10 field1564 = new class10(5000);

    @OriginalMember(owner = "client!he", name = "E", descriptor = "Z")
    public static boolean field1576 = false;

    @OriginalMember(owner = "client!he", name = "F", descriptor = "Lqe;")
    private static class179 field1577 = class206.method1380(" has logged out)3", (byte) -126);

    @OriginalMember(owner = "client!he", name = "B", descriptor = "Lqe;")
    public static class179 field1573 = class206.method1380(")4slr2)3ws?order=LPWM", (byte) -21);

    @OriginalMember(owner = "client!he", name = "A", descriptor = "Lqe;")
    public static class179 field1572 = field1577;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!he", name = "C", descriptor = "Lfc;")
    public static class58 field1574;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1571;

    @OriginalMember(owner = "client!he", name = "D", descriptor = "Z")
    public static boolean field1575;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(FII)[I")
    public final int[] method507(float arg0, int arg1, int arg2) {
        field1563++;
        class53 var4 = this.method516(24380, arg1);
        var4.field1176 = true;
        if (arg2 < 122) {
            this.field1546 = null;
        }
        return var4.method366(this.field1568, (byte) -91, this, arg0, this.field1556);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method508(byte arg0) {
        while (true) {
            if (class36.field789.method63(class150.field2705, 8) >= 27) {
                int var1 = class36.field789.method71(15, 128);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class53.field1152[var1] == null) {
                        class53.field1152[var1] = new class188();
                        var2 = true;
                    }
                    class188 var3 = class53.field1152[var1];
                    class233.field4297[class186.field3456++] = var1;
                    var3.field3152 = class13.field322;
                    int var4 = class92.field1740[class36.field789.method71(3, 128)];
                    if (var2) {
                        var3.field3162 = var3.field3177 = var4;
                    }
                    int var5 = class36.field789.method71(5, 128);
                    int var6 = class36.field789.method71(5, 128);
                    int var7 = class36.field789.method71(1, 128);
                    if (var7 == 1) {
                        class74.field1449[class202.field3742++] = var1;
                    }
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    if (var5 > 15) {
                        var5 -= 32;
                    }
                    var3.field3496 = class152.method979((byte) 15, class36.field789.method71(14, 128));
                    int var8 = class36.field789.method71(1, 128);
                    var3.field3194 = var3.field3496.field3326;
                    var3.field3172 = var3.field3496.field3335;
                    var3.field3199 = var3.field3496.field3323;
                    var3.field3168 = var3.field3496.field3317;
                    var3.field3173 = var3.field3496.field3314;
                    var3.field3133 = var3.field3496.field3357;
                    var3.field3130 = var3.field3496.field3350;
                    if (var3.field3194 == 0) {
                        var3.field3177 = 0;
                    }
                    var3.field3178 = var3.field3496.field3303;
                    var3.field3129 = var3.field3496.field3316;
                    var3.method1108(class61.field1298.field3160[0] + var6, var8 == 1, class61.field1298.field3200[0] + var5, 20826);
                    continue;
                }
            }
            field1559++;
            int var9 = 14 / ((arg0 - 46) / 51);
            class36.field789.method65((byte) 0);
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static final void method509(int arg0) {
        if (class11.field304 > 0) {
            for (int var1 = 0; var1 < 256; var1++) {
                if (class11.field304 > 768) {
                    class129.field2355[var1] = class55.method382(class123.field2278[var1], 16711935, class59.field1275[var1], 1024 - class11.field304);
                } else if (class11.field304 > 256) {
                    class129.field2355[var1] = class123.field2278[var1];
                } else {
                    class129.field2355[var1] = class55.method382(class59.field1275[var1], 16711935, class123.field2278[var1], 256 - class11.field304);
                }
            }
        } else if (class55.field1225 > 0) {
            for (int var2 = 0; var2 < 256; var2++) {
                if (class55.field1225 > 768) {
                    class129.field2355[var2] = class55.method382(class105.field1979[var2], 16711935, class59.field1275[var2], 1024 - class55.field1225);
                } else if (class55.field1225 <= 256) {
                    class129.field2355[var2] = class55.method382(class59.field1275[var2], 16711935, class105.field1979[var2], 256 - class55.field1225);
                } else {
                    class129.field2355[var2] = class105.field1979[var2];
                }
            }
        } else {
            for (int var3 = 0; var3 < 256; var3++) {
                class129.field2355[var3] = class59.field1275[var3];
            }
        }
        short var4 = 256;
        int var5 = 0;
        field1558++;
        int var6 = class198.field3699.field2607 * 9;
        int var7 = 0;
        for (int var8 = 1; var8 < var4 - 1; var8++) {
            int var21 = (var4 - var8) * class97.field1823[var8] / var4 + 22;
            if (var21 < 0) {
                var21 = 0;
            }
            var5 += var21;
            for (int var22 = var21; var22 < 128; var22++) {
                int var24 = class198.field3699.field2315[var6++];
                int var25 = class190.field3530[var5++];
                if (var25 == 0) {
                    class214.field3976.field2315[var7++] = var24;
                } else {
                    int var27 = 256 - var25;
                    int var28 = class129.field2355[var25];
                    class214.field3976.field2315[var7++] = class107.method696(-16711936, class107.method696(16711935, var24) * var27 + var25 * class107.method696(16711935, var28)) + class107.method696(var25 * class107.method696(65280, var28) + var27 * class107.method696(65280, var24), 16711680) >> 8;
                }
            }
            for (int var23 = 0; var23 < var21; var23++) {
                class214.field3976.field2315[var7++] = class198.field3699.field2315[var6++];
            }
            var6 += class198.field3699.field2607 - 128;
        }
        class214.field3976.method794(0, 9);
        int var9 = arg0;
        int var10 = class198.field3699.field2607 * 9 + 128;
        int var11 = 0;
        for (int var12 = 1; var12 < var4 - 1; var12++) {
            int var13 = (var4 - var12) * class97.field1823[var12] / var4 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; var14++) {
                int var10001 = var11++;
                var10--;
                class30.field666.field2315[var10001] = class198.field3699.field2315[var10];
            }
            for (int var15 = var13; var15 < 128; var15++) {
                int var16 = class190.field3530[var9++];
                var10--;
                int var17 = class198.field3699.field2315[var10];
                if (var16 == 0) {
                    class30.field666.field2315[var11++] = var17;
                } else {
                    int var19 = 256 - var16;
                    int var20 = class129.field2355[var16];
                    class30.field666.field2315[var11++] = class107.method696(class107.method696(65280, var17) * var19 + class107.method696(65280, var20) * var16, 16711680) + class107.method696(-16711936, var19 * class107.method696(var17, 16711935) + var16 * class107.method696(var20, 16711935)) >> 8;
                }
            }
            var10 += class198.field3699.field2607 + 128;
            var9 += var13;
        }
        class30.field666.method794(637, 9);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)Z")
    public final boolean method510(int arg0, int arg1) {
        field1570++;
        if (arg1 != -714904351) {
            field1554 = null;
        }
        return this.method516(24380, arg0).field1168;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(II)Z")
    public final boolean method511(int arg0, int arg1) {
        if (arg0 >= -26) {
            this.method518(-90, (byte) 63);
        }
        field1548++;
        return this.method516(24380, arg1).method368((byte) -127, this.field1556, this);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Leh;Leh;ZLeh;)V")
    public static final void method512(class52 arg0, class52 arg1, boolean arg2, class52 arg3) {
        class107.field2006 = arg1;
        field1561++;
        class87.field1666 = arg0;
        if (arg2) {
            class159.field2875 = arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
    public final boolean method513(int arg0, int arg1) {
        field1553++;
        if (arg1 == -28240) {
            return this.field1568 == 64 || this.method516(24380, arg0).field1164 == 64;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(II)Z")
    public final boolean method514(int arg0, int arg1) {
        field1560++;
        return arg1 == -20090 ? this.method516(arg1 ^ 0xFFFFEEBA, arg0).field1151 : true;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(II)I")
    public final int method515(int arg0, int arg1) {
        if (arg0 > -115) {
            this.field1547 = 34;
        }
        field1549++;
        return this.method516(24380, arg1).field1158;
    }

    @OriginalMember(owner = "client!he", name = "g", descriptor = "(II)Lei;")
    private final class53 method516(int arg0, int arg1) {
        field1566++;
        if (arg0 != 24380) {
            return null;
        }
        class53 var3 = (class53) this.field1546.method1299((byte) 53, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1565.method342(arg1, 0, (byte) 86);
        if (var4 == null) {
            return class159.method1028(true);
        } else {
            class185 var5 = new class185(var4);
            class53 var6 = new class53(var5);
            this.field1546.method1303(var6, (long) arg1, (byte) 106);
            return var6;
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(B)V")
    public final void method517(byte arg0) {
        if (arg0 != -26) {
            this.field1568 = 29;
        }
        field1557++;
        this.field1546 = new class194(this.field1547);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
    public final void method518(int arg0, byte arg1) {
        if (arg1 >= -7) {
            method520(-63, -99, -26, -53, 120, 125);
        }
        for (class53 var3 = (class53) this.field1546.method1306(59); var3 != null; var3 = (class53) this.field1546.method1298((byte) 103)) {
            if (var3.field1176) {
                var3.method369(arg0, (byte) -62);
                var3.field1176 = false;
            }
        }
        field1551++;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static void method519(int arg0) {
        field1564 = null;
        field1554 = null;
        field1577 = null;
        field1574 = null;
        field1569 = null;
        field1571 = null;
        field1573 = null;
        field1572 = null;
        if (arg0 != 32767) {
            method512(null, null, true, null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIII)V")
    public static final void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4 - arg3;
        field1562++;
        int var7 = arg1 - arg0;
        if (var7 == 0) {
            if (var6 != 0) {
                class237.method1538(arg0, arg3, (byte) -121, arg5, arg4);
            }
        } else if (var6 == 0) {
            class114.method732(arg1, arg0, (byte) -60, arg5, arg3);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg0;
                int var10 = arg1;
                arg0 = arg3;
                arg3 = var9;
                arg1 = arg4;
                arg4 = var10;
            }
            if (arg1 < arg0) {
                int var11 = arg0;
                arg0 = arg1;
                int var12 = arg3;
                arg3 = arg4;
                arg1 = var11;
                arg4 = var12;
            }
            int var13 = arg3;
            int var14 = arg1 - arg0;
            int var15 = arg3 >= arg4 ? -1 : 1;
            if (arg2 <= 10) {
                method508((byte) 115);
            }
            int var16 = -(var14 >> 1);
            int var17 = arg4 - arg3;
            if (var17 < 0) {
                var17 = -var17;
            }
            if (var8) {
                for (int var19 = arg0; var19 <= arg1; var19++) {
                    class14.field331[var19][var13] = arg5;
                    var16 += var17;
                    if (var16 > 0) {
                        var13 += var15;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg0; var18 <= arg1; var18++) {
                    class14.field331[var13][var18] = arg5;
                    var16 += var17;
                    if (var16 > 0) {
                        var13 += var15;
                        var16 -= var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(II)[I")
    public final int[] method521(int arg0, int arg1) {
        field1552++;
        class53 var3 = this.method516(24380, arg1);
        return arg0 <= 77 ? null : var3.method365(this, this.field1556, 1536, this.field1568);
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Leh;Leh;II)V")
    public class81(class52 arg0, class52 arg1, int arg2, int arg3) {
        this.field1565 = arg0;
        this.field1547 = arg2;
        this.field1556 = arg1;
        this.field1568 = arg3;
        this.field1546 = new class194(this.field1547);
    }
}
