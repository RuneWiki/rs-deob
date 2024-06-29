import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class628 extends class74 {

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lgaa;")
    private class302 field8742;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8752;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8747;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8751;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8745;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Lls;")
    private class459 field8743;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "Z")
    private boolean field8749;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[F")
    private static float[] field8746 = new float[4];

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "[F")
    private static float[] field8750 = new float[16];

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8748;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Z")
    private boolean field8744;

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lgaa;Lpl;)V")
    public class628(class302 arg0, class612 arg1) {
        super(arg0);
        this.field8742 = arg0;
        if (arg1 == null || (this.field8742.field3710.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8749 = false;
        } else {
            this.field8752 = this.field8742.field3716.method2320(arg1.method3345(70, "dx", "uw_ground_unlit"));
            this.field8747 = this.field8742.field3716.method2320(arg1.method3345(83, "dx", "uw_ground_lit"));
            this.field8751 = this.field8742.field3716.method2320(arg1.method3345(124, "dx", "uw_model_unlit"));
            this.field8745 = this.field8742.field3716.method2320(arg1.method3345(122, "dx", "uw_model_lit"));
            if (this.field8745 != null & this.field8751 != null & this.field8752 != null & this.field8747 != null) {
                this.field8743 = this.field1011.method2576(2, false, 1, new int[] { 0, -1 }, (byte) 119);
                this.field8743.method525((byte) -81, false, false);
                this.field8749 = true;
            } else {
                this.field8749 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)Z")
    public final boolean method346(int arg0) {
        if (arg0 != -16777216) {
            this.field8751 = null;
        }
        return this.field8749;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ)V")
    public final void method339(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field8749 = true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILhfa;)V")
    public final void method341(int arg0, int arg1, class466 arg2) {
        if (arg2 == null) {
            this.field1011.method2596(this.field1011.field6246, 0);
            this.field1011.method2595(1, 0);
            this.field1011.method2602(0, 1, class141.field1830);
            this.field1011.method2561(0, class141.field1830, -18836);
        } else {
            this.field1011.method2596(arg2, 0);
            this.field1011.method2595(arg0, 0);
        }
        if (arg1 < 47) {
            this.field8747 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)V")
    public final void method443(int arg0) {
        IDirect3DDevice var2 = this.field8742.field3716;
        int var3 = this.field1011.method2531(true);
        class691 var4 = this.field1011.method2559((byte) 88);
        IDirect3DVertexShader var5;
        if (this.field8744) {
            var5 = var3 == Integer.MAX_VALUE ? this.field8747 : this.field8745;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8752 : this.field8751;
        }
        if (this.field8748 != var5) {
            this.field8748 = var5;
            var2.SetVertexShader(var5);
            this.method3449(105);
            this.method345(104);
            this.method338((byte) -55);
            this.method344((byte) -116);
            this.method342(false);
            this.method348(26185);
        }
        var4.method3906(0.0F, field8746, -1.0F, arg0 ^ arg0, (float) var3, 0.0F);
        var2.method2314(12, field8746);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
    public final void method344(byte arg0) {
        if (arg0 < -114 && this.field8748 != null) {
            IDirect3DDevice var2 = this.field8742.field3716;
            class691 var3 = this.field8742.method2579(3);
            var2.method2314(0, var3.method3904(-5928, field8750));
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public final void method338(byte arg0) {
        if (arg0 > -35) {
            this.field8742 = null;
        }
        if (this.field8748 != null) {
            IDirect3DDevice var2 = this.field8742.field3716;
            class691 var3 = this.field1011.method2546(true);
            var2.SetVertexShaderConstantF(8, var3.method3886(-26631, field8750), 2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)V")
    public final void method340(int arg0, int arg1, byte arg2) {
        if (arg2 != 65) {
            this.field8745 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V")
    private final void method3449(int arg0) {
        if (this.field8748 != null && this.field8744) {
            class691 var2 = this.field1011.method2600(-9813);
            IDirect3DDevice var3 = this.field8742.field3716;
            var3.method2322(13, this.field1011.field6331 * this.field1011.field6251, this.field1011.field6331 * this.field1011.field6295, this.field1011.field6331 * this.field1011.field6275, 1.0F);
            var3.method2322(14, this.field1011.field6290 * this.field1011.field6251, this.field1011.field6295 * this.field1011.field6290, this.field1011.field6290 * this.field1011.field6275, 1.0F);
            var3.method2322(16, this.field1011.field6304 * this.field1011.field6251, this.field1011.field6304 * this.field1011.field6295, this.field1011.field6304 * this.field1011.field6275, 1.0F);
            var2.method3896(this.field1011.field6332[0], field8746, this.field1011.field6332[1], this.field1011.field6332[2], 12342);
            var3.SetVertexShaderConstantF(15, field8746, 1);
            var2.method3896(this.field1011.field6299[0], field8746, this.field1011.field6299[1], this.field1011.field6299[2], 12342);
            var3.SetVertexShaderConstantF(17, field8746, 1);
        }
        if (arg0 <= 86) {
            this.method345(-89);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public final void method342(boolean arg0) {
        if (this.field8748 != null) {
            IDirect3DDevice var2 = this.field8742.field3716;
            class691 var3 = this.field8742.method2579(3);
            var2.method2314(0, var3.method3904(-5928, field8750));
        }
        if (arg0) {
            this.field8744 = true;
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V")
    public final void method343(int arg0) {
        this.field1011.method2589(0, 1);
        this.field1011.method2596(null, 0);
        this.field1011.method2550(class112.field1466, true, class112.field1466);
        this.field1011.method2602(0, arg0 + 19093, class5.field119);
        this.field1011.method2602(2, 1, class700.field9903);
        this.field1011.method2561(0, class5.field119, -18836);
        if (arg0 != -19092) {
            this.method347(14, true);
        }
        this.field1011.method2589(0, 0);
        this.field1011.method2602(0, 1, class5.field119);
        this.field1011.method2561(0, class5.field119, -18836);
        if (this.field8748 != null) {
            this.field8742.field3716.SetVertexShader(null);
            this.field8748 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V")
    public final void method345(int arg0) {
        if (this.field8748 != null) {
            IDirect3DDevice var2 = this.field8742.field3716;
            var2.method2314(4, this.field1011.method2558(85, field8750));
        }
        int var3 = 25 / ((54 - arg0) / 37);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public final void method347(int arg0, boolean arg1) {
        int var3 = 95 / ((52 - arg0) / 36);
        this.field8744 = arg1;
        this.field1011.method2589(0, 1);
        this.field1011.method2596(this.field8743, 0);
        this.field1011.method2550(class542.field7243, true, class538.field7226);
        this.field1011.method2602(0, 1, class700.field9903);
        this.field1011.method1676(false, class5.field119, 2, true, (byte) -66);
        this.field1011.method2561(0, class141.field1830, -18836);
        this.field1011.method2589(0, 0);
        this.method443(-16573);
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public final void method348(int arg0) {
        if (this.field8748 != null) {
            IDirect3DDevice var2 = this.field8742.field3716;
            int var3 = this.field1011.method1055();
            int var4 = this.field1011.method974();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2322(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2322(11, 1.0F / (float) this.field1011.method2590(arg0 - 26176), (float) this.field1011.method2582(-30561) / 255.0F, this.field1011.field6294, 1.0F / (this.field1011.field6294 - this.field1011.field6243));
            this.field1011.method2597((byte) 48, this.field1011.method2543(true));
        }
        if (arg0 != 26185) {
            this.field8748 = null;
        }
    }
}
