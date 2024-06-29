import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class487;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class73 extends class467 implements class297 {

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    private int field897;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field895;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "Z")
    public boolean field896;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "Z")
    public boolean field898;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IF)F")
    public final float method591(int arg0, float arg1) {
        return arg0 == -2092 ? arg1 / (float) this.field899 : -0.25645807F;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)I")
    public final int method592(byte arg0) {
        int var2 = -126 % ((60 - arg0) / 54);
        return this.field899;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lmh;Lqda;IIZ[BII)V")
    public class73(class632 arg0, class105 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class408.field5668, arg4 && arg0.field8430, arg2 * arg3);
        if (this.field6418.field8418) {
            this.field897 = arg3;
            this.field899 = arg2;
        } else {
            this.field899 = class737.method4119(arg2, (byte) -128);
            this.field897 = class737.method4119(arg3, (byte) -128);
        }
        if (arg4) {
            this.field895 = this.field6418.field8422.method2749(this.field899, this.field897, 0, 1024, class632.method3473((byte) 19, class408.field5668, this.field6420), 1);
        } else {
            this.field895 = this.field6418.field8422.method2749(this.field899, this.field897, 1, 0, class632.method3473((byte) 24, class408.field5668, this.field6420), 1);
        }
        PixelBuffer var9 = this.field6418.field8414;
        int var10 = this.field895.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class487.method2767(var10, (byte) 123)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6420.field1441 * arg2;
            int var12 = this.field6420.field1441 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2766(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2766(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field895.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILqda;IBIIII[B)V")
    public final void method593(int arg0, class105 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (this.field6420 != arg1 || class408.field5668 != this.field6419) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6418.field8414;
        if (arg3 > -114) {
            this.method594(69, 88, null, 3, -125, -34, -32);
        }
        int var11 = this.field895.LockRect(0, arg5, arg7, arg2, arg6, 0, var10);
        if (!class487.method2767(var11, (byte) 127)) {
            return;
        }
        int var12 = this.field6420.field1441 * arg0;
        int var13 = this.field6420.field1441 * arg2;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2766(arg8, arg4, 0, arg6 * var13);
        } else {
            for (int var15 = 0; var15 < arg6; var15++) {
                var10.method2766(arg8, arg4 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field895.UnlockRect(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II[IIIII)V")
    public final void method594(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class315.field4498 != this.field6420 || class408.field5668 != this.field6419) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field6418.field8414;
        if (arg5 != 12679) {
            this.method597(-1.4435686F, -36);
        }
        int var9 = this.field895.LockRect(0, arg0, arg3, arg6, arg1, 16, var8);
        if (!class487.method2767(var9, (byte) 110)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg6 * 4 == var10) {
            var8.method2771(arg2, arg4, 0, arg2.length);
        } else {
            for (int var11 = 0; var11 < arg1; var11++) {
                var8.method2771(arg2, arg4 + (arg6 * var11), var10 * var11, arg6);
            }
        }
        this.field895.UnlockRect(0);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IZZ)V")
    public final void method595(int arg0, boolean arg1, boolean arg2) {
        this.field898 = arg2;
        if (arg0 != 1645) {
            this.field895 = null;
        }
        this.field896 = arg1;
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method535(int arg0) {
        if (arg0 > -75) {
            this.method594(25, -1, null, 117, 125, -109, 50);
        }
        return this.field895;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lmh;Lqda;Lns;II)V")
    public class73(class632 arg0, class105 arg1, class408 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6418.field8418) {
            this.field897 = arg4;
            this.field899 = arg3;
        } else {
            this.field899 = class737.method4119(arg3, (byte) -128);
            this.field897 = class737.method4119(arg4, (byte) -128);
        }
        this.field895 = this.field6418.field8422.method2749(arg3, arg4, 1, 0, class632.method3473((byte) 80, this.field6419, this.field6420), 1);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII[IIB)V")
    public final void method596(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, byte arg7) {
        if (class315.field4498 != this.field6420 || class408.field5668 != this.field6419) {
            throw new RuntimeException();
        }
        if (arg7 < 57) {
            this.method535(55);
        }
        PixelBuffer var9 = this.field6418.field8414;
        int var10 = this.field895.LockRect(0, arg2, arg0, arg4, arg6, 0, var9);
        if (!class487.method2767(var10, (byte) 116)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg4 * 4 == var11 && arg1 == arg4) {
            var9.method2770(arg5, arg3, 0, arg4 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method2770(arg5, arg3 + (arg1 * var12), var11 * var12, arg4);
            }
        }
        this.field895.UnlockRect(0);
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lmh;IIZ[III)V")
    public class73(class632 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class315.field4498, class408.field5668, arg3 && arg0.field8430, arg1 * arg2);
        if (this.field6418.field8418) {
            this.field897 = arg2;
            this.field899 = arg1;
        } else {
            this.field899 = class737.method4119(arg1, (byte) -128);
            this.field897 = class737.method4119(arg2, (byte) -128);
        }
        if (arg3) {
            this.field895 = this.field6418.field8422.method2749(this.field899, this.field897, 0, 1024, 21, 1);
        } else {
            this.field895 = this.field6418.field8422.method2749(this.field899, this.field897, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6418.field8414;
        int var9 = this.field895.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class487.method2767(var9, (byte) 117)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2770(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2770(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field895.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(FI)F")
    public final float method597(float arg0, int arg1) {
        int var3 = -83 % ((arg1 + 25) / 45);
        return arg0 / (float) this.field897;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
    public final void method339(int arg0) {
        this.field6418.method3478(this, (byte) 84);
        if (arg0 != 32073) {
            this.field895 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILkha;)V")
    public final void method340(int arg0, class584 arg1) {
        super.method340(arg0, arg1);
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)I")
    public final int method598(byte arg0) {
        if (arg0 != 111) {
            this.field898 = true;
        }
        return this.field897;
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(B)Z")
    public final boolean method599(byte arg0) {
        int var2 = 29 / ((48 - arg0) / 53);
        return true;
    }
}
