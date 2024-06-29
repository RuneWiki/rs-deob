import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DVolumeTexture;
import jagdx.PixelBuffer;
import jagdx.class735;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class69 extends class626 implements class24 {

    @OriginalMember(owner = "client!lea", name = "i", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!lea", name = "g", descriptor = "I")
    private int field1066;

    @OriginalMember(owner = "client!lea", name = "h", descriptor = "I")
    private int field1067;

    @OriginalMember(owner = "client!lea", name = "f", descriptor = "Ljagdx/IDirect3DVolumeTexture;")
    private IDirect3DVolumeTexture field1065;

    @OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lad;Lkca;III[B)V")
    public class69(class173 arg0, class755 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, arg1, class674.field9590, false, arg2 * arg3 * arg4);
        this.field1068 = arg4;
        this.field1066 = arg3;
        this.field1067 = arg2;
        this.field1065 = this.field8888.field2418.method4095(arg2, arg3, arg4, 1, 0, class173.method1223(arg1, (byte) 62, this.field8890), 1);
        PixelBuffer var7 = this.field8888.field2428;
        int var8 = this.field1065.LockBox(0, 0, 0, 0, arg2, arg3, arg4, 0, var7);
        if (class735.method4119(-2005530516, var8)) {
            int var9 = this.field8891.field10513 * this.field1067;
            int var10 = this.field1066 * var9;
            int var11 = var7.getSlicePitch();
            if (var10 == var11) {
                var7.method2566(arg5, 0, 0, this.field1066 * var9 * this.field1068);
            } else {
                int var12 = var7.getRowPitch();
                if (var9 == var12) {
                    for (int var15 = 0; var15 < this.field1068; var15++) {
                        var7.method2566(arg5, var10 * var15, var11 * var15, var10);
                    }
                } else {
                    for (int var13 = 0; var13 < this.field1068; var13++) {
                        for (int var14 = 0; var14 < this.field1066; var14++) {
                            var7.method2566(arg5, var9 * var14 + var10 * var13, var11 * var13 + var12 * var14, var9);
                        }
                    }
                }
            }
            this.field1065.UnlockBox(0);
        }
    }

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method615(byte arg0) {
        if (arg0 != -64) {
            this.method615((byte) -82);
        }
        return this.field1065;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(ZLui;)V")
    public final void method616(boolean arg0, class308 arg1) {
        if (arg0) {
            this.method617((byte) -118);
        }
        super.method616(arg0, arg1);
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
    public final void method617(byte arg0) {
        this.field8888.method1247(-1216, this);
        if (arg0 != 111) {
            this.field1068 = -35;
        }
    }
}
