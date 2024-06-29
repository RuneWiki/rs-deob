import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class61 extends class509 {

    @OriginalMember(owner = "client!nv", name = "t", descriptor = "Lnca;")
    private class54 field715;

    @OriginalMember(owner = "client!nv", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field720;

    @OriginalMember(owner = "client!nv", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field716;

    @OriginalMember(owner = "client!nv", name = "z", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field721;

    @OriginalMember(owner = "client!nv", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field713;

    @OriginalMember(owner = "client!nv", name = "q", descriptor = "Z")
    private boolean field712;

    @OriginalMember(owner = "client!nv", name = "w", descriptor = "[F")
    private static float[] field718 = new float[4];

    @OriginalMember(owner = "client!nv", name = "s", descriptor = "[F")
    private static float[] field714 = new float[16];

    @OriginalMember(owner = "client!nv", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field719;

    @OriginalMember(owner = "client!nv", name = "v", descriptor = "Z")
    private boolean field717;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        if (this.field719 != null) {
            IDirect3DDevice var2 = this.field715.field676;
            class124 var3 = this.field7558.method1113(70);
            var2.SetVertexShaderConstantF(8, var3.method755(field714, arg0 ^ 0xFFFFC02F), 2);
        }
        if (arg0 != -48) {
            this.method39(12, true);
        }
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V")
    public final void method382(int arg0) {
        if (arg0 > 69 && this.field719 != null) {
            IDirect3DDevice var2 = this.field715.field676;
            class124 var3 = this.field715.method1140((byte) 124);
            var2.method2395(0, var3.method761(field714, (byte) -94));
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBI)V")
    public final void method43(int arg0, byte arg1, int arg2) {
        if (arg1 != -60) {
            this.method42(false, -41, null);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            this.field721 = null;
        }
        if (this.field719 != null) {
            this.field715.field676.SetVertexShader(null);
            this.field719 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "(I)V")
    private final void method383(int arg0) {
        if (this.field719 != null && this.field717) {
            class124 var2 = this.field7558.method1132(1);
            IDirect3DDevice var3 = this.field715.field676;
            var3.method2393(13, this.field7558.field2555 * this.field7558.field2550, this.field7558.field2565 * this.field7558.field2555, this.field7558.field2581 * this.field7558.field2555, 1.0F);
            var3.method2393(14, this.field7558.field2616 * this.field7558.field2550, this.field7558.field2616 * this.field7558.field2565, this.field7558.field2616 * this.field7558.field2581, 1.0F);
            var3.method2393(16, this.field7558.field2568 * this.field7558.field2550, this.field7558.field2568 * this.field7558.field2565, this.field7558.field2581 * this.field7558.field2568, 1.0F);
            var2.method762(this.field7558.field2603[0], (byte) 124, this.field7558.field2603[2], field718, this.field7558.field2603[1]);
            var3.SetVertexShaderConstantF(15, field718, 1);
            var2.method762(this.field7558.field2538[0], (byte) 124, this.field7558.field2538[2], field718, this.field7558.field2538[1]);
            var3.SetVertexShaderConstantF(15, field718, 1);
        }
        if (arg0 != 1) {
            field718 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(Lnca;Ldda;)V")
    public class61(class54 arg0, class597 arg1) {
        super(arg0);
        this.field715 = arg0;
        if ((this.field715.field664.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field720 = this.field715.field676.method2396(arg1.method3466("uw_ground_unlit", 0, "dx"));
            this.field716 = this.field715.field676.method2396(arg1.method3466("uw_ground_lit", 0, "dx"));
            this.field721 = this.field715.field676.method2396(arg1.method3466("uw_model_unlit", 0, "dx"));
            this.field713 = this.field715.field676.method2396(arg1.method3466("uw_model_lit", 0, "dx"));
            this.field712 = this.field713 != null & this.field721 != null & this.field716 != null & this.field720 != null;
        } else {
            this.field712 = false;
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 < 44) {
            this.method35(true, (byte) 79);
        }
        return this.field712;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZILmn;)V")
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        this.field7558.method1152(arg2, arg0);
        if (!arg0) {
            this.field712 = true;
        }
    }

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "(I)V")
    public final void method384(int arg0) {
        if (this.field719 != null) {
            IDirect3DDevice var2 = this.field715.field676;
            var2.method2395(4, this.field7558.method1134(-67, field714));
        }
        if (arg0 != -1) {
            this.field713 = null;
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IZ)V")
    public final void method39(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method381((byte) 103);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(ZB)V")
    public final void method35(boolean arg0, byte arg1) {
        this.field717 = arg0;
        int var3 = -40 % ((40 - arg1) / 36);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(Z)V")
    public final void method36(boolean arg0) {
        IDirect3DDevice var2 = this.field715.field676;
        int var3 = this.field7558.method1131(-91);
        class124 var4 = this.field7558.method1132(1);
        IDirect3DVertexShader var5;
        if (this.field717) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field716 : this.field713;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field720 : this.field721;
        }
        if (arg0) {
            return;
        }
        if (this.field719 != var5) {
            this.field719 = var5;
            var2.SetVertexShader(var5);
            this.method383(1);
            this.method384(-1);
            this.method381((byte) -48);
            this.method382(102);
            this.method385((byte) 81);
            this.method41(-90);
        }
        var4.method765(field718, -1.0F, 15, (float) var3, 0.0F, 0.0F);
        var2.method2395(12, field718);
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (arg0 >= -88) {
            field718 = null;
        }
        if (this.field719 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field715.field676;
        int var3 = this.field7558.method960();
        int var4 = this.field7558.method1018();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2393(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2393(11, 1.0F / (float) this.field7558.method1156((byte) 116), (float) this.field7558.method1116((byte) -124) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(B)V")
    public final void method385(byte arg0) {
        if (arg0 < 76) {
            this.method43(-59, (byte) 74, 21);
        }
        if (this.field719 != null) {
            IDirect3DDevice var2 = this.field715.field676;
            class124 var3 = this.field715.method1140((byte) 97);
            var2.method2395(0, var3.method761(field714, (byte) -101));
        }
    }
}
