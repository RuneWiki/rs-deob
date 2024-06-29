import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class398;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class617 extends class175 implements class391 {

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    private int field9025;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    private int field9023;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field9021;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "Z")
    public boolean field9022;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "Z")
    public boolean field9024;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IF)F", line = 4)
    public final float method569(int arg0, float arg1) {
        if (arg0 != -2297) {
            this.field9021 = null;
        }
        return arg1 / (float) this.field9023;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III[IIIII)V", line = 14)
    public final void method561(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class411.field5856 != this.field2665 || class629.field9208 != this.field2662) {
            throw new RuntimeException();
        } else if (arg1 == 12382) {
            PixelBuffer var9 = this.field2663.field674;
            int var10 = this.field9021.LockRect(0, arg0, arg5, arg7, arg2, 0, var9);
            if (class398.method2384(7155, var10)) {
                int var11 = var9.getRowPitch();
                if ((arg7 * 4) == var11 && arg4 == arg7) {
                    var9.method2381(arg3, arg6, 0, arg2 * arg7);
                } else {
                    for (int var12 = 0; var12 < arg2; var12++) {
                        var9.method2381(arg3, arg4 * var12 + arg6, var11 * var12, arg7);
                    }
                }
                this.field9021.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZIZ)V", line = 54)
    public final void method563(boolean arg0, int arg1, boolean arg2) {
        this.field9024 = arg2;
        int var4 = -89 / ((arg1 + 52) / 59);
        this.field9022 = arg0;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)Z", line = 65)
    public final boolean method568(int arg0) {
        if (arg0 != 25992) {
            this.field9022 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lqq;I)V", line = 76)
    public final void method379(class599 arg0, int arg1) {
        super.method379(arg0, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V", line = 83)
    public final void method380(int arg0) {
        if (arg0 < 3) {
            this.method565(28, -0.10059989F);
        }
        this.field2663.method289(this, 0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)I", line = 93)
    public final int method564(int arg0) {
        if (arg0 != 7427) {
            this.method563(true, -103, false);
        }
        return this.field9023;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 105)
    public final IDirect3DBaseTexture method1179(boolean arg0) {
        if (arg0) {
            this.method569(-23, 0.0889815F);
        }
        return this.field9021;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lnca;IIZ[III)V", line = 114)
    public class617(class54 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class411.field5856, class629.field9208, arg3 && arg0.field669, arg1 * arg2);
        if (this.field2663.field653) {
            this.field9023 = arg2;
            this.field9025 = arg1;
        } else {
            this.field9025 = class479.method2908((byte) -99, arg1);
            this.field9023 = class479.method2908((byte) -99, arg2);
        }
        if (arg3) {
            this.field9021 = this.field2663.field676.method2407(this.field9025, this.field9023, 0, 1024, 21, 1);
        } else {
            this.field9021 = this.field2663.field676.method2407(this.field9025, this.field9023, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field2663.field674;
        int var9 = this.field9021.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class398.method2384(7155, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2381(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2381(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field9021.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(IF)F", line = 171)
    public final float method565(int arg0, float arg1) {
        if (arg0 != -32442) {
            this.method567(true);
        }
        return arg1 / (float) this.field9025;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)I", line = 182)
    public final int method567(boolean arg0) {
        if (!arg0) {
            this.field9023 = 35;
        }
        return this.field9025;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILjt;I[BIIIII)V", line = 192)
    public final void method558(int arg0, class489 arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field2665 != arg1 || class629.field9208 != this.field2662) {
            throw new RuntimeException();
        }
        if (arg2 != -1294) {
            this.field9023 = 91;
        }
        PixelBuffer var10 = this.field2663.field674;
        int var11 = this.field9021.LockRect(0, arg7, arg0, arg6, arg4, 0, var10);
        if (!class398.method2384(arg2 ^ 0xFFFFE101, var11)) {
            return;
        }
        int var12 = this.field2665.field7400 * arg5;
        int var13 = this.field2665.field7400 * arg6;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2380(arg3, arg8, 0, arg4 * var13);
        } else {
            for (int var15 = 0; var15 < arg4; var15++) {
                var10.method2380(arg3, var12 * var15 + arg8, var14 * var15, var13);
            }
        }
        this.field9021.UnlockRect(0);
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lnca;Ljt;IIZ[BII)V", line = 232)
    public class617(class54 arg0, class489 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class629.field9208, arg4 && arg0.field669, arg2 * arg3);
        if (this.field2663.field653) {
            this.field9023 = arg3;
            this.field9025 = arg2;
        } else {
            this.field9025 = class479.method2908((byte) -99, arg2);
            this.field9023 = class479.method2908((byte) -99, arg3);
        }
        if (arg4) {
            this.field9021 = this.field2663.field676.method2407(this.field9025, this.field9023, 0, 1024, class54.method315((byte) 21, class629.field9208, this.field2665), 1);
        } else {
            this.field9021 = this.field2663.field676.method2407(this.field9025, this.field9023, 1, 0, class54.method315((byte) 21, class629.field9208, this.field2665), 1);
        }
        PixelBuffer var9 = this.field2663.field674;
        int var10 = this.field9021.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class398.method2384(7155, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field2665.field7400 * arg2;
            int var12 = this.field2665.field7400 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2380(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2380(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field9021.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lnca;Ljt;Llc;II)V", line = 290)
    public class617(class54 arg0, class489 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field2663.field653) {
            this.field9023 = arg4;
            this.field9025 = arg3;
        } else {
            this.field9025 = class479.method2908((byte) -99, arg3);
            this.field9023 = class479.method2908((byte) -99, arg4);
        }
        this.field9021 = this.field2663.field676.method2407(arg3, arg4, 1, 0, class54.method315((byte) 21, this.field2662, this.field2665), 1);
    }
}
