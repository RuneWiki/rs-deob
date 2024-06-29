import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class435;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class531 extends class483 implements class443 {

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    private int field7316;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "I")
    private int field7318;

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "I")
    private int field7317;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field7315;

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lhb;Lsk;III[B)V")
    public class531(class343 arg0, class452 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class404.field5338, false, arg2 * arg3 * arg4);
        this.field7316 = arg2;
        this.field7318 = arg3;
        this.field7317 = arg4;
        this.field7315 = this.field6725.field4612.method2457(arg2, arg3, arg4, 1, 0, class343.method2008(arg1, this.field6726, 28), 1);
        PixelBuffer var7 = this.field6725.field4594;
        int var8 = this.field7315.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class435.method2447(-1, var8)) {
            int var9 = this.field6727.field5964 * this.field7316;
            int var10 = this.field7318 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2437(arg5, 0, 0, this.field7318 * this.field7317 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field7317; var13++) {
                        var7.method2437(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field7317; var14++) {
                        for (int var15 = 0; var15 < this.field7318; var15++) {
                            var7.method2437(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field7315.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ILng;)V")
    public final void method390(int arg0, class219 arg1) {
        super.method390(arg0, arg1);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        if (!arg0) {
            this.method389(true);
        }
        this.field6725.method2023((byte) 95, this);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method388(int arg0) {
        if (arg0 != -18414) {
            this.field7317 = -71;
        }
        return this.field7315;
    }
}
