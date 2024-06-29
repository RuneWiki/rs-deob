import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class87 extends class588 implements class36 {

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    private int field1294;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    private int field1293;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    private int field1292;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field1295;

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Loe;Ljb;III[B)V")
    public class87(class13 arg0, class666 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class689.field9771, false, arg2 * arg3 * arg4);
        this.field1294 = arg3;
        this.field1293 = arg4;
        this.field1292 = arg2;
        this.field1295 = this.field8582.field154.method3798(arg2, arg3, arg4, 1, 0, class13.method112(this.field8584, false, arg1), 1);
        PixelBuffer var7 = this.field8582.field157;
        int var8 = this.field1295.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class672.method3806(26, var8)) {
            int var9 = this.field8583.field9362 * this.field1292;
            int var10 = this.field1294 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method227(arg5, 0, 0, this.field1293 * var9 * this.field1294);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field1293; var13++) {
                        var7.method227(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field1293; var14++) {
                        for (int var15 = 0; var15 < this.field1294; var15++) {
                            var7.method227(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field1295.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLtn;)V")
    public final void method394(byte arg0, class166 arg1) {
        if (arg0 >= -92) {
            this.field1293 = 6;
        }
        super.method394((byte) -115, arg1);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method650(boolean arg0) {
        return arg0 ? (IDirect3DBaseTexture) null : this.field1295;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        this.field8582.method132(false, this);
        if (arg0 != -29399) {
            this.field1292 = 82;
        }
    }
}
