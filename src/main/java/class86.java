import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vga")
public class class86 extends class712 {

    @OriginalMember(owner = "client!vga", name = "C", descriptor = "Z")
    private boolean field1231 = false;

    @OriginalMember(owner = "client!vga", name = "B", descriptor = "Lkfa;")
    private class386 field1230;

    @OriginalMember(owner = "client!vga", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1223;

    @OriginalMember(owner = "client!vga", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1224;

    @OriginalMember(owner = "client!vga", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1225;

    @OriginalMember(owner = "client!vga", name = "y", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1227;

    @OriginalMember(owner = "client!vga", name = "x", descriptor = "Z")
    private boolean field1226;

    @OriginalMember(owner = "client!vga", name = "z", descriptor = "Ldg;")
    private class19 field1228;

    @OriginalMember(owner = "client!vga", name = "s", descriptor = "[F")
    private static float[] field1221 = new float[16];

    @OriginalMember(owner = "client!vga", name = "r", descriptor = "[F")
    private static float[] field1220 = new float[4];

    @OriginalMember(owner = "client!vga", name = "A", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1229;

    @OriginalMember(owner = "client!vga", name = "t", descriptor = "Z")
    private boolean field1222;

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(III)V")
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 < 96) {
            this.method390(false);
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(IILhba;)V")
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 != 0) {
            this.field1229 = null;
        }
        if (arg2 != null) {
            if (this.field1231) {
                this.field9945.method1408(0, 0, class15.field140);
                this.field9945.method1528(class15.field140, false, 0);
                this.field1231 = false;
            }
            this.field9945.method1458(arg1 + 399403340, arg2);
            this.field9945.method1503(arg0, (byte) 114);
        } else if (!this.field1231) {
            this.field9945.method1458(399403340, this.field9945.field3427);
            this.field9945.method1503(1, (byte) 112);
            this.field9945.method1408(0, arg1 ^ 0x0, class231.field3142);
            this.field9945.method1528(class231.field3142, false, 0);
            this.field1231 = true;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(ZB)V")
    public final void method399(boolean arg0, byte arg1) {
        this.field1222 = arg0;
        this.field9945.method1431(0, 1);
        this.field9945.method1458(399403340, this.field1228);
        this.field9945.method1388(class87.field1239, (byte) 52, class370.field5228);
        this.field9945.method1408(0, 0, class520.field7247);
        this.field9945.method324(2, true, -9608, class15.field140, false);
        this.field9945.method1528(class231.field3142, false, 0);
        this.field9945.method1431(0, 0);
        this.method604(true);
        if (arg1 < 44) {
            this.method398(-90);
        }
    }

    @OriginalMember(owner = "client!vga", name = "<init>", descriptor = "(Lkfa;Luu;)V")
    public class86(class386 arg0, class237 arg1) {
        super(arg0);
        this.field1230 = arg0;
        if (arg1 == null || (this.field1230.field5536.VertexShaderVersion & 0xFFFF) < 257) {
            this.field1226 = false;
        } else {
            this.field1223 = this.field1230.field5542.method4113(arg1.method1582("uw_ground_unlit", false, "dx"));
            this.field1224 = this.field1230.field5542.method4113(arg1.method1582("uw_ground_lit", false, "dx"));
            this.field1225 = this.field1230.field5542.method4113(arg1.method1582("uw_model_unlit", false, "dx"));
            this.field1227 = this.field1230.field5542.method4113(arg1.method1582("uw_model_lit", false, "dx"));
            if ((this.field1225 != null & this.field1224 != null & this.field1223 != null & this.field1227 != null)) {
                this.field1228 = this.field9945.method1520(new int[] { 0, -1 }, 1, false, 2, (byte) -121);
                this.field1228.method100(false, false, 104);
                this.field1226 = true;
            } else {
                this.field1226 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (arg0 == 10700 && this.field1229 != null) {
            IDirect3DDevice var2 = this.field1230.field5542;
            class474 var3 = this.field9945.method1466(1);
            var2.SetVertexShaderConstantF(8, var3.method2889((byte) -92, field1221), 2);
        }
    }

    @OriginalMember(owner = "client!vga", name = "c", descriptor = "(Z)V")
    public final void method390(boolean arg0) {
        if (!arg0 && this.field1229 != null) {
            IDirect3DDevice var2 = this.field1230.field5542;
            class474 var3 = this.field1230.method1403(94);
            var2.method4125(0, var3.method2893(field1221, (byte) 113));
        }
    }

    @OriginalMember(owner = "client!vga", name = "e", descriptor = "(Z)V")
    public final void method395(boolean arg0) {
        if (this.field1229 != null) {
            IDirect3DDevice var2 = this.field1230.field5542;
            int var3 = this.field9945.method1504();
            int var4 = this.field9945.method1426();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method4120(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method4120(11, 1.0F / (float) this.field9945.method1519(127), (float) this.field9945.method1401(-120) / 255.0F, this.field9945.field3345, 1.0F / (this.field9945.field3345 - this.field9945.field3399));
            this.field9945.method1414(this.field9945.method1525(0), (byte) -100);
        }
        if (arg0) {
            this.field1223 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(I)V")
    public final void method397(int arg0) {
        if (this.field1229 != null) {
            IDirect3DDevice var2 = this.field1230.field5542;
            class474 var3 = this.field1230.method1403(arg0 - 104);
            var2.method4125(0, var3.method2893(field1221, (byte) -10));
        }
        if (arg0 != -1) {
            this.method389(true);
        }
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(I)V")
    private final void method603(int arg0) {
        if (this.field1229 != null && this.field1222) {
            class474 var2 = this.field9945.method1433(2784);
            IDirect3DDevice var3 = this.field1230.field5542;
            var3.method4120(13, this.field9945.field3420 * this.field9945.field3354, this.field9945.field3413 * this.field9945.field3354, this.field9945.field3365 * this.field9945.field3354, 1.0F);
            var3.method4120(14, this.field9945.field3426 * this.field9945.field3420, this.field9945.field3426 * this.field9945.field3413, this.field9945.field3426 * this.field9945.field3365, 1.0F);
            var3.method4120(16, this.field9945.field3420 * this.field9945.field3418, this.field9945.field3418 * this.field9945.field3413, this.field9945.field3418 * this.field9945.field3365, 1.0F);
            var2.method2874(1, field1220, this.field9945.field3355[1], this.field9945.field3355[2], this.field9945.field3355[0]);
            var3.SetVertexShaderConstantF(15, field1220, 1);
            var2.method2874(1, field1220, this.field9945.field3381[1], this.field9945.field3381[2], this.field9945.field3381[0]);
            var3.SetVertexShaderConstantF(17, field1220, 1);
        }
        if (arg0 != -11496478) {
            this.field1226 = false;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(B)V")
    public final void method392(byte arg0) {
        if (arg0 >= -92) {
            this.method603(-53);
        }
        if (this.field1229 != null) {
            IDirect3DDevice var2 = this.field1230.field5542;
            var2.method4125(4, this.field9945.method1384(field1221, 9));
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(Z)V")
    public final void method604(boolean arg0) {
        IDirect3DDevice var2 = this.field1230.field5542;
        int var3 = this.field9945.method1468((byte) -31);
        class474 var4 = this.field9945.method1456(15903);
        IDirect3DVertexShader var5;
        if (this.field1222) {
            var5 = var3 == Integer.MAX_VALUE ? this.field1224 : this.field1227;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field1223 : this.field1225;
        }
        if (this.field1229 != var5) {
            this.field1229 = var5;
            this.field1230.method2424(false, var5);
            this.method603(-11496478);
            this.method392((byte) -109);
            this.method398(10700);
            this.method390(false);
            this.method397(-1);
            this.method395(!arg0);
        }
        var4.method2879(117, -1.0F, 0.0F, (float) var3, field1220, 0.0F);
        var2.method4125(12, field1220);
        if (!arg0) {
            this.method398(97);
        }
    }

    @OriginalMember(owner = "client!vga", name = "b", descriptor = "(Z)V")
    public final void method389(boolean arg0) {
        this.field9945.method1431(0, 1);
        this.field9945.method1458(399403340, null);
        this.field9945.method1388(class179.field2467, (byte) 52, class179.field2467);
        this.field9945.method1408(0, 0, class15.field140);
        this.field9945.method1408(2, 0, class520.field7247);
        this.field9945.method1528(class15.field140, arg0, 0);
        this.field9945.method1431(0, 0);
        if (this.field1231) {
            this.field9945.method1408(0, 0, class15.field140);
            this.field9945.method1528(class15.field140, false, 0);
            this.field1231 = false;
        }
        if (this.field1229 != null) {
            this.field1230.method2424(arg0, null);
            this.field1229 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "a", descriptor = "(BZ)V")
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 <= 39) {
            this.field1230 = null;
        }
    }

    @OriginalMember(owner = "client!vga", name = "d", descriptor = "(Z)Z")
    public final boolean method396(boolean arg0) {
        if (arg0) {
            this.field1227 = null;
        }
        return this.field1226;
    }
}
