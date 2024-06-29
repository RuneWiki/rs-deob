import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class416;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class230 extends class335 implements class115 {

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    private int field3237;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    private int field3235;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    private int field3234;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field3236;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method153(int arg0) {
        if (arg0 != 12874) {
            this.field3234 = -85;
        }
        return this.field3236;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llba;I)V")
    public final void method154(class477 arg0, int arg1) {
        super.method154(arg0, arg1);
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lrca;Lkp;III[B)V")
    public class230(class391 arg0, class421 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class256.field3653, false, arg3 * arg4 * arg2);
        this.field3237 = arg2;
        this.field3235 = arg3;
        this.field3234 = arg4;
        this.field3236 = this.field4806.field5990.method2628(arg2, arg3, arg4, 1, 0, class391.method2516(this.field4805, 9, arg1), 1);
        PixelBuffer var7 = this.field4806.field5987;
        int var8 = this.field3236.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class416.method2641((byte) 48, var8)) {
            int var9 = this.field4807.field6300 * this.field3237;
            int var10 = this.field3235 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2635(arg5, 0, 0, this.field3235 * var9 * this.field3234);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field3234; var13++) {
                        var7.method2635(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field3234; var14++) {
                        for (int var15 = 0; var15 < this.field3235; var15++) {
                            var7.method2635(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field3236.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
    public final void method152(int arg0) {
        if (arg0 != 24784) {
            this.field3237 = 47;
        }
        this.field4806.method2522(-21409, this);
    }
}
