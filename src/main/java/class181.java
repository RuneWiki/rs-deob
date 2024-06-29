import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class686;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class181 extends class221 implements class94 {

    @OriginalMember(owner = "client!laa", name = "h", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!laa", name = "i", descriptor = "I")
    private int field2252;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "I")
    private int field2249;

    @OriginalMember(owner = "client!laa", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2250;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V", line = 6)
    public final void method163(int arg0) {
        this.field2866.method780(-63, this);
        if (arg0 != 9901) {
            this.field2250 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 18)
    public final IDirect3DBaseTexture method165(int arg0) {
        return arg0 > -60 ? (IDirect3DBaseTexture) null : this.field2250;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ltd;B)V", line = 29)
    public final void method172(class691 arg0, byte arg1) {
        super.method172(arg0, (byte) 104);
        int var3 = 83 % ((2 - arg1) / 53);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lui;Lnl;III[B)V", line = 38)
    public class181(class130 arg0, class50 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class680.field9664, false, arg2 * arg3 * arg4);
        this.field2251 = arg4;
        this.field2252 = arg3;
        this.field2249 = arg2;
        this.field2250 = this.field2866.field1657.method3793(arg2, arg3, arg4, 1, 0, class130.method802(this.field2870, arg1, 16), 1);
        PixelBuffer var7 = this.field2866.field1649;
        int var8 = this.field2250.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class686.method3804(2005530599, var8)) {
            int var9 = this.field2868.field663 * this.field2249;
            int var10 = this.field2252 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method1517(arg5, 0, 0, this.field2251 * var9 * this.field2252);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field2251; var13++) {
                        var7.method1517(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field2251; var14++) {
                        for (int var15 = 0; var15 < this.field2252; var15++) {
                            var7.method1517(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field2250.UnlockBox(0);
        }
    }
}
