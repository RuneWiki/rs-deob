import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mha")
public class class416 extends class648 {

    @OriginalMember(owner = "client!mha", name = "m", descriptor = "Lfi;")
    private class558 field6233;

    @OriginalMember(owner = "client!mha", name = "o", descriptor = "Lpba;")
    private class333 field6235;

    @OriginalMember(owner = "client!mha", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6234;

    @OriginalMember(owner = "client!mha", name = "l", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field6232;

    @OriginalMember(owner = "client!mha", name = "p", descriptor = "Z")
    private boolean field6236;

    @OriginalMember(owner = "client!mha", name = "r", descriptor = "[F")
    private static float[] field6238 = new float[16];

    @OriginalMember(owner = "client!mha", name = "q", descriptor = "Z")
    private boolean field6237;

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(Z)V", line = 4)
    public final void method2628(boolean arg0) {
        if (!arg0 || !this.field6237) {
            return;
        }
        IDirect3DDevice var2 = this.field6233.field7959;
        class441 var3 = this.field6233.method2347((byte) -113);
        class441 var4 = this.field6233.method2338(1);
        var2.method2911(0, var4.method2741(field6238, 7));
        var2.method2911(4, var3.method2726(field6238, (byte) -66));
    }

    @OriginalMember(owner = "client!mha", name = "b", descriptor = "(B)V", line = 26)
    public final void method2629(byte arg0) {
        if (this.field6237) {
            IDirect3DDevice var2 = this.field6233.field7959;
            class441 var3 = this.field6233.method2338(arg0 - 5);
            var2.method2911(0, var3.method2741(field6238, 7));
        }
        if (arg0 != 6) {
            this.method2629((byte) 52);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZZ)V", line = 45)
    public final void method1451(boolean arg0, boolean arg1) {
        if (arg0) {
            this.field6236 = false;
        }
        class584 var3 = this.field9139.method2303((byte) 124);
        if (!this.field6236 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field6233.field7959;
        this.field6233.method3263(this.field6234, -94);
        this.field6233.method3259((byte) 80, this.field6232);
        this.field9139.method2375((byte) -126, 1);
        this.field9139.method2294(var3, -2);
        this.field9139.method2375((byte) 87, 0);
        this.field9139.method2294(this.field6235.field4777, -2);
        this.field6237 = true;
        this.method2628(true);
        this.method2631(true);
        this.method2630(!arg0);
        this.method2498(!arg0);
        var4.method2913(1, -this.field9139.field5617[0], -this.field9139.field5617[1], -this.field9139.field5617[2], 0.0F);
        var4.method2913(2, this.field9139.field5602, this.field9139.field5639, this.field9139.field5576, 1.0F);
        var4.method2913(3, Math.abs(this.field9139.field5617[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(BII)V", line = 78)
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (this.field6237) {
            IDirect3DDevice var4 = this.field6233.field7959;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x3B97B) >> 16) / 8.0F;
            var4.method2915(14, (float) (this.field9139.field5552 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2915(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2913(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2913(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 <= 33) {
            this.field6234 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "<init>", descriptor = "(Lfi;Lvd;Lpba;)V", line = 105)
    public class416(class558 arg0, class39 arg1, class333 arg2) {
        super(arg0);
        this.field6233 = arg0;
        this.field6235 = arg2;
        if (arg1 != null && this.field9139.field5616 && this.field9139.field5605 && (this.field6233.field7955.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6234 = this.field6233.field7959.method2907(arg1.method233(-99, "dx", "environment_mapped_water_v"));
            this.field6232 = this.field6233.field7959.method2905(arg1.method233(-126, "dx", "environment_mapped_water_f"));
            this.field6236 = this.field6234 != null && this.field6232 != null && this.field6235.method2100(29275);
        } else {
            this.field6236 = false;
            this.field6234 = null;
            this.field6232 = null;
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Z)V", line = 129)
    public final void method2630(boolean arg0) {
        if (arg0 && this.field6237) {
            IDirect3DDevice var2 = this.field6233.field7959;
            var2.method2911(8, this.field9139.method2372(field6238, (byte) -70));
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(ZI)V", line = 147)
    public final void method1448(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method2630(true);
        }
    }

    @OriginalMember(owner = "client!mha", name = "c", descriptor = "(I)Z", line = 157)
    public final boolean method1449(int arg0) {
        return arg0 == 13003 ? this.field6236 : true;
    }

    @OriginalMember(owner = "client!mha", name = "e", descriptor = "(Z)V", line = 167)
    public final void method2631(boolean arg0) {
        if (this.field6237) {
            IDirect3DDevice var2 = this.field6233.field7959;
            class441 var3 = this.field9139.method2350((byte) 37);
            var2.SetVertexShaderConstantF(12, var3.method2733((byte) 124, field6238), 2);
        }
        if (!arg0) {
            this.method1449(-48);
        }
    }

    @OriginalMember(owner = "client!mha", name = "a", descriptor = "(Lbca;II)V", line = 185)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        if (arg1 != 12885) {
            this.method2629((byte) 83);
        }
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(I)V", line = 194)
    public final void method1450(int arg0) {
        if (arg0 >= -67 || !this.field6237) {
            return;
        }
        this.field6233.method3263(null, -8);
        this.field6233.method3259((byte) 80, null);
        this.field9139.method2375((byte) 17, 1);
        this.field9139.method2294(null, -2);
        this.field9139.method2375((byte) 55, 0);
        this.field9139.method2294(null, -2);
        this.field6237 = false;
    }

    @OriginalMember(owner = "client!mha", name = "d", descriptor = "(Z)V", line = 215)
    public final void method2498(boolean arg0) {
        if (this.field6237) {
            IDirect3DDevice var2 = this.field6233.field7959;
            if (this.field9139.field5620 <= 0) {
                var2.method2915(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field9139.field5627;
                float var4 = this.field9139.field5638;
                var2.method2915(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2913(0, (float) (this.field9139.field5637 >> 16 & 0xFF) / 255.0F, (float) ((this.field9139.field5637 & 0xFFE5) >> 8) / 255.0F, (float) (this.field9139.field5637 & 0xFF) / 255.0F, 0.0F);
        }
        if (!arg0) {
            this.field6233 = null;
        }
    }
}
