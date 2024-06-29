import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 extends class283 implements class105 {

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field521;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (arg0 != -9341) {
            this.method41(39);
        }
        this.field3589.method337(this, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILju;)V")
    public final void method43(int arg0, class115 arg1) {
        super.method43(arg0, arg1);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method33(int arg0) {
        return arg0 > -49 ? (IDirect3DBaseTexture) null : this.field521;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Ltga;IZ[[I)V")
    public class34(class54 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class556.field6946, class100.field1288, arg2 && arg0.field692, arg1 * 6 * arg1);
        this.field522 = arg1;
        if (this.field3590) {
            this.field521 = this.field3589.field696.method2467(this.field522, 0, 1024, 21, 1);
        } else {
            this.field521 = this.field3589.field696.method2467(this.field522, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field3589.field690;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field521.LockRect(var6, 0, 0, 0, this.field522, this.field522, 0, var5);
            if (class451.method2482(14528, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field522 * 4 == var8) {
                    var5.method2485(arg3[var6], 0, 0, this.field522 * this.field522);
                } else {
                    for (int var9 = 0; var9 < this.field522; var9++) {
                        var5.method2485(arg3[var6], this.field522 * var9, var8 * var9, this.field522);
                    }
                }
                this.field521.UnlockRect(var6, 0);
            }
        }
    }
}
