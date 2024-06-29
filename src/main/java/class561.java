import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class481;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class561 extends class31 implements class460 {

    @OriginalMember(owner = "client!via", name = "g", descriptor = "I")
    private int field8001;

    @OriginalMember(owner = "client!via", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8000;

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lhl;IZ[[I)V", line = 3)
    public class561(class527 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class102.field1058, class687.field9697, arg2 && arg0.field7504, arg1 * arg1 * 6);
        this.field8001 = arg1;
        if (this.field358) {
            this.field8000 = this.field355.field7501.method2914(this.field8001, 0, 1024, 21, 1);
        } else {
            this.field8000 = this.field355.field7501.method2914(this.field8001, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field355.field7514;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8000.LockRect(var6, 0, 0, 0, this.field8001, this.field8001, 0, var5);
            if (class481.method2896(var7, 2005530520)) {
                int var8 = var5.getRowPitch();
                if (this.field8001 * 4 == var8) {
                    var5.method2919(arg3[var6], 0, 0, this.field8001 * this.field8001);
                } else {
                    for (int var9 = 0; var9 < this.field8001; var9++) {
                        var5.method2919(arg3[var6], this.field8001 * var9, var8 * var9, this.field8001);
                    }
                }
                this.field8000.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(B)V", line = 56)
    public final void method174(byte arg0) {
        if (arg0 < 38) {
            this.field8001 = -83;
        }
        this.field355.method3095(this, (byte) -85);
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 67)
    public final IDirect3DBaseTexture method154(boolean arg0) {
        if (arg0) {
            this.method155(null, 14);
        }
        return this.field8000;
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(Lqo;I)V", line = 79)
    public final void method155(class22 arg0, int arg1) {
        super.method155(arg0, arg1 ^ 0x0);
        if (arg1 != -25446) {
            this.method154(true);
        }
    }
}
