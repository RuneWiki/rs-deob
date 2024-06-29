import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class402 extends class353 {

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "Lik;")
    private class107 field6042;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "Lgb;")
    private class465 field6045;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6044;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "[F")
    private static float[] field6043 = new float[16];

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public final void method2190(int arg0) {
        if (this.field6044 != null) {
            IDirect3DDevice var2 = this.field6042.field1600;
            class300 var3 = this.field6042.method3004(124);
            var2.method3770(0, var3.method1868(field6043, 14));
        }
        if (arg0 != -25997) {
            this.method2192(-43);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILqda;I)V")
    public final void method484(int arg0, class689 arg1, int arg2) {
        if (arg0 != 8056) {
            this.method493((byte) 92);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZI)V")
    public final void method486(int arg0, boolean arg1, int arg2) {
        IDirect3DDevice var4 = this.field6042.field1600;
        if (this.field6045.field6706) {
            float var5 = (float) (this.field5242.field7753 % 4000) / 4000.0F;
            this.field5242.method3011(-127, this.field6045.field6707);
            var4.method3759(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field5242.field7753 % 4000 * 16 / 4000;
            this.field5242.method3011(-128, this.field6045.field6705[var6]);
            var4.method3759(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1) {
            this.field6044 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IZ)V")
    public final void method485(int arg0, boolean arg1) {
        this.field5242.method3013(class481.field6884, 115, class65.field1041);
        if (arg0 < 1) {
            this.method2190(9);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
    public final void method1395(boolean arg0) {
        if (this.field6044 != null) {
            IDirect3DDevice var2 = this.field6042.field1600;
            if (this.field5242.field7733 > 0) {
                float var3 = this.field5242.field7692;
                float var4 = this.field5242.field7778;
                float var5 = var4 - 512.0F;
                var2.method3759(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method3759(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field5242.method3028(this.field5242.field7782, !arg0);
        }
        if (!arg0) {
            this.field6042 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Z")
    public final boolean method493(byte arg0) {
        if (arg0 >= -20) {
            this.method493((byte) 104);
        }
        return this.field6044 != null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    public final void method490(int arg0) {
        this.field6042.field1600.SetVertexShader(null);
        this.field5242.method3025(class283.field3777, -1, 0);
        this.field5242.method3025(class443.field6428, arg0 ^ 0x7FD89536, 1);
        this.field5242.method3025(class475.field6812, arg0 ^ 0x7FD89536, 2);
        if (arg0 == -2144900407) {
            this.field5242.method3048((byte) -46, true);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lik;Lmv;Lgb;)V")
    public class402(class107 arg0, class295 arg1, class465 arg2) {
        super(arg0);
        this.field6042 = arg0;
        this.field6045 = arg2;
        if (arg1 != null && this.field6045.method2693(true) && (this.field6042.field1595.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6044 = this.field6042.field1600.method3760(arg1.method1817(-115, "dx", "transparent_water"));
        } else {
            this.field6044 = null;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
    public final void method491(int arg0, boolean arg1) {
        this.field6042.field1600.SetVertexShader(this.field6044);
        if (arg0 >= -121) {
            this.field6042 = null;
        }
        this.field5242.method3025(class283.field3777, -1, 0);
        this.field5242.method3025(class475.field6812, -1, 1);
        this.field5242.method768(false, true, class443.field6428, 2, 3);
        this.field5242.method3048((byte) -46, false);
        this.method2190(-25997);
        this.method2196(-107);
        this.method2192(125);
        this.method1395(true);
    }

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
    public final void method2196(int arg0) {
        int var2 = 90 / ((57 - arg0) / 61);
        if (this.field6044 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field6042.field1600;
        class300 var4 = this.field5242.method3067(-11030);
        var4.method1884(field6043, (byte) -121);
        field6043[7] *= 0.25F;
        field6043[6] *= 0.25F;
        field6043[1] *= 0.25F;
        field6043[3] *= 0.25F;
        field6043[2] *= 0.25F;
        field6043[0] *= 0.25F;
        field6043[4] *= 0.25F;
        field6043[5] *= 0.25F;
        var3.SetVertexShaderConstantF(8, field6043, 2);
    }

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "(I)V")
    public final void method2195(int arg0) {
        if (arg0 > -20) {
            this.field6045 = null;
        }
        if (this.field6044 != null) {
            IDirect3DDevice var2 = this.field6042.field1600;
            class300 var3 = this.field6042.method3004(125);
            var2.method3770(0, var3.method1868(field6043, 14));
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public final void method2192(int arg0) {
        if (arg0 <= 30) {
            this.method2190(-121);
        }
        if (this.field6044 != null) {
            IDirect3DDevice var2 = this.field6042.field1600;
            var2.method3770(4, this.field5242.method3017(field6043, 8));
        }
    }
}
