import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class516 extends class234 implements class489 {

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    private int field7272;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    private int field7271;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    private int field7270;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field7269;

    @OriginalMember(owner = "client!hca", name = "<init>", descriptor = "(Lus;Lpe;III[B)V", line = 4)
    public class516(class1 arg0, class636 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class748.field10384, false, arg2 * arg3 * arg4);
        this.field7272 = arg2;
        this.field7271 = arg3;
        this.field7270 = arg4;
        this.field7269 = this.field2785.field27.method3059(arg2, arg3, arg4, 1, 0, class1.method28(arg1, this.field2783, 6), 1);
        PixelBuffer var7 = this.field2785.field19;
        int var8 = this.field7269.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class509.method3048(-1, var8)) {
            int var9 = this.field2786.field8671 * this.field7272;
            int var10 = this.field7271 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method3069(arg5, 0, 0, this.field7271 * this.field7270 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field7270; var15++) {
                        var7.method3069(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field7270; var13++) {
                        for (int var14 = 0; var14 < this.field7271; var14++) {
                            var7.method3069(arg5, var10 * var13 + (var9 * var14), var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field7269.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Lko;I)V", line = 78)
    public final void method1439(class531 arg0, int arg1) {
        super.method1439(arg0, -98);
        if (arg1 >= -19) {
            this.method1726(53);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 88)
    public final IDirect3DBaseTexture method1440(boolean arg0) {
        if (!arg0) {
            this.method1726(102);
        }
        return this.field7269;
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V", line = 101)
    public final void method1726(int arg0) {
        if (arg0 < -93) {
            this.field2785.method37(16, this);
        }
    }
}
