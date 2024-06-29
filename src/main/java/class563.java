import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class563 extends class132 {

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
    private int[] field7805;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "[I")
    private int[] field7804;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "Lnd;")
    private class466 field7800;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Lnd;")
    private class466 field7802;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lnd;")
    private class466 field7803;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "[Lnd;")
    private class466[] field7801;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field7806 = -50;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILan;ILn;ZI)[F")
    public final float[] method3210(int arg0, class21 arg1, int arg2, class17 arg3, boolean arg4, int arg5) {
        class309.field4175 = arg3;
        class368.field5010 = arg1;
        field7798++;
        for (int var7 = 0; var7 < this.field7801.length; var7++) {
            this.field7801[var7].method1137(255, arg5, arg2);
        }
        class33.method342(arg2, arg5, (byte) 9);
        float[] var8 = new float[arg2 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field7802.field6565) {
                int[] var16 = this.field7802.method2(var10, arg0 ^ 0xFFFFFD5D);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field7802.method33(var10, false);
                var13 = var12[0];
                var14 = var12[2];
                var15 = var12[1];
            }
            int[] var17;
            if (this.field7803.field6565) {
                var17 = this.field7803.method2(var10, arg0 ^ 0xFFFFFD5D);
            } else {
                var17 = this.field7803.method33(var10, false)[0];
            }
            int[] var18;
            if (this.field7800.field6565) {
                var18 = this.field7800.method2(var10, arg0 + 675);
            } else {
                var18 = this.field7800.method33(var10, false)[0];
            }
            if (arg4) {
                var9 = var10 << 2;
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg4) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field7801.length; var11++) {
            this.field7801[var11].method1078(arg0 + 562);
        }
        if (arg0 != -675) {
            field7806 = 22;
        }
        return var8;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ln;ZIIDLan;B)[I")
    public final int[] method3211(class17 arg0, boolean arg1, int arg2, int arg3, double arg4, class21 arg5, byte arg6) {
        field7808++;
        class368.field5010 = arg5;
        class309.field4175 = arg0;
        for (int var9 = 0; var9 < this.field7801.length; var9++) {
            this.field7801[var9].method1137(arg6 ^ 0xFFFFFF61, arg2, arg3);
        }
        class177.method1126(19048, arg4);
        class33.method342(arg3, arg2, (byte) 9);
        int[] var10 = new int[arg3 * 4 * arg2];
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field7802.field6565) {
                int[] var14 = this.field7802.method2(var12, 0);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field7802.method33(var12, false);
                var16 = var18[0];
                var15 = var18[1];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field7803.field6565) {
                var19 = this.field7803.method2(var12, 0);
            } else {
                var19 = this.field7803.method33(var12, false)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg2 - 1; var20 >= 0; var20--) {
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
                int var24 = class75.field1194[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class75.field1194[var22];
                int var26 = class75.field1194[var23];
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
                var10[var11++] = (var27 << 24) + (var25 << 8) + (var24 << 16) + var26;
                if (arg1) {
                    var11 += arg2 - 1;
                }
            }
        }
        if (arg6 != -98) {
            method3214(-19, -5, -59);
        }
        for (int var13 = 0; var13 < this.field7801.length; var13++) {
            this.field7801[var13].method1078(-117);
        }
        return var10;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lan;Ln;I)Z")
    public final boolean method3212(class21 arg0, class17 arg1, int arg2) {
        field7797++;
        if (class341.field4600 >= 0) {
            for (int var4 = 0; var4 < this.field7804.length; var4++) {
                if (!arg0.method229(class341.field4600, -1, this.field7804[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field7804.length; var5++) {
                if (!arg0.method221(this.field7804[var5], (byte) 95)) {
                    return false;
                }
            }
        }
        for (int var6 = arg2; var6 < this.field7805.length; var6++) {
            if (!arg1.method188(this.field7805[var6], -113)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILr;IIZ)Lnk;")
    public static final class611 method3213(int arg0, class157 arg1, int arg2, int arg3, boolean arg4) {
        field7796++;
        if (arg1 == null) {
            return null;
        }
        class611 var5 = new class611(arg2, arg0, arg3, arg1.method150(), arg1.method139(), arg1.method148(), arg1.method133(), arg1.method128(), arg1.method135(), arg1.method151());
        if (!arg4) {
            method3214(123, -128, -43);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z")
    public static final boolean method3214(int arg0, int arg1, int arg2) {
        int var3 = 115 / ((4 - arg1) / 37);
        field7795++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ln;IZLan;IDZI)[I")
    public final int[] method3215(class17 arg0, int arg1, boolean arg2, class21 arg3, int arg4, double arg5, boolean arg6, int arg7) {
        class368.field5010 = arg3;
        field7799++;
        class309.field4175 = arg0;
        for (int var10 = 0; var10 < this.field7801.length; var10++) {
            this.field7801[var10].method1137(arg7 ^ 0xFF, arg1, arg4);
        }
        class177.method1126(19048, arg5);
        class33.method342(arg4, arg1, (byte) 9);
        int[] var11 = new int[arg1 * arg4];
        int var12;
        byte var13;
        int var14;
        if (arg2) {
            var13 = -1;
            var14 = -1;
            var12 = arg1 - 1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field7802.field6565) {
                int[] var22 = this.field7802.method2(var16, 0);
                var21 = var22;
                var19 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field7802.method33(var16, false);
                var19 = var18[1];
                var20 = var18[2];
                var21 = var18[0];
            }
            if (arg6) {
                var15 = var16;
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var21[var23] >> 4;
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
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class75.field1194[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class75.field1194[var25];
                int var29 = class75.field1194[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg1 - 1;
                }
            }
        }
        for (int var17 = arg7; var17 < this.field7801.length; var17++) {
            this.field7801[var17].method1078(-116);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class563() {
        this.field7805 = new int[0];
        this.field7804 = new int[0];
        this.field7800 = new class402(0);
        this.field7800.field6566 = 1;
        this.field7802 = new class402();
        this.field7802.field6566 = 1;
        this.field7803 = new class402();
        this.field7801 = new class466[] { this.field7802, this.field7803, this.field7800 };
        this.field7803.field6566 = 1;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Ldaa;)V")
    public class563(class11 arg0) {
        int var2 = arg0.method110((byte) 75);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field7801 = new class466[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class466 var16 = class619.method3606(arg0, 0);
            if (var16.method1082(0) >= 0) {
                var3++;
            }
            if (var16.method1138((byte) 78) >= 0) {
                var4++;
            }
            int var17 = var16.field6567.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method110((byte) 107);
            }
            this.field7801[var6] = var16;
        }
        this.field7804 = new int[var3];
        int var7 = 0;
        this.field7805 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class466 var11 = this.field7801[var9];
            int var12 = var11.field6567.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field6567[var13] = this.field7801[var5[var9][var13]];
            }
            int var14 = var11.method1082(0);
            int var15 = var11.method1138((byte) 125);
            if (var14 > 0) {
                this.field7804[var7++] = var14;
            }
            if (var15 > 0) {
                this.field7805[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field7802 = this.field7801[arg0.method110((byte) 86)];
        this.field7803 = this.field7801[arg0.method110((byte) 32)];
        this.field7800 = this.field7801[arg0.method110((byte) 48)];
        Object var10 = null;
    }
}
