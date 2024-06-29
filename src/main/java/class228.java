import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class485;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class228 extends class265 implements class145 {

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    private int field3012;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    private int field3013;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3016;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "Z")
    public boolean field3014;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "Z")
    public boolean field3015;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1454(int arg0) {
        return arg0 == -23413 ? this.field3016 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILcg;)V")
    public final void method694(int arg0, class140 arg1) {
        super.method694(arg0, arg1);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BZZ)V")
    public final void method813(byte arg0, boolean arg1, boolean arg2) {
        int var4 = -120 / ((7 - arg0) / 50);
        this.field3014 = arg2;
        this.field3015 = arg1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I")
    public final int method815(int arg0) {
        if (arg0 != 11283) {
            this.field3013 = -1;
        }
        return this.field3012;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)I")
    public final int method806(int arg0) {
        return arg0 <= 116 ? -33 : this.field3013;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(FI)F")
    public final float method808(float arg0, int arg1) {
        if (arg1 != 9347) {
            this.method812(-31, 93, 112, 82, null, -18, 17, -42);
        }
        return arg0 / (float) this.field3013;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILet;III[BIII)V")
    public final void method805(int arg0, class596 arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        if (arg3 != -8981) {
            this.method814(120, -1.0059268F);
        }
        if (this.field3353 != arg1 || class285.field3589 != this.field3350) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field3351.field8067;
        int var11 = this.field3016.LockRect(0, arg4, arg7, arg6, arg0, 0, var10);
        if (!class485.method2865(var11, 25499)) {
            return;
        }
        int var12 = this.field3353.field8313 * arg2;
        int var13 = this.field3353.field8313 * arg6;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2885(arg5, arg8, 0, arg0 * var13);
        } else {
            for (int var15 = 0; var15 < arg0; var15++) {
                var10.method2885(arg5, var12 * var15 + arg8, var14 * var15, var13);
            }
        }
        this.field3016.UnlockRect(0);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II[IIIII)V")
    public final void method807(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class269.field3396 != this.field3353 || class285.field3589 != this.field3350) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field3351.field8067;
        if (arg5 != 19229) {
            this.method703((byte) -68);
        }
        int var9 = this.field3016.LockRect(0, arg1, arg6, arg0, arg4, 16, var8);
        if (!class485.method2865(var9, 25499)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if ((arg0 * 4) == var10) {
            var8.method2888(arg2, arg3, 0, arg2.length);
        } else {
            for (int var11 = 0; var11 < arg4; var11++) {
                var8.method2888(arg2, arg3 + (arg0 * var11), var10 * var11, arg0);
            }
        }
        this.field3016.UnlockRect(0);
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lul;Let;IIZ[BII)V")
    public class228(class574 arg0, class596 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class285.field3589, arg4 && arg0.field8061, arg2 * arg3);
        if (this.field3351.field8083) {
            this.field3012 = arg2;
            this.field3013 = arg3;
        } else {
            this.field3012 = class565.method3253(88, arg2);
            this.field3013 = class565.method3253(-102, arg3);
        }
        if (arg4) {
            this.field3016 = this.field3351.field8080.method2866(this.field3012, this.field3013, 0, 1024, class574.method3284(class285.field3589, this.field3353, false), 1);
        } else {
            this.field3016 = this.field3351.field8080.method2866(this.field3012, this.field3013, 1, 0, class574.method3284(class285.field3589, this.field3353, false), 1);
        }
        PixelBuffer var9 = this.field3351.field8067;
        int var10 = this.field3016.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class485.method2865(var10, 25499)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field3353.field8313 * arg7;
            int var12 = this.field3353.field8313 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2885(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2885(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field3016.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IF)F")
    public final float method814(int arg0, float arg1) {
        return arg0 == 20275 ? arg1 / (float) this.field3012 : 0.105937764F;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lul;Let;Lwha;II)V")
    public class228(class574 arg0, class596 arg1, class285 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field3351.field8083) {
            this.field3012 = arg3;
            this.field3013 = arg4;
        } else {
            this.field3012 = class565.method3253(63, arg3);
            this.field3013 = class565.method3253(-88, arg4);
        }
        this.field3016 = this.field3351.field8080.method2866(arg3, arg4, 1, 0, class574.method3284(this.field3350, this.field3353, false), 1);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIII[IIII)V")
    public final void method812(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -25782) {
            this.method807(80, 69, null, -42, 75, -83, 114);
        }
        if (class269.field3396 != this.field3353 || class285.field3589 != this.field3350) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field3351.field8067;
        int var10 = this.field3016.LockRect(0, arg0, arg3, arg5, arg6, 0, var9);
        if (!class485.method2865(var10, 25499)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg5 * 4 == var11 && arg1 == arg5) {
            var9.method2887(arg4, arg2, 0, arg5 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method2887(arg4, arg2 + (arg1 * var12), var11 * var12, arg5);
            }
        }
        this.field3016.UnlockRect(0);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)Z")
    public final boolean method803(int arg0) {
        return arg0 < -36;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(B)V")
    public final void method703(byte arg0) {
        this.field3351.method3294(6, this);
        if (arg0 <= 71) {
            this.method812(92, -105, 1, -102, null, -71, -106, 27);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lul;IIZ[III)V")
    public class228(class574 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class269.field3396, class285.field3589, arg3 && arg0.field8061, arg1 * arg2);
        if (this.field3351.field8083) {
            this.field3012 = arg1;
            this.field3013 = arg2;
        } else {
            this.field3012 = class565.method3253(92, arg1);
            this.field3013 = class565.method3253(111, arg2);
        }
        if (arg3) {
            this.field3016 = this.field3351.field8080.method2866(this.field3012, this.field3013, 0, 1024, 21, 1);
        } else {
            this.field3016 = this.field3351.field8080.method2866(this.field3012, this.field3013, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field3351.field8067;
        int var9 = this.field3016.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class485.method2865(var9, 25499)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2887(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2887(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3016.UnlockRect(0);
        }
    }
}
