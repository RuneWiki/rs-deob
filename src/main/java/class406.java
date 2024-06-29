import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class406 extends class270 {

    @OriginalMember(owner = "client!um", name = "F", descriptor = "[I")
    private int[] field6163;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "[I")
    private int[] field6162;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "Lpj;")
    private class512 field6164;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "Lpj;")
    private class512 field6158;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "Lpj;")
    private class512 field6159;

    @OriginalMember(owner = "client!um", name = "C", descriptor = "[Lpj;")
    private class512[] field6161;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "Ljc;")
    public static class356 field6168 = new class356(7, 7);

    @OriginalMember(owner = "client!um", name = "M", descriptor = "Lnk;")
    public static class326 field6169 = new class326(48, 2);

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "[Z")
    public static boolean[] field6157;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2510(boolean arg0) {
        field6169 = null;
        field6157 = null;
        field6168 = null;
        if (arg0) {
            method2512(70, 4, 123);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZLqs;BIDLl;)[I", line = 18)
    public final int[] method2511(int arg0, boolean arg1, boolean arg2, class496 arg3, byte arg4, int arg5, double arg6, class196 arg7) {
        class334.field5253 = arg7;
        class485.field7121 = arg3;
        field6167++;
        for (int var10 = 0; var10 < this.field6161.length; var10++) {
            this.field6161[var10].method2262((byte) -89, arg0, arg5);
        }
        class402.method2495(arg6, arg4 ^ 0x35);
        class34.method258(-82, arg5, arg0);
        int[] var11 = new int[arg0 * arg5];
        int var12;
        int var13;
        byte var14;
        if (arg2) {
            var13 = -1;
            var14 = -1;
            var12 = arg0 - 1;
        } else {
            var12 = 0;
            var13 = arg0;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6158.field7491) {
                int[] var18 = this.field6158.method75(var16, (byte) 121);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field6158.method278(arg4 + 122, var16);
                var19 = var22[1];
                var20 = var22[0];
                var21 = var22[2];
            }
            for (int var23 = var12; var23 != var13; var23 += var14) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
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
                int var27 = class463.field6877[var24];
                int var28 = class463.field6877[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class463.field6877[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg1) {
                    var15 += arg0 - 1;
                }
            }
        }
        if (arg4 != -40) {
            this.method2513(null, null, -71, true, -87, false);
        }
        for (int var17 = 0; var17 < this.field6161.length; var17++) {
            this.field6161[var17].method2260(2);
        }
        return var11;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)Lut;", line = 154)
    public static final class465 method2512(int arg0, int arg1, int arg2) {
        if (class66.field977[arg0][arg1][arg2] == null) {
            boolean var3 = class66.field977[0][arg1][arg2] != null && class66.field977[0][arg1][arg2].field6912 != null;
            if (var3 && arg0 >= class76.field1315 - 1) {
                return null;
            }
            class40.method300(arg0, arg1, arg2);
        }
        return class66.field977[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lqs;Ll;IZIZ)[F", line = 170)
    public final float[] method2513(class496 arg0, class196 arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        field6165++;
        class334.field5253 = arg1;
        class485.field7121 = arg0;
        for (int var7 = 0; var7 < this.field6161.length; var7++) {
            this.field6161[var7].method2262((byte) -89, arg4, arg2);
        }
        class34.method258(-33, arg2, arg4);
        if (!arg3) {
            field6169 = null;
        }
        float[] var8 = new float[arg2 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6158.field7491) {
                int[] var16 = this.field6158.method75(var10, (byte) 98);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field6158.method278(-123, var10);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field6159.field7491) {
                var17 = this.field6159.method75(var10, (byte) 110);
            } else {
                var17 = this.field6159.method278(12, var10)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field6164.field7491) {
                var18 = this.field6164.method75(var10, (byte) -27);
            } else {
                var18 = this.field6164.method278(79, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field6161.length; var11++) {
            this.field6161[var11].method2260(2);
        }
        return var8;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLl;Lqs;)Z", line = 283)
    public final boolean method2514(byte arg0, class196 arg1, class496 arg2) {
        field6160++;
        if (class176.field2802 >= 0) {
            for (int var4 = 0; var4 < this.field6162.length; var4++) {
                if (!arg2.method2928(class176.field2802, false, this.field6162[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6162.length; var5++) {
                if (!arg2.method2929(this.field6162[var5], -67)) {
                    return false;
                }
            }
        }
        if (arg0 != 94) {
            method2510(true);
        }
        for (int var6 = 0; var6 < this.field6163.length; var6++) {
            if (!arg1.method194((byte) 89, this.field6163[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(DILqs;IIZLl;)[I", line = 341)
    public final int[] method2515(double arg0, int arg1, class496 arg2, int arg3, int arg4, boolean arg5, class196 arg6) {
        if (arg3 != 19206) {
            this.method2513(null, null, 70, false, -116, false);
        }
        class485.field7121 = arg2;
        field6166++;
        class334.field5253 = arg6;
        for (int var9 = 0; var9 < this.field6161.length; var9++) {
            this.field6161[var9].method2262((byte) -89, arg1, arg4);
        }
        class402.method2495(arg0, -73);
        class34.method258(-89, arg4, arg1);
        int[] var10 = new int[arg1 * arg4 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6158.field7491) {
                int[] var14 = this.field6158.method75(var12, (byte) 116);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field6158.method278(10, var12);
                var15 = var18[2];
                var16 = var18[0];
                var17 = var18[1];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field6159.field7491) {
                var19 = this.field6159.method75(var12, (byte) 92);
            } else {
                var19 = this.field6159.method278(53, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
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
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class463.field6877[var22];
                int var25 = class463.field6877[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class463.field6877[var23];
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
                var10[var11++] = (var25 << 16) + (var27 << 24) + (var24 << 8) + var26;
                if (arg5) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field6161.length; var13++) {
            this.field6161[var13].method2260(2);
        }
        return var10;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V", line = 483)
    public class406() {
        this.field6163 = new int[0];
        this.field6162 = new int[0];
        this.field6164 = new class437(0);
        this.field6164.field7495 = 1;
        this.field6158 = new class437();
        this.field6158.field7495 = 1;
        this.field6159 = new class437();
        this.field6159.field7495 = 1;
        this.field6161 = new class512[] { this.field6158, this.field6159, this.field6164 };
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lia;)V", line = 503)
    public class406(class23 arg0) {
        int var2 = arg0.method126((byte) -84);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field6161 = new class512[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class512 var16 = class224.method1542(255, arg0);
            if (var16.method2457(-1) >= 0) {
                var3++;
            }
            if (var16.method2259((byte) 82) >= 0) {
                var4++;
            }
            int var17 = var16.field7493.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method126((byte) -113);
            }
            this.field6161[var6] = var16;
        }
        this.field6162 = new int[var3];
        this.field6163 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class512 var11 = this.field6161[var9];
            int var12 = var11.field7493.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field7493[var13] = this.field6161[var5[var9][var13]];
            }
            int var14 = var11.method2457(-1);
            int var15 = var11.method2259((byte) 95);
            if (var14 > 0) {
                this.field6162[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6163[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6158 = this.field6161[arg0.method126((byte) -87)];
        this.field6159 = this.field6161[arg0.method126((byte) -73)];
        this.field6164 = this.field6161[arg0.method126((byte) -119)];
        Object var10 = null;
    }
}
