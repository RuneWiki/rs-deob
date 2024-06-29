import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class330 {

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public static int field4569 = 0;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Ldh;")
    public static class321 field4573 = new class321("", 16);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)I")
    public abstract int method92(int arg0);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)Lsda;")
    public abstract class7 method88(int arg0);

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z")
    public abstract boolean method93(int arg0);

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
    public abstract boolean method90(int arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method2077(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4570++;
        if (arg2 < arg5 && !class506.method2832(arg5, arg2 ^ 0x3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class506.method2832(arg4, 3)) {
            int var7 = class66.method382(arg2 ^ 0x1, arg0);
            int var8 = 0;
            int var9 = arg4 > arg5 ? arg5 : arg4;
            int var10 = arg5 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg6, arg5, arg4, 0, arg0, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg5 = var10;
                arg4 = var11;
                var9 >>= 0x1;
                var8++;
                var10 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)V")
    public abstract void method89(boolean arg0);

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)Z")
    public abstract boolean method98(boolean arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)Z")
    public final boolean method2078(byte arg0) {
        if (arg0 != 92) {
            method2081(33, null, 107);
        }
        field4572++;
        return this.method93(15997) || this.method90(16) || this.method98(true);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(Z)V")
    public static void method2079(boolean arg0) {
        if (arg0) {
            method2077(12, null, -25, -47, 23, 7, -58);
        }
        field4573 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)I")
    public static final int method2080(byte arg0, int arg1) {
        field4574++;
        int var2 = 0;
        if (arg0 > -86) {
            method2079(false);
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            arg1 >>>= 0x8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 0x4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)I")
    public abstract int method100(byte arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILjq;I)Ljava/lang/String;")
    public static final String method2081(int arg0, class447 arg1, int arg2) {
        field4571++;
        int var3 = 39 / (arg0 / 57);
        if (!client.method3572(arg1).method2771(0, arg2) && arg1.field6292 == null) {
            return null;
        } else if (arg1.field6290 == null || arg2 >= arg1.field6290.length || arg1.field6290[arg2] == null || arg1.field6290[arg2].trim().length() == 0) {
            return class427.field5824 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field6290[arg2];
        }
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
    public abstract void method99(int arg0);
}
