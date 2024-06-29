import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class48 extends class135 {

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "Lob;")
    private class354 field631;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "Loe;")
    private class13 field632;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field630;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field634;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "Z")
    private boolean field633;

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "[F")
    private static float[] field629 = new float[16];

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "Z")
    private boolean field635;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        if (arg0 <= 14) {
            this.field631 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        class639 var3 = this.field2179.method2923(arg1 + 25581);
        if (arg1 != -25475) {
            this.field633 = false;
        }
        if (!this.field633 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field632.field154;
        var4.SetVertexShader(this.field630);
        var4.SetPixelShader(this.field634);
        this.field2179.method2953(1, 125);
        this.field2179.method2924(13528, var3);
        this.field2179.method2953(0, 120);
        this.field2179.method2924(arg1 ^ 0xFFFFA8A5, this.field631.field4956);
        this.field635 = true;
        this.method383((byte) 104);
        this.method378(0);
        this.method381(127);
        this.method380((byte) 84);
        var4.method3790(1, -this.field2179.field7360[0], -this.field2179.field7360[1], -this.field2179.field7360[2], 0.0F);
        var4.method3790(2, this.field2179.field7305, this.field2179.field7334, this.field2179.field7319, 1.0F);
        var4.method3790(3, Math.abs(this.field2179.field7360[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        if (this.field635) {
            IDirect3DDevice var4 = this.field632.field154;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
            int var7 = arg0 & 0xFFFF;
            float var8 = (float) ((arg0 & 0x324B2) >> 16) / 8.0F;
            var4.method3792(14, (float) (this.field2179.field7370 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method3792(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method3790(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method3790(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg2 != 0) {
            this.method385(42);
        }
    }

    @OriginalMember(owner = "client!tba", name = "d", descriptor = "(I)V")
    public final void method378(int arg0) {
        if (this.field635) {
            IDirect3DDevice var2 = this.field632.field154;
            class14 var3 = this.field2179.method2957(-11263);
            var2.SetVertexShaderConstantF(12, var3.method157(-119, field629), 2);
        }
        if (arg0 != 0) {
            field629 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        return arg0 == -4931 ? this.field633 : false;
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(B)V")
    public final void method380(byte arg0) {
        if (this.field635) {
            IDirect3DDevice var2 = this.field632.field154;
            if (this.field2179.field7317 <= 0) {
                var2.method3792(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field2179.field7322;
                float var4 = this.field2179.field7315;
                var2.method3792(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method3790(0, (float) ((this.field2179.field7332 & 0xFF92A8) >> 16) / 255.0F, (float) (this.field2179.field7332 >> 8 & 0xFF) / 255.0F, (float) (this.field2179.field7332 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 < 63) {
            this.field630 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (arg0 >= 125 && this.field635) {
            IDirect3DDevice var2 = this.field632.field154;
            var2.method3791(8, this.field2179.method2955(10264, field629));
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Loe;Lvo;Lob;)V")
    public class48(class13 arg0, class345 arg1, class354 arg2) {
        super(arg0);
        this.field631 = arg2;
        this.field632 = arg0;
        if (arg1 != null && this.field2179.field7323 && this.field2179.field7379 && (this.field632.field155.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field630 = this.field632.field154.method3802(arg1.method2073((byte) 125, "environment_mapped_water_v", "dx"));
            this.field634 = this.field632.field154.method3793(arg1.method2073((byte) 107, "environment_mapped_water_f", "dx"));
            this.field633 = this.field630 != null && this.field634 != null && this.field631.method2139(true);
        } else {
            this.field630 = null;
            this.field634 = null;
            this.field633 = false;
        }
    }

    @OriginalMember(owner = "client!tba", name = "h", descriptor = "(I)V")
    public final void method382(int arg0) {
        if (arg0 > -34) {
            this.method381(-26);
        }
        if (this.field635) {
            IDirect3DDevice var2 = this.field632.field154;
            class14 var3 = this.field632.method2969(15475);
            var2.method3791(0, var3.method154(field629, 19749));
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(B)V")
    public final void method383(byte arg0) {
        if (arg0 <= 25) {
            this.method381(-66);
        }
        if (!this.field635) {
            return;
        }
        IDirect3DDevice var2 = this.field632.field154;
        class14 var3 = this.field632.method2961(16680);
        class14 var4 = this.field632.method2969(15475);
        var2.method3791(0, var4.method154(field629, 19749));
        var2.method3791(4, var3.method172(2, field629));
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field630 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        if (this.field635) {
            IDirect3DDevice var2 = this.field632.field154;
            var2.SetVertexShader(null);
            var2.SetPixelShader(null);
            this.field2179.method2953(1, 116);
            this.field2179.method2924(13528, null);
            this.field2179.method2953(0, 122);
            this.field2179.method2924(13528, null);
            this.field635 = false;
        }
        int var3 = -121 % ((-arg0 - 29) / 45);
    }
}
