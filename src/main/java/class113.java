import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class113 extends class283 {

    @OriginalMember(owner = "client!ke", name = "V", descriptor = "I")
    private int field1782 = 32768;

    @OriginalMember(owner = "client!ke", name = "U", descriptor = "I")
    public static int field1781 = 0;

    @OriginalMember(owner = "client!ke", name = "T", descriptor = "[[I")
    public static int[][] field1780 = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!ke", name = "Y", descriptor = "[I")
    public static int[] field1785 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ke", name = "P", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ke", name = "Q", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!ke", name = "S", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!ke", name = "W", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!ke", name = "X", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ke", name = "Z", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ke", name = "ab", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ke", name = "bb", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ke", name = "R", descriptor = "Lve;")
    public static class266 field1778;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZLwk;Z)V", line = 9)
    public static final void method786(boolean arg0, class174 arg1, boolean arg2) {
        field1779++;
        int var3 = (int) arg1.field2293;
        if (arg2) {
            method790(25);
        }
        int var4 = arg1.field2721;
        arg1.method1006(-1024);
        if (arg0) {
            class177.method1224((byte) 79, var4);
        }
        class51.method376((byte) 83, var4);
        class297 var5 = class178.method1226((byte) 109, var3);
        if (var5 != null) {
            class318.method2209(107, var5);
        }
        int var6 = class126.field1955;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class9.method55(class142.field2178[var7], 121)) {
                class186.method1271(1, var7);
            }
        }
        if (class126.field1955 == 1) {
            class11.field153 = false;
            class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
        } else {
            class222.method1486(class150.field2342, class66.field1034, (byte) -40, class315.field5395, class118.field1861);
            int var8 = class89.field1474.method1199(class196.field3046);
            for (int var9 = 0; var9 < class126.field1955; var9++) {
                int var10 = class89.field1474.method1199(class82.method641(var9, true));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class118.field1861 = class126.field1955 * 15 + (class266.field4385 ? 26 : 22);
            class66.field1034 = var8 + 8;
        }
        if (class250.field4095 != -1) {
            class294.method2063(115, 1, class250.field4095);
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(III)V", line = 82)
    public static final void method787(int arg0, int arg1, int arg2) {
        field1776++;
        class120 var3 = class293.method2059(4, arg2, arg0);
        var3.method833((byte) 33);
        var3.field1877 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V", line = 92)
    public class113() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)[[I", line = 103)
    public final int[][] method3(int arg0, int arg1) {
        field1788++;
        if (arg0 != -1) {
            field1778 = (class266) null;
        }
        int[][] var3 = this.field4719.method2182((byte) 4, arg1);
        if (this.field4719.field5381) {
            int[] var4 = this.method1990(1, arg1, 32755);
            int[] var5 = this.method1990(2, arg1, 32755);
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class101.field1632; var9++) {
                int var10 = (var4[var9] * 255 & 0xFF6F3) >> 12;
                int var11 = var5[var9] * this.field1782 >> 12;
                int var12 = class36.field586[var10] * var11 >> 12;
                int var13 = class74.field1143[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class236.field3783;
                int var15 = class210.field3268 & arg1 + (var13 >> 12);
                int[][] var16 = this.method1994(var15, 0, (byte) -117);
                var8[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var6[var9] = var16[2][var14];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IB)[I", line = 167)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -89 / ((30 - arg1) / 36);
        field1777++;
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int[] var5 = this.method1990(1, arg0, 32755);
            int[] var6 = this.method1990(2, arg0, 32755);
            for (int var7 = 0; var7 < class101.field1632; var7++) {
                int var8 = var6[var7] * this.field1782 >> 12;
                int var9 = (var5[var7] & 0xFF7) >> 4;
                int var10 = class36.field586[var9] * var8 >> 12;
                int var11 = class74.field1143[var9] * var8 >> 12;
                int var12 = class236.field3783 & (var10 >> 12) + var7;
                int var13 = class210.field3268 & (var11 >> 12) + arg0;
                int[] var14 = this.method1990(0, var13, 32755);
                var4[var7] = var14[var12];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILwa;Z)V", line = 209)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        field1787++;
        if (arg0 == 0) {
            this.field1782 = arg1.method576(1) << 4;
        } else if (arg0 == 1) {
            this.field4715 = arg1.method642((byte) -107) == 1;
        }
        if (!arg2) {
            field1781 = -7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIBI)V", line = 247)
    public static final void method788(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1783++;
        class120 var5 = class293.method2059(4, 4, arg2);
        var5.method833((byte) 33);
        var5.field1876 = arg4;
        var5.field1875 = arg0;
        if (arg3 >= -108) {
            method790(-75);
        }
        var5.field1877 = arg1;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(B)V", line = 264)
    public static final void method789(byte arg0) {
        field1784++;
        int var1 = 0;
        if (arg0 <= 122) {
            method791((class136) null, 69, 54, -87, 72, -85, 88, 37, true);
        }
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class141.method940((byte) -106, true, var2, var3, class36.field585, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "(I)V", line = 298)
    public static void method790(int arg0) {
        field1785 = null;
        field1780 = (int[][]) null;
        int var1 = -20 % ((-arg0 - 31) / 39);
        field1778 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lrh;IIIIIIIZ)V", line = 310)
    public static final void method791(class136 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class50.field794;
        int var11;
        int var12 = var11 = (arg7 << 7) - class18.field255;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class229.field3635[arg1][arg6][arg7] - class133.field2019;
        int var18 = class229.field3635[arg1][arg6 + 1][arg7] - class133.field2019;
        int var19 = class229.field3635[arg1][arg6 + 1][arg7 + 1] - class133.field2019;
        int var20 = class229.field3635[arg1][arg6][arg7 + 1] - class133.field2019;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class200.field3110;
        int var46 = (var24 << 9) / var25 + class200.field3099;
        int var47 = (var27 << 9) / var31 + class200.field3110;
        int var48 = (var30 << 9) / var31 + class200.field3099;
        int var49 = (var33 << 9) / var37 + class200.field3110;
        int var50 = (var36 << 9) / var37 + class200.field3099;
        int var51 = (var39 << 9) / var43 + class200.field3110;
        int var52 = (var42 << 9) / var43 + class200.field3099;
        class200.field3114 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class135.field2063 && class84.method650(class302.field5212 + class200.field3110, class76.field1160 + class200.field3099, var50, var52, var48, var49, var51, var47)) {
                class322.field5533 = arg6;
                class28.field477 = arg7;
            }
            if (!class255.field4184 && !arg8) {
                class200.field3113 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class200.field3111 || var51 > class200.field3111 || var47 > class200.field3111) {
                    class200.field3113 = true;
                }
                if (arg0.field2084 == -1) {
                    if (arg0.field2078 != 12345678) {
                        class200.method1358(var50, var52, var48, var49, var51, var47, arg0.field2078, arg0.field2077, arg0.field2081);
                    }
                } else if (!class268.field4435) {
                    int var53 = class200.field3102.method100(arg0.field2084, 65535);
                    class200.method1358(var50, var52, var48, var49, var51, var47, class68.method502(var53, arg0.field2078), class68.method502(var53, arg0.field2077), class68.method502(var53, arg0.field2081));
                } else if (arg0.field2088) {
                    class200.method1339(var50, var52, var48, var49, var51, var47, arg0.field2078, arg0.field2077, arg0.field2081, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2084);
                } else {
                    class200.method1339(var50, var52, var48, var49, var51, var47, arg0.field2078, arg0.field2077, arg0.field2081, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field2084);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class135.field2063 && class84.method650(class302.field5212 + class200.field3110, class76.field1160 + class200.field3099, var46, var48, var52, var45, var47, var51)) {
            class322.field5533 = arg6;
            class28.field477 = arg7;
        }
        if (class255.field4184 || arg8) {
            return;
        }
        class200.field3113 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class200.field3111 || var47 > class200.field3111 || var51 > class200.field3111) {
            class200.field3113 = true;
        }
        if (arg0.field2084 == -1) {
            if (arg0.field2089 != 12345678) {
                class200.method1358(var46, var48, var52, var45, var47, var51, arg0.field2089, arg0.field2081, arg0.field2077);
            }
        } else if (class268.field4435) {
            class200.method1339(var46, var48, var52, var45, var47, var51, arg0.field2089, arg0.field2081, arg0.field2077, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field2084);
        } else {
            int var54 = class200.field3102.method100(arg0.field2084, 65535);
            class200.method1358(var46, var48, var52, var45, var47, var51, class68.method502(var54, arg0.field2089), class68.method502(var54, arg0.field2081), class68.method502(var54, arg0.field2077));
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V", line = 477)
    public final void method130(int arg0) {
        field1786++;
        if (arg0 != 16251) {
            method787(33, 78, 124);
        }
        class321.method2237((byte) -9);
    }
}
