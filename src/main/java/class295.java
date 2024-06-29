import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class480;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class295 extends class596 implements class326 {

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    private int field4126;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field4125;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lqt;I)V")
    public final void method979(class634 arg0, int arg1) {
        if (arg1 <= -81) {
            super.method979(arg0, -96);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method978(byte arg0) {
        return arg0 == -127 ? this.field4125 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Llt;IZ[[I)V")
    public class295(class672 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class282.field4019, class438.field6117, arg2 && arg0.field9431, arg1 * arg1 * 6);
        this.field4126 = arg1;
        if (this.field8709) {
            this.field4125 = this.field8710.field9423.method2893(this.field4126, 0, 1024, 21, 1);
        } else {
            this.field4125 = this.field8710.field9423.method2893(this.field4126, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field8710.field9440;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field4125.LockRect(var6, 0, 0, 0, this.field4126, this.field4126, 0, var5);
            if (class480.method2879(var7, (byte) -113)) {
                int var8 = var5.getRowPitch();
                if ((this.field4126 * 4) == var8) {
                    var5.method2907(arg3[var6], 0, 0, this.field4126 * this.field4126);
                } else {
                    for (int var9 = 0; var9 < this.field4126; var9++) {
                        var5.method2907(arg3[var6], this.field4126 * var9, var8 * var9, this.field4126);
                    }
                }
                this.field4125.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public final void method980(int arg0) {
        this.field8710.method3804(this, 100);
        int var2 = 7 % ((-arg0 - 29) / 46);
    }
}
