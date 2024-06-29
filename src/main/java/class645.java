import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class402;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class645 extends class439 implements class542 {

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    private int field9169;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    private int field9170;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    private int field9171;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field9168;

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Los;Lhh;III[B)V", line = 3)
    public class645(class253 arg0, class250 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class496.field7281, false, arg2 * arg3 * arg4);
        this.field9169 = arg3;
        this.field9170 = arg4;
        this.field9171 = arg2;
        this.field9168 = this.field6468.field3618.method3129(arg2, arg3, arg4, 1, 0, class253.method2099((byte) -110, this.field6471, arg1), 1);
        PixelBuffer var7 = this.field6468.field3611;
        int var8 = this.field9168.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class402.method3156(var8, -1)) {
            int var9 = this.field6467.field3568 * this.field9171;
            int var10 = this.field9169 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method3146(arg5, 0, 0, this.field9170 * var9 * this.field9169);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field9170; var13++) {
                        var7.method3146(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field9170; var14++) {
                        for (int var15 = 0; var15 < this.field9169; var15++) {
                            var7.method3146(arg5, var9 * var15 + var10 * var14, var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field9168.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 74)
    public final IDirect3DBaseTexture method2249(int arg0) {
        if (arg0 > -77) {
            this.field9169 = -55;
        }
        return this.field9168;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 86)
    public final void method2251(int arg0) {
        if (arg0 != 14436) {
            this.field9171 = 101;
        }
        this.field6468.method2077(true, this);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ltd;I)V", line = 96)
    public final void method2250(class457 arg0, int arg1) {
        super.method2250(arg0, arg1);
    }
}
