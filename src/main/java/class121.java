import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class452;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eea")
public class class121 extends class385 implements class306 {

    @OriginalMember(owner = "client!eea", name = "f", descriptor = "I")
    private int field2029;

    @OriginalMember(owner = "client!eea", name = "i", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!eea", name = "g", descriptor = "I")
    private int field2030;

    @OriginalMember(owner = "client!eea", name = "h", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field2031;

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(Lcba;I)V")
    public final void method166(class516 arg0, int arg1) {
        super.method166(arg0, arg1);
    }

    @OriginalMember(owner = "client!eea", name = "a", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method167(int arg0) {
        if (arg0 != -13696) {
            this.field2032 = -118;
        }
        return this.field2031;
    }

    @OriginalMember(owner = "client!eea", name = "c", descriptor = "(B)V")
    public final void method168(byte arg0) {
        this.field5125.method2301((byte) 62, this);
        if (arg0 < 104) {
            this.method166(null, 67);
        }
    }

    @OriginalMember(owner = "client!eea", name = "<init>", descriptor = "(Lss;Lhi;III[B)V")
    public class121(class401 arg0, class193 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class294.field4160, false, arg2 * arg4 * arg3);
        this.field2029 = arg3;
        this.field2032 = arg4;
        this.field2030 = arg2;
        this.field2031 = this.field5125.field5342.method2569(arg2, arg3, arg4, 1, 0, class401.method2300(arg1, this.field5122, 51), 1);
        PixelBuffer var7 = this.field5125.field5319;
        int var8 = this.field2031.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class452.method2566(var8, (byte) -99)) {
            int var9 = this.field5124.field2828 * this.field2030;
            int var10 = this.field2029 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2584(arg5, 0, 0, this.field2032 * this.field2029 * var9);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var13 = 0; var13 < this.field2032; var13++) {
                        var7.method2584(arg5, var10 * var13, var11 * var13, var10);
                    }
                } else {
                    for (int var14 = 0; var14 < this.field2032; var14++) {
                        for (int var15 = 0; var15 < this.field2029; var15++) {
                            var7.method2584(arg5, var9 * var15 + var10 * var14, var11 * var14 + var12 * var15, var9);
                        }
                    }
                }
            }
            this.field2031.UnlockBox(0);
        }
    }
}
