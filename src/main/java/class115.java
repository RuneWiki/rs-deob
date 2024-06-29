import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class115 extends class104 {

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public int field1896;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public static int[] field1895 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "[Laf;")
    public static class156[] field1901 = new class156[32768];

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "Le;")
    public static class191 field1906 = class54.method368(" GMT", 2047);

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Le;")
    public static class191 field1903 = class54.method368("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 2047);

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Le;")
    private static class191 field1904 = class54.method368("shake:", 2047);

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "Le;")
    public static class191 field1897 = field1904;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "[I")
    public static int[] field1909 = new int[32];

    @OriginalMember(owner = "client!wb", name = "M", descriptor = "Le;")
    public static class191 field1908 = class54.method368("_", 2047);

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Le;")
    public static class191 field1902 = field1904;

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "F")
    public static float field1905;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)V")
    public static final void method729(int arg0) {
        if (arg0 != 0) {
            field1905 = -0.3436357F;
        }
        class242.field4325 = new class33[class197.field3513.method798(-38)][];
        class148.field2531 = new boolean[class197.field3513.method798(-106)];
        field1898++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)Le;")
    public static final class191 method730(byte arg0, int arg1) {
        field1899++;
        if (arg1 < 999999999) {
            return class92.method563(-103, arg1);
        } else if (arg0 == 41) {
            return class268.field4735;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
    public static final void method731(int arg0, int arg1, int arg2) {
        class53.field968 = true;
        class67.field1171 = arg0;
        class69.field1205 = arg1;
        class178.field3063 = arg2;
        class75.field1280 = -1;
        class122.field2011 = -1;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static final void method732(int arg0) {
        field1900++;
        if (arg0 >= -92) {
            field1905 = -0.003868494F;
        }
        class244.field4348.method985(0);
        class61.field1099.method985(0);
        class137.field2290.method985(0);
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static void method733(int arg0) {
        field1904 = null;
        field1902 = null;
        field1903 = null;
        field1908 = null;
        field1895 = null;
        field1901 = null;
        field1906 = null;
        field1897 = null;
        if (arg0 != 76) {
            method732(-102);
        }
        field1909 = null;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class115() {
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Leg;IIII)V")
    public static final void method734(class33 arg0, int arg1, int arg2, int arg3, int arg4) {
        class228.method1632((byte) 101);
        if (arg3 != -1449770672) {
            return;
        }
        field1894++;
        class7.method54(arg1, arg2, arg0.field537 + arg1, arg2 - -arg0.field561);
        if (class267.field4726 == 2 || class267.field4726 == 5 || class216.field3815 == null) {
            class7.method36(arg1, arg2, 0, arg0.field492, arg0.field566);
        } else {
            int var5 = class65.field1138 + class137.field2302 & 0x7FF;
            int var6 = class175.field2946.field3003 / 32 + 48;
            int var7 = 464 - (class175.field2946.field2972 / 32);
            ((class155) class216.field3815).method596(arg1, arg2, arg0.field537, arg0.field561, var6, var7, var5, class114.field1886 + 256, arg0.field492, arg0.field566);
            if (class248.field4416 != null) {
                for (int var8 = 0; var8 < class248.field4416.field816; var8++) {
                    if (class248.field4416.method317(false, var8)) {
                        int var9 = (class248.field4416.field823[var8] - class225.field4061) * 4 + 2 - class175.field2946.field3003 / 32;
                        int var10 = class15.field204[var5];
                        int var11 = (class248.field4416.field826[var8] - class193.field3474) * 4 + 2 - class175.field2946.field2972 / 32;
                        int var12 = class15.field206[var5];
                        int var13 = var12 * 256 / (class114.field1886 + 256);
                        int var14 = var10 * 256 / (class114.field1886 + 256);
                        int var15 = var9 * var13 + var11 * var14 >> 16;
                        class44 var16 = class83.field1393;
                        if (class248.field4416.method314(var8, (byte) -110) == 1) {
                            var16 = class138.field2325;
                        }
                        if (class248.field4416.method314(var8, (byte) -110) == 2) {
                            var16 = class230.field4128;
                        }
                        int var17 = var11 * var13 - (var9 * var14) >> 16;
                        int var18 = var16.method285(class248.field4416.field825[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg0.field537 <= var19 && var19 <= arg0.field537 && var17 >= (-arg0.field561) && arg0.field561 >= var17) {
                            int var20 = 16777215;
                            if (class248.field4416.field817[var8] != -1) {
                                var20 = class248.field4416.field817[var8];
                            }
                            class7.method44(arg0.field492, arg0.field566);
                            var16.method286(class248.field4416.field825[var8], arg0.field537 / 2 + var19 + arg1, arg0.field561 / 2 + -var17 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            class7.method37();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class199.field3554; var21++) {
                int var54 = class141.field2353[var21] * 4 + 2 - class175.field2946.field2972 / 32;
                int var55 = class145.field2445[var21] * 4 - ((class175.field2946.field3003 / 32) - 2);
                class102 var56 = class31.method216(class49.field875[var21], (byte) 118);
                if (var56.field1649 != null) {
                    var56 = var56.method643(10853);
                    if (var56 == null || var56.field1681 == -1) {
                        continue;
                    }
                }
                class224.method1555(arg2, arg0, class133.field2233[var56.field1681], (byte) -30, arg1, var54, var55);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class175 var51 = class75.field1281[class261.field4598][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 - ((class175.field2946.field3003 / 32) - 2);
                        int var53 = var50 * 4 + 2 - (class175.field2946.field2972 / 32);
                        class224.method1555(arg2, arg0, class25.field368[0], (byte) -53, arg1, var53, var52);
                    }
                }
            }
            for (int var23 = 0; var23 < class197.field3514; var23++) {
                class156 var46 = field1901[class256.field4542[var23]];
                if (var46 != null && var46.method489(50)) {
                    class184 var47 = var46.field2663;
                    if (var47 != null && var47.field3225 != null) {
                        var47 = var47.method1245((byte) -78);
                    }
                    if (var47 != null && var47.field3226 && var47.field3228) {
                        int var48 = var46.field2972 / 32 - class175.field2946.field2972 / 32;
                        int var49 = var46.field3003 / 32 - (class175.field2946.field3003 / 32);
                        class224.method1555(arg2, arg0, class25.field368[1], (byte) -74, arg1, var48, var49);
                    }
                }
            }
            for (int var24 = 0; var24 < class260.field4586; var24++) {
                class76 var38 = class245.field4357[class73.field1271[var24]];
                if (var38 != null && var38.method489(50)) {
                    boolean var39 = false;
                    int var40 = var38.field3003 / 32 - class175.field2946.field3003 / 32;
                    int var41 = var38.field2972 / 32 - (class175.field2946.field2972 / 32);
                    long var42 = var38.field1315.method1352(65);
                    for (int var44 = 0; var44 < class270.field4759; var44++) {
                        if (class35.field643[var44] == var42 && class206.field3650[var44] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class175.field2946.field1310 != 0 && var38.field1310 != 0 && class175.field2946.field1310 == var38.field1310) {
                        var45 = true;
                    }
                    if (var39) {
                        class224.method1555(arg2, arg0, class25.field368[3], (byte) -81, arg1, var41, var40);
                    } else if (var45) {
                        class224.method1555(arg2, arg0, class25.field368[4], (byte) -61, arg1, var41, var40);
                    } else {
                        class224.method1555(arg2, arg0, class25.field368[2], (byte) -61, arg1, var41, var40);
                    }
                }
            }
            class79[] var25 = class152.field2608;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class79 var29 = var25[var26];
                if (var29 != null && var29.field1344 != 0 && (class135.field2267 % 20) < 10) {
                    if (var29.field1344 == 1 && var29.field1352 >= 0 && var29.field1352 < field1901.length) {
                        class156 var30 = field1901[var29.field1352];
                        if (var30 != null) {
                            int var31 = var30.field3003 / 32 - class175.field2946.field3003 / 32;
                            int var32 = var30.field2972 / 32 - (class175.field2946.field2972 / 32);
                            class206.method1421(arg1, (byte) 124, arg0, var32, var29.field1341, var31, arg2);
                        }
                    }
                    if (var29.field1344 == 2) {
                        int var33 = (var29.field1353 - class225.field4061) * 4 + 2 - class175.field2946.field3003 / 32;
                        int var34 = (var29.field1345 - class193.field3474) * 4 + 2 - (class175.field2946.field2972 / 32);
                        class206.method1421(arg1, (byte) 123, arg0, var34, var29.field1341, var33, arg2);
                    }
                    if (var29.field1344 == 10 && var29.field1352 >= 0 && var29.field1352 < class245.field4357.length) {
                        class76 var35 = class245.field4357[var29.field1352];
                        if (var35 != null) {
                            int var36 = var35.field2972 / 32 - (class175.field2946.field2972 / 32);
                            int var37 = var35.field3003 / 32 - (class175.field2946.field3003 / 32);
                            class206.method1421(arg1, (byte) 125, arg0, var36, var29.field1341, var37, arg2);
                        }
                    }
                }
            }
            if (class146.field2459 != 0) {
                int var27 = class146.field2459 * 4 + 2 - (class175.field2946.field3003 / 32);
                int var28 = class22.field317 * 4 + 2 - class175.field2946.field2972 / 32;
                class224.method1555(arg2, arg0, class191.field3408, (byte) -19, arg1, var28, var27);
            }
            class7.method55(arg0.field537 / 2 + arg1 - 1, arg0.field561 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        class87.field1428[arg4] = true;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
    public class115(int arg0) {
        this.field1896 = arg0;
    }
}
