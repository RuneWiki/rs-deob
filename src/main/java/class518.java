import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class518 extends class212 {

    @OriginalMember(owner = "client!fo", name = "o", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!fo", name = "q", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!fo", name = "r", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!fo", name = "s", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!fo", name = "t", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
    public static int field7211;

    @OriginalMember(owner = "client!fo", name = "p", descriptor = "Lec;")
    public static class236 field7206;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIII)V")
    public static final void method3021(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field7207;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((arg3 + var12) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) + -3) * var11;
        int var19 = (var6 - -1) * var16;
        if (~arg2 <= ~class58.field1150 && ~arg2 >= ~class479.field6682) {
            int var20 = class486.method2865(class536.field7419, arg0 + arg5, class140.field2314, -89);
            int var21 = class486.method2865(class536.field7419, -arg5 + arg0, class140.field2314, -116);
            class47.method550(-27, var20, class691.field9345[arg2], var21, arg4);
        }
        int var22 = (arg1 - 1) * var15;
        while (~var7 < -1) {
            if (~var13 > -1) {
                while (~var13 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                ++var6;
            }
            var14 += -var18;
            var13 += -var22;
            var22 -= var15;
            var18 -= var15;
            --var7;
            int var23 = -var7 + arg2;
            int var24 = arg2 + var7;
            if (~class58.field1150 >= ~var24 && ~class479.field6682 <= ~var23) {
                int var25 = class486.method2865(class536.field7419, arg0 + var6, class140.field2314, 86);
                int var26 = class486.method2865(class536.field7419, -var6 + arg0, class140.field2314, 32);
                if (~var23 <= ~class58.field1150) {
                    class47.method550(arg3 + -26, var25, class691.field9345[var23], var26, arg4);
                }
                if (~var24 >= ~class479.field6682) {
                    class47.method550(-27, var25, class691.field9345[var24], var26, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)I")
    public final int method3022(int arg0) {
        ++field7205;
        if (arg0 != -32350) {
            field7206 = null;
        }
        return super.field3006;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V")
    public static void method3023(int arg0) {
        if (arg0 != 16878) {
            method3021(-83, -10, 27, 111, 41, 109);
        }
        field7206 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V")
    public final void method419(int arg0, int arg1) {
        super.field3006 = arg1;
        ++field7210;
        int var3 = 123 / ((82 - arg0) / 35);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I")
    public final int method417(int arg0, int arg1) {
        if (arg0 != 3) {
            field7206 = null;
        }
        ++field7208;
        return 3;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(ILdh;)V")
    public class518(int arg0, class322 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ldh;)V")
    public class518(class322 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)I")
    public final int method422(int arg0) {
        ++field7211;
        if (arg0 != 20014) {
            this.method418(true);
        }
        return super.field3004.method2058(674) == class456.field6431 && super.field3004.method2061(-111) ? 0 : 1;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public final void method418(boolean arg0) {
        ++field7209;
        super.field3006 = this.method422(20014);
        if (arg0) {
            this.method422(98);
        }
    }
}
