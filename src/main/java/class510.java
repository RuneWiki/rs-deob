import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class441;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class510 extends class346 implements class614 {

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    private int field7321;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field7320;

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lgb;IZ[[I)V", line = 3)
    public class510(class197 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class581.field8260, class271.field3429, arg2 && arg0.field2385, arg1 * 6 * arg1);
        this.field7321 = arg1;
        if (this.field4513) {
            this.field7320 = this.field4512.field2376.method2433(this.field7321, 0, 1024, 21, 1);
        } else {
            this.field7320 = this.field4512.field2376.method2433(this.field7321, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4512.field2377;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field7320.LockRect(var6, 0, 0, 0, this.field7321, this.field7321, 0, var5);
            if (class441.method2451(var7, (byte) -88)) {
                int var8 = var5.getRowPitch();
                if ((this.field7321 * 4) == var8) {
                    var5.method2449(arg3[var6], 0, 0, this.field7321 * this.field7321);
                } else {
                    for (int var9 = 0; var9 < this.field7321; var9++) {
                        var5.method2449(arg3[var6], this.field7321 * var9, var8 * var9, this.field7321);
                    }
                }
                this.field7320.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(ILup;)V", line = 55)
    public final void method842(int arg0, class249 arg1) {
        super.method842(arg0, arg1);
    }

    @OriginalMember(owner = "client!po", name = "d", descriptor = "(I)V", line = 65)
    public final void method841(int arg0) {
        this.field4512.method1202(this, 16);
        if (arg0 >= -124) {
            this.method1900((byte) 78);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 76)
    public final IDirect3DBaseTexture method1900(byte arg0) {
        return arg0 < 54 ? (IDirect3DBaseTexture) null : this.field7320;
    }
}
