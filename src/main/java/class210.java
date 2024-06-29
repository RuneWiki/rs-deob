import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class210 extends class182 {

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field3543 = 32768;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field3545 = 0;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field3549 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "[I")
    public static int[] field3540 = new int[4096];

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Llh;")
    public static class181 field3541;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        ++field3548;
        if (~arg2 != -1) {
            if (arg2 == 1) {
                super.field2896 = ~arg1.method1802((byte) -115) == -2;
            }
        } else {
            this.field3543 = arg1.method1821((byte) 51) << 4;
        }
        if (arg0) {
            field3545 = 53;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static void method1471(byte arg0) {
        field3540 = null;
        if (arg0 <= 14) {
            method1471((byte) -60);
        }
        field3541 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        int[] var3 = super.field2911.method77(arg1, -114);
        if (arg0) {
            field3541 = null;
        }
        if (super.field2911.field287) {
            int[] var4 = this.method1323(1, -17707, arg1);
            int[] var5 = this.method1323(2, -17707, arg1);
            for (int var6 = 0; ~var6 > ~class4.field116; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3543 >> 12;
                int var9 = class289.field4765[var7] * var8 >> 12;
                int var10 = (var9 >> 12) + var6 & class103.field1644;
                int var11 = class22.field391[var7] * var8 >> 12;
                int var12 = (var11 >> 12) + arg1 & class107.field1749;
                int[] var13 = this.method1323(0, -17707, var12);
                var3[var6] = var13[var10];
            }
        }
        ++field3544;
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3546;
        int var8 = 0;
        int var9 = 0;
        int var10 = arg5;
        int var11 = arg1 - arg3;
        int var12 = -arg3 + arg5;
        int var13 = var12 * var12;
        int var14 = var11 * var11;
        int var15 = arg1 * arg1;
        int var16 = arg5 * arg5;
        int var17 = var16 << 1;
        int var18 = var13 << 1;
        int var19 = var14 << 1;
        int var20 = var15 << 1;
        int var21 = arg5 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var15 + var17;
        int var24 = var16 - (var21 - 1) * var20;
        int var25 = var13 - (var22 + -1) * var19;
        int var26 = (-var22 + 1) * var14 + var18;
        int var27 = var16 << 2;
        int var28 = var15 << 2;
        int var29 = var14 << 2;
        int var30 = var13 << 2;
        int var31 = (var21 + -3) * var20;
        int var32 = var17 * 3;
        int var33 = (var22 + -3) * var19;
        int var34 = var18 * 3;
        int var35 = (arg5 - 1) * var28;
        int var36 = var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class41.field630[arg2];
        class134.method996(arg7 ^ arg7, arg4 - var11, -arg1 + arg4, arg0, var39);
        class134.method996(0, arg4 + var11, arg4 - var11, arg6, var39);
        class134.method996(0, arg1 + arg4, arg4 - -var11, arg0, var39);
        while (~var10 < -1) {
            boolean var40 = var12 >= var10;
            if (var40) {
                if (var26 < 0) {
                    while (var26 < 0) {
                        var25 += var37;
                        var37 += var30;
                        var26 += var34;
                        ++var9;
                        var34 += var30;
                    }
                }
                if (var25 < 0) {
                    var25 += var37;
                    ++var9;
                    var37 += var30;
                    var26 += var34;
                    var34 += var30;
                }
                var25 += -var33;
                var26 += -var38;
                var38 -= var29;
                var33 -= var29;
            }
            --var10;
            if (~var23 > -1) {
                while (var23 < 0) {
                    var23 += var32;
                    var32 += var27;
                    var24 += var36;
                    ++var8;
                    var36 += var27;
                }
            }
            int var41 = arg2 + var10;
            if (var24 < 0) {
                ++var8;
                var24 += var36;
                var36 += var27;
                var23 += var32;
                var32 += var27;
            }
            var23 += -var35;
            int var42 = -var8 + arg4;
            var24 += -var31;
            var31 -= var28;
            var35 -= var28;
            int var43 = arg2 - var10;
            int var44 = arg4 - -var8;
            if (!var40) {
                class134.method996(0, var44, var42, arg0, class41.field630[var43]);
                class134.method996(arg7 ^ 995311490, var44, var42, arg0, class41.field630[var41]);
            } else {
                int var45 = arg4 - -var9;
                int var46 = -var9 + arg4;
                class134.method996(0, var46, var42, arg0, class41.field630[var43]);
                class134.method996(0, var45, var46, arg6, class41.field630[var43]);
                class134.method996(0, var44, var45, arg0, class41.field630[var43]);
                class134.method996(0, var46, var42, arg0, class41.field630[var41]);
                class134.method996(0, var45, var46, arg6, class41.field630[var41]);
                class134.method996(0, var44, var45, arg0, class41.field630[var41]);
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)[[I")
    public final int[][] method157(byte arg0, int arg1) {
        int var3 = -43 % ((arg0 - -64) / 49);
        ++field3542;
        int[][] var4 = super.field2905.method50(arg1, (byte) 121);
        if (super.field2905.field158) {
            int[] var5 = this.method1323(1, -17707, arg1);
            int[] var6 = this.method1323(2, -17707, arg1);
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var4[2];
            for (int var10 = 0; ~var10 > ~class4.field116; ++var10) {
                int var11 = var5[var10] * 255 >> 12 & 255;
                int var12 = var6[var10] * this.field3543 >> 12;
                int var13 = class22.field391[var11] * var12 >> 12;
                int var14 = class289.field4765[var11] * var12 >> 12;
                int var15 = (var14 >> 12) + var10 & class103.field1644;
                int var16 = (var13 >> 12) + arg1 & class107.field1749;
                int[][] var17 = this.method1327(0, 0, var16);
                var7[var10] = var17[0][var15];
                var8[var10] = var17[1][var15];
                var9[var10] = var17[2][var15];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        if (arg0 != -1) {
            field3545 = 58;
        }
        ++field3547;
        class186.method1346((byte) 28);
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class210() {
        super(3, false);
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field3540[var0] = class142.method1057(28260, var0);
        }
    }
}
