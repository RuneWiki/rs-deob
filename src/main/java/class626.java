import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class626 extends class324 implements class423 {

    @OriginalMember(owner = "client!au", name = "f", descriptor = "I")
    private int field9016;

    @OriginalMember(owner = "client!au", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field9017;

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 6)
    public final IDirect3DBaseTexture method1273(int arg0) {
        if (arg0 != -26670) {
            this.field9016 = -18;
        }
        return this.field9017;
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)V", line = 16)
    public final void method1274(byte arg0) {
        this.field4107.method3429(this, (byte) 58);
        if (arg0 != 57) {
            this.field9017 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lhg;IZ[[I)V", line = 26)
    public class626(class591 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class10.field80, class160.field1932, arg2 && arg0.field8565, arg1 * arg1 * 6);
        this.field9016 = arg1;
        if (this.field4106) {
            this.field9017 = this.field4107.field8586.method2328(this.field9016, 0, 1024, 21, 1);
        } else {
            this.field9017 = this.field4107.field8586.method2328(this.field9016, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4107.field8569;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field9017.LockRect(var6, 0, 0, 0, this.field9016, this.field9016, 0, var5);
            if (class407.method2320(var7, -2005530590)) {
                int var8 = var5.getRowPitch();
                if ((this.field9016 * 4) == var8) {
                    var5.method2341(arg3[var6], 0, 0, this.field9016 * this.field9016);
                } else {
                    for (int var9 = 0; var9 < this.field9016; var9++) {
                        var5.method2341(arg3[var6], this.field9016 * var9, var8 * var9, this.field9016);
                    }
                }
                this.field9017.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILie;)V", line = 78)
    public final void method1272(int arg0, class6 arg1) {
        super.method1272(arg0, arg1);
    }
}
