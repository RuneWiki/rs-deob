import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class435;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class70 extends class483 implements class530 {

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    private int field837;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field838;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method388(int arg0) {
        return arg0 == -18414 ? this.field838 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        this.field6725.method2033(59, this);
        if (!arg0) {
            this.field838 = null;
        }
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lhb;IZ[[I)V")
    public class70(class343 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class480.field6686, class404.field5338, arg2 && arg0.field4608, arg1 * arg1 * 6);
        this.field837 = arg1;
        if (this.field6724) {
            this.field838 = this.field6725.field4612.method2463(this.field837, 0, 1024, 21, 1);
        } else {
            this.field838 = this.field6725.field4612.method2463(this.field837, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6725.field4594;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field838.LockRect(var6, 0, 0, 0, this.field837, this.field837, 0, var5);
            if (class435.method2447(-1, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field837 * 4 == var8) {
                    var5.method2438(arg3[var6], 0, 0, this.field837 * this.field837);
                } else {
                    for (int var9 = 0; var9 < this.field837; var9++) {
                        var5.method2438(arg3[var6], this.field837 * var9, var8 * var9, this.field837);
                    }
                }
                this.field838.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILng;)V")
    public final void method390(int arg0, class219 arg1) {
        super.method390(arg0, arg1);
    }
}
