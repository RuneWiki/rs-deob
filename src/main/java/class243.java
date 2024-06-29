import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class243 extends class151 {

    @OriginalMember(owner = "client!rf", name = "y", descriptor = "Lbd;")
    public class162 field4039;

    @OriginalMember(owner = "client!rf", name = "A", descriptor = "Lbd;")
    public static class162 field4041 = class17.method142(0, "<)4col> x");

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "Lob;")
    public static class78 field4040 = null;

    @OriginalMember(owner = "client!rf", name = "D", descriptor = "[Z")
    public static boolean[] field4044 = new boolean[100];

    @OriginalMember(owner = "client!rf", name = "B", descriptor = "Lbd;")
    public static class162 field4042 = null;

    @OriginalMember(owner = "client!rf", name = "s", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!rf", name = "t", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!rf", name = "v", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!rf", name = "w", descriptor = "Lda;")
    public static class143 field4037;

    @OriginalMember(owner = "client!rf", name = "C", descriptor = "Lbe;")
    public static class235 field4043;

    @OriginalMember(owner = "client!rf", name = "x", descriptor = "[I")
    public static int[] field4038;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIBIIIIII)V", line = 5)
    public static final void method1720(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4034++;
        int var9 = 0;
        int var10 = -33 / ((60 - arg2) / 49);
        while (var9 < class9.field112.field536) {
            int var11 = class9.field112.field531[var9] - class290.field4893;
            int var12 = -class9.field112.field535[var9] - (-class87.field1536 - class9.field114) - 1;
            int var13 = (arg0 - arg5) * (var12 - arg7) / (arg4 - arg7) + arg5;
            int var14 = class9.field112.method260(4, var9);
            int var15 = arg6 + ((var11 - arg3) * (arg8 - arg6) / (arg1 - arg3));
            int var16 = 16777215;
            class215 var17 = null;
            if (var14 == 0) {
                if ((double) class149.field2689 == 3.0D) {
                    var17 = class7.field72;
                }
                if ((double) class149.field2689 == 4.0D) {
                    var17 = class116.field2064;
                }
                if ((double) class149.field2689 == 6.0D) {
                    var17 = class162.field2849;
                }
                if ((double) class149.field2689 == 8.0D) {
                    var17 = class91.field1613;
                }
            }
            if (var14 == 1) {
                if ((double) class149.field2689 == 3.0D) {
                    var17 = class162.field2849;
                }
                if ((double) class149.field2689 == 4.0D) {
                    var17 = class91.field1613;
                }
                if ((double) class149.field2689 == 6.0D) {
                    var17 = class200.field3410;
                }
                if ((double) class149.field2689 == 8.0D) {
                    var17 = class158.field2784;
                }
            }
            if (var14 == 2) {
                var16 = 16755200;
                if ((double) class149.field2689 == 3.0D) {
                    var17 = class200.field3410;
                }
                if ((double) class149.field2689 == 4.0D) {
                    var17 = class158.field2784;
                }
                if ((double) class149.field2689 == 6.0D) {
                    var17 = class187.field3234;
                }
                if ((double) class149.field2689 == 8.0D) {
                    var17 = class218.field3638;
                }
            }
            if (class9.field112.field528[var9] != -1) {
                var16 = class9.field112.field528[var9];
            }
            if (var17 != null) {
                class162[] var18 = new class162[class9.field112.field534[var9].method1245((byte) 46, 60) + 1];
                class268.field4487.method1893(class9.field112.field534[var9], (int[]) null, var18);
                int var19 = var18.length;
                int var20 = var13 - var17.method1565() * (var19 - 1) / 2;
                int var21 = var20 + var17.method1566() / 2;
                for (int var22 = 0; var22 < var19; var22++) {
                    class162 var23 = var19 - 1 == var22 ? var18[var22] : var18[var22].method1283(0, var18[var22].method1249((byte) -118) - 4, (byte) 123);
                    var17.method1564(var23, var15, var21, var16, true);
                    var21 += var17.method1565();
                }
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Lvd;", line = 132)
    public static final class63 method1721(int arg0) {
        field4036++;
        class63 var1 = (class63) class263.field4387.method373(true);
        if (var1 != null) {
            var1.method1183(false);
            var1.method1573(arg0 - 9728);
            return var1;
        }
        if (arg0 != 0) {
            method1722(24);
        }
        class63 var2;
        do {
            var2 = (class63) class57.field890.method373(true);
            if (var2 == null) {
                return null;
            }
            if (var2.method428(true) > class300.method2048((byte) 18)) {
                return null;
            }
            var2.method1183(false);
            var2.method1573(-9728);
        } while ((var2.field3604 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V", line = 174)
    public static void method1722(int arg0) {
        field4038 = null;
        field4044 = null;
        field4040 = null;
        field4037 = null;
        field4043 = null;
        if (arg0 == 238) {
            field4042 = null;
            field4041 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 206)
    public static final void method1723(int arg0, int arg1) {
        field4035++;
        class79 var2;
        if (class117.field2159 || class135.field2400 == null) {
            var2 = new class79(512, 512);
        } else {
            var2 = (class79) class135.field2400;
        }
        int[] var3 = var2.field1384;
        int var4 = var3.length;
        if (arg0 != 103) {
            field4041 = (class162) null;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var7 = (103 - var6) * 512 * 4 + 24628;
            for (int var8 = 1; var8 < 103; var8++) {
                if ((class213.field3580[arg1][var8][var6] & 0x18) == 0) {
                    class313.method2139(var3, var7, 512, arg1, var8, var6);
                }
                if (arg1 < 3 && (class213.field3580[arg1 + 1][var8][var6] & 0x8) != 0) {
                    class313.method2139(var3, var7, 512, arg1 + 1, var8, var6);
                }
                var7 += 4;
            }
        }
        var2.method607();
        int var9 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var10 = (((int) (Math.random() * 20.0D)) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) - 10) + 238;
        for (int var11 = 1; var11 < 103; var11++) {
            for (int var12 = 1; var12 < 103; var12++) {
                if ((class213.field3580[arg1][var12][var11] & 0x18) == 0) {
                    class45.method326(var11, arg1, var12, 5854, var10, var9);
                }
                if (arg1 < 3 && (class213.field3580[arg1 + 1][var12][var11] & 0x8) != 0) {
                    class45.method326(var11, arg1 + 1, var12, arg0 ^ 0x16B9, var10, var9);
                }
            }
        }
        class160.field2789 = 0;
        for (int var13 = 0; var13 < 104; var13++) {
            for (int var14 = 0; var14 < 104; var14++) {
                long var15 = class256.method1768(class157.field2765, var13, var14);
                if (var15 != 0L) {
                    class311 var17 = class229.method1637(Integer.MAX_VALUE & (int) (var15 >>> 32), (byte) 93);
                    int var18 = var17.field5239;
                    if (var17.field5191 != null) {
                        for (int var19 = 0; var19 < var17.field5191.length; var19++) {
                            if (var17.field5191[var19] != -1) {
                                class311 var20 = class229.method1637(var17.field5191[var19], (byte) 93);
                                if (var20.field5239 >= 0) {
                                    var18 = var20.field5239;
                                    break;
                                }
                            }
                        }
                    }
                    if (var18 >= 0) {
                        int var21 = var13;
                        int var22 = var14;
                        if (var18 != 22 && var18 != 29 && var18 != 34 && var18 != 36 && var18 != 46 && var18 != 47 && var18 != 48) {
                            int[][] var23 = class267.field4473[class157.field2765].field3061;
                            for (int var24 = 0; var24 < 10; var24++) {
                                int var25 = (int) (Math.random() * 4.0D);
                                if (var25 == 0 && var21 > 0 && var21 > (var13 - 3) && (var23[var21 - 1][var22] & 0x12C0108) == 0) {
                                    var21--;
                                }
                                if (var25 == 1 && var21 < 103 && var21 < (var13 + 3) && (var23[var21 + 1][var22] & 0x12C0180) == 0) {
                                    var21++;
                                }
                                if (var25 == 2 && var22 > 0 && var22 > var14 - 3 && (var23[var21][var22 - 1] & 0x12C0102) == 0) {
                                    var22--;
                                }
                                if (var25 == 3 && var22 < 103 && (var14 + 3) > var22 && (var23[var21][var22 + 1] & 0x12C0120) == 0) {
                                    var22++;
                                }
                            }
                        }
                        class46.field738[class160.field2789] = var17.field5219;
                        class274.field4552[class160.field2789] = var21;
                        class143.field2577[class160.field2789] = var22;
                        class160.field2789++;
                    }
                }
            }
        }
        if (class117.field2159) {
            for (int var26 = 0; var26 < var4; var26++) {
                if (var3[var26] == 0) {
                    var3[var26] = 1;
                }
            }
            class135.field2400 = new class140(var2);
        } else {
            class135.field2400 = var2;
        }
        if (class117.field2159) {
            class316.field5328 = null;
        } else {
            class139.field2484.method654(false);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V", line = 402)
    public class243() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lbd;I)V", line = 416)
    public class243(class162 arg0, int arg1) {
        this.field4039 = arg0;
    }
}
