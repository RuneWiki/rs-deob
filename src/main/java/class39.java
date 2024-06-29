import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class39 {

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field569 = 0;

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "[Lek;")
    public class166[] field546;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field551 = 0;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "Z")
    public static boolean field565 = false;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "J")
    private long field566;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "Lek;")
    private class166 field563;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "Lek;")
    private class166 field568;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field547;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static final void method278(int arg0) {
        for (class251 var1 = (class251) class127.field2007.method287(arg0 - 15991); var1 != null; var1 = (class251) class127.field2007.method291((byte) -103)) {
            int var2 = var1.field4041;
            if (class53.method394(false, var2)) {
                boolean var3 = true;
                class228[] var4 = class193.field3052[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field3520;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2603;
                    class228 var7 = class84.method596((byte) 35, var6);
                    if (var7 != null) {
                        class82.method591(var7, false);
                    }
                }
            }
        }
        if (arg0 != 15863) {
            field565 = true;
        }
        field548++;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
    public static void method279(int arg0) {
        if (arg0 != 19984) {
            method278(48);
        }
        field547 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z)I")
    public final int method280(boolean arg0) {
        field561++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field552; var3++) {
            class166 var4 = this.field546[var3];
            for (class166 var5 = var4.field2608; var5 != var4; var5 = var5.field2608) {
                var2++;
            }
        }
        if (!arg0) {
            this.method290(-83);
        }
        return var2;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IJLek;)V")
    public final void method281(int arg0, long arg1, class166 arg2) {
        field559++;
        if (arg2.field2602 != null) {
            arg2.method1123(0);
        }
        class166 var5 = this.field546[(int) (arg1 & (long) (this.field552 - arg0))];
        arg2.field2602 = var5.field2602;
        arg2.field2608 = var5;
        arg2.field2603 = arg1;
        arg2.field2602.field2608 = arg2;
        arg2.field2608.field2602 = arg2;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V")
    public static final void method282(int arg0) {
        field560++;
        if (class230.field3654 == null) {
            return;
        }
        if (class275.field4386 < 10) {
            if (!class275.field4382.method1591((byte) -123, class230.field3654.field4139)) {
                class275.field4386 = class4.field22.method1600((byte) -95, class230.field3654.field4139) / 10;
                return;
            }
            class95.method710((byte) 98);
            class275.field4386 = 10;
        }
        if (arg0 != -1) {
            field565 = false;
        }
        if (class275.field4386 == 10) {
            class101.field1697 = class230.field3654.field4133 >> 6 << 6;
            class85.field1431 = (class230.field3654.field4131 >> 6 << 6) + 64 - class101.field1697;
            class164.field2584 = class230.field3654.field4143 >> 6 << 6;
            class191.field2970 = (class230.field3654.field4148 >> 6 << 6) + 64 - class164.field2584;
            int[] var1 = class230.field3654.method1758((class283.field4473.field2240 >> 7) + class46.field656, (class283.field4473.field2278 >> 7) + class260.field4162, (byte) -41, class240.field3892);
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var3 = class164.field2584 + class191.field2970 - var1[2] - 1;
                var2 = var1[1] - class101.field1697;
            }
            if (var2 >= 0 && class85.field1431 > var2 && var3 >= 0 && var3 < class191.field2970) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class293.field4621 = var5;
                class201.field3148 = var4;
            } else if (class94.field1598 == -1 || class200.field3137 == -1) {
                int[] var7 = class230.field3654.method1757(class230.field3654.field4136 & 0x3FFF, (class230.field3654.field4136 & 0xFFFD29D) >> 14, -117);
                class293.field4621 = var7[1] - class101.field1697;
                class201.field3148 = class191.field2970 - (var7[2] - class164.field2584) - 1;
            } else {
                int[] var6 = class230.field3654.method1757(class200.field3137, class94.field1598, -120);
                if (var6 != null) {
                    class201.field3148 = class191.field2970 - (var6[2] - class164.field2584) - 1;
                    class293.field4621 = var6[1] - class101.field1697;
                }
                class200.field3137 = -1;
                class94.field1598 = -1;
            }
            if (class230.field3654.field4149 == 37) {
                class218.field3370 = 3.0F;
                class155.field2412 = 3.0F;
            } else if (class230.field3654.field4149 == 50) {
                class218.field3370 = 4.0F;
                class155.field2412 = 4.0F;
            } else if (class230.field3654.field4149 == 75) {
                class218.field3370 = 6.0F;
                class155.field2412 = 6.0F;
            } else if (class230.field3654.field4149 == 100) {
                class218.field3370 = 8.0F;
                class155.field2412 = 8.0F;
            } else if (class230.field3654.field4149 == 200) {
                class218.field3370 = 16.0F;
                class155.field2412 = 16.0F;
            } else {
                class218.field3370 = 8.0F;
                class155.field2412 = 8.0F;
            }
            class56.method427(54);
            class271.field4358 = new int[class158.field2460 + 1];
            int var8 = class85.field1431 >> 6;
            int var9 = class191.field2970 >> 6;
            class90.field1569 = new int[var8][var9][];
            class272.field4364 = new byte[var8][var9][];
            class48.field690 = new byte[var8][var9][];
            class56.field923 = new int[var8][var9][];
            class187.field2899 = new int[var8][var9][];
            int var10 = class41.field597 >> 2 << 10;
            class106.field1755 = new byte[var8][var9][];
            class30.field454 = new byte[var8][var9][];
            int var11 = class84.field1426 >> 1;
            class267.field4267 = new byte[var8][var9][];
            class40.method298(var11, 117, var10);
            class275.field4386 = 20;
        } else if (class275.field4386 == 20) {
            class197.method1340(174, new class88(class275.field4382.method1595(3, "underlay", class230.field3654.field4139)));
            class275.field4386 = 30;
            class205.method1382(true, (byte) 127);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 30) {
            class26.method208(new class88(class275.field4382.method1595(3, "overlay", class230.field3654.field4139)), 8);
            class275.field4386 = 40;
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 40) {
            class112.method791((byte) -120, new class88(class275.field4382.method1595(3, "overlay2", class230.field3654.field4139)));
            class275.field4386 = 50;
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 50) {
            class141.method952(new class88(class275.field4382.method1595(3, "loc", class230.field3654.field4139)), (byte) 70);
            class275.field4386 = 60;
            class205.method1382(true, (byte) 127);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 60) {
            if (class275.field4382.method1604(-17743, class230.field3654.field4139 + "_labels")) {
                if (!class275.field4382.method1591((byte) -123, class230.field3654.field4139 + "_labels")) {
                    return;
                }
                class93.field1596 = class24.method203(class230.field3654.field4139 + "_labels", 0, class275.field4382);
            } else {
                class93.field1596 = new class208(0);
            }
            class275.field4386 = 70;
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 70) {
            class206.field3215 = new class21(11, true, class230.field3651);
            class275.field4386 = 73;
            class205.method1382(true, (byte) 127);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 73) {
            class209.field3259 = new class21(12, true, class230.field3651);
            class275.field4386 = 76;
            class205.method1382(true, (byte) 125);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 76) {
            class256.field4096 = new class21(14, true, class230.field3651);
            class275.field4386 = 79;
            class205.method1382(true, (byte) 127);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 79) {
            class25.field334 = new class21(17, true, class230.field3651);
            class275.field4386 = 82;
            class205.method1382(true, (byte) 126);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 82) {
            class267.field4258 = new class21(19, true, class230.field3651);
            class275.field4386 = 85;
            class205.method1382(true, (byte) 126);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 85) {
            class30.field456 = new class21(22, true, class230.field3651);
            class275.field4386 = 88;
            class205.method1382(true, (byte) 126);
            class272.method1837((byte) 4);
        } else if (class275.field4386 == 88) {
            class201.field3149 = new class21(26, true, class230.field3651);
            class275.field4386 = 91;
            class205.method1382(true, (byte) 127);
            class272.method1837((byte) 4);
        } else {
            class47.field686 = new class21(30, true, class230.field3651);
            class275.field4386 = 100;
            class205.method1382(true, (byte) 125);
            class272.method1837((byte) 4);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)V")
    public static final void method283(int arg0, boolean arg1) {
        field555++;
        if (arg0 != 25) {
            method282(-84);
        }
        class295.field4663 = arg1;
        if (!class295.field4663) {
            int var2 = class236.field3814.method633(arg0 ^ 0x51);
            boolean var3 = class160.method1077(class236.field3814.method653(false), arg0 ^ 0xFFFFFFE6);
            int var4 = class236.field3814.method645(11596);
            int var5 = class236.field3814.method679((byte) -38);
            int var6 = (class53.field804 - class236.field3814.field1535) / 16;
            class143.field2195 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class143.field2195[var7][var15] = class236.field3814.method652(90);
                }
            }
            int var8 = class236.field3814.method645(11596);
            boolean var9 = false;
            int var10 = class236.field3814.method670(-2);
            class249.field4024 = new byte[var6][];
            class90.field1573 = new byte[var6][];
            if (((var10 / 8) == 48 || var10 / 8 == 49) && (var5 / 8) == 48) {
                var9 = true;
            }
            if ((var10 / 8) == 48 && var5 / 8 == 148) {
                var9 = true;
            }
            class228.field3519 = new int[var6];
            class230.field3653 = new int[var6];
            class200.field3139 = null;
            class292.field4592 = new int[var6];
            class240.field3893 = new int[var6];
            class161.field2528 = new int[var6];
            class15.field233 = null;
            int var11 = 0;
            for (int var12 = (var10 - 6) / 8; var12 <= ((var10 + 6) / 8); var12++) {
                for (int var13 = (var5 - 6) / 8; var13 <= (var5 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var9 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class230.field3653[var11] = var14;
                        class292.field4592[var11] = -1;
                        class240.field3893[var11] = -1;
                        class161.field2528[var11] = -1;
                        class228.field3519[var11] = -1;
                    } else {
                        class230.field3653[var11] = var14;
                        class292.field4592[var11] = class17.field252.method1603(class87.method619(arg0, -108), "m" + var12 + "_" + var13);
                        class240.field3893[var11] = class17.field252.method1603(-116, "l" + var12 + "_" + var13);
                        class161.field2528[var11] = class17.field252.method1603(class87.method619(arg0, -110), "um" + var12 + "_" + var13);
                        class228.field3519[var11] = class17.field252.method1603(class87.method619(arg0, -104), "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class30.method238(var10, var8, var5, var3, false, -1592, var2, var4);
            return;
        }
        int var16 = class236.field3814.method653(false);
        class236.field3814.method537(false);
        for (int var17 = 0; var17 < 4; var17++) {
            for (int var37 = 0; var37 < 13; var37++) {
                for (int var38 = 0; var38 < 13; var38++) {
                    int var39 = class236.field3814.method535(1, arg0 ^ 0x71);
                    if (var39 == 1) {
                        class33.field500[var17][var37][var38] = class236.field3814.method535(26, 104);
                    } else {
                        class33.field500[var17][var37][var38] = -1;
                    }
                }
            }
        }
        class236.field3814.method538(9721);
        int var18 = (class53.field804 - class236.field3814.field1535) / 16;
        class143.field2195 = new int[var18][4];
        for (int var19 = 0; var19 < var18; var19++) {
            for (int var36 = 0; var36 < 4; var36++) {
                class143.field2195[var19][var36] = class236.field3814.method641(-1);
            }
        }
        int var20 = class236.field3814.method677((byte) -100);
        int var21 = class236.field3814.method670(-2);
        boolean var22 = class160.method1077(class236.field3814.method627(38), arg0 - 26);
        int var23 = class236.field3814.method645(arg0 ^ 0x2D55);
        int var24 = class236.field3814.method677((byte) -100);
        class249.field4024 = new byte[var18][];
        class15.field233 = null;
        class292.field4592 = new int[var18];
        class240.field3893 = new int[var18];
        class90.field1573 = new byte[var18][];
        class200.field3139 = null;
        class230.field3653 = new int[var18];
        class161.field2528 = new int[var18];
        class228.field3519 = new int[var18];
        int var25 = 0;
        for (int var26 = 0; var26 < 4; var26++) {
            for (int var27 = 0; var27 < 13; var27++) {
                for (int var28 = 0; var28 < 13; var28++) {
                    int var29 = class33.field500[var26][var27][var28];
                    if (var29 != -1) {
                        int var30 = var29 >> 3 & 0x7FF;
                        int var31 = (var29 & 0xFFCFE2) >> 14;
                        int var32 = (var31 / 8 << 8) + var30 / 8;
                        for (int var33 = 0; var33 < var25; var33++) {
                            if (class230.field3653[var33] == var32) {
                                var32 = -1;
                                break;
                            }
                        }
                        if (var32 != -1) {
                            class230.field3653[var25] = var32;
                            int var34 = (var32 & 0xFF41) >> 8;
                            int var35 = var32 & 0xFF;
                            class292.field4592[var25] = class17.field252.method1603(-121, "m" + var34 + "_" + var35);
                            class240.field3893[var25] = class17.field252.method1603(class87.method619(arg0, -120), "l" + var34 + "_" + var35);
                            class161.field2528[var25] = class17.field252.method1603(class87.method619(arg0, -112), "um" + var34 + "_" + var35);
                            class228.field3519[var25] = class17.field252.method1603(-120, "ul" + var34 + "_" + var35);
                            var25++;
                        }
                    }
                }
            }
        }
        class30.method238(var24, var23, var21, var22, false, -1592, var16, var20);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)I")
    public final int method284(byte arg0) {
        if (arg0 >= -107) {
            field557 = 95;
        }
        field549++;
        return this.field552;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(JI)Lek;")
    public final class166 method285(long arg0, int arg1) {
        field562++;
        this.field566 = arg0;
        if (arg1 != 13821) {
            return null;
        }
        class166 var4 = this.field546[(int) (arg0 & (long) (this.field552 - 1))];
        for (this.field563 = var4.field2608; this.field563 != var4; this.field563 = this.field563.field2608) {
            if (this.field563.field2603 == arg0) {
                class166 var5 = this.field563;
                this.field563 = this.field563.field2608;
                return var5;
            }
        }
        this.field563 = null;
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIILhc;)[Ljb;")
    public static final class276[] method286(int arg0, int arg1, int arg2, class235 arg3) {
        field554++;
        if (class212.method1440(arg1, arg3, arg2, 41)) {
            if (arg0 != 268423837) {
                field565 = false;
            }
            return class104.method752((byte) 85);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Lek;")
    public final class166 method287(int arg0) {
        field567++;
        if (arg0 >= -122) {
            return null;
        } else {
            this.field569 = 0;
            return this.method291((byte) -109);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method288(Component arg0, int arg1) {
        arg0.removeKeyListener(class254.field4065);
        field545++;
        arg0.removeFocusListener(class254.field4065);
        class196.field3097 = arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method289(boolean arg0, String arg1) throws ClassNotFoundException {
        field558++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else {
            if (arg0) {
                field547 = null;
            }
            if (arg1.equals("J")) {
                return Long.TYPE;
            } else if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V")
    public final void method290(int arg0) {
        if (arg0 != -7981) {
            method282(-112);
        }
        for (int var2 = 0; var2 < this.field552; var2++) {
            class166 var3 = this.field546[var2];
            while (true) {
                class166 var4 = var3.field2608;
                if (var3 == var4) {
                    break;
                }
                var4.method1123(0);
            }
        }
        this.field568 = null;
        this.field563 = null;
        field550++;
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)Lek;")
    public final class166 method291(byte arg0) {
        if (arg0 > -33) {
            method288((Component) null, -12);
        }
        field556++;
        if (this.field569 > 0 && this.field546[this.field569 - 1] != this.field568) {
            class166 var2 = this.field568;
            this.field568 = var2.field2608;
            return var2;
        }
        while (this.field552 > this.field569) {
            class166 var3 = this.field546[this.field569++].field2608;
            if (this.field546[this.field569 - 1] != var3) {
                this.field568 = var3.field2608;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(I)V")
    public class39(int arg0) {
        this.field552 = arg0;
        this.field546 = new class166[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class166 var3 = this.field546[var2] = new class166();
            var3.field2608 = var3;
            var3.field2602 = var3;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLre;II)V")
    public static final void method292(byte arg0, class228 arg1, int arg2, int arg3) {
        if (arg1.field3541 == 1) {
            class117.method825(-1, -1, arg1.field3626, arg1.field3480, 0L, (short) 14, "", 0);
            class118.field1907++;
        }
        if (arg1.field3541 == 2 && !class122.field1960) {
            String var4 = class284.method1910(arg1, 0);
            if (var4 != null) {
                class117.method825(-1, -1, var4, arg1.field3480, 0L, (short) 40, "<col=00ff00>" + arg1.field3560, -1);
                class77.field1261++;
            }
        }
        int var5 = 60 / ((5 - arg0) / 51);
        field553++;
        if (arg1.field3541 == 3) {
            class288.field4563++;
            class117.method825(-1, -1, class181.field2825, arg1.field3480, 0L, (short) 4, "", 0);
        }
        if (arg1.field3541 == 4) {
            class117.method825(-1, -1, arg1.field3626, arg1.field3480, 0L, (short) 38, "", 0);
            class203.field3173++;
        }
        if (arg1.field3541 == 5) {
            class117.method825(-1, -1, arg1.field3626, arg1.field3480, 0L, (short) 32, "", 0);
            class109.field1788++;
        }
        if (arg1.field3541 == 6 && class184.field2847 == null) {
            class244.field3969++;
            class117.method825(-1, -1, arg1.field3626, arg1.field3480, 0L, (short) 41, "", -1);
        }
        if (arg1.field3477 == 2) {
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.field3485; var7++) {
                for (int var8 = 0; var8 < arg1.field3464; var8++) {
                    int var9 = (arg1.field3547 + 32) * var8;
                    int var10 = (arg1.field3601 + 32) * var7;
                    if (var6 < 20) {
                        var9 += arg1.field3545[var6];
                        var10 += arg1.field3628[var6];
                    }
                    if (var9 <= arg2 && var10 <= arg3 && var9 + 32 > arg2 && arg3 < (var10 + 32)) {
                        class146.field2321 = arg1;
                        class113.field1843 = var6;
                        if (arg1.field3604[var6] > 0) {
                            class271 var11 = client.method1059(arg1);
                            class72 var12 = class85.method602(false, arg1.field3604[var6] - 1);
                            if (class73.field1227 == 1 && var11.method1836(28110)) {
                                if (class81.field1350 != arg1.field3480 || class265.field4223 != var6) {
                                    class117.method825(-1, -1, class137.field2109, arg1.field3480, (long) var12.field1203, (short) 36, class243.field3951 + " -> <col=ff9040>" + var12.field1176, var6);
                                    class161.field2518++;
                                }
                            } else if (class122.field1960 && var11.method1836(28110)) {
                                class200 var13 = class4.field31 == -1 ? null : class250.method1716(class4.field31, (byte) -113);
                                if ((class170.field2644 & 0x10) != 0 && (var13 == null || var12.method516(0, class4.field31, var13.field3132) != var13.field3132)) {
                                    class117.method825(class258.field4123, -1, class37.field518, arg1.field3480, (long) var12.field1203, (short) 3, class190.field2950 + " -> <col=ff9040>" + var12.field1176, var6);
                                    class83.field1394++;
                                }
                            } else {
                                class180.field2799++;
                                String[] var14 = var12.field1195;
                                if (class165.field2589) {
                                    var14 = class100.method730(0, var14);
                                }
                                if (var11.method1836(28110)) {
                                    for (int var15 = 4; var15 >= 3; var15--) {
                                        if (var14 != null && var14[var15] != null) {
                                            class2.field13++;
                                            byte var16;
                                            if (var15 == 3) {
                                                var16 = 26;
                                            } else {
                                                var16 = 43;
                                            }
                                            class117.method825(-1, -1, var14[var15], arg1.field3480, (long) var12.field1203, var16, "<col=ff9040>" + var12.field1176, var6);
                                        }
                                    }
                                }
                                if (var11.method1834((byte) 2)) {
                                    class50.field743++;
                                    class117.method825(class140.field2139, -1, class137.field2109, arg1.field3480, (long) var12.field1203, (short) 20, "<col=ff9040>" + var12.field1176, var6);
                                }
                                if (var11.method1836(28110) && var14 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var14[var17] != null) {
                                            class239.field3883++;
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 37;
                                            }
                                            if (var17 == 1) {
                                                var18 = 10;
                                            }
                                            if (var17 == 2) {
                                                var18 = 44;
                                            }
                                            class117.method825(-1, -1, var14[var17], arg1.field3480, (long) var12.field1203, var18, "<col=ff9040>" + var12.field1176, var6);
                                        }
                                    }
                                }
                                String[] var19 = arg1.field3543;
                                if (class165.field2589) {
                                    var19 = class100.method730(0, var19);
                                }
                                if (var19 != null) {
                                    for (int var20 = 4; var20 >= 0; var20--) {
                                        if (var19[var20] != null) {
                                            client.field2431++;
                                            byte var21 = 0;
                                            if (var20 == 0) {
                                                var21 = 13;
                                            }
                                            if (var20 == 1) {
                                                var21 = 25;
                                            }
                                            if (var20 == 2) {
                                                var21 = 48;
                                            }
                                            if (var20 == 3) {
                                                var21 = 5;
                                            }
                                            if (var20 == 4) {
                                                var21 = 49;
                                            }
                                            class117.method825(-1, -1, var19[var20], arg1.field3480, (long) var12.field1203, var21, "<col=ff9040>" + var12.field1176, var6);
                                        }
                                    }
                                }
                                class117.method825(class34.field504, -1, class113.field1851, arg1.field3480, (long) var12.field1203, (short) 1005, "<col=ff9040>" + var12.field1176, var6);
                            }
                        }
                    }
                    var6++;
                }
            }
        }
        if (!arg1.field3520) {
            return;
        }
        if (!class122.field1960) {
            for (int var22 = 9; var22 >= 5; var22--) {
                String var26 = class30.method234((byte) -122, arg1, var22);
                if (var26 != null) {
                    class236.field3808++;
                    class117.method825(class283.method1901(28785, arg1, var22), -1, var26, arg1.field3480, (long) (var22 + 1), (short) 1006, arg1.field3592, arg1.field3551);
                }
            }
            String var23 = class284.method1910(arg1, 0);
            if (var23 != null) {
                class77.field1261++;
                class117.method825(-1, -1, var23, arg1.field3480, 0L, (short) 40, arg1.field3592, arg1.field3551);
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class30.method234((byte) -71, arg1, var24);
                if (var25 != null) {
                    class236.field3808++;
                    class117.method825(class283.method1901(28785, arg1, var24), -1, var25, arg1.field3480, (long) (var24 + 1), (short) 22, arg1.field3592, arg1.field3551);
                }
            }
            if (!client.method1059(arg1).method1825(1)) {
                return;
            }
            class244.field3969++;
            if (arg1.field3567 == null) {
                class117.method825(-1, -1, class196.field3096, arg1.field3480, 0L, (short) 41, "", arg1.field3551);
                return;
            }
            class117.method825(-1, -1, arg1.field3567, arg1.field3480, 0L, (short) 41, "", arg1.field3551);
        } else if (client.method1059(arg1).method1826(false) && (class170.field2644 & 0x20) != 0) {
            class291.field4586++;
            class117.method825(class258.field4123, -1, class37.field518, arg1.field3480, 0L, (short) 19, class190.field2950 + " -> " + arg1.field3592, arg1.field3551);
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)Lek;")
    public final class166 method293(byte arg0) {
        field544++;
        if (this.field563 == null) {
            return null;
        } else if (arg0 > -38) {
            return null;
        } else {
            class166 var2 = this.field546[(int) (this.field566 & (long) (this.field552 - 1))];
            while (this.field563 != var2) {
                if (this.field563.field2603 == this.field566) {
                    class166 var3 = this.field563;
                    this.field563 = this.field563.field2608;
                    return var3;
                }
                this.field563 = this.field563.field2608;
            }
            this.field563 = null;
            return null;
        }
    }
}
