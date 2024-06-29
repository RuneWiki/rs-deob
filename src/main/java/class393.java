import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class399;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class393 extends class498 implements class37 {

    @OriginalMember(owner = "client!ip", name = "i", descriptor = "I")
    private int field5447;

    @OriginalMember(owner = "client!ip", name = "f", descriptor = "I")
    private int field5444;

    @OriginalMember(owner = "client!ip", name = "h", descriptor = "I")
    private int field5446;

    @OriginalMember(owner = "client!ip", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field5445;

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1127(int arg0) {
        int var2 = -100 % ((arg0 + 37) / 62);
        return this.field5445;
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 == -23983) {
            this.field6940.method1209(true, this);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lgu;I)V")
    public final void method49(class126 arg0, int arg1) {
        super.method49(arg0, arg1);
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lhv;Luda;III[B)V")
    public class393(class188 arg0, class509 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class280.field3663, false, arg2 * arg4 * arg3);
        this.field5447 = arg4;
        this.field5444 = arg3;
        this.field5446 = arg2;
        this.field5445 = this.field6940.field2418.method2402(arg2, arg3, arg4, 1, 0, class188.method1193(arg1, this.field6939, 51), 1);
        PixelBuffer var7 = this.field6940.field2434;
        int var8 = this.field5445.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class399.method2379(var8, 28658)) {
            int var9 = this.field6941.field7091 * this.field5446;
            int var10 = this.field5444 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2375(arg5, 0, 0, this.field5444 * var9 * this.field5447);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field5447; var13++) {
                        var7.method2375(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field5447; var14++) {
                        for (int var15 = 0; var15 < this.field5444; var15++) {
                            var7.method2375(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field5445.UnlockBox(0);
        }
    }
}
