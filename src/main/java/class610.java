import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class610 extends class607 {

    @OriginalMember(owner = "client!no", name = "r", descriptor = "Lrca;")
    private class391 field8894;

    @OriginalMember(owner = "client!no", name = "k", descriptor = "Z")
    private boolean field8887;

    @OriginalMember(owner = "client!no", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8889;

    @OriginalMember(owner = "client!no", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8893;

    @OriginalMember(owner = "client!no", name = "i", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8885;

    @OriginalMember(owner = "client!no", name = "j", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8886;

    @OriginalMember(owner = "client!no", name = "p", descriptor = "[F")
    private static float[] field8892 = new float[4];

    @OriginalMember(owner = "client!no", name = "n", descriptor = "[F")
    private static float[] field8890 = new float[16];

    @OriginalMember(owner = "client!no", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8891;

    @OriginalMember(owner = "client!no", name = "l", descriptor = "Z")
    private boolean field8888;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        if (arg0 != 993) {
            this.method808(-39, false);
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)V")
    private final void method3535(boolean arg0) {
        if (arg0 || this.field8891 == null || !this.field8888) {
            return;
        }
        class646 var2 = this.field8870.method1977(false);
        IDirect3DDevice var3 = this.field8894.field5990;
        var3.method2631(13, this.field8870.field4326 * this.field8870.field4308, this.field8870.field4326 * this.field8870.field4275, this.field8870.field4326 * this.field8870.field4301, 1.0F);
        var3.method2631(14, this.field8870.field4308 * this.field8870.field4274, this.field8870.field4275 * this.field8870.field4274, this.field8870.field4301 * this.field8870.field4274, 1.0F);
        var3.method2631(16, this.field8870.field4357 * this.field8870.field4308, this.field8870.field4357 * this.field8870.field4275, this.field8870.field4357 * this.field8870.field4301, 1.0F);
        var2.method3687(field8892, this.field8870.field4337[1], 16383, this.field8870.field4337[0], this.field8870.field4337[2]);
        var3.SetVertexShaderConstantF(15, field8892, 1);
        var2.method3687(field8892, this.field8870.field4324[1], 16383, this.field8870.field4324[0], this.field8870.field4324[2]);
        var3.SetVertexShaderConstantF(15, field8892, 1);
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        this.field8888 = arg0;
        if (arg1 != 91) {
            this.field8893 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(I)V")
    public final void method3005(int arg0) {
        if (arg0 == 17367 && this.field8891 != null) {
            IDirect3DDevice var2 = this.field8894.field5990;
            class646 var3 = this.field8894.method1937((byte) -52);
            var2.method2621(0, var3.method3686((byte) 114, field8890));
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V")
    public final void method806(boolean arg0) {
        IDirect3DDevice var2 = this.field8894.field5990;
        int var3 = this.field8870.method1958(-19719);
        class646 var4 = this.field8870.method1977(false);
        IDirect3DVertexShader var5;
        if (this.field8888) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8893 : this.field8886;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8889 : this.field8885;
        }
        if (this.field8891 != var5) {
            this.field8891 = var5;
            var2.SetVertexShader(var5);
            this.method3535(!arg0);
            this.method3006(-15201);
            this.method2065(true);
            this.method3007(-18969);
            this.method3005(17367);
            this.method813(-8635);
        }
        var4.method3699(field8892, 43, 0.0F, -1.0F, (float) var3, 0.0F);
        var2.method2621(12, field8892);
        if (!arg0) {
            this.method3005(-88);
        }
    }

    @OriginalMember(owner = "client!no", name = "d", descriptor = "(I)V")
    public final void method3007(int arg0) {
        if (arg0 != -18969) {
            this.method3535(false);
        }
        if (this.field8891 != null) {
            IDirect3DDevice var2 = this.field8894.field5990;
            class646 var3 = this.field8894.method1937((byte) -67);
            var2.method2621(0, var3.method3686((byte) 114, field8890));
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
    public final void method813(int arg0) {
        if (arg0 != -8635 || this.field8891 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8894.field5990;
        int var3 = this.field8870.method369();
        int var4 = this.field8870.method305();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2631(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2631(11, 1.0F / (float) this.field8870.method1897(-18644), (float) this.field8870.method1914(0) / 255.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        if (this.field8891 != null) {
            this.field8894.field5990.SetVertexShader(null);
            this.field8891 = null;
        }
        if (arg0 != -58) {
            this.field8893 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)V")
    public final void method2065(boolean arg0) {
        if (this.field8891 != null) {
            IDirect3DDevice var2 = this.field8894.field5990;
            class646 var3 = this.field8870.method1938((byte) 52);
            var2.SetVertexShaderConstantF(8, var3.method3701(field8890, -9), 2);
        }
        if (!arg0) {
            this.method813(-53);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
    public final void method3006(int arg0) {
        if (this.field8891 != null) {
            IDirect3DDevice var2 = this.field8894.field5990;
            var2.method2621(4, this.field8870.method1955(field8890, arg0 + 15201));
        }
        if (arg0 != -15201) {
            this.field8888 = true;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        this.field8870.method1971((byte) -102, arg2);
        if (arg1 > -73) {
            this.field8886 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lrca;Lkea;)V")
    public class610(class391 arg0, class203 arg1) {
        super(arg0);
        this.field8894 = arg0;
        if ((this.field8894.field5984.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8887 = false;
        } else {
            this.field8889 = this.field8894.field5990.method2626(arg1.method1281((byte) -37, "uw_ground_unlit", "dx"));
            this.field8893 = this.field8894.field5990.method2626(arg1.method1281((byte) -37, "uw_ground_lit", "dx"));
            this.field8885 = this.field8894.field5990.method2626(arg1.method1281((byte) -37, "uw_model_unlit", "dx"));
            this.field8886 = this.field8894.field5990.method2626(arg1.method1281((byte) -37, "uw_model_lit", "dx"));
            this.field8887 = this.field8893 != null & this.field8889 != null & this.field8885 != null & this.field8886 != null;
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        return arg0 == -97 ? this.field8887 : false;
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 != 12868) {
            this.field8885 = null;
        }
    }
}
