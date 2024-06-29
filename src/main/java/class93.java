import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class93 extends class712 {

    @OriginalMember(owner = "client!vfa", name = "u", descriptor = "Lkfa;")
    private class386 field1289;

    @OriginalMember(owner = "client!vfa", name = "s", descriptor = "Lep;")
    private class374 field1287;

    @OriginalMember(owner = "client!vfa", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1288;

    @OriginalMember(owner = "client!vfa", name = "r", descriptor = "[F")
    private static float[] field1286 = new float[16];

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method399(boolean arg0, byte arg1) {
        this.field9945.method1408(0, 0, class15.field140);
        this.field9945.method1408(1, 0, class520.field7247);
        this.field9945.method324(2, false, -9608, class684.field9515, true);
        this.field9945.method1409(false, -10521);
        this.field1289.method2424(false, this.field1288);
        if (arg1 < 44) {
            this.field1289 = null;
        }
        this.method390(false);
        this.method398(10700);
        this.method392((byte) -118);
        this.method395(false);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(Z)V", line = 22)
    public final void method389(boolean arg0) {
        this.field1289.method2424(arg0, null);
        this.field9945.method1408(0, 0, class15.field140);
        this.field9945.method1408(1, 0, class684.field9515);
        this.field9945.method1408(2, 0, class520.field7247);
        this.field9945.method1409(true, -10521);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BZ)V", line = 33)
    public final void method394(byte arg0, boolean arg1) {
        this.field9945.method1388(class161.field2237, (byte) 52, class370.field5228);
        if (arg0 < 39) {
            this.field1289 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(III)V", line = 45)
    public final void method393(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field1289.field5542;
        if (arg2 <= 96) {
            return;
        }
        if (this.field1287.field5268) {
            float var5 = (float) (this.field9945.field3380 % 4000) / 4000.0F;
            this.field9945.method1458(399403340, this.field1287.field5259);
            var4.method4120(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field9945.field3380 % 4000 * 16 / 4000;
            this.field9945.method1458(399403340, this.field1287.field5262[var6]);
            var4.method4120(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 72)
    public final void method397(int arg0) {
        if (arg0 != -1) {
            this.field1289 = null;
        }
        if (this.field1288 != null) {
            IDirect3DDevice var2 = this.field1289.field5542;
            class474 var3 = this.field1289.method1403(50);
            var2.method4125(0, var3.method2893(field1286, (byte) -111));
        }
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(I)V", line = 91)
    public final void method398(int arg0) {
        if (arg0 != 10700) {
            this.method399(true, (byte) 110);
        }
        if (this.field1288 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1289.field5542;
        class474 var3 = this.field9945.method1466(1);
        var3.method2889((byte) -88, field1286);
        field1286[0] *= 0.25F;
        field1286[1] *= 0.25F;
        field1286[7] *= 0.25F;
        field1286[4] *= 0.25F;
        field1286[5] *= 0.25F;
        field1286[6] *= 0.25F;
        field1286[3] *= 0.25F;
        field1286[2] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field1286, 2);
    }

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "(Z)V", line = 122)
    public final void method395(boolean arg0) {
        if (arg0) {
            this.method391(52, -54, null);
        }
        if (this.field1288 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field1289.field5542;
        if (this.field9945.field3406 <= 0) {
            var2.method4120(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field9945.field3345;
            float var4 = this.field9945.field3399;
            float var5 = var4 - 512.0F;
            var2.method4120(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field9945.method1414(this.field9945.field3405, (byte) -100);
    }

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "(Z)V", line = 152)
    public final void method390(boolean arg0) {
        if (this.field1288 != null) {
            IDirect3DDevice var2 = this.field1289.field5542;
            class474 var3 = this.field1289.method1403(99);
            var2.method4125(0, var3.method2893(field1286, (byte) 102));
        }
        if (arg0) {
            this.method390(true);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lkfa;Luu;Lep;)V", line = 171)
    public class93(class386 arg0, class237 arg1, class374 arg2) {
        super(arg0);
        this.field1289 = arg0;
        this.field1287 = arg2;
        if (arg1 != null && this.field1287.method2350(2) && (this.field1289.field5536.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1288 = this.field1289.field5542.method4113(arg1.method1582("transparent_water", false, "dx"));
        } else {
            this.field1288 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IILhba;)V", line = 188)
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 != 0) {
            field1286 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)V", line = 197)
    public final void method392(byte arg0) {
        if (arg0 >= -92) {
            this.method396(false);
        }
        if (this.field1288 != null) {
            IDirect3DDevice var2 = this.field1289.field5542;
            var2.method4125(4, this.field9945.method1384(field1286, 9));
        }
    }

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "(Z)Z", line = 213)
    public final boolean method396(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            return this.field1288 != null;
        }
    }
}
