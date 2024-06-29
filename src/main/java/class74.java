import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class411;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class74 extends class75 implements class31 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    private int field1000;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field1001;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lpw;I)V", line = 4)
    public final void method31(class606 arg0, int arg1) {
        if (arg1 == 29557) {
            super.method31(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lwda;IZ[[I)V", line = 15)
    public class74(class547 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class488.field6956, class194.field2874, arg2 && arg0.field8182, arg1 * arg1 * 6);
        this.field1000 = arg1;
        if (this.field1003) {
            this.field1001 = this.field1005.field8175.method2434(this.field1000, 0, 1024, 21, 1);
        } else {
            this.field1001 = this.field1005.field8175.method2434(this.field1000, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field1005.field8176;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field1001.LockRect(var6, 0, 0, 0, this.field1000, this.field1000, 0, var5);
            if (class411.method2436(var7, (byte) 78)) {
                int var8 = var5.getRowPitch();
                if (this.field1000 * 4 == var8) {
                    var5.method2440(arg3[var6], 0, 0, this.field1000 * this.field1000);
                } else {
                    for (int var9 = 0; var9 < this.field1000; var9++) {
                        var5.method2440(arg3[var6], this.field1000 * var9, var8 * var9, this.field1000);
                    }
                }
                this.field1001.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 67)
    public final IDirect3DBaseTexture method588(int arg0) {
        if (arg0 != 281) {
            this.method588(-85);
        }
        return this.field1001;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V", line = 78)
    public final void method22(byte arg0) {
        int var2 = -18 / ((arg0 + 72) / 49);
        this.field1005.method3324(this, -92);
    }
}
