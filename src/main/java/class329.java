import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class443;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class329 extends class481 implements class519 {

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    private int field4861;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
    private int field4862;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    private int field4864;

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4863;

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lvg;Lkf;III[B)V", line = 4)
    public class329(class49 arg0, class229 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class82.field1147, false, arg2 * arg3 * arg4);
        this.field4861 = arg3;
        this.field4862 = arg2;
        this.field4864 = arg4;
        this.field4863 = this.field6698.field720.method2557(arg2, arg3, arg4, 1, 0, class49.method359(this.field6701, false, arg1), 1);
        PixelBuffer var7 = this.field6698.field715;
        int var8 = this.field4863.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class443.method2538(-1, var8)) {
            int var9 = this.field6702.field3277 * this.field4862;
            int var10 = this.field4861 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2562(arg5, 0, 0, this.field4864 * var9 * this.field4861);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field4864; var15++) {
                        var7.method2562(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field4864; var13++) {
                        for (int var14 = 0; var14 < this.field4861; var14++) {
                            var7.method2562(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field4863.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)V", line = 76)
    public final void method129(byte arg0) {
        if (arg0 == -33) {
            this.field6698.method362(27, this);
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 86)
    public final IDirect3DBaseTexture method130(int arg0) {
        return arg0 < 9 ? (IDirect3DBaseTexture) null : this.field4863;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BLqaa;)V", line = 98)
    public final void method131(byte arg0, class26 arg1) {
        super.method131((byte) 98, arg1);
        if (arg0 < 24) {
            this.method131((byte) -7, null);
        }
    }
}
