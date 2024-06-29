import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class410;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class281 extends class550 implements class617 {

    @OriginalMember(owner = "client!on", name = "j", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!on", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3894;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "Z")
    public boolean field3891;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "Z")
    public boolean field3893;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)I")
    public final int method1808(boolean arg0) {
        if (arg0) {
            this.field3892 = 71;
        }
        return this.field3895;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)I")
    public final int method1809(int arg0) {
        if (arg0 != 18814) {
            this.field3891 = false;
        }
        return this.field3892;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([BIILdk;IIIII)V")
    public final void method1810(byte[] arg0, int arg1, int arg2, class435 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field7606 != arg3 || class608.field8759 != this.field7608) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field7609.field3542;
        int var11 = this.field3894.LockRect(0, arg6, arg8, arg4, arg1, 0, var10);
        if (class410.method2428(var11, (byte) 81)) {
            int var12 = this.field7606.field6194 * arg4;
            int var13 = this.field7606.field6194 * arg2;
            int var14 = var10.getRowPitch();
            if (var12 == var14 && var12 == var13) {
                var10.method2446(arg0, arg7, 0, arg1 * var12);
            } else {
                for (int var15 = 0; var15 < arg1; var15++) {
                    var10.method2446(arg0, var13 * var15 + arg7, var14 * var15, var12);
                }
            }
            this.field3894.UnlockRect(0);
        }
        if (arg5 != -30786) {
            this.method1808(true);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)Z")
    public final boolean method1811(int arg0) {
        if (arg0 != 3460) {
            this.field3893 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public final void method1482(int arg0) {
        if (arg0 != -31490) {
            this.field3891 = false;
        }
        this.field7609.method1646(true, this);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZZI)V")
    public final void method1812(boolean arg0, boolean arg1, int arg2) {
        this.field3893 = arg0;
        if (arg2 == -21501) {
            this.field3891 = arg1;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "([IIIBIIII)V")
    public final void method1813(int[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class49.field958 != this.field7606 || class608.field8759 != this.field7608) {
            throw new RuntimeException();
        }
        if (arg3 < 73) {
            this.field3892 = -69;
        }
        PixelBuffer var9 = this.field7609.field3542;
        int var10 = this.field3894.LockRect(0, arg7, arg2, arg4, arg5, 0, var9);
        if (!class410.method2428(var10, (byte) 105)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg4 * 4) == var11 && arg1 == arg4) {
            var9.method2449(arg0, arg6, 0, arg4 * arg5);
        } else {
            for (int var12 = 0; var12 < arg5; var12++) {
                var9.method2449(arg0, arg1 * var12 + arg6, var11 * var12, arg4);
            }
        }
        this.field3894.UnlockRect(0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLfj;)V")
    public final void method1483(boolean arg0, class564 arg1) {
        super.method1483(arg0, arg1);
        if (arg0) {
            this.field3895 = 38;
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1481(int arg0) {
        if (arg0 < 42) {
            this.field3892 = 103;
        }
        return this.field3894;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lbv;Ldk;IIZ[BII)V")
    public class281(class256 arg0, class435 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class608.field8759, arg4 && arg0.field3530, arg2 * arg3);
        if (this.field7609.field3531) {
            this.field3895 = arg3;
            this.field3892 = arg2;
        } else {
            this.field3892 = class32.method326(arg2, false);
            this.field3895 = class32.method326(arg3, false);
        }
        if (arg4) {
            this.field3894 = this.field7609.field3527.method2434(this.field3892, this.field3895, 0, 1024, class256.method1625(class608.field8759, this.field7606, (byte) -73), 1);
        } else {
            this.field3894 = this.field7609.field3527.method2434(this.field3892, this.field3895, 1, 0, class256.method1625(class608.field8759, this.field7606, (byte) -97), 1);
        }
        PixelBuffer var9 = this.field7609.field3542;
        int var10 = this.field3894.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class410.method2428(var10, (byte) -108)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field7606.field6194 * arg7;
            int var12 = this.field7606.field6194 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2446(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2446(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field3894.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(IF)F")
    public final float method1814(int arg0, float arg1) {
        if (arg0 < 120) {
            this.method1812(true, false, 95);
        }
        return arg1 / (float) this.field3892;
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lbv;Ldk;Lge;II)V")
    public class281(class256 arg0, class435 arg1, class608 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field7609.field3531) {
            this.field3892 = arg3;
            this.field3895 = arg4;
        } else {
            this.field3892 = class32.method326(arg3, false);
            this.field3895 = class32.method326(arg4, false);
        }
        this.field3894 = this.field7609.field3527.method2434(arg3, arg4, 1, 0, class256.method1625(this.field7608, this.field7606, (byte) 62), 1);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lbv;IIZ[III)V")
    public class281(class256 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class49.field958, class608.field8759, arg3 && arg0.field3530, arg1 * arg2);
        if (this.field7609.field3531) {
            this.field3892 = arg1;
            this.field3895 = arg2;
        } else {
            this.field3892 = class32.method326(arg1, false);
            this.field3895 = class32.method326(arg2, false);
        }
        if (arg3) {
            this.field3894 = this.field7609.field3527.method2434(this.field3892, this.field3895, 0, 1024, 21, 1);
        } else {
            this.field3894 = this.field7609.field3527.method2434(this.field3892, this.field3895, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field7609.field3542;
        int var9 = this.field3894.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class410.method2428(var9, (byte) -83)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2449(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2449(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3894.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IF)F")
    public final float method1815(int arg0, float arg1) {
        return arg0 == 25485 ? arg1 / (float) this.field3895 : -2.1873364F;
    }
}
