import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class638 extends class429 {

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lnc;")
    private class227 field8999;

    @OriginalMember(owner = "client!sr", name = "s", descriptor = "Llj;")
    private class8 field9004;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9000;

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field9001;

    @OriginalMember(owner = "client!sr", name = "q", descriptor = "Z")
    private boolean field9002;

    @OriginalMember(owner = "client!sr", name = "r", descriptor = "[F")
    private static float[] field9003 = new float[16];

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "Z")
    private boolean field8998;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V", line = 4)
    public final void method47(byte arg0) {
        if (this.field8998) {
            this.field9004.method67(null, 28);
            this.field9004.method128((byte) -37, null);
            this.field5939.method959(1, -123);
            this.field5939.method988(1, null);
            this.field5939.method959(0, -57);
            this.field5939.method988(1, null);
            this.field8998 = false;
        }
        int var2 = 117 / ((-arg0 - 56) / 48);
    }

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)V", line = 24)
    public final void method1095(int arg0) {
        if (this.field8998) {
            IDirect3DDevice var2 = this.field9004.field100;
            var2.method4182(8, this.field5939.method1011(-22482, field9003));
        }
        if (arg0 < 22) {
            this.method47((byte) 101);
        }
    }

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)V", line = 42)
    public final void method1101(int arg0) {
        if (this.field8998) {
            IDirect3DDevice var2 = this.field9004.field100;
            if (this.field5939.field1942 > 0) {
                float var3 = this.field5939.field1866;
                float var4 = this.field5939.field1919;
                var2.method4174(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method4174(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method4186(0, (float) (this.field5939.field1936 >> 16 & 0xFF) / 255.0F, (float) (this.field5939.field1936 >> 8 & 0xFF) / 255.0F, (float) (this.field5939.field1936 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 1) {
            this.method47((byte) -93);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 70)
    public final void method46(int arg0, int arg1, int arg2) {
        if (arg0 != 37) {
            this.field9002 = false;
        }
        if (!this.field8998) {
            return;
        }
        IDirect3DDevice var4 = this.field9004.field100;
        int var5 = 0x1 << (arg2 & 0x3);
        float var6 = (float) (0x1 << (arg2 >> 3 & 0x7)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method4174(14, (float) (this.field5939.field1928 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
        var4.method4174(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method4186(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method4186(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Llj;Lgga;Lnc;)V", line = 98)
    public class638(class8 arg0, class513 arg1, class227 arg2) {
        super(arg0);
        this.field8999 = arg2;
        this.field9004 = arg0;
        if (arg1 != null && this.field5939.field1894 && this.field5939.field1891 && (this.field9004.field104.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9000 = this.field9004.field100.method4175(arg1.method3017(0, "environment_mapped_water_v", "dx"));
            this.field9001 = this.field9004.field100.method4185(arg1.method3017(0, "environment_mapped_water_f", "dx"));
            this.field9002 = this.field9000 != null && this.field9001 != null && this.field8999.method1542(-79);
        } else {
            this.field9000 = null;
            this.field9002 = false;
            this.field9001 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 122)
    public final void method1098(int arg0) {
        if (this.field8998) {
            IDirect3DDevice var2 = this.field9004.field100;
            class742 var3 = this.field9004.method945(1);
            class742 var4 = this.field9004.method1018(122);
            var2.method4182(0, var4.method4082(arg0 + 64, field9003));
            var2.method4182(4, var3.method4096(field9003, (byte) 118));
        }
        if (arg0 != 0) {
            this.field8998 = false;
        }
    }

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "(I)V", line = 144)
    public final void method1097(int arg0) {
        if (arg0 < -41 && this.field8998) {
            IDirect3DDevice var2 = this.field9004.field100;
            class742 var3 = this.field5939.method1003(-76);
            var2.SetVertexShaderConstantF(12, var3.method4081(73, field9003), 2);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Z", line = 164)
    public final boolean method48(byte arg0) {
        if (arg0 != -128) {
            this.field8999 = null;
        }
        return this.field9002;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZZ)V", line = 175)
    public final void method44(boolean arg0, boolean arg1) {
        class540 var3 = this.field5939.method1020(512);
        if (this.field9002 && var3 != null) {
            IDirect3DDevice var4 = this.field9004.field100;
            this.field9004.method67(this.field9000, 28);
            this.field9004.method128((byte) -37, this.field9001);
            this.field5939.method959(1, -10);
            this.field5939.method988(1, var3);
            this.field5939.method959(0, 124);
            this.field5939.method988(1, this.field8999.field3300);
            this.field8998 = true;
            this.method1098(0);
            this.method1097(-121);
            this.method1095(69);
            this.method1101(1);
            var4.method4186(1, -this.field5939.field1940[0], -this.field5939.field1940[1], -this.field5939.field1940[2], 0.0F);
            var4.method4186(2, this.field5939.field1912, this.field5939.field1883, this.field5939.field1882, 1.0F);
            var4.method4186(3, Math.abs(this.field5939.field1940[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1) {
            this.method1095(-44);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZ)V", line = 205)
    public final void method43(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field8998 = true;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Len;ZI)V", line = 214)
    public final void method45(class408 arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1099(75);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 223)
    public final void method1099(int arg0) {
        if (arg0 != 37) {
            this.method45(null, false, -110);
        }
        if (this.field8998) {
            IDirect3DDevice var2 = this.field9004.field100;
            class742 var3 = this.field9004.method1018(93);
            var2.method4182(0, var3.method4082(-124, field9003));
        }
    }
}
