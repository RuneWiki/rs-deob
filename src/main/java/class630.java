import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class630 extends class532 {

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Z")
    private boolean field8603 = false;

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Lus;")
    private class1 field8613;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8608;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8605;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8612;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8610;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "Lada;")
    private class175 field8602;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Z")
    private boolean field8607;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[F")
    private static float[] field8606 = new float[4];

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "[F")
    private static float[] field8611 = new float[16];

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8609;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "Z")
    private boolean field8604;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)V", line = 7)
    public final void method699(boolean arg0) {
        this.field7494.method2691(false, 1);
        this.field7494.method2643(-2, null);
        this.field7494.method2716(class269.field3180, 43, class269.field3180);
        this.field7494.method2694((byte) -49, 0, class507.field7214);
        this.field7494.method2694((byte) -49, 2, class555.field7718);
        this.field7494.method2703(class507.field7214, (byte) 59, 0);
        this.field7494.method2691(arg0, 0);
        if (this.field8603) {
            this.field7494.method2694((byte) -49, 0, class507.field7214);
            this.field7494.method2703(class507.field7214, (byte) -124, 0);
            this.field8603 = false;
        }
        if (this.field8609 != null) {
            this.field8613.method66((byte) 60, null);
            this.field8609 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V", line = 34)
    public final void method706(byte arg0) {
        if (arg0 >= -20) {
            this.method698((byte) -101);
        }
        if (this.field8609 != null) {
            IDirect3DDevice var2 = this.field8613.field27;
            class256 var3 = this.field8613.method2677(0);
            var2.method3061(0, var3.method1540(0, field8611));
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZI)V", line = 53)
    public final void method707(boolean arg0, int arg1) {
        if (arg1 != 30902) {
            this.method698((byte) 34);
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)Z", line = 63)
    public final boolean method703(byte arg0) {
        if (arg0 < 126) {
            this.method699(false);
        }
        return this.field8607;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZB)V", line = 75)
    public final void method702(boolean arg0, byte arg1) {
        this.field8604 = arg0;
        this.field7494.method2691(false, 1);
        if (arg1 != -10) {
            this.field8602 = null;
        }
        this.field7494.method2643(-2, this.field8602);
        this.field7494.method2716(class75.field1039, 56, class8.field135);
        this.field7494.method2694((byte) -49, 0, class555.field7718);
        this.field7494.method4(class507.field7214, true, (byte) 90, false, 2);
        this.field7494.method2703(class616.field8291, (byte) 98, 0);
        this.field7494.method2691(false, 0);
        this.method1371(64);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZILgaa;)V", line = 93)
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (arg2 != null) {
            if (this.field8603) {
                this.field7494.method2694((byte) -49, 0, class507.field7214);
                this.field7494.method2703(class507.field7214, (byte) -112, 0);
                this.field8603 = false;
            }
            this.field7494.method2643(-2, arg2);
            this.field7494.method2649((byte) 126, arg1);
        } else if (!this.field8603) {
            this.field7494.method2643(-2, this.field7494.field6257);
            this.field7494.method2649((byte) 126, 1);
            this.field7494.method2694((byte) -49, 0, class616.field8291);
            this.field7494.method2703(class616.field8291, (byte) -124, 0);
            this.field8603 = true;
        }
        if (!arg0) {
            this.field8602 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V", line = 128)
    public final void method698(byte arg0) {
        int var2 = -116 % ((arg0 - 68) / 40);
        if (this.field8609 != null) {
            IDirect3DDevice var3 = this.field8613.field27;
            class256 var4 = this.field8613.method2677(0);
            var3.method3061(0, var4.method1540(0, field8611));
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)V", line = 145)
    public final void method700(int arg0, byte arg1, int arg2) {
        if (arg1 != 94) {
            this.method1371(1);
        }
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V", line = 158)
    private final void method3564(int arg0) {
        if (this.field8609 != null && this.field8604) {
            class256 var2 = this.field7494.method2661(arg0 + 12890);
            IDirect3DDevice var3 = this.field8613.field27;
            var3.method3067(13, this.field7494.field6276 * this.field7494.field6255, this.field7494.field6323 * this.field7494.field6255, this.field7494.field6281 * this.field7494.field6255, 1.0F);
            var3.method3067(14, this.field7494.field6280 * this.field7494.field6276, this.field7494.field6323 * this.field7494.field6280, this.field7494.field6281 * this.field7494.field6280, 1.0F);
            var3.method3067(16, this.field7494.field6276 * this.field7494.field6241, this.field7494.field6323 * this.field7494.field6241, this.field7494.field6281 * this.field7494.field6241, 1.0F);
            var2.method1536(field8606, this.field7494.field6283[2], (byte) -125, this.field7494.field6283[0], this.field7494.field6283[1]);
            var3.SetVertexShaderConstantF(15, field8606, 1);
            var2.method1536(field8606, this.field7494.field6233[2], (byte) 20, this.field7494.field6233[0], this.field7494.field6233[1]);
            var3.SetVertexShaderConstantF(17, field8606, 1);
        }
        if (arg0 != 255) {
            this.field8609 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V", line = 183)
    public final void method704(byte arg0) {
        if (this.field8609 != null) {
            IDirect3DDevice var2 = this.field8613.field27;
            var2.method3061(4, this.field7494.method2709(field8611, (byte) -75));
        }
        if (arg0 <= 41) {
            this.method703((byte) 118);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lus;Lbt;)V", line = 198)
    public class630(class1 arg0, class48 arg1) {
        super(arg0);
        this.field8613 = arg0;
        if (arg1 == null || (this.field8613.field23.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8607 = false;
        } else {
            this.field8608 = this.field8613.field27.method3063(arg1.method436("dx", -3637, "uw_ground_unlit"));
            this.field8605 = this.field8613.field27.method3063(arg1.method436("dx", -3637, "uw_ground_lit"));
            this.field8612 = this.field8613.field27.method3063(arg1.method436("dx", -3637, "uw_model_unlit"));
            this.field8610 = this.field8613.field27.method3063(arg1.method436("dx", -3637, "uw_model_lit"));
            if (this.field8610 != null & this.field8608 != null & this.field8605 != null & this.field8612 != null) {
                this.field8602 = this.field7494.method2712(false, 2, 1, 0, new int[] { 0, -1 });
                this.field8602.method1198(false, false, (byte) -126);
                this.field8607 = true;
            } else {
                this.field8607 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V", line = 226)
    public final void method697(int arg0) {
        if (arg0 <= 14) {
            this.method707(true, 57);
        }
        if (this.field8609 != null) {
            IDirect3DDevice var2 = this.field8613.field27;
            class256 var3 = this.field7494.method2701(128);
            var2.SetVertexShaderConstantF(8, var3.method1530(4, field8611), 2);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V", line = 248)
    public final void method1371(int arg0) {
        if (arg0 != 64) {
            this.method706((byte) -85);
        }
        IDirect3DDevice var2 = this.field8613.field27;
        int var3 = this.field7494.method2668((byte) -78);
        class256 var4 = this.field7494.method2713(arg0 ^ 0xFFFFE817);
        IDirect3DVertexShader var5;
        if (this.field8604) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8605 : this.field8610;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8608 : this.field8612;
        }
        if (this.field8609 != var5) {
            this.field8609 = var5;
            this.field8613.method66((byte) 60, var5);
            this.method3564(arg0 ^ 0xBF);
            this.method704((byte) 104);
            this.method697(103);
            this.method698((byte) -49);
            this.method706((byte) -55);
            this.method705(arg0 ^ 0x66C);
        }
        var4.method1521(-1.0F, (byte) 123, (float) var3, 0.0F, 0.0F, field8606);
        var2.method3061(12, field8606);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V", line = 287)
    public final void method705(int arg0) {
        if (arg0 != 1580) {
            this.method697(72);
        }
        if (this.field8609 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8613.field27;
        int var3 = this.field7494.method568();
        int var4 = this.field7494.method610();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method3067(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method3067(11, 1.0F / (float) this.field7494.method2654((byte) -118), (float) this.field7494.method2660((byte) -1) / 255.0F, this.field7494.field6258, 1.0F / (this.field7494.field6258 - this.field7494.field6278));
        this.field7494.method2673(this.field7494.method2680(arg0 ^ 0x624), arg0 ^ 0x652);
    }
}
