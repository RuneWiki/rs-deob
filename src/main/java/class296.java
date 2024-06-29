import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class296 extends class504 {

    @OriginalMember(owner = "client!uk", name = "Q", descriptor = "I")
    public int field4305;

    @OriginalMember(owner = "client!uk", name = "M", descriptor = "I")
    public int field4301;

    @OriginalMember(owner = "client!uk", name = "R", descriptor = "Z")
    public boolean field4306;

    @OriginalMember(owner = "client!uk", name = "K", descriptor = "F")
    public float field4299;

    @OriginalMember(owner = "client!uk", name = "O", descriptor = "F")
    public float field4303;

    @OriginalMember(owner = "client!uk", name = "L", descriptor = "I")
    public static int field4300 = 0;

    @OriginalMember(owner = "client!uk", name = "P", descriptor = "[I")
    public static int[] field4304 = new int[32];

    @OriginalMember(owner = "client!uk", name = "N", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIII[I)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4305 = arg2;
        this.field4301 = arg1;
        this.method2946(arg5, arg1, 0, 0, 0, true, arg2, 0, true);
        this.field4306 = false;
        this.field4299 = (float) arg1 / (float) arg3;
        this.field4303 = (float) arg2 / (float) arg4;
        this.method2952(false, false, false);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIIIIZ)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4299 = (float) arg3 / (float) arg5;
        this.field4303 = (float) arg4 / (float) arg6;
        this.field4306 = false;
        this.field4301 = arg3;
        this.field4305 = arg4;
        this.method2952(false, false, false);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIII)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
        if (super.field5298 == 34037) {
            this.field4306 = false;
            this.field4303 = (float) arg4;
            this.field4299 = (float) arg3;
        } else {
            this.field4306 = true;
            this.field4299 = this.field4303 = 1.0F;
        }
        this.field4305 = arg4;
        this.field4301 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIIIZ)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        if (~super.field5298 != -34038) {
            this.field4306 = true;
            this.field4299 = this.field4303 = 1.0F;
        } else {
            this.field4303 = (float) arg5;
            this.field4306 = false;
            this.field4299 = (float) arg4;
        }
        this.field4301 = arg4;
        this.field4305 = arg5;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIIZ[BI)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4301 = arg3;
        if (super.field5298 != 34037) {
            this.field4299 = this.field4303 = 1.0F;
            this.field4306 = true;
        } else {
            this.field4303 = (float) arg4;
            this.field4306 = false;
            this.field4299 = (float) arg3;
        }
        this.field4305 = arg4;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBIIIII[I)V")
    public static final void method1865(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        ++field4302;
        if (~arg2 < -1 && !class362.method2181(arg2, -1)) {
            throw new IllegalArgumentException("");
        } else if (~arg3 < -1 && !class362.method2181(arg3, arg1 ^ 28)) {
            throw new IllegalArgumentException("");
        } else if (~arg5 != -32994) {
            throw new IllegalArgumentException("");
        } else {
            if (arg1 != -29) {
                method1865(-36, (byte) 39, -9, -111, -82, -9, 80, (int[]) null);
            }
            int var8 = 0;
            int var9 = ~arg2 > ~arg3 ? arg2 : arg3;
            int var10 = arg2 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                OpenGL.glTexImage2Di(arg0, var8, arg6, arg2, arg3, 0, arg5, arg4, var12, 0);
                if (~var9 >= -2) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
                int[] var17 = var13;
                for (int var18 = 0; ~var11 < ~var18; ++var18) {
                    for (int var19 = 0; var19 < var10; ++var19) {
                        int var20 = var12[var15++];
                        int var21 = var12[var15++];
                        int var22 = var12[var16++];
                        int var23 = var12[var16++];
                        int var24 = (65304 & var20) >> 8;
                        int var25 = var20 >> 16 & 255;
                        int var26 = 255 & var20;
                        int var27 = 255 & var20 >> 24;
                        int var28 = ((var21 & 65349) >> 8) + var24;
                        int var29 = (var21 >> 16 & 255) + var25;
                        int var30 = (var21 >> 24 & 255) + var27;
                        int var31 = (255 & var21) + var26;
                        int var32 = (var22 >> 24 & 255) + var30;
                        int var33 = ((16745624 & var22) >> 16) + var29;
                        int var34 = (var22 & 255) + var31;
                        int var35 = ((var22 & 65422) >> 8) + var28;
                        int var36 = (var23 >> 16 & 255) + var33;
                        int var37 = (255 & var23 >> 24) + var32;
                        int var38 = ((var23 & 65352) >> 8) + var35;
                        int var39 = (255 & var23) + var34;
                        var13[var14++] = class694.method3895(class694.method3895(class194.method1380(var38, 1020) << 6, class694.method3895(class194.method1380(-16777216, var37 << 22), class194.method1380(16711680, var36 << 14))), class194.method1380(1020, var39) >> 2);
                    }
                    var15 += arg2;
                    var16 += arg2;
                }
                var13 = var12;
                var12 = var17;
                arg2 = var10;
                arg3 = var11;
                ++var8;
                var9 >>= 1;
                var11 >>= 1;
                var10 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIII)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4305 = arg3;
        this.field4306 = false;
        this.field4299 = (float) arg2 / (float) arg4;
        this.field4303 = (float) arg3 / (float) arg5;
        this.field4301 = arg2;
        this.method2952(false, false, false);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIII[BI)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4301 = arg2;
        this.field4305 = arg3;
        this.method2950(arg3, (byte) 53, arg7, true, 0, arg6, 0, 0, 0, arg2);
        this.field4303 = (float) arg3 / (float) arg5;
        this.field4306 = false;
        this.field4299 = (float) arg2 / (float) arg4;
        this.method2952(false, false, false);
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Llea;IIIZ[III)V")
    public class296(class573 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5, int arg6, int arg7) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field4301 = arg2;
        if (~super.field5298 != -34038) {
            this.field4306 = true;
            this.field4299 = this.field4303 = 1.0F;
        } else {
            this.field4303 = (float) arg3;
            this.field4299 = (float) arg2;
            this.field4306 = false;
        }
        this.field4305 = arg3;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(I)V")
    public static void method1866(int arg0) {
        field4304 = null;
        if (arg0 != -11741) {
            method1865(-101, (byte) 6, 33, -77, -52, 106, 98, (int[]) null);
        }
    }
}
