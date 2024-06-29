import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class304 extends class606 {

    @OriginalMember(owner = "client!vw", name = "x", descriptor = "Z")
    private boolean field4269 = false;

    @OriginalMember(owner = "client!vw", name = "y", descriptor = "Ltg;")
    private class229 field4270;

    @OriginalMember(owner = "client!vw", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4265;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4262;

    @OriginalMember(owner = "client!vw", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4267;

    @OriginalMember(owner = "client!vw", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4268;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "Ldh;")
    private class320 field4260;

    @OriginalMember(owner = "client!vw", name = "z", descriptor = "Z")
    private boolean field4271;

    @OriginalMember(owner = "client!vw", name = "u", descriptor = "[F")
    private static float[] field4266 = new float[4];

    @OriginalMember(owner = "client!vw", name = "s", descriptor = "[F")
    private static float[] field4264 = new float[16];

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4261;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "Z")
    private boolean field4263;

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)V", line = 5)
    public final void method521(byte arg0) {
        this.field8525.method1648(1, (byte) 66);
        this.field8525.method1663(null, -2);
        this.field8525.method1613(-30, class502.field7202, class502.field7202);
        this.field8525.method1664((byte) -45, class597.field8397, 0);
        this.field8525.method1664((byte) -102, class679.field9315, 2);
        this.field8525.method1601(class597.field8397, 0, 256);
        this.field8525.method1648(0, (byte) 66);
        if (this.field4269) {
            this.field8525.method1664((byte) -90, class597.field8397, 0);
            this.field8525.method1601(class597.field8397, 0, 256);
            this.field4269 = false;
        }
        int var2 = -41 / ((-arg0 - 26) / 56);
        if (this.field4261 != null) {
            this.field4270.method1471((byte) 72, null);
            this.field4261 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(III)V", line = 34)
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            this.field4265 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V", line = 45)
    public final void method1984(int arg0) {
        if (arg0 != 25411) {
            this.method1984(21);
        }
        if (this.field4261 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4270.field3093;
        int var3 = this.field8525.method434();
        int var4 = this.field8525.method387();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2896(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2896(11, 1.0F / (float) this.field8525.method1651((byte) -126), (float) this.field8525.method1589(arg0 ^ 0xFFFF9C9F) / 255.0F, this.field8525.field3623, 1.0F / (this.field8525.field3623 - this.field8525.field3598));
        this.field8525.method1640(true, this.field8525.method1649(3));
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Z)V", line = 72)
    public final void method1985(boolean arg0) {
        if (this.field4261 != null) {
            IDirect3DDevice var2 = this.field4270.field3093;
            var2.method2884(4, this.field8525.method1657(-20248, field4264));
        }
        if (!arg0) {
            this.method525(-64);
        }
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Ltg;Lfp;)V", line = 88)
    public class304(class229 arg0, class323 arg1) {
        super(arg0);
        this.field4270 = arg0;
        if (arg1 == null || (this.field4270.field3089.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4271 = false;
        } else {
            this.field4265 = this.field4270.field3093.method2886(arg1.method2102("dx", "uw_ground_unlit", 0));
            this.field4262 = this.field4270.field3093.method2886(arg1.method2102("dx", "uw_ground_lit", 0));
            this.field4267 = this.field4270.field3093.method2886(arg1.method2102("dx", "uw_model_unlit", 0));
            this.field4268 = this.field4270.field3093.method2886(arg1.method2102("dx", "uw_model_lit", 0));
            if (this.field4267 != null & this.field4262 != null & this.field4265 != null & this.field4268 != null) {
                this.field4260 = this.field8525.method1650(1, new int[] { 0, -1 }, false, 2, false);
                this.field4260.method1317(28970, false, false);
                this.field4271 = true;
            } else {
                this.field4271 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(B)V", line = 118)
    public final void method1052(byte arg0) {
        if (arg0 != -122) {
            this.field4260 = null;
        }
        if (this.field4261 != null) {
            IDirect3DDevice var2 = this.field4270.field3093;
            class328 var3 = this.field8525.method1658(false);
            var2.SetVertexShaderConstantF(8, var3.method2146((byte) 60, field4264), 2);
        }
    }

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "(I)Z", line = 139)
    public final boolean method525(int arg0) {
        if (arg0 <= 19) {
            this.method517(true, 36);
        }
        return this.field4271;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IZ)V", line = 150)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            this.field4260 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(I)V", line = 159)
    public final void method1986(int arg0) {
        if (arg0 == 64 && this.field4261 != null) {
            IDirect3DDevice var2 = this.field4270.field3093;
            class328 var3 = this.field4270.method1654(-73);
            var2.method2884(0, var3.method2143(arg0 - 161, field4264));
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(ZI)V", line = 178)
    public final void method517(boolean arg0, int arg1) {
        this.field4263 = arg0;
        this.field8525.method1648(1, (byte) 66);
        if (arg1 > -64) {
            this.field4263 = false;
        }
        this.field8525.method1663(this.field4260, -2);
        this.field8525.method1613(-30, class589.field8300, class719.field9987);
        this.field8525.method1664((byte) -124, class679.field9315, 0);
        this.field8525.method1450(false, class597.field8397, 2, true, false);
        this.field8525.method1601(class240.field3203, 0, 256);
        this.field8525.method1648(0, (byte) 66);
        this.method1989(-103);
    }

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "(B)V", line = 201)
    private final void method1987(byte arg0) {
        if (arg0 != 96 || this.field4261 == null || !this.field4263) {
            return;
        }
        class328 var2 = this.field8525.method1631(0);
        IDirect3DDevice var3 = this.field4270.field3093;
        var3.method2896(13, this.field8525.field3617 * this.field8525.field3597, this.field8525.field3604 * this.field8525.field3597, this.field8525.field3624 * this.field8525.field3597, 1.0F);
        var3.method2896(14, this.field8525.field3617 * this.field8525.field3580, this.field8525.field3604 * this.field8525.field3580, this.field8525.field3624 * this.field8525.field3580, 1.0F);
        var3.method2896(16, this.field8525.field3617 * this.field8525.field3579, this.field8525.field3604 * this.field8525.field3579, this.field8525.field3624 * this.field8525.field3579, 1.0F);
        var2.method2133((byte) 69, this.field8525.field3569[2], this.field8525.field3569[0], this.field8525.field3569[1], field4266);
        var3.SetVertexShaderConstantF(15, field4266, 1);
        var2.method2133((byte) 69, this.field8525.field3546[2], this.field8525.field3546[0], this.field8525.field3546[1], field4266);
        var3.SetVertexShaderConstantF(17, field4266, 1);
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(B)V", line = 225)
    public final void method1988(byte arg0) {
        if (arg0 <= -111 && this.field4261 != null) {
            IDirect3DDevice var2 = this.field4270.field3093;
            class328 var3 = this.field4270.method1654(-114);
            var2.method2884(0, var3.method2143(76, field4264));
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)V", line = 246)
    public final void method1989(int arg0) {
        IDirect3DDevice var2 = this.field4270.field3093;
        int var3 = this.field8525.method1591(0);
        if (arg0 > -62) {
            this.field4261 = null;
        }
        class328 var4 = this.field8525.method1619(-50);
        IDirect3DVertexShader var5;
        if (this.field4263) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4262 : this.field4268;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field4265 : this.field4267;
        }
        if (this.field4261 != var5) {
            this.field4261 = var5;
            this.field4270.method1471((byte) 122, var5);
            this.method1987((byte) 96);
            this.method1985(true);
            this.method1052((byte) -122);
            this.method1988((byte) -119);
            this.method1986(64);
            this.method1984(25411);
        }
        var4.method2148((float) var3, 0, 0.0F, -1.0F, 0.0F, field4266);
        var2.method2884(12, field4266);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Lma;II)V", line = 288)
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            if (this.field4269) {
                this.field8525.method1664((byte) -105, class597.field8397, 0);
                this.field8525.method1601(class597.field8397, 0, 256);
                this.field4269 = false;
            }
            this.field8525.method1663(arg0, -2);
            this.field8525.method1628((byte) -24, arg1);
        } else if (!this.field4269) {
            this.field8525.method1663(this.field8525.field3628, arg2 - 5);
            this.field8525.method1628((byte) 11, 1);
            this.field8525.method1664((byte) -114, class240.field3203, 0);
            this.field8525.method1601(class240.field3203, 0, 256);
            this.field4269 = true;
        }
        if (arg2 != 3) {
            this.field4271 = true;
        }
    }
}
