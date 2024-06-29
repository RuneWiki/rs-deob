import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class398;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class400 extends class175 implements class547 {

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    private int field5754;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field5753;

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lnca;IZ[[I)V", line = 3)
    public class400(class54 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class411.field5856, class629.field9208, arg2 && arg0.field668, arg1 * arg1 * 6);
        this.field5754 = arg1;
        if (this.field2664) {
            this.field5753 = this.field2663.field676.method2404(this.field5754, 0, 1024, 21, 1);
        } else {
            this.field5753 = this.field2663.field676.method2404(this.field5754, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field2663.field674;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field5753.LockRect(var6, 0, 0, 0, this.field5754, this.field5754, 0, var5);
            if (class398.method2384(7155, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field5754 * 4 == var8) {
                    var5.method2381(arg3[var6], 0, 0, this.field5754 * this.field5754);
                } else {
                    for (int var9 = 0; var9 < this.field5754; var9++) {
                        var5.method2381(arg3[var6], this.field5754 * var9, var8 * var9, this.field5754);
                    }
                }
                this.field5753.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lqq;I)V", line = 56)
    public final void method379(class599 arg0, int arg1) {
        super.method379(arg0, arg1);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 63)
    public final IDirect3DBaseTexture method1179(boolean arg0) {
        if (arg0) {
            this.field5753 = null;
        }
        return this.field5753;
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(I)V", line = 76)
    public final void method380(int arg0) {
        this.field2663.method328(-64, this);
        if (arg0 < 3) {
            this.field5754 = 88;
        }
    }
}
