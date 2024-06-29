import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class735;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class395 extends class626 implements class245 {

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    private int field5663;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field5664;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;", line = 5)
    public final IDirect3DBaseTexture method615(byte arg0) {
        if (arg0 != -64) {
            this.method616(true, null);
        }
        return this.field5664;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZLui;)V", line = 17)
    public final void method616(boolean arg0, class308 arg1) {
        super.method616(arg0, arg1);
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lad;IZ[[I)V", line = 25)
    public class395(class173 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class482.field6922, class674.field9590, arg2 && arg0.field2436, arg1 * arg1 * 6);
        this.field5663 = arg1;
        if (this.field8889) {
            this.field5664 = this.field8888.field2418.method4109(this.field5663, 0, 1024, 21, 1);
        } else {
            this.field5664 = this.field8888.field2418.method4109(this.field5663, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field8888.field2428;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field5664.LockRect(var6, 0, 0, 0, this.field5663, this.field5663, 0, var5);
            if (class735.method4119(-2005530516, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field5663 * 4) == var8) {
                    var5.method4093(arg3[var6], 0, 0, this.field5663 * this.field5663);
                } else {
                    for (int var9 = 0; var9 < this.field5663; var9++) {
                        var5.method4093(arg3[var6], this.field5663 * var9, var8 * var9, this.field5663);
                    }
                }
                this.field5664.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 76)
    public final void method617(byte arg0) {
        if (arg0 == 111) {
            this.field8888.method1238(this, -1);
        }
    }
}
