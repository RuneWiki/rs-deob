import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class753 extends class188 {

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Lrja;")
    private class115 field10423;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "Llja;")
    private class745 field10422;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10425;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field10421;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "Z")
    private boolean field10424;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "[F")
    private static float[] field10427 = new float[16];

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
    private boolean field10426;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)V", line = 4)
    public final void method1305(byte arg0) {
        if (this.field10426) {
            IDirect3DDevice var2 = this.field10423.field1565;
            if (this.field2510.field8721 > 0) {
                float var3 = this.field2510.field8656;
                float var4 = this.field2510.field8655;
                var2.method2973(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method2973(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method2972(0, (float) ((this.field2510.field8651 & 0xFFFB7A) >> 16) / 255.0F, (float) ((this.field2510.field8651 & 0xFFCF) >> 8) / 255.0F, (float) (this.field2510.field8651 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 > -126) {
            this.field10422 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Z", line = 31)
    public final boolean method956(int arg0) {
        if (arg0 < 53) {
            field10427 = null;
        }
        return this.field10424;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 41)
    public final void method1304(byte arg0) {
        if (arg0 != -56) {
            this.method1308(26);
        }
        if (this.field10426) {
            IDirect3DDevice var2 = this.field10423.field1565;
            class754 var3 = this.field2510.method3452((byte) 13);
            var2.SetVertexShaderConstantF(12, var3.method4201((byte) -121, field10427), 2);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)V", line = 59)
    public final void method962(int arg0, boolean arg1) {
        if (arg0 != 22789) {
            field10427 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V", line = 69)
    public final void method955(byte arg0) {
        if (arg0 < 54) {
            this.field10421 = null;
        }
        if (!this.field10426) {
            return;
        }
        this.field10423.method865(-1, null);
        this.field10423.method866((byte) -122, null);
        this.field2510.method3470((byte) -84, 1);
        this.field2510.method3520(true, null);
        this.field2510.method3470((byte) 123, 0);
        this.field2510.method3520(true, null);
        this.field10426 = false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZI)V", line = 91)
    public final void method961(boolean arg0, int arg1) {
        class149 var3 = this.field2510.method3519(-114);
        if (this.field10424 && var3 != null) {
            IDirect3DDevice var4 = this.field10423.field1565;
            this.field10423.method865(arg1 ^ 0xFFFFFFFD, this.field10425);
            this.field10423.method866((byte) -116, this.field10421);
            this.field2510.method3470((byte) 126, 1);
            this.field2510.method3520(true, var3);
            this.field2510.method3470((byte) 32, 0);
            this.field2510.method3520(true, this.field10422.field10281);
            this.field10426 = true;
            this.method1302((byte) -114);
            this.method1304((byte) -56);
            this.method1308(1);
            this.method1305((byte) -127);
            var4.method2972(1, -this.field2510.field8700[0], -this.field2510.field8700[1], -this.field2510.field8700[2], 0.0F);
            var4.method2972(2, this.field2510.field8658, this.field2510.field8740, this.field2510.field8687, 1.0F);
            var4.method2972(3, Math.abs(this.field2510.field8700[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 2) {
            this.method1302((byte) -107);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IBLbm;)V", line = 124)
    public final void method959(int arg0, byte arg1, class123 arg2) {
        int var4 = -93 % ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lrja;Laj;Llja;)V", line = 131)
    public class753(class115 arg0, class333 arg1, class745 arg2) {
        super(arg0);
        this.field10423 = arg0;
        this.field10422 = arg2;
        if (arg1 != null && this.field2510.field8668 && this.field2510.field8709 && (this.field10423.field1566.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field10425 = this.field10423.field1565.method2974(arg1.method2111("dx", "environment_mapped_water_v", 3));
            this.field10421 = this.field10423.field1565.method2964(arg1.method2111("dx", "environment_mapped_water_f", 3));
            this.field10424 = this.field10425 != null && this.field10421 != null && this.field10422.method4125((byte) -21);
        } else {
            this.field10421 = null;
            this.field10425 = null;
            this.field10424 = false;
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)V", line = 155)
    public final void method1308(int arg0) {
        if (this.field10426) {
            IDirect3DDevice var2 = this.field10423.field1565;
            var2.method2962(8, this.field2510.method3447(arg0 ^ 0xFFFFFFB0, field10427));
        }
        if (arg0 != 1) {
            this.field10426 = true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 172)
    public final void method1302(byte arg0) {
        int var2 = -28 / ((arg0 + 16) / 47);
        if (!this.field10426) {
            return;
        }
        IDirect3DDevice var3 = this.field10423.field1565;
        class754 var4 = this.field10423.method3448(0);
        class754 var5 = this.field10423.method3456(-1690);
        var3.method2962(0, var5.method4200(field10427, (byte) -105));
        var3.method2962(4, var4.method4196((byte) 124, field10427));
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V", line = 192)
    public final void method1307(int arg0) {
        if (arg0 < 70) {
            this.method962(-61, true);
        }
        if (this.field10426) {
            IDirect3DDevice var2 = this.field10423.field1565;
            class754 var3 = this.field10423.method3456(-1690);
            var2.method2962(0, var3.method4200(field10427, (byte) -111));
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZ)V", line = 212)
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.method956(-116);
        }
        if (!this.field10426) {
            return;
        }
        IDirect3DDevice var4 = this.field10423.field1565;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x3E) >> 3)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
        var4.method2973(14, (float) (this.field2510.field8699 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method2973(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2972(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2972(5, var8, 0.0F, 0.0F, 0.0F);
    }
}
