import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class452;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class15 extends class385 implements class537 {

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field237;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lcba;I)V")
    public final void method166(class516 arg0, int arg1) {
        super.method166(arg0, arg1);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Lss;IZ[[I)V")
    public class15(class401 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class5.field100, class294.field4160, arg2 && arg0.field5323, arg1 * arg1 * 6);
        this.field238 = arg1;
        if (this.field5126) {
            this.field237 = this.field5125.field5342.method2578(this.field238, 0, 1024, 21, 1);
        } else {
            this.field237 = this.field5125.field5342.method2578(this.field238, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field5125.field5319;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field237.LockRect(var6, 0, 0, 0, this.field238, this.field238, 0, var5);
            if (class452.method2566(var7, (byte) -41)) {
                int var8 = var5.getRowPitch();
                if (this.field238 * 4 == var8) {
                    var5.method2587(arg3[var6], 0, 0, this.field238 * this.field238);
                } else {
                    for (int var9 = 0; var9 < this.field238; var9++) {
                        var5.method2587(arg3[var6], this.field238 * var9, var8 * var9, this.field238);
                    }
                }
                this.field237.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method167(int arg0) {
        if (arg0 != -13696) {
            this.method166(null, 87);
        }
        return this.field237;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        this.field5125.method2297(this, (byte) 97);
        if (arg0 <= 104) {
            this.method168((byte) -86);
        }
    }
}
