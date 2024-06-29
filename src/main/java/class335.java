import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class335 extends class107 {

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "[I")
    private int[] field4716;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "[I")
    private int[] field4717;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "Ltv;")
    private class585 field4718;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "Ltv;")
    private class585 field4715;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "Ltv;")
    private class585 field4714;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "[Ltv;")
    private class585[] field4709;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4719 = new Rectangle[100];

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "Lad;")
    public static class446 field4713 = new class446();

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field4720 = 0;

    @OriginalMember(owner = "client!vc", name = "y", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "[Lrca;")
    public static class478[] field4721;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Ld;ILwia;)Z", line = 3)
    public final boolean method2127(class160 arg0, int arg1, class791 arg2) {
        field4712++;
        if (class600.field8419 >= 0) {
            for (int var4 = 0; var4 < this.field4717.length; var4++) {
                if (!arg2.method4359(class600.field8419, arg1, this.field4717[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4717.length; var5++) {
                if (!arg2.method4349((byte) -102, this.field4717[var5])) {
                    return false;
                }
            }
        }
        for (int var6 = arg1; var6 < this.field4716.length; var6++) {
            if (!arg0.method1212(122, this.field4716[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V", line = 56)
    public static void method2128(boolean arg0) {
        if (arg0) {
            field4721 = null;
            field4713 = null;
            field4719 = null;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lwia;DZILd;IZB)[I", line = 80)
    public final int[] method2129(class791 arg0, double arg1, boolean arg2, int arg3, class160 arg4, int arg5, boolean arg6, byte arg7) {
        class54.field704 = arg4;
        field4710++;
        class378.field5212 = arg0;
        for (int var10 = 0; var10 < this.field4709.length; var10++) {
            this.field4709[var10].method1360(arg3, (byte) -92, arg5);
        }
        class691.method3903(arg1, 0);
        class686.method3867(-9851, arg5, arg3);
        int[] var11 = new int[arg3 * arg5];
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg3;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4715.field8266) {
                int[] var22 = this.field4715.method55(var16, 124);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field4715.method58(false, var16);
                var19 = var18[2];
                var20 = var18[0];
                var21 = var18[1];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
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
                int var27 = class310.field4433[var24];
                int var28 = class310.field4433[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class310.field4433[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg3 - 1;
                }
            }
        }
        if (arg7 != -46) {
            this.field4717 = null;
        }
        for (int var17 = 0; var17 < this.field4709.length; var17++) {
            this.field4709[var17].method935((byte) -36);
        }
        return var11;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ZIDILd;ZLwia;)[I", line = 220)
    public final int[] method2130(boolean arg0, int arg1, double arg2, int arg3, class160 arg4, boolean arg5, class791 arg6) {
        class378.field5212 = arg6;
        field4708++;
        class54.field704 = arg4;
        for (int var9 = 0; var9 < this.field4709.length; var9++) {
            this.field4709[var9].method1360(arg3, (byte) -124, arg1);
        }
        class691.method3903(arg2, 0);
        class686.method3867(-9851, arg1, arg3);
        if (arg5) {
            return null;
        }
        int[] var10 = new int[arg1 * arg3];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4715.field8266) {
                int[] var14 = this.field4715.method55(var12, 125);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4715.method58(arg5, var12);
                var16 = var18[0];
                var17 = var18[2];
                var15 = var18[1];
            }
            int[] var19;
            if (this.field4714.field8266) {
                var19 = this.field4714.method55(var12, 125);
            } else {
                var19 = this.field4714.method58(false, var12)[0];
            }
            if (arg0) {
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
                int var24 = class310.field4433[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class310.field4433[var22];
                int var26 = class310.field4433[var23];
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
                var10[var11++] = (var24 << 16) + (var27 << 24) - (-(var25 << 8) + -var26);
                if (arg0) {
                    var11 += arg3 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4709.length; var13++) {
            this.field4709[var13].method935((byte) -36);
        }
        return var10;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V", line = 354)
    public class335() {
        this.field4716 = new int[0];
        this.field4717 = new int[0];
        this.field4718 = new class610(0);
        this.field4718.field8260 = 1;
        this.field4715 = new class610();
        this.field4715.field8260 = 1;
        this.field4714 = new class610();
        this.field4709 = new class585[] { this.field4715, this.field4714, this.field4718 };
        this.field4714.field8260 = 1;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILwia;Ld;ZII)[F", line = 370)
    public final float[] method2131(int arg0, class791 arg1, class160 arg2, boolean arg3, int arg4, int arg5) {
        class54.field704 = arg2;
        class378.field5212 = arg1;
        field4711++;
        for (int var7 = 0; var7 < this.field4709.length; var7++) {
            this.field4709[var7].method1360(arg5, (byte) -105, arg0);
        }
        class686.method3867(-9851, arg0, arg5);
        float[] var8 = new float[arg0 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg0; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4715.field8266) {
                int[] var12 = this.field4715.method55(var10, 127);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field4715.method58(false, var10);
                var15 = var16[1];
                var14 = var16[0];
                var13 = var16[2];
            }
            int[] var17;
            if (this.field4714.field8266) {
                var17 = this.field4714.method55(var10, 125);
            } else {
                var17 = this.field4714.method58(false, var10)[0];
            }
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4718.field8266) {
                var18 = this.field4718.method55(var10, 125);
            } else {
                var18 = this.field4718.method58(false, var10)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg3) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        int var11 = 0;
        if (arg4 >= -120) {
            this.field4715 = null;
        }
        while (var11 < this.field4709.length) {
            this.field4709[var11].method935((byte) -36);
            var11++;
        }
        return var8;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Leba;", line = 483)
    public static final class613 method2132(int arg0, int arg1, int arg2) {
        class46 var3 = class767.field10562[arg0][arg1][arg2];
        return var3 == null ? null : var3.field582;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lso;)V", line = 489)
    public class335(class494 arg0) {
        int var2 = arg0.method2964((byte) 103);
        int var3 = 0;
        int var4 = 0;
        this.field4709 = new class585[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class585 var16 = class92.method684(-84, arg0);
            if (var16.method936(64) >= 0) {
                var3++;
            }
            if (var16.method1361((byte) -96) >= 0) {
                var4++;
            }
            int var17 = var16.field8267.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2964((byte) 60);
            }
            this.field4709[var6] = var16;
        }
        this.field4717 = new int[var3];
        int var7 = 0;
        this.field4716 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class585 var11 = this.field4709[var9];
            int var12 = var11.field8267.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field8267[var13] = this.field4709[var5[var9][var13]];
            }
            int var14 = var11.method936(65);
            int var15 = var11.method1361((byte) -96);
            if (var14 > 0) {
                this.field4717[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4716[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4715 = this.field4709[arg0.method2964((byte) 67)];
        this.field4714 = this.field4709[arg0.method2964((byte) 104)];
        Object var10 = null;
        this.field4718 = this.field4709[arg0.method2964((byte) 93)];
    }
}
