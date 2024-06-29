import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class262 extends class213 {

    @OriginalMember(owner = "client!on", name = "n", descriptor = "Lui;")
    private class130 field3608;

    @OriginalMember(owner = "client!on", name = "s", descriptor = "Z")
    private boolean field3613;

    @OriginalMember(owner = "client!on", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3612;

    @OriginalMember(owner = "client!on", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3610;

    @OriginalMember(owner = "client!on", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3615;

    @OriginalMember(owner = "client!on", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3614;

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[F")
    private static float[] field3609 = new float[4];

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[F")
    private static float[] field3607 = new float[16];

    @OriginalMember(owner = "client!on", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3606;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "Z")
    private boolean field3611;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IILaw;)V", line = 6)
    public final void method19(int arg0, int arg1, class619 arg2) {
        this.field2766.method1884(arg2, -2);
        if (arg1 != 8) {
            this.method20(110);
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(B)Z", line = 16)
    public final boolean method22(byte arg0) {
        if (arg0 != 75) {
            this.field3614 = null;
        }
        return this.field3613;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 26)
    public final void method873(int arg0) {
        if (this.field3606 != null) {
            IDirect3DDevice var2 = this.field3608.field1657;
            var2.method3784(4, this.field2766.method2015(false, field3607));
        }
        if (arg0 >= -95) {
            this.field3612 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V", line = 43)
    public final void method872(byte arg0) {
        if (arg0 < -122 && this.field3606 != null) {
            IDirect3DDevice var2 = this.field3608.field1657;
            class492 var3 = this.field3608.method1906(3);
            var2.method3784(0, var3.method2767((byte) 104, field3607));
        }
    }

    @OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V", line = 62)
    private final void method1637(int arg0) {
        if (this.field3606 != null && this.field3611) {
            class492 var2 = this.field2766.method1966(false);
            IDirect3DDevice var3 = this.field3608.field1657;
            var3.method3787(13, this.field2766.field4475 * this.field2766.field4458, this.field2766.field4475 * this.field2766.field4414, this.field2766.field4475 * this.field2766.field4419, 1.0F);
            var3.method3787(14, this.field2766.field4458 * this.field2766.field4399, this.field2766.field4414 * this.field2766.field4399, this.field2766.field4419 * this.field2766.field4399, 1.0F);
            var3.method3787(16, this.field2766.field4458 * this.field2766.field4432, this.field2766.field4432 * this.field2766.field4414, this.field2766.field4432 * this.field2766.field4419, 1.0F);
            var2.method2778(this.field2766.field4443[1], this.field2766.field4443[2], (byte) 14, field3609, this.field2766.field4443[0]);
            var3.SetVertexShaderConstantF(15, field3609, 1);
            var2.method2778(this.field2766.field4470[1], this.field2766.field4470[2], (byte) -109, field3609, this.field2766.field4470[0]);
            var3.SetVertexShaderConstantF(15, field3609, 1);
        }
        if (arg0 != -18) {
            this.field3613 = true;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(ZI)V", line = 86)
    public final void method17(boolean arg0, int arg1) {
        this.field3611 = arg0;
        if (arg1 < 37) {
            this.field3611 = false;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V", line = 96)
    public final void method871(byte arg0) {
        if (this.field3606 != null) {
            IDirect3DDevice var2 = this.field3608.field1657;
            class492 var3 = this.field2766.method2013(0);
            var2.SetVertexShaderConstantF(8, var3.method2780(field3607, 0), 2);
        }
        int var4 = 48 / ((arg0 - 38) / 46);
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lui;Lpq;)V", line = 114)
    public class262(class130 arg0, class159 arg1) {
        super(arg0);
        this.field3608 = arg0;
        if ((this.field3608.field1647.VertexShaderVersion & 0xFFFF) < 257) {
            this.field3613 = false;
        } else {
            this.field3612 = this.field3608.field1657.method3792(arg1.method1063("dx", "uw_ground_unlit", 68));
            this.field3610 = this.field3608.field1657.method3792(arg1.method1063("dx", "uw_ground_lit", 82));
            this.field3615 = this.field3608.field1657.method3792(arg1.method1063("dx", "uw_model_unlit", -63));
            this.field3614 = this.field3608.field1657.method3792(arg1.method1063("dx", "uw_model_lit", 107));
            this.field3613 = this.field3614 != null & this.field3612 != null & this.field3610 != null & this.field3615 != null;
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 134)
    public final void method870(int arg0) {
        if (this.field3606 != null) {
            IDirect3DDevice var2 = this.field3608.field1657;
            class492 var3 = this.field3608.method1906(3);
            var2.method3784(0, var3.method2767((byte) 87, field3607));
        }
        if (arg0 != 8) {
            this.method23(false, -121);
        }
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V", line = 160)
    public final void method1326(byte arg0) {
        IDirect3DDevice var2 = this.field3608.field1657;
        int var3 = this.field2766.method1934(9059);
        class492 var4 = this.field2766.method1966(false);
        IDirect3DVertexShader var5;
        if (this.field3611) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field3610 : this.field3614;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field3612 : this.field3615;
        }
        if (this.field3606 != var5) {
            this.field3606 = var5;
            var2.SetVertexShader(var5);
            this.method1637(-18);
            this.method873(-102);
            this.method871((byte) 84);
            this.method870(8);
            this.method872((byte) -127);
            this.method874(false);
        }
        var4.method2783(34, -1.0F, field3609, (float) var3, 0.0F, 0.0F);
        var2.method3784(12, field3609);
        if (arg0 < 72) {
            this.method870(100);
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V", line = 197)
    public final void method20(int arg0) {
        if (arg0 >= 32 && this.field3606 != null) {
            this.field3608.field1657.SetVertexShader(null);
            this.field3606 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(III)V", line = 213)
    public final void method28(int arg0, int arg1, int arg2) {
        if (arg0 != -16595) {
            field3609 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V", line = 227)
    public final void method874(boolean arg0) {
        if (arg0 || this.field3606 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field3608.field1657;
        int var3 = this.field2766.method1924();
        int var4 = this.field2766.method1990();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method3787(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method3787(11, 1.0F / (float) this.field2766.method1971(5), (float) this.field2766.method2012(!arg0) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(ZI)V", line = 255)
    public final void method23(boolean arg0, int arg1) {
        if (arg1 != -18) {
            this.method873(-109);
        }
    }
}
