import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class569 {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Luca;")
    private class287 field8285;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field8289;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8287 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field8286;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8288;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field8290;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II[IIIIII)V")
    public static final void method3275(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8288++;
        if (arg1 > 0 && !class346.method2145(-1, arg1)) {
            throw new IllegalArgumentException("");
        }
        int var8 = 79 / ((39 - arg3) / 48);
        if (arg4 > 0 && !class346.method2145(-1, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg6 == 32993) {
            int var9 = 0;
            int var10 = arg1 >= arg4 ? arg4 : arg1;
            int var11 = arg1 >> 1;
            int var12 = arg4 >> 1;
            int[] var13 = arg2;
            int[] var14 = new int[var11 * var12];
            while (true) {
                OpenGL.glTexImage2Di(arg7, var9, arg5, arg1, arg4, 0, arg6, arg0, var13, 0);
                if (var10 <= 1) {
                    return;
                }
                int var15 = 0;
                int var16 = 0;
                int var17 = arg1 + var16;
                int[] var18 = var14;
                for (int var19 = 0; var19 < var12; var19++) {
                    for (int var20 = 0; var20 < var11; var20++) {
                        int var21 = var13[var16++];
                        int var22 = var13[var16++];
                        int var23 = var13[var17++];
                        int var24 = var21 >> 8 & 0xFF;
                        int var25 = var21 & 0xFF;
                        int var26 = var21 >> 16 & 0xFF;
                        int var27 = var13[var17++];
                        int var28 = var21 >> 24 & 0xFF;
                        int var29 = (var22 >> 16 & 0xFF) + var26;
                        int var30 = (var22 >> 8 & 0xFF) + var24;
                        int var31 = (var22 & 0xFF) + var25;
                        int var32 = (var22 >> 24 & 0xFF) + var28;
                        int var33 = (var23 & 0xFF) + var31;
                        int var34 = (var23 >> 16 & 0xFF) + var29;
                        int var35 = ((var23 & 0xFF26) >> 8) + var30;
                        int var36 = (var23 >> 24 & 0xFF) + var32;
                        int var37 = (var27 >> 8 & 0xFF) + var35;
                        int var38 = ((var27 & 0xFF908D) >> 16) + var34;
                        int var39 = (var27 >> 24 & 0xFF) + var36;
                        int var40 = (var27 & 0xFF) + var33;
                        var14[var15++] = class151.method1076(class151.method1076(class151.method1076(class425.method2563(1020, var39) << 22, class425.method2563(var38, 1020) << 14), class425.method2563(65280, var37 << 6)), class425.method2563(1020, var40) >> 2);
                    }
                    var16 += arg1;
                    var17 += arg1;
                }
                var14 = var13;
                var13 = var18;
                arg1 = var11;
                arg4 = var12;
                var10 >>= 0x1;
                var9++;
                var12 >>= 0x1;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!lk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8285.method1758((byte) -46, this.field8289);
        field8286++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Luca;II)V")
    public class569(class287 arg0, int arg1, int arg2) {
        this.field8285 = arg0;
        this.field8289 = arg2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILps;ZI)V")
    public static final void method3276(int arg0, class5 arg1, boolean arg2, int arg3) {
        field8290++;
        class164.field2309 = arg0;
        class565.field8252 = arg1;
        class533.field7838 = arg3;
        if (!arg2) {
            field8287 = 92;
        }
    }
}
