import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public class class592 extends class588 implements class639 {

    @OriginalMember(owner = "client!ow", name = "g", descriptor = "I")
    private int field8604;

    @OriginalMember(owner = "client!ow", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8603;

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        if (arg0 != -29399) {
            this.method650(false);
        }
        this.field8582.method142(this, arg0 + 29522);
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(Loe;IZ[[I)V")
    public class592(class13 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class297.field4191, class689.field9771, arg2 && arg0.field178, arg1 * 6 * arg1);
        this.field8604 = arg1;
        if (this.field8585) {
            this.field8603 = this.field8582.field154.method3804(this.field8604, 0, 1024, 21, 1);
        } else {
            this.field8603 = this.field8582.field154.method3804(this.field8604, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field8582.field157;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8603.LockRect(var6, 0, 0, 0, this.field8604, this.field8604, 0, var5);
            if (class672.method3806(26, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field8604 * 4) == var8) {
                    var5.method3780(arg3[var6], 0, 0, this.field8604 * this.field8604);
                } else {
                    for (int var9 = 0; var9 < this.field8604; var9++) {
                        var5.method3780(arg3[var6], this.field8604 * var9, var8 * var9, this.field8604);
                    }
                }
                this.field8603.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method650(boolean arg0) {
        return arg0 ? (IDirect3DBaseTexture) null : this.field8603;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(BLtn;)V")
    public final void method394(byte arg0, class166 arg1) {
        if (arg0 > -92) {
            this.method405(101);
        }
        super.method394((byte) -105, arg1);
    }
}
