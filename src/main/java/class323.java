import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class323 extends class546 {

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "Lto;")
    private class8 field5049;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "Ltj;")
    private class181 field5050;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5051;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[F")
    private static float[] field5052 = new float[16];

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 4)
    public final void method789(int arg0) {
        if (this.field5051 != null) {
            IDirect3DDevice var2 = this.field5049.field131;
            class498 var3 = this.field5049.method2303((byte) 91);
            var2.method2823(0, var3.method3042(field5052, 1));
        }
        if (arg0 <= 121) {
            this.field5051 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 23)
    public final void method784(byte arg0) {
        if (this.field5051 != null) {
            IDirect3DDevice var2 = this.field5049.field131;
            class498 var3 = this.field7937.method2234(arg0 + 109);
            var3.method3037(field5052, 73);
            field5052[3] *= 0.25F;
            field5052[6] *= 0.25F;
            field5052[4] *= 0.25F;
            field5052[5] *= 0.25F;
            field5052[1] *= 0.25F;
            field5052[0] *= 0.25F;
            field5052[7] *= 0.25F;
            field5052[2] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field5052, 2);
        }
        if (arg0 != -103) {
            this.field5051 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)Z", line = 50)
    public final boolean method787(byte arg0) {
        if (arg0 != -109) {
            this.method793(-29, true);
        }
        return this.field5051 != null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(III)V", line = 61)
    public final void method785(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field5049.field131;
        if (arg0 != 8) {
            this.method789(-40);
        }
        if (this.field5050.field3036) {
            float var6 = (float) (this.field7937.field5327 % 4000) / 4000.0F;
            this.field7937.method2271(this.field5050.field3042, 5180);
            var4.method2818(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7937.field5327 % 4000 * 16 / 4000;
            this.field7937.method2271(this.field5050.field3047[var5], 5180);
            var4.method2818(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V", line = 87)
    public final void method790(int arg0) {
        if (arg0 == -32535 && this.field5051 != null) {
            IDirect3DDevice var2 = this.field5049.field131;
            var2.method2823(4, this.field7937.method2257(field5052, arg0 ^ 0xFF0080E9));
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V", line = 104)
    public final void method783(int arg0) {
        this.field5049.field131.SetVertexShader(null);
        this.field7937.method2287((byte) -89, 0, class622.field8779);
        this.field7937.method2287((byte) -118, 1, class24.field409);
        this.field7937.method2287((byte) -94, 2, class471.field6974);
        if (arg0 != 255) {
            this.method789(93);
        }
        this.field7937.method2300((byte) -128, true);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V", line = 118)
    public final void method788(boolean arg0, int arg1) {
        this.field5049.field131.SetVertexShader(this.field5051);
        this.field7937.method2287((byte) -118, arg1, class622.field8779);
        this.field7937.method2287((byte) -123, 1, class471.field6974);
        this.field7937.method185(class24.field409, 2, true, false, (byte) 106);
        this.field7937.method2300((byte) -128, false);
        this.method789(125);
        this.method784((byte) -103);
        this.method790(-32535);
        this.method795(15759);
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lto;Lri;Ltj;)V", line = 133)
    public class323(class8 arg0, class97 arg1, class181 arg2) {
        super(arg0);
        this.field5049 = arg0;
        this.field5050 = arg2;
        if (arg1 != null && this.field5050.method1480((byte) -65) && (this.field5049.field135.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5051 = this.field5049.field131.method2828(arg1.method923("dx", -25124, "transparent_water"));
        } else {
            this.field5051 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZ)V", line = 152)
    public final void method793(int arg0, boolean arg1) {
        this.field7937.method2275(class471.field6979, 93, class51.field681);
        if (arg0 > -39) {
            this.field5049 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZLwq;)V", line = 163)
    public final void method794(int arg0, boolean arg1, class152 arg2) {
        if (arg1) {
            this.field5049 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V", line = 172)
    public final void method786(int arg0) {
        if (this.field5051 != null) {
            IDirect3DDevice var2 = this.field5049.field131;
            class498 var3 = this.field5049.method2303((byte) 97);
            var2.method2823(0, var3.method3042(field5052, 1));
        }
        if (arg0 < 27) {
            this.field5050 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 191)
    public final void method795(int arg0) {
        if (arg0 != 15759) {
            field5052 = null;
        }
        if (this.field5051 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5049.field131;
        if (this.field7937.field5340 > 0) {
            float var3 = this.field7937.field5391;
            float var4 = this.field7937.field5380;
            float var5 = var4 - 512.0F;
            var2.method2818(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method2818(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field7937.method2290(10359, this.field7937.field5411);
    }
}
