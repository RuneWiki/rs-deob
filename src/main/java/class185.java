import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class399;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class185 extends class498 implements class5 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    private int field2355;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field2356;

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lhv;IZ[[I)V")
    public class185(class188 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class532.field7430, class280.field3663, arg2 && arg0.field2439, arg1 * 6 * arg1);
        this.field2355 = arg1;
        if (this.field6938) {
            this.field2356 = this.field6940.field2418.method2401(this.field2355, 0, 1024, 21, 1);
        } else {
            this.field2356 = this.field6940.field2418.method2401(this.field2355, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6940.field2434;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field2356.LockRect(var6, 0, 0, 0, this.field2355, this.field2355, 0, var5);
            if (class399.method2379(var7, 28658)) {
                int var8 = var5.getRowPitch();
                if (this.field2355 * 4 == var8) {
                    var5.method2377(arg3[var6], 0, 0, this.field2355 * this.field2355);
                } else {
                    for (int var9 = 0; var9 < this.field2355; var9++) {
                        var5.method2377(arg3[var6], this.field2355 * var9, var8 * var9, this.field2355);
                    }
                }
                this.field2356.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Lgu;I)V")
    public final void method49(class126 arg0, int arg1) {
        super.method49(arg0, arg1);
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)V")
    public final void method50(int arg0) {
        this.field6940.method1173(0, this);
        if (arg0 != -23983) {
            this.method1127(-44);
        }
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1127(int arg0) {
        int var2 = -101 / ((arg0 + 37) / 62);
        return this.field2356;
    }
}
