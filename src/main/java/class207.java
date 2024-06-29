import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class207 extends class189 {

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "[I")
    private int[] field3323;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "[I")
    private int[] field3320;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "Lej;")
    private class80 field3325;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "Lej;")
    private class80 field3327;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lej;")
    private class80 field3315;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "[Lej;")
    private class80[] field3319;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Z")
    public static boolean field3321 = false;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "[I")
    public static int[] field3317 = new int[200];

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "I")
    public static int field3314;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public static void method1419(boolean arg0) {
        if (arg0) {
            field3317 = null;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIZLl;DILph;Z)[I")
    public final int[] method1420(int arg0, int arg1, boolean arg2, class16 arg3, double arg4, int arg5, class459 arg6, boolean arg7) {
        class64.field1311 = arg6;
        if (arg0 <= 67) {
            this.field3320 = null;
        }
        field3326++;
        class510.field7431 = arg3;
        for (int var10 = 0; var10 < this.field3319.length; var10++) {
            this.field3319[var10].method708(-72, arg5, arg1);
        }
        class230.method1520((byte) -117, arg4);
        class287.method1800(arg1, arg5, 0);
        int[] var11 = new int[arg1 * arg5];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var12 = -1;
            var13 = -1;
            var14 = arg1 - 1;
        } else {
            var12 = 1;
            var13 = arg1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg7) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3327.field1591) {
                int[] var18 = this.field3327.method25(var16, -16828);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field3327.method29(255, var16);
                var20 = var22[1];
                var19 = var22[0];
                var21 = var22[2];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
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
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class517.field7506[var24];
                int var28 = class517.field7506[var25];
                int var29 = class517.field7506[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg7) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field3319.length; var17++) {
            this.field3319[var17].method715((byte) -26);
        }
        return var11;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method1421(String arg0, boolean arg1) {
        field3313++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class502.method3025(-13, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class172.field2777; var3++) {
            String var4 = class395.field6015[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class502.method3025(-13, var4);
            if (var5 != null && var5.equals(var2)) {
                class172.field2777--;
                for (int var6 = var3; var6 < class172.field2777; var6++) {
                    class395.field6015[var6] = class395.field6015[var6 + 1];
                    class52.field1118[var6] = class52.field1118[var6 + 1];
                    class143.field2380[var6] = class143.field2380[var6 + 1];
                    class317.field4821[var6] = class317.field4821[var6 + 1];
                    class407.field6170[var6] = class407.field6170[var6 + 1];
                }
                class398.field6037 = class112.field2032;
                class357.field5242++;
                class459.method2765(class370.field5438, (byte) 87);
                class335.field5062.method1814(class362.method2220(arg0, (byte) -80), true);
                class335.field5062.method1821(arg0, 125);
                break;
            }
        }
        if (!arg1) {
            method1419(true);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lph;Ll;B)Z")
    public final boolean method1422(class459 arg0, class16 arg1, byte arg2) {
        field3322++;
        if (class473.field7012 < 0) {
            for (int var4 = 0; var4 < this.field3320.length; var4++) {
                if (!arg0.method2739(this.field3320[var4], 108)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3320.length; var5++) {
                if (!arg0.method2741(this.field3320[var5], 1164, class473.field7012)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3323.length; var6++) {
            if (!arg1.method108(false, this.field3323[var6])) {
                return false;
            }
        }
        int var7 = -84 % ((arg2 + 8) / 51);
        return true;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method1423(byte[] arg0, int arg1, int arg2, int arg3) {
        field3316++;
        char[] var4 = new char[arg1];
        int var5 = 0;
        int var6 = arg1 + arg3;
        if (arg2 != 128) {
            field3317 = null;
        }
        for (int var7 = arg3; var7 < var6; var7++) {
            int var8 = arg0[var7] & 0xFF;
            if (var8 >= 128) {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var7 + 1 >= var6) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var9 = arg0[var7] & 0xFF;
                    if (var9 < 128 || var9 > 191) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class418.method2558(class490.method2960(-129, var9), class490.method2960(var8 << 6, -12352));
                } else if (var8 < 240) {
                    if ((var7 + 2) >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    var7++;
                    int var10 = arg0[var7] & 0xFF;
                    if (var10 >= 128 && var10 <= 191) {
                        var7++;
                        int var11 = arg0[var7] & 0xFF;
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class418.method2558(class490.method2960(var11, -129), class418.method2558(class490.method2960(-921600, var8 << 12), class490.method2960(-8256, var10 << 6)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                } else if (var8 < 244) {
                    throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                } else {
                    throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                }
            } else {
                var4[var5++] = (char) var8;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZIDLl;Lph;II)[I")
    public final int[] method1424(boolean arg0, int arg1, double arg2, class16 arg3, class459 arg4, int arg5, int arg6) {
        field3314++;
        if (arg6 != -2444) {
            this.method1425(34, -78, null, null, -27, true);
        }
        class510.field7431 = arg3;
        class64.field1311 = arg4;
        for (int var9 = 0; var9 < this.field3319.length; var9++) {
            this.field3319[var9].method708(-61, arg1, arg5);
        }
        class230.method1520((byte) -110, arg2);
        class287.method1800(arg5, arg1, 0);
        int[] var10 = new int[arg1 * arg5 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field3327.field1591) {
                int[] var18 = this.field3327.method25(var12, -16828);
                var17 = var18;
                var15 = var18;
                var16 = var18;
            } else {
                int[][] var14 = this.field3327.method29(255, var12);
                var15 = var14[1];
                var16 = var14[2];
                var17 = var14[0];
            }
            int[] var19;
            if (this.field3315.field1591) {
                var19 = this.field3315.method25(var12, -16828);
            } else {
                var19 = this.field3315.method29(255, var12)[0];
            }
            if (arg0) {
                var11 = var12;
            }
            for (int var20 = arg5 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
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
                int var24 = class517.field7506[var22];
                int var25 = class517.field7506[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class517.field7506[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
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
                var10[var11++] = (var27 << 24) + var26 + (var24 << 8) + (var25 << 16);
                if (arg0) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field3319.length; var13++) {
            this.field3319[var13].method715((byte) -26);
        }
        return var10;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IILph;Ll;IZ)[F")
    public final float[] method1425(int arg0, int arg1, class459 arg2, class16 arg3, int arg4, boolean arg5) {
        class64.field1311 = arg2;
        if (arg4 < 110) {
            this.field3323 = null;
        }
        class510.field7431 = arg3;
        field3318++;
        for (int var7 = 0; var7 < this.field3319.length; var7++) {
            this.field3319[var7].method708(-76, arg1, arg0);
        }
        class287.method1800(arg0, arg1, 0);
        float[] var8 = new float[arg0 * 4 * arg1];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field3327.field1591) {
                int[] var12 = this.field3327.method25(var10, -16828);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field3327.method29(255, var10);
                var15 = var16[1];
                var14 = var16[0];
                var13 = var16[2];
            }
            int[] var17;
            if (this.field3315.field1591) {
                var17 = this.field3315.method25(var10, -16828);
            } else {
                var17 = this.field3315.method29(255, var10)[0];
            }
            int[] var18;
            if (this.field3325.field1591) {
                var18 = this.field3325.method25(var10, -16828);
            } else {
                var18 = this.field3325.method29(255, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field3319.length; var11++) {
            this.field3319[var11].method715((byte) -26);
        }
        return var8;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "()V")
    public class207() {
        this.field3323 = new int[0];
        this.field3320 = new int[0];
        this.field3325 = new class361(0);
        this.field3325.field1590 = 1;
        this.field3327 = new class361();
        this.field3327.field1590 = 1;
        this.field3315 = new class361();
        this.field3315.field1590 = 1;
        this.field3319 = new class80[] { this.field3327, this.field3315, this.field3325 };
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Lnn;)V")
    public class207(class289 arg0) {
        int var2 = arg0.method1858(-3256);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field3319 = new class80[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class80 var16 = class421.method2570(arg0, 119);
            if (var16.method714(0) >= 0) {
                var3++;
            }
            if (var16.method707(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field1603.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1858(-3256);
            }
            this.field3319[var6] = var16;
        }
        this.field3320 = new int[var3];
        int var7 = 0;
        this.field3323 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class80 var11 = this.field3319[var9];
            int var12 = var11.field1603.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field1603[var13] = this.field3319[var5[var9][var13]];
            }
            int var14 = var11.method714(0);
            int var15 = var11.method707(-1);
            if (var14 > 0) {
                this.field3320[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3323[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3327 = this.field3319[arg0.method1858(-3256)];
        this.field3315 = this.field3319[arg0.method1858(-3256)];
        this.field3325 = this.field3319[arg0.method1858(-3256)];
        Object var10 = null;
    }
}
