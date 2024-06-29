import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class309 extends class546 {

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lto;")
    private class8 field4845;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Ltj;")
    private class181 field4840;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4841;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field4842;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
    private boolean field4844;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "[F")
    private static float[] field4839 = new float[16];

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "Z")
    private boolean field4843;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)V", line = 5)
    public final void method793(int arg0, boolean arg1) {
        if (arg0 > -39) {
            this.field4842 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V", line = 15)
    public final void method789(int arg0) {
        if (this.field4843) {
            IDirect3DDevice var2 = this.field4845.field131;
            class498 var3 = this.field4845.method2303((byte) 83);
            var2.method2823(0, var3.method3042(field4839, 1));
        }
        if (arg0 < 121) {
            this.method784((byte) 5);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)Z", line = 33)
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            this.field4844 = false;
        }
        return this.field4844;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 43)
    public final void method790(int arg0) {
        if (this.field4843) {
            IDirect3DDevice var2 = this.field4845.field131;
            var2.method2823(8, this.field7937.method2257(field4839, 16711680));
        }
        if (arg0 != -32535) {
            this.method784((byte) 52);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLwq;)V", line = 61)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        if (arg1) {
            this.field4844 = true;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V", line = 72)
    public final void method788(boolean arg0, int arg1) {
        class270 var3 = this.field7937.method2249(-125);
        if (this.field4844 && var3 != null) {
            IDirect3DDevice var4 = this.field4845.field131;
            var4.SetVertexShader(this.field4841);
            var4.SetPixelShader(this.field4842);
            this.field7937.method2244(1, -110);
            this.field7937.method2271(var3, 5180);
            this.field7937.method2244(0, -125);
            this.field7937.method2271(this.field4840.field3039, 5180);
            this.field4843 = true;
            this.method786(90);
            this.method784((byte) -103);
            this.method790(arg1 ^ 0xFFFF80E9);
            this.method795(15759);
            var4.method2827(1, -this.field7937.field5423[0], -this.field7937.field5423[1], -this.field7937.field5423[2], 0.0F);
            var4.method2827(2, this.field7937.field5326, this.field7937.field5383, this.field7937.field5351, 1.0F);
            var4.method2827(3, Math.abs(this.field7937.field5423[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 0) {
            this.method794(121, true, null);
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V", line = 103)
    public final void method783(int arg0) {
        if (arg0 != 255) {
            this.method794(-88, true, null);
        }
        if (!this.field4843) {
            return;
        }
        IDirect3DDevice var2 = this.field4845.field131;
        var2.SetVertexShader(null);
        var2.SetPixelShader(null);
        this.field7937.method2244(1, -79);
        this.field7937.method2271(null, 5180);
        this.field7937.method2244(0, -71);
        this.field7937.method2271(null, 5180);
        this.field4843 = false;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V", line = 126)
    public final void method795(int arg0) {
        if (arg0 != 15759 || !this.field4843) {
            return;
        }
        IDirect3DDevice var2 = this.field4845.field131;
        if (this.field7937.field5340 > 0) {
            float var3 = this.field7937.field5391;
            float var4 = this.field7937.field5380;
            var2.method2818(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method2818(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method2827(0, (float) ((this.field7937.field5411 & 0xFF8C6E) >> 16) / 255.0F, (float) ((this.field7937.field5411 & 0xFF35) >> 8) / 255.0F, (float) (this.field7937.field5411 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V", line = 154)
    public final void method784(byte arg0) {
        if (arg0 != -103) {
            this.field4840 = null;
        }
        if (this.field4843) {
            IDirect3DDevice var2 = this.field4845.field131;
            class498 var3 = this.field7937.method2234(6);
            var2.SetVertexShaderConstantF(12, var3.method3037(field4839, 41), 2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(III)V", line = 176)
    public final void method785(int arg0, int arg1, int arg2) {
        if (this.field4843) {
            IDirect3DDevice var4 = this.field4845.field131;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << ((arg1 & 0x3A) >> 3)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x300D7) >> 16) / 8.0F;
            var4.method2818(14, (float) (this.field7937.field5327 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2818(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2827(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2827(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != 8) {
            field4839 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lto;Lri;Ltj;)V", line = 203)
    public class309(class8 arg0, class97 arg1, class181 arg2) {
        super(arg0);
        this.field4845 = arg0;
        this.field4840 = arg2;
        if (arg1 != null && this.field7937.field5409 && this.field7937.field5416 && (this.field4845.field135.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4841 = this.field4845.field131.method2828(arg1.method923("dx", -25124, "environment_mapped_water_v"));
            this.field4842 = this.field4845.field131.method2825(arg1.method923("dx", -25124, "environment_mapped_water_f"));
            this.field4844 = this.field4841 != null && this.field4842 != null && this.field4840.method1481((byte) 112);
        } else {
            this.field4841 = null;
            this.field4842 = null;
            this.field4844 = false;
        }
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V", line = 226)
    public final void method786(int arg0) {
        if (this.field4843) {
            IDirect3DDevice var2 = this.field4845.field131;
            class498 var3 = this.field4845.method2298(82);
            class498 var4 = this.field4845.method2303((byte) 112);
            var2.method2823(0, var4.method3042(field4839, 1));
            var2.method2823(4, var3.method3032(field4839, -6209));
        }
        if (arg0 < 27) {
            this.field4842 = null;
        }
    }
}
