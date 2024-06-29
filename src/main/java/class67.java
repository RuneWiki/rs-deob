import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class67 extends class14 {

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    private int field1028 = 4;

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
    private int field1029 = 4;

    @OriginalMember(owner = "client!jt", name = "Q", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "Lsl;")
    public static class317 field1024 = new class317("", 17);

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!jt", name = "R", descriptor = "I")
    public static int field1031;

    static {
        new class304("Ok", "Okay", "OK", "Ok");
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I[BBIIII)V", line = 3)
    public static final void method449(int arg0, byte[] arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1023;
        if (arg3 > 0 && !class227.method1418((byte) 69, arg3)) {
            throw new IllegalArgumentException("");
        } else if (~arg6 < -1 && !class227.method1418((byte) 51, arg6)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class232.method1444(true, arg4);
            int var8 = 0;
            int var9 = arg3 >= arg6 ? arg6 : arg3;
            int var10 = arg3 >> 1;
            int var11 = arg6 >> 1;
            byte[] var12 = arg1;
            if (arg2 > -80) {
                method449(25, (byte[]) null, (byte) -10, 100, -1, 96, -57);
            }
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg5, var8, arg0, arg3, arg6, 0, arg4, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; var21 < var10; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg3 = var10;
                arg6 = var11;
                var12 = var16;
                var11 >>= 1;
                var9 >>= 1;
                ++var8;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "(I)V", line = 100)
    public static void method450(int arg0) {
        field1024 = null;
        if (arg0 != 0) {
            method449(16, (byte[]) null, (byte) 16, 31, 74, 90, -95);
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 110)
    public class67() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)[I", line = 114)
    public final int[] method140(int arg0, byte arg1) {
        if (arg1 > -2) {
            return null;
        } else {
            ++field1027;
            int[] var3 = super.field270.method2263(-29596, arg0);
            if (super.field270.field5222) {
                int var4 = class115.field1637 / this.field1028;
                int var5 = class494.field6866 / this.field1029;
                int[] var6;
                if (~var5 >= -1) {
                    var6 = this.method145(0, 0, -18596);
                } else {
                    int var7 = arg0 % var5;
                    var6 = this.method145(class494.field6866 * var7 / var5, 0, -18596);
                }
                for (int var8 = 0; ~class115.field1637 < ~var8; ++var8) {
                    if (~var4 >= -1) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var4;
                        var3[var8] = var6[class115.field1637 * var9 / var4];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IBLmd;)V", line = 168)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        int var4 = -11 / ((-51 - arg1) / 37);
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1029 = arg2.method2238(255);
            }
        } else {
            this.field1028 = arg2.method2238(255);
        }
        ++field1025;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[[I", line = 212)
    public final int[][] method141(int arg0, int arg1) {
        ++field1026;
        if (arg0 != -30909) {
            return null;
        } else {
            int[][] var3 = super.field268.method2561(arg1, 0);
            if (super.field268.field6091) {
                int var4 = class115.field1637 / this.field1028;
                int var5 = class494.field6866 / this.field1029;
                int[][] var7;
                if (var5 > 0) {
                    int var6 = arg1 % var5;
                    var7 = this.method139(0, 2, class494.field6866 * var6 / var5);
                } else {
                    var7 = this.method139(0, 2, 0);
                }
                int[] var8 = var7[0];
                int[] var9 = var7[1];
                int[] var10 = var7[2];
                int[] var11 = var3[0];
                int[] var12 = var3[1];
                int[] var13 = var3[2];
                for (int var14 = 0; ~class115.field1637 < ~var14; ++var14) {
                    int var16;
                    if (var4 > 0) {
                        int var15 = var14 % var4;
                        var16 = class115.field1637 * var15 / var4;
                    } else {
                        var16 = 0;
                    }
                    var11[var14] = var8[var16];
                    var12[var14] = var9[var16];
                    var13[var14] = var10[var16];
                }
            }
            return var3;
        }
    }
}
