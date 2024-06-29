import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class410;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class237 extends class550 implements class284 {

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    private int field3318;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field3317;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1481(int arg0) {
        if (arg0 <= 42) {
            this.field3318 = -12;
        }
        return this.field3317;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public final void method1482(int arg0) {
        this.field7609.method1605(true, this);
        if (arg0 != -31490) {
            this.field3318 = 58;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZLfj;)V")
    public final void method1483(boolean arg0, class564 arg1) {
        super.method1483(arg0, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lbv;IZ[[I)V")
    public class237(class256 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class49.field958, class608.field8759, arg2 && arg0.field3545, arg1 * 6 * arg1);
        this.field3318 = arg1;
        if (this.field7607) {
            this.field3317 = this.field7609.field3527.method2435(this.field3318, 0, 1024, 21, 1);
        } else {
            this.field3317 = this.field7609.field3527.method2435(this.field3318, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field7609.field3542;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field3317.LockRect(var6, 0, 0, 0, this.field3318, this.field3318, 0, var5);
            if (class410.method2428(var7, (byte) 111)) {
                int var8 = var5.getRowPitch();
                if (this.field3318 * 4 == var8) {
                    var5.method2449(arg3[var6], 0, 0, this.field3318 * this.field3318);
                } else {
                    for (int var9 = 0; var9 < this.field3318; var9++) {
                        var5.method2449(arg3[var6], this.field3318 * var9, var8 * var9, this.field3318);
                    }
                }
                this.field3317.UnlockRect(var6, 0);
            }
        }
    }
}
