import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class267 extends class155 {

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "Laia;")
    private class242 field3749;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "Luw;")
    private class440 field3753;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3752;

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field3750;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Z")
    private boolean field3751;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "[F")
    private static float[] field3755 = new float[16];

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "Z")
    private boolean field3754;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Z", line = 5)
    public final boolean method250(int arg0) {
        int var2 = 63 % ((-arg0 - 8) / 41);
        return this.field3751;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIB)V", line = 13)
    public final void method254(int arg0, int arg1, byte arg2) {
        if (this.field3754) {
            IDirect3DDevice var4 = this.field3749.field3462;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
            int var7 = arg1 & 0xFFFF;
            var4.method2927(14, (float) (this.field2533.field7757 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
            var4.method2927(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2925(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2925(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg2 != -92) {
            this.method256(114);
        }
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Laia;Lgj;Luw;)V", line = 39)
    public class267(class242 arg0, class662 arg1, class440 arg2) {
        super(arg0);
        this.field3749 = arg0;
        this.field3753 = arg2;
        if (arg1 != null && this.field2533.field7745 && this.field2533.field7724 && (this.field3749.field3449.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3752 = this.field3749.field3462.method2929(arg1.method3726(-86, "dx", "environment_mapped_water_v"));
            this.field3750 = this.field3749.field3462.method2926(arg1.method3726(-110, "dx", "environment_mapped_water_f"));
            this.field3751 = this.field3752 != null && this.field3750 != null && this.field3753.method2561(14864);
        } else {
            this.field3750 = null;
            this.field3751 = false;
            this.field3752 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lbr;II)V", line = 63)
    public final void method259(class416 arg0, int arg1, int arg2) {
        if (arg1 > -71) {
            this.field3749 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 73)
    public final void method256(int arg0) {
        if (this.field3754) {
            IDirect3DDevice var2 = this.field3749.field3462;
            class421 var3 = this.field2533.method3152(8);
            var2.SetVertexShaderConstantF(12, var3.method2479(-24175, field3755), 2);
        }
        if (arg0 >= -19) {
            this.field3751 = false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V", line = 92)
    public final void method258(int arg0, boolean arg1) {
        if (arg0 != 205) {
            this.method253(-88);
        }
        class158 var3 = this.field2533.method3097(0);
        if (!this.field3751 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field3749.field3462;
        this.field3749.method1620(this.field3752, (byte) 73);
        this.field3749.method1615((byte) 123, this.field3750);
        this.field2533.method3114(1, false);
        this.field2533.method3090(var3, (byte) 100);
        this.field2533.method3114(0, false);
        this.field2533.method3090(this.field3753.field5975, (byte) 64);
        this.field3754 = true;
        this.method253(155);
        this.method256(-91);
        this.method252(155);
        this.method251((byte) 108);
        var4.method2925(1, -this.field2533.field7726[0], -this.field2533.field7726[1], -this.field2533.field7726[2], 0.0F);
        var4.method2925(2, this.field2533.field7700, this.field2533.field7692, this.field2533.field7715, 1.0F);
        var4.method2925(3, Math.abs(this.field2533.field7726[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 125)
    public final void method251(byte arg0) {
        if (arg0 < 87 || !this.field3754) {
            return;
        }
        IDirect3DDevice var2 = this.field3749.field3462;
        if (this.field2533.field7740 > 0) {
            float var3 = this.field2533.field7722;
            float var4 = this.field2533.field7702;
            var2.method2927(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method2927(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method2925(0, (float) ((this.field2533.field7716 & 0xFF959D) >> 16) / 255.0F, (float) (this.field2533.field7716 >> 8 & 0xFF) / 255.0F, (float) (this.field2533.field7716 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V", line = 152)
    public final void method253(int arg0) {
        if (arg0 != 155) {
            this.method257(true, true);
        }
        if (!this.field3754) {
            return;
        }
        IDirect3DDevice var2 = this.field3749.field3462;
        class421 var3 = this.field3749.method3094((byte) -111);
        class421 var4 = this.field3749.method3091(true);
        var2.method2918(0, var4.method2495(field3755, (byte) -37));
        var2.method2918(4, var3.method2483(32371, field3755));
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V", line = 173)
    public final void method257(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field3754 = true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V", line = 182)
    public final void method260(int arg0) {
        if (arg0 == 110 && this.field3754) {
            IDirect3DDevice var2 = this.field3749.field3462;
            class421 var3 = this.field3749.method3091(true);
            var2.method2918(0, var3.method2495(field3755, (byte) -37));
        }
    }

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)V", line = 201)
    public final void method255(int arg0) {
        if (arg0 >= -119) {
            this.field3749 = null;
        }
        if (!this.field3754) {
            return;
        }
        this.field3749.method1620(null, (byte) 73);
        this.field3749.method1615((byte) 126, null);
        this.field2533.method3114(1, false);
        this.field2533.method3090(null, (byte) -77);
        this.field2533.method3114(0, false);
        this.field2533.method3090(null, (byte) 125);
        this.field3754 = false;
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V", line = 222)
    public final void method252(int arg0) {
        if (this.field3754) {
            IDirect3DDevice var2 = this.field3749.field3462;
            var2.method2918(8, this.field2533.method3100(field3755, 18895));
        }
        if (arg0 != 155) {
            this.method252(125);
        }
    }
}
