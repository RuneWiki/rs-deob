import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class484;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class620 extends class491 implements class584 {

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    private int field8711;

    @OriginalMember(owner = "client!jia", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8712;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V")
    public final void method1335(int arg0) {
        if (arg0 == 193) {
            this.field7008.method3258(this, arg0 ^ 0xC7);
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lfi;IZ[[I)V")
    public class620(class558 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class752.field10511, class256.field3677, arg2 && arg0.field7957, arg1 * 6 * arg1);
        this.field8711 = arg1;
        if (this.field7005) {
            this.field8712 = this.field7008.field7959.method2904(this.field8711, 0, 1024, 21, 1);
        } else {
            this.field8712 = this.field7008.field7959.method2904(this.field8711, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field7008.field7979;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8712.LockRect(var6, 0, 0, 0, this.field8711, this.field8711, 0, var5);
            if (class484.method2892((byte) 84, var7)) {
                int var8 = var5.getRowPitch();
                if (this.field8711 * 4 == var8) {
                    var5.method2920(arg3[var6], 0, 0, this.field8711 * this.field8711);
                } else {
                    for (int var9 = 0; var9 < this.field8711; var9++) {
                        var5.method2920(arg3[var6], this.field8711 * var9, var8 * var9, this.field8711);
                    }
                }
                this.field8712.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLej;)V")
    public final void method1342(byte arg0, class123 arg1) {
        super.method1342((byte) 70, arg1);
        if (arg0 < 33) {
            this.method1401((byte) -40);
        }
    }

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1401(byte arg0) {
        if (arg0 != -35) {
            this.method1335(29);
        }
        return this.field8712;
    }
}
