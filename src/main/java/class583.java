import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class448;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class583 extends class111 implements class629 {

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private int field8484;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8485;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILfw;)V", line = 7)
    public final void method798(int arg0, class52 arg1) {
        super.method798(arg0, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 14)
    public final void method1701(int arg0) {
        if (arg0 != 2669) {
            this.method798(-93, null);
        }
        this.field1425.method507(-100, this);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 24)
    public final IDirect3DBaseTexture method799(int arg0) {
        if (arg0 != -25567) {
            this.method799(113);
        }
        return this.field8485;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lkaa;IZ[[I)V", line = 35)
    public class583(class44 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class391.field5229, class279.field3793, arg2 && arg0.field791, arg1 * 6 * arg1);
        this.field8484 = arg1;
        if (this.field1426) {
            this.field8485 = this.field1425.field797.method2653(this.field8484, 0, 1024, 21, 1);
        } else {
            this.field8485 = this.field1425.field797.method2653(this.field8484, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field1425.field774;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8485.LockRect(var6, 0, 0, 0, this.field8484, this.field8484, 0, var5);
            if (class448.method2666((byte) -37, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field8484 * 4) == var8) {
                    var5.method2671(arg3[var6], 0, 0, this.field8484 * this.field8484);
                } else {
                    for (int var9 = 0; var9 < this.field8484; var9++) {
                        var5.method2671(arg3[var6], this.field8484 * var9, var8 * var9, this.field8484);
                    }
                }
                this.field8485.UnlockRect(var6, 0);
            }
        }
    }
}
