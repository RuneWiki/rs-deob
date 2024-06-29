import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class149 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lna;")
    public static class26 field2326 = class69.method505("headicons_pk", (byte) -120);

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field2327 = 0;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "Z")
    public static boolean field2332 = false;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lna;")
    public static class26 field2329 = class69.method505(" (X", (byte) -125);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Lna;")
    public static class26 field2335 = class69.method505("<)4col>", (byte) -118);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public int field2324;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field2338;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "J")
    public long field2340;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Lth;")
    public class86 field2323;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Lth;")
    public class86 field2325;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lth;")
    public class86 field2330;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Llk;", line = 6)
    public static final class277 method1013(byte arg0, int arg1) {
        field2328++;
        class277 var2 = (class277) class126.field1946.method28((long) arg1, 1400);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 23) {
            field2326 = (class26) null;
        }
        byte[] var3 = class137.field2097.method1889(26, (byte) -122, arg1);
        class277 var4 = new class277();
        if (var3 != null) {
            var4.method1962(5, new class82(var3));
        }
        class126.field1946.method33(var4, (long) arg1, (byte) 59);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V", line = 40)
    public static final void method1014(boolean arg0) {
        field2334++;
        if (class280.field4670 || class229.field3624 == 2) {
            return;
        }
        try {
            class61.field982.method208(-1857, class136.field2085);
            if (!arg0) {
                method1019((byte) -25, 1);
            }
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "()V", line = 59)
    public static final void method1015() {
        class136.field2086 = 0;
        label194: for (int var0 = 0; var0 < class69.field1067; var0++) {
            class101 var1 = class173.field2715[var0];
            if (class1.field11 != null) {
                for (int var2 = 0; var2 < class1.field11.length; var2++) {
                    if (class1.field11[var2] != -1000000 && (var1.field1616 <= class1.field11[var2] || var1.field1620 <= class1.field11[var2]) && (var1.field1635 <= class209.field3249[var2] || var1.field1617 <= class209.field3249[var2]) && (var1.field1635 >= class233.field3693[var2] || var1.field1617 >= class233.field3693[var2]) && (var1.field1633 <= class196.field3038[var2] || var1.field1622 <= class196.field3038[var2]) && (var1.field1633 >= class61.field983[var2] || var1.field1622 >= class61.field983[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1626 == 1) {
                int var3 = var1.field1625 + class261.field4272 - class314.field5377;
                if (var3 >= 0 && var3 <= class261.field4272 + class261.field4272) {
                    int var4 = var1.field1636 + class261.field4272 - class309.field5315;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1639 + class261.field4272 - class309.field5315;
                    if (var5 > class261.field4272 + class261.field4272) {
                        var5 = class261.field4272 + class261.field4272;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class38.field626[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class50.field794 - var1.field1635;
                        if (var7 > 32) {
                            var1.field1637 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1637 = 2;
                            var7 = -var7;
                        }
                        var1.field1627 = (var1.field1633 - class18.field255 << 8) / var7;
                        var1.field1623 = (var1.field1622 - class18.field255 << 8) / var7;
                        var1.field1634 = (var1.field1616 - class133.field2019 << 8) / var7;
                        var1.field1638 = (var1.field1620 - class133.field2019 << 8) / var7;
                        class21.field296[class136.field2086++] = var1;
                    }
                }
            } else if (var1.field1626 == 2) {
                int var8 = var1.field1636 + class261.field4272 - class309.field5315;
                if (var8 >= 0 && var8 <= class261.field4272 + class261.field4272) {
                    int var9 = var1.field1625 + class261.field4272 - class314.field5377;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1619 + class261.field4272 - class314.field5377;
                    if (var10 > class261.field4272 + class261.field4272) {
                        var10 = class261.field4272 + class261.field4272;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class38.field626[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class18.field255 - var1.field1633;
                        if (var12 > 32) {
                            var1.field1637 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1637 = 4;
                            var12 = -var12;
                        }
                        var1.field1621 = (var1.field1635 - class50.field794 << 8) / var12;
                        var1.field1630 = (var1.field1617 - class50.field794 << 8) / var12;
                        var1.field1634 = (var1.field1616 - class133.field2019 << 8) / var12;
                        var1.field1638 = (var1.field1620 - class133.field2019 << 8) / var12;
                        class21.field296[class136.field2086++] = var1;
                    }
                }
            } else if (var1.field1626 == 4) {
                int var13 = var1.field1616 - class133.field2019;
                if (var13 > 128) {
                    int var14 = var1.field1636 + class261.field4272 - class309.field5315;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1639 + class261.field4272 - class309.field5315;
                    if (var15 > class261.field4272 + class261.field4272) {
                        var15 = class261.field4272 + class261.field4272;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1625 + class261.field4272 - class314.field5377;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1619 + class261.field4272 - class314.field5377;
                        if (var17 > class261.field4272 + class261.field4272) {
                            var17 = class261.field4272 + class261.field4272;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class38.field626[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1637 = 5;
                            var1.field1621 = (var1.field1635 - class50.field794 << 8) / var13;
                            var1.field1630 = (var1.field1617 - class50.field794 << 8) / var13;
                            var1.field1627 = (var1.field1633 - class18.field255 << 8) / var13;
                            var1.field1623 = (var1.field1622 - class18.field255 << 8) / var13;
                            class21.field296[class136.field2086++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)Lna;", line = 291)
    public static final class26 method1016(int arg0, byte arg1, int arg2) {
        int var3 = arg2 - arg0;
        field2339++;
        if (var3 < -9) {
            return class185.field2886;
        } else if (var3 < -6) {
            return class59.field963;
        } else if (var3 < -3) {
            return class259.field4242;
        } else if (var3 < 0) {
            return class315.field5394;
        } else if (arg1 > -52) {
            return (class26) null;
        } else if (var3 > 9) {
            return class164.field2552;
        } else if (var3 > 6) {
            return class114.field1801;
        } else if (var3 <= 3) {
            return var3 > 0 ? class109.field1706 : class108.field1698;
        } else {
            return class262.field4285;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V", line = 338)
    public static void method1017(int arg0) {
        field2335 = null;
        if (arg0 == 1) {
            field2329 = null;
            field2326 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)[F", line = 361)
    public static final float[] method1018(byte arg0) {
        float var1 = class289.method2039() + class289.method2030();
        field2331++;
        int var2 = class289.method2035();
        float var3 = (float) (var2 >> 16 & 0xFF) / 255.0F;
        class305.field5250[3] = 1.0F;
        if (arg0 != -50) {
            return (float[]) null;
        }
        float var4 = (float) ((var2 & 0xFF59) >> 8) / 255.0F;
        float var5 = 0.58823526F;
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        class305.field5250[2] = class73.field1124[2] * var6 * var5 * var1;
        class305.field5250[0] = class73.field1124[0] * var3 * var5 * var1;
        class305.field5250[1] = class73.field1124[1] * var4 * var5 * var1;
        return class305.field5250;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(BI)Lna;", line = 404)
    public static final class26 method1019(byte arg0, int arg1) {
        field2338++;
        return arg0 == 9 ? class97.method723((byte) -117, false, 10, arg1) : (class26) null;
    }
}
