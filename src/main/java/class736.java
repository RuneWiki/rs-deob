import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class736 extends class657 {

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "Z")
    private boolean field9913 = false;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Lbfa;")
    private class370 field9915;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9919;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9917;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9921;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9922;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "Lwfa;")
    private class200 field9918;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Z")
    private boolean field9916;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "[F")
    private static float[] field9914 = new float[4];

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "[F")
    private static float[] field9924 = new float[16];

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9920;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "Z")
    private boolean field9923;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lbfa;Lin;)V", line = 6)
    public class736(class370 arg0, class91 arg1) {
        super(arg0);
        this.field9915 = arg0;
        if (arg1 == null || (this.field9915.field5263.VertexShaderVersion & 0xFFFF) < 257) {
            this.field9916 = false;
        } else {
            this.field9919 = this.field9915.field5282.method2848(arg1.method844("dx", "uw_ground_unlit", -29832));
            this.field9917 = this.field9915.field5282.method2848(arg1.method844("dx", "uw_ground_lit", -29832));
            this.field9921 = this.field9915.field5282.method2848(arg1.method844("dx", "uw_model_unlit", -29832));
            this.field9922 = this.field9915.field5282.method2848(arg1.method844("dx", "uw_model_lit", -29832));
            if (this.field9919 != null & this.field9917 != null & this.field9921 != null & this.field9922 != null) {
                this.field9918 = this.field9010.method4091(1, 2, -15137, false, new int[] { 0, -1 });
                this.field9918.method1014(false, false, 25688);
                this.field9916 = true;
            } else {
                this.field9916 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V", line = 35)
    public final void method3636(int arg0) {
        if (arg0 < 45) {
            field9914 = null;
        }
        IDirect3DDevice var2 = this.field9915.field5282;
        int var3 = this.field9010.method4152(-103);
        class81 var4 = this.field9010.method4119((byte) 61);
        IDirect3DVertexShader var5;
        if (this.field9923) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field9917 : this.field9922;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field9919 : this.field9921;
        }
        if (this.field9920 != var5) {
            this.field9920 = var5;
            this.field9915.method2352(var5, (byte) -89);
            this.method4053(121);
            this.method1314(-14775);
            this.method733(10425);
            this.method1313((byte) 12);
            this.method1315(false);
            this.method1312(-16252);
        }
        var4.method755(0.0F, field9914, -1.0F, 0.0F, (float) var3, (byte) -120);
        var2.method2839(12, field9914);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V", line = 74)
    public final void method730(int arg0, int arg1, int arg2) {
        if (arg0 != 10756) {
            this.method1315(false);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 87)
    public final void method728(byte arg0) {
        if (arg0 != 87) {
            this.method736(55, null, -69);
        }
        this.field9010.method4126(1, -4382);
        this.field9010.method4097((byte) 82, null);
        this.field9010.method4112(class534.field7355, arg0 + 25, class534.field7355);
        this.field9010.method4096((byte) 47, 0, class755.field10544);
        this.field9010.method4096((byte) 47, 2, class4.field31);
        this.field9010.method4117(0, true, class755.field10544);
        this.field9010.method4126(0, arg0 ^ 0xFFFFEEB5);
        if (this.field9913) {
            this.field9010.method4096((byte) 47, 0, class755.field10544);
            this.field9010.method4117(0, true, class755.field10544);
            this.field9913 = false;
        }
        if (this.field9920 != null) {
            this.field9915.method2352(null, (byte) -89);
            this.field9920 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)Z", line = 117)
    public final boolean method731(int arg0) {
        if (arg0 > -57) {
            this.field9915 = null;
        }
        return this.field9916;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 133)
    public final void method1313(byte arg0) {
        if (arg0 != 12) {
            this.method734(false, (byte) -54);
        }
        if (this.field9920 != null) {
            IDirect3DDevice var2 = this.field9915.field5282;
            class81 var3 = this.field9915.method4157(arg0 - 22048);
            var2.method2839(0, var3.method761(11, field9924));
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V", line = 155)
    public final void method1314(int arg0) {
        if (arg0 == -14775 && this.field9920 != null) {
            IDirect3DDevice var2 = this.field9915.field5282;
            var2.method2839(4, this.field9010.method4087(field9924, -101));
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILdu;I)V", line = 171)
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg1 != null) {
            if (this.field9913) {
                this.field9010.method4096((byte) 47, 0, class755.field10544);
                this.field9010.method4117(0, true, class755.field10544);
                this.field9913 = false;
            }
            this.field9010.method4097((byte) -103, arg1);
            this.field9010.method4144(true, arg0);
        } else if (!this.field9913) {
            this.field9010.method4097((byte) -43, this.field9010.field10261);
            this.field9010.method4144(true, 1);
            this.field9010.method4096((byte) 47, 0, class380.field5528);
            this.field9010.method4117(0, true, class380.field5528);
            this.field9913 = true;
        }
        if (arg2 != -16776) {
            this.field9919 = null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 205)
    public final void method1312(int arg0) {
        if (arg0 != -16252) {
            this.method734(true, (byte) -11);
        }
        if (this.field9920 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field9915.field5282;
        int var3 = this.field9010.method186();
        int var4 = this.field9010.method323();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2850(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2850(11, 1.0F / (float) this.field9010.method4085((byte) -58), (float) this.field9010.method4082((byte) -70) / 255.0F, this.field9010.field10229, 1.0F / (this.field9010.field10229 - this.field9010.field10287));
        this.field9010.method4123(-28186, this.field9010.method4104(-103));
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V", line = 231)
    public final void method735(int arg0, boolean arg1) {
        this.field9923 = arg1;
        this.field9010.method4126(1, -4382);
        this.field9010.method4097((byte) 95, this.field9918);
        if (arg0 != 15192) {
            this.method728((byte) -41);
        }
        this.field9010.method4112(class720.field9793, 105, class295.field4131);
        this.field9010.method4096((byte) 47, 0, class4.field31);
        this.field9010.method2248(true, false, 2, class755.field10544, false);
        this.field9010.method4117(0, true, class380.field5528);
        this.field9010.method4126(0, -4382);
        this.method3636(106);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZB)V", line = 249)
    public final void method734(boolean arg0, byte arg1) {
        if (arg1 != -103) {
            this.field9913 = true;
        }
    }

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V", line = 262)
    private final void method4053(int arg0) {
        if (arg0 <= 95 || this.field9920 == null || !this.field9923) {
            return;
        }
        class81 var2 = this.field9010.method4100((byte) 111);
        IDirect3DDevice var3 = this.field9915.field5282;
        var3.method2850(13, this.field9010.field10294 * this.field9010.field10207, this.field9010.field10207 * this.field9010.field10201, this.field9010.field10282 * this.field9010.field10207, 1.0F);
        var3.method2850(14, this.field9010.field10294 * this.field9010.field10288, this.field9010.field10288 * this.field9010.field10201, this.field9010.field10288 * this.field9010.field10282, 1.0F);
        var3.method2850(16, this.field9010.field10300 * this.field9010.field10294, this.field9010.field10300 * this.field9010.field10201, this.field9010.field10300 * this.field9010.field10282, 1.0F);
        var2.method760(this.field9010.field10284[0], this.field9010.field10284[1], (byte) -97, this.field9010.field10284[2], field9914);
        var3.SetVertexShaderConstantF(15, field9914, 1);
        var2.method760(this.field9010.field10216[0], this.field9010.field10216[1], (byte) -99, this.field9010.field10216[2], field9914);
        var3.SetVertexShaderConstantF(17, field9914, 1);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V", line = 286)
    public final void method1315(boolean arg0) {
        if (arg0) {
            this.method3636(89);
        }
        if (this.field9920 != null) {
            IDirect3DDevice var2 = this.field9915.field5282;
            class81 var3 = this.field9915.method4157(-22036);
            var2.method2839(0, var3.method761(11, field9924));
        }
    }

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V", line = 304)
    public final void method733(int arg0) {
        if (arg0 != 10425) {
            this.method4053(-24);
        }
        if (this.field9920 != null) {
            IDirect3DDevice var2 = this.field9915.field5282;
            class81 var3 = this.field9010.method4095(5);
            var2.SetVertexShaderConstantF(8, var3.method746(field9924, arg0 - 10424), 2);
        }
    }
}
