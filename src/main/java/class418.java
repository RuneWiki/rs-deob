import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class418 extends class719 {

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lgaa;")
    private class314 field6016;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Luda;")
    private class475 field6012;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6013;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field6017;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "Z")
    private boolean field6014;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "[F")
    private static float[] field6015 = new float[16];

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Z")
    private boolean field6011;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 7)
    public final void method1337(byte arg0) {
        int var2 = 118 / ((73 - arg0) / 40);
        if (this.field6011) {
            IDirect3DDevice var3 = this.field6012.field6676;
            class532 var4 = this.field6012.method3841(-7153);
            var3.method2969(0, var4.method3091(field6015, true));
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V", line = 25)
    public final void method219(int arg0, int arg1, int arg2) {
        if (this.field6011) {
            IDirect3DDevice var4 = this.field6012.field6676;
            int var5 = 0x1 << (arg2 & 0x3);
            float var6 = (float) (0x1 << ((arg2 & 0x3B) >> 3)) / 32.0F;
            int var7 = arg0 & 0xFFFF;
            var4.method2960(14, (float) (this.field9776.field9602 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg0 >> 16 & 0x3) / 8.0F;
            var4.method2960(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2966(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2966(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 0) {
            this.method1337((byte) 80);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 53)
    public final void method714(int arg0) {
        if (this.field6011) {
            IDirect3DDevice var2 = this.field6012.field6676;
            class532 var3 = this.field9776.method3855(arg0 - 9332);
            var2.SetVertexShaderConstantF(12, var3.method3089(field6015, arg0 ^ 0xFFFF9CCC), 2);
        }
        if (arg0 != -22274) {
            this.method1335(60);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZ)V", line = 71)
    public final void method222(int arg0, boolean arg1) {
        if (arg0 >= -126) {
            return;
        }
        class165 var3 = this.field9776.method3865(0);
        if (!this.field6014 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field6012.field6676;
        this.field6012.method2782((byte) -104, this.field6013);
        this.field6012.method2822(this.field6017, 3);
        this.field9776.method3886(59, 1);
        this.field9776.method3882(0, var3);
        this.field9776.method3886(118, 0);
        this.field9776.method3882(0, this.field6016.field4427);
        this.field6011 = true;
        this.method1336(256);
        this.method714(-22274);
        this.method1335(116);
        this.method673(-23970);
        var4.method2966(1, -this.field9776.field9558[0], -this.field9776.field9558[1], -this.field9776.field9558[2], 0.0F);
        var4.method2966(2, this.field9776.field9540, this.field9776.field9581, this.field9776.field9532, 1.0F);
        var4.method2966(3, Math.abs(this.field9776.field9558[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "(I)V", line = 103)
    public final void method220(int arg0) {
        if (this.field6011) {
            this.field6012.method2782((byte) -104, null);
            this.field6012.method2822(null, 3);
            this.field9776.method3886(46, 1);
            this.field9776.method3882(0, null);
            this.field9776.method3886(34, 0);
            this.field9776.method3882(0, null);
            this.field6011 = false;
        }
        if (arg0 != 23363) {
            this.method673(54);
        }
    }

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "(I)V", line = 125)
    public final void method1335(int arg0) {
        if (arg0 < 110) {
            this.method221(false, null, -119);
        }
        if (this.field6011) {
            IDirect3DDevice var2 = this.field6012.field6676;
            var2.method2969(8, this.field9776.method3910((byte) -117, field6015));
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZZ)V", line = 145)
    public final void method225(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.field6013 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 154)
    public final void method1336(int arg0) {
        if (arg0 != 256 || !this.field6011) {
            return;
        }
        IDirect3DDevice var2 = this.field6012.field6676;
        class532 var3 = this.field6012.method3868(1);
        class532 var4 = this.field6012.method3841(-7153);
        var2.method2969(0, var4.method3091(field6015, true));
        var2.method2969(4, var3.method3088(113, field6015));
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V", line = 175)
    public final void method673(int arg0) {
        if (this.field6011) {
            IDirect3DDevice var2 = this.field6012.field6676;
            if (this.field9776.field9569 > 0) {
                float var3 = this.field9776.field9518;
                float var4 = this.field9776.field9556;
                var2.method2960(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method2960(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method2966(0, (float) ((this.field9776.field9515 & 0xFFD54B) >> 16) / 255.0F, (float) (this.field9776.field9515 >> 8 & 0xFF) / 255.0F, (float) (this.field9776.field9515 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != -23970) {
            this.method218((byte) -117);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)Z", line = 203)
    public final boolean method218(byte arg0) {
        if (arg0 <= 16) {
            this.method673(3);
        }
        return this.field6014;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLb;I)V", line = 213)
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        if (!arg0) {
            this.field6012 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Luda;Luq;Lgaa;)V", line = 221)
    public class418(class475 arg0, class172 arg1, class314 arg2) {
        super(arg0);
        this.field6016 = arg2;
        this.field6012 = arg0;
        if (arg1 != null && this.field9776.field9596 && this.field9776.field9578 && (this.field6012.field6663.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6013 = this.field6012.field6676.method2974(arg1.method1189("environment_mapped_water_v", 0, "dx"));
            this.field6017 = this.field6012.field6676.method2957(arg1.method1189("environment_mapped_water_f", 0, "dx"));
            this.field6014 = this.field6013 != null && this.field6017 != null && this.field6016.method2012(false);
        } else {
            this.field6017 = null;
            this.field6014 = false;
            this.field6013 = null;
        }
    }
}
