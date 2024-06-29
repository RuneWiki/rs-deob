import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class467 extends class330 implements class165 {

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "I")
    private int field6606;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field6605;

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Luda;IZ[[I)V")
    public class467(class475 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class109.field1521, class415.field5986, arg2 && arg0.field6664, arg1 * 6 * arg1);
        this.field6606 = arg1;
        if (this.field4684) {
            this.field6605 = this.field4686.field6676.method2962(this.field6606, 0, 1024, 21, 1);
        } else {
            this.field6605 = this.field4686.field6676.method2962(this.field6606, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field4686.field6686;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field6605.LockRect(var6, 0, 0, 0, this.field6606, this.field6606, 0, var5);
            if (class509.method2977(var7, 17527)) {
                int var8 = var5.getRowPitch();
                if ((this.field6606 * 4) == var8) {
                    var5.method2980(arg3[var6], 0, 0, this.field6606 * this.field6606);
                } else {
                    for (int var9 = 0; var9 < this.field6606; var9++) {
                        var5.method2980(arg3[var6], this.field6606 * var9, var8 * var9, this.field6606);
                    }
                }
                this.field6605.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        this.field4686.method2757(this, (byte) -97);
        int var2 = 83 % ((-arg0 - 69) / 43);
    }

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2137(boolean arg0) {
        if (arg0) {
            this.method706((byte) -114, null);
        }
        return this.field6605;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(BLag;)V")
    public final void method706(byte arg0, class710 arg1) {
        super.method706((byte) -84, arg1);
        if (arg0 >= -74) {
            this.field6606 = 99;
        }
    }
}
