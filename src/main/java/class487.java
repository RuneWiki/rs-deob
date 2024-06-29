import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class771;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class487 extends class371 implements class445 {

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field6274;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2125(byte arg0) {
        if (arg0 >= -103) {
            this.field6274 = null;
        }
        return this.field6274;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public final void method773(byte arg0) {
        this.field4541.method1614((byte) -107, this);
        if (arg0 >= -12) {
            this.field6273 = 111;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(BLqt;)V")
    public final void method774(byte arg0, class525 arg1) {
        int var3 = -85 % ((-arg0 - 66) / 35);
        super.method774((byte) -110, arg1);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lcka;IZ[[I)V")
    public class487(class248 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class417.field5505, class73.field990, arg2 && arg0.field3386, arg1 * arg1 * 6);
        this.field6273 = arg1;
        if (this.field4542) {
            this.field6274 = this.field4541.field3402.method4172(this.field6273, 0, 1024, 21, 1);
        } else {
            this.field6274 = this.field4541.field3402.method4172(this.field6273, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4541.field3387;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field6274.LockRect(var6, 0, 0, 0, this.field6273, this.field6273, 0, var5);
            if (class771.method4195(false, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field6273 * 4) == var8) {
                    var5.method4169(arg3[var6], 0, 0, this.field6273 * this.field6273);
                } else {
                    for (int var9 = 0; var9 < this.field6273; var9++) {
                        var5.method4169(arg3[var6], this.field6273 * var9, var8 * var9, this.field6273);
                    }
                }
                this.field6274.UnlockRect(var6, 0);
            }
        }
    }
}
