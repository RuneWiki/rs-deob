import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class568 extends class681 implements class461 {

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    private int field8028;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8027;

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lta;IZ[[I)V", line = 3)
    public class568(class224 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class691.field9659, class34.field457, arg2 && arg0.field3443, arg1 * 6 * arg1);
        this.field8028 = arg1;
        if (this.field9447) {
            this.field8027 = this.field9450.field3450.method3069(this.field8028, 0, 1024, 21, 1);
        } else {
            this.field8027 = this.field9450.field3450.method3069(this.field8028, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field9450.field3451;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8027.LockRect(var6, 0, 0, 0, this.field8028, this.field8028, 0, var5);
            if (class507.method3053(var7, -1)) {
                int var8 = var5.getRowPitch();
                if (this.field8028 * 4 == var8) {
                    var5.method3081(arg3[var6], 0, 0, this.field8028 * this.field8028);
                } else {
                    for (int var9 = 0; var9 < this.field8028; var9++) {
                        var5.method3081(arg3[var6], this.field8028 * var9, var8 * var9, this.field8028);
                    }
                }
                this.field8027.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILtda;)V", line = 54)
    public final void method2563(int arg0, class663 arg1) {
        super.method2563(arg0, arg1);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 61)
    public final void method2561(int arg0) {
        this.field9450.method1533(0, this);
        int var2 = -62 / ((arg0 + 77) / 43);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 75)
    public final IDirect3DBaseTexture method2576(boolean arg0) {
        return arg0 ? this.field8027 : (IDirect3DBaseTexture) null;
    }
}
