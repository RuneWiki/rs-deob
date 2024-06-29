import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class315 extends class200 {

    @OriginalMember(owner = "client!wr", name = "I", descriptor = "[I")
    private int[] field4753;

    @OriginalMember(owner = "client!wr", name = "y", descriptor = "[I")
    private int[] field4743;

    @OriginalMember(owner = "client!wr", name = "F", descriptor = "Lqn;")
    private class45 field4750;

    @OriginalMember(owner = "client!wr", name = "z", descriptor = "Lqn;")
    private class45 field4744;

    @OriginalMember(owner = "client!wr", name = "u", descriptor = "Lqn;")
    private class45 field4739;

    @OriginalMember(owner = "client!wr", name = "B", descriptor = "[Lqn;")
    private class45[] field4746;

    @OriginalMember(owner = "client!wr", name = "J", descriptor = "I")
    public static int field4754 = 0;

    @OriginalMember(owner = "client!wr", name = "v", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!wr", name = "A", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!wr", name = "C", descriptor = "I")
    public static int field4747;

    @OriginalMember(owner = "client!wr", name = "D", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!wr", name = "E", descriptor = "I")
    public static int field4749;

    @OriginalMember(owner = "client!wr", name = "G", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!wr", name = "H", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!wr", name = "w", descriptor = "Lua;")
    public static class470 field4741;

    @OriginalMember(owner = "client!wr", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4742;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BII)Z")
    public static final boolean method2052(byte arg0, int arg1, int arg2) {
        field4747++;
        if (arg0 == -43) {
            return (arg1 & 0x21) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbu;BLm;)Z")
    public final boolean method2053(class17 arg0, byte arg1, class126 arg2) {
        field4751++;
        if (class217.field3115 < 0) {
            for (int var4 = 0; var4 < this.field4753.length; var4++) {
                if (!arg0.method129(true, this.field4753[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4753.length; var5++) {
                if (!arg0.method137(0, class217.field3115, this.field4753[var5])) {
                    return false;
                }
            }
        }
        if (arg1 != -58) {
            field4741 = null;
        }
        for (int var6 = 0; var6 < this.field4743.length; var6++) {
            if (!arg2.method959(this.field4743[var6], (byte) 94)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static void method2054(byte arg0) {
        if (arg0 != -96) {
            field4754 = 107;
        }
        field4741 = null;
        field4742 = null;
    }

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "(B)J")
    public static final long method2055(byte arg0) {
        field4752++;
        if (arg0 >= -104) {
            method2057((byte) -98, -7);
        }
        return class457.field6847.method883(10679);
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(ZDZLm;ZLbu;II)[I")
    public final int[] method2056(boolean arg0, double arg1, boolean arg2, class126 arg3, boolean arg4, class17 arg5, int arg6, int arg7) {
        field4748++;
        class159.field2472 = arg3;
        class416.field6211 = arg5;
        for (int var10 = 0; var10 < this.field4746.length; var10++) {
            this.field4746[var10].method435((byte) 120, arg7, arg6);
        }
        class130.method970((byte) 111, arg1);
        class121.method910(arg6, arg7, -128);
        int[] var11 = new int[arg6 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var14 = arg6 - 1;
            var13 = -1;
        } else {
            var12 = 1;
            var13 = arg6;
            var14 = 0;
        }
        int var15 = 0;
        if (!arg0) {
            field4741 = null;
        }
        for (int var16 = 0; var16 < arg7; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4744.field844) {
                int[] var18 = this.field4744.method35(0, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field4744.method49(8, var16);
                var21 = var22[2];
                var20 = var22[0];
                var19 = var22[1];
            }
            if (arg2) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
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
                int var27 = class288.field4103[var24];
                int var28 = class288.field4103[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class288.field4103[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg6 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4746.length; var17++) {
            this.field4746[var17].method433(255);
        }
        return var11;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(BI)Lef;")
    public static final class335 method2057(byte arg0, int arg1) {
        field4749++;
        class335[] var2 = class521.method3107((byte) -26);
        if (arg0 >= -16) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field5052 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbu;ZILm;II)[F")
    public final float[] method2058(class17 arg0, boolean arg1, int arg2, class126 arg3, int arg4, int arg5) {
        class159.field2472 = arg3;
        field4745++;
        class416.field6211 = arg0;
        for (int var7 = 0; var7 < this.field4746.length; var7++) {
            this.field4746[var7].method435((byte) 104, arg2, arg5);
        }
        class121.method910(arg5, arg2, -106);
        if (arg4 <= 16) {
            this.method2053(null, (byte) -20, null);
        }
        float[] var8 = new float[arg2 * 4 * arg5];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4744.field844) {
                int[] var16 = this.field4744.method35(0, var10);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field4744.method49(8, var10);
                var13 = var12[0];
                var14 = var12[1];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4739.field844) {
                var17 = this.field4739.method35(0, var10);
            } else {
                var17 = this.field4739.method49(8, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4750.field844) {
                var18 = this.field4750.method35(0, var10);
            } else {
                var18 = this.field4750.method49(8, var10)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4746.length; var11++) {
            this.field4746[var11].method433(255);
        }
        return var8;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(Lbu;IBIDZLm;)[I")
    public final int[] method2059(class17 arg0, int arg1, byte arg2, int arg3, double arg4, boolean arg5, class126 arg6) {
        class159.field2472 = arg6;
        class416.field6211 = arg0;
        field4740++;
        for (int var9 = 0; var9 < this.field4746.length; var9++) {
            this.field4746[var9].method435((byte) 113, arg3, arg1);
        }
        if (arg2 >= -102) {
            return null;
        }
        class130.method970((byte) 109, arg4);
        class121.method910(arg1, arg3, -121);
        int[] var10 = new int[arg1 * arg3 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4744.field844) {
                int[] var14 = this.field4744.method35(0, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4744.method49(8, var12);
                var16 = var18[0];
                var17 = var18[2];
                var15 = var18[1];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4739.field844) {
                var19 = this.field4739.method35(0, var12);
            } else {
                var19 = this.field4739.method49(8, var12)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
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
                int var24 = class288.field4103[var22];
                int var25 = class288.field4103[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class288.field4103[var23];
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
                var10[var11++] = (var27 << 24) + (var25 << 16) + (var24 << 8) + var26;
                if (arg5) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4746.length; var13++) {
            this.field4746[var13].method433(255);
        }
        return var10;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "()V")
    public class315() {
        this.field4753 = new int[0];
        this.field4743 = new int[0];
        this.field4750 = new class164(0);
        this.field4750.field836 = 1;
        this.field4744 = new class164();
        this.field4744.field836 = 1;
        this.field4739 = new class164();
        this.field4746 = new class45[] { this.field4744, this.field4739, this.field4750 };
        this.field4739.field836 = 1;
    }

    @OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(Lcu;)V")
    public class315(class145 arg0) {
        int var2 = arg0.method1063((byte) -58);
        int var3 = 0;
        int var4 = 0;
        this.field4746 = new class45[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class45 var16 = class51.method465(21705, arg0);
            if (var16.method438((byte) -115) >= 0) {
                var3++;
            }
            if (var16.method436((byte) -15) >= 0) {
                var4++;
            }
            int var17 = var16.field845.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1063((byte) 106);
            }
            this.field4746[var6] = var16;
        }
        this.field4753 = new int[var3];
        int var7 = 0;
        this.field4743 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class45 var11 = this.field4746[var9];
            int var12 = var11.field845.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field845[var13] = this.field4746[var5[var9][var13]];
            }
            int var14 = var11.method438((byte) 107);
            int var15 = var11.method436((byte) -15);
            if (var14 > 0) {
                this.field4753[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4743[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4744 = this.field4746[arg0.method1063((byte) 123)];
        this.field4739 = this.field4746[arg0.method1063((byte) -96)];
        Object var10 = null;
        this.field4750 = this.field4746[arg0.method1063((byte) 104)];
    }
}
