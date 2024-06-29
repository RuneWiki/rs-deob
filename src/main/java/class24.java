import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 extends class139 implements class26 {

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    private int field729;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field726;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 8)
    public final void method374(byte arg0) {
        this.field2309.method2354(-101, this);
        if (arg0 >= -21) {
            this.method375(78);
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 20)
    public final IDirect3DBaseTexture method375(int arg0) {
        if (arg0 != 17723) {
            this.field728 = -39;
        }
        return this.field726;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lria;I)V", line = 30)
    public final void method376(class287 arg0, int arg1) {
        super.method376(arg0, arg1);
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lbfa;Lwq;III[B)V", line = 37)
    public class24(class370 arg0, class169 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class523.field7249, false, arg3 * arg4 * arg2);
        this.field728 = arg2;
        this.field727 = arg4;
        this.field729 = arg3;
        this.field726 = this.field2309.field5282.method2852(arg2, arg3, arg4, 1, 0, class370.method2353(22, this.field2311, arg1), 1);
        PixelBuffer var7 = this.field2309.field5275;
        int var8 = this.field726.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class483.method2836(var8, false)) {
            int var9 = this.field2312.field2654 * this.field728;
            int var10 = this.field729 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2856(arg5, 0, 0, this.field729 * var9 * this.field727);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field727; var15++) {
                        var7.method2856(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field727; var13++) {
                        for (int var14 = 0; var14 < this.field729; var14++) {
                            var7.method2856(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field726.UnlockBox(0);
        }
    }
}
