import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class291 extends class10 implements class65 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field4312;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    private int field4310;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field4313;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "Z")
    public boolean field4311;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "Z")
    public boolean field4314;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Llca;IIZIIII[B)V", line = 4)
    public final void method664(class597 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (!arg3) {
            this.method665(false);
        }
        if (this.field95 != arg0 || class218.field3050 != this.field96) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field99.field5202;
        int var11 = this.field4313.LockRect(0, arg5, arg4, arg7, arg2, 0, var10);
        if (!class446.method2640(101, var11)) {
            return;
        }
        int var12 = this.field95.field8431 * arg1;
        int var13 = this.field95.field8431 * arg7;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2661(arg8, arg6, 0, arg2 * var13);
        } else {
            for (int var15 = 0; var15 < arg2; var15++) {
                var10.method2661(arg8, arg6 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field4313.UnlockRect(0);
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ltb;Llca;Lig;II)V", line = 46)
    public class291(class364 arg0, class597 arg1, class218 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field99.field5187) {
            this.field4312 = arg3;
            this.field4310 = arg4;
        } else {
            this.field4312 = class2.method9(arg3, -56);
            this.field4310 = class2.method9(arg4, 120);
        }
        this.field4313 = this.field99.field5204.method2656(arg3, arg4, 1, 0, class364.method2213((byte) -71, this.field96, this.field95), 1);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBIII[III)V", line = 66)
    public final void method667(int arg0, byte arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (arg1 != -64) {
            this.field4312 = 37;
        }
        if (class75.field1306 != this.field95 || class218.field3050 != this.field96) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field99.field5202;
        int var10 = this.field4313.LockRect(0, arg2, arg6, arg0, arg7, 0, var9);
        if (!class446.method2640(-10, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg0 * 4) == var11 && arg0 == arg4) {
            var9.method2663(arg5, arg3, 0, arg0 * arg7);
        } else {
            for (int var12 = 0; var12 < arg7; var12++) {
                var9.method2663(arg5, arg3 + (arg4 * var12), var11 * var12, arg0);
            }
        }
        this.field4313.UnlockRect(0);
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(Z)I", line = 106)
    public final int method665(boolean arg0) {
        if (arg0) {
            this.field4314 = false;
        }
        return this.field4312;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ltb;Llca;IIZ[BII)V", line = 115)
    public class291(class364 arg0, class597 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class218.field3050, arg4 && arg0.field5208, arg2 * arg3);
        if (this.field99.field5187) {
            this.field4312 = arg2;
            this.field4310 = arg3;
        } else {
            this.field4312 = class2.method9(arg2, -94);
            this.field4310 = class2.method9(arg3, 107);
        }
        if (arg4) {
            this.field4313 = this.field99.field5204.method2656(this.field4312, this.field4310, 0, 1024, class364.method2213((byte) -71, class218.field3050, this.field95), 1);
        } else {
            this.field4313 = this.field99.field5204.method2656(this.field4312, this.field4310, 1, 0, class364.method2213((byte) -71, class218.field3050, this.field95), 1);
        }
        PixelBuffer var9 = this.field99.field5202;
        int var10 = this.field4313.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class446.method2640(-115, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field95.field8431 * arg2;
            int var12 = this.field95.field8431 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2661(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2661(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field4313.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(FI)F", line = 175)
    public final float method661(float arg0, int arg1) {
        int var3 = 43 / ((arg1 + 11) / 60);
        return arg0 / (float) this.field4312;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lgaa;I)V", line = 183)
    public final void method54(class267 arg0, int arg1) {
        super.method54(arg0, arg1);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 190)
    public final void method861(int arg0) {
        if (arg0 >= -42) {
            this.field4312 = -76;
        }
        this.field99.method2212(this, 119);
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BZZ)V", line = 201)
    public final void method663(byte arg0, boolean arg1, boolean arg2) {
        this.field4311 = arg1;
        if (arg0 == -102) {
            this.field4314 = arg2;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZF)F", line = 212)
    public final float method666(boolean arg0, float arg1) {
        if (!arg0) {
            this.field4313 = null;
        }
        return arg1 / (float) this.field4310;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Z", line = 222)
    public final boolean method662(boolean arg0) {
        if (arg0) {
            this.field4310 = 82;
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 233)
    public final IDirect3DBaseTexture method55(int arg0) {
        if (arg0 != 26691) {
            this.field4311 = true;
        }
        return this.field4313;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Ltb;IIZ[III)V", line = 243)
    public class291(class364 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class75.field1306, class218.field3050, arg3 && arg0.field5208, arg1 * arg2);
        if (this.field99.field5187) {
            this.field4312 = arg1;
            this.field4310 = arg2;
        } else {
            this.field4312 = class2.method9(arg1, 105);
            this.field4310 = class2.method9(arg2, 123);
        }
        if (arg3) {
            this.field4313 = this.field99.field5204.method2656(this.field4312, this.field4310, 0, 1024, 21, 1);
        } else {
            this.field4313 = this.field99.field5204.method2656(this.field4312, this.field4310, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field99.field5202;
        int var9 = this.field4313.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class446.method2640(105, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2663(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2663(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field4313.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)I", line = 299)
    public final int method668(int arg0) {
        if (arg0 != 31607) {
            this.field4311 = true;
        }
        return this.field4310;
    }
}
