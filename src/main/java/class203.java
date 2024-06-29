import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class203 extends class719 {

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "Luda;")
    private class475 field2629;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "Lgaa;")
    private class314 field2631;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2632;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "[F")
    private static float[] field2630 = new float[16];

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 5)
    public final void method219(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field2632 = null;
        }
        IDirect3DDevice var4 = this.field2629.field6676;
        if (this.field2631.field4433) {
            float var5 = (float) (this.field9776.field9602 % 4000) / 4000.0F;
            this.field9776.method3882(0, this.field2631.field4426);
            var4.method2960(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field9776.field9602 % 4000 * 16 / 4000;
            this.field9776.method3882(0, this.field2631.field4429[var6]);
            var4.method2960(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 31)
    public final void method714(int arg0) {
        if (arg0 != -22274) {
            this.field2631 = null;
        }
        if (this.field2632 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2629.field6676;
        class532 var3 = this.field9776.method3855(-31606);
        var3.method3089(field2630, 13362);
        field2630[6] *= 0.25F;
        field2630[1] *= 0.25F;
        field2630[2] *= 0.25F;
        field2630[4] *= 0.25F;
        field2630[7] *= 0.25F;
        field2630[0] *= 0.25F;
        field2630[3] *= 0.25F;
        field2630[5] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field2630, 2);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Luda;Luq;Lgaa;)V", line = 59)
    public class203(class475 arg0, class172 arg1, class314 arg2) {
        super(arg0);
        this.field2629 = arg0;
        this.field2631 = arg2;
        if (arg1 != null && this.field2631.method2011(false) && (this.field2629.field6663.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2632 = this.field2629.field6676.method2974(arg1.method1189("transparent_water", 0, "dx"));
        } else {
            this.field2632 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZZ)V", line = 76)
    public final void method225(boolean arg0, boolean arg1) {
        this.field9776.method3911(22228, class175.field2307, class328.field4644);
        if (!arg0) {
            this.method221(false, null, 105);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IZ)V", line = 86)
    public final void method222(int arg0, boolean arg1) {
        if (arg0 >= -126) {
            this.field2632 = null;
        }
        this.field9776.method3859(122, 0, class790.field10851);
        this.field9776.method3859(120, 1, class64.field840);
        this.field9776.method2812(2, true, class264.field3887, false, 0);
        this.field9776.method3845((byte) 54, false);
        this.field2629.method2782((byte) -104, this.field2632);
        this.method1337((byte) 127);
        this.method714(-22274);
        this.method1335(125);
        this.method673(-23970);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(B)Z", line = 104)
    public final boolean method218(byte arg0) {
        if (arg0 <= 16) {
            this.field2631 = null;
        }
        return this.field2632 != null;
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(I)V", line = 114)
    public final void method220(int arg0) {
        this.field2629.method2782((byte) -104, null);
        this.field9776.method3859(arg0 - 23237, 0, class790.field10851);
        this.field9776.method3859(118, 1, class264.field3887);
        if (arg0 != 23363) {
            this.method714(125);
        }
        this.field9776.method3859(123, 2, class64.field840);
        this.field9776.method3845((byte) 54, true);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZLb;I)V", line = 128)
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        if (!arg0) {
            this.field2629 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(I)V", line = 137)
    public final void method1335(int arg0) {
        if (arg0 <= 110) {
            field2630 = null;
        }
        if (this.field2632 != null) {
            IDirect3DDevice var2 = this.field2629.field6676;
            var2.method2969(4, this.field9776.method3910((byte) -123, field2630));
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)V", line = 157)
    public final void method1336(int arg0) {
        if (this.field2632 != null) {
            IDirect3DDevice var2 = this.field2629.field6676;
            class532 var3 = this.field2629.method3841(-7153);
            var2.method2969(0, var3.method3091(field2630, true));
        }
        if (arg0 != 256) {
            field2630 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 175)
    public final void method673(int arg0) {
        if (arg0 != -23970 || this.field2632 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2629.field6676;
        if (this.field9776.field9569 > 0) {
            float var3 = this.field9776.field9518;
            float var4 = this.field9776.field9556;
            float var5 = var4 - 512.0F;
            var2.method2960(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method2960(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field9776.method3838(this.field9776.field9515, Integer.MAX_VALUE);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V", line = 206)
    public final void method1337(byte arg0) {
        int var2 = 27 % ((arg0 - 73) / 40);
        if (this.field2632 != null) {
            IDirect3DDevice var3 = this.field2629.field6676;
            class532 var4 = this.field2629.method3841(-7153);
            var3.method2969(0, var4.method3091(field2630, true));
        }
    }
}
