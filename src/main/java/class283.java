import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class283 extends class687 implements class123 {

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "I")
    private int field4377;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "I")
    private int field4380;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    private int field4379;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4378;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
    public final void method195(int arg0) {
        int var2 = 30 / ((arg0 - 46) / 52);
        this.field9695.method3376(-100, this);
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lhb;Llw;III[B)V")
    public class283(class585 arg0, class233 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class121.field1859, false, arg2 * arg3 * arg4);
        this.field4377 = arg3;
        this.field4380 = arg2;
        this.field4379 = arg4;
        this.field4378 = this.field9695.field8281.method4127(arg2, arg3, arg4, 1, 0, class585.method3377(arg1, (byte) -2, this.field9698), 1);
        PixelBuffer var7 = this.field9695.field8260;
        int var8 = this.field4378.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class737.method4132(-128, var8)) {
            int var9 = this.field9696.field3750 * this.field4380;
            int var10 = this.field4377 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2587(arg5, 0, 0, this.field4379 * this.field4377 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4379; var13++) {
                        var7.method2587(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4379; var14++) {
                        for (int var15 = 0; var15 < this.field4377; var15++) {
                            var7.method2587(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field4378.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lgca;I)V")
    public final void method204(class206 arg0, int arg1) {
        int var3 = -43 / ((-arg1 - 2) / 39);
        super.method204(arg0, 77);
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1860(byte arg0) {
        return arg0 == -66 ? this.field4378 : (IDirect3DBaseTexture) null;
    }
}
