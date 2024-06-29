import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DCubeTexture;
import jagdx.PixelBuffer;
import jagdx.class447;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class637 extends class430 implements class270 {

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    private int field8951;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Ljagdx/IDirect3DCubeTexture;")
    private IDirect3DCubeTexture field8950;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ldca;B)V")
    public final void method246(class161 arg0, byte arg1) {
        super.method246(arg0, (byte) 16);
        int var3 = -122 % ((arg1 - 64) / 39);
    }

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)V")
    public final void method247(int arg0) {
        this.field6547.method104(this, 6);
        if (arg0 != -4112) {
            this.method246(null, (byte) -1);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method575(byte arg0) {
        int var2 = -92 / ((-arg0 - 83) / 34);
        return this.field8950;
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lto;IZ[[I)V")
    public class637(class8 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, class86.field1055, class134.field2197, arg2 && arg0.field152, arg1 * 6 * arg1);
        this.field8951 = arg1;
        if (this.field6550) {
            this.field8950 = this.field6547.field131.method2819(this.field8951, 0, 1024, 21, 1);
        } else {
            this.field8950 = this.field6547.field131.method2819(this.field8951, 1, 0, 21, 1);
        }
        PixelBuffer var5 = this.field6547.field148;
        for (int var6 = 0; var6 < 6; var6++) {
            int var7 = this.field8950.LockRect(var6, 0, 0, 0, this.field8951, this.field8951, 0, var5);
            if (class447.method2814(var7, 141953135)) {
                int var8 = var5.getRowPitch();
                if ((this.field8951 * 4) == var8) {
                    var5.method2837(arg3[var6], 0, 0, this.field8951 * this.field8951);
                } else {
                    for (int var9 = 0; var9 < this.field8951; var9++) {
                        var5.method2837(arg3[var6], this.field8951 * var9, var8 * var9, this.field8951);
                    }
                }
                this.field8950.UnlockRect(var6, 0);
            }
        }
    }
}
