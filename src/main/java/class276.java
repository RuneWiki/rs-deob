import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public class class276 extends class192 {

    @OriginalMember(owner = "client!haa", name = "J", descriptor = "I")
    private int field3616 = 1;

    @OriginalMember(owner = "client!haa", name = "I", descriptor = "I")
    private int field3615 = 1;

    @OriginalMember(owner = "client!haa", name = "K", descriptor = "I")
    public static int field3617 = 0;

    @OriginalMember(owner = "client!haa", name = "P", descriptor = "Lra;")
    public static class361 field3622 = new class361(73, 8);

    @OriginalMember(owner = "client!haa", name = "L", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!haa", name = "M", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!haa", name = "N", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!haa", name = "O", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!haa", name = "Q", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!haa", name = "R", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!haa", name = "S", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!haa", name = "<init>", descriptor = "()V", line = 6)
    public class276() {
        super(1, false);
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IB)[[I", line = 21)
    public final int[][] method107(int arg0, byte arg1) {
        ++field3618;
        int var3 = -117 / ((arg1 - -14) / 34);
        int[][] var4 = super.field2467.method2466(arg0, 0);
        if (super.field2467.field5565) {
            int var5 = this.field3616 + 1 + this.field3616;
            int var6 = 65536 / var5;
            int var7 = this.field3615 + 1 - -this.field3615;
            int var8 = 65536 / var7;
            int[][][] var9 = new int[var5][][];
            for (int var10 = -this.field3616 + arg0; this.field3616 + arg0 >= var10; ++var10) {
                int[][] var20 = this.method1251(0, class95.field1247 & var10, (byte) 121);
                int[][] var21 = new int[3][class561.field7319];
                int var22 = 0;
                int var23 = 0;
                int var24 = 0;
                int[] var25 = var20[0];
                int[] var26 = var20[1];
                int[] var27 = var20[2];
                for (int var28 = -this.field3615; ~var28 >= ~this.field3615; ++var28) {
                    int var38 = class337.field4356 & var28;
                    var22 += var25[var38];
                    var24 += var27[var38];
                    var23 += var26[var38];
                }
                int[] var29 = var21[0];
                int[] var30 = var21[1];
                int[] var31 = var21[2];
                int var32 = 0;
                while (~var32 > ~class561.field7319) {
                    var29[var32] = var8 * var22 >> 16;
                    var30[var32] = var8 * var23 >> 16;
                    var31[var32] = var8 * var24 >> 16;
                    int var33 = -this.field3615 + var32 & class337.field4356;
                    int var34 = var24 - var27[var33];
                    ++var32;
                    int var35 = var22 - var25[var33];
                    int var36 = var23 - var26[var33];
                    int var37 = var32 - -this.field3615 & class337.field4356;
                    var22 = var25[var37] + var35;
                    var23 = var26[var37] + var36;
                    var24 = var27[var37] + var34;
                }
                var9[var10 - -this.field3616 + -arg0] = var21;
            }
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var4[2];
            for (int var14 = 0; ~class561.field7319 < ~var14; ++var14) {
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                for (int var18 = 0; var18 < var5; ++var18) {
                    int[][] var19 = var9[var18];
                    var15 += var19[0][var14];
                    var17 += var19[2][var14];
                    var16 += var19[1][var14];
                }
                var11[var14] = var6 * var15 >> 16;
                var12[var14] = var6 * var16 >> 16;
                var13[var14] = var6 * var17 >> 16;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ILfd;I)V", line = 154)
    public final void method109(int arg0, class418 arg1, int arg2) {
        ++field3620;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 == 2) {
                    super.field2449 = ~arg1.method2396(arg2 ^ -12129) == -2;
                }
            } else {
                this.field3616 = arg1.method2396(-22);
            }
        } else {
            this.field3615 = arg1.method2396(-122);
        }
        if (arg2 != -12160) {
            this.method118(-121, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(IB)[I", line = 197)
    public final int[] method118(int arg0, byte arg1) {
        ++field3623;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            int var4 = this.field3616 + 1 + this.field3616;
            int var5 = 65536 / var4;
            int var6 = this.field3615 - -this.field3615 - -1;
            int var7 = 65536 / var6;
            int[][] var8 = new int[var4][];
            for (int var9 = -this.field3616 + arg0; ~var9 >= ~(this.field3616 + arg0); ++var9) {
                int[] var13 = this.method1253(0, class95.field1247 & var9, 0);
                int[] var14 = new int[class561.field7319];
                int var15 = 0;
                for (int var16 = -this.field3615; var16 <= this.field3615; ++var16) {
                    var15 += var13[var16 & class337.field4356];
                }
                int var17 = 0;
                while (class561.field7319 > var17) {
                    var14[var17] = var7 * var15 >> 16;
                    int var18 = var15 - var13[class337.field4356 & -this.field3615 + var17];
                    ++var17;
                    var15 = var13[var17 - -this.field3615 & class337.field4356] + var18;
                }
                var8[-arg0 + this.field3616 + var9] = var14;
            }
            for (int var10 = 0; ~class561.field7319 < ~var10; ++var10) {
                int var11 = 0;
                for (int var12 = 0; var12 < var4; ++var12) {
                    var11 += var8[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        if (arg1 > -123) {
            method1675(-37, -109, (byte[]) null, -9, 77, (byte) -15, -36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!haa", name = "e", descriptor = "(B)V", line = 285)
    public static void method1672(byte arg0) {
        field3622 = null;
        if (arg0 != 25) {
            field3622 = null;
        }
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(ZB)V", line = 296)
    public static final void method1673(boolean arg0, byte arg1) {
        if (class412.field5313 == null) {
            class66.method540(16384);
        }
        if (arg1 < 103) {
            method1672((byte) 34);
        }
        ++field3619;
        if (arg0) {
            class412.field5313.method758((byte) -110);
        }
    }

    @OriginalMember(owner = "client!haa", name = "b", descriptor = "(IBI)V", line = 314)
    public static final void method1674(int arg0, byte arg1, int arg2) {
        ++class285.field3702;
        ++field3624;
        class11 var3 = class130.method931(class649.field9035, (byte) 54, class201.field2616);
        var3.field114.method2353(arg2, (byte) -67);
        if (arg1 > -107) {
            method1672((byte) 46);
        }
        var3.field114.method2386(arg0, 1103587288);
        class100.method760(var3, -126);
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II[BIIBI)Z", line = 332)
    public static final boolean method1675(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field3625;
        int var7 = arg6 % arg1;
        int var8;
        if (~var7 != -1) {
            var8 = arg1 - var7;
        } else {
            var8 = 0;
        }
        int var9 = -((arg1 + arg4 - 1) / arg1);
        int var10 = -((arg1 + arg6 - 1) / arg1);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg2[arg3] == -1) {
                    return true;
                }
                arg3 += arg1;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg0 + var13;
        }
        if (arg5 != 67) {
            field3617 = 68;
        }
        return false;
    }

    @OriginalMember(owner = "client!haa", name = "a", descriptor = "(II)I", line = 390)
    public static final int method1676(int arg0, int arg1) {
        if (arg0 != 14654) {
            return 61;
        } else {
            ++field3621;
            return arg1 >>> 8;
        }
    }
}
