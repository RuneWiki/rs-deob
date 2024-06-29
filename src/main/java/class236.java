import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class396;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class236 extends class463 implements class405 {

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    private int field3474;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    private int field3475;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3473;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "Z")
    public boolean field3472;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "Z")
    public boolean field3476;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)I")
    public final int method1530(int arg0) {
        if (arg0 > -18) {
            this.field3472 = false;
        }
        return this.field3475;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZF)F")
    public final float method1531(boolean arg0, float arg1) {
        return arg0 ? -0.7535977F : arg1 / (float) this.field3475;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lde;Lkl;Lvt;II)V")
    public class236(class15 arg0, class468 arg1, class343 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6696.field160) {
            this.field3474 = arg3;
            this.field3475 = arg4;
        } else {
            this.field3474 = class243.method1546(-26367, arg3);
            this.field3475 = class243.method1546(-26367, arg4);
        }
        this.field3473 = this.field6696.field182.method2424(arg3, arg4, 1, 0, class15.method156(this.field6698, 1, this.field6694), 1);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IF)F")
    public final float method1532(int arg0, float arg1) {
        return arg0 == -8221 ? arg1 / (float) this.field3474 : -0.57473934F;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)I")
    public final int method1533(int arg0) {
        return arg0 < 114 ? 34 : this.field3474;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IILkl;III[BII)V")
    public final void method1534(int arg0, int arg1, class468 arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (this.field6698 != arg2 || class343.field4922 != this.field6694) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6696.field181;
        int var11 = this.field3473.LockRect(0, arg5, arg3, arg1, arg8, 0, var10);
        if (arg0 != 21145) {
            this.method1536(-93);
        }
        if (!class396.method2412((byte) -118, var11)) {
            return;
        }
        int var12 = this.field6698.field6743 * arg4;
        int var13 = this.field6698.field6743 * arg1;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2410(arg6, arg7, 0, arg8 * var13);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method2410(arg6, arg7 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field3473.UnlockRect(0);
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lde;Lkl;IIZ[BII)V")
    public class236(class15 arg0, class468 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class343.field4922, arg4 && arg0.field166, arg2 * arg3);
        if (this.field6696.field160) {
            this.field3474 = arg2;
            this.field3475 = arg3;
        } else {
            this.field3474 = class243.method1546(-26367, arg2);
            this.field3475 = class243.method1546(-26367, arg3);
        }
        if (arg4) {
            this.field3473 = this.field6696.field182.method2424(this.field3474, this.field3475, 0, 1024, class15.method156(this.field6698, 1, class343.field4922), 1);
        } else {
            this.field3473 = this.field6696.field182.method2424(this.field3474, this.field3475, 1, 0, class15.method156(this.field6698, 1, class343.field4922), 1);
        }
        PixelBuffer var9 = this.field6696.field181;
        int var10 = this.field3473.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class396.method2412((byte) -34, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6698.field6743 * arg2;
            int var12 = this.field6698.field6743 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2410(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2410(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field3473.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ZZI)V")
    public final void method1535(boolean arg0, boolean arg1, int arg2) {
        int var4 = 85 / ((59 - arg2) / 32);
        this.field3476 = arg0;
        this.field3472 = arg1;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lem;I)V")
    public final void method840(class599 arg0, int arg1) {
        super.method840(arg0, 109);
        int var3 = -94 % ((-arg1 - 72) / 48);
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)V")
    public final void method841(int arg0) {
        if (arg0 <= 68) {
            this.method1537(124, 24, false, -63, null, 7, 115, 0);
        }
        this.field6696.method150(false, this);
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Z")
    public final boolean method1536(int arg0) {
        return arg0 == -5845 ? true : true;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IIZI[IIII)V")
    public final void method1537(int arg0, int arg1, boolean arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        if (class85.field1472 != this.field6698 || class343.field4922 != this.field6694) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field6696.field181;
        int var10 = this.field3473.LockRect(0, arg6, arg0, arg3, arg1, 0, var9);
        if (!arg2) {
            this.method1532(-88, 0.5203945F);
        }
        if (!class396.method2412((byte) -47, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg3 * 4 == var11 && arg3 == arg7) {
            var9.method2413(arg4, arg5, 0, arg1 * arg3);
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                var9.method2413(arg4, arg7 * var12 + arg5, var11 * var12, arg3);
            }
        }
        this.field3473.UnlockRect(0);
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lde;IIZ[III)V")
    public class236(class15 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class85.field1472, class343.field4922, arg3 && arg0.field166, arg1 * arg2);
        if (this.field6696.field160) {
            this.field3474 = arg1;
            this.field3475 = arg2;
        } else {
            this.field3474 = class243.method1546(-26367, arg1);
            this.field3475 = class243.method1546(-26367, arg2);
        }
        if (arg3) {
            this.field3473 = this.field6696.field182.method2424(this.field3474, this.field3475, 0, 1024, 21, 1);
        } else {
            this.field3473 = this.field6696.field182.method2424(this.field3474, this.field3475, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6696.field181;
        int var9 = this.field3473.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class396.method2412((byte) -40, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2413(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2413(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field3473.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1538(int arg0) {
        if (arg0 != -29358) {
            this.method1538(127);
        }
        return this.field3473;
    }
}
