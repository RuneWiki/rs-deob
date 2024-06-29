import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class686;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class416 extends class221 implements class64 {

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    private int field5811;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field5810;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method165(int arg0) {
        if (arg0 > -60) {
            this.field5810 = null;
        }
        return this.field5810;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ltd;B)V")
    public final void method172(class691 arg0, byte arg1) {
        super.method172(arg0, (byte) -105);
        int var3 = 23 % ((2 - arg1) / 53);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public final void method163(int arg0) {
        if (arg0 == 9901) {
            this.field2866.method836(this, 7);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Lui;IZ[[I)V")
    public class416(class130 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class420.field5862, class680.field9664, arg2 && arg0.field1670, arg1 * 6 * arg1);
        this.field5811 = arg1;
        if (this.field2869) {
            this.field5810 = this.field2866.field1657.method3790(this.field5811, 0, 1024, 21, 1);
        } else {
            this.field5810 = this.field2866.field1657.method3790(this.field5811, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field2866.field1649;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field5810.LockRect(var6, 0, 0, 0, this.field5811, this.field5811, 0, var5);
            if (class686.method3804(2005530599, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field5811 * 4 == var8) {
                    var5.method3806(arg3[var6], 0, 0, this.field5811 * this.field5811);
                } else {
                    for (int var9 = 0; var9 < this.field5811; var9++) {
                        var5.method3806(arg3[var6], this.field5811 * var9, var8 * var9, this.field5811);
                    }
                }
                this.field5810.UnlockRect(var6, 0);
            }
        }
    }
}
