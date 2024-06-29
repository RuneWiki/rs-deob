import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class501 extends class252 {

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Luk;")
    private class234 field7090;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "Ltb;")
    private class364 field7091;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7087;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field7092;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Z")
    private boolean field7089;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "[F")
    private static float[] field7088 = new float[16];

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Z")
    private boolean field7093;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            field7088 = null;
        }
        return this.field7089;
    }

    @OriginalMember(owner = "client!j", name = "g", descriptor = "(I)V")
    public final void method1691(int arg0) {
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            if (this.field3884.field5651 <= 0) {
                var2.method2645(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field3884.field5644;
                float var4 = this.field3884.field5735;
                var2.method2645(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2642(0, (float) ((this.field3884.field5718 & 0xFFB2B4) >> 16) / 255.0F, (float) ((this.field3884.field5718 & 0xFF35) >> 8) / 255.0F, (float) (this.field3884.field5718 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 0) {
            this.method791(false, 30);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public final void method1690(int arg0) {
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            class21 var3 = this.field3884.method2350((byte) 94);
            var2.SetVertexShaderConstantF(12, var3.method264(field7088, 3), 2);
        }
        if (arg0 != -1) {
            this.method788(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ltb;Lpu;Luk;)V")
    public class501(class364 arg0, class522 arg1, class234 arg2) {
        super(arg0);
        this.field7090 = arg2;
        this.field7091 = arg0;
        if (arg1 != null && this.field3884.field5701 && this.field3884.field5713 && (this.field7091.field5210.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7087 = this.field7091.field5204.method2644(arg1.method3009("environment_mapped_water_v", "dx", 0));
            this.field7092 = this.field7091.field5204.method2658(arg1.method3009("environment_mapped_water_f", "dx", 0));
            this.field7089 = this.field7087 != null && this.field7092 != null && this.field7090.method1601((byte) -125);
        } else {
            this.field7087 = null;
            this.field7089 = false;
            this.field7092 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public final void method1689(int arg0) {
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            var2.method2654(8, this.field3884.method2367((byte) 1, field7088));
        }
        if (arg0 != 1) {
            this.field7091 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.method788(false);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)V")
    public final void method1684(byte arg0) {
        if (arg0 != 65) {
            this.method1690(110);
        }
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            class21 var3 = this.field7091.method2349(arg0 ^ 0xFFFFFFB9);
            var2.method2654(0, var3.method243((byte) 120, field7088));
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V")
    public final void method1681(byte arg0) {
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            class21 var3 = this.field7091.method2382(arg0 + 20);
            class21 var4 = this.field7091.method2349(-8);
            var2.method2654(0, var4.method243((byte) 103, field7088));
            var2.method2654(4, var3.method241(16383, field7088));
        }
        if (arg0 != -19) {
            this.method794(true, -98);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        if (this.field7093) {
            IDirect3DDevice var4 = this.field7091.field5204;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
            int var7 = arg0 & 0xFFFF;
            var4.method2645(14, (float) (this.field3884.field5688 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg0 >> 16 & 0x3) / 8.0F;
            var4.method2645(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2642(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2642(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg2 >= -105) {
            this.method794(true, 53);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.field7091 = null;
        }
        class45 var3 = this.field3884.method2353(1);
        if (!this.field7089 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field7091.field5204;
        var4.SetVertexShader(this.field7087);
        var4.SetPixelShader(this.field7092);
        this.field3884.method2351(0, 1);
        this.field3884.method2337(false, var3);
        this.field3884.method2351(0, 0);
        this.field3884.method2337(false, this.field7090.field3629);
        this.field7093 = true;
        this.method1681((byte) -19);
        this.method1690(arg1);
        this.method1689(1);
        this.method1691(0);
        var4.method2642(1, -this.field3884.field5635[0], -this.field3884.field5635[1], -this.field3884.field5635[2], 0.0F);
        var4.method2642(2, this.field3884.field5650, this.field3884.field5690, this.field3884.field5717, 1.0F);
        var4.method2642(3, Math.abs(this.field3884.field5635[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        if (this.field7093) {
            IDirect3DDevice var2 = this.field7091.field5204;
            var2.SetVertexShader(null);
            var2.SetPixelShader(null);
            this.field3884.method2351(0, 1);
            this.field3884.method2337(false, null);
            this.field3884.method2351(0, 0);
            this.field3884.method2337(false, null);
            this.field7093 = false;
        }
        if (!arg0) {
            field7088 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method1689(81);
        }
    }
}
