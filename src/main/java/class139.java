import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class139 extends class210 {

    @OriginalMember(owner = "client!g", name = "I", descriptor = "Liv;")
    public static class82 field1756 = new class82(9, 19);

    @OriginalMember(owner = "client!g", name = "A", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!g", name = "B", descriptor = "I")
    public int field1749;

    @OriginalMember(owner = "client!g", name = "D", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!g", name = "F", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!g", name = "G", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!g", name = "H", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!g", name = "C", descriptor = "Lvp;")
    public class171 field1750;

    @OriginalMember(owner = "client!g", name = "E", descriptor = "[B")
    public byte[] field1752;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "(I)[B", line = 9)
    public final byte[] method917(int arg0) {
        ++field1753;
        if (arg0 != -27362) {
            method919(-36, 117, (float[]) null, (byte) 115, 16, -57, -125);
        }
        if (super.field2557) {
            throw new RuntimeException();
        } else {
            return this.field1752;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lfga;IIILr;I)V", line = 31)
    public static final void method918(class232 arg0, int arg1, int arg2, int arg3, class165 arg4, int arg5) {
        if (arg2 != 28648) {
            method918((class232) null, -117, 45, -79, (class165) null, 91);
        }
        ++field1754;
        class244 var6 = class308.field4085.method565(arg2 ^ 28556, arg0.field3080);
        if (~var6.field3340 != 0) {
            int var7;
            if (!arg0.field3109) {
                var7 = 0;
            } else {
                int var8 = arg0.field3023 + arg5;
                var7 = var8 & 3;
            }
            class701 var9 = var6.method1480(var7, arg4, arg0.field3104, 262144);
            if (var9 != null) {
                int var10 = arg0.field3066;
                int var11 = arg0.field3105;
                if ((var7 & 1) == 1) {
                    var11 = arg0.field3066;
                    var10 = arg0.field3105;
                }
                int var12 = var9.method896();
                int var13 = var9.method901();
                if (var6.field3342) {
                    var13 = var11 * 4;
                    var12 = var10 * 4;
                }
                if (var6.field3339 != 0) {
                    var9.method3932(arg1, -((var11 - 1) * 4) + arg3, var12, var13, 0, var6.field3339 | -16777216, 1);
                } else {
                    var9.method3925(arg1, -(var11 * 4) + arg3 + 4, var12, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II[FBIII)V", line = 86)
    public static final void method919(int arg0, int arg1, float[] arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field1748;
        if (~arg1 < -1 && !class326.method1894(arg1, 32)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class326.method1894(arg0, 32)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class665.method3755(1, arg6);
            if (arg3 != -61) {
                method920(-47);
            }
            int var8 = 0;
            int var9 = ~arg0 >= ~arg1 ? arg0 : arg1;
            int var10 = arg1 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg2;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var8, arg5, arg1, arg0, 0, arg6, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg1 * var7;
                float[] var15 = var13;
                for (int var16 = 0; ~var7 < ~var16; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; var10 > var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg1 = var10;
                var12 = var15;
                arg0 = var11;
                var11 >>= 1;
                ++var8;
                var10 >>= 1;
                var9 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V", line = 184)
    public static void method920(int arg0) {
        field1756 = null;
        if (arg0 <= 102) {
            method918((class232) null, 38, -66, -81, (class165) null, 118);
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)I", line = 198)
    public final int method921(int arg0) {
        ++field1755;
        if (arg0 != -23373) {
            return 110;
        } else {
            return super.field2557 ? 0 : 100;
        }
    }

    @OriginalMember(owner = "client!g", name = "h", descriptor = "(I)V", line = 215)
    public static final void method922(int arg0) {
        if (arg0 == 4941) {
            class685.field9782.method2776(false);
            ++field1751;
        }
    }
}
