import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class742;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uca")
public class class703 extends class566 implements class492 {

    @OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
    private int field9794;

    @OriginalMember(owner = "client!uca", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field9795;

    @OriginalMember(owner = "client!uca", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 4)
    public final IDirect3DBaseTexture method1211(byte arg0) {
        if (arg0 != -15) {
            this.method1211((byte) 109);
        }
        return this.field9795;
    }

    @OriginalMember(owner = "client!uca", name = "c", descriptor = "(I)V", line = 14)
    public final void method1118(int arg0) {
        if (arg0 <= 105) {
            this.method1118(-15);
        }
        this.field7844.method2419(this, 0);
    }

    @OriginalMember(owner = "client!uca", name = "a", descriptor = "(Ltha;B)V", line = 24)
    public final void method1121(class372 arg0, byte arg1) {
        super.method1121(arg0, arg1);
    }

    @OriginalMember(owner = "client!uca", name = "<init>", descriptor = "(Lkfa;IZ[[I)V", line = 33)
    public class703(class386 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class623.field8394, class38.field472, arg2 && arg0.field5534, arg1 * arg1 * 6);
        this.field9794 = arg1;
        if (this.field7846) {
            this.field9795 = this.field7844.field5542.method4119(this.field9794, 0, 1024, 21, 1);
        } else {
            this.field9795 = this.field7844.field5542.method4119(this.field9794, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field7844.field5557;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field9795.LockRect(var6, 0, 0, 0, this.field9794, this.field9794, 0, var5);
            if (class742.method4137(var7, -1)) {
                int var8 = var5.getRowPitch();
                if ((this.field9794 * 4) == var8) {
                    var5.method4109(arg3[var6], 0, 0, this.field9794 * this.field9794);
                } else {
                    for (int var9 = 0; var9 < this.field9794; var9++) {
                        var5.method4109(arg3[var6], this.field9794 * var9, var8 * var9, this.field9794);
                    }
                }
                this.field9795.UnlockRect(var6, 0);
            }
        }
    }
}
