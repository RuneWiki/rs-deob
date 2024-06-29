import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class704 extends class264 {

    @OriginalMember(owner = "client!wca", name = "m", descriptor = "Ljo;")
    public static class351 field9912 = new class351(17, 15);

    @OriginalMember(owner = "client!wca", name = "q", descriptor = "Ljo;")
    public static class351 field9916 = new class351(67, -1);

    @OriginalMember(owner = "client!wca", name = "k", descriptor = "I")
    public static int field9910;

    @OriginalMember(owner = "client!wca", name = "l", descriptor = "I")
    public static int field9911;

    @OriginalMember(owner = "client!wca", name = "n", descriptor = "I")
    public static int field9913;

    @OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
    public static int field9914;

    @OriginalMember(owner = "client!wca", name = "p", descriptor = "I")
    public static int field9915;

    @OriginalMember(owner = "client!wca", name = "r", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!wca", name = "s", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!wca", name = "t", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)V")
    public static void method3984(int arg0) {
        field9912 = null;
        field9916 = null;
        if (arg0 != 1) {
            method3984(-91);
        }
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V")
    public final void method660(int arg0) {
        int var2 = 70 / ((arg0 - 1) / 41);
        ++field9913;
        if (super.field3733 < 0 || super.field3733 > 4) {
            super.field3733 = this.method663((byte) -38);
        }
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(ILmfa;)V")
    public class704(int arg0, class640 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method3985(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9918;
        if (arg2 > 0 && !class315.method2071(arg6 ^ 19141, arg2)) {
            throw new IllegalArgumentException("");
        } else if (~arg0 < -1 && !class315.method2071(-128, arg0)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class488.method2853(arg4, false);
            int var8 = 0;
            int var9 = arg2 >= arg0 ? arg0 : arg2;
            int var10 = arg2 >> 1;
            int var11 = arg0 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg5, arg2, arg0, 0, arg4, 5121, var12, 0);
                if (~var9 >= -2) {
                    if (arg6 != -19132) {
                        field9912 = null;
                        return;
                    }
                    return;
                }
                int var14 = arg2 * var7;
                for (int var15 = 0; var15 < var7; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; var11 > var20; ++var20) {
                        for (int var21 = 0; var10 > var21; ++var21) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                byte[] var16 = var13;
                var13 = var12;
                arg0 = var11;
                arg2 = var10;
                var12 = var16;
                var10 >>= 1;
                ++var8;
                var11 >>= 1;
                var9 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIIIIIIIIZ)V")
    public static final void method3986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        ++field9911;
        if (class450.field6463 <= arg2 && arg2 <= class285.field4372 && ~arg0 <= ~class450.field6463 && class285.field4372 >= arg0 && ~class450.field6463 >= ~arg3 && ~arg3 >= ~class285.field4372 && arg5 >= class450.field6463 && ~arg5 >= ~class285.field4372 && arg7 >= class738.field10297 && arg7 <= class414.field5846 && class738.field10297 <= arg8 && class414.field5846 >= arg8 && ~class738.field10297 >= ~arg1 && ~class414.field5846 <= ~arg1 && arg4 >= class738.field10297 && ~arg4 >= ~class414.field5846) {
            class327.method2117(arg8, arg3, arg4, arg5, arg7, arg1, arg2, -106, arg6, arg0);
        } else {
            class63.method378(arg6, arg7, arg5, arg2, arg3, arg4, arg1, arg8, (byte) 105, arg0);
        }
        if (arg9) {
            field9919 = -81;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)I")
    public final int method663(byte arg0) {
        if (arg0 != -38) {
            this.method663((byte) -29);
        }
        ++field9910;
        return 0;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)I")
    public final int method666(byte arg0, int arg1) {
        if (arg0 != 112) {
            field9919 = -67;
        }
        ++field9914;
        return 1;
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(BI)V")
    public final void method659(byte arg0, int arg1) {
        super.field3733 = arg1;
        if (arg0 > -114) {
            field9916 = null;
        }
        ++field9915;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lmfa;)V")
    public class704(class640 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)I")
    public final int method3987(byte arg0) {
        ++field9917;
        if (arg0 > -31) {
            this.method659((byte) 62, -58);
        }
        return super.field3733;
    }
}
