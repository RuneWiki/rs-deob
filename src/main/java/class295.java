import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public class class295 extends class232 {

    @OriginalMember(owner = "client!wha", name = "j", descriptor = "Z")
    private boolean field4446 = false;

    @OriginalMember(owner = "client!wha", name = "r", descriptor = "Lki;")
    private class735 field4454;

    @OriginalMember(owner = "client!wha", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4452;

    @OriginalMember(owner = "client!wha", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4453;

    @OriginalMember(owner = "client!wha", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4450;

    @OriginalMember(owner = "client!wha", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4448;

    @OriginalMember(owner = "client!wha", name = "k", descriptor = "Z")
    private boolean field4447;

    @OriginalMember(owner = "client!wha", name = "t", descriptor = "Lkt;")
    private class166 field4456;

    @OriginalMember(owner = "client!wha", name = "m", descriptor = "[F")
    private static float[] field4449 = new float[4];

    @OriginalMember(owner = "client!wha", name = "i", descriptor = "[F")
    private static float[] field4445 = new float[16];

    @OriginalMember(owner = "client!wha", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4451;

    @OriginalMember(owner = "client!wha", name = "s", descriptor = "Z")
    private boolean field4455;

    @OriginalMember(owner = "client!wha", name = "<init>", descriptor = "(Lki;Lcb;)V")
    public class295(class735 arg0, class544 arg1) {
        super(arg0);
        this.field4454 = arg0;
        if (arg1 == null || (this.field4454.field10268.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4447 = false;
        } else {
            this.field4452 = this.field4454.field10253.method2966(arg1.method3126((byte) 115, "dx", "uw_ground_unlit"));
            this.field4453 = this.field4454.field10253.method2966(arg1.method3126((byte) -124, "dx", "uw_ground_lit"));
            this.field4450 = this.field4454.field10253.method2966(arg1.method3126((byte) 60, "dx", "uw_model_unlit"));
            this.field4448 = this.field4454.field10253.method2966(arg1.method3126((byte) 39, "dx", "uw_model_lit"));
            if ((this.field4453 != null & this.field4452 != null & this.field4450 != null & this.field4448 != null)) {
                this.field4456 = this.field3368.method1058(false, new int[] { 0, -1 }, 1, (byte) -24, 2);
                this.field4456.method42(false, (byte) -120, false);
                this.field4447 = true;
            } else {
                this.field4447 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        if (arg1 <= 21) {
            this.field4456 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        if (arg0 != -30998) {
            this.field4452 = null;
        }
        return this.field4447;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        this.field4455 = arg0;
        this.field3368.method1140((byte) -55, 1);
        this.field3368.method1104(true, this.field4456);
        this.field3368.method1136((byte) -124, class468.field6696, class438.field6278);
        if (arg1 != -126) {
            this.field4446 = true;
        }
        this.field3368.method1056(arg1 + 158, class490.field6966, 0);
        this.field3368.method1057(2, false, class412.field5814, true, (byte) 115);
        this.field3368.method1157(arg1 + 127, 0, class490.field6967);
        this.field3368.method1140((byte) -31, 0);
        this.method1606(arg1 ^ 0xFFFFDFC7);
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(B)V")
    public final void method1267(byte arg0) {
        if (arg0 >= 57 && this.field4451 != null) {
            IDirect3DDevice var2 = this.field4454.field10253;
            var2.method2967(4, this.field3368.method1160(false, field4445));
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = -108 % ((48 - arg0) / 51);
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)V")
    public final void method1265(int arg0) {
        if (arg0 == -18866 && this.field4451 != null) {
            IDirect3DDevice var2 = this.field4454.field10253;
            class468 var3 = this.field4454.method1168(117);
            var2.method2967(0, var3.method2771(field4445, 9));
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        this.field3368.method1140((byte) -51, 1);
        if (arg0 < 77) {
            this.method1265(28);
        }
        this.field3368.method1104(true, null);
        this.field3368.method1136((byte) -105, class174.field2460, class174.field2460);
        this.field3368.method1056(32, class412.field5814, 0);
        this.field3368.method1056(32, class490.field6966, 2);
        this.field3368.method1157(1, 0, class412.field5814);
        this.field3368.method1140((byte) -57, 0);
        if (this.field4446) {
            this.field3368.method1056(32, class412.field5814, 0);
            this.field3368.method1157(1, 0, class412.field5814);
            this.field4446 = false;
        }
        if (this.field4451 != null) {
            this.field4454.method4117(false, null);
            this.field4451 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "f", descriptor = "(I)V")
    private final void method1983(int arg0) {
        int var2 = -128 % ((-arg0 - 8) / 36);
        if (this.field4451 == null || !this.field4455) {
            return;
        }
        class468 var3 = this.field3368.method1038((byte) -81);
        IDirect3DDevice var4 = this.field4454.field10253;
        var4.method2968(13, this.field3368.field2212 * this.field3368.field2191, this.field3368.field2191 * this.field3368.field2144, this.field3368.field2221 * this.field3368.field2191, 1.0F);
        var4.method2968(14, this.field3368.field2217 * this.field3368.field2212, this.field3368.field2217 * this.field3368.field2144, this.field3368.field2221 * this.field3368.field2217, 1.0F);
        var4.method2968(16, this.field3368.field2212 * this.field3368.field2188, this.field3368.field2188 * this.field3368.field2144, this.field3368.field2221 * this.field3368.field2188, 1.0F);
        var3.method2770(this.field3368.field2172[2], 89, field4449, this.field3368.field2172[1], this.field3368.field2172[0]);
        var4.SetVertexShaderConstantF(15, field4449, 1);
        var3.method2770(this.field3368.field2189[2], 76, field4449, this.field3368.field2189[1], this.field3368.field2189[0]);
        var4.SetVertexShaderConstantF(17, field4449, 1);
    }

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "(I)V")
    public final void method1606(int arg0) {
        IDirect3DDevice var2 = this.field4454.field10253;
        if (arg0 != 8261) {
            this.method1983(-89);
        }
        int var3 = this.field3368.method1130(0);
        class468 var4 = this.field3368.method1047((byte) 125);
        IDirect3DVertexShader var5;
        if (this.field4455) {
            var5 = var3 == Integer.MAX_VALUE ? this.field4453 : this.field4448;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field4452 : this.field4450;
        }
        if (this.field4451 != var5) {
            this.field4451 = var5;
            this.field4454.method4117(false, var5);
            this.method1983(arg0 - 8220);
            this.method1267((byte) 110);
            this.method908((byte) 108);
            this.method1265(arg0 ^ 0xFFFF960B);
            this.method1266(-9611);
            this.method1268(81);
        }
        var4.method2764((float) var3, 0.0F, -1.0F, 0.0F, field4449, (byte) 53);
        var2.method2967(12, field4449);
    }

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "(I)V")
    public final void method1266(int arg0) {
        if (this.field4451 != null) {
            IDirect3DDevice var2 = this.field4454.field10253;
            class468 var3 = this.field4454.method1168(arg0 + 9738);
            var2.method2967(0, var3.method2771(field4445, 9));
        }
        if (arg0 != -9611) {
            this.method570(-76, null, 17);
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 != 2305) {
            return;
        }
        if (arg1 != null) {
            if (this.field4446) {
                this.field3368.method1056(32, class412.field5814, 0);
                this.field3368.method1157(1, 0, class412.field5814);
                this.field4446 = false;
            }
            this.field3368.method1104(true, arg1);
            this.field3368.method1088((byte) -31, arg2);
        } else if (!this.field4446) {
            this.field3368.method1104(true, this.field3368.field2200);
            this.field3368.method1088((byte) -31, 1);
            this.field3368.method1056(32, class490.field6967, 0);
            this.field3368.method1157(1, 0, class490.field6967);
            this.field4446 = true;
        }
    }

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "(I)V")
    public final void method1268(int arg0) {
        if (this.field4451 != null) {
            IDirect3DDevice var2 = this.field4454.field10253;
            int var3 = this.field3368.method425();
            int var4 = this.field3368.method460();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2968(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2968(11, 1.0F / (float) this.field3368.method1135((byte) -100), (float) this.field3368.method1106((byte) 121) / 255.0F, this.field3368.field2186, 1.0F / (this.field3368.field2186 - this.field3368.field2155));
            this.field3368.method1059(true, this.field3368.method1060((byte) -14));
        }
        if (arg0 <= 35) {
            this.field4450 = null;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public final void method908(byte arg0) {
        if (arg0 <= 101) {
            this.method569(-5, 117, -64);
        }
        if (this.field4451 != null) {
            IDirect3DDevice var2 = this.field4454.field10253;
            class468 var3 = this.field3368.method1165(false);
            var2.SetVertexShaderConstantF(8, var3.method2779((byte) 44, field4445), 2);
        }
    }
}
