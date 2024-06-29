import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class110 extends class10 implements class45 {

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "I")
    private int field1681;

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field1680;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 4)
    public final void method861(int arg0) {
        this.field99.method2215(50, this);
        if (arg0 >= -42) {
            this.method861(36);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lgaa;I)V", line = 14)
    public final void method54(class267 arg0, int arg1) {
        super.method54(arg0, arg1);
    }

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 21)
    public final IDirect3DBaseTexture method55(int arg0) {
        if (arg0 != 26691) {
            this.method55(108);
        }
        return this.field1680;
    }

    @OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Ltb;IZ[[I)V", line = 32)
    public class110(class364 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class75.field1306, class218.field3050, arg2 && arg0.field5196, arg1 * 6 * arg1);
        this.field1681 = arg1;
        if (this.field97) {
            this.field1680 = this.field99.field5204.method2647(this.field1681, 0, 1024, 21, 1);
        } else {
            this.field1680 = this.field99.field5204.method2647(this.field1681, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field99.field5202;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field1680.LockRect(var6, 0, 0, 0, this.field1681, this.field1681, 0, var5);
            if (class446.method2640(112, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field1681 * 4 == var8) {
                    var5.method2663(arg3[var6], 0, 0, this.field1681 * this.field1681);
                } else {
                    for (int var9 = 0; var9 < this.field1681; var9++) {
                        var5.method2663(arg3[var6], this.field1681 * var9, var8 * var9, this.field1681);
                    }
                }
                this.field1680.UnlockRect(var6, 0);
            }
        }
    }
}
