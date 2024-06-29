import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class44 extends class179 {

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "I")
    private int field826 = 0;

    @OriginalMember(owner = "client!jj", name = "Z", descriptor = "I")
    private int field827 = 4096;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "Lke;")
    public static class256 field820 = class316.method2202("(U1", 27626);

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lmf;")
    public static class174 field819 = new class174(64);

    @OriginalMember(owner = "client!jj", name = "cb", descriptor = "I")
    public static int field830 = 0;

    @OriginalMember(owner = "client!jj", name = "db", descriptor = "Lke;")
    public static class256 field831 = class316.method2202("M-Bmoire en cours d(Wattribution", 27626);

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!jj", name = "ab", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!jj", name = "eb", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!jj", name = "bb", descriptor = "[I")
    public static int[] field829;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(II)V", line = 9)
    public static final void method371(int arg0, int arg1) {
        class91.field1665 = -1;
        int var2 = -48 % ((arg1 + 42) / 41);
        class91.field1665 = -1;
        if (arg0 == 37) {
            class45.field843 = 3.0F;
        } else if (arg0 == 50) {
            class45.field843 = 4.0F;
        } else if (arg0 == 75) {
            class45.field843 = 6.0F;
        } else if (arg0 == 100) {
            class45.field843 = 8.0F;
        } else if (arg0 == 200) {
            class45.field843 = 16.0F;
        }
        field822++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILra;I)V", line = 41)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field825++;
        if (arg0 < 108) {
            this.method55(96, -1);
        }
        if (arg2 == 0) {
            this.field826 = arg1.method346(-16);
        } else if (arg2 == 1) {
            this.field827 = arg1.method346(-16);
        } else if (arg2 == 2) {
            this.field3153 = arg1.method357(false) == 1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)[I", line = 88)
    public final int[] method41(int arg0, int arg1) {
        field828++;
        if (arg1 != -31598) {
            this.method54(-93, (class41) null, 127);
        }
        int[] var3 = this.field3157.method1258(-73, arg0);
        if (this.field3157.field3081) {
            int[] var4 = this.method1312(0, arg0, (byte) 110);
            for (int var5 = 0; var5 < class161.field2858; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field826) {
                    var3[var5] = this.field826;
                } else if (var6 <= this.field827) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field827;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[[I", line = 142)
    public final int[][] method55(int arg0, int arg1) {
        field818++;
        if (arg0 != 75) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, arg0 ^ 0xD5, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                int var12 = var5[var11];
                int var13 = var8[var11];
                int var14 = var6[var11];
                if (this.field826 > var12) {
                    var7[var11] = this.field826;
                } else if (this.field827 < var12) {
                    var7[var11] = this.field827;
                } else {
                    var7[var11] = var12;
                }
                if (this.field826 > var13) {
                    var10[var11] = this.field826;
                } else if (var13 <= this.field827) {
                    var10[var11] = var13;
                } else {
                    var10[var11] = this.field827;
                }
                if (this.field826 > var14) {
                    var9[var11] = this.field826;
                } else if (var14 > this.field827) {
                    var9[var11] = this.field827;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "(I)V", line = 219)
    public static void method372(int arg0) {
        if (arg0 == 2) {
            field820 = null;
            field819 = null;
            field829 = null;
            field831 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 242)
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIIIII)V", line = 271)
    public static final void method373(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var9 = 0; var9 < class301.field5189.field4113; var9++) {
            if (class301.field5189.method1619(arg4 + 29404, var9)) {
                int var10 = class301.field5189.field4119[var9] - class313.field5383;
                int var11 = class154.field2753 + class8.field133 - class301.field5189.field4122[var9] - 1;
                int var12 = class301.field5189.method1622((byte) -112, var9);
                int var13 = arg5 + ((var10 - arg8) * (arg1 - arg5) / (arg3 - arg8));
                int var14 = (arg2 - arg0) * (var11 - arg7) / (arg6 - arg7) + arg0;
                int var15 = 16777215;
                class319 var16 = null;
                if (var12 == 0) {
                    if ((double) class213.field3816 == 3.0D) {
                        var16 = class246.field4199;
                    }
                    if ((double) class213.field3816 == 4.0D) {
                        var16 = class161.field2871;
                    }
                    if ((double) class213.field3816 == 6.0D) {
                        var16 = class279.field4867;
                    }
                    if ((double) class213.field3816 >= 8.0D) {
                        var16 = class37.field661;
                    }
                }
                if (var12 == 1) {
                    if ((double) class213.field3816 == 3.0D) {
                        var16 = class279.field4867;
                    }
                    if ((double) class213.field3816 == 4.0D) {
                        var16 = class37.field661;
                    }
                    if ((double) class213.field3816 == 6.0D) {
                        var16 = class71.field1308;
                    }
                    if ((double) class213.field3816 >= 8.0D) {
                        var16 = class290.field5028;
                    }
                }
                if (var12 == 2) {
                    if ((double) class213.field3816 == 3.0D) {
                        var16 = class71.field1308;
                    }
                    var15 = 16755200;
                    if ((double) class213.field3816 == 4.0D) {
                        var16 = class290.field5028;
                    }
                    if ((double) class213.field3816 == 6.0D) {
                        var16 = class52.field953;
                    }
                    if ((double) class213.field3816 >= 8.0D) {
                        var16 = class215.field3838;
                    }
                }
                if (class301.field5189.field4117[var9] != -1) {
                    var15 = class301.field5189.field4117[var9];
                }
                if (var16 != null) {
                    int var17 = class159.field2838.method2041(class301.field5189.field4124[var9], (int[]) null, class180.field3191);
                    int var18 = var14 - (var17 - 1) * var16.method2224() / 2;
                    int var19 = var18 + var16.method2217() / 2;
                    for (int var20 = 0; var20 < var17; var20++) {
                        class256 var21 = class180.field3191[var20];
                        if (var20 < var17 - 1) {
                            var21.method1775((byte) 104, var21.method1799(arg4 ^ 0xFFFF8D5C) - 4);
                        }
                        var16.method2220(var21, var13, var19, var15, true);
                        var19 += var16.method2224();
                    }
                }
            }
        }
        if (arg4 != -29405) {
            method373(1, 33, -53, 82, -102, -23, 6, -17, -71);
        }
        field824++;
    }
}
