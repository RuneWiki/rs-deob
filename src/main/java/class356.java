import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class723;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class356 extends class231 implements class207 {

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    private int field4739;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field4740;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 6)
    public final IDirect3DBaseTexture method1465(int arg0) {
        return arg0 == 13367 ? this.field4740 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V", line = 18)
    public final void method1793(int arg0) {
        this.field3005.method1725(0, this);
        if (arg0 != 3323) {
            this.method1466(null, 113);
        }
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lcu;IZ[[I)V", line = 27)
    public class356(class287 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class440.field6178, class240.field3093, arg2 && arg0.field3651, arg1 * arg1 * 6);
        this.field4739 = arg1;
        if (this.field3002) {
            this.field4740 = this.field3005.field3643.method4011(this.field4739, 0, 1024, 21, 1);
        } else {
            this.field4740 = this.field3005.field3643.method4011(this.field4739, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field3005.field3642;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field4740.LockRect(var6, 0, 0, 0, this.field4739, this.field4739, 0, var5);
            if (class723.method3998(false, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field4739 * 4 == var8) {
                    var5.method4000(arg3[var6], 0, 0, this.field4739 * this.field4739);
                } else {
                    for (int var9 = 0; var9 < this.field4739; var9++) {
                        var5.method4000(arg3[var6], this.field4739 * var9, var8 * var9, this.field4739);
                    }
                }
                this.field4740.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(Lbba;I)V", line = 78)
    public final void method1466(class721 arg0, int arg1) {
        super.method1466(arg0, arg1 ^ 0x0);
        if (arg1 != 13584) {
            this.field4740 = null;
        }
    }
}
