import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class179 extends class459 implements class447 {

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field2489;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)V")
    public final void method1213(int arg0) {
        this.field6617.method801(this, 0);
        if (arg0 <= 23) {
            this.method1213(-69);
        }
    }

    @OriginalMember(owner = "client!li", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1214(int arg0) {
        if (arg0 >= -14) {
            this.field2488 = 57;
        }
        return this.field2489;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lik;IZ[[I)V")
    public class179(class107 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class564.field8245, class106.field1573, arg2 && arg0.field1603, arg1 * arg1 * 6);
        this.field2488 = arg1;
        if (this.field6621) {
            this.field2489 = this.field6617.field1600.method3761(this.field2488, 0, 1024, 21, 1);
        } else {
            this.field2489 = this.field6617.field1600.method3761(this.field2488, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6617.field1588;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field2489.LockRect(var6, 0, 0, 0, this.field2488, this.field2488, 0, var5);
            if (class672.method3775(var7, 10067)) {
                int var8 = var5.getRowPitch();
                if (this.field2488 * 4 == var8) {
                    var5.method3748(arg3[var6], 0, 0, this.field2488 * this.field2488);
                } else {
                    for (int var9 = 0; var9 < this.field2488; var9++) {
                        var5.method3748(arg3[var6], this.field2488 * var9, var8 * var9, this.field2488);
                    }
                }
                this.field2489.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Lkk;I)V")
    public final void method1215(class238 arg0, int arg1) {
        super.method1215(arg0, arg1);
    }
}
