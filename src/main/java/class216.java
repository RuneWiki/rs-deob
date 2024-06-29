import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class481;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class216 extends class31 implements class349 {

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "I")
    private int field2512;

    @OriginalMember(owner = "client!sba", name = "i", descriptor = "I")
    private int field2514;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "I")
    private int field2513;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2511;

    @OriginalMember(owner = "client!sba", name = "<init>", descriptor = "(Lhl;Lwd;III[B)V")
    public class216(class527 arg0, class272 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class687.field9697, false, arg2 * arg3 * arg4);
        this.field2512 = arg3;
        this.field2514 = arg2;
        this.field2513 = arg4;
        this.field2511 = this.field355.field7501.method2905(arg2, arg3, arg4, 1, 0, class527.method3093(arg1, this.field356, -77), 1);
        PixelBuffer var7 = this.field355.field7514;
        int var8 = this.field2511.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class481.method2896(var8, 2005530520)) {
            int var9 = this.field357.field3357 * this.field2514;
            int var10 = this.field2512 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2917(arg5, 0, 0, this.field2513 * var9 * this.field2512);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field2513; var15++) {
                        var7.method2917(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field2513; var13++) {
                        for (int var14 = 0; var14 < this.field2512; var14++) {
                            var7.method2917(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field2511.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Lqo;I)V")
    public final void method155(class22 arg0, int arg1) {
        super.method155(arg0, arg1);
        if (arg1 != -25446) {
            this.method174((byte) 27);
        }
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 < 38) {
            this.field2512 = -110;
        }
        this.field355.method3088(5, this);
    }

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method154(boolean arg0) {
        if (arg0) {
            this.field2513 = 71;
        }
        return this.field2511;
    }
}
