import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class448;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class284 extends class111 implements class103 {

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    private int field3850;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    private int field3851;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3853;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Z")
    public boolean field3852;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "Z")
    public boolean field3854;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        if (arg0 != 18483) {
            this.field3854 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZZI)V")
    public final void method757(boolean arg0, boolean arg1, int arg2) {
        this.field3854 = arg1;
        if (arg2 > -58) {
            this.method763(-85, -11, -42, -3, null, -32, -99, 112);
        }
        this.field3852 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkaa;Lfca;IIZ[BII)V")
    public class284(class44 arg0, class75 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class279.field3793, arg4 && arg0.field798, arg2 * arg3);
        if (this.field1425.field780) {
            this.field3851 = arg3;
            this.field3850 = arg2;
        } else {
            this.field3850 = class698.method3915(arg2, (byte) 93);
            this.field3851 = class698.method3915(arg3, (byte) 93);
        }
        if (arg4) {
            this.field3853 = this.field1425.field797.method2655(this.field3850, this.field3851, 0, 1024, class44.method529(true, this.field1429, class279.field3793), 1);
        } else {
            this.field3853 = this.field1425.field797.method2655(this.field3850, this.field3851, 1, 0, class44.method529(true, this.field1429, class279.field3793), 1);
        }
        PixelBuffer var9 = this.field1425.field774;
        int var10 = this.field3853.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class448.method2666((byte) 118, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field1429.field1114 * arg2;
            int var12 = this.field1429.field1114 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2668(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2668(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field3853.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIII[IIII)V")
    public final void method763(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (class391.field5229 != this.field1429 || class279.field3793 != this.field1428) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field1425.field774;
        if (arg0 != -28726) {
            this.method758(60, 0.91301554F);
        }
        int var10 = this.field3853.LockRect(0, arg2, arg5, arg3, arg1, 0, var9);
        if (!class448.method2666((byte) 119, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg3 * 4 == var11 && arg3 == arg6) {
            var9.method2671(arg4, arg7, 0, arg1 * arg3);
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                var9.method2671(arg4, arg6 * var12 + arg7, var11 * var12, arg3);
            }
        }
        this.field3853.UnlockRect(0);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
    public final void method1701(int arg0) {
        this.field1425.method491(this, (byte) 117);
        if (arg0 != 2669) {
            this.field3850 = 120;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(Z)I")
    public final int method764(boolean arg0) {
        return arg0 ? 33 : this.field3851;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkaa;Lfca;Lbv;II)V")
    public class284(class44 arg0, class75 arg1, class279 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field1425.field780) {
            this.field3851 = arg4;
            this.field3850 = arg3;
        } else {
            this.field3850 = class698.method3915(arg3, (byte) 93);
            this.field3851 = class698.method3915(arg4, (byte) 93);
        }
        this.field3853 = this.field1425.field797.method2655(arg3, arg4, 1, 0, class44.method529(true, this.field1429, this.field1428), 1);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZIIIIIILfca;[B)V")
    public final void method762(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class75 arg7, byte[] arg8) {
        if (this.field1429 != arg7 || class279.field3793 != this.field1428) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field1425.field774;
        int var11 = this.field3853.LockRect(0, arg1, arg5, arg4, arg3, 0, var10);
        if (class448.method2666((byte) 122, var11)) {
            int var12 = this.field1429.field1114 * arg2;
            int var13 = this.field1429.field1114 * arg4;
            int var14 = var10.getRowPitch();
            if (var13 == var14 && var12 == var13) {
                var10.method2668(arg8, arg6, 0, arg3 * var13);
            } else {
                for (int var15 = 0; var15 < arg3; var15++) {
                    var10.method2668(arg8, arg6 + (var12 * var15), var14 * var15, var13);
                }
            }
            this.field3853.UnlockRect(0);
        }
        if (arg0) {
            this.method764(false);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IF)F")
    public final float method758(int arg0, float arg1) {
        return arg0 == 12943 ? arg1 / (float) this.field3850 : 0.92662424F;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkaa;IIZ[III)V")
    public class284(class44 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class391.field5229, class279.field3793, arg3 && arg0.field798, arg1 * arg2);
        if (this.field1425.field780) {
            this.field3851 = arg2;
            this.field3850 = arg1;
        } else {
            this.field3850 = class698.method3915(arg1, (byte) 93);
            this.field3851 = class698.method3915(arg2, (byte) 93);
        }
        if (arg3) {
            this.field3853 = this.field1425.field797.method2655(this.field3850, this.field3851, 0, 1024, 21, 1);
        } else {
            this.field3853 = this.field1425.field797.method2655(this.field3850, this.field3851, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field1425.field774;
        int var9 = this.field3853.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class448.method2666((byte) 1, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2671(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2671(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field3853.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FI)F")
    public final float method761(float arg0, int arg1) {
        return arg1 == -22297 ? arg0 / (float) this.field3851 : -0.04100604F;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILfw;)V")
    public final void method798(int arg0, class52 arg1) {
        if (arg0 != -13883) {
            this.field3852 = false;
        }
        super.method798(arg0 ^ 0x0, arg1);
    }

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method799(int arg0) {
        return arg0 == -25567 ? this.field3853 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)I")
    public final int method760(byte arg0) {
        return arg0 >= -55 ? -69 : this.field3850;
    }
}
