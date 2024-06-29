import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class690 extends class681 {

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lst;")
    private class398 field9834;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lega;")
    private class662 field9832;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9835;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field9833;

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Z")
    private boolean field9837;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "[F")
    private static float[] field9831 = new float[16];

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "Z")
    private boolean field9836;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
    public final void method745(byte arg0) {
        if (arg0 <= 103) {
            this.method745((byte) -96);
        }
        if (this.field9836) {
            IDirect3DDevice var2 = this.field9832.field9273;
            class274 var3 = this.field9721.method2217(1);
            var2.SetVertexShaderConstantF(12, var3.method1696(true, field9831), 2);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public final void method748(int arg0) {
        if (this.field9836) {
            IDirect3DDevice var2 = this.field9832.field9273;
            if (this.field9721.field5308 <= 0) {
                var2.method2543(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field9721.field5336;
                float var4 = this.field9721.field5377;
                var2.method2543(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2544(0, (float) (this.field9721.field5309 >> 16 & 0xFF) / 255.0F, (float) ((this.field9721.field5309 & 0xFFC1) >> 8) / 255.0F, (float) (this.field9721.field5309 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 20060) {
            this.method749(-8);
        }
    }

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(I)V")
    public final void method740(int arg0) {
        if (this.field9836) {
            IDirect3DDevice var2 = this.field9832.field9273;
            var2.SetVertexShader(null);
            var2.SetPixelShader(null);
            this.field9721.method2201((byte) 121, 1);
            this.field9721.method2241(null, (byte) 44);
            this.field9721.method2201((byte) -84, 0);
            this.field9721.method2241(null, (byte) 44);
            this.field9836 = false;
        }
        if (arg0 != -3) {
            this.method749(-99);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (!arg0) {
            this.method739(true, -29);
        }
        return this.field9837;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILrga;I)V")
    public final void method744(int arg0, class218 arg1, int arg2) {
        if (arg2 != -3) {
            this.method741(true, -15);
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(ZI)V")
    public final void method741(boolean arg0, int arg1) {
        if (arg1 != 3) {
            this.method751(false);
        }
        class388 var3 = this.field9721.method2197((byte) -107);
        if (!this.field9837 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field9832.field9273;
        var4.SetVertexShader(this.field9835);
        var4.SetPixelShader(this.field9833);
        this.field9721.method2201((byte) 127, 1);
        this.field9721.method2241(var3, (byte) 44);
        this.field9721.method2201((byte) -49, 0);
        this.field9721.method2241(this.field9834.field5592, (byte) 44);
        this.field9836 = true;
        this.method747(3914);
        this.method745((byte) 126);
        this.method749(arg1 + 79);
        this.method748(20060);
        var4.method2544(1, -this.field9721.field5349[0], -this.field9721.field5349[1], -this.field9721.field5349[2], 0.0F);
        var4.method2544(2, this.field9721.field5332, this.field9721.field5358, this.field9721.field5324, 1.0F);
        var4.method2544(3, Math.abs(this.field9721.field5349[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIB)V")
    public final void method742(int arg0, int arg1, byte arg2) {
        if (this.field9836) {
            IDirect3DDevice var4 = this.field9832.field9273;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << ((arg1 & 0x38) >> 3)) / 32.0F;
            int var7 = arg0 & 0xFFFF;
            var4.method2543(14, (float) (this.field9721.field5307 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg0 >> 16 & 0x3) / 8.0F;
            var4.method2543(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2544(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2544(5, var8, 0.0F, 0.0F, 0.0F);
        }
        int var9 = 92 / ((arg2 + 38) / 35);
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(I)V")
    public final void method747(int arg0) {
        if (arg0 != 3914) {
            this.field9833 = null;
        }
        if (!this.field9836) {
            return;
        }
        IDirect3DDevice var2 = this.field9832.field9273;
        class274 var3 = this.field9832.method2214(-99);
        class274 var4 = this.field9832.method2273(4);
        var2.method2542(0, var4.method1697(field9831, -57));
        var2.method2542(4, var3.method1709(false, field9831));
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V")
    public final void method749(int arg0) {
        if (arg0 <= 77) {
            this.method750((byte) -8);
        }
        if (this.field9836) {
            IDirect3DDevice var2 = this.field9832.field9273;
            var2.method2542(8, this.field9721.method2240(field9831, 8));
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
    public final void method739(boolean arg0, int arg1) {
        if (arg1 != 7) {
            field9831 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(B)V")
    public final void method750(byte arg0) {
        if (this.field9836) {
            IDirect3DDevice var2 = this.field9832.field9273;
            class274 var3 = this.field9832.method2273(4);
            var2.method2542(0, var3.method1697(field9831, -97));
        }
        if (arg0 != -8) {
            this.method745((byte) -40);
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lega;Lsea;Lst;)V")
    public class690(class662 arg0, class648 arg1, class398 arg2) {
        super(arg0);
        this.field9834 = arg2;
        this.field9832 = arg0;
        if (arg1 != null && this.field9721.field5372 && this.field9721.field5340 && (this.field9832.field9284.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9835 = this.field9832.field9273.method2540(arg1.method3642(80, "environment_mapped_water_v", "dx"));
            this.field9833 = this.field9832.field9273.method2534(arg1.method3642(83, "environment_mapped_water_f", "dx"));
            this.field9837 = this.field9835 != null && this.field9833 != null && this.field9834.method2330((byte) 0);
        } else {
            this.field9837 = false;
            this.field9835 = null;
            this.field9833 = null;
        }
    }
}
