import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class506 extends class92 {

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "Lde;")
    private class15 field7051;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "Lom;")
    private class331 field7053;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7052;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "[F")
    private static float[] field7054 = new float[16];

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILqv;)V")
    public final void method672(int arg0, int arg1, class96 arg2) {
        if (arg0 != 0) {
            this.field7052 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lde;Lgp;Lom;)V")
    public class506(class15 arg0, class561 arg1, class331 arg2) {
        super(arg0);
        this.field7051 = arg0;
        this.field7053 = arg2;
        if (this.field7053.method2051(128) && (this.field7051.field157.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7052 = this.field7051.field182.method2423(arg1.method3193(-14855, "dx", "transparent_water"));
        } else {
            this.field7052 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
    public final void method816(int arg0) {
        if (arg0 != 1) {
            field7054 = null;
        }
        if (this.field7052 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7051.field182;
        class516 var3 = this.field1635.method3632(14310);
        var3.method2907(5786, field7054);
        field7054[3] *= 0.25F;
        field7054[2] *= 0.25F;
        field7054[4] *= 0.25F;
        field7054[7] *= 0.25F;
        field7054[1] *= 0.25F;
        field7054[5] *= 0.25F;
        field7054[0] *= 0.25F;
        field7054[6] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field7054, 2);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(B)V")
    public final void method669(byte arg0) {
        this.field7051.field182.SetVertexShader(null);
        this.field1635.method3601(-113, class477.field6813, 0);
        this.field1635.method3601(-31, class371.field5369, 1);
        this.field1635.method3601(-15, class104.field1753, 2);
        this.field1635.method3640((byte) 97, true);
        if (arg0 <= 55) {
            this.method820((byte) -42);
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)V")
    public final void method817(int arg0) {
        if (this.field7052 != null) {
            IDirect3DDevice var2 = this.field7051.field182;
            class516 var3 = this.field7051.method3644(-127);
            var2.method2426(0, var3.method2892(22746, field7054));
        }
        if (arg0 > -66) {
            this.method812((byte) -63);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZI)V")
    public final void method676(boolean arg0, int arg1) {
        if (arg1 > -65) {
            this.method814(92);
        }
        this.field1635.method3583(false, class609.field8665, class211.field3065);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZB)V")
    public final void method671(boolean arg0, byte arg1) {
        this.field7051.field182.SetVertexShader(this.field7052);
        this.field1635.method3601(-48, class477.field6813, 0);
        this.field1635.method3601(arg1 - 120, class104.field1753, 1);
        this.field1635.method97(true, false, 8, class371.field5369, 2);
        this.field1635.method3640((byte) 97, false);
        this.method820((byte) -126);
        this.method816(1);
        this.method814(2);
        this.method812((byte) -31);
        if (arg1 != 107) {
            this.method816(81);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
    public final void method675(boolean arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field7051.field182;
        if (!arg0) {
            return;
        }
        if (this.field7053.field4752) {
            float var6 = (float) (this.field1635.field9162 % 4000) / 4000.0F;
            this.field1635.method3577(this.field7053.field4750, true);
            var4.method2422(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field1635.field9162 % 4000 * 16 / 4000;
            this.field1635.method3577(this.field7053.field4755[var5], true);
            var4.method2422(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
    public final void method812(byte arg0) {
        if (this.field7052 != null) {
            IDirect3DDevice var2 = this.field7051.field182;
            if (this.field1635.field9147 > 0) {
                float var3 = this.field1635.field9065;
                float var4 = this.field1635.field9099;
                float var5 = var4 - 512.0F;
                var2.method2422(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2422(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field1635.method3574(false, this.field1635.field9102);
        }
        if (arg0 != -31) {
            this.field7051 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public final void method814(int arg0) {
        if (arg0 != 2) {
            this.field7053 = null;
        }
        if (this.field7052 != null) {
            IDirect3DDevice var2 = this.field7051.field182;
            var2.method2426(4, this.field1635.method3592((byte) 24, field7054));
        }
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(B)V")
    public final void method820(byte arg0) {
        if (this.field7052 != null) {
            IDirect3DDevice var2 = this.field7051.field182;
            class516 var3 = this.field7051.method3644(-123);
            var2.method2426(0, var3.method2892(22746, field7054));
        }
        if (arg0 > -122) {
            this.method669((byte) -124);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)Z")
    public final boolean method673(int arg0) {
        if (arg0 == -1) {
            return this.field7052 != null;
        } else {
            return true;
        }
    }
}
