import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class48 implements class96 {

    @OriginalMember(owner = "client!qga", name = "h", descriptor = "Lut;")
    private class664 field703 = new class664(256);

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "Lkha;")
    private class687 field698;

    @OriginalMember(owner = "client!qga", name = "l", descriptor = "Lkha;")
    private class687 field707;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    private int field696;

    @OriginalMember(owner = "client!qga", name = "s", descriptor = "[Lje;")
    private class91[] field714;

    @OriginalMember(owner = "client!qga", name = "g", descriptor = "I")
    public static int field702 = 0;

    @OriginalMember(owner = "client!qga", name = "o", descriptor = "Lus;")
    public static class328 field710 = new class328(28, 3);

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!qga", name = "i", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!qga", name = "j", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!qga", name = "m", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!qga", name = "p", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!qga", name = "q", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!qga", name = "r", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!qga", name = "n", descriptor = "Z")
    public static boolean field709;

    @OriginalMember(owner = "client!qga", name = "k", descriptor = "[Lac;")
    public static class712[] field706;

    @OriginalMember(owner = "client!qga", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field701;

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(B)Z")
    public static final boolean method388(byte arg0) {
        field705++;
        try {
            if (class244.field3142 == 2) {
                if (class188.field2470 == null) {
                    class188.field2470 = class624.method3413(class379.field5303, class98.field1225, class130.field1562);
                    if (class188.field2470 == null) {
                        return false;
                    }
                }
                if (class376.field5262 == null) {
                    class376.field5262 = new class680(class214.field2715, class154.field1871);
                }
                class681 var1 = class106.field1297;
                if (class55.field799 != null) {
                    var1 = class55.field799;
                }
                if (var1.method3690(22050, class224.field2965, class376.field5262, 5419, class188.field2470)) {
                    class106.field1297 = var1;
                    class106.field1297.method3689(false);
                    if (class189.field2478 <= 0) {
                        class244.field3142 = 0;
                        class106.field1297.method3695(class74.field991, 0);
                        for (int var2 = 0; var2 < class551.field7752.length; var2++) {
                            class106.field1297.method3673(var2, (byte) 92, class551.field7752[var2]);
                            class551.field7752[var2] = 255;
                        }
                    } else {
                        class244.field3142 = 3;
                        class106.field1297.method3695(class189.field2478 > class74.field991 ? class74.field991 : class189.field2478, 0);
                        for (int var3 = 0; var3 < class551.field7752.length; var3++) {
                            class106.field1297.method3673(var3, (byte) 92, class551.field7752[var3]);
                            class551.field7752[var3] = 255;
                        }
                    }
                    if (class55.field799 == null) {
                        if (class669.field9155 <= 0L) {
                            class106.field1297.method3683(class188.field2470, class646.field8905, (byte) 91);
                        } else {
                            class106.field1297.method3684(class646.field8905, class188.field2470, true, class669.field9155, 26821);
                        }
                    }
                    if (class274.field3469 != null) {
                        class274.field3469.method1281(28305, class106.field1297);
                    }
                    class669.field9155 = 0L;
                    class188.field2470 = null;
                    class379.field5303 = null;
                    class55.field799 = null;
                    class376.field5262 = null;
                    return true;
                }
            }
            if (arg0 != 70) {
                method388((byte) -47);
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class106.field1297.method3675(5194);
            class55.field799 = null;
            class244.field3142 = 0;
            class379.field5303 = null;
            class188.field2470 = null;
            class376.field5262 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(II)Lje;")
    public final class91 method389(int arg0, int arg1) {
        field708++;
        return arg0 == 9559 ? this.field714[arg1] : null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(II)Z")
    public final boolean method390(int arg0, int arg1) {
        field697++;
        class86 var3 = this.method394(false, arg0);
        if (arg1 == -9396) {
            return var3 != null && var3.method603((byte) -98, this, this.field707);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)I")
    public final int method391(byte arg0) {
        int var2 = -26 / ((arg0 + 18) / 59);
        field699++;
        return this.field696;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)V")
    public static final void method392(int arg0) {
        field713++;
        if (class223.field2944.field588.method329((byte) -120) != 2) {
            return;
        }
        byte var1 = (byte) (class710.field9990 - 4 & 0xFF);
        int var2 = class710.field9990 % class613.field8591;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class1.field3; var18++) {
                class406.field5734[var3][var2][var18] = var1;
            }
        }
        if (class223.field2946 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class264.field3346[var4] = -1000000;
            class733.field10243[var4] = 1000000;
            class495.field6999[var4] = 0;
            class751.field10506[var4] = 1000000;
            class613.field8589[var4] = 0;
        }
        int var5 = class339.field4374.field5790;
        if (arg0 != 1879718697) {
            return;
        }
        int var6 = class339.field4374.field5784;
        if (class276.field3497 != 1 && class147.field1783 == -1) {
            int var7 = class592.method3287(false, class407.field5744, class223.field2946, class505.field7134);
            if ((var7 - class524.field7412) < 3200 && (class215.field2728[class223.field2946][class505.field7134 >> 9][class407.field5744 >> 9] & 0x4) != 0) {
                class304.method1794(1, -119, false, class407.field5744 >> 9, class505.field7134 >> 9, class495.field7002);
                return;
            }
            return;
        }
        if (class276.field3497 != 1) {
            var5 = class147.field1783;
            var6 = class335.field4311;
        }
        if ((class215.field2728[class223.field2946][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class304.method1794(0, 62, false, var6 >> 9, var5 >> 9, class495.field7002);
        }
        if (class411.field5801 >= 2560) {
            return;
        }
        int var8 = class505.field7134 >> 9;
        int var9 = class407.field5744 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        if (var12 == 0 && var13 == 0 || var12 <= (-class613.field8591) || var12 >= class613.field8591 || (-class1.field3) >= var13 || class1.field3 <= var13) {
            class486.method2844((byte) -1, "RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class63.field851 + "," + class753.field10509, null);
            return;
        }
        if (var12 <= var13) {
            int var14 = var12 * 65536 / var13;
            int var15 = 32768;
            while (var9 != var11) {
                if (var11 > var9) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                if ((class215.field2728[class223.field2946][var8][var9] & 0x4) != 0) {
                    class304.method1794(1, arg0 - 1879718820, false, var9, var8, class495.field7002);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    if (var10 > var8) {
                        var8++;
                    } else if (var8 > var10) {
                        var8--;
                    }
                    var15 -= 65536;
                    if ((class215.field2728[class223.field2946][var8][var9] & 0x4) != 0) {
                        class304.method1794(1, -114, false, var9, var8, class495.field7002);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var13 * 65536 / var12;
        int var17 = 32768;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var8 > var10) {
                var8--;
            }
            if ((class215.field2728[class223.field2946][var8][var9] & 0x4) != 0) {
                class304.method1794(1, arg0 - 1879718574, false, var9, var8, class495.field7002);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                if (var9 < var11) {
                    var9++;
                } else if (var11 < var9) {
                    var9--;
                }
                var17 -= 65536;
                if ((class215.field2728[class223.field2946][var8][var9] & 0x4) != 0) {
                    class304.method1794(1, arg0 - 1879718819, false, var9, var8, class495.field7002);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IIIFZI)[F")
    public final float[] method393(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        if (arg0 != -22704) {
            field709 = true;
        }
        field711++;
        return this.method394(false, arg2).method605(this, arg5, true, arg1, this.field707, this.field714[arg2].field1150);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZI)Lkt;")
    private final class86 method394(boolean arg0, int arg1) {
        field712++;
        class623 var3 = this.field703.method3597((long) arg1, 2087);
        if (var3 != null) {
            return (class86) var3;
        }
        byte[] var4 = this.field698.method3836(arg1, true);
        if (var4 == null) {
            return null;
        }
        if (arg0) {
            method396(33);
        }
        class86 var5 = new class86(new class179(var4));
        this.field703.method3599(var5, 100, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(ZFIIII)[I")
    public final int[] method395(boolean arg0, float arg1, int arg2, int arg3, int arg4, int arg5) {
        field700++;
        return arg4 == -11288 ? this.method394(false, arg3).method604(arg0, this.field714[arg3].field1150, arg2, (byte) 40, this, this.field707, arg5, (double) arg1) : null;
    }

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "(I)V")
    public static void method396(int arg0) {
        field701 = null;
        if (arg0 != 25497) {
            field710 = null;
        }
        field706 = null;
        field710 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IFIIIZ)[I")
    public final int[] method397(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field704++;
        if (arg2 != 13049) {
            this.method395(false, -1.0800056F, 122, 121, -16, 80);
        }
        return this.method394(false, arg0).method601(this.field714[arg0].field1150, 2, arg4, this, (double) arg1, arg3, this.field707);
    }

    @OriginalMember(owner = "client!qga", name = "<init>", descriptor = "(Lkha;Lkha;Lkha;)V")
    public class48(class687 arg0, class687 arg1, class687 arg2) {
        this.field698 = arg1;
        this.field707 = arg2;
        class179 var4 = new class179(arg0.method3810(0, -23360, 0));
        this.field696 = var4.method1107(false);
        this.field714 = new class91[this.field696];
        for (int var5 = 0; var5 < this.field696; var5++) {
            if (var4.method1094(255) == 1) {
                this.field714[var5] = new class91();
            }
        }
        for (int var6 = 0; var6 < this.field696; var6++) {
            if (this.field714[var6] != null) {
                this.field714[var6].field1167 = var4.method1094(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field696; var7++) {
            if (this.field714[var7] != null) {
                this.field714[var7].field1159 = var4.method1094(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field696; var8++) {
            if (this.field714[var8] != null) {
                this.field714[var8].field1164 = var4.method1094(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field696; var9++) {
            if (this.field714[var9] != null) {
                this.field714[var9].field1166 = var4.method1133(8);
            }
        }
        for (int var10 = 0; var10 < this.field696; var10++) {
            if (this.field714[var10] != null) {
                this.field714[var10].field1156 = var4.method1133(8);
            }
        }
        for (int var11 = 0; var11 < this.field696; var11++) {
            if (this.field714[var11] != null) {
                this.field714[var11].field1149 = var4.method1133(8);
            }
        }
        for (int var12 = 0; var12 < this.field696; var12++) {
            if (this.field714[var12] != null) {
                this.field714[var12].field1160 = var4.method1133(8);
            }
        }
        for (int var13 = 0; var13 < this.field696; var13++) {
            if (this.field714[var13] != null) {
                this.field714[var13].field1151 = (short) var4.method1107(false);
            }
        }
        for (int var14 = 0; var14 < this.field696; var14++) {
            if (this.field714[var14] != null) {
                this.field714[var14].field1148 = var4.method1133(8);
            }
        }
        for (int var15 = 0; var15 < this.field696; var15++) {
            if (this.field714[var15] != null) {
                this.field714[var15].field1161 = var4.method1133(8);
            }
        }
        for (int var16 = 0; var16 < this.field696; var16++) {
            if (this.field714[var16] != null) {
                this.field714[var16].field1158 = var4.method1094(255) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field696; var17++) {
            if (this.field714[var17] != null) {
                this.field714[var17].field1150 = var4.method1094(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field696; var18++) {
            if (this.field714[var18] != null) {
                this.field714[var18].field1153 = var4.method1133(8);
            }
        }
        for (int var19 = 0; var19 < this.field696; var19++) {
            if (this.field714[var19] != null) {
                this.field714[var19].field1157 = var4.method1094(255) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field696; var20++) {
            if (this.field714[var20] != null) {
                this.field714[var20].field1162 = var4.method1094(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field696; var21++) {
            if (this.field714[var21] != null) {
                this.field714[var21].field1168 = var4.method1094(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field696; var22++) {
            if (this.field714[var22] != null) {
                this.field714[var22].field1154 = var4.method1094(255);
            }
        }
        for (int var23 = 0; var23 < this.field696; var23++) {
            if (this.field714[var23] != null) {
                this.field714[var23].field1163 = var4.method1095((byte) 119);
            }
        }
        for (int var24 = 0; var24 < this.field696; var24++) {
            if (this.field714[var24] != null) {
                this.field714[var24].field1165 = var4.method1094(255);
            }
        }
    }
}
