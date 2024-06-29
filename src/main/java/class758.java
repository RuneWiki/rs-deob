import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class758 extends class512 {

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "Z")
    private boolean field10536 = false;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "Lrd;")
    private class549 field10532;

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10531;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10534;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10535;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10538;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Loia;")
    private class51 field10537;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "Z")
    private boolean field10540;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "[F")
    private static float[] field10533 = new float[4];

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "[F")
    private static float[] field10529 = new float[16];

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10539;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Z")
    private boolean field10530;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method36(int arg0, boolean arg1) {
        this.field10530 = arg1;
        this.field7153.method2949(1, 7544);
        this.field7153.method2933((byte) -57, this.field10537);
        if (arg0 > -62) {
            return;
        }
        this.field7153.method2878(class253.field3501, 28768, class438.field6017);
        this.field7153.method2946(0, class123.field1675, (byte) 127);
        this.field7153.method582(2, (byte) 61, true, class186.field2725, false);
        this.field7153.method2923(-101, 0, class214.field3017);
        this.field7153.method2949(0, 7544);
        this.method3062((byte) 101);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILlo;)V", line = 22)
    public final void method40(int arg0, int arg1, class117 arg2) {
        if (arg1 != -37) {
            this.field10540 = true;
        }
        if (arg2 != null) {
            if (this.field10536) {
                this.field7153.method2946(0, class186.field2725, (byte) 127);
                this.field7153.method2923(arg1 ^ 0x58, 0, class186.field2725);
                this.field10536 = false;
            }
            this.field7153.method2933((byte) -108, arg2);
            this.field7153.method2881(arg0, -1);
        } else if (!this.field10536) {
            this.field7153.method2933((byte) -31, this.field7153.field6870);
            this.field7153.method2881(1, -1);
            this.field7153.method2946(0, class214.field3017, (byte) 127);
            this.field7153.method2923(-95, 0, class214.field3017);
            this.field10536 = true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(B)V", line = 57)
    public final void method2281(byte arg0) {
        if (this.field10539 != null) {
            IDirect3DDevice var2 = this.field10532.field7746;
            class173 var3 = this.field10532.method2934(-128);
            var2.method4106(0, var3.method1090((byte) -116, field10529));
        }
        if (arg0 > -96) {
            this.method4213(119);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ZZ)V", line = 77)
    public final void method33(boolean arg0, boolean arg1) {
        if (!arg0) {
            field10533 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "(I)Z", line = 87)
    public final boolean method35(int arg0) {
        int var2 = 30 / ((-arg0 - 72) / 37);
        return this.field10540;
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(I)V", line = 101)
    public final void method2282(int arg0) {
        if (this.field10539 != null) {
            IDirect3DDevice var2 = this.field10532.field7746;
            class173 var3 = this.field10532.method2934(73);
            var2.method4106(0, var3.method1090((byte) -116, field10529));
        }
        if (arg0 != 3048) {
            this.field10540 = false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(B)V", line = 123)
    public final void method3062(byte arg0) {
        IDirect3DDevice var2 = this.field10532.field7746;
        int var3 = this.field7153.method2895(false);
        class173 var4 = this.field7153.method2915(17967);
        IDirect3DVertexShader var5;
        if (this.field10530) {
            var5 = var3 == Integer.MAX_VALUE ? this.field10534 : this.field10538;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field10531 : this.field10535;
        }
        if (this.field10539 != var5) {
            this.field10539 = var5;
            this.field10532.method3285(var5, (byte) 57);
            this.method4213(-9441);
            this.method2283((byte) 74);
            this.method1515(9370);
            this.method2281((byte) -111);
            this.method2282(3048);
            this.method2284((byte) -45);
        }
        var4.method1096(field10533, -1.0F, (byte) -54, 0.0F, 0.0F, (float) var3);
        var2.method4106(12, field10533);
        if (arg0 <= 90) {
            this.field10539 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "(B)V", line = 161)
    public final void method2284(byte arg0) {
        if (arg0 != -45) {
            this.method35(5);
        }
        if (this.field10539 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field10532.field7746;
        int var3 = this.field7153.method2160();
        int var4 = this.field7153.method2230();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method4104(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method4104(11, 1.0F / (float) this.field7153.method2935(arg0 - 77), (float) this.field7153.method2931(arg0 ^ 0xFFFFFFD5) / 255.0F, this.field7153.field6864, 1.0F / (this.field7153.field6864 - this.field7153.field6832));
        this.field7153.method2912((byte) 9, this.field7153.method2880(8));
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V", line = 194)
    public final void method1515(int arg0) {
        if (this.field10539 != null) {
            IDirect3DDevice var2 = this.field10532.field7746;
            class173 var3 = this.field7153.method2897((byte) -51);
            var2.SetVertexShaderConstantF(8, var3.method1077(field10529, -52), 2);
        }
        if (arg0 != 9370) {
            field10533 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V", line = 213)
    public final void method2283(byte arg0) {
        if (this.field10539 != null) {
            IDirect3DDevice var2 = this.field10532.field7746;
            var2.method4106(4, this.field7153.method2888(false, field10529));
        }
        if (arg0 < 64) {
            this.method36(116, false);
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 231)
    public final void method39(int arg0) {
        if (arg0 != 6) {
            this.method2281((byte) -85);
        }
        this.field7153.method2949(1, arg0 ^ 0x1D7E);
        this.field7153.method2933((byte) -101, null);
        this.field7153.method2878(class369.field4717, 28768, class369.field4717);
        this.field7153.method2946(0, class186.field2725, (byte) 127);
        this.field7153.method2946(2, class123.field1675, (byte) 127);
        this.field7153.method2923(-107, 0, class186.field2725);
        this.field7153.method2949(0, arg0 + 7538);
        if (this.field10536) {
            this.field7153.method2946(0, class186.field2725, (byte) 127);
            this.field7153.method2923(-95, 0, class186.field2725);
            this.field10536 = false;
        }
        if (this.field10539 != null) {
            this.field10532.method3285(null, (byte) 57);
            this.field10539 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lrd;Lwu;)V", line = 262)
    public class758(class549 arg0, class557 arg1) {
        super(arg0);
        this.field10532 = arg0;
        if (arg1 == null || (this.field10532.field7744.VertexShaderVersion & 0xFFFF) < 257) {
            this.field10540 = false;
        } else {
            this.field10531 = this.field10532.field7746.method4110(arg1.method3330((byte) 67, "uw_ground_unlit", "dx"));
            this.field10534 = this.field10532.field7746.method4110(arg1.method3330((byte) 67, "uw_ground_lit", "dx"));
            this.field10535 = this.field10532.field7746.method4110(arg1.method3330((byte) 67, "uw_model_unlit", "dx"));
            this.field10538 = this.field10532.field7746.method4110(arg1.method3330((byte) 67, "uw_model_lit", "dx"));
            if (this.field10538 != null & this.field10535 != null & this.field10531 != null & this.field10534 != null) {
                this.field10537 = this.field7153.method2936(false, 2, 1, new int[] { 0, -1 }, (byte) 103);
                this.field10537.method355(false, (byte) -116, false);
                this.field10540 = true;
            } else {
                this.field10540 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V", line = 291)
    private final void method4213(int arg0) {
        if (this.field10539 != null && this.field10530) {
            class173 var2 = this.field7153.method2927((byte) -92);
            IDirect3DDevice var3 = this.field10532.field7746;
            var3.method4104(13, this.field7153.field6893 * this.field7153.field6850, this.field7153.field6850 * this.field7153.field6810, this.field7153.field6881 * this.field7153.field6850, 1.0F);
            var3.method4104(14, this.field7153.field6893 * this.field7153.field6826, this.field7153.field6826 * this.field7153.field6810, this.field7153.field6881 * this.field7153.field6826, 1.0F);
            var3.method4104(16, this.field7153.field6910 * this.field7153.field6893, this.field7153.field6910 * this.field7153.field6810, this.field7153.field6910 * this.field7153.field6881, 1.0F);
            var2.method1098((byte) 35, this.field7153.field6861[2], this.field7153.field6861[0], this.field7153.field6861[1], field10533);
            var3.SetVertexShaderConstantF(15, field10533, 1);
            var2.method1098((byte) 35, this.field7153.field6847[2], this.field7153.field6847[0], this.field7153.field6847[1], field10533);
            var3.SetVertexShaderConstantF(17, field10533, 1);
        }
        if (arg0 != -9441) {
            this.method2284((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIZ)V", line = 315)
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field10531 = null;
        }
    }
}
