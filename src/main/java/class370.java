import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class370 extends class330 implements class678 {

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    private int field5402;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    private int field5403;

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field5401;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "Z")
    public boolean field5399;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "Z")
    public boolean field5400;

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Luda;Lg;IIZ[BII)V")
    public class370(class475 arg0, class166 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class415.field5986, arg4 && arg0.field6665, arg2 * arg3);
        if (this.field4686.field6673) {
            this.field5402 = arg2;
            this.field5403 = arg3;
        } else {
            this.field5402 = class8.method45(23714, arg2);
            this.field5403 = class8.method45(23714, arg3);
        }
        if (arg4) {
            this.field5401 = this.field4686.field6676.method2973(this.field5402, this.field5403, 0, 1024, class475.method2776(class415.field5986, (byte) -45, this.field4683), 1);
        } else {
            this.field5401 = this.field4686.field6676.method2973(this.field5402, this.field5403, 1, 0, class475.method2776(class415.field5986, (byte) -77, this.field4683), 1);
        }
        PixelBuffer var9 = this.field4686.field6686;
        int var10 = this.field5401.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class509.method2977(var10, 17527)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4683.field2201 * arg2;
            int var12 = this.field4683.field2201 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2976(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2976(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field5401.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
    public final int method627(int arg0) {
        return arg0 == -7840 ? this.field5403 : -1;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2137(boolean arg0) {
        return arg0 ? (IDirect3DBaseTexture) null : this.field5401;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)I")
    public final int method623(boolean arg0) {
        if (arg0) {
            this.method702((byte) 53);
        }
        return this.field5402;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        this.field4686.method2770(this, (byte) -118);
        int var2 = 16 % ((arg0 + 69) / 43);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IF)F")
    public final float method621(int arg0, float arg1) {
        return arg0 == 20490 ? arg1 / (float) this.field5403 : 1.7363178F;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII[BLg;IB)V")
    public final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, class166 arg6, int arg7, byte arg8) {
        int var10 = -38 / ((20 - arg8) / 59);
        if (this.field4683 != arg6 || class415.field5986 != this.field4685) {
            throw new RuntimeException();
        }
        PixelBuffer var11 = this.field4686.field6686;
        int var12 = this.field5401.LockRect(0, arg1, arg4, arg7, arg3, 0, var11);
        if (!class509.method2977(var12, 17527)) {
            return;
        }
        int var13 = this.field4683.field2201 * arg7;
        int var14 = this.field4683.field2201 * arg2;
        int var15 = var11.getRowPitch();
        if (var13 == var15 && var13 == var14) {
            var11.method2976(arg5, arg0, 0, arg3 * var13);
        } else {
            for (int var16 = 0; var16 < arg3; var16++) {
                var11.method2976(arg5, var14 * var16 + arg0, var15 * var16, var13);
            }
        }
        this.field5401.UnlockRect(0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(ZZZ)V")
    public final void method622(boolean arg0, boolean arg1, boolean arg2) {
        this.field5399 = arg1;
        if (!arg0) {
            this.field5399 = true;
        }
        this.field5400 = arg2;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIIII[III)V")
    public final void method620(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (class109.field1521 != this.field4683 || class415.field5986 != this.field4685) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4686.field6686;
        int var10 = this.field5401.LockRect(0, arg3, arg1, arg2, arg7, 0, var9);
        if (arg6 <= 63 || !class509.method2977(var10, 17527)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg2 * 4 == var11 && arg2 == arg4) {
            var9.method2980(arg5, arg0, 0, arg2 * arg7);
        } else {
            for (int var12 = 0; var12 < arg7; var12++) {
                var9.method2980(arg5, arg4 * var12 + arg0, var11 * var12, arg2);
            }
        }
        this.field5401.UnlockRect(0);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(FZ)F")
    public final float method617(float arg0, boolean arg1) {
        return arg1 ? -1.8452852F : arg0 / (float) this.field5402;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Luda;IIZ[III)V")
    public class370(class475 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class109.field1521, class415.field5986, arg3 && arg0.field6665, arg1 * arg2);
        if (this.field4686.field6673) {
            this.field5402 = arg1;
            this.field5403 = arg2;
        } else {
            this.field5402 = class8.method45(23714, arg1);
            this.field5403 = class8.method45(23714, arg2);
        }
        if (arg3) {
            this.field5401 = this.field4686.field6676.method2973(this.field5402, this.field5403, 0, 1024, 21, 1);
        } else {
            this.field5401 = this.field4686.field6676.method2973(this.field5402, this.field5403, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4686.field6686;
        int var9 = this.field5401.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class509.method2977(var9, 17527)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2980(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2980(arg4, arg5 + (arg6 * var11), var10 * var11, arg1);
                }
            }
            this.field5401.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Z")
    public final boolean method628(int arg0) {
        if (arg0 != 15501) {
            this.method621(27, 0.21252178F);
        }
        return true;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Luda;Lg;Lwj;II)V")
    public class370(class475 arg0, class166 arg1, class415 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4686.field6673) {
            this.field5402 = arg3;
            this.field5403 = arg4;
        } else {
            this.field5402 = class8.method45(23714, arg3);
            this.field5403 = class8.method45(23714, arg4);
        }
        this.field5401 = this.field4686.field6676.method2973(arg3, arg4, 1, 0, class475.method2776(this.field4685, (byte) -20, this.field4683), 1);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I[IIIIII)V")
    public final void method629(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class109.field1521 != this.field4683 || class415.field5986 != this.field4685) {
            throw new RuntimeException();
        } else if (arg4 == -14191) {
            PixelBuffer var8 = this.field4686.field6686;
            int var9 = this.field5401.LockRect(0, arg3, arg2, arg6, arg5, 16, var8);
            if (class509.method2977(var9, arg4 + 31718)) {
                int var10 = var8.getRowPitch();
                if ((arg6 * 4) == var10) {
                    var8.method2981(arg1, arg0, 0, arg1.length);
                } else {
                    for (int var11 = 0; var11 < arg5; var11++) {
                        var8.method2981(arg1, arg6 * var11 + arg0, var10 * var11, arg6);
                    }
                }
                this.field5401.UnlockRect(0);
            }
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(BLag;)V")
    public final void method706(byte arg0, class710 arg1) {
        super.method706((byte) -91, arg1);
        if (arg0 >= -74) {
            this.field5403 = -91;
        }
    }
}
