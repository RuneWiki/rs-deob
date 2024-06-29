import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class427 extends class353 {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "Lik;")
    private class107 field6237;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6244;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6243;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6239;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6241;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "Z")
    private boolean field6240;

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Lfj;")
    private class75 field6234;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[F")
    private static float[] field6235 = new float[4];

    @OriginalMember(owner = "client!of", name = "p", descriptor = "[F")
    private static float[] field6236 = new float[16];

    @OriginalMember(owner = "client!of", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6242;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Z")
    private boolean field6238;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V", line = 4)
    public final void method2195(int arg0) {
        if (this.field6242 != null) {
            IDirect3DDevice var2 = this.field6237.field1600;
            class300 var3 = this.field6237.method3004(126);
            var2.method3770(0, var3.method1868(field6236, 14));
        }
        if (arg0 > -20) {
            this.field6242 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)Z", line = 23)
    public final boolean method493(byte arg0) {
        return arg0 > -20 ? false : this.field6240;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 37)
    public final void method1396(int arg0) {
        IDirect3DDevice var2 = this.field6237.field1600;
        if (arg0 != 1) {
            return;
        }
        int var3 = this.field5242.method3022(126);
        class300 var4 = this.field5242.method2998(false);
        IDirect3DVertexShader var5;
        if (this.field6238) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6243 : this.field6241;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6244 : this.field6239;
        }
        if (this.field6242 != var5) {
            this.field6242 = var5;
            var2.SetVertexShader(var5);
            this.method2566(-1);
            this.method2192(arg0 + 62);
            this.method2196(-105);
            this.method2190(-25997);
            this.method2195(-47);
            this.method1395(true);
        }
        var4.method1887(0.0F, 0.0F, field6235, 2, (float) var3, -1.0F);
        var2.method3770(12, field6235);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)V", line = 73)
    public final void method490(int arg0) {
        this.field5242.method3050(1, arg0 + 2144900407);
        this.field5242.method3011(-127, null);
        this.field5242.method3013(class492.field6998, 88, class492.field6998);
        if (arg0 != -2144900407) {
            this.field6234 = null;
        }
        this.field5242.method3025(class283.field3777, -1, 0);
        this.field5242.method3025(class475.field6812, -1, 2);
        this.field5242.method3019(0, 0, class283.field3777);
        this.field5242.method3050(0, 0);
        this.field5242.method3025(class283.field3777, arg0 + 2144900406, 0);
        this.field5242.method3019(0, 0, class283.field3777);
        if (this.field6242 != null) {
            this.field6237.field1600.SetVertexShader(null);
            this.field6242 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 98)
    public final void method2190(int arg0) {
        if (this.field6242 != null) {
            IDirect3DDevice var2 = this.field6237.field1600;
            class300 var3 = this.field6237.method3004(127);
            var2.method3770(0, var3.method1868(field6236, 14));
        }
        if (arg0 != -25997) {
            this.field6244 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 117)
    public final void method1395(boolean arg0) {
        if (!arg0 || this.field6242 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6237.field1600;
        int var3 = this.field5242.method608();
        int var4 = this.field5242.method668();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method3759(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method3759(11, 1.0F / (float) this.field5242.method3020(-70), (float) this.field5242.method3030(false) / 255.0F, this.field5242.field7692, 1.0F / (this.field5242.field7692 - this.field5242.field7778));
        this.field5242.method3028(this.field5242.method3053(0), false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZ)V", line = 145)
    public final void method491(int arg0, boolean arg1) {
        this.field6238 = arg1;
        this.field5242.method3050(1, 0);
        if (arg0 >= -121) {
            this.method485(106, false);
        }
        this.field5242.method3011(-128, this.field6234);
        this.field5242.method3013(class481.field6884, 77, class519.field7276);
        this.field5242.method3025(class475.field6812, -1, 0);
        this.field5242.method768(true, false, class283.field3777, 2, 3);
        this.field5242.method3019(0, 0, class11.field273);
        this.field5242.method3050(0, 0);
        this.method1396(1);
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(I)V", line = 163)
    public final void method2196(int arg0) {
        if (this.field6242 != null) {
            IDirect3DDevice var2 = this.field6237.field1600;
            class300 var3 = this.field5242.method3067(-11030);
            var2.SetVertexShaderConstantF(8, var3.method1884(field6236, (byte) -121), 2);
        }
        int var4 = 35 % ((arg0 - 57) / 61);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILqda;I)V", line = 182)
    public final void method484(int arg0, class689 arg1, int arg2) {
        if (arg1 == null) {
            this.field5242.method3011(-127, this.field5242.field7752);
            this.field5242.method3037(1, true);
            this.field5242.method3025(class11.field273, arg0 ^ 0xFFFFE087, 0);
            this.field5242.method3019(0, 0, class11.field273);
        } else {
            this.field5242.method3011(-127, arg1);
            this.field5242.method3037(arg2, true);
        }
        if (arg0 != 8056) {
            this.field6242 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V", line = 205)
    public final void method2192(int arg0) {
        if (arg0 > 30 && this.field6242 != null) {
            IDirect3DDevice var2 = this.field6237.field1600;
            var2.method3770(4, this.field5242.method3017(field6236, 8));
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IZ)V", line = 223)
    public final void method485(int arg0, boolean arg1) {
        if (arg0 <= 1) {
            this.field6239 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lik;Lmv;)V", line = 231)
    public class427(class107 arg0, class295 arg1) {
        super(arg0);
        this.field6237 = arg0;
        if (arg1 == null || (this.field6237.field1595.VertexShaderVersion & 0xFFFF) < 257) {
            this.field6240 = false;
        } else {
            this.field6244 = this.field6237.field1600.method3760(arg1.method1817(-75, "dx", "uw_ground_unlit"));
            this.field6243 = this.field6237.field1600.method3760(arg1.method1817(126, "dx", "uw_ground_lit"));
            this.field6239 = this.field6237.field1600.method3760(arg1.method1817(126, "dx", "uw_model_unlit"));
            this.field6241 = this.field6237.field1600.method3760(arg1.method1817(127, "dx", "uw_model_lit"));
            if ((this.field6241 != null & this.field6239 != null & this.field6244 != null & this.field6243 != null)) {
                this.field6234 = this.field5242.method3035(1, 2, (byte) -50, false, new int[] { 0, -1 });
                this.field6234.method432(false, false, (byte) 105);
                this.field6240 = true;
            } else {
                this.field6240 = false;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V", line = 264)
    private final void method2566(int arg0) {
        if (arg0 != -1) {
            this.field6244 = null;
        }
        if (this.field6242 == null || !this.field6238) {
            return;
        }
        class300 var2 = this.field5242.method3039((byte) -112);
        IDirect3DDevice var3 = this.field6237.field1600;
        var3.method3759(13, this.field5242.field7777 * this.field5242.field7776, this.field5242.field7777 * this.field5242.field7737, this.field5242.field7777 * this.field5242.field7734, 1.0F);
        var3.method3759(14, this.field5242.field7776 * this.field5242.field7741, this.field5242.field7741 * this.field5242.field7737, this.field5242.field7741 * this.field5242.field7734, 1.0F);
        var3.method3759(16, this.field5242.field7776 * this.field5242.field7772, this.field5242.field7772 * this.field5242.field7737, this.field5242.field7772 * this.field5242.field7734, 1.0F);
        var2.method1874((byte) -122, field6235, this.field5242.field7747[2], this.field5242.field7747[1], this.field5242.field7747[0]);
        var3.SetVertexShaderConstantF(15, field6235, 1);
        var2.method1874((byte) -115, field6235, this.field5242.field7768[2], this.field5242.field7768[1], this.field5242.field7768[0]);
        var3.SetVertexShaderConstantF(17, field6235, 1);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZI)V", line = 292)
    public final void method486(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method2190(96);
        }
    }
}
