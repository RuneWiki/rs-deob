import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class522 extends class687 {

    @OriginalMember(owner = "client!vs", name = "A", descriptor = "Lgw;")
    public static class690 field7265 = new class690(30);

    @OriginalMember(owner = "client!vs", name = "D", descriptor = "[I")
    public static int[] field7268 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!vs", name = "C", descriptor = "Lgw;")
    public static class690 field7267 = new class690(4);

    @OriginalMember(owner = "client!vs", name = "z", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!vs", name = "B", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!vs", name = "E", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!vs", name = "F", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V")
    public static void method3110(byte arg0) {
        field7268 = null;
        field7265 = null;
        if (arg0 <= -118) {
            field7267 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(IIIIIF)V")
    public class522(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[BIII)V")
    public static final void method3111(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field7270;
        if (~arg5 < -1 && !class88.method611(arg5, arg6 ^ 19557)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class88.method611(arg1, 2)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class284.method1887(arg2, false);
            int var8 = 0;
            int var9 = arg5 >= arg1 ? arg1 : arg5;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            byte[] var12 = arg3;
            byte[] var13 = new byte[var10 * var11 * var7];
            if (arg6 != 19559) {
                method3111(-79, 55, 27, (byte[]) null, -8, -78, -110);
            }
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var8, arg0, arg5, arg1, 0, arg2, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; ~var16 > ~var7; ++var16) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
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
                arg1 = var11;
                arg5 = var10;
                var10 >>= 1;
                ++var8;
                var9 >>= 1;
                var11 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII)V")
    public final void method1733(int arg0, int arg1, int arg2, int arg3) {
        super.field9558 = arg0;
        super.field9555 = arg3;
        ++field7264;
        super.field9554 = arg2;
        if (arg1 != -10672) {
            field7267 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(FB)V")
    public final void method1730(float arg0, byte arg1) {
        ++field7266;
        if (arg1 != -111) {
            this.method1733(-46, -13, 36, 18);
        }
        super.field9556 = arg0;
    }
}
