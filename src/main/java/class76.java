import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class76 extends class532 {

    @OriginalMember(owner = "client!sga", name = "n", descriptor = "Lrfa;")
    private class213 field1043;

    @OriginalMember(owner = "client!sga", name = "p", descriptor = "Lus;")
    private class1 field1045;

    @OriginalMember(owner = "client!sga", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1044;

    @OriginalMember(owner = "client!sga", name = "m", descriptor = "[F")
    private static float[] field1042 = new float[16];

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(I)V", line = 4)
    public final void method697(int arg0) {
        if (arg0 < 14) {
            field1042 = null;
        }
        if (this.field1044 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1045.field27;
        class256 var3 = this.field7494.method2701(128);
        var3.method1530(4, field1042);
        field1042[0] *= 0.25F;
        field1042[3] *= 0.25F;
        field1042[2] *= 0.25F;
        field1042[6] *= 0.25F;
        field1042[5] *= 0.25F;
        field1042[4] *= 0.25F;
        field1042[7] *= 0.25F;
        field1042[1] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field1042, 2);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(B)V", line = 34)
    public final void method698(byte arg0) {
        if (this.field1044 != null) {
            IDirect3DDevice var2 = this.field1045.field27;
            class256 var3 = this.field1045.method2677(0);
            var2.method3061(0, var3.method1540(0, field1042));
        }
        int var4 = -96 / ((arg0 - 68) / 40);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(Z)V", line = 51)
    public final void method699(boolean arg0) {
        if (arg0) {
            this.method701(true, -26, null);
        }
        this.field1045.method66((byte) 60, null);
        this.field7494.method2694((byte) -49, 0, class507.field7214);
        this.field7494.method2694((byte) -49, 1, class606.field8160);
        this.field7494.method2694((byte) -49, 2, class555.field7718);
        this.field7494.method2722(-2614, true);
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lus;Lbt;Lrfa;)V", line = 64)
    public class76(class1 arg0, class48 arg1, class213 arg2) {
        super(arg0);
        this.field1043 = arg2;
        this.field1045 = arg0;
        if (arg1 != null && this.field1043.method1339(-10521) && (this.field1045.field23.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1044 = this.field1045.field27.method3063(arg1.method436("dx", -3637, "transparent_water"));
        } else {
            this.field1044 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)V", line = 82)
    public final void method700(int arg0, byte arg1, int arg2) {
        IDirect3DDevice var4 = this.field1045.field27;
        if (arg1 != 94) {
            return;
        }
        if (this.field1043.field2520) {
            float var5 = (float) (this.field7494.field6229 % 4000) / 4000.0F;
            this.field7494.method2643(-2, this.field1043.field2517);
            var4.method3067(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field7494.field6229 % 4000 * 16 / 4000;
            this.field7494.method2643(-2, this.field1043.field2519[var6]);
            var4.method3067(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZILgaa;)V", line = 107)
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (!arg0) {
            this.field1043 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZB)V", line = 120)
    public final void method702(boolean arg0, byte arg1) {
        this.field7494.method2694((byte) -49, 0, class507.field7214);
        this.field7494.method2694((byte) -49, 1, class555.field7718);
        if (arg1 != -10) {
            this.field1044 = null;
        }
        this.field7494.method4(class606.field8160, false, (byte) 95, true, 2);
        this.field7494.method2722(-2614, false);
        this.field1045.method66((byte) 60, this.field1044);
        this.method698((byte) 121);
        this.method697(123);
        this.method704((byte) 56);
        this.method705(arg1 + 1590);
    }

    @OriginalMember(owner = "client!sga", name = "d", descriptor = "(B)Z", line = 138)
    public final boolean method703(byte arg0) {
        if (arg0 < 126) {
            return true;
        } else {
            return this.field1044 != null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "c", descriptor = "(B)V", line = 150)
    public final void method704(byte arg0) {
        if (this.field1044 != null) {
            IDirect3DDevice var2 = this.field1045.field27;
            var2.method3061(4, this.field7494.method2709(field1042, (byte) -108));
        }
        if (arg0 < 41) {
            this.field1043 = null;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V", line = 167)
    public final void method705(int arg0) {
        if (arg0 != 1580 || this.field1044 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1045.field27;
        if (this.field7494.field6231 <= 0) {
            var2.method3067(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field7494.field6258;
            float var4 = this.field7494.field6278;
            float var5 = var4 - 512.0F;
            var2.method3067(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field7494.method2673(this.field7494.field6307, arg0 - 1454);
    }

    @OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V", line = 196)
    public final void method706(byte arg0) {
        if (arg0 > -20) {
            this.field1045 = null;
        }
        if (this.field1044 != null) {
            IDirect3DDevice var2 = this.field1045.field27;
            class256 var3 = this.field1045.method2677(0);
            var2.method3061(0, var3.method1540(0, field1042));
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(ZI)V", line = 214)
    public final void method707(boolean arg0, int arg1) {
        this.field7494.method2716(class555.field7726, arg1 - 30821, class8.field135);
        if (arg1 != 30902) {
            this.method704((byte) -121);
        }
    }
}
