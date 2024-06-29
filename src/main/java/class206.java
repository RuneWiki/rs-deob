import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class206 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "J")
    public long field3128 = 0L;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
    public static int[] field3130 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public int field3131;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!bn", name = "j", descriptor = "I")
    public int field3137;

    @OriginalMember(owner = "client!bn", name = "k", descriptor = "I")
    public int field3138;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "I")
    public int field3140;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "I")
    public int field3142;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "Lkm;")
    public class162 field3136;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "Lkm;")
    public class162 field3141;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1400(boolean arg0) {
        if (!arg0) {
            field3130 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Llj;ILsi;IIII)V", line = 26)
    public static final void method1401(class289 arg0, int arg1, class264 arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 18 / ((arg6 + 44) / 55);
        field3139++;
        if (arg0 == null) {
            return;
        }
        int var8 = (int) class355.field5628 + class322.field5284 & 0x7FF;
        int var9 = Math.max(arg2.field4223 / 2, arg2.field4236 / 2) + 10;
        int var10 = arg5 * arg5 + (arg3 * arg3);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class272.field4480[var8];
        int var12 = class272.field4470[var8];
        int var13 = var11 * 256 / (class196.field3008 + 256);
        int var14 = var12 * 256 / (class196.field3008 + 256);
        int var15 = arg3 * var13 - arg5 * var14 >> 16;
        int var16 = arg3 * var14 + arg5 * var13 >> 16;
        if (class245.field3886) {
            ((class232) arg0).method1599(arg4 + var16 + (arg2.field4223 / 2) - (arg0.field4805 / 2), -(arg0.field4812 / 2) + -var15 + arg1 - -(arg2.field4236 / 2), (class232) arg2.method1859(-1, false));
        } else {
            ((class137) arg0).method960(arg2.field4223 / 2 + arg4 + var16 - (arg0.field4805 / 2), -var15 - arg0.field4812 / 2 + arg2.field4236 / 2 + arg1, arg2.field4260, arg2.field4338);
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V", line = 73)
    public static final void method1402(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3129++;
        int var6 = arg4 - arg0;
        int var7 = arg2 - arg3;
        if (var7 == 0) {
            if (var6 != 0) {
                class153.method1102(arg1, arg5 ^ 0xFFFFF0B9, arg0, arg3, arg4);
            }
        } else if (var6 == 0) {
            class266.method1878(arg0, arg2, arg3, arg1, (byte) 73);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (arg5 > var6) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg2;
                arg2 = arg4;
                int var10 = arg3;
                arg3 = arg0;
                arg0 = var10;
                arg4 = var9;
            }
            if (arg3 > arg2) {
                int var11 = arg3;
                arg3 = arg2;
                arg2 = var11;
                int var12 = arg0;
                arg0 = arg4;
                arg4 = var12;
            }
            int var13 = arg0;
            int var14 = arg2 - arg3;
            int var15 = arg4 - arg0;
            if (var15 < 0) {
                var15 = -var15;
            }
            int var16 = arg4 <= arg0 ? -1 : 1;
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var18 = arg3; var18 <= arg2; var18++) {
                    var17 += var15;
                    class306.field4998[var18][var13] = arg1;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            } else {
                for (int var19 = arg3; var19 <= arg2; var19++) {
                    var17 += var15;
                    class306.field4998[var13][var19] = arg1;
                    if (var17 > 0) {
                        var17 -= var14;
                        var13 += var16;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 191)
    public static final void method1403(int arg0) {
        field3133++;
        if (arg0 <= 91) {
            return;
        }
        while (true) {
            class238 var1;
            class287 var3;
            do {
                var1 = (class238) class227.field3564.method1080(-1);
                if (var1 == null) {
                    return;
                }
                if (var1.field3765 < 0) {
                    int var2 = -var1.field3765 - 1;
                    if (class102.field1490 == var2) {
                        var3 = class329.field5388;
                    } else {
                        var3 = class130.field1984[var2];
                    }
                } else {
                    int var4 = var1.field3765 - 1;
                    var3 = class329.field5377[var4];
                }
            } while (var3 == null);
            class126 var5 = class165.method1155((byte) 17, var1.field3760);
            if (class120.field1779 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field3761 == 1 || var1.field3761 == 3) {
                var7 = var5.field1929;
                var6 = var5.field1880;
            } else {
                var6 = var5.field1929;
                var7 = var5.field1880;
            }
            int var8 = (var7 >> 1) + var1.field3768;
            int var9 = var1.field3768 + (var7 + 1 >> 1);
            int var10 = var1.field3770 + (var6 >> 1);
            int[][] var11 = class101.field1457[class120.field1779];
            int var12 = (var6 + 1 >> 1) + var1.field3770;
            int var13 = var11[var8][var12] + var11[var9][var10] + var11[var8][var10] + var11[var9][var12] >> 2;
            class162 var14 = null;
            int var15 = class186.field2882[var1.field3758];
            if (var15 == 0) {
                class257 var19 = class216.method1466(class120.field1779, var1.field3768, var1.field3770);
                if (var19 != null) {
                    var14 = var19.field4070;
                }
            } else if (var15 == 1) {
                class206 var18 = class84.method553(class120.field1779, var1.field3768, var1.field3770);
                if (var18 != null) {
                    var14 = var18.field3136;
                }
            } else if (var15 == 2) {
                class258 var16 = class161.method1139(class120.field1779, var1.field3768, var1.field3770);
                if (var16 != null) {
                    var14 = var16.field4071;
                }
            } else if (var15 == 3) {
                class86 var17 = class215.method1458(class120.field1779, var1.field3768, var1.field3770);
                if (var17 != null) {
                    var14 = var17.field1235;
                }
            }
            if (var14 != null) {
                class96.method633(var1.field3770, 0, 0, (byte) -102, -1, var1.field3769 + 1, var15, var1.field3771 + 1, var1.field3768, class120.field1779);
                var3.field4797 = var13;
                var3.field4734 = var1.field3768 * 128 + var7 * 64;
                var3.field4713 = var1.field3770 * 128 + var6 * 64;
                int var20 = var1.field3772;
                var3.field4739 = var14;
                var3.field4698 = class58.field875 + var1.field3771;
                var3.field4766 = class58.field875 + var1.field3769;
                int var21 = var1.field3773;
                int var22 = var1.field3764;
                if (var21 < var20) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                var3.field4744 = var1.field3768 + var20;
                int var24 = var1.field3762;
                if (var24 < var22) {
                    int var25 = var22;
                    var22 = var24;
                    var24 = var25;
                }
                var3.field4791 = var1.field3768 + var21;
                var3.field4770 = var1.field3770 + var24;
                var3.field4730 = var1.field3770 + var22;
            }
        }
    }
}
