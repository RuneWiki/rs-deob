import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class547 extends class358 implements class149 {

    @OriginalMember(owner = "client!hha", name = "g", descriptor = "I")
    private int field7406;

    @OriginalMember(owner = "client!hha", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field7405;

    @OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lrja;IZ[[I)V")
    public class547(class115 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class305.field4404, class258.field3847, arg2 && arg0.field1562, arg1 * 6 * arg1);
        this.field7406 = arg1;
        if (this.field5239) {
            this.field7405 = this.field5242.field1565.method2965(this.field7406, 0, 1024, 21, 1);
        } else {
            this.field7405 = this.field5242.field1565.method2965(this.field7406, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field5242.field1564;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field7405.LockRect(var6, 0, 0, 0, this.field7406, this.field7406, 0, var5);
            if (class510.method2954(0, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field7406 * 4 == var8) {
                    var5.method2982(arg3[var6], 0, 0, this.field7406 * this.field7406);
                } else {
                    for (int var9 = 0; var9 < this.field7406; var9++) {
                        var5.method2982(arg3[var6], this.field7406 * var9, var8 * var9, this.field7406);
                    }
                }
                this.field7405.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2252(int arg0) {
        return arg0 == 15901 ? this.field7405 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILwga;)V")
    public final void method1003(int arg0, class779 arg1) {
        if (arg0 < -104) {
            super.method1003(-124, arg1);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
    public final void method1004(int arg0) {
        if (arg0 == 20464) {
            this.field5242.method877(this, arg0 ^ 0x4FF7);
        }
    }
}
