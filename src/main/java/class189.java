import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class675;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class189 extends class142 implements class342 {

    @OriginalMember(owner = "client!afa", name = "g", descriptor = "I")
    private int field2421;

    @OriginalMember(owner = "client!afa", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field2420;

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lmba;IZ[[I)V")
    public class189(class70 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class135.field1774, class6.field48, arg2 && arg0.field952, arg1 * arg1 * 6);
        this.field2421 = arg1;
        if (this.field1868) {
            this.field2420 = this.field1866.field958.method3716(this.field2421, 0, 1024, 21, 1);
        } else {
            this.field2420 = this.field1866.field958.method3716(this.field2421, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field1866.field959;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field2420.LockRect(var6, 0, 0, 0, this.field2421, this.field2421, 0, var5);
            if (class675.method3703((byte) -58, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field2421 * 4) == var8) {
                    var5.method3694(arg3[var6], 0, 0, this.field2421 * this.field2421);
                } else {
                    for (int var9 = 0; var9 < this.field2421; var9++) {
                        var5.method3694(arg3[var6], this.field2421 * var9, var8 * var9, this.field2421);
                    }
                }
                this.field2420.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(Lgv;I)V")
    public final void method1071(class39 arg0, int arg1) {
        super.method1071(arg0, arg1);
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1070(byte arg0) {
        if (arg0 != -72) {
            this.method1141(-38);
        }
        return this.field2420;
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(I)V")
    public final void method1141(int arg0) {
        this.field1866.method558(this, 1);
        if (arg0 != 1896) {
            this.field2421 = -2;
        }
    }
}
