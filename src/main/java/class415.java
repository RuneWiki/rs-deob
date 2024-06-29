import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class415 extends class741 {

    @OriginalMember(owner = "client!sea", name = "m", descriptor = "Lsga;")
    private class608 field5799;

    @OriginalMember(owner = "client!sea", name = "n", descriptor = "Loca;")
    private class639 field5800;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5797;

    @OriginalMember(owner = "client!sea", name = "l", descriptor = "[F")
    private static float[] field5798 = new float[16];

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        if (arg0 >= -37) {
            return true;
        } else {
            return this.field5797 != null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        if (arg0 < 15) {
            return;
        }
        this.field10209.method1409(class157.field2039, 0, -109);
        this.field10209.method1409(class41.field423, 1, -115);
        this.field10209.method1469(true, 2, false, class656.field9260, false);
        this.field10209.method1452(126, false);
        this.field5799.method3518(0, this.field5797);
        this.method427(0);
        this.method426((byte) -118);
        this.method431(-1);
        this.method424(-56);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field5799.field8555;
        if (this.field5800.field8984) {
            float var5 = (float) (this.field10209.field3373 % 4000) / 4000.0F;
            this.field10209.method1492(this.field5800.field8983, 2);
            var4.method4179(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field10209.field3373 % 4000 * 16 / 4000;
            this.field10209.method1492(this.field5800.field8980[var6], 2);
            var4.method4179(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        int var7 = 122 / ((arg2 + 18) / 51);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (arg0 >= -91 || this.field5797 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5799.field8555;
        class517 var3 = this.field10209.method1500(15720);
        var3.method3074(4, field5798);
        field5798[7] *= 0.25F;
        field5798[5] *= 0.25F;
        field5798[3] *= 0.25F;
        field5798[1] *= 0.25F;
        field5798[4] *= 0.25F;
        field5798[2] *= 0.25F;
        field5798[6] *= 0.25F;
        field5798[0] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field5798, 2);
    }

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        this.field5799.method3518(0, null);
        this.field10209.method1409(class157.field2039, 0, -126);
        this.field10209.method1409(class656.field9260, 1, -109);
        this.field10209.method1409(class41.field423, 2, -112);
        this.field10209.method1452(125, true);
        int var2 = -31 / ((arg0 - 10) / 44);
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        this.field10209.method1494(class495.field6817, 775, class587.field8280);
        if (arg0 <= 96) {
            field5798 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.method428(true);
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        if (this.field5797 != null) {
            IDirect3DDevice var2 = this.field5799.field8555;
            class517 var3 = this.field5799.method1423(1);
            var2.method4173(0, var3.method3087(field5798, -58));
        }
        if (!arg0) {
            this.method426((byte) 104);
        }
    }

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (this.field5797 != null) {
            IDirect3DDevice var2 = this.field5799.field8555;
            class517 var3 = this.field5799.method1423(1);
            var2.method4173(0, var3.method3087(field5798, -77));
        }
        if (arg0 != 0) {
            this.field5799 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (this.field5797 != null) {
            IDirect3DDevice var2 = this.field5799.field8555;
            if (this.field10209.field3377 <= 0) {
                var2.method4179(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field10209.field3291;
                float var4 = this.field10209.field3296;
                float var5 = var4 - 512.0F;
                var2.method4179(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field10209.method1468((byte) 67, this.field10209.field3334);
        }
        if (arg0 > -3) {
            this.method430(76, false);
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(Lsga;Lae;Loca;)V")
    public class415(class608 arg0, class283 arg1, class639 arg2) {
        super(arg0);
        this.field5799 = arg0;
        this.field5800 = arg2;
        if (arg1 != null && this.field5800.method3674(7) && (this.field5799.field8561.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5797 = this.field5799.field8555.method4180(arg1.method1861(true, "dx", "transparent_water"));
        } else {
            this.field5797 = null;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (this.field5797 != null) {
            IDirect3DDevice var2 = this.field5799.field8555;
            var2.method4173(4, this.field10209.method1453((byte) 61, field5798));
        }
        if (arg0 != -1) {
            this.field5797 = null;
        }
    }
}
