import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class509;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class499 extends class330 implements class665 {

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    private int field6998;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    private int field6996;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    private int field6997;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field6999;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public final void method702(byte arg0) {
        this.field4686.method2815(25, this);
        int var2 = -66 / ((arg0 + 69) / 43);
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "(Luda;Lg;III[B)V")
    public class499(class475 arg0, class166 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class415.field5986, false, arg2 * arg3 * arg4);
        this.field6998 = arg2;
        this.field6996 = arg3;
        this.field6997 = arg4;
        this.field6999 = this.field4686.field6676.method2968(arg2, arg3, arg4, 1, 0, class475.method2776(this.field4685, (byte) -59, arg1), 1);
        PixelBuffer var7 = this.field4686.field6686;
        int var8 = this.field6999.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class509.method2977(var8, 17527)) {
            int var9 = this.field4683.field2201 * this.field6998;
            int var10 = this.field6996 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2976(arg5, 0, 0, this.field6996 * var9 * this.field6997);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field6997; var15++) {
                        var7.method2976(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field6997; var13++) {
                        for (int var14 = 0; var14 < this.field6996; var14++) {
                            var7.method2976(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field6999.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BLag;)V")
    public final void method706(byte arg0, class710 arg1) {
        super.method706((byte) -86, arg1);
        if (arg0 >= -74) {
            this.field6996 = -98;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2137(boolean arg0) {
        if (arg0) {
            this.method702((byte) 66);
        }
        return this.field6999;
    }
}
