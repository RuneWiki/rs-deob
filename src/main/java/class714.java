import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nea")
public class class714 extends class44 implements class455 {

    @OriginalMember(owner = "client!nea", name = "g", descriptor = "I")
    private int field9963;

    @OriginalMember(owner = "client!nea", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field9962;

    @OriginalMember(owner = "client!nea", name = "<init>", descriptor = "(Lbea;IZ[[I)V", line = 4)
    public class714(class225 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class758.field10567, class594.field8277, arg2 && arg0.field2917, arg1 * 6 * arg1);
        this.field9963 = arg1;
        if (this.field475) {
            this.field9962 = this.field476.field2918.method2725(this.field9963, 0, 1024, 21, 1);
        } else {
            this.field9962 = this.field476.field2918.method2725(this.field9963, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field476.field2915;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field9962.LockRect(var6, 0, 0, 0, this.field9963, this.field9963, 0, var5);
            if (class483.method2718(-21593, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field9963 * 4) == var8) {
                    var5.method2741(arg3[var6], 0, 0, this.field9963 * this.field9963);
                } else {
                    for (int var9 = 0; var9 < this.field9963; var9++) {
                        var5.method2741(arg3[var6], this.field9963 * var9, var8 * var9, this.field9963);
                    }
                }
                this.field9962.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(I)V", line = 56)
    public final void method1468(int arg0) {
        if (arg0 < 14) {
            this.field9962 = null;
        }
        this.field476.method1310(this, 0);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(BLnd;)V", line = 66)
    public final void method272(byte arg0, class545 arg1) {
        super.method272(arg0, arg1);
    }

    @OriginalMember(owner = "client!nea", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 73)
    public final IDirect3DBaseTexture method271(byte arg0) {
        return arg0 == 18 ? this.field9962 : (IDirect3DBaseTexture) null;
    }
}
