import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class741 extends class44 implements class9 {

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "I")
    private int field10324;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "I")
    private int field10325;

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "I")
    private int field10323;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field10322;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(BLnd;)V", line = 7)
    public final void method272(byte arg0, class545 arg1) {
        super.method272(arg0, arg1);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 15)
    public final IDirect3DBaseTexture method271(byte arg0) {
        if (arg0 != 18) {
            this.field10324 = 43;
        }
        return this.field10322;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 27)
    public final void method1468(int arg0) {
        this.field476.method1309(false, this);
        if (arg0 <= 14) {
            this.field10322 = null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(Lbea;Lkt;III[B)V", line = 37)
    public class741(class225 arg0, class159 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class594.field8277, false, arg2 * arg3 * arg4);
        this.field10324 = arg3;
        this.field10325 = arg4;
        this.field10323 = arg2;
        this.field10322 = this.field476.field2918.method2731(arg2, arg3, arg4, 1, 0, class225.method1302(-1935, arg1, this.field477), 1);
        PixelBuffer var7 = this.field476.field2915;
        int var8 = this.field10322.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class483.method2718(-21593, var8)) {
            int var9 = this.field479.field2006 * this.field10323;
            int var10 = this.field10324 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2739(arg5, 0, 0, this.field10325 * var9 * this.field10324);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field10325; var13++) {
                        var7.method2739(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field10325; var14++) {
                        for (int var15 = 0; var15 < this.field10324; var15++) {
                            var7.method2739(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field10322.UnlockBox(0);
        }
    }
}
