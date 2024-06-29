import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!via")
public class class472 extends class512 {

    @OriginalMember(owner = "client!via", name = "p", descriptor = "Ljo;")
    private class20 field6471;

    @OriginalMember(owner = "client!via", name = "q", descriptor = "Lrd;")
    private class549 field6472;

    @OriginalMember(owner = "client!via", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6476;

    @OriginalMember(owner = "client!via", name = "t", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field6475;

    @OriginalMember(owner = "client!via", name = "r", descriptor = "Z")
    private boolean field6473;

    @OriginalMember(owner = "client!via", name = "s", descriptor = "[F")
    private static float[] field6474 = new float[16];

    @OriginalMember(owner = "client!via", name = "o", descriptor = "Z")
    private boolean field6470;

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IIZ)V", line = 4)
    public final void method38(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            this.field6471 = null;
        }
        if (!this.field6470) {
            return;
        }
        IDirect3DDevice var4 = this.field6472.field7746;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x39) >> 3)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method4104(14, (float) (this.field7153.field6811 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) ((arg1 & 0x35E1E) >> 16) / 8.0F;
        var4.method4104(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method4103(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method4103(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(B)V", line = 33)
    public final void method2284(byte arg0) {
        if (this.field6470) {
            IDirect3DDevice var2 = this.field6472.field7746;
            if (this.field7153.field6889 <= 0) {
                var2.method4104(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field7153.field6864;
                float var4 = this.field7153.field6832;
                var2.method4104(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method4103(0, (float) (this.field7153.field6830 >> 16 & 0xFF) / 255.0F, (float) (this.field7153.field6830 >> 8 & 0xFF) / 255.0F, (float) (this.field7153.field6830 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != -45) {
            this.field6475 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(I)V", line = 60)
    public final void method1515(int arg0) {
        if (this.field6470) {
            IDirect3DDevice var2 = this.field6472.field7746;
            class173 var3 = this.field7153.method2897((byte) -51);
            var2.SetVertexShaderConstantF(12, var3.method1077(field6474, -71), 2);
        }
        if (arg0 != 9370) {
            field6474 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IILlo;)V", line = 79)
    public final void method40(int arg0, int arg1, class117 arg2) {
        if (arg1 != -37) {
            this.field6471 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "b", descriptor = "(I)V", line = 89)
    public final void method39(int arg0) {
        if (this.field6470) {
            this.field6472.method3285(null, (byte) 57);
            this.field6472.method3281(77, null);
            this.field7153.method2949(1, 7544);
            this.field7153.method2933((byte) 102, null);
            this.field7153.method2949(0, 7544);
            this.field7153.method2933((byte) 106, null);
            this.field6470 = false;
        }
        if (arg0 != 6) {
            this.field6470 = true;
        }
    }

    @OriginalMember(owner = "client!via", name = "c", descriptor = "(B)V", line = 111)
    public final void method2283(byte arg0) {
        if (this.field6470) {
            IDirect3DDevice var2 = this.field6472.field7746;
            var2.method4106(8, this.field7153.method2888(false, field6474));
        }
        if (arg0 < 64) {
            this.method2281((byte) -101);
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(ZZ)V", line = 128)
    public final void method33(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field6470 = true;
        }
    }

    @OriginalMember(owner = "client!via", name = "d", descriptor = "(I)V", line = 137)
    public final void method2282(int arg0) {
        if (this.field6470) {
            IDirect3DDevice var2 = this.field6472.field7746;
            class173 var3 = this.field6472.method2915(arg0 ^ 0x4DC7);
            class173 var4 = this.field6472.method2934(-53);
            var2.method4106(0, var4.method1090((byte) -116, field6474));
            var2.method4106(4, var3.method1084(field6474, (byte) -103));
        }
        if (arg0 != 3048) {
            this.field6475 = null;
        }
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(B)V", line = 159)
    public final void method2281(byte arg0) {
        if (arg0 >= -96) {
            this.field6475 = null;
        }
        if (this.field6470) {
            IDirect3DDevice var2 = this.field6472.field7746;
            class173 var3 = this.field6472.method2934(65);
            var2.method4106(0, var3.method1090((byte) -116, field6474));
        }
    }

    @OriginalMember(owner = "client!via", name = "a", descriptor = "(IZ)V", line = 180)
    public final void method36(int arg0, boolean arg1) {
        class273 var3 = this.field7153.method2898((byte) 111);
        if (this.field6473 && var3 != null) {
            IDirect3DDevice var4 = this.field6472.field7746;
            this.field6472.method3285(this.field6476, (byte) 57);
            this.field6472.method3281(77, this.field6475);
            this.field7153.method2949(1, 7544);
            this.field7153.method2933((byte) 111, var3);
            this.field7153.method2949(0, 7544);
            this.field7153.method2933((byte) 84, this.field6471.field243);
            this.field6470 = true;
            this.method2282(3048);
            this.method1515(9370);
            this.method2283((byte) 66);
            this.method2284((byte) -45);
            var4.method4103(1, -this.field7153.field6861[0], -this.field7153.field6861[1], -this.field7153.field6861[2], 0.0F);
            var4.method4103(2, this.field7153.field6893, this.field7153.field6810, this.field7153.field6881, 1.0F);
            var4.method4103(3, Math.abs(this.field7153.field6861[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 > -62) {
            this.method38(-42, 55, true);
        }
    }

    @OriginalMember(owner = "client!via", name = "<init>", descriptor = "(Lrd;Lwu;Ljo;)V", line = 213)
    public class472(class549 arg0, class557 arg1, class20 arg2) {
        super(arg0);
        this.field6471 = arg2;
        this.field6472 = arg0;
        if (arg1 != null && this.field7153.field6896 && this.field7153.field6865 && (this.field6472.field7744.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6476 = this.field6472.field7746.method4110(arg1.method3330((byte) 67, "environment_mapped_water_v", "dx"));
            this.field6475 = this.field6472.field7746.method4100(arg1.method3330((byte) 67, "environment_mapped_water_f", "dx"));
            this.field6473 = this.field6476 != null && this.field6475 != null && this.field6471.method98(16);
        } else {
            this.field6476 = null;
            this.field6475 = null;
            this.field6473 = false;
        }
    }

    @OriginalMember(owner = "client!via", name = "e", descriptor = "(I)Z", line = 238)
    public final boolean method35(int arg0) {
        int var2 = 56 / ((-arg0 - 72) / 37);
        return this.field6473;
    }
}
