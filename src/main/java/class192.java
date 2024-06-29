import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class192 extends class12 {

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "[I")
    public static int[] field3481 = new int[100];

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Lcc;")
    public static class209 field3484 = class95.method669(104, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg9;
        field3480++;
        boolean var12;
        if (class265.field4754 > 0 && class265.field4754 % 10 < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = arg3 - arg6;
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg0;
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var18 = arg1 + ((var16 + 1) * arg7) >> 16;
            int var19 = arg7 * var16 + arg1 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var21 = arg10 + var19;
                int var10000 = arg10 + var18;
                int var23 = arg9 + var16 >> 6;
                if (var23 >= 0 && class147.field2702.length - 1 >= var23) {
                    int[][] var24 = class147.field2702[var23];
                    for (int var25 = -var15; var25 < (var13 + var15); var25++) {
                        int var26 = (var25 + 1) * arg0 + arg4 >> 16;
                        int var27 = arg0 * var25 + arg4 >> 16;
                        int var28 = var26 - var27;
                        if (var28 > 0) {
                            var10000 = arg2 + var26;
                            int var30 = arg2 + var27;
                            int var31 = arg6 + var25 >> 6;
                            if (var31 >= 0 && var24.length - 1 >= var31 && var24[var31] != null) {
                                int var32 = ((arg6 + var25 & 0x3F) << 6) + (var16 + arg9 & 0x3F);
                                int var33 = var24[var31][var32];
                                if (var33 != 0) {
                                    class218 var34 = class245.method1711(27093, var33 - 1);
                                    if (var12 && class278.field4892 == var34.field3944) {
                                        class214 var35 = new class214();
                                        var35.field3863 = var21;
                                        var35.field3867 = var30;
                                        var35.field3864 = var34.field3944;
                                        class284.field4993.method1123(var35, (byte) -128);
                                    }
                                    class191.field3467[var34.field3944].method232(var21 - 7, var30 + -7);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg5 != 128) {
            method1318((class49) null, -127);
        }
        for (class214 var17 = (class214) class284.field4993.method1119(arg5 ^ 0x5120); var17 != null; var17 = (class214) class284.field4993.method1120(arg5 - 57)) {
            class191.field3467[var17.field3864].method232(var17.field3863 - 7, var17.field3867 + -7);
            class4.method38(var17.field3863, var17.field3867, 15, 16776960, 128);
            class4.method38(var17.field3863, var17.field3867, 7, 16777215, 256);
        }
        class284.field4993.method1117((byte) 55);
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        if (arg0 <= 115) {
            method1317((byte) -59);
        }
        field3481 = null;
        field3484 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lsj;I)V")
    public static final void method1318(class49 arg0, int arg1) {
        field3482++;
        class21.field404 = class155.method1090((byte) -100, arg0, class223.field4067);
        class23.field426 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var5 = (float) ((class285.field5033[var2] & 0xFF0000) >> 16);
            int var6 = class285.field5033[var2 + 1] >> 16 & 0xFF;
            float var7 = ((float) var6 - var5) / 64.0F;
            float var8 = (float) ((class285.field5033[var2] & 0xFF00) >> 8);
            int var9 = (class285.field5033[var2 + 1] & 0xFF00) >> 8;
            float var10 = ((float) var9 - var8) / 64.0F;
            int var11 = class285.field5033[var2 + 1] & 0xFF;
            float var12 = (float) (class285.field5033[var2] & 0xFF);
            float var13 = ((float) var11 - var12) / 64.0F;
            for (int var14 = 0; var14 < 64; var14++) {
                class23.field426[var2 * 64 + var14] = class6.method63(class6.method63((int) var8 << 8, (int) var5 << 16), (int) var12);
                var5 += var7;
                var12 += var13;
                var8 += var10;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class23.field426[var3] = class285.field5033[3];
        }
        class179.field3252 = new int[32768];
        class276.field4873 = new int[32768];
        class162.method1121((class194) null, 124);
        class113.field2264 = new int[32768];
        class43.field865 = new int[32768];
        int var4 = -119 / ((arg1 - 3) / 46);
        class257.field4632 = new class269(128, 254);
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I")
    public static final int method1319(byte arg0) {
        field3477++;
        int var1 = -128 % ((21 - arg0) / 40);
        if (class51.field1008) {
            return 0;
        } else if (class186.method1273(-26)) {
            return class129.field2484 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ZLji;III)V")
    public static final void method1320(boolean arg0, class42 arg1, int arg2, int arg3, int arg4) {
        field3478++;
        int var5 = arg1.field789;
        if (arg1.field791 == 0) {
            arg1.field789 = arg1.field808;
        } else if (arg1.field791 == 1) {
            arg1.field789 = arg2 - arg1.field808;
        } else if (arg1.field791 == 2) {
            arg1.field789 = arg1.field808 * arg2 >> 14;
        } else if (arg1.field791 == 3) {
            if (arg1.field810 == 2) {
                arg1.field789 = (arg1.field808 - 1) * arg1.field797 + arg1.field808 * 32;
            } else if (arg1.field810 == 7) {
                arg1.field789 = arg1.field808 * 115 + ((arg1.field808 - 1) * arg1.field797);
            }
        }
        if (arg3 > -89) {
            field3484 = null;
        }
        int var6 = arg1.field758;
        if (arg1.field693 == 0) {
            arg1.field758 = arg1.field853;
        } else if (arg1.field693 == 1) {
            arg1.field758 = arg4 - arg1.field853;
        } else if (arg1.field693 == 2) {
            arg1.field758 = arg1.field853 * arg4 >> 14;
        } else if (arg1.field693 == 3) {
            if (arg1.field810 == 2) {
                arg1.field758 = (arg1.field853 - 1) * arg1.field828 + arg1.field853 * 32;
            } else if (arg1.field810 == 7) {
                arg1.field758 = arg1.field853 * 12 + ((arg1.field853 - 1) * arg1.field828);
            }
        }
        if (arg1.field791 == 4) {
            arg1.field789 = arg1.field758 * arg1.field723 / arg1.field804;
        }
        if (arg1.field693 == 4) {
            arg1.field758 = arg1.field804 * arg1.field789 / arg1.field723;
        }
        if (class70.field1332 && (client.method1070(arg1) != 0 || arg1.field810 == 0)) {
            if (arg1.field758 < 5 && arg1.field789 < 5) {
                arg1.field758 = 5;
                arg1.field789 = 5;
            } else {
                if (arg1.field789 <= 0) {
                    arg1.field789 = 5;
                }
                if (arg1.field758 <= 0) {
                    arg1.field758 = 5;
                }
            }
        }
        if (arg1.field715 == 1337) {
            class51.field1021 = arg1;
        }
        if (arg0 && arg1.field700 != null && arg1.field789 != var5 || arg1.field758 != var6) {
            class227 var7 = new class227();
            var7.field4134 = arg1.field700;
            var7.field4143 = arg1;
            class211.field3838.method1123(var7, (byte) -128);
        }
    }
}
