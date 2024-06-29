import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class606 extends class55 {

    @OriginalMember(owner = "client!ou", name = "o", descriptor = "Ltn;")
    private class88 field8422;

    @OriginalMember(owner = "client!ou", name = "p", descriptor = "Lul;")
    private class574 field8423;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8421;

    @OriginalMember(owner = "client!ou", name = "r", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field8425;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Z")
    private boolean field8419;

    @OriginalMember(owner = "client!ou", name = "q", descriptor = "[F")
    private static float[] field8424 = new float[16];

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
    private boolean field8420;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "(I)Z", line = 6)
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            this.method407(18);
        }
        return this.field8419;
    }

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "(I)V", line = 18)
    public final void method406(int arg0) {
        if (arg0 == 1 && this.field8420) {
            IDirect3DDevice var2 = this.field8423.field8080;
            class477 var3 = this.field759.method2406(false);
            var2.SetVertexShaderConstantF(12, var3.method2743(91, field8424), 2);
        }
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 37)
    public final void method404(int arg0) {
        if (arg0 <= 20) {
            this.field8422 = null;
        }
        if (this.field8420) {
            IDirect3DDevice var2 = this.field8423.field8080;
            var2.method2867(8, this.field759.method2432(-23481, field8424));
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIZ)V", line = 55)
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field8421 = null;
        }
        if (!this.field8420) {
            return;
        }
        IDirect3DDevice var4 = this.field8423.field8080;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x3C) >> 3)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method2869(14, (float) (this.field759.field5633 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
        var4.method2869(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2871(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2871(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "(I)V", line = 83)
    public final void method407(int arg0) {
        if (arg0 <= 21) {
            this.method197(true, (byte) 107);
        }
        if (!this.field8420) {
            return;
        }
        IDirect3DDevice var2 = this.field8423.field8080;
        class477 var3 = this.field8423.method2383((byte) 89);
        class477 var4 = this.field8423.method2429(11);
        var2.method2867(0, var4.method2731(field8424, (byte) -115));
        var2.method2867(4, var3.method2746(field8424, -2888));
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(Lul;Lnd;Ltn;)V", line = 104)
    public class606(class574 arg0, class547 arg1, class88 arg2) {
        super(arg0);
        this.field8422 = arg2;
        this.field8423 = arg0;
        if (arg1 != null && this.field759.field5591 && this.field759.field5646 && (this.field8423.field8059.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8421 = this.field8423.field8080.method2868(arg1.method3158("dx", (byte) 97, "environment_mapped_water_v"));
            this.field8425 = this.field8423.field8080.method2877(arg1.method3158("dx", (byte) 127, "environment_mapped_water_f"));
            this.field8419 = this.field8421 != null && this.field8425 != null && this.field8422.method723(true);
        } else {
            this.field8419 = false;
            this.field8425 = null;
            this.field8421 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IILfe;)V", line = 127)
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 < 30) {
            field8424 = null;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IZ)V", line = 137)
    public final void method196(int arg0, boolean arg1) {
        class418 var3 = this.field759.method2370((byte) 62);
        if (this.field8419 && var3 != null) {
            IDirect3DDevice var4 = this.field8423.field8080;
            this.field8423.method3293(87, this.field8421);
            this.field8423.method3287(-122, this.field8425);
            this.field759.method2393(1, (byte) -127);
            this.field759.method2396(arg0 + 22352, var3);
            this.field759.method2393(0, (byte) 77);
            this.field759.method2396(22357, this.field8422.field1226);
            this.field8420 = true;
            this.method407(85);
            this.method406(1);
            this.method404(52);
            this.method403((byte) 119);
            var4.method2871(1, -this.field759.field5596[0], -this.field759.field5596[1], -this.field759.field5596[2], 0.0F);
            var4.method2871(2, this.field759.field5620, this.field759.field5656, this.field759.field5600, 1.0F);
            var4.method2871(3, Math.abs(this.field759.field5596[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != 5) {
            this.field8420 = true;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 167)
    public final void method402(int arg0) {
        if (this.field8420) {
            IDirect3DDevice var2 = this.field8423.field8080;
            class477 var3 = this.field8423.method2429(arg0 ^ 0xFFFFFFF6);
            var2.method2867(0, var3.method2731(field8424, (byte) -115));
        }
        if (arg0 != -3) {
            this.method406(30);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)V", line = 186)
    public final void method201(boolean arg0) {
        if (this.field8420) {
            this.field8423.method3293(87, null);
            this.field8423.method3287(-118, null);
            this.field759.method2393(1, (byte) 94);
            this.field759.method2396(22357, null);
            this.field759.method2393(0, (byte) 24);
            this.field759.method2396(22357, null);
            this.field8420 = false;
        }
        if (!arg0) {
            this.method406(-8);
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(ZB)V", line = 208)
    public final void method197(boolean arg0, byte arg1) {
        int var3 = 68 % ((-arg1 - 61) / 44);
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(B)V", line = 215)
    public final void method403(byte arg0) {
        if (arg0 != 119) {
            this.field8419 = false;
        }
        if (!this.field8420) {
            return;
        }
        IDirect3DDevice var2 = this.field8423.field8080;
        if (this.field759.field5599 > 0) {
            float var3 = this.field759.field5607;
            float var4 = this.field759.field5598;
            var2.method2869(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method2869(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method2871(0, (float) ((this.field759.field5644 & 0xFF4C44) >> 16) / 255.0F, (float) (this.field759.field5644 >> 8 & 0xFF) / 255.0F, (float) (this.field759.field5644 & 0xFF) / 255.0F, 0.0F);
    }
}
