import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class216 extends class188 {

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "Z")
    private boolean field2875 = false;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Lrja;")
    private class115 field2871;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2869;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2873;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2868;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2867;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "Z")
    private boolean field2876;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "Lec;")
    private class248 field2877;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[F")
    private static float[] field2870 = new float[4];

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "[F")
    private static float[] field2872 = new float[16];

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2866;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    private boolean field2874;

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(Lrja;Laj;)V", line = 4)
    public class216(class115 arg0, class333 arg1) {
        super(arg0);
        this.field2871 = arg0;
        if (arg1 == null || (this.field2871.field1566.VertexShaderVersion & 0xFFFF) < 257) {
            this.field2876 = false;
        } else {
            this.field2869 = this.field2871.field1565.method2974(arg1.method2111("dx", "uw_ground_unlit", 3));
            this.field2873 = this.field2871.field1565.method2974(arg1.method2111("dx", "uw_ground_lit", 3));
            this.field2868 = this.field2871.field1565.method2974(arg1.method2111("dx", "uw_model_unlit", 3));
            this.field2867 = this.field2871.field1565.method2974(arg1.method2111("dx", "uw_model_lit", 3));
            if ((this.field2867 != null & this.field2873 != null & this.field2869 != null & this.field2868 != null)) {
                this.field2877 = this.field2510.method3517((byte) -120, 2, 1, false, new int[] { 0, -1 });
                this.field2877.method1667(false, false, 30135);
                this.field2876 = true;
            } else {
                this.field2876 = false;
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(B)V", line = 33)
    private final void method1421(byte arg0) {
        if (this.field2866 != null && this.field2874) {
            class754 var2 = this.field2510.method3458(0);
            IDirect3DDevice var3 = this.field2871.field1565;
            var3.method2973(13, this.field2510.field8658 * this.field2510.field8644, this.field2510.field8740 * this.field2510.field8644, this.field2510.field8687 * this.field2510.field8644, 1.0F);
            var3.method2973(14, this.field2510.field8705 * this.field2510.field8658, this.field2510.field8740 * this.field2510.field8705, this.field2510.field8705 * this.field2510.field8687, 1.0F);
            var3.method2973(16, this.field2510.field8673 * this.field2510.field8658, this.field2510.field8740 * this.field2510.field8673, this.field2510.field8687 * this.field2510.field8673, 1.0F);
            var2.method4199(this.field2510.field8700[1], this.field2510.field8700[2], 2, this.field2510.field8700[0], field2870);
            var3.SetVertexShaderConstantF(15, field2870, 1);
            var2.method4199(this.field2510.field8693[1], this.field2510.field8693[2], 2, this.field2510.field8693[0], field2870);
            var3.SetVertexShaderConstantF(17, field2870, 1);
        }
        if (arg0 >= -1) {
            field2872 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBLbm;)V", line = 58)
    public final void method959(int arg0, byte arg1, class123 arg2) {
        if (arg2 != null) {
            if (this.field2875) {
                this.field2510.method3514((byte) -105, class122.field1782, 0);
                this.field2510.method3509(0, class122.field1782, -98);
                this.field2875 = false;
            }
            this.field2510.method3520(true, arg2);
            this.field2510.method3503((byte) 107, arg0);
        } else if (!this.field2875) {
            this.field2510.method3520(true, this.field2510.field8683);
            this.field2510.method3503((byte) -99, 1);
            this.field2510.method3514((byte) 120, class386.field5627, 0);
            this.field2510.method3509(0, class386.field5627, -89);
            this.field2875 = true;
        }
        int var4 = 53 / ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)Z", line = 94)
    public final boolean method956(int arg0) {
        if (arg0 < 53) {
            this.method1307(-89);
        }
        return this.field2876;
    }

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V", line = 109)
    public final void method1305(byte arg0) {
        if (arg0 >= -126) {
            this.method958(-118, 122, false);
        }
        if (this.field2866 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2871.field1565;
        int var3 = this.field2510.method457();
        int var4 = this.field2510.method539();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method2973(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2973(11, 1.0F / (float) this.field2510.method3450((byte) 127), (float) this.field2510.method3455((byte) 97) / 255.0F, this.field2510.field8656, 1.0F / (this.field2510.field8656 - this.field2510.field8655));
        this.field2510.method3525(this.field2510.method3474(false), 1);
    }

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "(B)V", line = 142)
    public final void method955(byte arg0) {
        this.field2510.method3470((byte) -95, 1);
        this.field2510.method3520(true, null);
        this.field2510.method3513(class364.field5299, class364.field5299, -90);
        this.field2510.method3514((byte) 125, class122.field1782, 0);
        this.field2510.method3514((byte) 105, class109.field1493, 2);
        this.field2510.method3509(0, class122.field1782, -77);
        if (arg0 <= 54) {
            this.field2873 = null;
        }
        this.field2510.method3470((byte) 121, 0);
        if (this.field2875) {
            this.field2510.method3514((byte) 118, class122.field1782, 0);
            this.field2510.method3509(0, class122.field1782, -85);
            this.field2875 = false;
        }
        if (this.field2866 != null) {
            this.field2871.method865(-1, null);
            this.field2866 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZ)V", line = 171)
    public final void method962(int arg0, boolean arg1) {
        if (arg0 != 22789) {
            this.method1305((byte) 18);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 181)
    public final void method1304(byte arg0) {
        if (arg0 != -56) {
            this.method959(106, (byte) -78, null);
        }
        if (this.field2866 != null) {
            IDirect3DDevice var2 = this.field2871.field1565;
            class754 var3 = this.field2510.method3452((byte) 13);
            var2.SetVertexShaderConstantF(8, var3.method4201((byte) -41, field2872), 2);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V", line = 202)
    public final void method1307(int arg0) {
        if (this.field2866 != null) {
            IDirect3DDevice var2 = this.field2871.field1565;
            class754 var3 = this.field2871.method3456(-1690);
            var2.method2962(0, var3.method4200(field2872, (byte) -45));
        }
        if (arg0 < 70) {
            this.method955((byte) 29);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 220)
    public final void method1302(byte arg0) {
        if (this.field2866 != null) {
            IDirect3DDevice var2 = this.field2871.field1565;
            class754 var3 = this.field2871.method3456(-1690);
            var2.method2962(0, var3.method4200(field2872, (byte) -98));
        }
        int var4 = -78 / ((-arg0 - 16) / 47);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(I)V", line = 237)
    public final void method1308(int arg0) {
        if (arg0 != 1) {
            this.method1305((byte) 124);
        }
        if (this.field2866 != null) {
            IDirect3DDevice var2 = this.field2871.field1565;
            var2.method2962(4, this.field2510.method3447(-115, field2872));
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V", line = 257)
    public final void method1306(byte arg0) {
        IDirect3DDevice var2 = this.field2871.field1565;
        int var3 = this.field2510.method3521(123);
        if (arg0 != -36) {
            return;
        }
        class754 var4 = this.field2510.method3448(0);
        IDirect3DVertexShader var5;
        if (this.field2874) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2873 : this.field2867;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field2869 : this.field2868;
        }
        if (this.field2866 != var5) {
            this.field2866 = var5;
            this.field2871.method865(-1, var5);
            this.method1421((byte) -47);
            this.method1308(1);
            this.method1304((byte) -56);
            this.method1307(124);
            this.method1302((byte) 93);
            this.method1305((byte) -127);
        }
        var4.method4207(-1.0F, arg0 ^ 0xFFFFFFDD, 0.0F, (float) var3, 0.0F, field2870);
        var2.method2962(12, field2870);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)V", line = 293)
    public final void method961(boolean arg0, int arg1) {
        this.field2874 = arg0;
        this.field2510.method3470((byte) 124, 1);
        this.field2510.method3520(true, this.field2877);
        this.field2510.method3513(class521.field7150, class412.field5923, 118);
        this.field2510.method3514((byte) -117, class109.field1493, 0);
        this.field2510.method907(true, false, (byte) -67, arg1, class122.field1782);
        this.field2510.method3509(0, class386.field5627, arg1 - 95);
        this.field2510.method3470((byte) -89, 0);
        this.method1306((byte) -36);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIZ)V", line = 309)
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field2866 = null;
        }
    }
}
