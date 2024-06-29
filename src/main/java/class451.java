import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class451 extends class582 implements class219 {

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    private int field6314;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field6315;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V")
    public final void method2076(boolean arg0) {
        if (!arg0) {
            this.method2076(true);
        }
        this.field8274.method3189(140, this);
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Leda;IZ[[I)V")
    public class451(class561 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class412.field5529, class179.field2008, arg2 && arg0.field8024, arg1 * 6 * arg1);
        this.field6314 = arg1;
        if (this.field8271) {
            this.field6315 = this.field8274.field8021.method2534(this.field6314, 0, 1024, 21, 1);
        } else {
            this.field6315 = this.field8274.field8021.method2534(this.field6314, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field8274.field8010;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field6315.LockRect(var6, 0, 0, 0, this.field6314, this.field6314, 0, var5);
            if (class439.method2511((byte) 35, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field6314 * 4 == var8) {
                    var5.method2507(arg3[var6], 0, 0, this.field6314 * this.field6314);
                } else {
                    for (int var9 = 0; var9 < this.field6314; var9++) {
                        var5.method2507(arg3[var6], this.field6314 * var9, var8 * var9, this.field6314);
                    }
                }
                this.field6315.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2075(int arg0) {
        return arg0 == -8780 ? this.field6315 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ldj;B)V")
    public final void method2077(class197 arg0, byte arg1) {
        super.method2077(arg0, arg1);
    }
}
