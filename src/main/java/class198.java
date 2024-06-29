import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class742;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class198 extends class566 implements class19 {

    @OriginalMember(owner = "client!pba", name = "i", descriptor = "I")
    private int field2660;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "I")
    private int field2657;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2659;

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "Z")
    public boolean field2658;

    @OriginalMember(owner = "client!pba", name = "j", descriptor = "Z")
    public boolean field2661;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ZZI)V")
    public final void method100(boolean arg0, boolean arg1, int arg2) {
        this.field2661 = arg1;
        this.field2658 = arg0;
        if (arg2 <= 40) {
            this.method1211((byte) 1);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IF)F")
    public final float method97(int arg0, float arg1) {
        if (arg0 != -28409) {
            this.method99(-44, -15, -94, null, null, 123, -103, false, 55);
        }
        return arg1 / (float) this.field2657;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lkfa;Liv;Ljt;II)V")
    public class198(class386 arg0, class25 arg1, class38 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field7844.field5550) {
            this.field2657 = arg4;
            this.field2660 = arg3;
        } else {
            this.field2660 = class606.method3450(arg3, (byte) -25);
            this.field2657 = class606.method3450(arg4, (byte) -25);
        }
        this.field2659 = this.field7844.field5542.method4128(arg3, arg4, 1, 0, class386.method2416(this.field7845, this.field7847, -775), 1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)I")
    public final int method95(byte arg0) {
        if (arg0 >= -36) {
            this.method97(-25, -0.2340294F);
        }
        return this.field2660;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(FI)F")
    public final float method96(float arg0, int arg1) {
        return arg1 == -21696 ? arg0 / (float) this.field2660 : -0.75210816F;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lkfa;IIZ[III)V")
    public class198(class386 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class623.field8394, class38.field472, arg3 && arg0.field5559, arg1 * arg2);
        if (this.field7844.field5550) {
            this.field2660 = arg1;
            this.field2657 = arg2;
        } else {
            this.field2660 = class606.method3450(arg1, (byte) -25);
            this.field2657 = class606.method3450(arg2, (byte) -25);
        }
        if (arg3) {
            this.field2659 = this.field7844.field5542.method4128(this.field2660, this.field2657, 0, 1024, 21, 1);
        } else {
            this.field2659 = this.field7844.field5542.method4128(this.field2660, this.field2657, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field7844.field5557;
        int var9 = this.field2659.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class742.method4137(var9, -1)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method4109(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4109(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2659.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(I)I")
    public final int method94(int arg0) {
        if (arg0 != 16949) {
            this.method97(120, 0.15657297F);
        }
        return this.field2657;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(II[IIIIII)V")
    public final void method101(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class623.field8394 != this.field7847 || class38.field472 != this.field7845) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field7844.field5557;
        if (arg3 != -28425) {
            this.method1118(-73);
        }
        int var10 = this.field2659.LockRect(0, arg7, arg4, arg6, arg1, 0, var9);
        if (!class742.method4137(var10, -1)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg6 * 4) == var11 && arg0 == arg6) {
            var9.method4109(arg2, arg5, 0, arg1 * arg6);
        } else {
            for (int var12 = 0; var12 < arg1; var12++) {
                var9.method4109(arg2, arg5 + (arg0 * var12), var11 * var12, arg6);
            }
        }
        this.field2659.UnlockRect(0);
    }

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1211(byte arg0) {
        if (arg0 != -15) {
            this.method96(0.37087047F, 50);
        }
        return this.field2659;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 < 110) {
            this.method1121(null, (byte) 124);
        }
        return true;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(Lkfa;Liv;IIZ[BII)V")
    public class198(class386 arg0, class25 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class38.field472, arg4 && arg0.field5559, arg2 * arg3);
        if (this.field7844.field5550) {
            this.field2657 = arg3;
            this.field2660 = arg2;
        } else {
            this.field2660 = class606.method3450(arg2, (byte) -25);
            this.field2657 = class606.method3450(arg3, (byte) -25);
        }
        if (arg4) {
            this.field2659 = this.field7844.field5542.method4128(this.field2660, this.field2657, 0, 1024, class386.method2416(class38.field472, this.field7847, -775), 1);
        } else {
            this.field2659 = this.field7844.field5542.method4128(this.field2660, this.field2657, 1, 0, class386.method2416(class38.field472, this.field7847, -775), 1);
        }
        PixelBuffer var9 = this.field7844.field5557;
        int var10 = this.field2659.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class742.method4137(var10, -1)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field7847.field313 * arg7;
            int var12 = this.field7847.field313 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2620(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2620(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field2659.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Ltha;B)V")
    public final void method1121(class372 arg0, byte arg1) {
        super.method1121(arg0, arg1);
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IIILiv;[BIIZI)V")
    public final void method99(int arg0, int arg1, int arg2, class25 arg3, byte[] arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (this.field7847 != arg3 || class38.field472 != this.field7845) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field7844.field5557;
        int var11 = this.field2659.LockRect(0, arg0, arg5, arg2, arg8, 0, var10);
        if (class742.method4137(var11, -1)) {
            int var12 = this.field7847.field313 * arg1;
            int var13 = this.field7847.field313 * arg2;
            int var14 = var10.getRowPitch();
            if (var13 == var14 && var12 == var13) {
                var10.method2620(arg4, arg6, 0, arg8 * var13);
            } else {
                for (int var15 = 0; var15 < arg8; var15++) {
                    var10.method2620(arg4, var12 * var15 + arg6, var14 * var15, var13);
                }
            }
            this.field2659.UnlockRect(0);
        }
        if (!arg7) {
            this.field2657 = -115;
        }
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(I)V")
    public final void method1118(int arg0) {
        this.field7844.method2426(8602, this);
        if (arg0 < 105) {
            this.method98(86, 120, 77, null, -103, -25, -42);
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(III[IIII)V")
    public final void method98(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        if (class623.field8394 != this.field7847 || class38.field472 != this.field7845) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field7844.field5557;
        if (arg4 != 4549) {
            this.field2660 = 107;
        }
        int var9 = this.field2659.LockRect(0, arg6, arg0, arg5, arg1, 16, var8);
        if (!class742.method4137(var9, -1)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg5 * 4 == var10) {
            var8.method4110(arg3, arg2, 0, arg3.length);
        } else {
            for (int var11 = 0; var11 < arg1; var11++) {
                var8.method4110(arg3, arg5 * var11 + arg2, var10 * var11, arg5);
            }
        }
        this.field2659.UnlockRect(0);
    }
}
