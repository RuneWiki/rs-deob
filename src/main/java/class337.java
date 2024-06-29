import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class337 extends class669 {

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "Lss;")
    private class401 field4673;

    @OriginalMember(owner = "client!uv", name = "p", descriptor = "Z")
    private boolean field4670;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4676;

    @OriginalMember(owner = "client!uv", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4668;

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4672;

    @OriginalMember(owner = "client!uv", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4669;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "[F")
    private static float[] field4674 = new float[16];

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "[F")
    private static float[] field4675 = new float[4];

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4671;

    @OriginalMember(owner = "client!uv", name = "m", descriptor = "Z")
    private boolean field4667;

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        return arg0 == 9567 ? this.field4670 : true;
    }

    @OriginalMember(owner = "client!uv", name = "f", descriptor = "(I)V")
    public final void method2049(int arg0) {
        if (this.field4671 != null) {
            IDirect3DDevice var2 = this.field4673.field5342;
            class74 var3 = this.field4673.method871(arg0 - 6177);
            var2.method2571(0, var3.method566(field4674, 9));
        }
        if (arg0 != -292) {
            this.field4673 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IILnq;)V")
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 != -21254) {
            this.field4671 = null;
        }
        this.field9490.method897(arg2, true);
    }

    @OriginalMember(owner = "client!uv", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        if (this.field4671 != null) {
            this.field4673.field5342.SetVertexShader(null);
            this.field4671 = null;
        }
        if (arg0 != -21106) {
            this.field4671 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
    public final void method1974(boolean arg0) {
        if (this.field4671 != null) {
            IDirect3DDevice var2 = this.field4673.field5342;
            int var3 = this.field9490.method411();
            int var4 = this.field9490.method464();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2573(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2573(11, 1.0F / (float) this.field9490.method867(-34), (float) this.field9490.method880((byte) 111) / 255.0F, 0.0F, 0.0F);
        }
        if (!arg0) {
            this.field4667 = true;
        }
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(B)V")
    public final void method1972(byte arg0) {
        IDirect3DDevice var2 = this.field4673.field5342;
        int var3 = 46 % ((arg0 + 74) / 44);
        int var4 = this.field9490.method832((byte) 80);
        class74 var5 = this.field9490.method870((byte) -32);
        IDirect3DVertexShader var6;
        if (this.field4667) {
            var6 = var4 == Integer.MAX_VALUE ? this.field4668 : this.field4669;
        } else {
            var6 = var4 == Integer.MAX_VALUE ? this.field4676 : this.field4672;
        }
        if (this.field4671 != var6) {
            this.field4671 = var6;
            var2.SetVertexShader(var6);
            this.method2051(-90);
            this.method2052((byte) -109);
            this.method1978(-87);
            this.method2050(-110);
            this.method2049(-292);
            this.method1974(true);
        }
        var5.method561(0.0F, 0.0F, (byte) 113, (float) var4, field4675, -1.0F);
        var2.method2571(12, field4675);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        if (arg1 != 9512) {
            this.method1972((byte) -22);
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lss;Lbi;)V")
    public class337(class401 arg0, class449 arg1) {
        super(arg0);
        this.field4673 = arg0;
        if ((this.field4673.field5336.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4670 = false;
        } else {
            this.field4676 = this.field4673.field5342.method2580(arg1.method2532("dx", "uw_ground_unlit", -24518));
            this.field4668 = this.field4673.field5342.method2580(arg1.method2532("dx", "uw_ground_lit", -24518));
            this.field4672 = this.field4673.field5342.method2580(arg1.method2532("dx", "uw_model_unlit", -24518));
            this.field4669 = this.field4673.field5342.method2580(arg1.method2532("dx", "uw_model_lit", -24518));
            this.field4670 = this.field4669 != null & this.field4672 != null & this.field4668 != null & this.field4676 != null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZZ)V")
    public final void method5(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.field4667 = arg0;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)V")
    public final void method1978(int arg0) {
        int var2 = -95 % ((57 - arg0) / 42);
        if (this.field4671 != null) {
            IDirect3DDevice var3 = this.field4673.field5342;
            class74 var4 = this.field9490.method830((byte) 70);
            var3.SetVertexShaderConstantF(8, var4.method553(11368, field4674), 2);
        }
    }

    @OriginalMember(owner = "client!uv", name = "e", descriptor = "(I)V")
    public final void method2050(int arg0) {
        if (this.field4671 != null) {
            IDirect3DDevice var2 = this.field4673.field5342;
            class74 var3 = this.field4673.method871(-6469);
            var2.method2571(0, var3.method566(field4674, 9));
        }
        int var4 = 92 / ((-arg0 - 58) / 38);
    }

    @OriginalMember(owner = "client!uv", name = "g", descriptor = "(I)V")
    private final void method2051(int arg0) {
        if (this.field4671 != null && this.field4667) {
            class74 var2 = this.field9490.method870((byte) -32);
            IDirect3DDevice var3 = this.field4673.field5342;
            var3.method2573(13, this.field9490.field1870 * this.field9490.field1833, this.field9490.field1860 * this.field9490.field1833, this.field9490.field1861 * this.field9490.field1833, 1.0F);
            var3.method2573(14, this.field9490.field1917 * this.field9490.field1870, this.field9490.field1917 * this.field9490.field1860, this.field9490.field1917 * this.field9490.field1861, 1.0F);
            var3.method2573(16, this.field9490.field1870 * this.field9490.field1865, this.field9490.field1865 * this.field9490.field1860, this.field9490.field1865 * this.field9490.field1861, 1.0F);
            var2.method582(field4675, (byte) 120, this.field9490.field1901[1], this.field9490.field1901[0], this.field9490.field1901[2]);
            var3.SetVertexShaderConstantF(15, field4675, 1);
            var2.method582(field4675, (byte) 119, this.field9490.field1890[1], this.field9490.field1890[0], this.field9490.field1890[2]);
            var3.SetVertexShaderConstantF(15, field4675, 1);
        }
        if (arg0 >= -37) {
            this.field4673 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(BII)V")
    public final void method2(byte arg0, int arg1, int arg2) {
        if (arg0 < 77) {
            this.field4676 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V")
    public final void method2052(byte arg0) {
        if (arg0 < -45 && this.field4671 != null) {
            IDirect3DDevice var2 = this.field4673.field5342;
            var2.method2571(4, this.field9490.method888(field4674, (byte) -94));
        }
    }
}
