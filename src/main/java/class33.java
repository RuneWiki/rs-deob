import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class33 extends class584 {

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Lgb;")
    private class197 field381;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field383;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field382;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field388;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field390;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "Z")
    private boolean field384;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[F")
    private static float[] field385 = new float[4];

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[F")
    private static float[] field387 = new float[16];

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field389;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "Z")
    private boolean field386;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 4)
    public final void method173(int arg0) {
        if (arg0 == -1 && this.field389 != null) {
            IDirect3DDevice var2 = this.field381.field2376;
            class667 var3 = this.field381.method2737(0);
            var2.method2436(0, var3.method3745(field387, false));
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V", line = 24)
    public final void method174(int arg0) {
        int var2 = 93 / ((arg0 - 86) / 40);
        if (this.field389 != null) {
            this.field381.field2376.SetVertexShader(null);
            this.field389 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 39)
    public final void method175(int arg0, int arg1, int arg2) {
        if (arg2 < 116) {
            this.method176(-17);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 48)
    public final void method176(int arg0) {
        if (arg0 != 20197) {
            this.method181(-78);
        }
        if (this.field389 != null) {
            IDirect3DDevice var2 = this.field381.field2376;
            var2.method2436(4, this.field8309.method2713(field387, 19876));
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lgb;Ljo;)V", line = 66)
    public class33(class197 arg0, class303 arg1) {
        super(arg0);
        this.field381 = arg0;
        if ((this.field381.field2379.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field383 = this.field381.field2376.method2444(arg1.method1734("uw_ground_unlit", 11434, "dx"));
            this.field382 = this.field381.field2376.method2444(arg1.method1734("uw_ground_lit", 11434, "dx"));
            this.field388 = this.field381.field2376.method2444(arg1.method1734("uw_model_unlit", 11434, "dx"));
            this.field390 = this.field381.field2376.method2444(arg1.method1734("uw_model_lit", 11434, "dx"));
            this.field384 = this.field383 != null & this.field382 != null & this.field388 != null & this.field390 != null;
        } else {
            this.field384 = false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZZ)V", line = 86)
    public final void method177(boolean arg0, boolean arg1) {
        if (!arg1) {
            this.method179((byte) -37);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)Z", line = 95)
    public final boolean method178(byte arg0) {
        if (arg0 >= -6) {
            this.method182((byte) -79);
        }
        return this.field384;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 105)
    public final void method179(byte arg0) {
        if (this.field389 != null) {
            IDirect3DDevice var2 = this.field381.field2376;
            int var3 = this.field8309.method321();
            int var4 = this.field8309.method337();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2439(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2439(11, 1.0F / (float) this.field8309.method2739((byte) 102), (float) this.field8309.method2682(126) / 255.0F, 0.0F, 0.0F);
        }
        if (arg0 <= 26) {
            this.field386 = false;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(ZI)V", line = 130)
    public final void method180(boolean arg0, int arg1) {
        if (arg1 != -1) {
            this.method173(-108);
        }
        this.field386 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 141)
    public final void method181(int arg0) {
        if (arg0 <= 59) {
            this.method182((byte) 100);
        }
        if (this.field389 != null) {
            IDirect3DDevice var2 = this.field381.field2376;
            class667 var3 = this.field381.method2737(0);
            var2.method2436(0, var3.method3745(field387, false));
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 162)
    public final void method182(byte arg0) {
        if (this.field389 != null) {
            IDirect3DDevice var2 = this.field381.field2376;
            class667 var3 = this.field8309.method2691(-97);
            var2.SetVertexShaderConstantF(8, var3.method3743(field387, false), 2);
        }
        int var4 = 118 / ((arg0 - 66) / 54);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 180)
    private final void method183(boolean arg0) {
        if (arg0 || this.field389 == null || !this.field386) {
            return;
        }
        class667 var2 = this.field8309.method2708((byte) 124);
        IDirect3DDevice var3 = this.field381.field2376;
        var3.method2439(13, this.field8309.field6873 * this.field8309.field6864, this.field8309.field6873 * this.field8309.field6861, this.field8309.field6873 * this.field8309.field6817, 1.0F);
        var3.method2439(14, this.field8309.field6864 * this.field8309.field6854, this.field8309.field6861 * this.field8309.field6854, this.field8309.field6854 * this.field8309.field6817, 1.0F);
        var3.method2439(16, this.field8309.field6864 * this.field8309.field6852, this.field8309.field6861 * this.field8309.field6852, this.field8309.field6852 * this.field8309.field6817, 1.0F);
        var2.method3750(field385, this.field8309.field6827[1], this.field8309.field6827[0], (byte) -5, this.field8309.field6827[2]);
        var3.SetVertexShaderConstantF(15, field385, 1);
        var2.method3750(field385, this.field8309.field6859[1], this.field8309.field6859[0], (byte) -5, this.field8309.field6859[2]);
        var3.SetVertexShaderConstantF(15, field385, 1);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 214)
    public final void method184(int arg0) {
        IDirect3DDevice var2 = this.field381.field2376;
        int var3 = this.field8309.method2707(1);
        if (arg0 > -19) {
            this.method183(true);
        }
        class667 var4 = this.field8309.method2708((byte) 124);
        IDirect3DVertexShader var5;
        if (this.field386) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field382 : this.field390;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field383 : this.field388;
        }
        if (this.field389 != var5) {
            this.field389 = var5;
            var2.SetVertexShader(var5);
            this.method183(false);
            this.method176(20197);
            this.method182((byte) 127);
            this.method181(118);
            this.method173(-1);
            this.method179((byte) 101);
        }
        var4.method3744(0.0F, 0.0F, (float) var3, 1, field385, -1.0F);
        var2.method2436(12, field385);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILld;B)V", line = 252)
    public final void method185(int arg0, class155 arg1, byte arg2) {
        this.field8309.method2696(-2, arg1);
        if (arg2 <= 17) {
            this.method185(-53, null, (byte) -120);
        }
    }
}
