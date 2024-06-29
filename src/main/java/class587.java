import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class587 extends class292 {

    @OriginalMember(owner = "client!am", name = "w", descriptor = "Lhg;")
    private class644 field8466;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "Lj;")
    private class504 field8464;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8465;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field8463;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "Z")
    private boolean field8460;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "[F")
    private static float[] field8462 = new float[16];

    @OriginalMember(owner = "client!am", name = "r", descriptor = "Z")
    private boolean field8461;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (arg0 < 28) {
            this.field8466 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            this.field8463 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        if (this.field8461) {
            IDirect3DDevice var4 = this.field8466.field9267;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << ((arg0 & 0x3A) >> 3)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x379B1) >> 16) / 8.0F;
            var4.method2703(14, (float) (this.field4393.field8123 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2703(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2706(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2706(5, var8, 0.0F, 0.0F, 0.0F);
        }
        int var9 = -109 % ((arg1 + 45) / 59);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public final void method1323(boolean arg0) {
        if (this.field8461) {
            IDirect3DDevice var2 = this.field8466.field9267;
            class391 var3 = this.field8466.method3202(8370);
            class391 var4 = this.field8466.method3191((byte) -112);
            var2.method2717(0, var4.method2408(0, field8462));
            var2.method2717(4, var3.method2417(field8462, 17987));
        }
        if (!arg0) {
            this.field8465 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 < 27 || !this.field8461) {
            return;
        }
        IDirect3DDevice var2 = this.field8466.field9267;
        var2.SetVertexShader(null);
        var2.SetPixelShader(null);
        this.field4393.method3223(15, 1);
        this.field4393.method3266(-2, null);
        this.field4393.method3223(15, 0);
        this.field4393.method3266(-2, null);
        this.field8461 = false;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        return arg0 == 24561 ? this.field8460 : false;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        if (arg0 > -81 || !this.field8461) {
            return;
        }
        IDirect3DDevice var2 = this.field8466.field9267;
        if (this.field4393.field8187 <= 0) {
            var2.method2703(16, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field4393.field8204;
            float var4 = this.field4393.field8137;
            var2.method2703(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        }
        var2.method2706(0, (float) ((this.field4393.field8154 & 0xFFCE20) >> 16) / 255.0F, (float) (this.field4393.field8154 >> 8 & 0xFF) / 255.0F, (float) (this.field4393.field8154 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (this.field8461) {
            IDirect3DDevice var2 = this.field8466.field9267;
            var2.method2717(8, this.field4393.method3264(field8462, (byte) 54));
        }
        if (arg0 != 0) {
            this.field8460 = false;
        }
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(B)V")
    public final void method1325(byte arg0) {
        if (this.field8461) {
            IDirect3DDevice var2 = this.field8466.field9267;
            class391 var3 = this.field8466.method3191((byte) -110);
            var2.method2717(0, var3.method2408(0, field8462));
        }
        if (arg0 > -108) {
            this.method600(-7, 33, 9);
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lhg;Lom;Lj;)V")
    public class587(class644 arg0, class344 arg1, class504 arg2) {
        super(arg0);
        this.field8466 = arg0;
        this.field8464 = arg2;
        if (arg1 != null && this.field4393.field8122 && this.field4393.field8171 && (this.field8466.field9275.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8465 = this.field8466.field9267.method2715(arg1.method2211("dx", 19558, "environment_mapped_water_v"));
            this.field8463 = this.field8466.field9267.method2708(arg1.method2211("dx", 19558, "environment_mapped_water_f"));
            this.field8460 = this.field8465 != null && this.field8463 != null && this.field8464.method2998((byte) 109);
        } else {
            this.field8465 = null;
            this.field8463 = null;
            this.field8460 = false;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public final void method759(int arg0) {
        if (arg0 != -1) {
            this.field8460 = true;
        }
        if (this.field8461) {
            IDirect3DDevice var2 = this.field8466.field9267;
            class391 var3 = this.field4393.method3263((byte) 100);
            var2.SetVertexShaderConstantF(12, var3.method2403(field8462, false), 2);
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            return;
        }
        class524 var3 = this.field4393.method3269(false);
        if (!this.field8460 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field8466.field9267;
        var4.SetVertexShader(this.field8465);
        var4.SetPixelShader(this.field8463);
        this.field4393.method3223(15, 1);
        this.field4393.method3266(arg1 + 114, var3);
        this.field4393.method3223(15, 0);
        this.field4393.method3266(-2, this.field8464.field7153);
        this.field8461 = true;
        this.method1323(true);
        this.method759(-1);
        this.method1322(0);
        this.method1326((byte) -87);
        var4.method2706(1, -this.field4393.field8105[0], -this.field4393.field8105[1], -this.field4393.field8105[2], 0.0F);
        var4.method2706(2, this.field4393.field8162, this.field4393.field8159, this.field4393.field8133, 1.0F);
        var4.method2706(3, Math.abs(this.field4393.field8105[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }
}
