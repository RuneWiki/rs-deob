import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class446;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class411 extends class461 implements class388 {

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    private int field5837;

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field5836;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2393(byte arg0) {
        if (arg0 < 48) {
            this.field5837 = 56;
        }
        return this.field5836;
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Ldca;B)V")
    public final void method1259(class160 arg0, byte arg1) {
        if (arg1 <= 66) {
            this.field5836 = null;
        }
        super.method1259(arg0, (byte) 100);
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lega;IZ[[I)V")
    public class411(class662 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class129.field1851, class309.field4271, arg2 && arg0.field9276, arg1 * 6 * arg1);
        this.field5837 = arg1;
        if (this.field6357) {
            this.field5836 = this.field6355.field9273.method2533(this.field5837, 0, 1024, 21, 1);
        } else {
            this.field5836 = this.field6355.field9273.method2533(this.field5837, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6355.field9290;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field5836.LockRect(var6, 0, 0, 0, this.field5837, this.field5837, 0, var5);
            if (class446.method2528((byte) -104, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field5837 * 4 == var8) {
                    var5.method2550(arg3[var6], 0, 0, this.field5837 * this.field5837);
                } else {
                    for (int var9 = 0; var9 < this.field5837; var9++) {
                        var5.method2550(arg3[var6], this.field5837 * var9, var8 * var9, this.field5837);
                    }
                }
                this.field5836.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)V")
    public final void method1271(boolean arg0) {
        this.field6355.method3732(this, 6);
        if (arg0) {
            this.method1259(null, (byte) 21);
        }
    }
}
