import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class42 extends class155 {

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "Luw;")
    private class440 field668;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Laia;")
    private class242 field669;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field671;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "[F")
    private static float[] field670 = new float[16];

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z")
    public final boolean method250(int arg0) {
        int var2 = 15 % ((-arg0 - 8) / 41);
        return this.field671 != null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public final void method251(byte arg0) {
        if (this.field671 != null) {
            IDirect3DDevice var2 = this.field669.field3462;
            if (this.field2533.field7740 > 0) {
                float var3 = this.field2533.field7722;
                float var4 = this.field2533.field7702;
                float var5 = var4 - 512.0F;
                var2.method2927(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2927(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field2533.method3130((byte) -108, this.field2533.field7716);
        }
        if (arg0 <= 87) {
            this.method251((byte) -81);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
    public final void method252(int arg0) {
        if (this.field671 != null) {
            IDirect3DDevice var2 = this.field669.field3462;
            var2.method2918(4, this.field2533.method3100(field670, 18895));
        }
        if (arg0 != 155) {
            this.method254(-22, -28, (byte) 123);
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public final void method253(int arg0) {
        if (arg0 != 155) {
            this.field668 = null;
        }
        if (this.field671 != null) {
            IDirect3DDevice var2 = this.field669.field3462;
            class421 var3 = this.field669.method3091(true);
            var2.method2918(0, var3.method2495(field670, (byte) -37));
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
    public final void method254(int arg0, int arg1, byte arg2) {
        if (arg2 != -92) {
            return;
        }
        IDirect3DDevice var4 = this.field669.field3462;
        if (this.field668.field5974) {
            float var5 = (float) (this.field2533.field7757 % 4000) / 4000.0F;
            this.field2533.method3090(this.field668.field5973, (byte) -77);
            var4.method2927(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field2533.field7757 % 4000 * 16 / 4000;
            this.field2533.method3090(this.field668.field5970[var6], (byte) 120);
            var4.method2927(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method255(int arg0) {
        this.field669.method1620(null, (byte) 73);
        this.field2533.method3143(class327.field4459, true, 0);
        this.field2533.method3143(class620.field8626, true, 1);
        this.field2533.method3143(class633.field8767, true, 2);
        if (arg0 > -119) {
            this.method255(-19);
        }
        this.field2533.method3169(true, (byte) -116);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method256(int arg0) {
        if (arg0 >= -19) {
            this.method251((byte) -41);
        }
        if (this.field671 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field669.field3462;
        class421 var3 = this.field2533.method3152(8);
        var3.method2479(-24175, field670);
        field670[3] *= 0.25F;
        field670[1] *= 0.25F;
        field670[0] *= 0.25F;
        field670[7] *= 0.25F;
        field670[5] *= 0.25F;
        field670[2] *= 0.25F;
        field670[4] *= 0.25F;
        field670[6] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field670, 2);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
    public final void method257(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field669 = null;
        }
        this.field2533.method3118(class639.field8801, class34.field565, 0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
    public final void method258(int arg0, boolean arg1) {
        this.field2533.method3143(class327.field4459, true, 0);
        this.field2533.method3143(class633.field8767, true, 1);
        this.field2533.method841(class620.field8626, false, 2, true, 18680);
        if (arg0 != 205) {
            this.field668 = null;
        }
        this.field2533.method3169(false, (byte) -122);
        this.field669.method1620(this.field671, (byte) 73);
        this.method260(110);
        this.method256(arg0 - 233);
        this.method252(155);
        this.method251((byte) 88);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lbr;II)V")
    public final void method259(class416 arg0, int arg1, int arg2) {
        if (arg1 >= -71) {
            this.field668 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Laia;Lgj;Luw;)V")
    public class42(class242 arg0, class662 arg1, class440 arg2) {
        super(arg0);
        this.field668 = arg2;
        this.field669 = arg0;
        if (arg1 != null && this.field668.method2564(128) && (this.field669.field3449.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field671 = this.field669.field3462.method2929(arg1.method3726(-93, "dx", "transparent_water"));
        } else {
            this.field671 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
    public final void method260(int arg0) {
        if (arg0 != 110) {
            this.method253(38);
        }
        if (this.field671 != null) {
            IDirect3DDevice var2 = this.field669.field3462;
            class421 var3 = this.field669.method3091(true);
            var2.method2918(0, var3.method2495(field670, (byte) -37));
        }
    }
}
