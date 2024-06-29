import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class439;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class350 extends class582 implements class514 {

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    private int field4733;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    private int field4731;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    private int field4734;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4732;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 9)
    public final IDirect3DBaseTexture method2075(int arg0) {
        return arg0 == -8780 ? this.field4732 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V", line = 20)
    public final void method2076(boolean arg0) {
        this.field8274.method3183(this, (byte) 126);
        if (!arg0) {
            this.method2076(false);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Leda;Lsq;III[B)V", line = 29)
    public class350(class561 arg0, class485 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class179.field2008, false, arg2 * arg3 * arg4);
        this.field4733 = arg4;
        this.field4731 = arg2;
        this.field4734 = arg3;
        this.field4732 = this.field8274.field8021.method2531(arg2, arg3, arg4, 1, 0, class561.method3188(arg1, false, this.field8275), 1);
        PixelBuffer var7 = this.field8274.field8010;
        int var8 = this.field4732.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class439.method2511((byte) 35, var8)) {
            int var9 = this.field8273.field6991 * this.field4731;
            int var10 = this.field4734 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2506(arg5, 0, 0, this.field4733 * var9 * this.field4734);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4733; var13++) {
                        var7.method2506(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4733; var14++) {
                        for (int var15 = 0; var15 < this.field4734; var15++) {
                            var7.method2506(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field4732.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldj;B)V", line = 100)
    public final void method2077(class197 arg0, byte arg1) {
        super.method2077(arg0, arg1);
    }
}
