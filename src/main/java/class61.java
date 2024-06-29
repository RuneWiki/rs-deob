import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class487;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class61 extends class467 implements class191 {

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    private int field754;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field753;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILkha;)V")
    public final void method340(int arg0, class584 arg1) {
        super.method340(arg0, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lmh;Lqda;III[B)V")
    public class61(class632 arg0, class105 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class408.field5668, false, arg2 * arg4 * arg3);
        this.field754 = arg4;
        this.field752 = arg3;
        this.field751 = arg2;
        this.field753 = this.field6418.field8422.method2755(arg2, arg3, arg4, 1, 0, class632.method3473((byte) 39, this.field6419, arg1), 1);
        PixelBuffer var7 = this.field6418.field8414;
        int var8 = this.field753.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class487.method2767(var8, (byte) 106)) {
            int var9 = this.field6420.field1441 * this.field751;
            int var10 = this.field752 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2766(arg5, 0, 0, this.field752 * var9 * this.field754);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field754; var13++) {
                        var7.method2766(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field754; var14++) {
                        for (int var15 = 0; var15 < this.field752; var15++) {
                            var7.method2766(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field753.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final void method339(int arg0) {
        this.field6418.method3476(this, (byte) -76);
        if (arg0 != 32073) {
            this.field754 = 54;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method535(int arg0) {
        if (arg0 > -75) {
            this.field751 = 45;
        }
        return this.field753;
    }
}
