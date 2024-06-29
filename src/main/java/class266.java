import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uga")
public class class266 extends class85 implements class273 {

    @OriginalMember(owner = "client!uga", name = "f", descriptor = "I")
    private int field3620;

    @OriginalMember(owner = "client!uga", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field3621;

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(BLtb;)V", line = 5)
    public final void method521(byte arg0, class657 arg1) {
        super.method521((byte) -67, arg1);
        if (arg0 >= -65) {
            this.method521((byte) 31, null);
        }
    }

    @OriginalMember(owner = "client!uga", name = "a", descriptor = "(I)V", line = 17)
    public final void method770(int arg0) {
        if (arg0 != -27531) {
            this.method521((byte) -13, null);
        }
        this.field1185.method3280(this, arg0 + 57946);
    }

    @OriginalMember(owner = "client!uga", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;", line = 28)
    public final IDirect3DBaseTexture method522(boolean arg0) {
        return arg0 ? (IDirect3DBaseTexture) null : this.field3621;
    }

    @OriginalMember(owner = "client!uga", name = "<init>", descriptor = "(Lrd;IZ[[I)V", line = 37)
    public class266(class549 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class4.field10, class720.field10164, arg2 && arg0.field7760, arg1 * arg1 * 6);
        this.field3620 = arg1;
        if (this.field1183) {
            this.field3621 = this.field1185.field7746.method4113(this.field3620, 0, 1024, 21, 1);
        } else {
            this.field3621 = this.field1185.field7746.method4113(this.field3620, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field1185.field7738;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field3621.LockRect(var6, 0, 0, 0, this.field3620, this.field3620, 0, var5);
            if (class737.method4096(86, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field3620 * 4) == var8) {
                    var5.method4097(arg3[var6], 0, 0, this.field3620 * this.field3620);
                } else {
                    for (int var9 = 0; var9 < this.field3620; var9++) {
                        var5.method4097(arg3[var6], this.field3620 * var9, var8 * var9, this.field3620);
                    }
                }
                this.field3621.UnlockRect(var6, 0);
            }
        }
    }
}
