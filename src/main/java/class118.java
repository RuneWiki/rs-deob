import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class511;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class118 extends class491 implements class555 {

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    private int field1718;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "I")
    private int field1720;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field1719;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V")
    public final void method1168(int arg0) {
        this.field7398.method1076(arg0 - 16469, this);
        if (arg0 != 16541) {
            this.method1170(79, null);
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Ler;Lua;III[B)V")
    public class118(class113 arg0, class696 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class544.field8004, false, arg2 * arg3 * arg4);
        this.field1718 = arg4;
        this.field1720 = arg2;
        this.field1717 = arg3;
        this.field1719 = this.field7398.field1575.method3831(arg2, arg3, arg4, 1, 0, class113.method1078(-17331, this.field7401, arg1), 1);
        PixelBuffer var7 = this.field7398.field1590;
        int var8 = this.field1719.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class511.method3844(-2005530585, var8)) {
            int var9 = this.field7402.field10033 * this.field1720;
            int var10 = this.field1717 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method3847(arg5, 0, 0, this.field1718 * this.field1717 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field1718; var13++) {
                        var7.method3847(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field1718; var14++) {
                        for (int var15 = 0; var15 < this.field1717; var15++) {
                            var7.method3847(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field1719.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1169(int arg0) {
        if (arg0 != -15770) {
            this.field1719 = null;
        }
        return this.field1719;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILse;)V")
    public final void method1170(int arg0, class267 arg1) {
        super.method1170(arg0, arg1);
    }
}
