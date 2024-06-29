import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class345 extends class552 implements class660 {

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    private int field4423;

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field4424;

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lgaa;IZ[[I)V", line = 6)
    public class345(class302 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class590.field8288, class117.field1509, arg2 && arg0.field3719, arg1 * arg1 * 6);
        this.field4423 = arg1;
        if (this.field7696) {
            this.field4424 = this.field7697.field3716.method2330(this.field4423, 0, 1024, 21, 1);
        } else {
            this.field4424 = this.field7697.field3716.method2330(this.field4423, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field7697.field3720;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field4424.LockRect(var6, 0, 0, 0, this.field4423, this.field4423, 0, var5);
            if (class439.method2333(var7, -2005530519)) {
                int var8 = var5.getRowPitch();
                if (this.field4423 * 4 == var8) {
                    var5.method2305(arg3[var6], 0, 0, this.field4423 * this.field4423);
                } else {
                    for (int var9 = 0; var9 < this.field4423; var9++) {
                        var5.method2305(arg3[var6], this.field4423 * var9, var8 * var9, this.field4423);
                    }
                }
                this.field4424.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 58)
    public final IDirect3DBaseTexture method524(int arg0) {
        return arg0 == -13997 ? this.field4424 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V", line = 69)
    public final void method527(int arg0) {
        this.field7697.method1702(-104, this);
        if (arg0 != 9258) {
            this.field4424 = null;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lmv;I)V", line = 79)
    public final void method521(class688 arg0, int arg1) {
        super.method521(arg0, arg1);
    }
}
