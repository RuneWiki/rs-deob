import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class292 extends class92 {

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "Lde;")
    private class15 field4222;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "Z")
    private boolean field4214;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4220;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4219;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4221;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4215;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "[F")
    private static float[] field4213 = new float[16];

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "[F")
    private static float[] field4218 = new float[4];

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4217;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Z")
    private boolean field4216;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 7)
    public final void method812(byte arg0) {
        if (arg0 != -31) {
            this.method673(74);
        }
        if (this.field4217 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4222.field182;
        int var3 = this.field1635.method531();
        int var4 = this.field1635.method537();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2422(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2422(11, 1.0F / (float) this.field1635.method3611(60), (float) this.field1635.method3610(1) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)V", line = 33)
    public final void method675(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.method1843(-94);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z", line = 42)
    public final boolean method673(int arg0) {
        return arg0 == -1 ? this.field4214 : true;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V", line = 52)
    public final void method820(byte arg0) {
        if (this.field4217 != null) {
            IDirect3DDevice var2 = this.field4222.field182;
            class516 var3 = this.field4222.method3644(-122);
            var2.method2426(0, var3.method2892(22746, field4213));
        }
        if (arg0 > -122) {
            this.method669((byte) 71);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lde;Lgp;)V", line = 70)
    public class292(class15 arg0, class561 arg1) {
        super(arg0);
        this.field4222 = arg0;
        if ((this.field4222.field157.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4214 = false;
        } else {
            this.field4220 = this.field4222.field182.method2423(arg1.method3193(-14855, "dx", "uw_ground_unlit"));
            this.field4219 = this.field4222.field182.method2423(arg1.method3193(-14855, "dx", "uw_ground_lit"));
            this.field4221 = this.field4222.field182.method2423(arg1.method3193(-14855, "dx", "uw_model_unlit"));
            this.field4215 = this.field4222.field182.method2423(arg1.method3193(-14855, "dx", "uw_model_lit"));
            this.field4214 = this.field4215 != null & this.field4220 != null & this.field4219 != null & this.field4221 != null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)V", line = 98)
    public final void method821(int arg0) {
        IDirect3DDevice var2 = this.field4222.field182;
        int var3 = this.field1635.method3599((byte) -115);
        class516 var4 = this.field1635.method3609(112);
        IDirect3DVertexShader var5;
        if (this.field4216) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4219 : this.field4215;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field4220 : this.field4221;
        }
        if (this.field4217 != var5) {
            this.field4217 = var5;
            var2.SetVertexShader(var5);
            this.method1843(arg0 + 51);
            this.method814(2);
            this.method816(arg0 ^ 0x0);
            this.method820((byte) -127);
            this.method817(arg0 ^ 0xFFFFFFB2);
            this.method812((byte) -31);
        }
        if (arg0 == 1) {
            var4.method2912((float) var3, (byte) -105, -1.0F, 0.0F, field4218, 0.0F);
            var2.method2426(12, field4218);
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 135)
    public final void method814(int arg0) {
        if (this.field4217 != null) {
            IDirect3DDevice var2 = this.field4222.field182;
            var2.method2426(4, this.field1635.method3592((byte) 108, field4213));
        }
        if (arg0 != 2) {
            this.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)V", line = 153)
    public final void method671(boolean arg0, byte arg1) {
        if (arg1 != 107) {
            this.field4219 = null;
        }
        this.field4216 = arg0;
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 163)
    private final void method1843(int arg0) {
        if (arg0 < 46 || this.field4217 == null || !this.field4216) {
            return;
        }
        class516 var2 = this.field1635.method3609(113);
        IDirect3DDevice var3 = this.field4222.field182;
        var3.method2422(13, this.field1635.field9141 * this.field1635.field9115, this.field1635.field9141 * this.field1635.field9132, this.field1635.field9141 * this.field1635.field9080, 1.0F);
        var3.method2422(14, this.field1635.field9121 * this.field1635.field9115, this.field1635.field9132 * this.field1635.field9121, this.field1635.field9121 * this.field1635.field9080, 1.0F);
        var3.method2422(16, this.field1635.field9117 * this.field1635.field9115, this.field1635.field9132 * this.field1635.field9117, this.field1635.field9117 * this.field1635.field9080, 1.0F);
        var2.method2891(field4218, this.field1635.field9069[2], true, this.field1635.field9069[1], this.field1635.field9069[0]);
        var3.SetVertexShaderConstantF(15, field4218, 1);
        var2.method2891(field4218, this.field1635.field9090[2], true, this.field1635.field9090[1], this.field1635.field9090[0]);
        var3.SetVertexShaderConstantF(15, field4218, 1);
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)V", line = 188)
    public final void method817(int arg0) {
        if (this.field4217 != null) {
            IDirect3DDevice var2 = this.field4222.field182;
            class516 var3 = this.field4222.method3644(-124);
            var2.method2426(0, var3.method2892(22746, field4213));
        }
        if (arg0 > -66) {
            this.method816(102);
        }
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 206)
    public final void method816(int arg0) {
        if (arg0 == 1 && this.field4217 != null) {
            IDirect3DDevice var2 = this.field4222.field182;
            class516 var3 = this.field1635.method3632(14310);
            var2.SetVertexShaderConstantF(8, var3.method2907(arg0 + 5785, field4213), 2);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V", line = 225)
    public final void method676(boolean arg0, int arg1) {
        if (arg1 > -65) {
            this.field4217 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILqv;)V", line = 234)
    public final void method672(int arg0, int arg1, class96 arg2) {
        this.field1635.method3577(arg2, true);
        if (arg0 != 0) {
            this.field4220 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 250)
    public final void method669(byte arg0) {
        if (this.field4217 != null) {
            this.field4222.field182.SetVertexShader(null);
            this.field4217 = null;
        }
        if (arg0 < 55) {
            this.method817(-86);
        }
    }
}
