import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class793 extends class363 implements class94 {

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    private int field10856;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    private int field10858;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    private int field10857;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field10859;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2032(byte arg0) {
        return arg0 > -65 ? (IDirect3DBaseTexture) null : this.field10859;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        if (arg0 != -40) {
            this.field10857 = -51;
        }
        this.field4942.method1610(6097, this);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lws;B)V")
    public final void method2034(class379 arg0, byte arg1) {
        super.method2034(arg0, (byte) 80);
        if (arg1 <= 27) {
            this.field10857 = -128;
        }
    }

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Laia;Lul;III[B)V")
    public class793(class242 arg0, class599 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class497.field6799, false, arg2 * arg4 * arg3);
        this.field10856 = arg2;
        this.field10858 = arg4;
        this.field10857 = arg3;
        this.field10859 = this.field4942.field3462.method2920(arg2, arg3, arg4, 1, 0, class242.method1616(arg1, this.field4944, 109), 1);
        PixelBuffer var7 = this.field4942.field3463;
        int var8 = this.field10859.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class510.method2912(var8, -106)) {
            int var9 = this.field4945.field8381 * this.field10856;
            int var10 = this.field10857 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2933(arg5, 0, 0, this.field10858 * this.field10857 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field10858; var15++) {
                        var7.method2933(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field10858; var13++) {
                        for (int var14 = 0; var14 < this.field10857; var14++) {
                            var7.method2933(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field10859.UnlockBox(0);
        }
    }
}
