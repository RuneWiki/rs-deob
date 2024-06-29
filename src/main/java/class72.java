import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class72 extends class384 {

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "Lhl;")
    private class527 field766;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "Lwt;")
    private class309 field763;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field764;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "[F")
    private static float[] field765 = new float[16];

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public final void method524(int arg0) {
        if (this.field764 != null) {
            IDirect3DDevice var2 = this.field766.field7501;
            var2.method2899(4, this.field5349.method2262(true, field765));
        }
        if (arg0 != 2976) {
            this.method30(false, (byte) 14);
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)Z")
    public final boolean method26(int arg0) {
        if (arg0 != 13326) {
            field765 = null;
        }
        return this.field764 != null;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZB)V")
    public final void method30(boolean arg0, byte arg1) {
        this.field5349.method2242(-79, class360.field4624, class1.field4);
        if (arg1 < 78) {
            this.method525(83);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V")
    public final void method525(int arg0) {
        if (this.field764 != null) {
            IDirect3DDevice var2 = this.field766.field7501;
            class427 var3 = this.field766.method2203((byte) -116);
            var2.method2899(0, var3.method2657((byte) -64, field765));
        }
        if (arg0 != -7112) {
            this.field764 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ZI)V")
    public final void method24(boolean arg0, int arg1) {
        this.field5349.method2264(0, class424.field6157, (byte) 60);
        this.field5349.method2264(1, class58.field582, (byte) 60);
        this.field5349.method2318((byte) 117, true, false, 2, class169.field1881);
        this.field5349.method2287(false, -32);
        if (arg1 != -1) {
            return;
        }
        this.field766.method3083(this.field764, 30941);
        this.method525(-7112);
        this.method526((byte) -111);
        this.method524(2976);
        this.method528((byte) 37);
    }

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(B)V")
    public final void method526(byte arg0) {
        if (arg0 > -45) {
            this.field764 = null;
        }
        if (this.field764 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field766.field7501;
        class427 var3 = this.field5349.method2258(123);
        var3.method2662(field765, (byte) -113);
        field765[2] *= 0.25F;
        field765[5] *= 0.25F;
        field765[3] *= 0.25F;
        field765[6] *= 0.25F;
        field765[0] *= 0.25F;
        field765[1] *= 0.25F;
        field765[4] *= 0.25F;
        field765[7] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field765, 2);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public final void method31(byte arg0) {
        this.field766.method3083(null, 30941);
        this.field5349.method2264(0, class424.field6157, (byte) 60);
        if (arg0 > -18) {
            this.method26(-41);
        }
        this.field5349.method2264(1, class169.field1881, (byte) 60);
        this.field5349.method2264(2, class58.field582, (byte) 60);
        this.field5349.method2287(true, -32);
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(B)V")
    public final void method527(byte arg0) {
        if (this.field764 != null) {
            IDirect3DDevice var2 = this.field766.field7501;
            class427 var3 = this.field766.method2203((byte) -97);
            var2.method2899(0, var3.method2657((byte) -64, field765));
        }
        if (arg0 != 46) {
            this.field766 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lke;BI)V")
    public final void method27(class596 arg0, byte arg1, int arg2) {
        if (arg1 != 123) {
            this.field766 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZ)V")
    public final void method32(int arg0, int arg1, boolean arg2) {
        IDirect3DDevice var4 = this.field766.field7501;
        if (!arg2) {
            return;
        }
        if (this.field763.field3849) {
            float var6 = (float) (this.field5349.field5152 % 4000) / 4000.0F;
            this.field5349.method2207((byte) -61, this.field763.field3846);
            var4.method2900(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field5349.field5152 % 4000 * 16 / 4000;
            this.field5349.method2207((byte) -61, this.field763.field3843[var5]);
            var4.method2900(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lhl;Loh;Lwt;)V")
    public class72(class527 arg0, class404 arg1, class309 arg2) {
        super(arg0);
        this.field766 = arg0;
        this.field763 = arg2;
        if (arg1 != null && this.field763.method1845((byte) -42) && (this.field766.field7516.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field764 = this.field766.field7501.method2909(arg1.method2471((byte) -55, "dx", "transparent_water"));
        } else {
            this.field764 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(B)V")
    public final void method528(byte arg0) {
        if (this.field764 != null) {
            IDirect3DDevice var2 = this.field766.field7501;
            if (this.field5349.field5088 > 0) {
                float var3 = this.field5349.field5089;
                float var4 = this.field5349.field5153;
                float var5 = var4 - 512.0F;
                var2.method2900(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2900(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field5349.method2257(this.field5349.field5117, -552);
        }
        if (arg0 != 37) {
            this.method528((byte) 35);
        }
    }
}
