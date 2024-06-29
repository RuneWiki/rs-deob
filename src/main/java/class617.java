import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class617 extends class49 {

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "[I")
    private int[] field8659;

    @OriginalMember(owner = "client!tm", name = "I", descriptor = "[I")
    private int[] field8667;

    @OriginalMember(owner = "client!tm", name = "N", descriptor = "Luba;")
    private class330 field8671;

    @OriginalMember(owner = "client!tm", name = "G", descriptor = "Luba;")
    private class330 field8666;

    @OriginalMember(owner = "client!tm", name = "M", descriptor = "Luba;")
    private class330 field8670;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "[Luba;")
    private class330[] field8658;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "[I")
    public static int[] field8660 = new int[2];

    @OriginalMember(owner = "client!tm", name = "L", descriptor = "[I")
    public static int[] field8669 = new int[200];

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
    public static int field8662;

    @OriginalMember(owner = "client!tm", name = "D", descriptor = "I")
    public static int field8663;

    @OriginalMember(owner = "client!tm", name = "E", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!tm", name = "F", descriptor = "I")
    public static int field8665;

    @OriginalMember(owner = "client!tm", name = "J", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "Ltf;")
    public static class245 field8656;

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lae;DIILd;ZIZ)[I")
    public final int[] method3557(class283 arg0, double arg1, int arg2, int arg3, class101 arg4, boolean arg5, int arg6, boolean arg7) {
        class591.field8337 = arg4;
        if (arg3 != -29177) {
            field8656 = null;
        }
        field8664++;
        class714.field9928 = arg0;
        for (int var10 = 0; var10 < this.field8658.length; var10++) {
            this.field8658[var10].method2079(true, arg6, arg2);
        }
        class262.method1726(arg1, -25645);
        class769.method4249(arg2, (byte) -77, arg6);
        int[] var11 = new int[arg2 * arg6];
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var12 = arg2 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field8666.field4636) {
                int[] var22 = this.field8666.method464(var16, false);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field8666.method537(0, var16);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
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
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = class43.field441[var25];
                int var28 = class43.field441[var24];
                int var29 = class43.field441[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field8658.length; var17++) {
            this.field8658[var17].method766((byte) 62);
        }
        return var11;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)V")
    public static final void method3558(boolean arg0) {
        class750.field10359 = new class31(8);
        field8662++;
        class170.field2156 = 0;
        if (arg0) {
            method3562(null, null, -49, -115, -126);
        }
        for (class388 var1 = (class388) class361.field5207.method3103((byte) 72); var1 != null; var1 = (class388) class361.field5207.method3104(-10964)) {
            var1.method2410();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLd;Lae;)Z")
    public final boolean method3559(boolean arg0, class101 arg1, class283 arg2) {
        field8668++;
        if (class324.field4578 < 0) {
            for (int var4 = 0; var4 < this.field8659.length; var4++) {
                if (!arg2.method1860(this.field8659[var4], (byte) 124)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field8659.length; var5++) {
                if (!arg2.method1862(48, this.field8659[var5], class324.field4578)) {
                    return false;
                }
            }
        }
        if (arg0) {
            this.field8670 = null;
        }
        for (int var6 = 0; var6 < this.field8667.length; var6++) {
            if (!arg1.method583(12101, this.field8667[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V")
    public static void method3560(int arg0) {
        if (arg0 < -83) {
            field8660 = null;
            field8669 = null;
            field8656 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lae;IZIZLd;D)[I")
    public final int[] method3561(class283 arg0, int arg1, boolean arg2, int arg3, boolean arg4, class101 arg5, double arg6) {
        class591.field8337 = arg5;
        class714.field9928 = arg0;
        field8663++;
        for (int var9 = 0; var9 < this.field8658.length; var9++) {
            this.field8658[var9].method2079(true, arg3, arg1);
        }
        class262.method1726(arg6, -25645);
        class769.method4249(arg1, (byte) -77, arg3);
        int[] var10 = new int[arg1 * arg3];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field8666.field4636) {
                int[] var14 = this.field8666.method464(var12, false);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field8666.method537(0, var12);
                var16 = var18[1];
                var17 = var18[0];
                var15 = var18[2];
            }
            if (arg4) {
                var11 = var12;
            }
            int[] var19;
            if (this.field8670.field4636) {
                var19 = this.field8670.method464(var12, false);
            } else {
                var19 = this.field8670.method537(0, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
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
                int var23 = var15[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class43.field441[var21];
                int var25 = class43.field441[var22];
                int var26 = class43.field441[var23];
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
                var10[var11++] = (var24 << 16) + (var27 << 24) - (-(var25 << 8) - var26);
                if (arg4) {
                    var11 += arg1 - 1;
                }
            }
        }
        if (arg2) {
            field8656 = null;
        }
        for (int var13 = 0; var13 < this.field8658.length; var13++) {
            this.field8658[var13].method766((byte) 32);
        }
        return var10;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/awt/Canvas;Ld;III)Lha;")
    public static final class473 method3562(Canvas arg0, class101 arg1, int arg2, int arg3, int arg4) {
        field8657++;
        if (arg4 > -4) {
            method3562(null, null, 69, -49, -123);
        }
        return new class52(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
    public static final void method3563(int arg0) {
        field8661++;
        class578.field8118 = null;
        if (class55.field651 && class647.method3714(-111) != 1) {
            class578.method3384(114, 0, class664.field9331 == 3 || class664.field9331 == 7, class644.method3691(false), class195.method1278(79), 0);
        }
        int var1 = 0;
        int var2 = 0;
        int var3 = -71 % ((arg0 - 34) / 38);
        if (class55.field651) {
            var1 = class236.method1611(-5110);
            var2 = class339.method2149((byte) 60);
        }
        class577.method3377(-1, var1, var1, class610.field8597, var2, class249.field3700 + var2, 0, class742.field10226 + var1, var2);
        if (class578.field8118 != null) {
            class675.method3844(-1412584499, true, class249.field3700 + var2, class742.field10226 + var1, class578.field8118, class434.field6028.field1452, class182.field2293, class334.field4776, 0, var1, var2);
            class578.field8118 = null;
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLd;IIILae;)[F")
    public final float[] method3564(boolean arg0, class101 arg1, int arg2, int arg3, int arg4, class283 arg5) {
        class591.field8337 = arg1;
        field8665++;
        class714.field9928 = arg5;
        for (int var7 = 0; var7 < this.field8658.length; var7++) {
            this.field8658[var7].method2079(true, arg4, arg3);
        }
        class769.method4249(arg3, (byte) -77, arg4);
        float[] var8 = new float[arg3 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field8666.field4636) {
                int[] var16 = this.field8666.method464(var10, false);
                var15 = var16;
                var14 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field8666.method537(0, var10);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field8670.field4636) {
                var17 = this.field8670.method464(var10, false);
            } else {
                var17 = this.field8670.method537(0, var10)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field8671.field4636) {
                var18 = this.field8671.method464(var10, false);
            } else {
                var18 = this.field8671.method537(arg2, var10)[0];
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        for (int var11 = arg2; var11 < this.field8658.length; var11++) {
            this.field8658[var11].method766((byte) 68);
        }
        return var8;
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
    public class617() {
        this.field8659 = new int[0];
        this.field8667 = new int[0];
        this.field8671 = new class752(0);
        this.field8671.field4632 = 1;
        this.field8666 = new class752();
        this.field8666.field4632 = 1;
        this.field8670 = new class752();
        this.field8670.field4632 = 1;
        this.field8658 = new class330[] { this.field8666, this.field8670, this.field8671 };
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lgga;)V")
    public class617(class511 arg0) {
        int var2 = arg0.method3013(69);
        int var3 = 0;
        int var4 = 0;
        this.field8658 = new class330[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class330 var16 = class261.method1722(arg0, 1);
            if (var16.method767((byte) -70) >= 0) {
                var3++;
            }
            if (var16.method2080(true) >= 0) {
                var4++;
            }
            int var17 = var16.field4624.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3013(67);
            }
            this.field8658[var6] = var16;
        }
        this.field8659 = new int[var3];
        this.field8667 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class330 var11 = this.field8658[var9];
            int var12 = var11.field4624.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field4624[var13] = this.field8658[var5[var9][var13]];
            }
            int var14 = var11.method767((byte) -70);
            int var15 = var11.method2080(true);
            if (var14 > 0) {
                this.field8659[var7++] = var14;
            }
            if (var15 > 0) {
                this.field8667[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field8666 = this.field8658[arg0.method3013(-100)];
        this.field8670 = this.field8658[arg0.method3013(-110)];
        this.field8671 = this.field8658[arg0.method3013(111)];
        Object var10 = null;
    }
}
