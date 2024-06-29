import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aw")
public class class68 extends class298 implements class73 {

    @OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
    private int field1457;

    @OriginalMember(owner = "client!aw", name = "h", descriptor = "I")
    private int field1459;

    @OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
    private int field1460;

    @OriginalMember(owner = "client!aw", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field1458;

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method772(byte arg0) {
        if (arg0 < 118) {
            this.field1460 = -57;
        }
        return this.field1458;
    }

    @OriginalMember(owner = "client!aw", name = "d", descriptor = "(I)V")
    public final void method773(int arg0) {
        if (arg0 != -23993) {
            this.field1459 = 107;
        }
        this.field4455.method3671(-38, this);
    }

    @OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(Lhg;Lfda;III[B)V")
    public class68(class644 arg0, class294 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class2.field372, false, arg2 * arg4 * arg3);
        this.field1457 = arg4;
        this.field1459 = arg2;
        this.field1460 = arg3;
        this.field1458 = this.field4455.field9267.method2712(arg2, arg3, arg4, 1, 0, class644.method3668(0, arg1, this.field4457), 1);
        PixelBuffer var7 = this.field4455.field9272;
        int var8 = this.field1458.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class451.method2727(var8, 3102)) {
            int var9 = this.field4454.field4407 * this.field1459;
            int var10 = this.field1460 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2721(arg5, 0, 0, this.field1460 * var9 * this.field1457);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field1457; var13++) {
                        var7.method2721(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field1457; var14++) {
                        for (int var15 = 0; var15 < this.field1460; var15++) {
                            var7.method2721(arg5, var10 * var14 + (var9 * var15), var11 * var14 - -(var12 * var15), var9);
                        }
                    }
                }
            }
            this.field1458.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!aw", name = "a", descriptor = "(ZLgw;)V")
    public final void method774(boolean arg0, class155 arg1) {
        super.method774(arg0, arg1);
        if (!arg0) {
            this.method774(false, null);
        }
    }
}
