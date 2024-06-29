import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class20 extends class555 {

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "Lhb;")
    private class343 field252;

    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field260;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field250;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field254;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field255;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "Z")
    private boolean field257;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "Lgn;")
    private class691 field256;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[F")
    private static float[] field253 = new float[16];

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "[F")
    private static float[] field251 = new float[4];

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field258;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "Z")
    private boolean field259;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method117(boolean arg0, int arg1) {
        if (arg1 != -13443) {
            this.field254 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V", line = 15)
    public final void method118(boolean arg0) {
        if (this.field258 != null) {
            IDirect3DDevice var2 = this.field252.field4612;
            var2.method2451(4, this.field7580.method3652((byte) -58, field253));
        }
        if (arg0) {
            this.method123((byte) -38);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V", line = 35)
    public final void method119(int arg0) {
        if (this.field258 != null) {
            IDirect3DDevice var2 = this.field252.field4612;
            class149 var3 = this.field252.method3617((byte) -36);
            var2.method2451(0, var3.method858(-106, field253));
        }
        if (arg0 >= -94) {
            this.field252 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 54)
    public final void method120(byte arg0) {
        if (this.field258 != null) {
            IDirect3DDevice var2 = this.field252.field4612;
            int var3 = this.field7580.method1108();
            int var4 = this.field7580.method1054();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2462(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2462(11, 1.0F / (float) this.field7580.method3657((byte) -91), (float) this.field7580.method3655(1) / 255.0F, this.field7580.field9195, 1.0F / (this.field7580.field9195 - this.field7580.field9251));
            this.field7580.method3678(-128, this.field7580.method3677((byte) 34));
        }
        if (arg0 > -118) {
            this.field258 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 82)
    public final void method121(byte arg0) {
        this.field7580.method3635(true, 1);
        this.field7580.method3613((byte) 106, null);
        if (arg0 < 45) {
            this.method117(false, 96);
        }
        this.field7580.method3672((byte) 16, class274.field3642, class274.field3642);
        this.field7580.method3624(class630.field8719, -121, 0);
        this.field7580.method3624(class137.field1869, -123, 2);
        this.field7580.method3666(0, class630.field8719, (byte) -83);
        this.field7580.method3635(true, 0);
        this.field7580.method3624(class630.field8719, -114, 0);
        this.field7580.method3666(0, class630.field8719, (byte) -83);
        if (this.field258 != null) {
            this.field252.field4612.SetVertexShader(null);
            this.field258 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 106)
    public final void method122(int arg0) {
        if (this.field258 != null) {
            IDirect3DDevice var2 = this.field252.field4612;
            class149 var3 = this.field252.method3617((byte) -36);
            var2.method2451(0, var3.method858(-114, field253));
        }
        if (arg0 != 12844) {
            this.method123((byte) -76);
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 127)
    private final void method123(byte arg0) {
        if (arg0 != 0) {
            this.method128(70);
        }
        if (this.field258 == null || !this.field259) {
            return;
        }
        class149 var2 = this.field7580.method3625((byte) 70);
        IDirect3DDevice var3 = this.field252.field4612;
        var3.method2462(13, this.field7580.field9223 * this.field7580.field9183, this.field7580.field9263 * this.field7580.field9223, this.field7580.field9254 * this.field7580.field9223, 1.0F);
        var3.method2462(14, this.field7580.field9244 * this.field7580.field9183, this.field7580.field9263 * this.field7580.field9244, this.field7580.field9254 * this.field7580.field9244, 1.0F);
        var3.method2462(16, this.field7580.field9238 * this.field7580.field9183, this.field7580.field9263 * this.field7580.field9238, this.field7580.field9254 * this.field7580.field9238, 1.0F);
        var2.method870(this.field7580.field9239[1], field251, (byte) 88, this.field7580.field9239[2], this.field7580.field9239[0]);
        var3.SetVertexShaderConstantF(15, field251, 1);
        var2.method870(this.field7580.field9266[1], field251, (byte) 127, this.field7580.field9266[2], this.field7580.field9266[0]);
        var3.SetVertexShaderConstantF(17, field251, 1);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZZ)V", line = 151)
    public final void method124(boolean arg0, boolean arg1) {
        this.field259 = arg1;
        this.field7580.method3635(arg0, 1);
        this.field7580.method3613((byte) 117, this.field256);
        this.field7580.method3672((byte) 100, class298.field3941, class305.field4076);
        this.field7580.method3624(class137.field1869, -117, 0);
        this.field7580.method2011(2, class630.field8719, 12080, false, true);
        this.field7580.method3666(0, class533.field7324, (byte) -83);
        this.field7580.method3635(arg0, 0);
        this.method128(-6486);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)Z", line = 166)
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.field252 = null;
        }
        return this.field257;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)V", line = 176)
    public final void method126(int arg0, int arg1, int arg2) {
        if (arg0 <= 81) {
            this.method118(true);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lot;BI)V", line = 186)
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg0 == null) {
            this.field7580.method3613((byte) 114, this.field7580.field9185);
            this.field7580.method3676(1, (byte) -84);
            this.field7580.method3624(class533.field7324, -116, 0);
            this.field7580.method3666(0, class533.field7324, (byte) -83);
        } else {
            this.field7580.method3613((byte) 126, arg0);
            this.field7580.method3676(arg2, (byte) -84);
        }
        if (arg1 > -93) {
            this.field260 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V", line = 208)
    public final void method128(int arg0) {
        if (arg0 != -6486) {
            this.method122(34);
        }
        IDirect3DDevice var2 = this.field252.field4612;
        int var3 = this.field7580.method3688((byte) -46);
        class149 var4 = this.field7580.method3637((byte) -116);
        IDirect3DVertexShader var5;
        if (this.field259) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field250 : this.field255;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field260 : this.field254;
        }
        if (this.field258 != var5) {
            this.field258 = var5;
            var2.SetVertexShader(var5);
            this.method123((byte) 0);
            this.method118(false);
            this.method129(47);
            this.method122(12844);
            this.method119(-97);
            this.method120((byte) -123);
        }
        var4.method864(-106, -1.0F, 0.0F, 0.0F, (float) var3, field251);
        var2.method2451(12, field251);
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V", line = 249)
    public final void method129(int arg0) {
        if (this.field258 != null) {
            IDirect3DDevice var2 = this.field252.field4612;
            class149 var3 = this.field7580.method3669(-15506);
            var2.SetVertexShaderConstantF(8, var3.method860(field253, (byte) 102), 2);
        }
        if (arg0 <= 33) {
            this.field256 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lhb;Lga;)V", line = 267)
    public class20(class343 arg0, class332 arg1) {
        super(arg0);
        this.field252 = arg0;
        if (arg1 == null || (this.field252.field4609.VertexShaderVersion & 0xFFFF) < 257) {
            this.field257 = false;
        } else {
            this.field260 = this.field252.field4612.method2460(arg1.method1947(5, "uw_ground_unlit", "dx"));
            this.field250 = this.field252.field4612.method2460(arg1.method1947(5, "uw_ground_lit", "dx"));
            this.field254 = this.field252.field4612.method2460(arg1.method1947(5, "uw_model_unlit", "dx"));
            this.field255 = this.field252.field4612.method2460(arg1.method1947(5, "uw_model_lit", "dx"));
            if ((this.field254 != null & this.field260 != null & this.field250 != null & this.field255 != null)) {
                this.field256 = this.field7580.method3662(1, false, 2, -123, new int[] { 0, -1 });
                this.field256.method846(false, (byte) 76, false);
                this.field257 = true;
            } else {
                this.field257 = false;
            }
        }
    }
}
