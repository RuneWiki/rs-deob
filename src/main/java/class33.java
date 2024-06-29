import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class33 extends class443 {

    @OriginalMember(owner = "client!js", name = "G", descriptor = "[I")
    private int[] field531;

    @OriginalMember(owner = "client!js", name = "C", descriptor = "[I")
    private int[] field528;

    @OriginalMember(owner = "client!js", name = "I", descriptor = "Lqs;")
    private class346 field533;

    @OriginalMember(owner = "client!js", name = "H", descriptor = "Lqs;")
    private class346 field532;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "Lqs;")
    private class346 field523;

    @OriginalMember(owner = "client!js", name = "J", descriptor = "[Lqs;")
    private class346[] field534;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "Ljava/lang/String;")
    public static String field526 = "";

    @OriginalMember(owner = "client!js", name = "L", descriptor = "[Z")
    public static boolean[] field536 = new boolean[100];

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!js", name = "B", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!js", name = "E", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!js", name = "F", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!js", name = "K", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIIIZILao;II)Z")
    public static final boolean method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class280 arg8, int arg9, int arg10) {
        field521++;
        int var11 = arg10;
        int var12 = arg5;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg10 - var13;
        int var16 = arg5 - var14;
        class189.field2643[var13][var14] = 99;
        class87.field1204[var13][var14] = 0;
        if (!arg6) {
            method260(23, (char) 65523, (String) null);
        }
        byte var17 = 0;
        class87.field1205[var17] = arg10;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class132.field1726[var10001] = arg5;
        int[][] var19 = arg8.field4115;
        while (var26 != var18) {
            var12 = class132.field1726[var18];
            var11 = class87.field1205[var18];
            var18 = var18 + 1 & 0xFFF;
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            int var22 = var11 - arg8.field4110;
            int var23 = var12 - arg8.field4106;
            if (arg0 == -4) {
                if (arg3 == var11 && arg1 == var12) {
                    class355.field5262 = var12;
                    class57.field862 = var11;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class122.method877(1, arg9, 2, arg1, var11, 2, arg3, arg4, var12)) {
                    class57.field862 = var11;
                    class355.field5262 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg8.method1853(arg9, var11, 32768, arg7, 2, var12, arg4, arg3, 2, arg1)) {
                    class355.field5262 = var12;
                    class57.field862 = var11;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg8.method1841(2, arg4, var12, var11, arg9, arg3, -1, arg7, arg1)) {
                    class57.field862 = var11;
                    class355.field5262 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg8.method1852(arg1, var11, var12, arg2, 2, arg0, arg3, 1)) {
                    class57.field862 = var11;
                    class355.field5262 = var12;
                    return true;
                }
            } else if (arg8.method1846(arg3, var12, 2, var11, -94, arg0, arg1, arg2)) {
                class57.field862 = var11;
                class355.field5262 = var12;
                return true;
            }
            int var25 = class87.field1204[var21][var20] + 1;
            if (var21 > 0 && class189.field2643[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12;
                class189.field2643[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class189.field2643[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var21 + 1][var20] = 8;
                class87.field1204[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class189.field2643[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class87.field1205[var26] = var11;
                class132.field1726[var26] = var12 - 1;
                class189.field2643[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class189.field2643[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class87.field1205[var26] = var11;
                class132.field1726[var26] = var12 + 1;
                class189.field2643[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class189.field2643[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12 - 1;
                class189.field2643[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class189.field2643[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12 - 1;
                var26 = var26 + 1 & 0xFFF;
                class189.field2643[var21 + 1][var20 - 1] = 9;
                class87.field1204[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class189.field2643[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class87.field1205[var26] = var11 - 1;
                class132.field1726[var26] = var12 + 1;
                class189.field2643[var21 - 1][var20 + 1] = 6;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class189.field2643[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class87.field1205[var26] = var11 + 1;
                class132.field1726[var26] = var12 + 1;
                class189.field2643[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 0xFFF;
                class87.field1204[var21 + 1][var20 + 1] = var25;
            }
        }
        class355.field5262 = var12;
        class57.field862 = var11;
        return false;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Lir;ILwh;)Z")
    public final boolean method254(class185 arg0, int arg1, class288 arg2) {
        field520++;
        if (class58.field866 > 0) {
            for (int var4 = 0; var4 < this.field531.length; var4++) {
                if (!arg0.method1214((byte) -111, class58.field866, this.field531[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field531.length; var5++) {
                if (!arg0.method1205((byte) -48, this.field531[var5])) {
                    return false;
                }
            }
        }
        if (arg1 <= 4) {
            this.method259(true, (class288) null, -0.887915967913707D, true, -60, 117, (class185) null, 61);
        }
        for (int var6 = 0; var6 < this.field528.length; var6++) {
            if (!arg2.method1960(false, this.field528[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public static final void method255(int arg0) {
        if (class254.field3706 != null) {
            class117 var1 = class254.field3706;
            synchronized (class254.field3706) {
                class254.field3706 = null;
            }
        }
        if (arg0 != -12544) {
            field536 = null;
        }
        field530++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILir;ILwh;I)[F")
    public final float[] method256(boolean arg0, int arg1, class185 arg2, int arg3, class288 arg4, int arg5) {
        class234.field3260 = arg2;
        field535++;
        class366.field5403 = arg4;
        for (int var7 = arg5; var7 < this.field534.length; var7++) {
            this.field534[var7].method2290(28666, arg3, arg1);
        }
        class154.method1036((byte) 114, arg3, arg1);
        float[] var8 = new float[arg1 * arg3 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field532.field5151) {
                int[] var16 = this.field532.method45(var10, 3);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field532.method287(var10, -71);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field523.field5151) {
                var17 = this.field523.method45(var10, 3);
            } else {
                var17 = this.field523.method287(var10, -6)[0];
            }
            int[] var18;
            if (this.field533.field5151) {
                var18 = this.field533.method45(var10, 3);
            } else {
                var18 = this.field533.method287(var10, -77)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field534.length; var11++) {
            this.field534[var11].method1763((byte) 125);
        }
        return var8;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
    public static void method257(int arg0) {
        field536 = null;
        field526 = null;
        if (arg0 >= -85) {
            method257(-5);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IDZLwh;BLir;I)[I")
    public final int[] method258(int arg0, double arg1, boolean arg2, class288 arg3, byte arg4, class185 arg5, int arg6) {
        field525++;
        if (arg4 != -112) {
            this.method258(-46, 0.8157267037865028D, true, (class288) null, (byte) -13, (class185) null, -117);
        }
        class234.field3260 = arg5;
        class366.field5403 = arg3;
        for (int var9 = 0; var9 < this.field534.length; var9++) {
            this.field534[var9].method2290(28666, arg6, arg0);
        }
        class452.method2809(arg1, (byte) -63);
        class154.method1036((byte) 94, arg6, arg0);
        int[] var10 = new int[arg0 * 4 * arg6];
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field532.field5151) {
                int[] var14 = this.field532.method45(var12, 3);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field532.method287(var12, -105);
                var17 = var18[1];
                var16 = var18[2];
                var15 = var18[0];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field523.field5151) {
                var19 = this.field523.method45(var12, 3);
            } else {
                var19 = this.field523.method287(var12, -111)[0];
            }
            for (int var20 = arg6 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class185.field2482[var21];
                int var25 = class185.field2482[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class185.field2482[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + ((var27 << 24) - (-(var24 << 16) - var26));
                if (arg2) {
                    var11 += arg6 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field534.length; var13++) {
            this.field534[var13].method1763((byte) 127);
        }
        return var10;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZLwh;DZIILir;I)[I")
    public final int[] method259(boolean arg0, class288 arg1, double arg2, boolean arg3, int arg4, int arg5, class185 arg6, int arg7) {
        class234.field3260 = arg6;
        class366.field5403 = arg1;
        field522++;
        for (int var10 = 0; var10 < this.field534.length; var10++) {
            this.field534[var10].method2290(28666, arg7, arg5);
        }
        class452.method2809(arg2, (byte) 91);
        class154.method1036((byte) 113, arg7, arg5);
        int[] var11 = new int[arg5 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = arg7 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg7;
        }
        int var15 = 0;
        if (arg4 > -8) {
            this.method258(45, 1.1818555962711057D, false, (class288) null, (byte) 124, (class185) null, -23);
        }
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field532.field5151) {
                int[] var22 = this.field532.method45(var16, 3);
                var19 = var22;
                var20 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field532.method287(var16, -11);
                var19 = var18[0];
                var20 = var18[1];
                var21 = var18[2];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var21[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class185.field2482[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class185.field2482[var25];
                int var29 = class185.field2482[var26];
                int var30 = (var28 << 8) + (var27 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field534.length; var17++) {
            this.field534[var17].method1763((byte) 125);
        }
        return var11;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method260(int arg0, char arg1, String arg2) {
        field524++;
        if (arg0 != -2892) {
            return null;
        }
        int var3 = class395.method2533(arg2, (byte) 95, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2.charAt(var8) != arg1; var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
    public class33() {
        this.field531 = new int[0];
        this.field528 = new int[0];
        this.field533 = new class7(0);
        this.field533.field5165 = 1;
        this.field532 = new class7();
        this.field532.field5165 = 1;
        this.field523 = new class7();
        this.field523.field5165 = 1;
        this.field534 = new class346[] { this.field532, this.field523, this.field533 };
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lfb;)V")
    public class33(class341 arg0) {
        int var2 = arg0.method2233((byte) 104);
        int var3 = 0;
        int var4 = 0;
        this.field534 = new class346[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class346 var16 = class101.method776(0, arg0);
            if (var16.method1760((byte) 41) >= 0) {
                var3++;
            }
            if (var16.method2292(false) >= 0) {
                var4++;
            }
            int var17 = var16.field5171.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2233((byte) 104);
            }
            this.field534[var6] = var16;
        }
        this.field531 = new int[var3];
        this.field528 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class346 var11 = this.field534[var9];
            int var12 = var11.field5171.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5171[var13] = this.field534[var5[var9][var13]];
            }
            int var14 = var11.method1760((byte) 109);
            int var15 = var11.method2292(false);
            if (var14 > 0) {
                this.field531[var7++] = var14;
            }
            if (var15 > 0) {
                this.field528[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field532 = this.field534[arg0.method2233((byte) 104)];
        this.field523 = this.field534[arg0.method2233((byte) 104)];
        this.field533 = this.field534[arg0.method2233((byte) 104)];
        Object var10 = null;
    }
}
