import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class407;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class452 extends class324 implements class65 {

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    private int field6258;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    private int field6259;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    private int field6256;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field6257;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILie;)V", line = 7)
    public final void method1272(int arg0, class6 arg1) {
        super.method1272(arg0, arg1);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 14)
    public final IDirect3DBaseTexture method1273(int arg0) {
        if (arg0 != -26670) {
            this.field6257 = null;
        }
        return this.field6257;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 24)
    public final void method1274(byte arg0) {
        if (arg0 != 57) {
            this.method1274((byte) 86);
        }
        this.field4107.method3425(arg0 - 58, this);
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lhg;Lg;III[B)V", line = 35)
    public class452(class591 arg0, class135 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class160.field1932, false, arg2 * arg3 * arg4);
        this.field6258 = arg3;
        this.field6259 = arg4;
        this.field6256 = arg2;
        this.field6257 = this.field4107.field8586.method2322(arg2, arg3, arg4, 1, 0, class591.method3435(arg1, -127, this.field4110), 1);
        PixelBuffer var7 = this.field4107.field8569;
        int var8 = this.field6257.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class407.method2320(var8, -2005530590)) {
            int var9 = this.field4109.field1649 * this.field6256;
            int var10 = this.field6258 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2339(arg5, 0, 0, this.field6259 * var9 * this.field6258);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field6259; var13++) {
                        var7.method2339(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field6259; var14++) {
                        for (int var15 = 0; var15 < this.field6258; var15++) {
                            var7.method2339(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field6257.UnlockBox(0);
        }
    }
}
