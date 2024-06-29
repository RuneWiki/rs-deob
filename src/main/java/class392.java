import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class485;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class392 extends class265 implements class668 {

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "I")
    private int field4988;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    private int field4985;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    private int field4986;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4987;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)V")
    public final void method703(byte arg0) {
        if (arg0 < 71) {
            this.field4988 = 86;
        }
        this.field3351.method3295((byte) 71, this);
    }

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1454(int arg0) {
        if (arg0 != -23413) {
            this.field4987 = null;
        }
        return this.field4987;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(ILcg;)V")
    public final void method694(int arg0, class140 arg1) {
        super.method694(arg0, arg1);
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Lul;Let;III[B)V")
    public class392(class574 arg0, class596 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class285.field3589, false, arg2 * arg4 * arg3);
        this.field4988 = arg3;
        this.field4985 = arg4;
        this.field4986 = arg2;
        this.field4987 = this.field3351.field8080.method2872(arg2, arg3, arg4, 1, 0, class574.method3284(this.field3350, arg1, false), 1);
        PixelBuffer var7 = this.field3351.field8067;
        int var8 = this.field4987.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class485.method2865(var8, 25499)) {
            int var9 = this.field3353.field8313 * this.field4986;
            int var10 = this.field4988 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2885(arg5, 0, 0, this.field4988 * var9 * this.field4985);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4985; var13++) {
                        var7.method2885(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4985; var14++) {
                        for (int var15 = 0; var15 < this.field4988; var15++) {
                            var7.method2885(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field4987.UnlockBox(0);
        }
    }
}
