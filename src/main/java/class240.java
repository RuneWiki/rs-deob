import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class240 extends class287 {

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "[I")
    private int[] field3310;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "[I")
    private int[] field3308;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Leg;")
    private class34 field3309;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "Leg;")
    private class34 field3314;

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "Leg;")
    private class34 field3315;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "[Leg;")
    private class34[] field3312;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
    public static int field3317 = 0;

    @OriginalMember(owner = "client!pr", name = "E", descriptor = "Lgs;")
    public static class439 field3321 = new class439();

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "I")
    public static int field3316;

    @OriginalMember(owner = "client!pr", name = "A", descriptor = "I")
    public static int field3318;

    @OriginalMember(owner = "client!pr", name = "C", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class487.field7049 = arg6;
        class438.field6315 = arg3;
        if (arg2 != 20284) {
            field3321 = null;
        }
        class385.field5527 = arg1;
        class267.field3596 = arg4;
        class504.field7376 = arg0;
        field3311++;
        class508.field7418 = arg5;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ll;Ldk;B)Z")
    public final boolean method1460(class127 arg0, class421 arg1, byte arg2) {
        field3313++;
        if (arg2 > -52) {
            this.field3314 = null;
        }
        if (class12.field135 >= 0) {
            for (int var4 = 0; var4 < this.field3310.length; var4++) {
                if (!arg1.method2498(-127, class12.field135, this.field3310[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3310.length; var5++) {
                if (!arg1.method2517(this.field3310[var5], (byte) -52)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field3308.length; var6++) {
            if (!arg0.method918(this.field3308[var6], 102)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLoo;)V")
    public static final void method1461(byte arg0, class31 arg1) {
        if (arg1.field469 != null) {
            arg1.field469.field2897 = 0;
        }
        arg1.field470 = false;
        field3320++;
        for (class31 var2 = arg1.method226(); var2 != null; var2 = arg1.method228()) {
            method1461((byte) -18, var2);
        }
        if (arg0 != -18) {
            method1462((byte) -121);
        }
    }

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
    public static void method1462(byte arg0) {
        field3321 = null;
        if (arg0 != 84) {
            method1459(126, -97, 62, -29, -75, -11, -14);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ldk;ZIIILl;D)[I")
    public final int[] method1463(class421 arg0, boolean arg1, int arg2, int arg3, int arg4, class127 arg5, double arg6) {
        class177.field2662 = arg0;
        field3319++;
        int var9 = -120 / ((arg2 - 67) / 54);
        class224.field3171 = arg5;
        for (int var10 = 0; var10 < this.field3312.length; var10++) {
            this.field3312[var10].method248(arg4, (byte) 60, arg3);
        }
        class451.method2646(arg6, 95);
        class481.method2860(arg3, (byte) 97, arg4);
        int[] var11 = new int[arg3 * arg4 * 4];
        int var12 = 0;
        for (int var13 = 0; var13 < arg4; var13++) {
            int[] var16;
            int[] var17;
            int[] var18;
            if (this.field3314.field533) {
                int[] var19 = this.field3314.method64(var13, (byte) 97);
                var18 = var19;
                var17 = var19;
                var16 = var19;
            } else {
                int[][] var15 = this.field3314.method66((byte) -11, var13);
                var16 = var15[2];
                var17 = var15[1];
                var18 = var15[0];
            }
            if (arg1) {
                var12 = var13;
            }
            int[] var20;
            if (this.field3315.field533) {
                var20 = this.field3315.method64(var13, (byte) 107);
            } else {
                var20 = this.field3315.method66((byte) -11, var13)[0];
            }
            for (int var21 = arg3 - 1; var21 >= 0; var21--) {
                int var22 = var18[var21] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var21] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = var16[var21] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class310.field4215[var22];
                int var26 = class310.field4215[var23];
                int var27 = class310.field4215[var24];
                int var28;
                if (var25 == 0 && var26 == 0 && var27 == 0) {
                    var28 = 0;
                } else {
                    var28 = var20[var21] >> 4;
                    if (var28 > 255) {
                        var28 = 255;
                    }
                    if (var28 < 0) {
                        var28 = 0;
                    }
                }
                var11[var12++] = (var26 << 8) + (var25 << 16) + (var28 << 24) + var27;
                if (arg1) {
                    var12 += arg3 - 1;
                }
            }
        }
        for (int var14 = 0; var14 < this.field3312.length; var14++) {
            this.field3312[var14].method249(127);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZIILl;ILdk;)[F")
    public final float[] method1464(boolean arg0, int arg1, int arg2, class127 arg3, int arg4, class421 arg5) {
        field3316++;
        int var7 = 127 % ((arg4 - 3) / 58);
        class177.field2662 = arg5;
        class224.field3171 = arg3;
        for (int var8 = 0; var8 < this.field3312.length; var8++) {
            this.field3312[var8].method248(arg2, (byte) 127, arg1);
        }
        class481.method2860(arg1, (byte) -45, arg2);
        float[] var9 = new float[arg1 * 4 * arg2];
        int var10 = 0;
        for (int var11 = 0; var11 < arg2; var11++) {
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3314.field533) {
                int[] var13 = this.field3314.method64(var11, (byte) -67);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3314.method66((byte) -11, var11);
                var14 = var17[2];
                var16 = var17[1];
                var15 = var17[0];
            }
            int[] var18;
            if (this.field3315.field533) {
                var18 = this.field3315.method64(var11, (byte) -79);
            } else {
                var18 = this.field3315.method66((byte) -11, var11)[0];
            }
            if (arg0) {
                var10 = var11 << 2;
            }
            int[] var19;
            if (this.field3309.field533) {
                var19 = this.field3309.method64(var11, (byte) 65);
            } else {
                var19 = this.field3309.method66((byte) -11, var11)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                float var21 = (float) var18[var20] / 4096.0F;
                if (var21 < 0.0F) {
                    var21 = 0.0F;
                } else if (var21 > 1.0F) {
                    var21 = 1.0F;
                }
                float var22 = ((float) var19[var20] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var9[var10++] = (float) var15[var20] * var22;
                var9[var10++] = (float) var16[var20] * var22;
                var9[var10++] = (float) var14[var20] * var22;
                var9[var10++] = var21;
                if (arg0) {
                    var10 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var12 = 0; var12 < this.field3312.length; var12++) {
            this.field3312[var12].method249(66);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ZLl;IDLdk;IZI)[I")
    public final int[] method1465(boolean arg0, class127 arg1, int arg2, double arg3, class421 arg4, int arg5, boolean arg6, int arg7) {
        class224.field3171 = arg1;
        field3318++;
        class177.field2662 = arg4;
        for (int var10 = 0; var10 < this.field3312.length; var10++) {
            this.field3312[var10].method248(arg7, (byte) 103, arg2);
        }
        class451.method2646(arg3, 95);
        class481.method2860(arg2, (byte) 114, arg7);
        int[] var11 = new int[arg2 * arg7];
        int var12;
        byte var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = -1;
            var14 = arg2 - 1;
        } else {
            var12 = arg2;
            var13 = 1;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field3314.field533) {
                int[] var22 = this.field3314.method64(var16, (byte) -105);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field3314.method66((byte) -11, var16);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg6) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var12; var23 += var13) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class310.field4215[var24];
                int var28 = class310.field4215[var25];
                int var29 = class310.field4215[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg2 - 1;
                }
            }
        }
        if (arg5 != -1) {
            field3317 = -87;
        }
        for (int var17 = 0; var17 < this.field3312.length; var17++) {
            this.field3312[var17].method249(-117);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "()V")
    public class240() {
        this.field3310 = new int[0];
        this.field3308 = new int[0];
        this.field3309 = new class159(0);
        this.field3309.field519 = 1;
        this.field3314 = new class159();
        this.field3314.field519 = 1;
        this.field3315 = new class159();
        this.field3315.field519 = 1;
        this.field3312 = new class34[] { this.field3314, this.field3315, this.field3309 };
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lsv;)V")
    public class240(class319 arg0) {
        int var2 = arg0.method1869(-118);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field3312 = new class34[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class34 var16 = class13.method90(-76, arg0);
            if (var16.method250(true) >= 0) {
                var3++;
            }
            if (var16.method251(-119) >= 0) {
                var4++;
            }
            int var17 = var16.field527.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1869(-126);
            }
            this.field3312[var6] = var16;
        }
        this.field3310 = new int[var3];
        int var7 = 0;
        this.field3308 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class34 var11 = this.field3312[var9];
            int var12 = var11.field527.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field527[var13] = this.field3312[var5[var9][var13]];
            }
            int var14 = var11.method250(true);
            int var15 = var11.method251(-96);
            if (var14 > 0) {
                this.field3310[var7++] = var14;
            }
            if (var15 > 0) {
                this.field3308[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field3314 = this.field3312[arg0.method1869(-104)];
        this.field3315 = this.field3312[arg0.method1869(-106)];
        this.field3309 = this.field3312[arg0.method1869(-105)];
        Object var10 = null;
    }
}
