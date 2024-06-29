import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class420 extends class552 implements class187 {

    @OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
    private int field5281;

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    private int field5284;

    @OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
    private int field5283;

    @OriginalMember(owner = "client!ep", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field5282;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 6)
    public final void method527(int arg0) {
        this.field7697.method1694(this, true);
        if (arg0 != 9258) {
            this.field5282 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lgaa;Lec;III[B)V", line = 16)
    public class420(class302 arg0, class146 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class117.field1509, false, arg2 * arg4 * arg3);
        this.field5281 = arg2;
        this.field5284 = arg3;
        this.field5283 = arg4;
        this.field5282 = this.field7697.field3716.method2316(arg2, arg3, arg4, 1, 0, class302.method1720(arg1, this.field7698, true), 1);
        PixelBuffer var7 = this.field7697.field3720;
        int var8 = this.field5282.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class439.method2333(var8, -2005530519)) {
            int var9 = this.field7699.field1885 * this.field5281;
            int var10 = this.field5284 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2304(arg5, 0, 0, this.field5284 * var9 * this.field5283);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field5283; var13++) {
                        var7.method2304(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field5283; var14++) {
                        for (int var15 = 0; var15 < this.field5284; var15++) {
                            var7.method2304(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field5282.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lmv;I)V", line = 87)
    public final void method521(class688 arg0, int arg1) {
        super.method521(arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 98)
    public final IDirect3DBaseTexture method524(int arg0) {
        if (arg0 != -13997) {
            this.method524(81);
        }
        return this.field5282;
    }
}
