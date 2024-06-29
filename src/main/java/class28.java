import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class443;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class28 extends class481 implements class300 {

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field350;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lvg;IZ[[I)V", line = 3)
    public class28(class49 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class583.field8126, class82.field1147, arg2 && arg0.field713, arg1 * arg1 * 6);
        this.field349 = arg1;
        if (this.field6700) {
            this.field350 = this.field6698.field720.method2552(this.field349, 0, 1024, 21, 1);
        } else {
            this.field350 = this.field6698.field720.method2552(this.field349, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6698.field715;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field350.LockRect(var6, 0, 0, 0, this.field349, this.field349, 0, var5);
            if (class443.method2538(-1, var7)) {
                int var8 = var5.getRowPitch();
                if ((this.field349 * 4) == var8) {
                    var5.method2564(arg3[var6], 0, 0, this.field349 * this.field349);
                } else {
                    for (int var9 = 0; var9 < this.field349; var9++) {
                        var5.method2564(arg3[var6], this.field349 * var9, var8 * var9, this.field349);
                    }
                }
                this.field350.UnlockRect(var6, 0);
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 54)
    public final void method129(byte arg0) {
        if (arg0 != -33) {
            this.field350 = null;
        }
        this.field6698.method309(arg0 ^ 0xFFFFFFAB, this);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 64)
    public final IDirect3DBaseTexture method130(int arg0) {
        return arg0 < 9 ? (IDirect3DBaseTexture) null : this.field350;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLqaa;)V", line = 78)
    public final void method131(byte arg0, class26 arg1) {
        if (arg0 > 24) {
            super.method131((byte) 43, arg1);
        }
    }
}
