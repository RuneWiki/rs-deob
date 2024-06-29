import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class282 {

    @OriginalMember(owner = "client!te", name = "h", descriptor = "Lve;")
    public static class255 field4853 = class87.method607(121, "Konfig geladen)3");

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lve;")
    public static class255 field4850 = class87.method607(100, "Nehmen");

    @OriginalMember(owner = "client!te", name = "f", descriptor = "Lve;")
    private static class255 field4851 = class87.method607(67, "Select");

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public static int field4858 = 0;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4861 = 0;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "Lve;")
    public static class255 field4852 = field4851;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lve;")
    public class255 field4854;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "Lrg;")
    public static class88 field4856;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[[B")
    public static byte[][] field4849;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[[[B")
    public static byte[][][] field4847;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZIIIIIIII)Z", line = 23)
    public static final boolean method1990(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field4859++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class198.field3418[var12][var13] = 0;
                class239.field3983[var12][var13] = 99999999;
            }
        }
        int var14 = arg6;
        class198.field3418[arg6][arg2] = 99;
        int var15 = arg2;
        class239.field3983[arg6][arg2] = 0;
        if (arg0 != 10) {
            method1991(40, -12, -111, (byte) 88, true, -92, 110);
        }
        byte var16 = 0;
        class212.field3617[var16] = arg6;
        boolean var17 = false;
        int var32 = var16 + 1;
        class90.field1535[var16] = arg2;
        int var18 = 0;
        int[][] var19 = class310.field5292[client.field4039].field2743;
        while (var32 != var18) {
            var15 = class90.field1535[var18];
            var14 = class212.field3617[var18];
            var18 = var18 + 1 & 0xFFF;
            if (arg8 == var14 && arg10 == var15) {
                var17 = true;
                break;
            }
            if (arg7 != 0) {
                if ((arg7 < 5 || arg7 == 10) && class310.field5292[client.field4039].method1175(arg4, var14, 2, arg8, arg7 - 1, arg10, (byte) -52, var15)) {
                    var17 = true;
                    break;
                }
                if (arg7 < 10 && class310.field5292[client.field4039].method1182(arg4, 2, arg8, arg10, arg7 - 1, false, var14, var15)) {
                    var17 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg1 != 0 && class310.field5292[client.field4039].method1184(arg1, (byte) -101, var15, arg8, arg9, var14, arg10, arg5, 2)) {
                var17 = true;
                break;
            }
            int var20 = class239.field3983[var14][var15] + 1;
            if (var14 > 0 && class198.field3418[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15;
                class198.field3418[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class239.field3983[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class198.field3418[var14 + 1][var15] == 0 && (var19[var14 + 2][var15] & 0x12C0183) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 + 1][var15] = 8;
                class239.field3983[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class198.field3418[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class212.field3617[var32] = var14;
                class90.field1535[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14][var15 - 1] = 1;
                class239.field3983[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class198.field3418[var14][var15 + 1] == 0 && (var19[var14][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class212.field3617[var32] = var14;
                class90.field1535[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14][var15 + 1] = 4;
                class239.field3983[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class198.field3418[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15] & 0x12C0138) == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14][var15 - 1] & 0x12C0183) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 - 1][var15 - 1] = 3;
                class239.field3983[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 102 && var15 > 0 && class198.field3418[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 2][var15] & 0x12C01E0) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 + 1][var15 - 1] = 9;
                class239.field3983[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class198.field3418[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14][var15 + 2] & 0x12C01E0) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 - 1][var15 + 1] = 6;
                class239.field3983[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class198.field3418[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var19[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var19[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15 + 1;
                class198.field3418[var14 + 1][var15 + 1] = 12;
                class239.field3983[var14 + 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
        }
        class160.field2701 = 0;
        if (!var17) {
            if (!arg3) {
                return false;
            }
            int var21 = 1000;
            int var22 = 100;
            byte var23 = 10;
            for (int var24 = arg8 - var23; var24 <= (arg8 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= (arg10 + var23); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class239.field3983[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg8 > var24) {
                            var26 = arg8 - var24;
                        } else if (arg5 + arg8 - 1 < var24) {
                            var26 = var24 + 1 - arg5 - arg8;
                        }
                        int var27 = 0;
                        if (var25 < arg10) {
                            var27 = arg10 - var25;
                        } else if ((arg10 + arg1 - 1) < var25) {
                            var27 = var25 + 1 - arg10 - arg1;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class239.field3983[var24][var25] < var22) {
                            var21 = var28;
                            var22 = class239.field3983[var24][var25];
                            var15 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg6 == var14 && arg2 == var15) {
                return false;
            }
            class160.field2701 = 1;
        }
        byte var29 = 0;
        class212.field3617[var29] = var14;
        int var33 = var29 + 1;
        class90.field1535[var29] = var15;
        int var30;
        int var31 = var30 = class198.field3418[var14][var15];
        while (arg6 != var14 || arg2 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class212.field3617[var33] = var14;
                class90.field1535[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class198.field3418[var14][var15];
        }
        if (var33 > 0) {
            class124.method920(arg0 - 31733, arg11, var33);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIBZII)V", line = 418)
    public static final void method1991(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, int arg6) {
        field4855++;
        if (class20.field332 == arg6 && class72.field1201 == arg0 && class87.field1415 == arg5 || class96.method761(true)) {
            return;
        }
        class20.field332 = arg6;
        class87.field1415 = arg5;
        class72.field1201 = arg0;
        if (class96.method761(true)) {
            class87.field1415 = 0;
        }
        if (arg4) {
            class256.method1798(-77, 28);
        } else {
            class256.method1798(-96, 25);
        }
        class256.method1796(class241.field4009, -8921, true);
        int var7 = class268.field4615;
        int var8 = class197.field3355;
        class268.field4615 = (arg0 - 6) * 8;
        class197.field3355 = (arg6 - 6) * 8;
        class144.field2407 = class10.method51(32, class20.field332 * 8, class72.field1201 * 8);
        int var9 = class268.field4615 - var7;
        int var10 = class197.field3355 - var8;
        int var11 = class197.field3355;
        int var12 = class268.field4615;
        if (arg4) {
            field4858 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class186 var14 = class82.field1334[var13];
                if (var14 != null) {
                    var14.field5173 -= var9 * 128;
                    var14.field5130 -= var10 * 128;
                    if (var14.field5130 >= 0 && var14.field5130 <= 13184 && var14.field5173 >= 0 && var14.field5173 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field5125[var15] -= var10;
                            var14.field5154[var15] -= var9;
                        }
                        class84.field1356[field4858++] = var13;
                    } else {
                        class82.field1334[var13].field2996 = null;
                        class82.field1334[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class186 var17 = class82.field1334[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field5125[var18] -= var10;
                        var17.field5154[var18] -= var9;
                    }
                    var17.field5173 -= var9 * 128;
                    var17.field5130 -= var10 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class242 var20 = class151.field2555[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field5125[var21] -= var10;
                    var20.field5154[var21] -= var9;
                }
                var20.field5173 -= var9 * 128;
                var20.field5130 -= var10 * 128;
            }
        }
        byte var22 = 0;
        client.field4039 = arg5;
        int var23 = -106 % ((-arg3 - 56) / 41);
        class276.field4742.method1687(arg2, arg1, false, (byte) 122);
        byte var24 = 0;
        byte var25 = 104;
        byte var26 = 1;
        if (var10 < 0) {
            var22 = 103;
            var25 = -1;
            var26 = -1;
        }
        byte var27 = 104;
        byte var28 = 1;
        if (var9 < 0) {
            var24 = 103;
            var28 = -1;
            var27 = -1;
        }
        for (int var29 = var22; var29 != var25; var29 += var26) {
            for (int var30 = var24; var30 != var27; var30 += var28) {
                int var31 = var9 + var30;
                int var32 = var10 + var29;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class16.field230[var33][var29][var30] = class16.field230[var33][var32][var31];
                    } else {
                        class16.field230[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class294 var34 = (class294) class274.field4716.method1471((byte) -106); var34 != null; var34 = (class294) class274.field4716.method1475((byte) 83)) {
            var34.field5054 -= var10;
            var34.field5056 -= var9;
            if (var34.field5054 < 0 || var34.field5056 < 0 || var34.field5054 >= 104 || var34.field5056 >= 104) {
                var34.method1502((byte) -82);
            }
        }
        class255.field4356 = 0;
        if (arg4) {
            class111.field1876 -= var10;
            class185.field2993 -= var9;
            class47.field696 -= var9;
            class93.field1605 -= var10;
        } else {
            class3.field50 = 1;
        }
        if (class113.field1918 != 0) {
            class113.field1918 -= var10;
            class15.field225 -= var9;
        }
        if (class281.field4827 && arg4 && (Math.abs(var10) > 104 || Math.abs(var9) > 104)) {
            class185.method1294(0);
        }
        class183.field2954 = -1;
        class218.field3692.method1474(true);
        class19.field312.method1474(true);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 664)
    public static final void method1992(byte arg0) {
        field4860++;
        if (class68.field1017 == -1 || class17.field258 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = class194.field3205 * 2;
        int var3 = ((class43.field670 - class185.field2984) * class125.field2075 >> 16) + class185.field2984;
        class125.field2075 += var3;
        if (class125.field2075 >= 65535) {
            if (class259.field4395) {
                class249.field4167 = false;
            } else {
                class249.field4167 = true;
            }
            class125.field2075 = 65535;
            class259.field4395 = true;
        } else {
            class259.field4395 = false;
            class249.field4167 = false;
        }
        float var4 = (float) class125.field2075 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class277.field4763[class68.field1017][var2][var5] * 3;
            int var7 = (class277.field4763[class68.field1017][var2 + 2][var5] - (class277.field4763[class68.field1017][var2 + 3][var5] - class277.field4763[class68.field1017][var2 + 2][var5])) * 3;
            int var8 = class277.field4763[class68.field1017][var2][var5];
            int var9 = class277.field4763[class68.field1017][var2 + 1][var5] * 3;
            int var10 = var9 - var6;
            int var11 = var9 + class277.field4763[class68.field1017][var2 + 2][var5] - var7 - var8;
            int var12 = var6 + var7 - (var9 * 2);
            var1[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var10) * var4 + (float) var8;
        }
        class221.field3723 = (int) var1[0] - (class197.field3355 * 128);
        class256.field4373 = (int) var1[2] - (class268.field4615 * 128);
        class153.field2599 = (int) var1[1] * -1;
        int var13 = class218.field3689 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class277.field4763[class17.field258][var13][var15] * 3;
            int var17 = (class277.field4763[class17.field258][var13 + 2][var15] + class277.field4763[class17.field258][var13 - -2][var15] - class277.field4763[class17.field258][var13 + 3][var15]) * 3;
            int var18 = class277.field4763[class17.field258][var13 + 1][var15] * 3;
            int var19 = class277.field4763[class17.field258][var13][var15];
            int var20 = class277.field4763[class17.field258][var13 + 2][var15] - (var19 - var18) - var17;
            int var21 = var16 + var17 - (var18 * 2);
            int var22 = var18 - var16;
            var14[var15] = (((float) var20 * var4 + (float) var21) * var4 + (float) var22) * var4 + (float) var19;
        }
        float var23 = var14[0] - var1[0];
        float var24 = (var14[1] - var1[1]) * -1.0F;
        float var25 = var14[2] - var1[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class95.field1635 = (float) Math.atan2((double) var24, var26);
        class196.field3239 = -((float) Math.atan2((double) var23, (double) var25));
        int var28 = -115 % ((48 - arg0) / 46);
        class260.field4409 = (int) ((double) class95.field1635 * 325.949D) & 0x7FF;
        class305.field5216 = (int) ((double) class196.field3239 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 768)
    public static void method1993(byte arg0) {
        field4847 = (byte[][][]) null;
        field4852 = null;
        if (arg0 != -87) {
            field4851 = (class255) null;
        }
        field4850 = null;
        field4851 = null;
        field4856 = null;
        field4853 = null;
        field4849 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 805)
    public static final void method1994(int arg0) {
        int var1 = 0;
        if (arg0 != -1) {
            return;
        }
        while (var1 < 100) {
            class187.field3008[var1] = true;
            var1++;
        }
        field4862++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)I", line = 829)
    public static final int method1995(byte arg0, int arg1) {
        field4863++;
        class246 var2 = class196.method1401(arg1, 64);
        int var3 = var2.field4131;
        if (arg0 >= -2) {
            method1992((byte) -126);
        }
        int var4 = var2.field4133;
        int var5 = var2.field4128;
        int var6 = class101.field1711[var5 - var4];
        return class76.field1246[var3] >> var4 & var6;
    }
}
