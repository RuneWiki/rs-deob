import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class395 extends class188 {

    @OriginalMember(owner = "client!om", name = "i", descriptor = "Lrja;")
    private class115 field5813;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "Llja;")
    private class745 field5814;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5815;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "[F")
    private static float[] field5816 = new float[16];

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
    public final void method962(int arg0, boolean arg1) {
        if (arg0 == 22789) {
            this.field2510.method3513(class187.field2499, class412.field5923, 90);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IIZ)V")
    public final void method958(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field5814 = null;
        }
        IDirect3DDevice var4 = this.field5813.field1565;
        if (this.field5814.field10292) {
            float var6 = (float) (this.field2510.field8699 % 4000) / 4000.0F;
            this.field2510.method3520(true, this.field5814.field10287);
            var4.method2973(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field2510.field8699 % 4000 * 16 / 4000;
            this.field2510.method3520(true, this.field5814.field10282[var5]);
            var4.method2973(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V")
    public final void method1307(int arg0) {
        if (arg0 < 70) {
            this.field5814 = null;
        }
        if (this.field5815 != null) {
            IDirect3DDevice var2 = this.field5813.field1565;
            class754 var3 = this.field5813.method3456(-1690);
            var2.method2962(0, var3.method4200(field5816, (byte) -125));
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V")
    public final void method961(boolean arg0, int arg1) {
        this.field2510.method3514((byte) -109, class122.field1782, 0);
        this.field2510.method3514((byte) -65, class109.field1493, 1);
        this.field2510.method907(false, true, (byte) -67, arg1, class461.field6387);
        this.field2510.method3486(arg1 + 6, false);
        this.field5813.method865(arg1 - 3, this.field5815);
        this.method1307(arg1 + 110);
        this.method1304((byte) -56);
        this.method1308(1);
        this.method1305((byte) -128);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lrja;Laj;Llja;)V")
    public class395(class115 arg0, class333 arg1, class745 arg2) {
        super(arg0);
        this.field5813 = arg0;
        this.field5814 = arg2;
        if (arg1 != null && this.field5814.method4123(29925) && (this.field5813.field1566.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5815 = this.field5813.field1565.method2974(arg1.method2111("dx", "transparent_water", 3));
        } else {
            this.field5815 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V")
    public final void method1305(byte arg0) {
        if (this.field5815 != null) {
            IDirect3DDevice var2 = this.field5813.field1565;
            if (this.field2510.field8721 > 0) {
                float var3 = this.field2510.field8656;
                float var4 = this.field2510.field8655;
                float var5 = var4 - 512.0F;
                var2.method2973(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2973(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field2510.method3525(this.field2510.field8651, 1);
        }
        if (arg0 >= -126) {
            this.field5813 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
    public final void method1304(byte arg0) {
        if (arg0 != -56) {
            this.method961(false, 75);
        }
        if (this.field5815 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5813.field1565;
        class754 var3 = this.field2510.method3452((byte) 13);
        var3.method4201((byte) -70, field5816);
        field5816[7] *= 0.25F;
        field5816[6] *= 0.25F;
        field5816[5] *= 0.25F;
        field5816[0] *= 0.25F;
        field5816[2] *= 0.25F;
        field5816[4] *= 0.25F;
        field5816[3] *= 0.25F;
        field5816[1] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field5816, 2);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public final void method1302(byte arg0) {
        int var2 = -121 % ((-arg0 - 16) / 47);
        if (this.field5815 != null) {
            IDirect3DDevice var3 = this.field5813.field1565;
            class754 var4 = this.field5813.method3456(-1690);
            var3.method2962(0, var4.method4200(field5816, (byte) -31));
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public final void method1308(int arg0) {
        if (this.field5815 != null) {
            IDirect3DDevice var2 = this.field5813.field1565;
            var2.method2962(4, this.field2510.method3447(-61, field5816));
        }
        if (arg0 != 1) {
            this.method955((byte) -95);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBLbm;)V")
    public final void method959(int arg0, byte arg1, class123 arg2) {
        int var4 = -118 % ((60 - arg1) / 61);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)Z")
    public final boolean method956(int arg0) {
        if (arg0 <= 53) {
            field5816 = null;
        }
        return this.field5815 != null;
    }

    @OriginalMember(owner = "client!om", name = "f", descriptor = "(B)V")
    public final void method955(byte arg0) {
        this.field5813.method865(-1, null);
        this.field2510.method3514((byte) 110, class122.field1782, 0);
        this.field2510.method3514((byte) -77, class461.field6387, 1);
        this.field2510.method3514((byte) -65, class109.field1493, 2);
        if (arg0 <= 54) {
            this.method1308(111);
        }
        this.field2510.method3486(8, true);
    }
}
