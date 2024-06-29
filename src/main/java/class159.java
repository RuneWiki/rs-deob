import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class159 extends class139 implements class200 {

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    private int field2556;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2557;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Z")
    public boolean field2559;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "Z")
    public boolean field2560;

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lbfa;IIZ[III)V")
    public class159(class370 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class746.field10332, class523.field7249, arg3 && arg0.field5270, arg1 * arg2);
        if (this.field2309.field5264) {
            this.field2556 = arg2;
            this.field2558 = arg1;
        } else {
            this.field2558 = class529.method3059(arg1, (byte) 108);
            this.field2556 = class529.method3059(arg2, (byte) 108);
        }
        if (arg3) {
            this.field2557 = this.field2309.field5282.method2841(this.field2558, this.field2556, 0, 1024, 21, 1);
        } else {
            this.field2557 = this.field2309.field5282.method2841(this.field2558, this.field2556, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field2309.field5275;
        int var9 = this.field2557.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class483.method2836(var9, false)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2858(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2858(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2557.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lbfa;Lwq;Lbaa;II)V")
    public class159(class370 arg0, class169 arg1, class523 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field2309.field5264) {
            this.field2558 = arg3;
            this.field2556 = arg4;
        } else {
            this.field2558 = class529.method3059(arg3, (byte) 108);
            this.field2556 = class529.method3059(arg4, (byte) 108);
        }
        this.field2557 = this.field2309.field5282.method2841(arg3, arg4, 1, 0, class370.method2353(22, this.field2311, this.field2312), 1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lria;I)V")
    public final void method376(class287 arg0, int arg1) {
        super.method376(arg0, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method375(int arg0) {
        return arg0 == 17723 ? this.field2557 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)I")
    public final int method1009(boolean arg0) {
        return arg0 ? -95 : this.field2558;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I")
    public final int method1010(int arg0) {
        int var2 = -47 % ((55 - arg0) / 63);
        return this.field2556;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I[IIIIBI)V")
    public final void method1008(int arg0, int[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class746.field10332 != this.field2312 || class523.field7249 != this.field2311) {
            throw new RuntimeException();
        }
        if (arg5 != 112) {
            this.field2559 = false;
        }
        PixelBuffer var8 = this.field2309.field5275;
        int var9 = this.field2557.LockRect(0, arg0, arg3, arg2, arg4, 16, var8);
        if (!class483.method2836(var9, false)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg2 * 4 == var10) {
            var8.method2859(arg1, arg6, 0, arg1.length);
        } else {
            for (int var11 = 0; var11 < arg4; var11++) {
                var8.method2859(arg1, arg6 + (arg2 * var11), var10 * var11, arg2);
            }
        }
        this.field2557.UnlockRect(0);
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lbfa;Lwq;IIZ[BII)V")
    public class159(class370 arg0, class169 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class523.field7249, arg4 && arg0.field5270, arg2 * arg3);
        if (this.field2309.field5264) {
            this.field2558 = arg2;
            this.field2556 = arg3;
        } else {
            this.field2558 = class529.method3059(arg2, (byte) 108);
            this.field2556 = class529.method3059(arg3, (byte) 108);
        }
        if (arg4) {
            this.field2557 = this.field2309.field5282.method2841(this.field2558, this.field2556, 0, 1024, class370.method2353(22, class523.field7249, this.field2312), 1);
        } else {
            this.field2557 = this.field2309.field5282.method2841(this.field2558, this.field2556, 1, 0, class370.method2353(22, class523.field7249, this.field2312), 1);
        }
        PixelBuffer var9 = this.field2309.field5275;
        int var10 = this.field2557.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class483.method2836(var10, false)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field2312.field2654 * arg2;
            int var12 = this.field2312.field2654 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2856(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2856(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field2557.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BF)F")
    public final float method1002(byte arg0, float arg1) {
        return arg0 > -24 ? -0.2576451F : arg1 / (float) this.field2556;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II[IIIIII)V")
    public final void method1013(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class746.field10332 != this.field2312 || class523.field7249 != this.field2311) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field2309.field5275;
        int var10 = this.field2557.LockRect(0, arg3, arg6, arg5, arg7, 0, var9);
        if (class483.method2836(var10, false)) {
            int var11 = var9.getRowPitch();
            if ((arg5 * 4) == var11 && arg0 == arg5) {
                var9.method2858(arg2, arg4, 0, arg5 * arg7);
            } else {
                for (int var12 = 0; var12 < arg7; var12++) {
                    var9.method2858(arg2, arg0 * var12 + arg4, var11 * var12, arg5);
                }
            }
            this.field2557.UnlockRect(0);
        }
        if (arg1 != 22809) {
            this.field2559 = false;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(FI)F")
    public final float method1004(float arg0, int arg1) {
        return arg1 < 69 ? 0.44069603F : arg0 / (float) this.field2558;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public final void method374(byte arg0) {
        if (arg0 > -21) {
            this.method376(null, 39);
        }
        this.field2309.method2349(13700, this);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIBIIII[BLwq;)V")
    public final void method1007(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, class169 arg8) {
        if (this.field2312 != arg8 || class523.field7249 != this.field2311) {
            throw new RuntimeException();
        } else if (arg2 < -4) {
            PixelBuffer var10 = this.field2309.field5275;
            int var11 = this.field2557.LockRect(0, arg6, arg0, arg5, arg4, 0, var10);
            if (class483.method2836(var11, false)) {
                int var12 = this.field2312.field2654 * arg3;
                int var13 = this.field2312.field2654 * arg5;
                int var14 = var10.getRowPitch();
                if (var13 == var14 && var12 == var13) {
                    var10.method2856(arg7, arg1, 0, arg4 * var13);
                } else {
                    for (int var15 = 0; var15 < arg4; var15++) {
                        var10.method2856(arg7, var12 * var15 + arg1, var14 * var15, var13);
                    }
                }
                this.field2557.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)Z")
    public final boolean method1011(int arg0) {
        if (arg0 <= 84) {
            this.method1004(1.9572803F, 45);
        }
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZI)V")
    public final void method1014(boolean arg0, boolean arg1, int arg2) {
        this.field2560 = arg1;
        if (arg2 == 25688) {
            this.field2559 = arg0;
        }
    }
}
