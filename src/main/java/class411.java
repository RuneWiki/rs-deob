import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class411 extends class251 {

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "[I")
    private int[] field5956;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "[I")
    private int[] field5960;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "Let;")
    private class404 field5957;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "Let;")
    private class404 field5959;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Let;")
    private class404 field5953;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "[Let;")
    private class404[] field5954;

    @OriginalMember(owner = "client!qs", name = "D", descriptor = "Loe;")
    public static class127 field5961 = new class127(102, 6);

    @OriginalMember(owner = "client!qs", name = "F", descriptor = "I")
    public static int field5963 = 0;

    @OriginalMember(owner = "client!qs", name = "H", descriptor = "[I")
    public static int[] field5965 = new int[32];

    @OriginalMember(owner = "client!qs", name = "I", descriptor = "Lbg;")
    public static class310 field5966 = new class310(65, -1);

    @OriginalMember(owner = "client!qs", name = "J", descriptor = "Loe;")
    public static class127 field5967 = new class127(41, 5);

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!qs", name = "E", descriptor = "I")
    public static int field5962;

    @OriginalMember(owner = "client!qs", name = "G", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Llt;ZDILvl;II)[I")
    public final int[] method2424(class458 arg0, boolean arg1, double arg2, int arg3, class11 arg4, int arg5, int arg6) {
        class490.field7452 = arg4;
        class193.field3048 = arg0;
        field5958++;
        for (int var9 = 0; var9 < this.field5954.length; var9++) {
            this.field5954[var9].method2395((byte) 125, arg3, arg6);
        }
        class331.method2056(arg2, arg5);
        class223.method1355(arg6, arg3, (byte) 14);
        int[] var10 = new int[arg3 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field5959.field5873) {
                int[] var14 = this.field5959.method90(-76, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field5959.method89(-1, var12);
                var17 = var18[2];
                var16 = var18[1];
                var15 = var18[0];
            }
            if (arg1) {
                var11 = var12;
            }
            int[] var19;
            if (this.field5953.field5873) {
                var19 = this.field5953.method90(arg5 ^ 0xFFFFFF6C, var12);
            } else {
                var19 = this.field5953.method89(-1, var12)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var16[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class145.field2356[var21];
                int var25 = class145.field2356[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class145.field2356[var23];
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
                var10[var11++] = (var25 << 8) + (var24 << 16) + (var27 << 24) + var26;
                if (arg1) {
                    var11 += arg3 - 1;
                }
            }
        }
        if (arg5 != 255) {
            this.method2429(4, null, false, -74, false, (byte) 59, null, -0.9653000629892231D);
        }
        for (int var13 = 0; var13 < this.field5954.length; var13++) {
            this.field5954[var13].method2397(99);
        }
        return var10;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZILlt;Lvl;I)[F")
    public final float[] method2425(int arg0, boolean arg1, int arg2, class458 arg3, class11 arg4, int arg5) {
        class193.field3048 = arg3;
        class490.field7452 = arg4;
        field5962++;
        for (int var7 = arg0; var7 < this.field5954.length; var7++) {
            this.field5954[var7].method2395((byte) 120, arg2, arg5);
        }
        class223.method1355(arg5, arg2, (byte) 14);
        float[] var8 = new float[arg2 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field5959.field5873) {
                int[] var12 = this.field5959.method90(arg0 ^ 0xFFFFFFC8, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field5959.method89(-1, var10);
                var14 = var16[2];
                var13 = var16[0];
                var15 = var16[1];
            }
            int[] var17;
            if (this.field5953.field5873) {
                var17 = this.field5953.method90(-49, var10);
            } else {
                var17 = this.field5953.method89(-1, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field5957.field5873) {
                var18 = this.field5957.method90(-101, var10);
            } else {
                var18 = this.field5957.method89(-1, var10)[0];
            }
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg2 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field5954.length; var11++) {
            this.field5954[var11].method2397(arg0 + 86);
        }
        return var8;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public static void method2426(byte arg0) {
        field5961 = null;
        field5966 = null;
        field5965 = null;
        field5967 = null;
        if (arg0 < 107) {
            method2428(81, -123, -77);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lvl;ILlt;)Z")
    public final boolean method2427(class11 arg0, int arg1, class458 arg2) {
        if (arg1 != 16807) {
            this.method2424(null, true, -0.033786818790324635D, 111, null, -112, 124);
        }
        field5952++;
        if (class268.field4043 >= 0) {
            for (int var4 = 0; var4 < this.field5960.length; var4++) {
                if (!arg2.method2721((byte) 111, class268.field4043, this.field5960[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field5960.length; var5++) {
                if (!arg2.method2729(this.field5960[var5], -9055)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field5956.length; var6++) {
            if (!arg0.method61(this.field5956[var6], (byte) -85)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z")
    public static final boolean method2428(int arg0, int arg1, int arg2) {
        field5964++;
        if (arg2 > -120) {
            field5961 = null;
        }
        return class313.method1873(arg0, (byte) 85, arg1) | (arg0 & 0x70000) != 0 || class178.method1118((byte) -90, arg0, arg1);
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
    public class411() {
        this.field5956 = new int[0];
        this.field5960 = new int[0];
        this.field5957 = new class17(0);
        this.field5957.field5884 = 1;
        this.field5959 = new class17();
        this.field5959.field5884 = 1;
        this.field5953 = new class17();
        this.field5954 = new class404[] { this.field5959, this.field5953, this.field5957 };
        this.field5953.field5884 = 1;
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lha;)V")
    public class411(class40 arg0) {
        int var2 = arg0.method257((byte) 107);
        int var3 = 0;
        int var4 = 0;
        this.field5954 = new class404[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class404 var16 = class439.method2562(arg0, (byte) -112);
            if (var16.method2399(126) >= 0) {
                var3++;
            }
            if (var16.method2398(0) >= 0) {
                var4++;
            }
            int var17 = var16.field5876.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method257((byte) 29);
            }
            this.field5954[var6] = var16;
        }
        this.field5960 = new int[var3];
        int var7 = 0;
        this.field5956 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class404 var11 = this.field5954[var9];
            int var12 = var11.field5876.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5876[var13] = this.field5954[var5[var9][var13]];
            }
            int var14 = var11.method2399(126);
            int var15 = var11.method2398(0);
            if (var14 > 0) {
                this.field5960[var7++] = var14;
            }
            if (var15 > 0) {
                this.field5956[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field5959 = this.field5954[arg0.method257((byte) 43)];
        this.field5953 = this.field5954[arg0.method257((byte) 70)];
        this.field5957 = this.field5954[arg0.method257((byte) 48)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILvl;ZIZBLlt;D)[I")
    public final int[] method2429(int arg0, class11 arg1, boolean arg2, int arg3, boolean arg4, byte arg5, class458 arg6, double arg7) {
        if (arg5 != 94) {
            this.field5957 = null;
        }
        field5955++;
        class193.field3048 = arg6;
        class490.field7452 = arg1;
        for (int var10 = 0; var10 < this.field5954.length; var10++) {
            this.field5954[var10].method2395((byte) 122, arg3, arg0);
        }
        class331.method2056(arg7, 255);
        class223.method1355(arg0, arg3, (byte) 14);
        int[] var11 = new int[arg0 * arg3];
        byte var12;
        int var13;
        int var14;
        if (arg2) {
            var14 = -1;
            var12 = -1;
            var13 = arg3 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg4) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field5959.field5873) {
                int[] var22 = this.field5959.method90(arg5 - 217, var16);
                var20 = var22;
                var21 = var22;
                var19 = var22;
            } else {
                int[][] var18 = this.field5959.method89(-1, var16);
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
                int var27 = class145.field2356[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class145.field2356[var25];
                int var29 = class145.field2356[var26];
                int var30 = (var28 << 8) + (var27 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field5954.length; var17++) {
            this.field5954[var17].method2397(74);
        }
        return var11;
    }
}
