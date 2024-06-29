import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class482;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class637 extends class669 implements class168 {

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    private int field8765;

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8766;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field9086.method1484(7, this);
        if (arg0 != 20276) {
            this.field8765 = 87;
        }
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Ltg;IZ[[I)V")
    public class637(class229 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class165.field2263, class309.field4305, arg2 && arg0.field3076, arg1 * 6 * arg1);
        this.field8765 = arg1;
        if (this.field9087) {
            this.field8766 = this.field9086.field3093.method2883(this.field8765, 0, 1024, 21, 1);
        } else {
            this.field8766 = this.field9086.field3093.method2883(this.field8765, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field9086.field3075;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8766.LockRect(var6, 0, 0, 0, this.field8765, this.field8765, 0, var5);
            if (class482.method2873(-92, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field8765 * 4 == var8) {
                    var5.method2902(arg3[var6], 0, 0, this.field8765 * this.field8765);
                } else {
                    for (int var9 = 0; var9 < this.field8765; var9++) {
                        var5.method2902(arg3[var6], this.field8765 * var9, var8 * var9, this.field8765);
                    }
                }
                this.field8766.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Llda;I)V")
    public final void method81(class485 arg0, int arg1) {
        super.method81(arg0, arg1);
    }

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1787(int arg0) {
        return arg0 == -4406 ? this.field8766 : (IDirect3DBaseTexture) null;
    }
}
