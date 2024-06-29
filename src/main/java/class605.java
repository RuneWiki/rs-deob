import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class605 extends class384 {

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "Z")
    private boolean field8399 = false;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "Lcu;")
    private class287 field8401;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8408;

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8410;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8407;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8405;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "Lbaa;")
    private class620 field8406;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "Z")
    private boolean field8402;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "[F")
    private static float[] field8400 = new float[16];

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "[F")
    private static float[] field8404 = new float[4];

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8403;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "Z")
    private boolean field8409;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)V")
    public final void method1868(byte arg0) {
        if (arg0 < 91) {
            this.field8401 = null;
        }
        if (this.field8403 != null) {
            IDirect3DDevice var2 = this.field8401.field3643;
            var2.method4014(4, this.field5337.method3747(field8400, true));
        }
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(B)V")
    public final void method1023(byte arg0) {
        if (arg0 == -52 && this.field8403 != null) {
            IDirect3DDevice var2 = this.field8401.field3643;
            class462 var3 = this.field5337.method3743(-32721);
            var2.SetVertexShaderConstantF(8, var3.method2732(field8400, (byte) 97), 2);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZB)V")
    public final void method1020(boolean arg0, byte arg1) {
        this.field8409 = arg0;
        this.field5337.method3723(true, 1);
        this.field5337.method3711(false, this.field8406);
        if (arg1 <= 23) {
            this.method1866(true);
        }
        this.field5337.method3708(126, class409.field5765, class353.field4729);
        this.field5337.method3777(false, 0, class663.field9083);
        this.field5337.method1395(false, 2, true, -113, class632.field8774);
        this.field5337.method3713(class155.field1970, 0, (byte) -81);
        this.field5337.method3723(true, 0);
        this.method2311(1);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lbia;BI)V")
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            field8404 = null;
        }
        if (arg0 != null) {
            if (this.field8399) {
                this.field5337.method3777(false, 0, class632.field8774);
                this.field5337.method3713(class632.field8774, 0, (byte) -66);
                this.field8399 = false;
            }
            this.field5337.method3711(false, arg0);
            this.field5337.method3781(arg1 ^ 0xFFFFFFAD, arg2);
        } else if (!this.field8399) {
            this.field5337.method3711(false, this.field5337.field9593);
            this.field5337.method3781(-3, 1);
            this.field5337.method3777(false, 0, class155.field1970);
            this.field5337.method3713(class155.field1970, 0, (byte) -95);
            this.field8399 = true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(B)V")
    private final void method3324(byte arg0) {
        if (this.field8403 != null && this.field8409) {
            class462 var2 = this.field5337.method3727(arg0 ^ 0x4D);
            IDirect3DDevice var3 = this.field8401.field3643;
            var3.method4012(13, this.field5337.field9651 * this.field5337.field9564, this.field5337.field9651 * this.field5337.field9571, this.field5337.field9651 * this.field5337.field9606, 1.0F);
            var3.method4012(14, this.field5337.field9650 * this.field5337.field9564, this.field5337.field9650 * this.field5337.field9571, this.field5337.field9650 * this.field5337.field9606, 1.0F);
            var3.method4012(16, this.field5337.field9628 * this.field5337.field9564, this.field5337.field9628 * this.field5337.field9571, this.field5337.field9628 * this.field5337.field9606, 1.0F);
            var2.method2727(field8404, this.field5337.field9585[2], this.field5337.field9585[1], this.field5337.field9585[0], false);
            var3.SetVertexShaderConstantF(15, field8404, 1);
            var2.method2727(field8404, this.field5337.field9566[2], this.field5337.field9566[1], this.field5337.field9566[0], false);
            var3.SetVertexShaderConstantF(17, field8404, 1);
        }
        if (arg0 != -54) {
            this.field8403 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(B)Z")
    public final boolean method1021(byte arg0) {
        return arg0 <= 78 ? true : this.field8402;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V")
    public final void method1867(int arg0) {
        int var2 = 17 % ((-arg0 - 45) / 32);
        if (this.field8403 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field8401.field3643;
        int var4 = this.field5337.method108();
        int var5 = this.field5337.method147();
        float var6 = (float) var4 - ((float) (var4 - var5) * 0.125F);
        float var7 = (float) var4 - ((float) (var4 - var5) * 0.25F);
        var3.method4012(10, var7, 1.0F / (var6 - var7), var6, 1.0F / ((float) var4 - var6));
        var3.method4012(11, 1.0F / (float) this.field5337.method3779(14), (float) this.field5337.method3709(-11036) / 255.0F, this.field5337.field9577, 1.0F / (this.field5337.field9577 - this.field5337.field9637));
        this.field5337.method3717(this.field5337.method3761((byte) -105), (byte) -88);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V")
    public final void method1866(boolean arg0) {
        if (this.field8403 != null) {
            IDirect3DDevice var2 = this.field8401.field3643;
            class462 var3 = this.field8401.method3756((byte) 104);
            var2.method4014(0, var3.method2717(field8400, false));
        }
        if (!arg0) {
            this.field8410 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V")
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (arg1 != 102) {
            this.field8399 = true;
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V")
    public final void method1865(int arg0) {
        if (arg0 == -23163 && this.field8403 != null) {
            IDirect3DDevice var2 = this.field8401.field3643;
            class462 var3 = this.field8401.method3756((byte) 60);
            var2.method4014(0, var3.method2717(field8400, false));
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(B)V")
    public final void method1019(byte arg0) {
        this.field5337.method3723(true, 1);
        this.field5337.method3711(false, null);
        this.field5337.method3708(arg0 + 174, class155.field1901, class155.field1901);
        this.field5337.method3777(false, 0, class632.field8774);
        this.field5337.method3777(false, 2, class663.field9083);
        this.field5337.method3713(class632.field8774, 0, (byte) -49);
        this.field5337.method3723(true, 0);
        if (arg0 != -60) {
            return;
        }
        if (this.field8399) {
            this.field5337.method3777(false, 0, class632.field8774);
            this.field5337.method3713(class632.field8774, 0, (byte) -77);
            this.field8399 = false;
        }
        if (this.field8403 != null) {
            this.field8401.method1714((byte) 87, null);
            this.field8403 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lcu;Lkha;)V")
    public class605(class287 arg0, class687 arg1) {
        super(arg0);
        this.field8401 = arg0;
        if (arg1 == null || (this.field8401.field3641.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8402 = false;
        } else {
            this.field8408 = this.field8401.field3643.method4013(arg1.method3813("dx", "uw_ground_unlit", -82));
            this.field8410 = this.field8401.field3643.method4013(arg1.method3813("dx", "uw_ground_lit", -108));
            this.field8407 = this.field8401.field3643.method4013(arg1.method3813("dx", "uw_model_unlit", -37));
            this.field8405 = this.field8401.field3643.method4013(arg1.method3813("dx", "uw_model_lit", -94));
            if (this.field8405 != null & this.field8408 != null & this.field8410 != null & this.field8407 != null) {
                this.field8406 = this.field5337.method3731(new int[] { 0, -1 }, false, (byte) 52, 2, 1);
                this.field8406.method381(false, -13021, false);
                this.field8402 = true;
            } else {
                this.field8402 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public final void method2311(int arg0) {
        IDirect3DDevice var2 = this.field8401.field3643;
        if (arg0 != 1) {
            return;
        }
        int var3 = this.field5337.method3767(-31359);
        class462 var4 = this.field5337.method3718(arg0 - 98);
        IDirect3DVertexShader var5;
        if (this.field8409) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8410 : this.field8405;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8408 : this.field8407;
        }
        if (this.field8403 != var5) {
            this.field8403 = var5;
            this.field8401.method1714((byte) 87, var5);
            this.method3324((byte) -54);
            this.method1868((byte) 97);
            this.method1023((byte) -52);
            this.method1866(true);
            this.method1865(-23163);
            this.method1867(arg0 ^ 0xFFFFFFA0);
        }
        var4.method2734(-1.0F, field8404, 0.0F, 0.0F, -30863, (float) var3);
        var2.method4014(12, field8404);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ)V")
    public final void method1018(int arg0, boolean arg1) {
        if (arg0 != 4) {
            this.field8406 = null;
        }
    }
}
