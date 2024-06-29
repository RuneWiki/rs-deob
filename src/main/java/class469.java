import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class469 extends class353 {

    @OriginalMember(owner = "client!gba", name = "r", descriptor = "Lik;")
    private class107 field6748;

    @OriginalMember(owner = "client!gba", name = "n", descriptor = "Lgb;")
    private class465 field6744;

    @OriginalMember(owner = "client!gba", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6750;

    @OriginalMember(owner = "client!gba", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field6746;

    @OriginalMember(owner = "client!gba", name = "q", descriptor = "Z")
    private boolean field6747;

    @OriginalMember(owner = "client!gba", name = "s", descriptor = "[F")
    private static float[] field6749 = new float[16];

    @OriginalMember(owner = "client!gba", name = "o", descriptor = "Z")
    private boolean field6745;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(IZ)V")
    public final void method485(int arg0, boolean arg1) {
        if (arg0 <= 1) {
            this.field6748 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V")
    public final void method2196(int arg0) {
        if (this.field6745) {
            IDirect3DDevice var2 = this.field6748.field1600;
            class300 var3 = this.field5242.method3067(-11030);
            var2.SetVertexShaderConstantF(12, var3.method1884(field6749, (byte) -121), 2);
        }
        int var4 = -77 / ((arg0 - 57) / 61);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZI)V")
    public final void method486(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method2192(-53);
        }
        if (!this.field6745) {
            return;
        }
        IDirect3DDevice var4 = this.field6748.field1600;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
        var4.method3759(14, (float) (this.field5242.field7753 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method3759(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method3769(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method3769(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(ILqda;I)V")
    public final void method484(int arg0, class689 arg1, int arg2) {
        if (arg0 != 8056) {
            this.method493((byte) 24);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(I)V")
    public final void method2190(int arg0) {
        if (this.field6745) {
            IDirect3DDevice var2 = this.field6748.field1600;
            class300 var3 = this.field6748.method3004(arg0 ^ 0xFFFF9A0D);
            var2.method3770(0, var3.method1868(field6749, 14));
        }
        if (arg0 != -25997) {
            this.method484(-94, null, 34);
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        return arg0 >= -20 ? true : this.field6747;
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "(Lik;Lmv;Lgb;)V")
    public class469(class107 arg0, class295 arg1, class465 arg2) {
        super(arg0);
        this.field6748 = arg0;
        this.field6744 = arg2;
        if (arg1 != null && this.field5242.field7721 && this.field5242.field7774 && (this.field6748.field1595.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6750 = this.field6748.field1600.method3760(arg1.method1817(-59, "dx", "environment_mapped_water_v"));
            this.field6746 = this.field6748.field1600.method3765(arg1.method1817(-94, "dx", "environment_mapped_water_f"));
            this.field6747 = this.field6750 != null && this.field6746 != null && this.field6744.method2694((byte) -123);
        } else {
            this.field6750 = null;
            this.field6747 = false;
            this.field6746 = null;
        }
    }

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(I)V")
    public final void method2192(int arg0) {
        if (arg0 < 30) {
            this.method1395(false);
        }
        if (this.field6745) {
            IDirect3DDevice var2 = this.field6748.field1600;
            var2.method3770(8, this.field5242.method3017(field6749, 8));
        }
    }

    @OriginalMember(owner = "client!gba", name = "e", descriptor = "(I)V")
    public final void method2195(int arg0) {
        if (this.field6745) {
            IDirect3DDevice var2 = this.field6748.field1600;
            class300 var3 = this.field6748.method2998(false);
            class300 var4 = this.field6748.method3004(127);
            var2.method3770(0, var4.method1868(field6749, 14));
            var2.method3770(4, var3.method1886(2, field6749));
        }
        if (arg0 > -20) {
            this.method2190(125);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IZ)V")
    public final void method491(int arg0, boolean arg1) {
        if (arg0 >= -121) {
            this.field6748 = null;
        }
        class447 var3 = this.field5242.method2999(true);
        if (!this.field6747 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field6748.field1600;
        var4.SetVertexShader(this.field6750);
        var4.SetPixelShader(this.field6746);
        this.field5242.method3050(1, 0);
        this.field5242.method3011(-128, var3);
        this.field5242.method3050(0, 0);
        this.field5242.method3011(-128, this.field6744.field6711);
        this.field6745 = true;
        this.method2195(-119);
        this.method2196(-93);
        this.method2192(89);
        this.method1395(true);
        var4.method3769(1, -this.field5242.field7747[0], -this.field5242.field7747[1], -this.field5242.field7747[2], 0.0F);
        var4.method3769(2, this.field5242.field7776, this.field5242.field7737, this.field5242.field7734, 1.0F);
        var4.method3769(3, Math.abs(this.field5242.field7747[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gba", name = "c", descriptor = "(I)V")
    public final void method490(int arg0) {
        if (arg0 != -2144900407) {
            this.method2192(-99);
        }
        if (!this.field6745) {
            return;
        }
        IDirect3DDevice var2 = this.field6748.field1600;
        var2.SetVertexShader(null);
        var2.SetPixelShader(null);
        this.field5242.method3050(1, 0);
        this.field5242.method3011(-127, null);
        this.field5242.method3050(0, 0);
        this.field5242.method3011(-128, null);
        this.field6745 = false;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Z)V")
    public final void method1395(boolean arg0) {
        if (this.field6745) {
            IDirect3DDevice var2 = this.field6748.field1600;
            if (this.field5242.field7733 > 0) {
                float var3 = this.field5242.field7692;
                float var4 = this.field5242.field7778;
                var2.method3759(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method3759(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method3769(0, (float) ((this.field5242.field7782 & 0xFF596B) >> 16) / 255.0F, (float) (this.field5242.field7782 >> 8 & 0xFF) / 255.0F, (float) (this.field5242.field7782 & 0xFF) / 255.0F, 0.0F);
        }
        if (!arg0) {
            field6749 = null;
        }
    }
}
