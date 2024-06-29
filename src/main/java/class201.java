import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class201 extends class279 {

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Lno;")
    private class67 field3422;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "Lhb;")
    private class585 field3421;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3419;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "[F")
    private static float[] field3420 = new float[16];

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)V")
    public final void method434(int arg0) {
        if (arg0 != -1) {
            this.method439(64);
        }
        if (this.field3419 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field3421.field8281;
        class341 var3 = this.field4267.method263(false);
        var3.method2201(field3420, (byte) 75);
        field3420[1] *= 0.25F;
        field3420[2] *= 0.25F;
        field3420[3] *= 0.25F;
        field3420[7] *= 0.25F;
        field3420[6] *= 0.25F;
        field3420[0] *= 0.25F;
        field3420[4] *= 0.25F;
        field3420[5] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field3420, 2);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(III)V")
    public final void method443(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field3421.field8281;
        if (arg1 != 0) {
            return;
        }
        if (this.field3422.field1050) {
            float var6 = (float) (this.field4267.field649 % 4000) / 4000.0F;
            this.field4267.method215(8, this.field3422.field1058);
            var4.method4117(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field4267.field649 % 4000 * 16 / 4000;
            this.field4267.method215(arg1 ^ 0x8, this.field3422.field1052[var5]);
            var4.method4117(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BZ)V")
    public final void method441(byte arg0, boolean arg1) {
        if (arg0 != 9) {
            this.method437(106, false, null);
        }
        this.field4267.method365(class107.field1555, class200.field3408, (byte) -122);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V")
    public final void method435(boolean arg0, int arg1) {
        if (arg1 != 2048) {
            return;
        }
        this.field4267.method321(class388.field5817, 0, (byte) -95);
        this.field4267.method321(class327.field4819, 1, (byte) -95);
        this.field4267.method338(2, class580.field8210, true, false, 31181);
        this.field4267.method371(false, (byte) -124);
        this.field3421.method3374(this.field3419, true);
        this.method440(false);
        this.method434(-1);
        this.method436(0);
        this.method439(arg1 - 8958);
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)Z")
    public final boolean method438(byte arg0) {
        if (arg0 >= -32) {
            return true;
        } else {
            return this.field3419 != null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V")
    public final void method436(int arg0) {
        if (arg0 != 0) {
            this.field3419 = null;
        }
        if (this.field3419 != null) {
            IDirect3DDevice var2 = this.field3421.field8281;
            var2.method4121(4, this.field4267.method335((byte) -74, field3420));
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Z)V")
    public final void method442(boolean arg0) {
        this.field3421.method3374(null, !arg0);
        this.field4267.method321(class388.field5817, 0, (byte) -95);
        this.field4267.method321(class580.field8210, 1, (byte) -95);
        this.field4267.method321(class327.field4819, 2, (byte) -95);
        if (arg0) {
            this.method434(105);
        }
        this.field4267.method371(true, (byte) -128);
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)V")
    public final void method433(int arg0) {
        if (this.field3419 != null) {
            IDirect3DDevice var2 = this.field3421.field8281;
            class341 var3 = this.field3421.method398(3535);
            var2.method4121(0, var3.method2196(29340, field3420));
        }
        if (arg0 < 109) {
            this.field3419 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(IZLiu;)V")
    public final void method437(int arg0, boolean arg1, class506 arg2) {
        if (arg1) {
            this.method439(-57);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public final void method439(int arg0) {
        if (this.field3419 != null) {
            IDirect3DDevice var2 = this.field3421.field8281;
            if (this.field4267.field636 <= 0) {
                var2.method4117(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field4267.field653;
                float var4 = this.field4267.field621;
                float var5 = var4 - 512.0F;
                var2.method4117(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field4267.method228(arg0 ^ 0xFFFFE500, this.field4267.field618);
        }
        if (arg0 != -6910) {
            this.field3422 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(Lhb;Lla;Lno;)V")
    public class201(class585 arg0, class422 arg1, class67 arg2) {
        super(arg0);
        this.field3422 = arg2;
        this.field3421 = arg0;
        if (arg1 != null && this.field3422.method646((byte) 75) && (this.field3421.field8266.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3419 = this.field3421.field8281.method4120(arg1.method2638("transparent_water", 30, "dx"));
        } else {
            this.field3419 = null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(Z)V")
    public final void method440(boolean arg0) {
        if (arg0) {
            this.field3422 = null;
        }
        if (this.field3419 != null) {
            IDirect3DDevice var2 = this.field3421.field8281;
            class341 var3 = this.field3421.method398(3535);
            var2.method4121(0, var3.method2196(29340, field3420));
        }
    }
}
