import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class399 extends class139 {

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "Ltga;")
    private class54 field5073;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "Z")
    private boolean field5070;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5065;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5071;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5066;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5064;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "[F")
    private static float[] field5068 = new float[16];

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "[F")
    private static float[] field5067 = new float[4];

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5069;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "Z")
    private boolean field5072;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (this.field5069 != null) {
            IDirect3DDevice var2 = this.field5073.field696;
            class581 var3 = this.field1681.method1346((byte) -97);
            var2.SetVertexShaderConstantF(8, var3.method3224(field5068, 98), 2);
        }
        int var4 = 127 / ((-arg0 - 72) / 54);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (this.field5069 != null) {
            this.field5073.field696.SetVertexShader(null);
            this.field5069 = null;
        }
        if (arg0 >= -4) {
            this.field5069 = null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "<init>", descriptor = "(Ltga;Lpfa;)V")
    public class399(class54 arg0, class275 arg1) {
        super(arg0);
        this.field5073 = arg0;
        if ((this.field5073.field693.VertexShaderVersion & 0xFFFF) < 257) {
            this.field5070 = false;
        } else {
            this.field5065 = this.field5073.field696.method2474(arg1.method1649(-1, "uw_ground_unlit", "dx"));
            this.field5071 = this.field5073.field696.method2474(arg1.method1649(-1, "uw_ground_lit", "dx"));
            this.field5066 = this.field5073.field696.method2474(arg1.method1649(-1, "uw_model_unlit", "dx"));
            this.field5064 = this.field5073.field696.method2474(arg1.method1649(-1, "uw_model_lit", "dx"));
            this.field5070 = this.field5064 != null & this.field5065 != null & this.field5071 != null & this.field5066 != null;
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BILgl;)V")
    public final void method150(byte arg0, int arg1, class562 arg2) {
        if (arg0 > 103) {
            this.field1681.method1349(arg2, false);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(B)V")
    public final void method882(byte arg0) {
        if (arg0 != -91) {
            this.method150((byte) 50, -113, null);
        }
        if (this.field5069 != null) {
            IDirect3DDevice var2 = this.field5073.field696;
            var2.method2472(4, this.field1681.method1320(field5068, (byte) 124));
        }
    }

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "(I)V")
    public final void method885(int arg0) {
        if (this.field5069 != null) {
            IDirect3DDevice var2 = this.field5073.field696;
            class581 var3 = this.field5073.method1338((byte) 104);
            var2.method2472(0, var3.method3220(field5068, (byte) -119));
        }
        if (arg0 != -2) {
            this.method881(false);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public final void method148(int arg0, int arg1, int arg2) {
        if (arg0 != -2) {
            this.method882((byte) -85);
        }
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(Z)V")
    public final void method881(boolean arg0) {
        if (!arg0) {
            this.field5064 = null;
        }
        if (this.field5069 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5073.field696;
        int var3 = this.field1681.method461();
        int var4 = this.field1681.method423();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2473(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2473(11, 1.0F / (float) this.field1681.method1350((byte) -60), (float) this.field1681.method1308(119) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Z)V")
    public final void method879(boolean arg0) {
        if (this.field5069 != null) {
            IDirect3DDevice var2 = this.field5073.field696;
            class581 var3 = this.field5073.method1338((byte) 41);
            var2.method2472(0, var3.method3220(field5068, (byte) -121));
        }
        if (arg0) {
            this.method150((byte) 25, 70, null);
        }
    }

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "(I)V")
    private final void method2253(int arg0) {
        if (arg0 <= 79) {
            this.field5073 = null;
        }
        if (this.field5069 == null || !this.field5072) {
            return;
        }
        class581 var2 = this.field1681.method1319((byte) -121);
        IDirect3DDevice var3 = this.field5073.field696;
        var3.method2473(13, this.field1681.field2857 * this.field1681.field2815, this.field1681.field2815 * this.field1681.field2796, this.field1681.field2815 * this.field1681.field2790, 1.0F);
        var3.method2473(14, this.field1681.field2857 * this.field1681.field2785, this.field1681.field2796 * this.field1681.field2785, this.field1681.field2790 * this.field1681.field2785, 1.0F);
        var3.method2473(16, this.field1681.field2857 * this.field1681.field2824, this.field1681.field2824 * this.field1681.field2796, this.field1681.field2824 * this.field1681.field2790, 1.0F);
        var2.method3212(this.field1681.field2816[2], false, this.field1681.field2816[1], field5067, this.field1681.field2816[0]);
        var3.SetVertexShaderConstantF(15, field5067, 1);
        var2.method3212(this.field1681.field2850[2], false, this.field1681.field2850[1], field5067, this.field1681.field2850[0]);
        var3.SetVertexShaderConstantF(15, field5067, 1);
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)Z")
    public final boolean method152(int arg0) {
        int var2 = 127 / ((arg0 - 50) / 48);
        return this.field5070;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZI)V")
    public final void method153(boolean arg0, int arg1) {
        if (arg1 != 43) {
            this.method150((byte) -34, 55, null);
        }
        this.field5072 = arg0;
    }

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "(B)V")
    public final void method883(byte arg0) {
        IDirect3DDevice var2 = this.field5073.field696;
        int var3 = 93 / ((arg0 - 5) / 46);
        int var4 = this.field1681.method1277(3);
        class581 var5 = this.field1681.method1319((byte) -121);
        IDirect3DVertexShader var6;
        if (this.field5072) {
            var6 = var4 == Integer.MAX_VALUE ? this.field5071 : this.field5064;
        } else {
            var6 = var4 == Integer.MAX_VALUE ? this.field5065 : this.field5066;
        }
        if (this.field5069 != var6) {
            this.field5069 = var6;
            var2.SetVertexShader(var6);
            this.method2253(84);
            this.method882((byte) -91);
            this.method884(-128);
            this.method879(false);
            this.method885(-2);
            this.method881(true);
        }
        var5.method3216((float) var4, 0.0F, -1.0F, field5067, 0.0F, (byte) 85);
        var2.method2472(12, field5067);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(IZ)V")
    public final void method151(int arg0, boolean arg1) {
        if (arg0 != 43) {
            this.method884(-71);
        }
    }
}
