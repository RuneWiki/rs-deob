import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class42 extends class366 implements class28 {

    @OriginalMember(owner = "client!wca", name = "g", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!wca", name = "i", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!wca", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field430;

    @OriginalMember(owner = "client!wca", name = "f", descriptor = "Z")
    public boolean field428;

    @OriginalMember(owner = "client!wca", name = "j", descriptor = "Z")
    public boolean field432;

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)I", line = 5)
    public final int method124(byte arg0) {
        if (arg0 != 95) {
            this.field429 = -58;
        }
        return this.field431;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I[IIIIZII)V", line = 16)
    public final void method131(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (class75.field837 != this.field5267 || class612.field8616 != this.field5269) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field5266.field8579;
        if (arg5) {
            this.field432 = false;
        }
        int var10 = this.field430.LockRect(0, arg3, arg6, arg7, arg4, 0, var9);
        if (!class757.method4192(var10, (byte) -72)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg7 * 4 == var11 && arg2 == arg7) {
            var9.method4164(arg1, arg0, 0, arg4 * arg7);
        } else {
            for (int var12 = 0; var12 < arg4; var12++) {
                var9.method4164(arg1, arg0 + (arg2 * var12), var11 * var12, arg7);
            }
        }
        this.field430.UnlockRect(0);
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)Z", line = 56)
    public final boolean method132(int arg0) {
        if (arg0 <= 32) {
            this.field432 = true;
        }
        return true;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(II[BLpb;IIIII)V", line = 66)
    public final void method127(int arg0, int arg1, byte[] arg2, class2 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field5267 != arg3 || class612.field8616 != this.field5269) {
            throw new RuntimeException();
        }
        if (arg5 != 22217) {
            this.method129(false, true, true);
        }
        PixelBuffer var10 = this.field5266.field8579;
        int var11 = this.field430.LockRect(0, arg6, arg8, arg4, arg7, 0, var10);
        if (!class757.method4192(var11, (byte) -67)) {
            return;
        }
        int var12 = this.field5267.field17 * arg4;
        int var13 = this.field5267.field17 * arg1;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method120(arg2, arg0, 0, arg7 * var12);
        } else {
            for (int var15 = 0; var15 < arg7; var15++) {
                var10.method120(arg2, var13 * var15 + arg0, var14 * var15, var12);
            }
        }
        this.field430.UnlockRect(0);
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lsga;Lpb;Loea;II)V", line = 107)
    public class42(class608 arg0, class2 arg1, class612 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field5266.field8568) {
            this.field431 = arg4;
            this.field429 = arg3;
        } else {
            this.field429 = class179.method1142(arg3, 72);
            this.field431 = class179.method1142(arg4, 80);
        }
        this.field430 = this.field5266.field8555.method4178(arg3, arg4, 1, 0, class608.method3516(this.field5267, false, this.field5269), 1);
    }

    @OriginalMember(owner = "client!wca", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 127)
    public final IDirect3DBaseTexture method334(int arg0) {
        return arg0 > -10 ? (IDirect3DBaseTexture) null : this.field430;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(ZZZ)V", line = 137)
    public final void method129(boolean arg0, boolean arg1, boolean arg2) {
        this.field428 = arg0;
        this.field432 = arg2;
        if (!arg1) {
            this.field428 = false;
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(BLcw;)V", line = 148)
    public final void method280(byte arg0, class144 arg1) {
        super.method280((byte) 94, arg1);
        int var3 = 49 % ((18 - arg0) / 60);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)V", line = 158)
    public final void method279(int arg0) {
        if (arg0 != 15320) {
            this.method132(69);
        }
        this.field5266.method3528(2808, this);
    }

    @OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)I", line = 168)
    public final int method130(byte arg0) {
        if (arg0 != 11) {
            this.field429 = -23;
        }
        return this.field429;
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(IIII[III)V", line = 179)
    public final void method125(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (class75.field837 != this.field5267 || class612.field8616 != this.field5269) {
            throw new RuntimeException();
        }
        if (arg0 != -15104) {
            this.field429 = 101;
        }
        PixelBuffer var8 = this.field5266.field8579;
        int var9 = this.field430.LockRect(0, arg6, arg1, arg5, arg3, 16, var8);
        if (!class757.method4192(var9, (byte) 110)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if ((arg5 * 4) == var10) {
            var8.method4165(arg4, arg2, 0, arg4.length);
        } else {
            for (int var11 = 0; var11 < arg3; var11++) {
                var8.method4165(arg4, arg5 * var11 + arg2, var10 * var11, arg5);
            }
        }
        this.field430.UnlockRect(0);
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lsga;Lpb;IIZ[BII)V", line = 218)
    public class42(class608 arg0, class2 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class612.field8616, arg4 && arg0.field8573, arg2 * arg3);
        if (this.field5266.field8568) {
            this.field431 = arg3;
            this.field429 = arg2;
        } else {
            this.field429 = class179.method1142(arg2, -81);
            this.field431 = class179.method1142(arg3, 72);
        }
        if (arg4) {
            this.field430 = this.field5266.field8555.method4178(this.field429, this.field431, 0, 1024, class608.method3516(this.field5267, false, class612.field8616), 1);
        } else {
            this.field430 = this.field5266.field8555.method4178(this.field429, this.field431, 1, 0, class608.method3516(this.field5267, false, class612.field8616), 1);
        }
        PixelBuffer var9 = this.field5266.field8579;
        int var10 = this.field430.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class757.method4192(var10, (byte) 100)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field5267.field17 * arg7;
            int var12 = this.field5267.field17 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method120(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method120(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field430.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(FI)F", line = 276)
    public final float method126(float arg0, int arg1) {
        return arg1 == 5263 ? arg0 / (float) this.field429 : 0.6193852F;
    }

    @OriginalMember(owner = "client!wca", name = "<init>", descriptor = "(Lsga;IIZ[III)V", line = 285)
    public class42(class608 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class75.field837, class612.field8616, arg3 && arg0.field8573, arg1 * arg2);
        if (this.field5266.field8568) {
            this.field429 = arg1;
            this.field431 = arg2;
        } else {
            this.field429 = class179.method1142(arg1, 114);
            this.field431 = class179.method1142(arg2, -126);
        }
        if (arg3) {
            this.field430 = this.field5266.field8555.method4178(this.field429, this.field431, 0, 1024, 21, 1);
        } else {
            this.field430 = this.field5266.field8555.method4178(this.field429, this.field431, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field5266.field8579;
        int var9 = this.field430.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class757.method4192(var9, (byte) -56)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method4164(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4164(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field430.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!wca", name = "a", descriptor = "(FZ)F", line = 341)
    public final float method128(float arg0, boolean arg1) {
        if (!arg1) {
            this.method334(-1);
        }
        return arg0 / (float) this.field431;
    }
}
