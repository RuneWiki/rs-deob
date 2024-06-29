import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class504 extends class135 {

    @OriginalMember(owner = "client!br", name = "k", descriptor = "Lob;")
    private class354 field7499;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "Loe;")
    private class13 field7502;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7500;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "[F")
    private static float[] field7501 = new float[16];

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(III)V")
    public final void method377(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field7502.field154;
        if (arg2 != 0) {
            this.method377(48, -93, -115);
        }
        if (this.field7499.field4957) {
            float var5 = (float) (this.field2179.field7370 % 4000) / 4000.0F;
            this.field2179.method2924(13528, this.field7499.field4958);
            var4.method3792(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field2179.field7370 % 4000 * 16 / 4000;
            this.field2179.method2924(13528, this.field7499.field4961[var6]);
            var4.method3792(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Loe;Lvo;Lob;)V")
    public class504(class13 arg0, class345 arg1, class354 arg2) {
        super(arg0);
        this.field7499 = arg2;
        this.field7502 = arg0;
        if (arg1 != null && this.field7499.method2141(-86) && (this.field7502.field155.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7500 = this.field7502.field154.method3802(arg1.method2073((byte) 71, "transparent_water", "dx"));
        } else {
            this.field7500 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "g", descriptor = "(I)Z")
    public final boolean method379(int arg0) {
        if (arg0 != -4931) {
            this.field7499 = null;
        }
        return this.field7500 != null;
    }

    @OriginalMember(owner = "client!br", name = "d", descriptor = "(I)V")
    public final void method378(int arg0) {
        if (arg0 != 0) {
            this.method378(-73);
        }
        if (this.field7500 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7502.field154;
        class14 var3 = this.field2179.method2957(-11263);
        var3.method157(-120, field7501);
        field7501[3] *= 0.25F;
        field7501[0] *= 0.25F;
        field7501[7] *= 0.25F;
        field7501[4] *= 0.25F;
        field7501[1] *= 0.25F;
        field7501[5] *= 0.25F;
        field7501[2] *= 0.25F;
        field7501[6] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field7501, 2);
    }

    @OriginalMember(owner = "client!br", name = "h", descriptor = "(I)V")
    public final void method382(int arg0) {
        if (arg0 > -34) {
            this.field7500 = null;
        }
        if (this.field7500 != null) {
            IDirect3DDevice var2 = this.field7502.field154;
            class14 var3 = this.field7502.method2969(15475);
            var2.method3791(0, var3.method154(field7501, 19749));
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)V")
    public final void method380(byte arg0) {
        if (this.field7500 != null) {
            IDirect3DDevice var2 = this.field7502.field154;
            if (this.field2179.field7317 <= 0) {
                var2.method3792(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field2179.field7322;
                float var4 = this.field2179.field7315;
                float var5 = var4 - 512.0F;
                var2.method3792(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field2179.method2936(this.field2179.field7332, -127);
        }
        if (arg0 <= 63) {
            field7501 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public final void method385(int arg0) {
        this.field7502.field154.SetVertexShader(null);
        int var2 = 31 % ((arg0 + 29) / 45);
        this.field2179.method2914(24, 0, class171.field2763);
        this.field2179.method2914(19, 1, class521.field7683);
        this.field2179.method2914(42, 2, class450.field6484);
        this.field2179.method2960(true, -92);
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(B)V")
    public final void method383(byte arg0) {
        if (this.field7500 != null) {
            IDirect3DDevice var2 = this.field7502.field154;
            class14 var3 = this.field7502.method2969(15475);
            var2.method3791(0, var3.method154(field7501, 19749));
        }
        if (arg0 <= 25) {
            this.method384(null, 46, -58);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZI)V")
    public final void method376(boolean arg0, int arg1) {
        this.field7502.field154.SetVertexShader(this.field7500);
        this.field2179.method2914(41, 0, class171.field2763);
        this.field2179.method2914(45, 1, class450.field6484);
        this.field2179.method143(false, class521.field7683, arg1 ^ 0xFFFF9C5D, true, 2);
        this.field2179.method2960(false, -116);
        this.method382(arg1 ^ 0x63FA);
        this.method378(0);
        this.method381(127);
        if (arg1 == -25475) {
            this.method380((byte) 114);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IZ)V")
    public final void method375(int arg0, boolean arg1) {
        this.field2179.method2959(class166.field2734, class673.field9556, (byte) 20);
        if (arg0 <= 14) {
            this.field7502 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V")
    public final void method381(int arg0) {
        if (this.field7500 != null) {
            IDirect3DDevice var2 = this.field7502.field154;
            var2.method3791(4, this.field2179.method2955(10264, field7501));
        }
        if (arg0 <= 125) {
            this.field7499 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Laj;II)V")
    public final void method384(class402 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field7501 = null;
        }
    }
}
