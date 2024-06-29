import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class84 extends class205 {

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    private int field1600 = 32768;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "[I")
    public static int[] field1601 = new int[5];

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "Lvd;")
    public static class222 field1605 = class212.method1357("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 10731);

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "Lvd;")
    private static class222 field1614 = class212.method1357("wave:", 10731);

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "Lvd;")
    public static class222 field1615 = field1614;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "Z")
    public static boolean field1604 = false;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "Lvd;")
    public static class222 field1611 = field1614;

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "Lvd;")
    private static class222 field1617 = class212.method1357("Unable to find ", 10731);

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "Lvd;")
    public static class222 field1606 = field1617;

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!hh", name = "X", descriptor = "I")
    public static int field1599;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "[I")
    public static int[] field1608;

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class84() {
        super(3, false);
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)Z")
    public static final boolean method545(int arg0) {
        if (arg0 != 0) {
            field1605 = null;
        }
        ++field1607;
        return ~class59.field1099 != -1 ? true : class18.field435.method1049(false);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (!arg0) {
            class121.method771((byte) 119);
            ++field1610;
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1601 = null;
        field1611 = null;
        field1606 = null;
        if (arg0 > 108) {
            field1608 = null;
            field1614 = null;
            field1605 = null;
            field1615 = null;
            field1617 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(III)V")
    public static final void method547(int arg0, int arg1, int arg2) {
        class121 var3 = class204.field3800[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field2306 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        ++field1599;
        int var4 = -21 % ((arg1 - -47) / 34);
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field3812 = arg0.method662((byte) -116) == 1;
            }
        } else {
            this.field1600 = arg0.method675(2) << 4;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)V")
    public static final void method548(int arg0, int arg1) {
        class87.field1652 = -1;
        class59.field1099 = 1;
        class46.field941 = arg1;
        class174.field3277 = -1;
        ++field1602;
        class40.field884 = null;
        if (arg0 != 19725) {
            field1601 = null;
        }
        class174.field3270 = 0;
        class108.field1995 = false;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method96(int arg0, byte arg1) {
        if (arg1 < 98) {
            field1617 = null;
        }
        ++field1609;
        int[][] var3 = super.field3815.method1003(-8357, arg0);
        if (super.field3815.field3015) {
            int[] var4 = this.method1322(arg0, (byte) 89, 1);
            int[] var5 = this.method1322(arg0, (byte) 65, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; ~class118.field2245 < ~var9; ++var9) {
                int var10 = var5[var9] * this.field1600 >> 12;
                int var11 = var4[var9] * 255 >> 12 & 255;
                int var12 = class8.field135[var11] * var10 >> 12;
                int var13 = class25.field571[var11] * var10 >> 12;
                int var14 = class17.field433 & (var13 >> 12) + arg0;
                int var15 = class159.field3039 & (var12 >> 12) + var9;
                int[][] var16 = this.method1323(0, var14, -5920);
                var6[var9] = var16[0][var15];
                var7[var9] = var16[1][var15];
                var8[var9] = var16[2][var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lff;IIIIII)V")
    public static final void method549(class61 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = class199.field3628;
        int var8 = class199.field3626;
        int var9 = arg0.field1123.length;
        for (int var10 = 0; var10 < var9; ++var10) {
            int var23 = arg0.field1123[var10] - class66.field1239;
            int var24 = arg0.field1139[var10] - class23.field537;
            int var25 = arg0.field1136[var10] - class231.field4336;
            int var26 = arg3 * var25 + arg4 * var23 >> 16;
            int var27 = arg4 * var25 - arg3 * var23 >> 16;
            int var29 = arg2 * var24 - arg1 * var27 >> 16;
            int var30 = arg1 * var24 + arg2 * var27 >> 16;
            if (var30 < 50) {
                return;
            }
            if (arg0.field1134 != null) {
                class61.field1138[var10] = var26;
                class61.field1137[var10] = var29;
                class61.field1128[var10] = var30;
            }
            class61.field1140[var10] = (var26 << 9) / var30 + var7;
            class61.field1122[var10] = (var29 << 9) / var30 + var8;
        }
        class199.field3637 = 0;
        int var11 = arg0.field1132.length;
        for (int var12 = 0; var12 < var11; ++var12) {
            int var13 = arg0.field1132[var12];
            int var14 = arg0.field1130[var12];
            int var15 = arg0.field1142[var12];
            int var16 = class61.field1140[var13];
            int var17 = class61.field1140[var14];
            int var18 = class61.field1140[var15];
            int var19 = class61.field1122[var13];
            int var20 = class61.field1122[var14];
            int var21 = class61.field1122[var15];
            if ((var16 - var17) * (var21 - var20) - (var18 - var17) * (var19 - var20) > 0) {
                if (class130.field2529 && class181.method1137(class52.field1002, class204.field3799, var19, var20, var21, var16, var17, var18)) {
                    class71.field1385 = arg5;
                    class81.field1566 = arg6;
                }
                class199.field3633 = false;
                if (var16 < 0 || var17 < 0 || var18 < 0 || var16 > class199.field3632 || var17 > class199.field3632 || var18 > class199.field3632) {
                    class199.field3633 = true;
                }
                if (arg0.field1134 != null && arg0.field1134[var12] != -1) {
                    if (!class72.field1406) {
                        if (arg0.field1135) {
                            class199.method1257(var19, var20, var21, var16, var17, var18, arg0.field1143[var12], arg0.field1131[var12], arg0.field1125[var12], class61.field1138[0], class61.field1138[1], class61.field1138[3], class61.field1137[0], class61.field1137[1], class61.field1137[3], class61.field1128[0], class61.field1128[1], class61.field1128[3], arg0.field1134[var12]);
                        } else {
                            class199.method1257(var19, var20, var21, var16, var17, var18, arg0.field1143[var12], arg0.field1131[var12], arg0.field1125[var12], class61.field1138[var13], class61.field1138[var14], class61.field1138[var15], class61.field1137[var13], class61.field1137[var14], class61.field1137[var15], class61.field1128[var13], class61.field1128[var14], class61.field1128[var15], arg0.field1134[var12]);
                        }
                    } else {
                        int var22 = class199.field3629.method1180(-11217, arg0.field1134[var12]);
                        class199.method1271(var19, var20, var21, var16, var17, var18, class174.method1100(var22, arg0.field1143[var12]), class174.method1100(var22, arg0.field1131[var12]), class174.method1100(var22, arg0.field1125[var12]));
                    }
                } else if (arg0.field1143[var12] != 12345678) {
                    class199.method1271(var19, var20, var21, var16, var17, var18, arg0.field1143[var12], arg0.field1131[var12], arg0.field1125[var12]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)V")
    public static final void method550(int arg0) {
        ++field1613;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; ~var2 > ~(class172.field3227 + -1); ++var2) {
                if (~class131.field2535[var2] > -1001 && ~class131.field2535[var2 + 1] < -1001) {
                    class222 var3 = class72.field1434[var2];
                    var1 = false;
                    class72.field1434[var2] = class72.field1434[var2 + 1];
                    class72.field1434[var2 - -1] = var3;
                    class222 var4 = class179.field3323[var2];
                    class179.field3323[var2] = class179.field3323[var2 - -1];
                    class179.field3323[var2 + 1] = var4;
                    int var5 = class130.field2525[var2];
                    class130.field2525[var2] = class130.field2525[var2 + 1];
                    class130.field2525[var2 + 1] = var5;
                    int var6 = class209.field3891[var2];
                    class209.field3891[var2] = class209.field3891[var2 - -1];
                    class209.field3891[var2 - -1] = var6;
                    short var7 = class131.field2535[var2];
                    class131.field2535[var2] = class131.field2535[var2 + 1];
                    class131.field2535[var2 + 1] = var7;
                    long var8 = class156.field2978[var2];
                    class156.field2978[var2] = class156.field2978[var2 + 1];
                    class156.field2978[var2 - -1] = var8;
                }
            }
        }
        if (arg0 <= 57) {
            method546(40);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field1616;
        if (arg0 != 0) {
            field1605 = null;
        }
        int[] var3 = super.field3810.method557(6978, arg1);
        if (super.field3810.field1635) {
            int[] var4 = this.method1322(arg1, (byte) 81, 1);
            int[] var5 = this.method1322(arg1, (byte) 99, 2);
            for (int var6 = 0; class118.field2245 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field1600 >> 12;
                int var9 = class8.field135[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class159.field3039;
                int var11 = class25.field571[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class17.field433;
                int[] var13 = this.method1322(var12, (byte) 96, 0);
                var3[var6] = var13[var10];
            }
        }
        return var3;
    }
}
