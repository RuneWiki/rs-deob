import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class118 extends class222 {

    @OriginalMember(owner = "client!dj", name = "kb", descriptor = "I")
    private int field2123 = 409;

    @OriginalMember(owner = "client!dj", name = "Z", descriptor = "I")
    private int field2112 = 4096;

    @OriginalMember(owner = "client!dj", name = "W", descriptor = "[I")
    private int[] field2109 = new int[3];

    @OriginalMember(owner = "client!dj", name = "nb", descriptor = "I")
    private int field2126 = 4096;

    @OriginalMember(owner = "client!dj", name = "ob", descriptor = "I")
    private int field2127 = 4096;

    @OriginalMember(owner = "client!dj", name = "ab", descriptor = "I")
    public static int field2113 = 0;

    @OriginalMember(owner = "client!dj", name = "eb", descriptor = "[I")
    public static int[] field2117 = new int[2000];

    @OriginalMember(owner = "client!dj", name = "cb", descriptor = "Lsb;")
    public static class98 field2115 = class47.method368("::fpson", 0);

    @OriginalMember(owner = "client!dj", name = "hb", descriptor = "I")
    public static int field2120 = -1;

    @OriginalMember(owner = "client!dj", name = "Y", descriptor = "Lsb;")
    private static class98 field2111 = class47.method368("slide:", 0);

    @OriginalMember(owner = "client!dj", name = "mb", descriptor = "I")
    public static int field2125 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!dj", name = "fb", descriptor = "Lsb;")
    public static class98 field2118 = class47.method368(" ", 0);

    @OriginalMember(owner = "client!dj", name = "qb", descriptor = "Lsb;")
    public static class98 field2129 = field2111;

    @OriginalMember(owner = "client!dj", name = "jb", descriptor = "Lsb;")
    public static class98 field2122 = field2111;

    @OriginalMember(owner = "client!dj", name = "X", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!dj", name = "bb", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!dj", name = "db", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!dj", name = "gb", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!dj", name = "ib", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!dj", name = "lb", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!dj", name = "pb", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!dj", name = "rb", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "(B)V")
    public static void method877(byte arg0) {
        field2111 = null;
        field2117 = null;
        field2129 = null;
        field2118 = null;
        field2115 = null;
        field2122 = null;
        if (arg0 <= 119) {
            method877((byte) -119);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)[[I")
    public final int[][] method4(int arg0, int arg1) {
        ++field2119;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field3834.method627(4103, arg0);
            if (super.field3834.field1486) {
                int[][] var4 = this.method1531(arg0, 0, arg1 ^ 125);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~var11 > ~class13.field253; ++var11) {
                    int var12 = var5[var11];
                    int var13 = -this.field2109[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (this.field2123 < var13) {
                        var8[var11] = var12;
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    } else {
                        int var14 = var6[var11];
                        int var15 = var14 - this.field2109[1];
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (~this.field2123 > ~var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var7[var11];
                        } else {
                            int var16 = var7[var11];
                            int var17 = var16 - this.field2109[2];
                            if (~var17 > -1) {
                                var17 = -var17;
                            }
                            if (~this.field2123 > ~var17) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field2127 * var12 >> 12;
                                var9[var11] = this.field2112 * var14 >> 12;
                                var10[var11] = this.field2126 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "()V")
    public class118() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        ++field2114;
        if (arg1) {
            method878((class75) null, (class75) null, -103);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method1448(26420);
                            this.field2109[2] = class214.method1427(var5, 255) >> 12;
                            this.field2109[1] = class214.method1427(65280, var5) >> 4;
                            this.field2109[0] = class214.method1427(var5 << 4, 267386880);
                        }
                    } else {
                        this.field2127 = arg0.method1487(98);
                    }
                } else {
                    this.field2112 = arg0.method1487(79);
                }
            } else {
                this.field2126 = arg0.method1487(15);
            }
        } else {
            this.field2123 = arg0.method1487(106);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ltg;Ltg;I)V")
    public static final void method878(class75 arg0, class75 arg1, int arg2) {
        int var3 = -38 / ((arg2 - -60) / 60);
        class41.field668 = arg0;
        class26.field507 = arg1;
        ++field2130;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method879(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field2121;
        if (arg4 <= 82) {
            method877((byte) -64);
        }
        for (int var9 = 0; class31.field552.field4409 > var9; ++var9) {
            int var10 = class31.field552.field4412[var9] + -class51.field830;
            int var11 = (-arg3 + arg0) * (-arg5 + var10) / (arg8 - arg5) + arg3;
            int var12 = -class31.field552.field4403[var9] - -class255.field4470 + -1 + class148.field2743;
            int var13 = class31.field552.method1743(var9, (byte) 115);
            int var14 = arg2 - -((-arg1 + var12) * (-arg2 + arg6) / (-arg1 + arg7));
            int var15 = 16777215;
            class38 var16 = null;
            if (var13 == 0) {
                if ((double) class4.field42 == 3.0D) {
                    var16 = class44.field734;
                }
                if ((double) class4.field42 == 4.0D) {
                    var16 = class115.field2053;
                }
                if ((double) class4.field42 == 6.0D) {
                    var16 = class137.field2415;
                }
                if ((double) class4.field42 == 8.0D) {
                    var16 = class114.field2030;
                }
            }
            if (var13 == 1) {
                if ((double) class4.field42 == 3.0D) {
                    var16 = class137.field2415;
                }
                if ((double) class4.field42 == 4.0D) {
                    var16 = class114.field2030;
                }
                if ((double) class4.field42 == 6.0D) {
                    var16 = class166.field2972;
                }
                if ((double) class4.field42 == 8.0D) {
                    var16 = class60.field1002;
                }
            }
            if (~var13 == -3) {
                if ((double) class4.field42 == 3.0D) {
                    var16 = class166.field2972;
                }
                var15 = 16755200;
                if ((double) class4.field42 == 4.0D) {
                    var16 = class60.field1002;
                }
                if ((double) class4.field42 == 6.0D) {
                    var16 = class183.field3156;
                }
                if ((double) class4.field42 == 8.0D) {
                    var16 = class219.field3767;
                }
            }
            if (~class31.field552.field4405[var9] != 0) {
                var15 = class31.field552.field4405[var9];
            }
            if (var16 != null) {
                class98[] var17 = new class98[1 + class31.field552.field4413[var9].method716(60, true)];
                class134.field2369.method522(class31.field552.field4413[var9], (int[]) null, var17);
                int var18 = var17.length;
                int var19 = var14 - (var18 + -1) * var16.method308() / 2;
                int var20 = var19 + var16.method315() / 2;
                for (int var21 = 0; var21 < var18; ++var21) {
                    class98 var22 = var18 + -1 != var21 ? var17[var21].method742(-95, 0, -4 + var17[var21].method724((byte) 25)) : var17[var21];
                    var16.method312(var22, var11, var20, var15, true);
                    var20 += var16.method308();
                }
            }
        }
    }
}
