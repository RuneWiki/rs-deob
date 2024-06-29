import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class1 extends class207 {

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "[I")
    public static int[] field11 = new int[1000];

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lwd;")
    public static class22 field7 = new class22();

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lmg;")
    public static class252 field15 = new class252(8);

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Ljd;")
    public static class86 field17 = class122.method868(" )2>", true);

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lmh;")
    public static class148 field10;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
    public static int[] field6;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIZIIIIIIBII)Z")
    public static final boolean method1(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var31 = 0; var31 < 104; var31++) {
                class58.field1172[var12][var31] = 0;
                class133.field2533[var12][var31] = 99999999;
            }
        }
        field12++;
        class58.field1172[arg1][arg5] = 99;
        class133.field2533[arg1][arg5] = 0;
        int var13 = arg1;
        int var14 = arg5;
        byte var15 = 0;
        int var16 = 0;
        class111.field2124[var15] = arg1;
        int var32 = var15 + 1;
        class164.field3068[var15] = arg5;
        boolean var17 = false;
        if (arg9 != 15) {
            return true;
        }
        int[][] var18 = class122.field2388[class180.field3244].field300;
        while (var32 != var16) {
            var14 = class164.field3068[var16];
            var13 = class111.field2124[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg3 == var13 && arg10 == var14) {
                var17 = true;
                break;
            }
            if (arg8 != 0) {
                if ((arg8 < 5 || arg8 == 10) && class122.field2388[class180.field3244].method66(var13, 1, arg8 - 1, arg7, true, arg10, arg3, var14)) {
                    var17 = true;
                    break;
                }
                if (arg8 < 10 && class122.field2388[class180.field3244].method70(1, (byte) 18, var14, arg7, var13, arg10, arg8 - 1, arg3)) {
                    var17 = true;
                    break;
                }
            }
            if (arg11 != 0 && arg6 != 0 && class122.field2388[class180.field3244].method78(arg10, false, arg0, arg11, arg6, var14, arg3, 1, var13)) {
                var17 = true;
                break;
            }
            int var30 = class133.field2533[var13][var14] + 1;
            if (var13 > 0 && class58.field1172[var13 - 1][var14] == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13 - 1][var14] = 2;
                class133.field2533[var13 - 1][var14] = var30;
            }
            if (var13 < 103 && class58.field1172[var13 + 1][var14] == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13 + 1][var14] = 8;
                class133.field2533[var13 + 1][var14] = var30;
            }
            if (var14 > 0 && class58.field1172[var13][var14 - 1] == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class111.field2124[var32] = var13;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13][var14 - 1] = 1;
                class133.field2533[var13][var14 - 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && class58.field1172[var13][var14 + 1] == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class111.field2124[var32] = var13;
                class164.field3068[var32] = var14 + 1;
                var32 = var32 + 1 & 0xFFF;
                class58.field1172[var13][var14 + 1] = 4;
                class133.field2533[var13][var14 + 1] = var30;
            }
            if (var13 > 0 && var14 > 0 && class58.field1172[var13 - 1][var14 - 1] == 0 && (var18[var13 - 1][var14 - 1] & 0x12C010E) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13 - 1][var14 - 1] = 3;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13 - 1][var14 - 1] = var30;
            }
            if (var13 < 103 && var14 > 0 && class58.field1172[var13 + 1][var14 - 1] == 0 && (var18[var13 + 1][var14 - 1] & 0x12C0183) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 - 1] & 0x12C0102) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14 - 1;
                class58.field1172[var13 + 1][var14 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13 + 1][var14 - 1] = var30;
            }
            if (var13 > 0 && var14 < 103 && class58.field1172[var13 - 1][var14 + 1] == 0 && (var18[var13 - 1][var14 + 1] & 0x12C0138) == 0 && (var18[var13 - 1][var14] & 0x12C0108) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class111.field2124[var32] = var13 - 1;
                class164.field3068[var32] = var14 + 1;
                class58.field1172[var13 - 1][var14 + 1] = 6;
                class133.field2533[var13 - 1][var14 + 1] = var30;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var13 < 103 && var14 < 103 && class58.field1172[var13 + 1][var14 + 1] == 0 && (var18[var13 + 1][var14 + 1] & 0x12C01E0) == 0 && (var18[var13 + 1][var14] & 0x12C0180) == 0 && (var18[var13][var14 + 1] & 0x12C0120) == 0) {
                class111.field2124[var32] = var13 + 1;
                class164.field3068[var32] = var14 + 1;
                class58.field1172[var13 + 1][var14 + 1] = 12;
                var32 = var32 + 1 & 0xFFF;
                class133.field2533[var13 + 1][var14 + 1] = var30;
            }
        }
        class203.field3682 = 0;
        if (!var17) {
            if (!arg2) {
                return false;
            }
            int var19 = 1000;
            int var20 = 100;
            byte var21 = 10;
            for (int var22 = arg3 - var21; var22 <= (arg3 + var21); var22++) {
                for (int var23 = arg10 - var21; var23 <= arg10 + var21; var23++) {
                    if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104 && class133.field2533[var22][var23] < 100) {
                        int var24 = 0;
                        int var25 = 0;
                        if (var22 < arg3) {
                            var25 = arg3 - var22;
                        } else if (var22 > (arg3 + arg11 - 1)) {
                            var25 = var22 + 1 - (arg3 + arg11);
                        }
                        if (var23 < arg10) {
                            var24 = arg10 - var23;
                        } else if ((arg6 + arg10 - 1) < var23) {
                            var24 = -arg6 - (arg10 - (var23 + 1));
                        }
                        int var26 = var24 * var24 + var25 * var25;
                        if (var26 < var19 || var19 == var26 && var20 > class133.field2533[var22][var23]) {
                            var20 = class133.field2533[var22][var23];
                            var13 = var22;
                            var19 = var26;
                            var14 = var23;
                        }
                    }
                }
            }
            if (var19 == 1000) {
                return false;
            }
            if (arg1 == var13 && arg5 == var14) {
                return false;
            }
            class203.field3682 = 1;
        }
        byte var27 = 0;
        class111.field2124[var27] = var13;
        int var33 = var27 + 1;
        class164.field3068[var27] = var14;
        int var28;
        int var29 = var28 = class58.field1172[var13][var14];
        while (arg1 != var13 || arg5 != var14) {
            if (var28 != var29) {
                class111.field2124[var33] = var13;
                class164.field3068[var33++] = var14;
                var28 = var29;
            }
            if ((var29 & 0x2) != 0) {
                var13++;
            } else if ((var29 & 0x8) != 0) {
                var13--;
            }
            if ((var29 & 0x1) != 0) {
                var14++;
            } else if ((var29 & 0x4) != 0) {
                var14--;
            }
            var29 = class58.field1172[var13][var14];
        }
        if (var33 > 0) {
            class118.method844(var33, -1, arg4);
            return true;
        } else if (arg4 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method2(byte arg0) {
        field11 = null;
        field7 = null;
        field15 = null;
        int var1 = 118 % ((14 - arg0) / 63);
        field10 = null;
        field6 = null;
        field17 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IB)I")
    public static final int method3(int arg0, byte arg1) {
        field8++;
        if (arg0 < 0) {
            return 0;
        }
        class13 var2 = (class13) class152.field2876.method1698((long) arg0, (byte) 113);
        if (var2 == null) {
            return class83.method578(arg0, 119).field2764;
        }
        int var3 = 0;
        if (arg1 < 91) {
            return 77;
        }
        for (int var4 = 0; var4 < var2.field405.length; var4++) {
            if (var2.field405[var4] == -1) {
                var3++;
            }
        }
        return var3 + class83.method578(arg0, 89).field2764 - var2.field405.length;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Lei;")
    public static final class167 method4(byte arg0) {
        int var1 = class24.field592[0] * class191.field3393[0];
        field14++;
        if (arg0 != 108) {
            method1(-7, -84, true, 30, -40, -74, -25, 61, 96, (byte) -125, -96, -3);
        }
        byte[] var2 = class213.field3857[0];
        class167 var6;
        if (class264.field4673[0]) {
            int[] var3 = new int[var1];
            byte[] var4 = class173.field3169[0];
            for (int var5 = 0; var5 < var1; var5++) {
                var3[var5] = class49.method377(method5(var4[var5] << 24, -16777216), class268.field4718[method5(var2[var5], 255)]);
            }
            var6 = new class99(class70.field1438, class169.field3121, class138.field2628[0], field6[0], class24.field592[0], class191.field3393[0], var3);
        } else {
            int[] var7 = new int[var1];
            for (int var8 = 0; var8 < var1; var8++) {
                var7[var8] = class268.field4718[method5(255, var2[var8])];
            }
            var6 = new class167(class70.field1438, class169.field3121, class138.field2628[0], field6[0], class24.field592[0], class191.field3393[0], var7);
        }
        class127.method894((byte) 20);
        return var6;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I")
    public static int method5(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V")
    public static final void method6(int arg0) {
        class119.field2327.method703((byte) 122);
        field5++;
        if (arg0 <= 8) {
            method1(16, -22, false, -66, -91, 24, 61, 11, -85, (byte) 24, 36, 118);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(B)V")
    public static final void method7(byte arg0) {
        field4++;
        if (class253.field4494 == -1 || class163.field3065 == -1) {
            return;
        }
        int var1 = ((class228.field4133 - class208.field3770) * class96.field1916 >> 16) + class208.field3770;
        class96.field1916 += var1;
        if (class96.field1916 >= 65535) {
            if (class79.field1549) {
                class252.field4488 = false;
            } else {
                class252.field4488 = true;
            }
            class79.field1549 = true;
            class96.field1916 = 65535;
        } else {
            class252.field4488 = false;
            class79.field1549 = false;
        }
        if (arg0 != 10) {
            return;
        }
        float[] var2 = new float[3];
        int var3 = class80.field1565 * 2;
        float var4 = (float) class96.field1916 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = (-class220.field3955[class253.field4494][var3 + 3][var5] - (-class220.field3955[class253.field4494][var3 + 2][var5] - class220.field3955[class253.field4494][var3 + 2][var5])) * 3;
            int var22 = class220.field3955[class253.field4494][var3 + 1][var5] * 3;
            int var23 = class220.field3955[class253.field4494][var3][var5] * 3;
            int var24 = var22 - var23;
            int var25 = class220.field3955[class253.field4494][var3][var5];
            int var26 = var23 + var21 - var22 * 2;
            int var27 = class220.field3955[class253.field4494][var3 + 2][var5] + var22 - var25 - var21;
            var2[var5] = (((float) var27 * var4 + (float) var26) * var4 + (float) var24) * var4 + (float) var25;
        }
        class70.field1430 = (int) var2[0] - (class252.field4481 * 128);
        class88.field1748 = (int) var2[1] * -1;
        float[] var6 = new float[3];
        class4.field61 = (int) var2[2] - (class79.field1554 * 128);
        int var7 = class55.field1111 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class220.field3955[class163.field3065][var7][var8] * 3;
            int var15 = class220.field3955[class163.field3065][var7 + 1][var8] * 3;
            int var16 = (class220.field3955[class163.field3065][var7 + 2][var8] + class220.field3955[class163.field3065][var7 + 2][var8] - class220.field3955[class163.field3065][var7 + 3][var8]) * 3;
            int var17 = class220.field3955[class163.field3065][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class220.field3955[class163.field3065][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var18) * var4 + (float) var17;
        }
        float var9 = var6[0] - var2[0];
        float var10 = (var6[1] - var2[1]) * -1.0F;
        float var11 = var6[2] - var2[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class171.field3157 = (float) Math.atan2((double) var10, var12);
        class258.field4592 = -((float) Math.atan2((double) var9, (double) var11));
        class255.field4541 = (int) ((double) class171.field3157 * 325.949D) & 0x7FF;
        class176.field3202 = (int) ((double) class258.field4592 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lqk;Z)V")
    public static final void method8(class200 arg0, boolean arg1) {
        field16++;
        if (arg0.field3547.length - arg0.field3565 < 1) {
            return;
        }
        int var2 = arg0.method1408((byte) -108);
        if (var2 < 0 || var2 > 7) {
            return;
        }
        byte var3;
        if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field3547.length - arg0.field3565)) {
            return;
        }
        class21.field547 = arg0.method1408((byte) -87);
        if (class21.field547 < 1) {
            class21.field547 = 1;
        } else if (class21.field547 > 4) {
            class21.field547 = 4;
        }
        class134.method965(arg1, arg0.method1408((byte) -77) == 1);
        class79.field1555 = arg0.method1408((byte) -61) == 1;
        class116.field2224 = arg0.method1408((byte) -76) == 1;
        class202.field3655 = arg0.method1408((byte) -100) == 1;
        class42.field936 = arg0.method1408((byte) -122) == 1;
        class4.field63 = arg0.method1408((byte) -58) == 1;
        class107.field2061 = arg0.method1408((byte) -85) == 1;
        class272.field4769 = arg0.method1408((byte) -24) == 1;
        class133.field2513 = arg0.method1408((byte) -24);
        if (class133.field2513 > 2) {
            class133.field2513 = 2;
        }
        if (var2 >= 2) {
            class168.field3114 = arg0.method1408((byte) -76) == 1;
        } else {
            class168.field3114 = arg0.method1408((byte) -40) == 1;
            arg0.method1408((byte) -101);
        }
        class161.field3029 = arg0.method1408((byte) -21) == 1;
        class83.field1621 = arg0.method1408((byte) -125) == 1;
        class64.field1257 = arg0.method1408((byte) -65);
        if (class64.field1257 > 2) {
            class64.field1257 = 2;
        }
        class31.field647 = arg0.method1408((byte) -120) == 1;
        class264.field4672 = arg0.method1408((byte) -24);
        if (class264.field4672 > 127) {
            class264.field4672 = 127;
        }
        class139.field2646 = arg0.method1408((byte) -62);
        class152.field2879 = arg0.method1408((byte) -99);
        if (class152.field2879 > 127) {
            class152.field2879 = 127;
        }
        if (var2 >= 1) {
            class65.field1286 = arg0.method1410(-119);
            class7.field248 = arg0.method1410(-98);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1408((byte) -82);
        }
        if (var2 >= 4) {
            arg0.method1408((byte) -22);
        }
        if (var2 >= 5) {
            class194.field3481 = arg0.method1386(-4603);
        }
        if (var2 >= 6) {
            class42.field949 = arg0.method1408((byte) -75);
        }
        if (var2 >= 7) {
            class50.field1045 = arg0.method1408((byte) -54) == 1;
        }
    }
}
