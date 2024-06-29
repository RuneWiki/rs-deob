import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class396;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class502 extends class463 implements class628 {

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    private int field7033;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field7034;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lde;IZ[[I)V")
    public class502(class15 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class85.field1472, class343.field4922, arg2 && arg0.field178, arg1 * arg1 * 6);
        this.field7033 = arg1;
        if (this.field6697) {
            this.field7034 = this.field6696.field182.method2427(this.field7033, 0, 1024, 21, 1);
        } else {
            this.field7034 = this.field6696.field182.method2427(this.field7033, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6696.field181;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field7034.LockRect(var6, 0, 0, 0, this.field7033, this.field7033, 0, var5);
            if (class396.method2412((byte) -25, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field7033 * 4) == var8) {
                    var5.method2413(arg3[var6], 0, 0, this.field7033 * this.field7033);
                } else {
                    for (int var9 = 0; var9 < this.field7033; var9++) {
                        var5.method2413(arg3[var6], this.field7033 * var9, var8 * var9, this.field7033);
                    }
                }
                this.field7034.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lem;I)V")
    public final void method840(class599 arg0, int arg1) {
        int var3 = -15 / ((arg1 + 72) / 48);
        super.method840(arg0, 40);
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1538(int arg0) {
        if (arg0 != -29358) {
            this.field7033 = -62;
        }
        return this.field7034;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(I)V")
    public final void method841(int arg0) {
        this.field6696.method160(this, -12812);
        if (arg0 <= 68) {
            this.method840(null, -81);
        }
    }
}
