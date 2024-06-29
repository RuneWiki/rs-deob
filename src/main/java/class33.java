import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 extends class266 {

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Lvg;")
    private class49 field393;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field386;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field394;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field385;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field392;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Z")
    private boolean field387;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "[F")
    private static float[] field389 = new float[4];

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "[F")
    private static float[] field388 = new float[16];

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field391;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "Z")
    private boolean field390;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(IZ)V", line = 4)
    public final void method144(int arg0, boolean arg1) {
        if (arg0 != 1) {
            this.field391 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 13)
    public final void method145(byte arg0) {
        if (arg0 >= 65 && this.field391 != null) {
            IDirect3DDevice var2 = this.field393.field720;
            class367 var3 = this.field3785.method3171(-19068);
            var2.SetVertexShaderConstantF(8, var3.method2155(field388, -102), 2);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 35)
    public final void method146(byte arg0) {
        if (this.field391 != null) {
            IDirect3DDevice var2 = this.field393.field720;
            var2.method2549(4, this.field3785.method3230(field388, (byte) 102));
        }
        if (arg0 >= -102) {
            this.method155(true);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 53)
    public final void method147(int arg0) {
        IDirect3DDevice var2 = this.field393.field720;
        int var3 = this.field3785.method3180(false);
        class367 var4 = this.field3785.method3206(1);
        IDirect3DVertexShader var5;
        if (this.field390) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field394 : this.field392;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field386 : this.field385;
        }
        if (this.field391 != var5) {
            this.field391 = var5;
            var2.SetVertexShader(var5);
            this.method149(115);
            this.method146((byte) -121);
            this.method145((byte) 114);
            this.method152(0);
            this.method153(-123);
            this.method151(-43);
        }
        var4.method2150(-1.0F, field389, (float) arg0, 0.0F, (float) var3, (byte) 127);
        var2.method2549(12, field389);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IZ)V", line = 87)
    public final void method148(int arg0, boolean arg1) {
        if (arg0 == 0) {
            this.field390 = arg1;
        }
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 98)
    private final void method149(int arg0) {
        if (this.field391 != null && this.field390) {
            class367 var2 = this.field3785.method3206(1);
            IDirect3DDevice var3 = this.field393.field720;
            var3.method2545(13, this.field3785.field8039 * this.field3785.field7996, this.field3785.field8052 * this.field3785.field8039, this.field3785.field8069 * this.field3785.field8039, 1.0F);
            var3.method2545(14, this.field3785.field8025 * this.field3785.field7996, this.field3785.field8052 * this.field3785.field8025, this.field3785.field8069 * this.field3785.field8025, 1.0F);
            var3.method2545(16, this.field3785.field8047 * this.field3785.field7996, this.field3785.field8052 * this.field3785.field8047, this.field3785.field8069 * this.field3785.field8047, 1.0F);
            var2.method2146(3, field389, this.field3785.field8070[2], this.field3785.field8070[1], this.field3785.field8070[0]);
            var3.SetVertexShaderConstantF(15, field389, 1);
            var2.method2146(3, field389, this.field3785.field8024[2], this.field3785.field8024[1], this.field3785.field8024[0]);
            var3.SetVertexShaderConstantF(15, field389, 1);
        }
        if (arg0 <= 114) {
            this.method148(-68, false);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lek;IB)V", line = 124)
    public final void method150(class467 arg0, int arg1, byte arg2) {
        this.field3785.method3232(false, arg0);
        if (arg2 >= -56) {
            field389 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 134)
    public final void method151(int arg0) {
        if (this.field391 != null) {
            IDirect3DDevice var2 = this.field393.field720;
            int var3 = this.field3785.method474();
            int var4 = this.field3785.method451();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2545(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2545(11, 1.0F / (float) this.field3785.method3241(0), (float) this.field3785.method3247(-15077) / 255.0F, 0.0F, 0.0F);
        }
        if (arg0 >= -1) {
            this.field394 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 160)
    public final void method152(int arg0) {
        if (arg0 != 0) {
            this.method146((byte) -48);
        }
        if (this.field391 != null) {
            IDirect3DDevice var2 = this.field393.field720;
            class367 var3 = this.field393.method3196(-123);
            var2.method2549(0, var3.method2142((byte) 124, field388));
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 180)
    public final void method153(int arg0) {
        if (arg0 >= -93) {
            this.method149(114);
        }
        if (this.field391 != null) {
            IDirect3DDevice var2 = this.field393.field720;
            class367 var3 = this.field393.method3196(5);
            var2.method2549(0, var3.method2142((byte) 125, field388));
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)Z", line = 199)
    public final boolean method154(int arg0) {
        return arg0 <= 101 ? false : this.field387;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 209)
    public final void method155(boolean arg0) {
        if (arg0) {
            this.field394 = null;
        }
        if (this.field391 != null) {
            this.field393.field720.SetVertexShader(null);
            this.field391 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 230)
    public final void method156(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.method151(124);
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lvg;Lpj;)V", line = 241)
    public class33(class49 arg0, class132 arg1) {
        super(arg0);
        this.field393 = arg0;
        if ((this.field393.field723.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field386 = this.field393.field720.method2548(arg1.method937("uw_ground_unlit", "dx", 0));
            this.field394 = this.field393.field720.method2548(arg1.method937("uw_ground_lit", "dx", 0));
            this.field385 = this.field393.field720.method2548(arg1.method937("uw_model_unlit", "dx", 0));
            this.field392 = this.field393.field720.method2548(arg1.method937("uw_model_lit", "dx", 0));
            this.field387 = this.field385 != null & this.field394 != null & this.field386 != null & this.field392 != null;
        } else {
            this.field387 = false;
        }
    }
}
