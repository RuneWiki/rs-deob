import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class182 extends class135 {

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Loe;")
    private class13 field2865;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2872;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2866;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2870;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2874;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "Z")
    private boolean field2871;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Ldca;")
    private class612 field2867;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "[F")
    private static float[] field2868 = new float[4];

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[F")
    private static float[] field2869 = new float[16];

    @OriginalMember(owner = "client!be", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2864;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Z")
    private boolean field2873;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method1037(-13);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            this.field2179.method2924(13528, this.field2179.field7336);
            this.field2179.method2956((byte) 47, 1);
            this.field2179.method2914(arg1 + 30, 0, class51.field669);
            this.field2179.method2937(8, class51.field669, 0);
        } else {
            this.field2179.method2924(13528, arg0);
            this.field2179.method2956((byte) 47, arg2);
        }
        if (arg1 != 0) {
            this.field2866 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        if (arg0 <= 14) {
            this.method377(57, -106, -41);
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public final void method1037(int arg0) {
        if (arg0 != -13501) {
            this.method375(-5, true);
        }
        IDirect3DDevice var2 = this.field2865.field154;
        int var3 = this.field2179.method2916(false);
        class14 var4 = this.field2179.method2961(16680);
        IDirect3DVertexShader var5;
        if (this.field2873) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2866 : this.field2874;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field2872 : this.field2870;
        }
        if (this.field2864 != var5) {
            this.field2864 = var5;
            var2.SetVertexShader(var5);
            this.method1310(arg0 + 13567);
            this.method381(126);
            this.method378(0);
            this.method382(-35);
            this.method383((byte) 67);
            this.method380((byte) 102);
        }
        var4.method185(field2868, -1.0F, 0.0F, 0.0F, (byte) -105, (float) var3);
        var2.method3791(12, field2868);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Loe;Lvo;)V")
    public class182(class13 arg0, class345 arg1) {
        super(arg0);
        this.field2865 = arg0;
        if (arg1 == null || (this.field2865.field155.VertexShaderVersion & 0xFFFF) < 257) {
            this.field2871 = false;
        } else {
            this.field2872 = this.field2865.field154.method3802(arg1.method2073((byte) 90, "uw_ground_unlit", "dx"));
            this.field2866 = this.field2865.field154.method3802(arg1.method2073((byte) 116, "uw_ground_lit", "dx"));
            this.field2870 = this.field2865.field154.method3802(arg1.method2073((byte) 59, "uw_model_unlit", "dx"));
            this.field2874 = this.field2865.field154.method3802(arg1.method2073((byte) 73, "uw_model_lit", "dx"));
            if ((this.field2870 != null & this.field2866 != null & this.field2872 != null & this.field2874 != null)) {
                this.field2867 = this.field2179.method2928(false, 1, false, 2, new int[] { 0, -1 });
                this.field2867.method414(120, false, false);
                this.field2871 = true;
            } else {
                this.field2871 = false;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public final void method383(byte arg0) {
        if (arg0 < 25) {
            this.method1037(30);
        }
        if (this.field2864 != null) {
            IDirect3DDevice var2 = this.field2865.field154;
            class14 var3 = this.field2865.method2969(15475);
            var2.method3791(0, var3.method154(field2869, 19749));
        }
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "(I)V")
    public final void method382(int arg0) {
        if (this.field2864 != null) {
            IDirect3DDevice var2 = this.field2865.field154;
            class14 var3 = this.field2865.method2969(15475);
            var2.method3791(0, var3.method154(field2869, 19749));
        }
        if (arg0 > -34) {
            this.method1037(-113);
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V")
    public final void method378(int arg0) {
        if (this.field2864 != null) {
            IDirect3DDevice var2 = this.field2865.field154;
            class14 var3 = this.field2179.method2957(-11263);
            var2.SetVertexShaderConstantF(8, var3.method157(-125, field2869), 2);
        }
        if (arg0 != 0) {
            this.method377(61, 115, -17);
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            this.field2867 = null;
        }
        return this.field2871;
    }

    @OriginalMember(owner = "client!be", name = "i", descriptor = "(I)V")
    private final void method1310(int arg0) {
        if (this.field2864 != null && this.field2873) {
            class14 var2 = this.field2179.method2943((byte) -50);
            IDirect3DDevice var3 = this.field2865.field154;
            var3.method3792(13, this.field2179.field7305 * this.field2179.field7301, this.field2179.field7334 * this.field2179.field7301, this.field2179.field7319 * this.field2179.field7301, 1.0F);
            var3.method3792(14, this.field2179.field7363 * this.field2179.field7305, this.field2179.field7363 * this.field2179.field7334, this.field2179.field7363 * this.field2179.field7319, 1.0F);
            var3.method3792(16, this.field2179.field7305 * this.field2179.field7294, this.field2179.field7334 * this.field2179.field7294, this.field2179.field7319 * this.field2179.field7294, 1.0F);
            var2.method162(this.field2179.field7360[1], field2868, this.field2179.field7360[0], this.field2179.field7360[2], (byte) 47);
            var3.SetVertexShaderConstantF(15, field2868, 1);
            var2.method162(this.field2179.field7310[1], field2868, this.field2179.field7310[0], this.field2179.field7310[2], (byte) -120);
            var3.SetVertexShaderConstantF(17, field2868, 1);
        }
        if (arg0 < 45) {
            this.field2865 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        this.field2873 = arg0;
        this.field2179.method2953(1, 126);
        this.field2179.method2924(13528, this.field2867);
        this.field2179.method2959(class166.field2734, class345.field4866, (byte) -99);
        this.field2179.method2914(116, 0, class450.field6484);
        if (arg1 != -25475) {
            this.field2871 = true;
        }
        this.field2179.method143(true, class171.field2763, 75, false, 2);
        this.field2179.method2937(8, class51.field669, 0);
        this.field2179.method2953(0, 124);
        this.method1037(arg1 ^ 0x573E);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
    public final void method380(byte arg0) {
        if (this.field2864 != null) {
            IDirect3DDevice var2 = this.field2865.field154;
            int var3 = this.field2179.method746();
            int var4 = this.field2179.method820();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method3792(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method3792(11, 1.0F / (float) this.field2179.method2968(false), (float) this.field2179.method2898((byte) -11) / 255.0F, this.field2179.field7322, 1.0F / (this.field2179.field7322 - this.field2179.field7315));
            this.field2179.method2936(this.field2179.method2901(104), -124);
        }
        if (arg0 < 63) {
            this.field2873 = true;
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        this.field2179.method2953(1, 116);
        this.field2179.method2924(13528, null);
        this.field2179.method2959(class55.field715, class55.field715, (byte) -125);
        int var2 = 31 / ((-arg0 - 29) / 45);
        this.field2179.method2914(103, 0, class171.field2763);
        this.field2179.method2914(105, 2, class450.field6484);
        this.field2179.method2937(8, class171.field2763, 0);
        this.field2179.method2953(0, 108);
        this.field2179.method2914(47, 0, class171.field2763);
        this.field2179.method2937(8, class171.field2763, 0);
        if (this.field2864 != null) {
            this.field2865.field154.SetVertexShader(null);
            this.field2864 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (this.field2864 != null) {
            IDirect3DDevice var2 = this.field2865.field154;
            var2.method3791(4, this.field2179.method2955(10264, field2869));
        }
        if (arg0 <= 125) {
            this.method379(-43);
        }
    }
}
