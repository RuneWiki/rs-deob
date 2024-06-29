import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class487;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class215 extends class467 implements class493 {

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "I")
    private int field3134;

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field3135;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public final void method339(int arg0) {
        this.field6418.method3482(this, false);
        if (arg0 != 32073) {
            this.method535(-40);
        }
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILkha;)V")
    public final void method340(int arg0, class584 arg1) {
        super.method340(arg0, arg1);
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method535(int arg0) {
        if (arg0 >= -75) {
            this.field3134 = -13;
        }
        return this.field3135;
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lmh;IZ[[I)V")
    public class215(class632 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class315.field4498, class408.field5668, arg2 && arg0.field8423, arg1 * 6 * arg1);
        this.field3134 = arg1;
        if (this.field6417) {
            this.field3135 = this.field6418.field8422.method2753(this.field3134, 0, 1024, 21, 1);
        } else {
            this.field3135 = this.field6418.field8422.method2753(this.field3134, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6418.field8414;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field3135.LockRect(var6, 0, 0, 0, this.field3134, this.field3134, 0, var5);
            if (class487.method2767(var7, (byte) 125)) {
                int var8 = var5.getRowPitch();
                if (this.field3134 * 4 == var8) {
                    var5.method2770(arg3[var6], 0, 0, this.field3134 * this.field3134);
                } else {
                    for (int var9 = 0; var9 < this.field3134; var9++) {
                        var5.method2770(arg3[var6], this.field3134 * var9, var8 * var9, this.field3134);
                    }
                }
                this.field3135.UnlockRect(var6, 0);
            }
        }
    }
}
