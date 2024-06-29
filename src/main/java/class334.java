import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class334 extends class509 {

    @OriginalMember(owner = "client!om", name = "t", descriptor = "Lnca;")
    private class54 field4920;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lui;")
    private class588 field4917;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4919;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "[F")
    private static float[] field4918 = new float[16];

    @OriginalMember(owner = "client!om", name = "d", descriptor = "(I)V")
    public final void method384(int arg0) {
        if (this.field4919 != null) {
            IDirect3DDevice var2 = this.field4920.field676;
            var2.method2395(4, this.field7558.method1134(-121, field4918));
        }
        if (arg0 != -1) {
            this.method385((byte) 32);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            field4918 = null;
        }
        this.field4920.field676.SetVertexShader(null);
        this.field7558.method1160(0, (byte) -113, class248.field3625);
        this.field7558.method1160(1, (byte) -113, class524.field7760);
        this.field7558.method1160(2, (byte) -113, class455.field6635);
        this.field7558.method1145((byte) -128, true);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZ)V")
    public final void method39(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.method381((byte) 122);
        }
        this.field7558.method1102(class106.field1327, class308.field4477, 127);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V")
    public final void method41(int arg0) {
        if (arg0 >= -88 || this.field4919 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4920.field676;
        if (this.field7558.field2546 > 0) {
            float var3 = this.field7558.field2593;
            float var4 = this.field7558.field2631;
            float var5 = var4 - 512.0F;
            var2.method2393(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method2393(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field7558.method1168(this.field7558.field2609, (byte) 20);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IBI)V")
    public final void method43(int arg0, byte arg1, int arg2) {
        IDirect3DDevice var4 = this.field4920.field676;
        if (this.field4917.field8722) {
            float var6 = (float) (this.field7558.field2599 % 4000) / 4000.0F;
            this.field7558.method1152(this.field4917.field8721, true);
            var4.method2393(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7558.field2599 % 4000 * 16 / 4000;
            this.field7558.method1152(this.field4917.field8728[var5], true);
            var4.method2393(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != -60) {
            this.field4920 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)V")
    public final void method381(byte arg0) {
        if (arg0 != -48) {
            this.field4919 = null;
        }
        if (this.field4919 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4920.field676;
        class124 var3 = this.field7558.method1113(arg0 + 148);
        var3.method755(field4918, 16383);
        field4918[7] *= 0.25F;
        field4918[4] *= 0.25F;
        field4918[6] *= 0.25F;
        field4918[3] *= 0.25F;
        field4918[1] *= 0.25F;
        field4918[2] *= 0.25F;
        field4918[5] *= 0.25F;
        field4918[0] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field4918, 2);
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        if (arg0 <= 44) {
            this.method385((byte) -124);
        }
        return this.field4919 != null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZB)V")
    public final void method35(boolean arg0, byte arg1) {
        this.field4920.field676.SetVertexShader(this.field4919);
        this.field7558.method1160(0, (byte) -113, class248.field3625);
        this.field7558.method1160(1, (byte) -113, class455.field6635);
        this.field7558.method319(class524.field7760, 0, true, 2, false);
        this.field7558.method1145((byte) -128, false);
        int var3 = 38 / ((arg1 - 40) / 36);
        this.method382(92);
        this.method381((byte) -48);
        this.method384(-1);
        this.method41(-107);
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZILmn;)V")
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        if (!arg0) {
            this.field4920 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lnca;Ldda;Lui;)V")
    public class334(class54 arg0, class597 arg1, class588 arg2) {
        super(arg0);
        this.field4920 = arg0;
        this.field4917 = arg2;
        if (this.field4917.method3432(true) && (this.field4920.field664.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4919 = this.field4920.field676.method2396(arg1.method3466("transparent_water", 0, "dx"));
        } else {
            this.field4919 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(B)V")
    public final void method385(byte arg0) {
        if (this.field4919 != null) {
            IDirect3DDevice var2 = this.field4920.field676;
            class124 var3 = this.field4920.method1140((byte) -118);
            var2.method2395(0, var3.method761(field4918, (byte) -112));
        }
        if (arg0 <= 76) {
            this.method39(47, false);
        }
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V")
    public final void method382(int arg0) {
        if (this.field4919 != null) {
            IDirect3DDevice var2 = this.field4920.field676;
            class124 var3 = this.field4920.method1140((byte) -115);
            var2.method2395(0, var3.method761(field4918, (byte) -99));
        }
        if (arg0 <= 69) {
            this.field4919 = null;
        }
    }
}
