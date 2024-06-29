import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!afa")
public class class377 extends class512 {

    @OriginalMember(owner = "client!afa", name = "o", descriptor = "Ljo;")
    private class20 field5256;

    @OriginalMember(owner = "client!afa", name = "q", descriptor = "Lrd;")
    private class549 field5258;

    @OriginalMember(owner = "client!afa", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5257;

    @OriginalMember(owner = "client!afa", name = "r", descriptor = "[F")
    private static float[] field5259 = new float[16];

    @OriginalMember(owner = "client!afa", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        this.field5258.method3285(null, (byte) 57);
        this.field7153.method2946(0, class186.field2725, (byte) 127);
        this.field7153.method2946(1, class87.field1198, (byte) 127);
        this.field7153.method2946(2, class123.field1675, (byte) 127);
        if (arg0 != 6) {
            this.method2283((byte) 115);
        }
        this.field7153.method2899(true, -16777216);
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(B)V")
    public final void method2281(byte arg0) {
        if (this.field5257 != null) {
            IDirect3DDevice var2 = this.field5258.field7746;
            class173 var3 = this.field5258.method2934(-127);
            var2.method4106(0, var3.method1090((byte) -116, field5259));
        }
        if (arg0 >= -96) {
            this.field5257 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(ZZ)V")
    public final void method33(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method38(-23, -17, false);
        }
        this.field7153.method2878(class35.field498, 28768, class438.field6017);
    }

    @OriginalMember(owner = "client!afa", name = "<init>", descriptor = "(Lrd;Lwu;Ljo;)V")
    public class377(class549 arg0, class557 arg1, class20 arg2) {
        super(arg0);
        this.field5256 = arg2;
        this.field5258 = arg0;
        if (arg1 != null && this.field5256.method96(-123) && (this.field5258.field7744.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5257 = this.field5258.field7746.method4110(arg1.method3330((byte) 67, "transparent_water", "dx"));
        } else {
            this.field5257 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "e", descriptor = "(I)Z")
    public final boolean method35(int arg0) {
        int var2 = 49 / ((-arg0 - 72) / 37);
        return this.field5257 != null;
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(I)V")
    public final void method2282(int arg0) {
        if (arg0 != 3048) {
            this.field5257 = null;
        }
        if (this.field5257 != null) {
            IDirect3DDevice var2 = this.field5258.field7746;
            class173 var3 = this.field5258.method2934(-126);
            var2.method4106(0, var3.method1090((byte) -116, field5259));
        }
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(I)V")
    public final void method1515(int arg0) {
        if (arg0 != 9370) {
            this.method33(false, false);
        }
        if (this.field5257 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5258.field7746;
        class173 var3 = this.field7153.method2897((byte) -51);
        var3.method1077(field5259, arg0 ^ 0xFFFFDB08);
        field5259[6] *= 0.25F;
        field5259[3] *= 0.25F;
        field5259[2] *= 0.25F;
        field5259[1] *= 0.25F;
        field5259[5] *= 0.25F;
        field5259[7] *= 0.25F;
        field5259[0] *= 0.25F;
        field5259[4] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field5259, 2);
    }

    @OriginalMember(owner = "client!afa", name = "c", descriptor = "(B)V")
    public final void method2283(byte arg0) {
        if (this.field5257 != null) {
            IDirect3DDevice var2 = this.field5258.field7746;
            var2.method4106(4, this.field7153.method2888(false, field5259));
        }
        if (arg0 < 64) {
            field5259 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "d", descriptor = "(B)V")
    public final void method2284(byte arg0) {
        if (arg0 != -45 || this.field5257 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5258.field7746;
        if (this.field7153.field6889 > 0) {
            float var3 = this.field7153.field6864;
            float var4 = this.field7153.field6832;
            float var5 = var4 - 512.0F;
            var2.method4104(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method4104(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field7153.method2912((byte) 9, this.field7153.field6830);
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IILlo;)V")
    public final void method40(int arg0, int arg1, class117 arg2) {
        if (arg1 != -37) {
            this.field5258 = null;
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IZ)V")
    public final void method36(int arg0, boolean arg1) {
        this.field7153.method2946(0, class186.field2725, (byte) 127);
        this.field7153.method2946(1, class123.field1675, (byte) 127);
        this.field7153.method582(2, (byte) 8, false, class87.field1198, true);
        this.field7153.method2899(false, -16777216);
        this.field5258.method3285(this.field5257, (byte) 57);
        if (arg0 <= -62) {
            this.method2281((byte) -125);
            this.method1515(9370);
            this.method2283((byte) 85);
            this.method2284((byte) -45);
        }
    }

    @OriginalMember(owner = "client!afa", name = "a", descriptor = "(IIZ)V")
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.method1515(-15);
        }
        IDirect3DDevice var4 = this.field5258.field7746;
        if (this.field5256.field247) {
            float var6 = (float) (this.field7153.field6811 % 4000) / 4000.0F;
            this.field7153.method2933((byte) -121, this.field5256.field244);
            var4.method4104(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7153.field6811 % 4000 * 16 / 4000;
            this.field7153.method2933((byte) 108, this.field5256.field242[var5]);
            var4.method4104(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }
}
