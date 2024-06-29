import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class566 extends class719 {

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "Z")
    private boolean field7745 = false;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Luda;")
    private class475 field7742;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7743;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7748;

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7750;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7749;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "Z")
    private boolean field7752;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Lfk;")
    private class678 field7747;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[F")
    private static float[] field7741 = new float[4];

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "[F")
    private static float[] field7751 = new float[16];

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7746;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "Z")
    private boolean field7744;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)V")
    public final void method673(int arg0) {
        if (arg0 != -23970 || this.field7746 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7742.field6676;
        int var3 = this.field9776.method469();
        int var4 = this.field9776.method507();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2960(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2960(11, 1.0F / (float) this.field9776.method3839(110), (float) this.field9776.method3890(13) / 255.0F, this.field9776.field9518, 1.0F / (this.field9776.field9518 - this.field9776.field9556));
        this.field9776.method3838(this.field9776.method3850(arg0 ^ 0x5DF3), Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method219(-10, -91, 17);
        }
    }

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
    public final void method672(int arg0) {
        IDirect3DDevice var2 = this.field7742.field6676;
        int var3 = this.field9776.method3908(104);
        if (arg0 >= -35) {
            this.method221(true, null, 21);
        }
        class532 var4 = this.field9776.method3868(1);
        IDirect3DVertexShader var5;
        if (this.field7744) {
            var5 = var3 == Integer.MAX_VALUE ? this.field7748 : this.field7749;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field7743 : this.field7750;
        }
        if (this.field7746 != var5) {
            this.field7746 = var5;
            this.field7742.method2782((byte) -104, var5);
            this.method3221((byte) -116);
            this.method1335(126);
            this.method714(-22274);
            this.method1337((byte) 27);
            this.method1336(256);
            this.method673(-23970);
        }
        var4.method3095(field7741, -1.0F, (float) var3, 0.0F, 0.0F, (byte) 108);
        var2.method2969(12, field7741);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method1336(int arg0) {
        if (this.field7746 != null) {
            IDirect3DDevice var2 = this.field7742.field6676;
            class532 var3 = this.field7742.method3841(-7153);
            var2.method2969(0, var3.method3091(field7751, true));
        }
        if (arg0 != 256) {
            this.method714(26);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public final void method1337(byte arg0) {
        if (this.field7746 != null) {
            IDirect3DDevice var2 = this.field7742.field6676;
            class532 var3 = this.field7742.method3841(-7153);
            var2.method2969(0, var3.method3091(field7751, true));
        }
        int var4 = 8 % ((arg0 - 73) / 40);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        this.field7744 = arg1;
        this.field9776.method3886(41, 1);
        this.field9776.method3882(0, this.field7747);
        this.field9776.method3911(22228, class117.field1574, class328.field4644);
        this.field9776.method3859(117, 0, class64.field840);
        this.field9776.method2812(2, false, class790.field10851, true, 0);
        this.field9776.method3867((byte) 18, class417.field6010, 0);
        this.field9776.method3886(125, 0);
        this.method672(-56);
        if (arg0 > -126) {
            this.field7747 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public final void method714(int arg0) {
        if (this.field7746 != null) {
            IDirect3DDevice var2 = this.field7742.field6676;
            class532 var3 = this.field9776.method3855(arg0 - 9332);
            var2.SetVertexShaderConstantF(8, var3.method3089(field7751, 13362), 2);
        }
        if (arg0 != -22274) {
            this.field7752 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method673(43);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        if (!arg0) {
            this.field7747 = null;
        }
        if (arg1 != null) {
            if (this.field7745) {
                this.field9776.method3859(117, 0, class790.field10851);
                this.field9776.method3867((byte) 18, class790.field10851, 0);
                this.field7745 = false;
            }
            this.field9776.method3882(0, arg1);
            this.field9776.method3871(0, arg2);
        } else if (!this.field7745) {
            this.field9776.method3882(0, this.field9776.field9539);
            this.field9776.method3871(0, 1);
            this.field9776.method3859(123, 0, class417.field6010);
            this.field9776.method3867((byte) 18, class417.field6010, 0);
            this.field7745 = true;
        }
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final void method1335(int arg0) {
        if (this.field7746 != null) {
            IDirect3DDevice var2 = this.field7742.field6676;
            var2.method2969(4, this.field9776.method3910((byte) -105, field7751));
        }
        if (arg0 < 110) {
            this.field7746 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        this.field9776.method3886(120, 1);
        this.field9776.method3882(0, null);
        if (arg0 != 23363) {
            return;
        }
        this.field9776.method3911(22228, class291.field4152, class291.field4152);
        this.field9776.method3859(arg0 - 23243, 0, class790.field10851);
        this.field9776.method3859(119, 2, class64.field840);
        this.field9776.method3867((byte) 18, class790.field10851, 0);
        this.field9776.method3886(34, 0);
        if (this.field7745) {
            this.field9776.method3859(119, 0, class790.field10851);
            this.field9776.method3867((byte) 18, class790.field10851, 0);
            this.field7745 = false;
        }
        if (this.field7746 != null) {
            this.field7742.method2782((byte) -104, null);
            this.field7746 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V")
    private final void method3221(byte arg0) {
        if (this.field7746 != null && this.field7744) {
            class532 var2 = this.field9776.method3897(0);
            IDirect3DDevice var3 = this.field7742.field6676;
            var3.method2960(13, this.field9776.field9579 * this.field9776.field9540, this.field9776.field9581 * this.field9776.field9579, this.field9776.field9579 * this.field9776.field9532, 1.0F);
            var3.method2960(14, this.field9776.field9607 * this.field9776.field9540, this.field9776.field9607 * this.field9776.field9581, this.field9776.field9607 * this.field9776.field9532, 1.0F);
            var3.method2960(16, this.field9776.field9540 * this.field9776.field9529, this.field9776.field9581 * this.field9776.field9529, this.field9776.field9532 * this.field9776.field9529, 1.0F);
            var2.method3084(this.field9776.field9558[1], 288, this.field9776.field9558[2], field7741, this.field9776.field9558[0]);
            var3.SetVertexShaderConstantF(15, field7741, 1);
            var2.method3084(this.field9776.field9564[1], 288, this.field9776.field9564[2], field7741, this.field9776.field9564[0]);
            var3.SetVertexShaderConstantF(17, field7741, 1);
        }
        int var4 = -69 % ((-arg0 - 2) / 44);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Luda;Luq;)V")
    public class566(class475 arg0, class172 arg1) {
        super(arg0);
        this.field7742 = arg0;
        if (arg1 == null || (this.field7742.field6663.VertexShaderVersion & 0xFFFF) < 257) {
            this.field7752 = false;
        } else {
            this.field7743 = this.field7742.field6676.method2974(arg1.method1189("uw_ground_unlit", 0, "dx"));
            this.field7748 = this.field7742.field6676.method2974(arg1.method1189("uw_ground_lit", 0, "dx"));
            this.field7750 = this.field7742.field6676.method2974(arg1.method1189("uw_model_unlit", 0, "dx"));
            this.field7749 = this.field7742.field6676.method2974(arg1.method1189("uw_model_lit", 0, "dx"));
            if ((this.field7749 != null & this.field7748 != null & this.field7743 != null & this.field7750 != null)) {
                this.field7747 = this.field9776.method3856(false, 1, 2, new int[] { 0, -1 }, false);
                this.field7747.method622(true, false, false);
                this.field7752 = true;
            } else {
                this.field7752 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        if (arg0 <= 16) {
            this.field7750 = null;
        }
        return this.field7752;
    }
}
