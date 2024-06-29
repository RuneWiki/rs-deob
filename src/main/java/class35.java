import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class35 extends class499 {

    @OriginalMember(owner = "client!rr", name = "r", descriptor = "Ljga;")
    private class135 field388;

    @OriginalMember(owner = "client!rr", name = "t", descriptor = "Lcka;")
    private class248 field390;

    @OriginalMember(owner = "client!rr", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field393;

    @OriginalMember(owner = "client!rr", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field387;

    @OriginalMember(owner = "client!rr", name = "v", descriptor = "Z")
    private boolean field392;

    @OriginalMember(owner = "client!rr", name = "u", descriptor = "[F")
    private static float[] field391 = new float[16];

    @OriginalMember(owner = "client!rr", name = "s", descriptor = "Z")
    private boolean field389;

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "(I)V", line = 4)
    public final void method196(int arg0) {
        if (arg0 != 7) {
            this.method204((byte) -40, -118, 3);
        }
        if (!this.field389) {
            return;
        }
        IDirect3DDevice var2 = this.field390.field3402;
        if (this.field6405.field9183 <= 0) {
            var2.method4176(16, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field6405.field9120;
            float var4 = this.field6405.field9159;
            var2.method4176(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        }
        var2.method4187(0, (float) (this.field6405.field9141 >> 16 & 0xFF) / 255.0F, (float) ((this.field6405.field9141 & 0xFFB1) >> 8) / 255.0F, (float) (this.field6405.field9141 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V", line = 34)
    public final void method197(byte arg0) {
        int var2 = 79 % ((arg0 + 69) / 46);
        if (this.field389) {
            IDirect3DDevice var3 = this.field390.field3402;
            class588 var4 = this.field390.method3743(2);
            var3.method4178(0, var4.method3163(field391, 126));
        }
    }

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V", line = 53)
    public final void method198(byte arg0) {
        int var2 = 22 / ((arg0 + 66) / 36);
        if (this.field389) {
            IDirect3DDevice var3 = this.field390.field3402;
            class588 var4 = this.field6405.method3757(-8);
            var3.SetVertexShaderConstantF(12, var4.method3144(field391, (byte) -121), 2);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V", line = 70)
    public final void method199(int arg0) {
        if (this.field389) {
            IDirect3DDevice var2 = this.field390.field3402;
            class588 var3 = this.field390.method3780(1);
            class588 var4 = this.field390.method3743(2);
            var2.method4178(0, var4.method3163(field391, 125));
            var2.method4178(4, var3.method3156(field391, -27817));
        }
        if (arg0 >= -28) {
            this.method199(101);
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Z)Z", line = 92)
    public final boolean method200(boolean arg0) {
        return arg0 ? this.field392 : true;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V", line = 103)
    public final void method201(int arg0, boolean arg1) {
        if (arg0 != 91) {
            return;
        }
        class445 var3 = this.field6405.method3728(false);
        if (!this.field392 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field390.field3402;
        this.field390.method1619(0, this.field393);
        this.field390.method1613(this.field387, (byte) 37);
        this.field6405.method3712(-14720, 1);
        this.field6405.method3756(10, var3);
        this.field6405.method3712(-14720, 0);
        this.field6405.method3756(10, this.field388.field1790);
        this.field389 = true;
        this.method199(arg0 - 174);
        this.method198((byte) -116);
        this.method203((byte) 13);
        this.method196(7);
        var4.method4187(1, -this.field6405.field9203[0], -this.field6405.field9203[1], -this.field6405.field9203[2], 0.0F);
        var4.method4187(2, this.field6405.field9179, this.field6405.field9188, this.field6405.field9213, 1.0F);
        var4.method4187(3, Math.abs(this.field6405.field9203[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ZZ)V", line = 133)
    public final void method202(boolean arg0, boolean arg1) {
        if (arg1) {
            this.field390 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V", line = 142)
    public final void method203(byte arg0) {
        if (this.field389) {
            IDirect3DDevice var2 = this.field390.field3402;
            var2.method4178(8, this.field6405.method3721((byte) -120, field391));
        }
        if (arg0 != 13) {
            this.field387 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lcka;Lwm;Ljga;)V", line = 162)
    public class35(class248 arg0, class30 arg1, class135 arg2) {
        super(arg0);
        this.field388 = arg2;
        this.field390 = arg0;
        if (arg1 != null && this.field6405.field9125 && this.field6405.field9204 && (this.field390.field3400.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field393 = this.field390.field3402.method4185(arg1.method142(-1, "dx", "environment_mapped_water_v"));
            this.field387 = this.field390.field3402.method4188(arg1.method142(-1, "dx", "environment_mapped_water_f"));
            this.field392 = this.field393 != null && this.field387 != null && this.field388.method784(94);
        } else {
            this.field393 = null;
            this.field392 = false;
            this.field387 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(BII)V", line = 185)
    public final void method204(byte arg0, int arg1, int arg2) {
        if (this.field389) {
            IDirect3DDevice var4 = this.field390.field3402;
            int var5 = 0x1 << (arg2 & 0x3);
            float var6 = (float) (0x1 << ((arg2 & 0x3E) >> 3)) / 32.0F;
            int var7 = arg1 & 0xFFFF;
            var4.method4176(14, (float) (this.field6405.field9192 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) ((arg1 & 0x393A1) >> 16) / 8.0F;
            var4.method4176(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method4187(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method4187(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 < 11) {
            this.field388 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V", line = 213)
    public final void method205(int arg0) {
        if (arg0 != 0) {
            this.method202(true, true);
        }
        if (!this.field389) {
            return;
        }
        this.field390.method1619(arg0, null);
        this.field390.method1613(null, (byte) 37);
        this.field6405.method3712(-14720, 1);
        this.field6405.method3756(10, null);
        this.field6405.method3712(-14720, 0);
        this.field6405.method3756(arg0 + 10, null);
        this.field389 = false;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILsfa;I)V", line = 233)
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg2 != 26917) {
            this.method205(91);
        }
    }
}
