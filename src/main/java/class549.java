import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mka")
public class class549 extends class439 implements class361 {

    @OriginalMember(owner = "client!mka", name = "g", descriptor = "I")
    private int field8032;

    @OriginalMember(owner = "client!mka", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8033;

    @OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(Los;IZ[[I)V", line = 4)
    public class549(class253 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class385.field5635, class496.field7281, arg2 && arg0.field3609, arg1 * arg1 * 6);
        this.field8032 = arg1;
        if (this.field6470) {
            this.field8033 = this.field6468.field3618.method3132(this.field8032, 0, 1024, 21, 1);
        } else {
            this.field8033 = this.field6468.field3618.method3132(this.field8032, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6468.field3611;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8033.LockRect(var6, 0, 0, 0, this.field8032, this.field8032, 0, var5);
            if (class402.method3156(var7, -1)) {
                int var8 = var5.getRowPitch();
                if ((this.field8032 * 4) == var8) {
                    var5.method3148(arg3[var6], 0, 0, this.field8032 * this.field8032);
                } else {
                    for (int var9 = 0; var9 < this.field8032; var9++) {
                        var5.method3148(arg3[var6], this.field8032 * var9, var8 * var9, this.field8032);
                    }
                }
                this.field8033.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(I)V", line = 56)
    public final void method2251(int arg0) {
        this.field6468.method2112(arg0 - 14355, this);
        if (arg0 != 14436) {
            this.field8032 = 14;
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(Ltd;I)V", line = 69)
    public final void method2250(class457 arg0, int arg1) {
        if (arg1 != 18475) {
            this.field8033 = null;
        }
        super.method2250(arg0, arg1 ^ 0x0);
    }

    @OriginalMember(owner = "client!mka", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 79)
    public final IDirect3DBaseTexture method2249(int arg0) {
        return arg0 >= -77 ? (IDirect3DBaseTexture) null : this.field8033;
    }
}
