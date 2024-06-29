import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class60 extends class256 {

    @OriginalMember(owner = "client!oc", name = "C", descriptor = "[B")
    public byte[] field1197;

    @OriginalMember(owner = "client!oc", name = "B", descriptor = "Ljd;")
    private static class86 field1196 = class122.method868("flash2:", true);

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "Ljd;")
    public static class86 field1192 = field1196;

    @OriginalMember(owner = "client!oc", name = "J", descriptor = "Ljd;")
    private static class86 field1202 = class122.method868("glow1:", true);

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Ljd;")
    public static class86 field1193 = field1202;

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "Ljd;")
    public static class86 field1195 = field1202;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Ljd;")
    public static class86 field1203 = field1196;

    @OriginalMember(owner = "client!oc", name = "E", descriptor = "Luk;")
    public static class96 field1198 = new class96(50);

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "I")
    public static int field1191;

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!oc", name = "G", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "[I")
    public static int[] field1205;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "[Ls;")
    public static class228[] field1201;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method430(byte arg0) {
        field1200++;
        Container var1;
        if (class88.field1746 != null) {
            var1 = class88.field1746;
        } else if (class138.field2627 == null) {
            var1 = class157.field2954.field4514;
        } else {
            var1 = class138.field2627;
        }
        class255.field4540 = var1.getSize().width;
        class200.field3571 = var1.getSize().height;
        if (class138.field2627 == var1) {
            Insets var2 = class138.field2627.getInsets();
            class255.field4540 -= var2.left + var2.right;
            class200.field3571 -= var2.top + var2.bottom;
        }
        if (class173.method1236(-83) >= 2) {
            class4.field53 = class255.field4540;
            class183.field3263 = 0;
            class213.field3858 = 0;
            class248.field4414 = class200.field3571;
        } else {
            class248.field4414 = 503;
            class213.field3858 = 0;
            class183.field3263 = (class255.field4540 - 765) / 2;
            class4.field53 = 765;
        }
        class50.field1057.setSize(class4.field53, class248.field4414);
        if (class138.field2627 == var1) {
            Insets var3 = class138.field2627.getInsets();
            class50.field1057.setLocation(class183.field3263 + var3.left, var3.top - -class213.field3858);
        } else {
            class50.field1057.setLocation(class183.field3263, class213.field3858);
        }
        if (class178.field3225 != -1) {
            class241.method1651(true, (byte) 8);
        }
        if (arg0 >= 47) {
            class104.method746((byte) -111);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)V")
    public static final void method431(byte arg0, int arg1) {
        class135.field2592 = 0;
        if (arg0 > -75) {
            method431((byte) 38, 3);
        }
        field1191++;
        class272.field4766 = -1;
        class187.field3315 = null;
        class177.field3208 = false;
        class45.field1007 = 1;
        class83.field1622 = arg1;
        class171.field3143 = -1;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([B)V")
    public class60(byte[] arg0) {
        this.field1197 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
    public static void method432(int arg0) {
        field1205 = null;
        int var1 = 19 % ((arg0 - 67) / 45);
        field1198 = null;
        field1196 = null;
        field1193 = null;
        field1195 = null;
        field1202 = null;
        field1201 = null;
        field1192 = null;
        field1203 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
    public static final void method433() {
        class150.field2792 = 0;
        label191: for (int var0 = 0; var0 < class113.field2151; var0++) {
            class106 var1 = class247.field4396[var0];
            if (class53.field1085 != null) {
                for (int var2 = 0; var2 < class53.field1085.length; var2++) {
                    if (class53.field1085[var2] != -1000000 && (var1.field2031 <= class53.field1085[var2] || var1.field2020 <= class53.field1085[var2]) && (var1.field2046 <= class25.field597[var2] || var1.field2044 <= class25.field597[var2]) && (var1.field2046 >= class98.field1949[var2] || var1.field2044 >= class98.field1949[var2]) && (var1.field2041 <= class274.field4809[var2] || var1.field2026 <= class274.field4809[var2]) && (var1.field2041 >= class260.field4658[var2] || var1.field2026 >= class260.field4658[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2043 == 1) {
                int var3 = var1.field2025 + class119.field2339 - class106.field2032;
                if (var3 >= 0 && var3 <= class119.field2339 + class119.field2339) {
                    int var4 = var1.field2033 + class119.field2339 - class158.field2966;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2024 + class119.field2339 - class158.field2966;
                    if (var5 > class119.field2339 + class119.field2339) {
                        var5 = class119.field2339 + class119.field2339;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class79.field1548[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class81.field1591 - var1.field2046;
                        if (var7 > 32) {
                            var1.field2038 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2038 = 2;
                            var7 = -var7;
                        }
                        var1.field2035 = (var1.field2041 - class191.field3389 << 8) / var7;
                        var1.field2034 = (var1.field2026 - class191.field3389 << 8) / var7;
                        var1.field2022 = (var1.field2031 - class205.field3697 << 8) / var7;
                        var1.field2036 = (var1.field2020 - class205.field3697 << 8) / var7;
                        class230.field4181[class150.field2792++] = var1;
                    }
                }
            } else if (var1.field2043 == 2) {
                int var8 = var1.field2033 + class119.field2339 - class158.field2966;
                if (var8 >= 0 && var8 <= class119.field2339 + class119.field2339) {
                    int var9 = var1.field2025 + class119.field2339 - class106.field2032;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2047 + class119.field2339 - class106.field2032;
                    if (var10 > class119.field2339 + class119.field2339) {
                        var10 = class119.field2339 + class119.field2339;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class79.field1548[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class191.field3389 - var1.field2041;
                        if (var12 > 32) {
                            var1.field2038 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2038 = 4;
                            var12 = -var12;
                        }
                        var1.field2037 = (var1.field2046 - class81.field1591 << 8) / var12;
                        var1.field2027 = (var1.field2044 - class81.field1591 << 8) / var12;
                        var1.field2022 = (var1.field2031 - class205.field3697 << 8) / var12;
                        var1.field2036 = (var1.field2020 - class205.field3697 << 8) / var12;
                        class230.field4181[class150.field2792++] = var1;
                    }
                }
            } else if (var1.field2043 == 4) {
                int var13 = var1.field2031 - class205.field3697;
                if (var13 > 128) {
                    int var14 = var1.field2033 + class119.field2339 - class158.field2966;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2024 + class119.field2339 - class158.field2966;
                    if (var15 > class119.field2339 + class119.field2339) {
                        var15 = class119.field2339 + class119.field2339;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2025 + class119.field2339 - class106.field2032;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2047 + class119.field2339 - class106.field2032;
                        if (var17 > class119.field2339 + class119.field2339) {
                            var17 = class119.field2339 + class119.field2339;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class79.field1548[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2038 = 5;
                            var1.field2037 = (var1.field2046 - class81.field1591 << 8) / var13;
                            var1.field2027 = (var1.field2044 - class81.field1591 << 8) / var13;
                            var1.field2035 = (var1.field2041 - class191.field3389 << 8) / var13;
                            var1.field2034 = (var1.field2026 - class191.field3389 << 8) / var13;
                            class230.field4181[class150.field2792++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1199++;
        if (class51.field1078 == 0) {
            class92.field1866++;
            int var7 = class150.field2805;
            int var8 = class253.field4503;
            int var9 = class125.field2425;
            int var10 = class4.field58;
            int var11 = (arg0 - arg2) * (var8 - var7) / arg1 + var7;
            int var12 = (arg4 - arg3) * (var9 - var10) / arg6 + var10;
            if (class11.field336 && (class8.field259 & 0x40) == 64) {
                class6 var13 = class229.method1596(class20.field526, class226.field4095, (byte) -27);
                if (var13 == null) {
                    class138.method985(26797);
                } else {
                    class240.method1650((byte) -127, 0L, var12, class1.field17, class93.field1883, (short) 59, var11);
                }
            } else {
                class240.method1650((byte) -126, 0L, var12, class56.field1155, class234.field4235, (short) 6, var11);
            }
        }
        if (arg5 != 30) {
            return;
        }
        long var14 = -1L;
        for (int var16 = 0; var16 < class76.field1507; var16++) {
            long var17 = class230.field4185[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FC2) >> 7;
            int var21 = ((int) var17 & 0x78D17166) >> 29;
            int var22 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            if (var14 != var17) {
                var14 = var17;
                if (var21 == 2 && class17.method144(class180.field3244, var19, var20, var17)) {
                    class117 var23 = class268.method1845(var22, (byte) -85);
                    if (var23.field2295 != null) {
                        var23 = var23.method840(-1);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class51.field1078 == 1) {
                        class240.method1650((byte) -126, var17, var20, class109.method783(2, new class86[] { class157.field2963, class256.field4550, var23.field2248 }), class64.field1253, (short) 28, var19);
                        class265.field4690++;
                    } else if (!class11.field336) {
                        class86[] var24 = var23.field2306;
                        class188.field3335++;
                        if (class260.field4647) {
                            var24 = class87.method641((byte) 113, var24);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    class241.field4330++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 36;
                                    }
                                    if (var25 == 1) {
                                        var26 = 57;
                                    }
                                    if (var25 == 2) {
                                        var26 = 7;
                                    }
                                    if (var25 == 3) {
                                        var26 = 30;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1006;
                                    }
                                    class240.method1650((byte) -128, var17, var20, class109.method783(2, new class86[] { class253.field4500, var23.field2248 }), var24[var25], var26, var19);
                                }
                            }
                        }
                        class240.method1650((byte) -128, (long) var23.field2261, var20, class109.method783(2, new class86[] { class253.field4500, var23.field2248 }), class151.field2831, (short) 1005, var19);
                    } else if ((class8.field259 & 0x4) == 4) {
                        class240.method1650((byte) -128, var17, var20, class109.method783(2, new class86[] { class133.field2519, class256.field4550, var23.field2248 }), class93.field1883, (short) 2, var19);
                        class138.field2635++;
                    }
                }
                if (var21 == 1) {
                    class170 var27 = class233.field4217[var22];
                    if (var27.field3130.field333 == 1 && (var27.field676 & 0x7F) == 64 && (var27.field685 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class61.field1207; var28++) {
                            class170 var31 = class233.field4217[class189.field3350[var28]];
                            if (var31 != null && var27 != var31 && var31.field3130.field333 == 1 && var27.field676 == var31.field676 && var27.field685 == var31.field685) {
                                class6.method45(var19, var31.field3130, var20, class189.field3350[var28], 4);
                            }
                        }
                        for (int var29 = 0; var29 < class209.field3786; var29++) {
                            class224 var30 = class186.field3294[class142.field2689[var29]];
                            if (var30 != null && var27.field676 == var30.field676 && var27.field685 == var30.field685) {
                                class185.method1274(var19, class142.field2689[var29], arg5 ^ 0xFFFFFF92, var30, var20);
                            }
                        }
                    }
                    class6.method45(var19, var27.field3130, var20, var22, arg5 - 26);
                }
                if (var21 == 0) {
                    class224 var32 = class186.field3294[var22];
                    if ((var32.field676 & 0x7F) == 64 && (var32.field685 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class61.field1207; var33++) {
                            class170 var36 = class233.field4217[class189.field3350[var33]];
                            if (var36 != null && var36.field3130.field333 == 1 && var32.field676 == var36.field676 && var32.field685 == var36.field685) {
                                class6.method45(var19, var36.field3130, var20, class189.field3350[var33], 4);
                            }
                        }
                        for (int var34 = 0; var34 < class209.field3786; var34++) {
                            class224 var35 = class186.field3294[class142.field2689[var34]];
                            if (var35 != null && var32 != var35 && var32.field676 == var35.field676 && var32.field685 == var35.field685) {
                                class185.method1274(var19, class142.field2689[var34], -128, var35, var20);
                            }
                        }
                    }
                    class185.method1274(var19, var22, -125, var32, var20);
                }
                if (var21 == 3) {
                    class257 var37 = class238.field4284[class180.field3244][var19][var20];
                    if (var37 != null) {
                        for (class126 var38 = (class126) var37.method1730((byte) 94); var38 != null; var38 = (class126) var37.method1734(-1)) {
                            int var39 = var38.field2433.field2660;
                            class69 var40 = class272.method1853(arg5 ^ 0x1E, var39);
                            if (class51.field1078 == 1) {
                                class21.field552++;
                                class240.method1650((byte) -128, (long) var39, var20, class109.method783(2, new class86[] { class157.field2963, class41.field935, var40.field1421 }), class64.field1253, (short) 9, var19);
                            } else if (!class11.field336) {
                                class86[] var41 = var40.field1348;
                                if (class260.field4647) {
                                    var41 = class87.method641((byte) 112, var41);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 58;
                                        }
                                        if (var42 == 1) {
                                            var43 = 12;
                                        }
                                        if (var42 == 2) {
                                            var43 = 37;
                                        }
                                        if (var42 == 3) {
                                            var43 = 46;
                                        }
                                        if (var42 == 4) {
                                            var43 = 31;
                                        }
                                        class8.field258++;
                                        class240.method1650((byte) -128, (long) var39, var20, class109.method783(arg5 ^ 0x1C, new class86[] { class90.field1833, var40.field1421 }), var41[var42], var43, var19);
                                    } else if (var42 == 2) {
                                        class240.method1650((byte) -128, (long) var39, var20, class109.method783(arg5 ^ 0x1C, new class86[] { class90.field1833, var40.field1421 }), class65.field1288, (short) 37, var19);
                                        class127.field2461++;
                                    }
                                }
                                class23.field572++;
                                class240.method1650((byte) -127, (long) var39, var20, class109.method783(2, new class86[] { class90.field1833, var40.field1421 }), class151.field2831, (short) 1001, var19);
                            } else if ((class8.field259 & 0x1) == 1) {
                                class164.field3085++;
                                class240.method1650((byte) -128, (long) var39, var20, class109.method783(2, new class86[] { class133.field2519, class41.field935, var40.field1421 }), class93.field1883, (short) 10, var19);
                            }
                        }
                    }
                }
            }
        }
    }
}
