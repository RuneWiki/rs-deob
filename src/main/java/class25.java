import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class416;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class25 extends class335 implements class627 {

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field268;

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lrca;IZ[[I)V")
    public class25(class391 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class538.field7742, class256.field3653, arg2 && arg0.field5996, arg1 * 6 * arg1);
        this.field269 = arg1;
        if (this.field4809) {
            this.field268 = this.field4806.field5990.method2627(this.field269, 0, 1024, 21, 1);
        } else {
            this.field268 = this.field4806.field5990.method2627(this.field269, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4806.field5987;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field268.LockRect(var6, 0, 0, 0, this.field269, this.field269, 0, var5);
            if (class416.method2641((byte) 48, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field269 * 4) == var8) {
                    var5.method2638(arg3[var6], 0, 0, this.field269 * this.field269);
                } else {
                    for (int var9 = 0; var9 < this.field269; var9++) {
                        var5.method2638(arg3[var6], this.field269 * var9, var8 * var9, this.field269);
                    }
                }
                this.field268.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V")
    public final void method152(int arg0) {
        this.field4806.method2518((byte) 119, this);
        if (arg0 != 24784) {
            this.method153(85);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method153(int arg0) {
        return arg0 == 12874 ? this.field268 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Llba;I)V")
    public final void method154(class477 arg0, int arg1) {
        super.method154(arg0, arg1);
    }
}
