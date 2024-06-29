import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class480;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class293 extends class596 implements class550 {

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    private int field4109;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    private int field4108;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    private int field4106;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field4107;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 6)
    public final IDirect3DBaseTexture method978(byte arg0) {
        return arg0 == -127 ? this.field4107 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 17)
    public final void method980(int arg0) {
        this.field8710.method3795(-116, this);
        int var2 = 82 % ((-arg0 - 29) / 46);
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Llt;Lkca;III[B)V", line = 25)
    public class293(class672 arg0, class82 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class438.field6117, false, arg2 * arg3 * arg4);
        this.field4109 = arg3;
        this.field4108 = arg4;
        this.field4106 = arg2;
        this.field4107 = this.field8710.field9423.method2887(arg2, arg3, arg4, 1, 0, class672.method3800((byte) -88, this.field8713, arg1), 1);
        PixelBuffer var7 = this.field8710.field9440;
        int var8 = this.field4107.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class480.method2879(var8, (byte) -104)) {
            int var9 = this.field8711.field1515 * this.field4106;
            int var10 = this.field4109 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2905(arg5, 0, 0, this.field4109 * var9 * this.field4108);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field4108; var13++) {
                        var7.method2905(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field4108; var14++) {
                        for (int var15 = 0; var15 < this.field4109; var15++) {
                            var7.method2905(arg5, var10 * var14 + (var9 * var15), var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field4107.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lqt;I)V", line = 99)
    public final void method979(class634 arg0, int arg1) {
        if (arg1 < -81) {
            super.method979(arg0, -121);
        }
    }
}
