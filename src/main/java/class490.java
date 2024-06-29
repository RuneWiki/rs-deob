import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class490 extends class521 {

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lhg;")
    private class591 field6844;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "Z")
    private boolean field6839;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6843;

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6838;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6845;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6840;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "[F")
    private static float[] field6842 = new float[16];

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "[F")
    private static float[] field6841 = new float[4];

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6847;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
    private boolean field6846;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILhv;I)V")
    public final void method446(int arg0, class440 arg1, int arg2) {
        if (arg2 != 26440) {
            field6841 = null;
        }
        this.field7319.method2459(118, arg1);
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
    public final void method447(int arg0) {
        if (arg0 == 15 && this.field6847 != null) {
            IDirect3DDevice var2 = this.field6844.field8586;
            class335 var3 = this.field7319.method2466(0);
            var2.SetVertexShaderConstantF(8, var3.method1891(field6842, 26319), 2);
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(Z)V")
    public final void method635(boolean arg0) {
        if (!arg0) {
            this.field6843 = null;
        }
        if (this.field6847 != null) {
            IDirect3DDevice var2 = this.field6844.field8586;
            class335 var3 = this.field6844.method2404(!arg0);
            var2.method2331(0, var3.method1876(82, field6842));
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BZ)V")
    public final void method454(byte arg0, boolean arg1) {
        this.field6846 = arg1;
        if (arg0 != 21) {
            this.method634(41);
        }
    }

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)V")
    public final void method634(int arg0) {
        if (this.field6847 != null) {
            IDirect3DDevice var2 = this.field6844.field8586;
            var2.method2331(4, this.field7319.method2464(field6842, (byte) -87));
        }
        if (arg0 != 72) {
            this.method452(13);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
    public final void method449(int arg0, boolean arg1) {
        if (arg0 != 256) {
            this.field6843 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lhg;Ldn;)V")
    public class490(class591 arg0, class438 arg1) {
        super(arg0);
        this.field6844 = arg0;
        if ((this.field6844.field8571.VertexShaderVersion & 0xFFFF) < 257) {
            this.field6839 = false;
        } else {
            this.field6843 = this.field6844.field8586.method2323(arg1.method2570((byte) 89, "uw_ground_unlit", "dx"));
            this.field6838 = this.field6844.field8586.method2323(arg1.method2570((byte) 62, "uw_ground_lit", "dx"));
            this.field6845 = this.field6844.field8586.method2323(arg1.method2570((byte) 21, "uw_model_unlit", "dx"));
            this.field6840 = this.field6844.field8586.method2323(arg1.method2570((byte) 67, "uw_model_lit", "dx"));
            this.field6839 = this.field6845 != null & this.field6843 != null & this.field6838 != null & this.field6840 != null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public final void method636(int arg0) {
        if (arg0 != 256) {
            this.method449(-22, true);
        }
        if (this.field6847 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6844.field8586;
        int var3 = this.field7319.method1129();
        int var4 = this.field7319.method1175();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2324(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2324(11, 1.0F / (float) this.field7319.method2460(-112), (float) this.field7319.method2469(false) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)V")
    private final void method2832(int arg0) {
        if (arg0 != 256 || this.field6847 == null || !this.field6846) {
            return;
        }
        class335 var2 = this.field7319.method2450(1);
        IDirect3DDevice var3 = this.field6844.field8586;
        var3.method2324(13, this.field7319.field5774 * this.field7319.field5747, this.field7319.field5790 * this.field7319.field5774, this.field7319.field5774 * this.field7319.field5729, 1.0F);
        var3.method2324(14, this.field7319.field5747 * this.field7319.field5746, this.field7319.field5790 * this.field7319.field5746, this.field7319.field5746 * this.field7319.field5729, 1.0F);
        var3.method2324(16, this.field7319.field5747 * this.field7319.field5702, this.field7319.field5790 * this.field7319.field5702, this.field7319.field5729 * this.field7319.field5702, 1.0F);
        var2.method1883(this.field7319.field5745[2], this.field7319.field5745[1], (byte) 25, this.field7319.field5745[0], field6841);
        var3.SetVertexShaderConstantF(15, field6841, 1);
        var2.method1883(this.field7319.field5786[2], this.field7319.field5786[1], (byte) 25, this.field7319.field5786[0], field6841);
        var3.SetVertexShaderConstantF(15, field6841, 1);
    }

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(I)V")
    public final void method2833(int arg0) {
        IDirect3DDevice var2 = this.field6844.field8586;
        int var3 = this.field7319.method2476((byte) 58);
        class335 var4 = this.field7319.method2450(1);
        IDirect3DVertexShader var5;
        if (this.field6846) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6838 : this.field6840;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6843 : this.field6845;
        }
        if (this.field6847 != var5) {
            this.field6847 = var5;
            var2.SetVertexShader(var5);
            this.method2832(256);
            this.method634(72);
            this.method447(15);
            this.method635(true);
            this.method633((byte) -44);
            this.method636(256);
        }
        int var6 = -12 % ((arg0 - 87) / 38);
        var4.method1879((byte) 127, -1.0F, 0.0F, 0.0F, (float) var3, field6841);
        var2.method2331(12, field6841);
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)Z")
    public final boolean method452(int arg0) {
        if (arg0 < 49) {
            this.method448(true);
        }
        return this.field6839;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public final void method455(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.method449(49, true);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        if (arg0) {
            this.field6843 = null;
        }
        if (this.field6847 != null) {
            this.field6844.field8586.SetVertexShader(null);
            this.field6847 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public final void method633(byte arg0) {
        if (arg0 != -44) {
            this.field6840 = null;
        }
        if (this.field6847 != null) {
            IDirect3DDevice var2 = this.field6844.field8586;
            class335 var3 = this.field6844.method2404(false);
            var2.method2331(0, var3.method1876(125, field6842));
        }
    }
}
