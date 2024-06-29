import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class700 extends class408 {

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "[I")
    private int[] field9644;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "[I")
    private int[] field9646;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "Lbe;")
    private class38 field9648;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "Lbe;")
    private class38 field9650;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "Lbe;")
    private class38 field9641;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "[Lbe;")
    private class38[] field9647;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "Lmia;")
    public static class63 field9649 = new class63(75, 4);

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "Ljava/lang/Object;")
    public static volatile Object field9652 = null;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    public static int field9654 = 0;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field9651;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    public static int field9653;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILvd;ZZIIDLd;)[I", line = 14)
    public final int[] method3970(int arg0, class39 arg1, boolean arg2, boolean arg3, int arg4, int arg5, double arg6, class151 arg7) {
        int var10 = 19 / ((-arg4 - 47) / 56);
        class645.field9036 = arg1;
        field9653++;
        class470.field6863 = arg7;
        for (int var11 = 0; var11 < this.field9647.length; var11++) {
            this.field9647[var11].method194(arg0, 255, arg5);
        }
        class357.method2233(arg6, (byte) 127);
        class409.method2602(arg5, arg0, (byte) 117);
        int[] var12 = new int[arg0 * arg5];
        byte var13;
        int var14;
        int var15;
        if (arg2) {
            var13 = -1;
            var14 = -1;
            var15 = arg0 - 1;
        } else {
            var13 = 1;
            var14 = arg0;
            var15 = 0;
        }
        int var16 = 0;
        for (int var17 = 0; var17 < arg5; var17++) {
            int[] var20;
            int[] var21;
            int[] var22;
            if (this.field9650.field388) {
                int[] var19 = this.field9650.method199((byte) -46, var17);
                var20 = var19;
                var21 = var19;
                var22 = var19;
            } else {
                int[][] var23 = this.field9650.method196(-18210, var17);
                var21 = var23[0];
                var20 = var23[2];
                var22 = var23[1];
            }
            if (arg3) {
                var16 = var17;
            }
            for (int var24 = var15; var24 != var14; var24 += var13) {
                int var25 = var21[var24] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var22[var24] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var27 = var20[var24] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                int var28 = class239.field3474[var26];
                if (var27 < 0) {
                    var27 = 0;
                }
                int var29 = class239.field3474[var25];
                int var30 = class239.field3474[var27];
                int var31 = (var29 << 16) + (var28 << 8) + var30;
                if (var31 != 0) {
                    var31 |= 0xFF000000;
                }
                var12[var16++] = var31;
                if (arg3) {
                    var16 += arg0 - 1;
                }
            }
        }
        for (int var18 = 0; var18 < this.field9647.length; var18++) {
            this.field9647[var18].method198(1);
        }
        return var12;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILvd;ZBLd;)[F", line = 151)
    public final float[] method3971(int arg0, int arg1, class39 arg2, boolean arg3, byte arg4, class151 arg5) {
        if (arg4 <= 71) {
            method3972(80, -94, false);
        }
        class645.field9036 = arg2;
        field9642++;
        class470.field6863 = arg5;
        for (int var7 = 0; var7 < this.field9647.length; var7++) {
            this.field9647[var7].method194(arg1, 255, arg0);
        }
        class409.method2602(arg0, arg1, (byte) 116);
        float[] var8 = new float[arg1 * 4 * arg0];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field9650.field388) {
                int[] var16 = this.field9650.method199((byte) -90, var10);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field9650.method196(-18210, var10);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field9641.field388) {
                var17 = this.field9641.method199((byte) -74, var10);
            } else {
                var17 = this.field9641.method196(-18210, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field9648.field388) {
                var18 = this.field9648.method199((byte) -60, var10);
            } else {
                var18 = this.field9648.method196(-18210, var10)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
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
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field9647.length; var11++) {
            this.field9647[var11].method198(1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIZ)Lsca;", line = 264)
    public static final class46 method3972(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method3973(49);
        }
        field9651++;
        class46 var3 = class405.method2580(arg0, -47);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field621 == null || arg1 >= var3.field621.length) {
            return null;
        } else {
            return var3.field621[arg1];
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 285)
    public static void method3973(int arg0) {
        if (arg0 != -26452) {
            field9654 = -82;
        }
        field9652 = null;
        field9649 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lvd;Ld;B)Z", line = 302)
    public final boolean method3974(class39 arg0, class151 arg1, byte arg2) {
        field9643++;
        if (class734.field10267 < 0) {
            for (int var4 = 0; var4 < this.field9644.length; var4++) {
                if (!arg0.method208(this.field9644[var4], (byte) 70)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9644.length; var5++) {
                if (!arg0.method214(this.field9644[var5], class734.field10267, 0)) {
                    return false;
                }
            }
        }
        if (arg2 != -97) {
            this.method3971(94, 33, null, false, (byte) -49, null);
        }
        for (int var6 = 0; var6 < this.field9646.length; var6++) {
            if (!arg1.method1121(-30695, this.field9646[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V", line = 352)
    public class700() {
        this.field9644 = new int[0];
        this.field9646 = new int[0];
        this.field9648 = new class481(0);
        this.field9648.field382 = 1;
        this.field9650 = new class481();
        this.field9650.field382 = 1;
        this.field9641 = new class481();
        this.field9647 = new class38[] { this.field9650, this.field9641, this.field9648 };
        this.field9641.field382 = 1;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZILvd;IZLd;D)[I", line = 368)
    public final int[] method3975(boolean arg0, int arg1, class39 arg2, int arg3, boolean arg4, class151 arg5, double arg6) {
        class470.field6863 = arg5;
        class645.field9036 = arg2;
        field9645++;
        for (int var9 = 0; var9 < this.field9647.length; var9++) {
            this.field9647[var9].method194(arg3, 255, arg1);
        }
        class357.method2233(arg6, (byte) 55);
        class409.method2602(arg1, arg3, (byte) 87);
        int[] var10 = new int[arg1 * arg3];
        int var11 = 0;
        if (arg0) {
            field9652 = null;
        }
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9650.field388) {
                int[] var14 = this.field9650.method199((byte) -56, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field9650.method196(-18210, var12);
                var17 = var18[2];
                var16 = var18[0];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field9641.field388) {
                var19 = this.field9641.method199((byte) -93, var12);
            } else {
                var19 = this.field9641.method196(-18210, var12)[0];
            }
            if (arg4) {
                var11 = var12;
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
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
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class239.field3474[var21];
                int var25 = class239.field3474[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class239.field3474[var23];
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
                var10[var11++] = (var24 << 16) + (var25 << 8) + (var27 << 24) + var26;
                if (arg4) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field9647.length; var13++) {
            this.field9647[var13].method198(1);
        }
        return var10;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lrg;)V", line = 504)
    public class700(class645 arg0) {
        int var2 = arg0.method3745(-6314);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field9647 = new class38[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class38 var16 = class679.method3896(-126, arg0);
            if (var16.method192((byte) 113) >= 0) {
                var3++;
            }
            if (var16.method197((byte) 52) >= 0) {
                var4++;
            }
            int var17 = var16.field394.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3745(-6314);
            }
            this.field9647[var6] = var16;
        }
        this.field9644 = new int[var3];
        this.field9646 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class38 var11 = this.field9647[var9];
            int var12 = var11.field394.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field394[var13] = this.field9647[var5[var9][var13]];
            }
            int var14 = var11.method192((byte) 113);
            int var15 = var11.method197((byte) 119);
            if (var14 > 0) {
                this.field9644[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9646[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9650 = this.field9647[arg0.method3745(-6314)];
        this.field9641 = this.field9647[arg0.method3745(-6314)];
        Object var10 = null;
        this.field9648 = this.field9647[arg0.method3745(-6314)];
    }
}
