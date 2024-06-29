import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class276 extends class292 {

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "Lj;")
    private class504 field4136;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lhg;")
    private class644 field4138;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4137;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "[F")
    private static float[] field4135 = new float[16];

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public final void method601(int arg0) {
        this.field4138.field9267.SetVertexShader(null);
        if (arg0 >= 27) {
            this.field4393.method3231(0, class435.field6296, (byte) -42);
            this.field4393.method3231(1, class20.field843, (byte) -59);
            this.field4393.method3231(2, class370.field5487, (byte) -32);
            this.field4393.method3187(12, true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lhg;Lom;Lj;)V")
    public class276(class644 arg0, class344 arg1, class504 arg2) {
        super(arg0);
        this.field4136 = arg2;
        this.field4138 = arg0;
        if (arg1 != null && this.field4136.method2996(true) && (this.field4138.field9275.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4137 = this.field4138.field9267.method2715(arg1.method2211("dx", 19558, "transparent_water"));
        } else {
            this.field4137 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZB)V")
    public final void method602(boolean arg0, byte arg1) {
        this.field4393.method3232(class42.field1079, class121.field2184, (byte) -109);
        if (arg1 != 54) {
            this.method601(99);
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)Z")
    public final boolean method604(int arg0) {
        if (arg0 != 24561) {
            this.method603((byte) -94, -63, null);
        }
        return this.field4137 != null;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(B)V")
    public final void method1325(byte arg0) {
        if (this.field4137 != null) {
            IDirect3DDevice var2 = this.field4138.field9267;
            class391 var3 = this.field4138.method3191((byte) -97);
            var2.method2717(0, var3.method2408(0, field4135));
        }
        if (arg0 >= -108) {
            this.method1323(false);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V")
    public final void method1326(byte arg0) {
        if (this.field4137 != null) {
            IDirect3DDevice var2 = this.field4138.field9267;
            if (this.field4393.field8187 <= 0) {
                var2.method2703(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field4393.field8204;
                float var4 = this.field4393.field8137;
                float var5 = var4 - 512.0F;
                var2.method2703(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field4393.method3242((byte) -73, this.field4393.field8154);
        }
        if (arg0 > -81) {
            this.field4138 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        int var4 = 72 % ((-arg1 - 45) / 59);
        IDirect3DDevice var5 = this.field4138.field9267;
        if (this.field4136.field7154) {
            float var7 = (float) (this.field4393.field8123 % 4000) / 4000.0F;
            this.field4393.method3266(-2, this.field4136.field7155);
            var5.method2703(11, var7, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field4393.field8123 % 4000 * 16 / 4000;
            this.field4393.method3266(-2, this.field4136.field7152[var6]);
            var5.method2703(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZB)V")
    public final void method599(boolean arg0, byte arg1) {
        if (arg1 != -116) {
            return;
        }
        this.field4138.field9267.SetVertexShader(this.field4137);
        this.field4393.method3231(0, class435.field6296, (byte) -54);
        this.field4393.method3231(1, class370.field5487, (byte) -97);
        this.field4393.method2845(class20.field843, arg1 + 178, false, true, 2);
        this.field4393.method3187(12, false);
        this.method1325((byte) -119);
        this.method759(-1);
        this.method1322(0);
        this.method1326((byte) -101);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
    public final void method1323(boolean arg0) {
        if (!arg0) {
            this.field4136 = null;
        }
        if (this.field4137 != null) {
            IDirect3DDevice var2 = this.field4138.field9267;
            class391 var3 = this.field4138.method3191((byte) -101);
            var2.method2717(0, var3.method2408(0, field4135));
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILhw;)V")
    public final void method603(byte arg0, int arg1, class116 arg2) {
        if (arg0 <= 28) {
            this.method601(85);
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
    public final void method759(int arg0) {
        if (arg0 != -1) {
            this.method600(-1, -52, 58);
        }
        if (this.field4137 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4138.field9267;
        class391 var3 = this.field4393.method3263((byte) 27);
        var3.method2403(field4135, false);
        field4135[2] *= 0.25F;
        field4135[7] *= 0.25F;
        field4135[4] *= 0.25F;
        field4135[1] *= 0.25F;
        field4135[6] *= 0.25F;
        field4135[0] *= 0.25F;
        field4135[3] *= 0.25F;
        field4135[5] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field4135, 2);
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V")
    public final void method1322(int arg0) {
        if (arg0 != 0) {
            this.field4136 = null;
        }
        if (this.field4137 != null) {
            IDirect3DDevice var2 = this.field4138.field9267;
            var2.method2717(4, this.field4393.method3264(field4135, (byte) 104));
        }
    }
}
