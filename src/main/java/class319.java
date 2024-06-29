import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class319 extends class363 implements class158 {

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    private int field4366;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field4365;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2032(byte arg0) {
        if (arg0 > -65) {
            this.method2032((byte) -107);
        }
        return this.field4365;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        if (arg0 != -40) {
            this.method2034(null, (byte) 20);
        }
        this.field4942.method1621((byte) 91, this);
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Laia;IZ[[I)V")
    public class319(class242 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class530.field7176, class497.field6799, arg2 && arg0.field3444, arg1 * 6 * arg1);
        this.field4366 = arg1;
        if (this.field4943) {
            this.field4365 = this.field4942.field3462.method2919(this.field4366, 0, 1024, 21, 1);
        } else {
            this.field4365 = this.field4942.field3462.method2919(this.field4366, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4942.field3463;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field4365.LockRect(var6, 0, 0, 0, this.field4366, this.field4366, 0, var5);
            if (class510.method2912(var7, -105)) {
                int var8 = var5.getRowPitch();
                if ((this.field4366 * 4) == var8) {
                    var5.method2935(arg3[var6], 0, 0, this.field4366 * this.field4366);
                } else {
                    for (int var9 = 0; var9 < this.field4366; var9++) {
                        var5.method2935(arg3[var6], this.field4366 * var9, var8 * var9, this.field4366);
                    }
                }
                this.field4365.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lws;B)V")
    public final void method2034(class379 arg0, byte arg1) {
        if (arg1 < 27) {
            this.method2033((byte) 48);
        }
        super.method2034(arg0, (byte) 104);
    }
}
