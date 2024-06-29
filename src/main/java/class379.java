import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class448;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class379 extends class111 implements class593 {

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    private int field5081;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    private int field5083;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    private int field5082;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field5084;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method799(int arg0) {
        if (arg0 != -25567) {
            this.field5084 = null;
        }
        return this.field5084;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ILfw;)V")
    public final void method798(int arg0, class52 arg1) {
        super.method798(arg0, arg1);
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lkaa;Lfca;III[B)V")
    public class379(class44 arg0, class75 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class279.field3793, false, arg2 * arg3 * arg4);
        this.field5081 = arg4;
        this.field5083 = arg2;
        this.field5082 = arg3;
        this.field5084 = this.field1425.field797.method2659(arg2, arg3, arg4, 1, 0, class44.method529(true, arg1, this.field1428), 1);
        PixelBuffer var7 = this.field1425.field774;
        int var8 = this.field5084.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class448.method2666((byte) -46, var8)) {
            int var9 = this.field1429.field1114 * this.field5083;
            int var10 = this.field5082 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2668(arg5, 0, 0, this.field5082 * this.field5081 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field5081; var15++) {
                        var7.method2668(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field5081; var13++) {
                        for (int var14 = 0; var14 < this.field5082; var14++) {
                            var7.method2668(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field5084.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method1701(int arg0) {
        if (arg0 == 2669) {
            this.field1425.method488(-95, this);
        }
    }
}
