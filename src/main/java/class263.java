import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class263 extends class545 {

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "Lad;")
    private class173 field3773;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "Lur;")
    private class617 field3776;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3774;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field3772;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "Z")
    private boolean field3777;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "[F")
    private static float[] field3778 = new float[16];

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "Z")
    private boolean field3775;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(I)V", line = 5)
    public final void method1739(int arg0) {
        int var2 = 28 / ((arg0 - 85) / 33);
        if (this.field3775) {
            IDirect3DDevice var3 = this.field3773.field2418;
            class417 var4 = this.field3773.method244(1);
            var3.method4105(0, var4.method2530(-95, field3778));
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IILec;)V", line = 21)
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg0 != 2) {
            this.method1741(-22);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Z)V", line = 32)
    public final void method1740(boolean arg0) {
        if (this.field3775) {
            IDirect3DDevice var2 = this.field3773.field2418;
            var2.method4105(8, this.field7920.method291((byte) -32, field3778));
        }
        if (arg0) {
            this.field3772 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Lad;Lla;Lur;)V", line = 48)
    public class263(class173 arg0, class423 arg1, class617 arg2) {
        super(arg0);
        this.field3773 = arg0;
        this.field3776 = arg2;
        if (arg1 != null && this.field7920.field615 && this.field7920.field600 && (this.field3773.field2419.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3774 = this.field3773.field2418.method4110(arg1.method2591("dx", (byte) 71, "environment_mapped_water_v"));
            this.field3772 = this.field3773.field2418.method4098(arg1.method2591("dx", (byte) 71, "environment_mapped_water_f"));
            this.field3777 = this.field3774 != null && this.field3772 != null && this.field3776.method3583((byte) 26);
        } else {
            this.field3772 = null;
            this.field3777 = false;
            this.field3774 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "(I)V", line = 72)
    public final void method453(int arg0) {
        if (this.field3775) {
            IDirect3DDevice var2 = this.field3773.field2418;
            if (this.field7920.field621 > 0) {
                float var3 = this.field7920.field546;
                float var4 = this.field7920.field563;
                var2.method4097(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method4097(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method4099(0, (float) (this.field7920.field575 >> 16 & 0xFF) / 255.0F, (float) (this.field7920.field575 >> 8 & 0xFF) / 255.0F, (float) (this.field7920.field575 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 0) {
            this.method452(-66);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(I)Z", line = 100)
    public final boolean method459(int arg0) {
        if (arg0 <= 63) {
            this.field3776 = null;
        }
        return this.field3777;
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(I)V", line = 110)
    public final void method1741(int arg0) {
        if (arg0 != 12) {
            this.field3772 = null;
        }
        if (this.field3775) {
            IDirect3DDevice var2 = this.field3773.field2418;
            class417 var3 = this.field7920.method349((byte) 25);
            var2.SetVertexShaderConstantF(12, var3.method2534(field3778, (byte) 104), 2);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 129)
    public final void method452(int arg0) {
        if (this.field3775) {
            this.field3773.method1256((byte) -55, null);
            this.field3773.method1245(64, null);
            this.field7920.method208(arg0 ^ 0xA, 1);
            this.field7920.method264(null, -2);
            this.field7920.method208(8, 0);
            this.field7920.method264(null, arg0 - 4);
            this.field3775 = false;
        }
        if (arg0 != 2) {
            field3778 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZZ)V", line = 149)
    public final void method454(boolean arg0, boolean arg1) {
        if (arg1) {
            field3778 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V", line = 158)
    public final void method1742(int arg0) {
        if (this.field3775) {
            IDirect3DDevice var2 = this.field3773.field2418;
            class417 var3 = this.field3773.method323((byte) -26);
            class417 var4 = this.field3773.method244(1);
            var2.method4105(0, var4.method2530(arg0 ^ 0x3B6, field3778));
            var2.method4105(4, var3.method2528(-3, field3778));
        }
        if (arg0 != -971) {
            this.method451(116, -33, -16);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BZ)V", line = 186)
    public final void method457(byte arg0, boolean arg1) {
        if (arg0 <= 101) {
            this.method459(-98);
        }
        class245 var3 = this.field7920.method385(3);
        if (!this.field3777 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field3773.field2418;
        this.field3773.method1256((byte) -42, this.field3774);
        this.field3773.method1245(64, this.field3772);
        this.field7920.method208(8, 1);
        this.field7920.method264(var3, -2);
        this.field7920.method208(8, 0);
        this.field7920.method264(this.field3776.field8788, -2);
        this.field3775 = true;
        this.method1742(-971);
        this.method1741(12);
        this.method1740(false);
        this.method453(0);
        var4.method4099(1, -this.field7920.field609[0], -this.field7920.field609[1], -this.field7920.field609[2], 0.0F);
        var4.method4099(2, this.field7920.field541, this.field7920.field552, this.field7920.field549, 1.0F);
        var4.method4099(3, Math.abs(this.field7920.field609[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(III)V", line = 217)
    public final void method451(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            field3778 = null;
        }
        if (!this.field3775) {
            return;
        }
        IDirect3DDevice var4 = this.field3773.field2418;
        int var5 = 0x1 << (arg2 & 0x3);
        float var6 = (float) (0x1 << (arg2 >> 3 & 0x7)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method4097(14, (float) (this.field7920.field585 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) ((arg1 & 0x3FE3E) >> 16) / 8.0F;
        var4.method4097(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method4099(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method4099(5, var8, 0.0F, 0.0F, 0.0F);
    }
}
