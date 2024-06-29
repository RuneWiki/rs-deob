import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class318 extends class555 {

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Lln;")
    private class96 field4264;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Lhb;")
    private class343 field4269;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4267;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field4263;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Z")
    private boolean field4265;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[F")
    private static float[] field4266 = new float[16];

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Z")
    private boolean field4268;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public final void method122(int arg0) {
        if (this.field4268) {
            IDirect3DDevice var2 = this.field4269.field4612;
            class149 var3 = this.field4269.method3617((byte) -36);
            var2.method2451(0, var3.method858(arg0 - 12949, field4266));
        }
        if (arg0 != 12844) {
            this.field4268 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
    public final void method119(int arg0) {
        if (arg0 >= -94) {
            this.method118(true);
        }
        if (!this.field4268) {
            return;
        }
        IDirect3DDevice var2 = this.field4269.field4612;
        class149 var3 = this.field4269.method3637((byte) -6);
        class149 var4 = this.field4269.method3617((byte) -36);
        var2.method2451(0, var4.method858(-114, field4266));
        var2.method2451(4, var3.method856(field4266, 0));
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)V")
    public final void method126(int arg0, int arg1, int arg2) {
        if (this.field4268) {
            IDirect3DDevice var4 = this.field4269.field4612;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x34665) >> 16) / 8.0F;
            var4.method2462(14, (float) (this.field7580.field9245 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2462(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2452(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2452(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 <= 81) {
            this.field4268 = true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lhb;Lga;Lln;)V")
    public class318(class343 arg0, class332 arg1, class96 arg2) {
        super(arg0);
        this.field4264 = arg2;
        this.field4269 = arg0;
        if (arg1 != null && this.field7580.field9205 && this.field7580.field9248 && (this.field4269.field4609.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4267 = this.field4269.field4612.method2460(arg1.method1947(5, "environment_mapped_water_v", "dx"));
            this.field4263 = this.field4269.field4612.method2465(arg1.method1947(5, "environment_mapped_water_f", "dx"));
            this.field4265 = this.field4267 != null && this.field4263 != null && this.field4264.method546(128);
        } else {
            this.field4267 = null;
            this.field4265 = false;
            this.field4263 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
    public final void method117(boolean arg0, int arg1) {
        if (arg1 != -13443) {
            this.field4263 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
    public final void method121(byte arg0) {
        if (this.field4268) {
            IDirect3DDevice var2 = this.field4269.field4612;
            var2.SetVertexShader(null);
            var2.SetPixelShader(null);
            this.field7580.method3635(true, 1);
            this.field7580.method3613((byte) 120, null);
            this.field7580.method3635(true, 0);
            this.field7580.method3613((byte) 127, null);
            this.field4268 = false;
        }
        if (arg0 <= 45) {
            this.method120((byte) -77);
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (this.field4268) {
            IDirect3DDevice var2 = this.field4269.field4612;
            class149 var3 = this.field7580.method3669(-15506);
            var2.SetVertexShaderConstantF(12, var3.method860(field4266, (byte) 102), 2);
        }
        if (arg0 < 33) {
            this.field4265 = true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public final void method118(boolean arg0) {
        if (!arg0 && this.field4268) {
            IDirect3DDevice var2 = this.field4269.field4612;
            var2.method2451(8, this.field7580.method3652((byte) -58, field4266));
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lot;BI)V")
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg1 >= -93) {
            this.field4268 = false;
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)Z")
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.method127(null, (byte) -60, -38);
        }
        return this.field4265;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZZ)V")
    public final void method124(boolean arg0, boolean arg1) {
        class530 var3 = this.field7580.method3645((byte) 46);
        if (!arg0) {
            this.method125(29);
        }
        if (!this.field4265 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field4269.field4612;
        var4.SetVertexShader(this.field4267);
        var4.SetPixelShader(this.field4263);
        this.field7580.method3635(arg0, 1);
        this.field7580.method3613((byte) 110, var3);
        this.field7580.method3635(true, 0);
        this.field7580.method3613((byte) 103, this.field4264.field1163);
        this.field4268 = true;
        this.method119(-104);
        this.method129(95);
        this.method118(false);
        this.method120((byte) -124);
        var4.method2452(1, -this.field7580.field9239[0], -this.field7580.field9239[1], -this.field7580.field9239[2], 0.0F);
        var4.method2452(2, this.field7580.field9183, this.field7580.field9263, this.field7580.field9254, 1.0F);
        var4.method2452(3, Math.abs(this.field7580.field9239[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public final void method120(byte arg0) {
        if (this.field4268) {
            IDirect3DDevice var2 = this.field4269.field4612;
            if (this.field7580.field9260 > 0) {
                float var3 = this.field7580.field9195;
                float var4 = this.field7580.field9251;
                var2.method2462(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method2462(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method2452(0, (float) ((this.field7580.field9269 & 0xFF72AF) >> 16) / 255.0F, (float) (this.field7580.field9269 >> 8 & 0xFF) / 255.0F, (float) (this.field7580.field9269 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 > -118) {
            this.field4265 = true;
        }
    }
}
