import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class179 extends class292 {

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lhg;")
    private class644 field2903;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2904;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2909;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2902;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2907;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Z")
    private boolean field2905;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lhi;")
    private class190 field2900;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[F")
    private static float[] field2901 = new float[4];

    @OriginalMember(owner = "client!me", name = "z", descriptor = "[F")
    private static float[] field2908 = new float[16];

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2899;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
    private boolean field2906;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public final void method759(int arg0) {
        if (this.field2899 != null) {
            IDirect3DDevice var2 = this.field2903.field9267;
            class391 var3 = this.field4393.method3263((byte) -103);
            var2.SetVertexShaderConstantF(8, var3.method2403(field2908, false), 2);
        }
        if (arg0 != -1) {
            this.field2907 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "e", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (arg0 != 0) {
            this.method601(117);
        }
        if (this.field2899 != null) {
            IDirect3DDevice var2 = this.field2903.field9267;
            var2.method2717(4, this.field4393.method3264(field2908, (byte) 60));
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
    public final void method1323(boolean arg0) {
        if (this.field2899 != null) {
            IDirect3DDevice var2 = this.field2903.field9267;
            class391 var3 = this.field2903.method3191((byte) -118);
            var2.method2717(0, var3.method2408(0, field2908));
        }
        if (!arg0) {
            this.field2904 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    private final void method1324(boolean arg0) {
        if (!arg0 || this.field2899 == null || !this.field2906) {
            return;
        }
        class391 var2 = this.field4393.method3252((byte) -67);
        IDirect3DDevice var3 = this.field2903.field9267;
        var3.method2703(13, this.field4393.field8162 * this.field4393.field8157, this.field4393.field8159 * this.field4393.field8157, this.field4393.field8157 * this.field4393.field8133, 1.0F);
        var3.method2703(14, this.field4393.field8198 * this.field4393.field8162, this.field4393.field8198 * this.field4393.field8159, this.field4393.field8198 * this.field4393.field8133, 1.0F);
        var3.method2703(16, this.field4393.field8164 * this.field4393.field8162, this.field4393.field8164 * this.field4393.field8159, this.field4393.field8164 * this.field4393.field8133, 1.0F);
        var2.method2409(this.field4393.field8105[0], this.field4393.field8105[2], this.field4393.field8105[1], -16253, field2901);
        var3.SetVertexShaderConstantF(15, field2901, 1);
        var2.method2409(this.field4393.field8143[0], this.field4393.field8143[2], this.field4393.field8143[1], -16253, field2901);
        var3.SetVertexShaderConstantF(17, field2901, 1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        int var4 = 65 % ((-arg1 - 45) / 59);
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(B)V")
    public final void method1325(byte arg0) {
        if (this.field2899 != null) {
            IDirect3DDevice var2 = this.field2903.field9267;
            class391 var3 = this.field2903.method3191((byte) -89);
            var2.method2717(0, var3.method2408(0, field2908));
        }
        if (arg0 > -108) {
            this.method1327(-13);
        }
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        if (arg0 >= -81) {
            this.field2903 = null;
        }
        if (this.field2899 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2903.field9267;
        int var3 = this.field4393.method86();
        int var4 = this.field4393.method66();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2703(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2703(11, 1.0F / (float) this.field4393.method3226(0), (float) this.field4393.method3235(8) / 255.0F, this.field4393.field8204, 1.0F / (this.field4393.field8204 - this.field4393.field8137));
        this.field4393.method3242((byte) -73, this.field4393.method3198(0));
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public final void method1327(int arg0) {
        IDirect3DDevice var2 = this.field2903.field9267;
        if (arg0 < 105) {
            this.method759(-74);
        }
        int var3 = this.field4393.method3206((byte) 5);
        class391 var4 = this.field4393.method3202(8370);
        IDirect3DVertexShader var5;
        if (this.field2906) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2909 : this.field2907;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field2904 : this.field2902;
        }
        if (this.field2899 != var5) {
            this.field2899 = var5;
            var2.SetVertexShader(var5);
            this.method1324(true);
            this.method1322(0);
            this.method759(-1);
            this.method1325((byte) -118);
            this.method1323(true);
            this.method1326((byte) -95);
        }
        var4.method2402(0.0F, field2901, (byte) -11, 0.0F, -1.0F, (float) var3);
        var2.method2717(12, field2901);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        if (arg0 < 27) {
            this.field2906 = true;
        }
        this.field4393.method3223(15, 1);
        this.field4393.method3266(-2, null);
        this.field4393.method3232(class509.field7205, class509.field7205, (byte) -100);
        this.field4393.method3231(0, class435.field6296, (byte) -83);
        this.field4393.method3231(2, class370.field5487, (byte) -92);
        this.field4393.method3224(0, (byte) -80, class435.field6296);
        this.field4393.method3223(15, 0);
        this.field4393.method3231(0, class435.field6296, (byte) -66);
        this.field4393.method3224(0, (byte) -80, class435.field6296);
        if (this.field2899 != null) {
            this.field2903.field9267.SetVertexShader(null);
            this.field2899 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            this.field2899 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (arg0 < 28) {
            this.field2906 = true;
        }
        if (arg2 == null) {
            this.field4393.method3266(-2, this.field4393.field8174);
            this.field4393.method3195(-12, 1);
            this.field4393.method3231(0, class661.field9521, (byte) -60);
            this.field4393.method3224(0, (byte) -80, class661.field9521);
        } else {
            this.field4393.method3266(-2, arg2);
            this.field4393.method3195(-12, arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 != 24561) {
            this.field2909 = null;
        }
        return this.field2905;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            this.method1324(true);
        }
        this.field2906 = arg0;
        this.field4393.method3223(15, 1);
        this.field4393.method3266(-2, this.field2900);
        this.field4393.method3232(class42.field1079, class525.field7399, (byte) -96);
        this.field4393.method3231(0, class370.field5487, (byte) -40);
        this.field4393.method2845(class435.field6296, 97, true, false, 2);
        this.field4393.method3224(0, (byte) -80, class661.field9521);
        this.field4393.method3223(15, 0);
        this.method1327(107);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lhg;Lom;)V")
    public class179(class644 arg0, class344 arg1) {
        super(arg0);
        this.field2903 = arg0;
        if (arg1 == null || (this.field2903.field9275.VertexShaderVersion & 0xFFFF) < 257) {
            this.field2905 = false;
        } else {
            this.field2904 = this.field2903.field9267.method2715(arg1.method2211("dx", 19558, "uw_ground_unlit"));
            this.field2909 = this.field2903.field9267.method2715(arg1.method2211("dx", 19558, "uw_ground_lit"));
            this.field2902 = this.field2903.field9267.method2715(arg1.method2211("dx", 19558, "uw_model_unlit"));
            this.field2907 = this.field2903.field9267.method2715(arg1.method2211("dx", 19558, "uw_model_lit"));
            if ((this.field2904 != null & this.field2909 != null & this.field2902 != null & this.field2907 != null)) {
                this.field2900 = this.field4393.method3270(1, new int[] { 0, -1 }, (byte) 50, false, 2);
                this.field2900.method465(false, 13321, false);
                this.field2905 = true;
            } else {
                this.field2905 = false;
            }
        }
    }
}
