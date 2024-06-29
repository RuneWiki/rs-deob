import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class736 extends class532 {

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "Lrfa;")
    private class213 field10281;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "Lus;")
    private class1 field10280;

    @OriginalMember(owner = "client!ip", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10278;

    @OriginalMember(owner = "client!ip", name = "q", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field10279;

    @OriginalMember(owner = "client!ip", name = "o", descriptor = "Z")
    private boolean field10277;

    @OriginalMember(owner = "client!ip", name = "n", descriptor = "[F")
    private static float[] field10276 = new float[16];

    @OriginalMember(owner = "client!ip", name = "m", descriptor = "Z")
    private boolean field10275;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZILgaa;)V")
    public final void method701(boolean arg0, int arg1, class315 arg2) {
        if (!arg0) {
            this.field10279 = null;
        }
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lus;Lbt;Lrfa;)V")
    public class736(class1 arg0, class48 arg1, class213 arg2) {
        super(arg0);
        this.field10281 = arg2;
        this.field10280 = arg0;
        if (arg1 != null && this.field7494.field6240 && this.field7494.field6308 && (this.field10280.field23.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field10278 = this.field10280.field27.method3063(arg1.method436("dx", -3637, "environment_mapped_water_v"));
            this.field10279 = this.field10280.field27.method3066(arg1.method436("dx", -3637, "environment_mapped_water_f"));
            this.field10277 = this.field10278 != null && this.field10279 != null && this.field10281.method1341(-88);
        } else {
            this.field10279 = null;
            this.field10278 = null;
            this.field10277 = false;
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
    public final void method705(int arg0) {
        if (arg0 != 1580) {
            this.method703((byte) -120);
        }
        if (!this.field10275) {
            return;
        }
        IDirect3DDevice var2 = this.field10280.field27;
        if (this.field7494.field6231 > 0) {
            float var3 = this.field7494.field6258;
            float var4 = this.field7494.field6278;
            var2.method3067(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method3067(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method3064(0, (float) ((this.field7494.field6307 & 0xFFEFB1) >> 16) / 255.0F, (float) ((this.field7494.field6307 & 0xFF86) >> 8) / 255.0F, (float) (this.field7494.field6307 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)V")
    public final void method697(int arg0) {
        if (this.field10275) {
            IDirect3DDevice var2 = this.field10280.field27;
            class256 var3 = this.field7494.method2701(128);
            var2.SetVertexShaderConstantF(12, var3.method1530(4, field10276), 2);
        }
        if (arg0 <= 14) {
            this.method698((byte) 14);
        }
    }

    @OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
    public final void method706(byte arg0) {
        if (arg0 >= -20) {
            this.method705(52);
        }
        if (!this.field10275) {
            return;
        }
        IDirect3DDevice var2 = this.field10280.field27;
        class256 var3 = this.field10280.method2713(-6057);
        class256 var4 = this.field10280.method2677(0);
        var2.method3061(0, var4.method1540(0, field10276));
        var2.method3061(4, var3.method1524(false, field10276));
    }

    @OriginalMember(owner = "client!ip", name = "d", descriptor = "(B)Z")
    public final boolean method703(byte arg0) {
        return arg0 <= 126 ? true : this.field10277;
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
    public final void method700(int arg0, byte arg1, int arg2) {
        if (arg1 != 94 || !this.field10275) {
            return;
        }
        IDirect3DDevice var4 = this.field10280.field27;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x3C) >> 3)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
        var4.method3067(14, (float) (this.field7494.field6229 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method3067(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method3064(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method3064(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)V")
    public final void method707(boolean arg0, int arg1) {
        if (arg1 != 30902) {
            this.method706((byte) -40);
        }
    }

    @OriginalMember(owner = "client!ip", name = "c", descriptor = "(B)V")
    public final void method704(byte arg0) {
        if (arg0 >= 41 && this.field10275) {
            IDirect3DDevice var2 = this.field10280.field27;
            var2.method3061(8, this.field7494.method2709(field10276, (byte) -101));
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public final void method698(byte arg0) {
        int var2 = -70 / ((arg0 - 68) / 40);
        if (this.field10275) {
            IDirect3DDevice var3 = this.field10280.field27;
            class256 var4 = this.field10280.method2677(0);
            var3.method3061(0, var4.method1540(0, field10276));
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(Z)V")
    public final void method699(boolean arg0) {
        if (this.field10275) {
            this.field10280.method66((byte) 60, null);
            this.field10280.method10(21, null);
            this.field7494.method2691(false, 1);
            this.field7494.method2643(-2, null);
            this.field7494.method2691(false, 0);
            this.field7494.method2643(-2, null);
            this.field10275 = false;
        }
        if (arg0) {
            this.method701(false, -9, null);
        }
    }

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZB)V")
    public final void method702(boolean arg0, byte arg1) {
        class69 var3 = this.field7494.method2676(0);
        if (arg1 != -10) {
            this.field10277 = true;
        }
        if (!this.field10277 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field10280.field27;
        this.field10280.method66((byte) 60, this.field10278);
        this.field10280.method10(21, this.field10279);
        this.field7494.method2691(false, 1);
        this.field7494.method2643(-2, var3);
        this.field7494.method2691(false, 0);
        this.field7494.method2643(-2, this.field10281.field2510);
        this.field10275 = true;
        this.method706((byte) -125);
        this.method697(arg1 ^ 0xFFFFFFBB);
        this.method704((byte) 116);
        this.method705(arg1 ^ 0xFFFFF9DA);
        var4.method3064(1, -this.field7494.field6283[0], -this.field7494.field6283[1], -this.field7494.field6283[2], 0.0F);
        var4.method3064(2, this.field7494.field6276, this.field7494.field6323, this.field7494.field6281, 1.0F);
        var4.method3064(3, Math.abs(this.field7494.field6283[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }
}
