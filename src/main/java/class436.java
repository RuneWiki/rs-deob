import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class436 extends class648 {

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Lfi;")
    private class558 field6471;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Lpba;")
    private class333 field6473;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6474;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "[F")
    private static float[] field6472 = new float[16];

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lfi;Lvd;Lpba;)V")
    public class436(class558 arg0, class39 arg1, class333 arg2) {
        super(arg0);
        this.field6471 = arg0;
        this.field6473 = arg2;
        if (arg1 != null && this.field6473.method2102(0) && (this.field6471.field7955.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6474 = this.field6471.field7959.method2907(arg1.method233(-105, "dx", "transparent_water"));
        } else {
            this.field6474 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)Z")
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            this.method2498(true);
        }
        return this.field6474 != null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BII)V")
    public final void method1453(byte arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field6471.field7959;
        if (arg0 <= 33) {
            return;
        }
        if (this.field6473.field4782) {
            float var6 = (float) (this.field9139.field5552 % 4000) / 4000.0F;
            this.field9139.method2294(this.field6473.field4775, -2);
            var4.method2915(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field9139.field5552 % 4000 * 16 / 4000;
            this.field9139.method2294(this.field6473.field4779[var5], -2);
            var4.method2915(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(Z)V")
    public final void method2628(boolean arg0) {
        if (this.field6474 != null) {
            IDirect3DDevice var2 = this.field6471.field7959;
            class441 var3 = this.field6471.method2338(1);
            var2.method2911(0, var3.method2741(field6472, 7));
        }
        if (!arg0) {
            field6472 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(I)V")
    public final void method1450(int arg0) {
        this.field6471.method3263(null, 125);
        this.field9139.method2329(0, (byte) -125, class331.field4759);
        this.field9139.method2329(1, (byte) -126, class10.field152);
        this.field9139.method2329(2, (byte) -126, class469.field6850);
        if (arg0 <= -67) {
            this.field9139.method2388(1, true);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZI)V")
    public final void method1448(boolean arg0, int arg1) {
        this.field9139.method2300(class661.field9242, class49.field706, arg1 + arg1);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lbca;II)V")
    public final void method1455(class663 arg0, int arg1, int arg2) {
        if (arg1 != 12885) {
            this.method1448(false, -124);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ZZ)V")
    public final void method1451(boolean arg0, boolean arg1) {
        this.field9139.method2329(0, (byte) -128, class331.field4759);
        this.field9139.method2329(1, (byte) -124, class469.field6850);
        this.field9139.method2340(class10.field152, false, 2, true, true);
        this.field9139.method2388(1, arg0);
        this.field6471.method3263(this.field6474, 126);
        this.method2629((byte) 6);
        this.method2631(!arg0);
        this.method2630(!arg0);
        this.method2498(true);
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)V")
    public final void method2629(byte arg0) {
        if (this.field6474 != null) {
            IDirect3DDevice var2 = this.field6471.field7959;
            class441 var3 = this.field6471.method2338(1);
            var2.method2911(0, var3.method2741(field6472, arg0 + 1));
        }
        if (arg0 != 6) {
            field6472 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Z)V")
    public final void method2630(boolean arg0) {
        if (this.field6474 != null) {
            IDirect3DDevice var2 = this.field6471.field7959;
            var2.method2911(4, this.field9139.method2372(field6472, (byte) -70));
        }
        if (!arg0) {
            this.method1455(null, -68, 44);
        }
    }

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "(Z)V")
    public final void method2631(boolean arg0) {
        if (!arg0 || this.field6474 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6471.field7959;
        class441 var3 = this.field9139.method2350((byte) 37);
        var3.method2733((byte) 125, field6472);
        field6472[2] *= 0.25F;
        field6472[3] *= 0.25F;
        field6472[5] *= 0.25F;
        field6472[6] *= 0.25F;
        field6472[1] *= 0.25F;
        field6472[7] *= 0.25F;
        field6472[0] *= 0.25F;
        field6472[4] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field6472, 2);
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(Z)V")
    public final void method2498(boolean arg0) {
        if (this.field6474 != null) {
            IDirect3DDevice var2 = this.field6471.field7959;
            if (this.field9139.field5620 > 0) {
                float var3 = this.field9139.field5627;
                float var4 = this.field9139.field5638;
                float var5 = var4 - 512.0F;
                var2.method2915(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2915(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field9139.method2415(this.field9139.field5637, 0);
        }
        if (!arg0) {
            this.method1450(116);
        }
    }
}
