import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class485;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class261 extends class265 implements class418 {

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    private int field3287;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field3286;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ILcg;)V")
    public final void method694(int arg0, class140 arg1) {
        super.method694(arg0 ^ 0x0, arg1);
        if (arg0 != -21167) {
            this.method703((byte) 72);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V")
    public final void method703(byte arg0) {
        this.field3351.method3286(this, 0);
        if (arg0 < 71) {
            this.method694(-6, null);
        }
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lul;IZ[[I)V")
    public class261(class574 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class269.field3396, class285.field3589, arg2 && arg0.field8072, arg1 * arg1 * 6);
        this.field3287 = arg1;
        if (this.field3352) {
            this.field3286 = this.field3351.field8080.method2879(this.field3287, 0, 1024, 21, 1);
        } else {
            this.field3286 = this.field3351.field8080.method2879(this.field3287, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field3351.field8067;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field3286.LockRect(var6, 0, 0, 0, this.field3287, this.field3287, 0, var5);
            if (class485.method2865(var7, 25499)) {
                int var8 = var5.getRowPitch();
                if ((this.field3287 * 4) == var8) {
                    var5.method2887(arg3[var6], 0, 0, this.field3287 * this.field3287);
                } else {
                    for (int var9 = 0; var9 < this.field3287; var9++) {
                        var5.method2887(arg3[var6], this.field3287 * var9, var8 * var9, this.field3287);
                    }
                }
                this.field3286.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1454(int arg0) {
        if (arg0 != -23413) {
            this.method703((byte) 119);
        }
        return this.field3286;
    }
}
