import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class503 extends class366 implements class596 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    private int field6865;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field6866;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V")
    public final void method279(int arg0) {
        this.field5266.method3524(this, false);
        if (arg0 != 15320) {
            this.field6866 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lsga;IZ[[I)V")
    public class503(class608 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class75.field837, class612.field8616, arg2 && arg0.field8569, arg1 * arg1 * 6);
        this.field6865 = arg1;
        if (this.field5268) {
            this.field6866 = this.field5266.field8555.method4181(this.field6865, 0, 1024, 21, 1);
        } else {
            this.field6866 = this.field5266.field8555.method4181(this.field6865, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field5266.field8579;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field6866.LockRect(var6, 0, 0, 0, this.field6865, this.field6865, 0, var5);
            if (class757.method4192(var7, (byte) 92)) {
                int var8 = var5.getRowPitch();
                if (this.field6865 * 4 == var8) {
                    var5.method4164(arg3[var6], 0, 0, this.field6865 * this.field6865);
                } else {
                    for (int var9 = 0; var9 < this.field6865; var9++) {
                        var5.method4164(arg3[var6], this.field6865 * var9, var8 * var9, this.field6865);
                    }
                }
                this.field6866.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method334(int arg0) {
        if (arg0 >= -10) {
            this.method334(63);
        }
        return this.field6866;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLcw;)V")
    public final void method280(byte arg0, class144 arg1) {
        int var3 = -82 % ((18 - arg0) / 60);
        super.method280((byte) 97, arg1);
    }
}
