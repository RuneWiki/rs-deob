import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class238 extends class595 {

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lbv;")
    private class256 field3326;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3328;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3324;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3322;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3320;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
    private boolean field3319;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "[F")
    private static float[] field3321 = new float[4];

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[F")
    private static float[] field3327 = new float[16];

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3325;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Z")
    private boolean field3323;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        this.field3323 = arg0;
        if (!arg1) {
            this.field3320 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lbv;Lan;)V")
    public class238(class256 arg0, class21 arg1) {
        super(arg0);
        this.field3326 = arg0;
        if ((this.field3326.field3537.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3328 = this.field3326.field3527.method2443(arg1.method228("uw_ground_unlit", 113, "dx"));
            this.field3324 = this.field3326.field3527.method2443(arg1.method228("uw_ground_lit", 117, "dx"));
            this.field3322 = this.field3326.field3527.method2443(arg1.method228("uw_model_unlit", 120, "dx"));
            this.field3320 = this.field3326.field3527.method2443(arg1.method228("uw_model_lit", 116, "dx"));
            this.field3319 = this.field3328 != null & this.field3324 != null & this.field3322 != null & this.field3320 != null;
        } else {
            this.field3319 = false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public final void method1484(byte arg0) {
        if (this.field3325 != null) {
            IDirect3DDevice var2 = this.field3326.field3527;
            int var3 = this.field8612.method1282();
            int var4 = this.field8612.method1301();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2438(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2438(11, 1.0F / (float) this.field8612.method2332((byte) 33), (float) this.field8612.method2272(true) / 255.0F, 0.0F, 0.0F);
        }
        if (arg0 > -123) {
            this.method1488((byte) 83);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            this.field8612.method2267(arg1 + 3, arg0);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public final void method1485(int arg0) {
        if (this.field3325 != null) {
            IDirect3DDevice var2 = this.field3326.field3527;
            class557 var3 = this.field3326.method2297((byte) 95);
            var2.method2439(0, var3.method3171((byte) -91, field3327));
        }
        if (arg0 != -1) {
            this.field3319 = true;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public final void method1486(int arg0) {
        if (arg0 > 113 && this.field3325 != null) {
            IDirect3DDevice var2 = this.field3326.field3527;
            class557 var3 = this.field8612.method2331((byte) -31);
            var2.SetVertexShaderConstantF(8, var3.method3172(119, field3327), 2);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public final void method1487(boolean arg0) {
        if (this.field3325 != null) {
            IDirect3DDevice var2 = this.field3326.field3527;
            var2.method2439(4, this.field8612.method2281(-78, field3327));
        }
        if (arg0) {
            this.method302(false, true);
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        if (arg0 > -119) {
            this.field3324 = null;
        }
        return this.field3319;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 >= -114) {
            this.method1488((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V")
    public final void method1488(byte arg0) {
        IDirect3DDevice var2 = this.field3326.field3527;
        int var3 = this.field8612.method2273(true);
        class557 var4 = this.field8612.method2285(2);
        IDirect3DVertexShader var5;
        if (this.field3323) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field3324 : this.field3320;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field3328 : this.field3322;
        }
        if (arg0 != 4) {
            return;
        }
        if (this.field3325 != var5) {
            this.field3325 = var5;
            var2.SetVertexShader(var5);
            this.method1490(arg0 - 119);
            this.method1487(false);
            this.method1486(arg0 + 110);
            this.method1485(-1);
            this.method1489(-1);
            this.method1484((byte) -127);
        }
        var4.method3168(0.0F, 0.0F, (byte) 104, (float) var3, -1.0F, field3321);
        var2.method2439(12, field3321);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public final void method1489(int arg0) {
        if (this.field3325 != null) {
            IDirect3DDevice var2 = this.field3326.field3527;
            class557 var3 = this.field3326.method2297((byte) 95);
            var2.method2439(0, var3.method3171((byte) -91, field3327));
        }
        if (arg0 != -1) {
            this.method1485(109);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.field3320 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    private final void method1490(int arg0) {
        if (arg0 > -106 || this.field3325 == null || !this.field3323) {
            return;
        }
        class557 var2 = this.field8612.method2285(2);
        IDirect3DDevice var3 = this.field3326.field3527;
        var3.method2438(13, this.field8612.field5469 * this.field8612.field5443, this.field8612.field5482 * this.field8612.field5469, this.field8612.field5479 * this.field8612.field5469, 1.0F);
        var3.method2438(14, this.field8612.field5475 * this.field8612.field5443, this.field8612.field5482 * this.field8612.field5475, this.field8612.field5479 * this.field8612.field5475, 1.0F);
        var3.method2438(16, this.field8612.field5456 * this.field8612.field5443, this.field8612.field5482 * this.field8612.field5456, this.field8612.field5479 * this.field8612.field5456, 1.0F);
        var2.method3181(this.field8612.field5470[2], this.field8612.field5470[1], (byte) -120, field3321, this.field8612.field5470[0]);
        var3.SetVertexShaderConstantF(15, field3321, 1);
        var2.method3181(this.field8612.field5402[2], this.field8612.field5402[1], (byte) 97, field3321, this.field8612.field5402[0]);
        var3.SetVertexShaderConstantF(15, field3321, 1);
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        if (arg0 == -60 && this.field3325 != null) {
            this.field3326.field3527.SetVertexShader(null);
            this.field3325 = null;
        }
    }
}
