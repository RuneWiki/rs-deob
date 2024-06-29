import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gaa")
public class class300 extends class657 {

    @OriginalMember(owner = "client!gaa", name = "j", descriptor = "Lur;")
    private class537 field4192;

    @OriginalMember(owner = "client!gaa", name = "k", descriptor = "Lbfa;")
    private class370 field4193;

    @OriginalMember(owner = "client!gaa", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4194;

    @OriginalMember(owner = "client!gaa", name = "i", descriptor = "[F")
    private static float[] field4191 = new float[16];

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg2 != -16776) {
            this.method730(30, 118, -114);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        this.field9010.method4112(class72.field1302, 127, class295.field4131);
        if (arg1 != -103) {
            this.method1314(55);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field4193.field5282;
        if (this.field4192.field7428) {
            float var5 = (float) (this.field9010.field10260 % 4000) / 4000.0F;
            this.field9010.method4097((byte) -52, this.field4192.field7422);
            var4.method2850(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field9010.field10260 % 4000 * 16 / 4000;
            this.field9010.method4097((byte) 122, this.field4192.field7429[var6]);
            var4.method2850(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != 10756) {
            this.field4192 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "<init>", descriptor = "(Lbfa;Lin;Lur;)V")
    public class300(class370 arg0, class91 arg1, class537 arg2) {
        super(arg0);
        this.field4192 = arg2;
        this.field4193 = arg0;
        if (arg1 != null && this.field4192.method3090(123) && (this.field4193.field5263.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4194 = this.field4193.field5282.method2848(arg1.method844("dx", "transparent_water", -29832));
        } else {
            this.field4194 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(B)V")
    public final void method1313(byte arg0) {
        if (this.field4194 != null) {
            IDirect3DDevice var2 = this.field4193.field5282;
            class81 var3 = this.field4193.method4157(-22036);
            var2.method2839(0, var3.method761(arg0 ^ 0x7, field4191));
        }
        if (arg0 != 12) {
            this.field4193 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (arg0 != 87) {
            return;
        }
        this.field4193.method2352(null, (byte) -89);
        this.field9010.method4096((byte) 47, 0, class755.field10544);
        this.field9010.method4096((byte) 47, 1, class492.field6814);
        this.field9010.method4096((byte) 47, 2, class4.field31);
        this.field9010.method4098(9, true);
    }

    @OriginalMember(owner = "client!gaa", name = "b", descriptor = "(I)V")
    public final void method1314(int arg0) {
        if (this.field4194 != null) {
            IDirect3DDevice var2 = this.field4193.field5282;
            var2.method2839(4, this.field9010.method4087(field4191, -104));
        }
        if (arg0 != -14775) {
            this.field4193 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "f", descriptor = "(I)V")
    public final void method733(int arg0) {
        if (this.field4194 != null) {
            IDirect3DDevice var2 = this.field4193.field5282;
            class81 var3 = this.field9010.method4095(5);
            var3.method746(field4191, arg0 ^ 0x28B8);
            field4191[0] *= 0.25F;
            field4191[2] *= 0.25F;
            field4191[3] *= 0.25F;
            field4191[6] *= 0.25F;
            field4191[5] *= 0.25F;
            field4191[1] *= 0.25F;
            field4191[7] *= 0.25F;
            field4191[4] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field4191, 2);
        }
        if (arg0 != 10425) {
            this.field4193 = null;
        }
    }

    @OriginalMember(owner = "client!gaa", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        if (arg0 >= -57) {
            this.method1312(-94);
        }
        return this.field4194 != null;
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(Z)V")
    public final void method1315(boolean arg0) {
        if (this.field4194 != null) {
            IDirect3DDevice var2 = this.field4193.field5282;
            class81 var3 = this.field4193.method4157(-22036);
            var2.method2839(0, var3.method761(11, field4191));
        }
        if (arg0) {
            this.method1314(46);
        }
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(I)V")
    public final void method1312(int arg0) {
        if (arg0 != -16252) {
            this.method1313((byte) 62);
        }
        if (this.field4194 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4193.field5282;
        if (this.field9010.field10205 <= 0) {
            var2.method2850(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field9010.field10229;
            float var4 = this.field9010.field10287;
            float var5 = var4 - 512.0F;
            var2.method2850(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field9010.method4123(-28186, this.field9010.field10258);
    }

    @OriginalMember(owner = "client!gaa", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        if (arg0 != 15192) {
            this.method1315(true);
        }
        this.field9010.method4096((byte) 47, 0, class755.field10544);
        this.field9010.method4096((byte) 47, 1, class4.field31);
        this.field9010.method2248(false, false, 2, class492.field6814, true);
        this.field9010.method4098(9, false);
        this.field4193.method2352(this.field4194, (byte) -89);
        this.method1313((byte) 12);
        this.method733(10425);
        this.method1314(-14775);
        this.method1312(-16252);
    }
}
