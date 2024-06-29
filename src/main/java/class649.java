import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class649 extends class22 implements class540 {

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    private int field9196;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field9197;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILrha;)V", line = 6)
    public final void method211(int arg0, class455 arg1) {
        super.method211(arg0, arg1);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 13)
    public final void method1159(int arg0) {
        this.field252.method114(this, 7);
        if (arg0 != 16033) {
            this.field9197 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 23)
    public final IDirect3DBaseTexture method210(byte arg0) {
        if (arg0 != -78) {
            this.method1159(33);
        }
        return this.field9197;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Llj;IZ[[I)V", line = 34)
    public class649(class8 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class133.field2225, class629.field8918, arg2 && arg0.field106, arg1 * arg1 * 6);
        this.field9196 = arg1;
        if (this.field253) {
            this.field9197 = this.field252.field100.method4184(this.field9196, 0, 1024, 21, 1);
        } else {
            this.field9197 = this.field252.field100.method4184(this.field9196, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field252.field115;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field9197.LockRect(var6, 0, 0, 0, this.field9196, this.field9196, 0, var5);
            if (class757.method4191(-2005530600, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field9196 * 4) == var8) {
                    var5.method4163(arg3[var6], 0, 0, this.field9196 * this.field9196);
                } else {
                    for (int var9 = 0; var9 < this.field9196; var9++) {
                        var5.method4163(arg3[var6], this.field9196 * var9, var8 * var9, this.field9196);
                    }
                }
                this.field9197.UnlockRect(var6, 0);
            }
        }
    }
}
