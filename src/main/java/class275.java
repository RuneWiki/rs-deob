import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class275 extends class439 implements class196 {

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field3892;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    private int field3890;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3889;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "Z")
    public boolean field3891;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
    public boolean field3893;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)Z")
    public final boolean method1705(byte arg0) {
        if (arg0 <= 101) {
            this.field3890 = -113;
        }
        return true;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)I")
    public final int method1707(int arg0) {
        int var2 = -45 % ((arg0 - 17) / 40);
        return this.field3892;
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2249(int arg0) {
        return arg0 > -77 ? (IDirect3DBaseTexture) null : this.field3889;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Los;Lhh;IIZ[BII)V")
    public class275(class253 arg0, class250 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class496.field7281, arg4 && arg0.field3616, arg2 * arg3);
        if (this.field6468.field3622) {
            this.field3892 = arg2;
            this.field3890 = arg3;
        } else {
            this.field3892 = class788.method5671(1282334120, arg2);
            this.field3890 = class788.method5671(1282334120, arg3);
        }
        if (arg4) {
            this.field3889 = this.field6468.field3618.method3142(this.field3892, this.field3890, 0, 1024, class253.method2099((byte) -56, class496.field7281, this.field6467), 1);
        } else {
            this.field3889 = this.field6468.field3618.method3142(this.field3892, this.field3890, 1, 0, class253.method2099((byte) -92, class496.field7281, this.field6467), 1);
        }
        PixelBuffer var9 = this.field6468.field3611;
        int var10 = this.field3889.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class402.method3156(var10, -1)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6467.field3568 * arg7;
            int var12 = this.field6467.field3568 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method3146(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method3146(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field3889.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Los;IIZ[III)V")
    public class275(class253 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class385.field5635, class496.field7281, arg3 && arg0.field3616, arg1 * arg2);
        if (this.field6468.field3622) {
            this.field3890 = arg2;
            this.field3892 = arg1;
        } else {
            this.field3892 = class788.method5671(1282334120, arg1);
            this.field3890 = class788.method5671(1282334120, arg2);
        }
        if (arg3) {
            this.field3889 = this.field6468.field3618.method3142(this.field3892, this.field3890, 0, 1024, 21, 1);
        } else {
            this.field3889 = this.field6468.field3618.method3142(this.field3892, this.field3890, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6468.field3611;
        int var9 = this.field3889.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class402.method3156(var9, -1)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method3148(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3148(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3889.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(ZF)F")
    public final float method1703(boolean arg0, float arg1) {
        if (arg0) {
            this.method2250(null, 41);
        }
        return arg1 / (float) this.field3890;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIII[IB)V")
    public final void method1700(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, byte arg6) {
        if (class385.field5635 != this.field6467 || class496.field7281 != this.field6471) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field6468.field3611;
        int var9 = this.field3889.LockRect(0, arg0, arg2, arg1, arg4, 16, var8);
        if (class402.method3156(var9, -1)) {
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10) {
                var8.method3147(arg5, arg3, 0, arg5.length);
            } else {
                for (int var11 = 0; var11 < arg4; var11++) {
                    var8.method3147(arg5, arg3 + (arg1 * var11), var10 * var11, arg1);
                }
            }
            this.field3889.UnlockRect(0);
        }
        if (arg6 != 41) {
            this.method1701(-36);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lhh;I[BIIIIII)V")
    public final void method1699(class250 arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field6467 != arg0 || class496.field7281 != this.field6471) {
            throw new RuntimeException();
        }
        if (arg3 != -19548) {
            this.method1700(49, 116, -31, -114, 57, null, (byte) 108);
        }
        PixelBuffer var10 = this.field6468.field3611;
        int var11 = this.field3889.LockRect(0, arg1, arg8, arg6, arg5, 0, var10);
        if (!class402.method3156(var11, -1)) {
            return;
        }
        int var12 = this.field6467.field3568 * arg4;
        int var13 = this.field6467.field3568 * arg6;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method3146(arg2, arg7, 0, arg5 * var13);
        } else {
            for (int var15 = 0; var15 < arg5; var15++) {
                var10.method3146(arg2, var12 * var15 + arg7, var14 * var15, var13);
            }
        }
        this.field3889.UnlockRect(0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IZZ)V")
    public final void method1706(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -18440) {
            this.field3892 = 116;
        }
        this.field3893 = arg2;
        this.field3891 = arg1;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ltd;I)V")
    public final void method2250(class457 arg0, int arg1) {
        super.method2250(arg0, arg1);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBI[IIII)V")
    public final void method1704(int arg0, int arg1, byte arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (class385.field5635 != this.field6467 || class496.field7281 != this.field6471) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field6468.field3611;
        int var10 = this.field3889.LockRect(0, arg7, arg1, arg6, arg5, 0, var9);
        if (arg2 < 5) {
            this.field3890 = 36;
        }
        if (!class402.method3156(var10, -1)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg6 * 4) == var11 && arg3 == arg6) {
            var9.method3148(arg4, arg0, 0, arg5 * arg6);
        } else {
            for (int var12 = 0; var12 < arg5; var12++) {
                var9.method3148(arg4, arg3 * var12 + arg0, var11 * var12, arg6);
            }
        }
        this.field3889.UnlockRect(0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final void method2251(int arg0) {
        if (arg0 != 14436) {
            this.field3893 = true;
        }
        this.field6468.method2105((byte) 102, this);
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
    public final int method1701(int arg0) {
        if (arg0 != 9259) {
            this.field3892 = -7;
        }
        return this.field3890;
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Los;Lhh;Lon;II)V")
    public class275(class253 arg0, class250 arg1, class496 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6468.field3622) {
            this.field3892 = arg3;
            this.field3890 = arg4;
        } else {
            this.field3892 = class788.method5671(1282334120, arg3);
            this.field3890 = class788.method5671(1282334120, arg4);
        }
        this.field3889 = this.field6468.field3618.method3142(arg3, arg4, 1, 0, class253.method2099((byte) -49, this.field6471, this.field6467), 1);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IF)F")
    public final float method1702(int arg0, float arg1) {
        return arg0 < 39 ? -0.8865091F : arg1 / (float) this.field3892;
    }
}
