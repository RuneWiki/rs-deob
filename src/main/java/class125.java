import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class125 extends class139 implements class247 {

    @OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!gm", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field2132;

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(B)V")
    public final void method374(byte arg0) {
        this.field2309.method2351((byte) -128, this);
        if (arg0 > -21) {
            this.method375(88);
        }
    }

    @OriginalMember(owner = "client!gm", name = "<init>", descriptor = "(Lbfa;IZ[[I)V")
    public class125(class370 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class746.field10332, class523.field7249, arg2 && arg0.field5274, arg1 * 6 * arg1);
        this.field2131 = arg1;
        if (this.field2308) {
            this.field2132 = this.field2309.field5282.method2844(this.field2131, 0, 1024, 21, 1);
        } else {
            this.field2132 = this.field2309.field5282.method2844(this.field2131, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field2309.field5275;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field2132.LockRect(var6, 0, 0, 0, this.field2131, this.field2131, 0, var5);
            if (class483.method2836(var7, false)) {
                int var8 = var5.getRowPitch();
                if (this.field2131 * 4 == var8) {
                    var5.method2858(arg3[var6], 0, 0, this.field2131 * this.field2131);
                } else {
                    for (int var9 = 0; var9 < this.field2131; var9++) {
                        var5.method2858(arg3[var6], this.field2131 * var9, var8 * var9, this.field2131);
                    }
                }
                this.field2132.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!gm", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method375(int arg0) {
        if (arg0 != 17723) {
            this.method375(-17);
        }
        return this.field2132;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lria;I)V")
    public final void method376(class287 arg0, int arg1) {
        super.method376(arg0, arg1);
    }
}
