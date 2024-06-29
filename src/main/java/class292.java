import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class292 extends class74 {

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "Lgaa;")
    private class302 field3627;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "Lbd;")
    private class190 field3630;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3629;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field3626;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Z")
    private boolean field3631;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "[F")
    private static float[] field3632 = new float[16];

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "Z")
    private boolean field3628;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        if (arg0) {
            this.method344((byte) -126);
        }
        if (!this.field3628) {
            return;
        }
        IDirect3DDevice var2 = this.field3627.field3716;
        class691 var3 = this.field3627.method2559((byte) 88);
        class691 var4 = this.field3627.method2579(3);
        var2.method2314(0, var4.method3904(-5928, field3632));
        var2.method2314(4, var3.method3891(-83, field3632));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        if (arg1 < 47) {
            this.field3627 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        int var3 = 18 % ((arg0 - 52) / 36);
        class660 var4 = this.field1011.method2581(2);
        if (!this.field3631 || var4 == null) {
            return;
        }
        IDirect3DDevice var5 = this.field3627.field3716;
        var5.SetVertexShader(this.field3629);
        var5.SetPixelShader(this.field3626);
        this.field1011.method2589(0, 1);
        this.field1011.method2596(var4, 0);
        this.field1011.method2589(0, 0);
        this.field1011.method2596(this.field3630.field2375, 0);
        this.field3628 = true;
        this.method342(false);
        this.method338((byte) -103);
        this.method345(-95);
        this.method348(26185);
        var5.method2328(1, -this.field1011.field6332[0], -this.field1011.field6332[1], -this.field1011.field6332[2], 0.0F);
        var5.method2328(2, this.field1011.field6251, this.field1011.field6295, this.field1011.field6275, 1.0F);
        var5.method2328(3, Math.abs(this.field1011.field6332[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        if (arg2 != 65 || !this.field3628) {
            return;
        }
        IDirect3DDevice var4 = this.field3627.field3716;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method2322(14, (float) (this.field1011.field6279 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
        var4.method2322(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2328(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2328(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public final void method345(int arg0) {
        int var2 = 18 % ((54 - arg0) / 37);
        if (this.field3628) {
            IDirect3DDevice var3 = this.field3627.field3716;
            var3.method2314(8, this.field1011.method2558(88, field3632));
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.field3629 = null;
        }
        return this.field3631;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public final void method338(byte arg0) {
        if (this.field3628) {
            IDirect3DDevice var2 = this.field3627.field3716;
            class691 var3 = this.field1011.method2546(true);
            var2.SetVertexShaderConstantF(12, var3.method3886(-26631, field3632), 2);
        }
        if (arg0 > -35) {
            this.method339(true, true);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public final void method348(int arg0) {
        if (this.field3628) {
            IDirect3DDevice var2 = this.field3627.field3716;
            if (this.field1011.field6324 > 0) {
                float var3 = this.field1011.field6294;
                float var4 = this.field1011.field6243;
                var2.method2322(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method2322(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method2328(0, (float) (this.field1011.field6303 >> 16 & 0xFF) / 255.0F, (float) (this.field1011.field6303 >> 8 & 0xFF) / 255.0F, (float) (this.field1011.field6303 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 26185) {
            this.method339(false, false);
        }
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        if (arg0 != -19092) {
            this.field3631 = true;
        }
        if (!this.field3628) {
            return;
        }
        IDirect3DDevice var2 = this.field3627.field3716;
        var2.SetVertexShader(null);
        var2.SetPixelShader(null);
        this.field1011.method2589(0, 1);
        this.field1011.method2596(null, 0);
        this.field1011.method2589(0, 0);
        this.field1011.method2596(null, 0);
        this.field3628 = false;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lgaa;Lpl;Lbd;)V")
    public class292(class302 arg0, class612 arg1, class190 arg2) {
        super(arg0);
        this.field3627 = arg0;
        this.field3630 = arg2;
        if (arg1 != null && this.field1011.field6247 && this.field1011.field6327 && (this.field3627.field3710.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3629 = this.field3627.field3716.method2320(arg1.method3345(117, "dx", "environment_mapped_water_v"));
            this.field3626 = this.field3627.field3716.method2324(arg1.method3345(111, "dx", "environment_mapped_water_f"));
            this.field3631 = this.field3629 != null && this.field3626 != null && this.field3630.method1155(true);
        } else {
            this.field3631 = false;
            this.field3626 = null;
            this.field3629 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public final void method344(byte arg0) {
        if (this.field3628) {
            IDirect3DDevice var2 = this.field3627.field3716;
            class691 var3 = this.field3627.method2579(3);
            var2.method2314(0, var3.method3904(-5928, field3632));
        }
        if (arg0 > -114) {
            this.field3627 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field3629 = null;
        }
    }
}
