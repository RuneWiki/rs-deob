import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class51 extends class741 {

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lsga;")
    private class608 field611;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Loca;")
    private class639 field606;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field608;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field610;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Z")
    private boolean field607;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[F")
    private static float[] field612 = new float[16];

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Z")
    private boolean field609;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public final void method424(int arg0) {
        if (arg0 > -3 || !this.field609) {
            return;
        }
        IDirect3DDevice var2 = this.field611.field8555;
        if (this.field10209.field3377 <= 0) {
            var2.method4179(16, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field10209.field3291;
            float var4 = this.field10209.field3296;
            var2.method4179(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        }
        var2.method4190(0, (float) ((this.field10209.field3334 & 0xFF4F7C) >> 16) / 255.0F, (float) (this.field10209.field3334 >> 8 & 0xFF) / 255.0F, (float) (this.field10209.field3334 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        return arg0 > -37 ? false : this.field607;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (this.field609) {
            IDirect3DDevice var2 = this.field611.field8555;
            class517 var3 = this.field10209.method1500(15720);
            var2.SetVertexShaderConstantF(12, var3.method3074(4, field612), 2);
        }
        if (arg0 >= -91) {
            this.method429((byte) 45, true);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public final void method427(int arg0) {
        if (this.field609) {
            IDirect3DDevice var2 = this.field611.field8555;
            class517 var3 = this.field611.method1423(1);
            var2.method4173(0, var3.method3087(field612, arg0 - 77));
        }
        if (arg0 != 0) {
            this.field610 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lsga;Lae;Loca;)V")
    public class51(class608 arg0, class283 arg1, class639 arg2) {
        super(arg0);
        this.field611 = arg0;
        this.field606 = arg2;
        if (arg1 != null && this.field10209.field3356 && this.field10209.field3363 && (this.field611.field8561.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field608 = this.field611.field8555.method4180(arg1.method1861(true, "dx", "environment_mapped_water_v"));
            this.field610 = this.field611.field8555.method4188(arg1.method1861(true, "dx", "environment_mapped_water_f"));
            this.field607 = this.field608 != null && this.field610 != null && this.field606.method3675((byte) 91);
        } else {
            this.field610 = null;
            this.field607 = false;
            this.field608 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public final void method428(boolean arg0) {
        if (!arg0) {
            this.field610 = null;
        }
        if (!this.field609) {
            return;
        }
        IDirect3DDevice var2 = this.field611.field8555;
        class517 var3 = this.field611.method1399(0);
        class517 var4 = this.field611.method1423(1);
        var2.method4173(0, var4.method3087(field612, -126));
        var2.method4173(4, var3.method3090((byte) 115, field612));
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        if (arg0 < 15) {
            this.field610 = null;
        }
        class596 var3 = this.field10209.method1487(0);
        if (!this.field607 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field611.field8555;
        this.field611.method3518(0, this.field608);
        this.field611.method3526(this.field610, -112);
        this.field10209.method1473(1, (byte) 120);
        this.field10209.method1492(var3, 2);
        this.field10209.method1473(0, (byte) 123);
        this.field10209.method1492(this.field606.field8989, 2);
        this.field609 = true;
        this.method428(true);
        this.method426((byte) -100);
        this.method431(-1);
        this.method424(-18);
        var4.method4190(1, -this.field10209.field3314[0], -this.field10209.field3314[1], -this.field10209.field3314[2], 0.0F);
        var4.method4190(2, this.field10209.field3305, this.field10209.field3323, this.field10209.field3375, 1.0F);
        var4.method4190(3, Math.abs(this.field10209.field3314[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        if (arg0 < 96) {
            this.field608 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method431(int arg0) {
        if (arg0 == -1 && this.field609) {
            IDirect3DDevice var2 = this.field611.field8555;
            var2.method4173(8, this.field10209.method1453((byte) 61, field612));
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        if (this.field609) {
            IDirect3DDevice var4 = this.field611.field8555;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << ((arg0 & 0x3E) >> 3)) / 32.0F;
            int var7 = arg1 & 0xFFFF;
            float var8 = (float) ((arg1 & 0x3D1AF) >> 16) / 8.0F;
            var4.method4179(14, (float) (this.field10209.field3373 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method4179(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method4190(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method4190(5, var8, 0.0F, 0.0F, 0.0F);
        }
        int var9 = -90 / ((arg2 + 18) / 51);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            this.method429((byte) 25, false);
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        int var2 = -71 / ((10 - arg0) / 44);
        if (!this.field609) {
            return;
        }
        this.field611.method3518(0, null);
        this.field611.method3526(null, -57);
        this.field10209.method1473(1, (byte) 54);
        this.field10209.method1492(null, 2);
        this.field10209.method1473(0, (byte) 62);
        this.field10209.method1492(null, 2);
        this.field609 = false;
    }
}
