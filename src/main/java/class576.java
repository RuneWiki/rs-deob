import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class510;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class576 extends class358 implements class654 {

    @OriginalMember(owner = "client!lba", name = "h", descriptor = "I")
    private int field7727;

    @OriginalMember(owner = "client!lba", name = "f", descriptor = "I")
    private int field7725;

    @OriginalMember(owner = "client!lba", name = "i", descriptor = "I")
    private int field7728;

    @OriginalMember(owner = "client!lba", name = "g", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field7726;

    @OriginalMember(owner = "client!lba", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 5)
    public final IDirect3DBaseTexture method2252(int arg0) {
        if (arg0 != 15901) {
            this.method2252(102);
        }
        return this.field7726;
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(Lrja;Lsw;III[B)V", line = 14)
    public class576(class115 arg0, class787 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class258.field3847, false, arg2 * arg3 * arg4);
        this.field7727 = arg3;
        this.field7725 = arg2;
        this.field7728 = arg4;
        this.field7726 = this.field5242.field1565.method2963(arg2, arg3, arg4, 1, 0, class115.method884(arg1, this.field5238, (byte) 19), 1);
        PixelBuffer var7 = this.field5242.field1564;
        int var8 = this.field7726.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class510.method2954(0, var8)) {
            int var9 = this.field5241.field10833 * this.field7725;
            int var10 = this.field7727 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2980(arg5, 0, 0, this.field7728 * this.field7727 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field7728; var13++) {
                        var7.method2980(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field7728; var14++) {
                        for (int var15 = 0; var15 < this.field7727; var15++) {
                            var7.method2980(arg5, var10 * var14 + (var9 * var15), var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field7726.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILwga;)V", line = 89)
    public final void method1003(int arg0, class779 arg1) {
        super.method1003(-119, arg1);
        if (arg0 > -104) {
            this.method1004(-9);
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V", line = 101)
    public final void method1004(int arg0) {
        this.field5242.method901(this, -110);
        if (arg0 != 20464) {
            this.method2252(-43);
        }
    }
}
