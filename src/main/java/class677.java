import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class511;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class677 extends class491 implements class125 {

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    private int field9608;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field9609;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1169(int arg0) {
        return arg0 == -15770 ? this.field9609 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public final void method1168(int arg0) {
        if (arg0 != 16541) {
            this.field9608 = 91;
        }
        this.field7398.method1061(this, (byte) -122);
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Ler;IZ[[I)V")
    public class677(class113 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class313.field5120, class544.field8004, arg2 && arg0.field1594, arg1 * 6 * arg1);
        this.field9608 = arg1;
        if (this.field7399) {
            this.field9609 = this.field7398.field1575.method3828(this.field9608, 0, 1024, 21, 1);
        } else {
            this.field9609 = this.field7398.field1575.method3828(this.field9608, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field7398.field1590;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field9609.LockRect(var6, 0, 0, 0, this.field9608, this.field9608, 0, var5);
            if (class511.method3844(-2005530585, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field9608 * 4) == var8) {
                    var5.method3850(arg3[var6], 0, 0, this.field9608 * this.field9608);
                } else {
                    for (int var9 = 0; var9 < this.field9608; var9++) {
                        var5.method3850(arg3[var6], this.field9608 * var9, var8 * var9, this.field9608);
                    }
                }
                this.field9609.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILse;)V")
    public final void method1170(int arg0, class267 arg1) {
        super.method1170(arg0, arg1);
    }
}
