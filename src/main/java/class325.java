import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class325 extends class715 {

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Z")
    private boolean field4608 = false;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "Llt;")
    private class672 field4612;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4615;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4618;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4609;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4610;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "Lwda;")
    private class636 field4617;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Z")
    private boolean field4616;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "[F")
    private static float[] field4614 = new float[4];

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "[F")
    private static float[] field4619 = new float[16];

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4611;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
    private boolean field4613;

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(Llt;Leq;)V")
    public class325(class672 arg0, class209 arg1) {
        super(arg0);
        this.field4612 = arg0;
        if (arg1 == null || (this.field4612.field9417.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4616 = false;
        } else {
            this.field4615 = this.field4612.field9423.method2903(arg1.method1475("uw_ground_unlit", (byte) 116, "dx"));
            this.field4618 = this.field4612.field9423.method2903(arg1.method1475("uw_ground_lit", (byte) 116, "dx"));
            this.field4609 = this.field4612.field9423.method2903(arg1.method1475("uw_model_unlit", (byte) 116, "dx"));
            this.field4610 = this.field4612.field9423.method2903(arg1.method1475("uw_model_lit", (byte) 116, "dx"));
            if (this.field4610 != null & this.field4618 != null & this.field4615 != null & this.field4609 != null) {
                this.field4617 = this.field9979.method2740(false, 1, 2, new int[] { 0, -1 }, (byte) -100);
                this.field4617.method427(false, (byte) 66, false);
                this.field4616 = true;
            } else {
                this.field4616 = false;
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        this.field9979.method2753((byte) -17, 1);
        this.field9979.method2732(-68, null);
        this.field9979.method2769(class571.field8118, class571.field8118, 18721);
        this.field9979.method2767(0, 25103, class68.field1225);
        this.field9979.method2767(2, 25103, class142.field2176);
        this.field9979.method2755(false, 0, class68.field1225);
        int var2 = 98 % ((arg0 + 71) / 42);
        this.field9979.method2753((byte) -17, 0);
        if (this.field4608) {
            this.field9979.method2767(0, 25103, class68.field1225);
            this.field9979.method2755(false, 0, class68.field1225);
            this.field4608 = false;
        }
        if (this.field4611 != null) {
            this.field4612.method3797(null, (byte) -114);
            this.field4611 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)V")
    private final void method2084(byte arg0) {
        if (this.field4611 != null && this.field4613) {
            class25 var2 = this.field9979.method2744(1);
            IDirect3DDevice var3 = this.field4612.field9423;
            var3.method2890(13, this.field9979.field6493 * this.field9979.field6474, this.field9979.field6536 * this.field9979.field6493, this.field9979.field6547 * this.field9979.field6493, 1.0F);
            var3.method2890(14, this.field9979.field6507 * this.field9979.field6474, this.field9979.field6536 * this.field9979.field6507, this.field9979.field6547 * this.field9979.field6507, 1.0F);
            var3.method2890(16, this.field9979.field6474 * this.field9979.field6455, this.field9979.field6536 * this.field9979.field6455, this.field9979.field6547 * this.field9979.field6455, 1.0F);
            var2.method171(this.field9979.field6540[1], this.field9979.field6540[2], this.field9979.field6540[0], 16814, field4614);
            var3.SetVertexShaderConstantF(15, field4614, 1);
            var2.method171(this.field9979.field6454[1], this.field9979.field6454[2], this.field9979.field6454[0], 16814, field4614);
            var3.SetVertexShaderConstantF(17, field4614, 1);
        }
        int var4 = -100 % ((arg0 + 77) / 44);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (arg1 != 1782) {
            this.field4616 = true;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)V")
    public final void method885(int arg0) {
        if (this.field4611 != null) {
            IDirect3DDevice var2 = this.field4612.field9423;
            class25 var3 = this.field4612.method2742(15);
            var2.method2888(0, var3.method158(field4619, arg0 ^ 0x9));
        }
        if (arg0 != 8) {
            field4614 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        this.field4613 = arg0;
        this.field9979.method2753((byte) -17, 1);
        this.field9979.method2732(arg1 ^ 0xFFFFFFC2, this.field4617);
        this.field9979.method2769(class140.field2165, class218.field3121, 18721);
        this.field9979.method2767(0, 25103, class142.field2176);
        if (arg1 != 4) {
            this.method2085((byte) 80);
        }
        this.field9979.method1020(false, true, (byte) 65, 2, class68.field1225);
        this.field9979.method2755(false, 0, class44.field665);
        this.field9979.method2753((byte) -17, 0);
        this.method2085((byte) -67);
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)V")
    public final void method884(int arg0) {
        int var2 = -74 / ((arg0 + 43) / 42);
        if (this.field4611 != null) {
            IDirect3DDevice var3 = this.field4612.field9423;
            var3.method2888(4, this.field9979.method2705(119, field4619));
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V")
    public final void method886(int arg0) {
        if (arg0 > -37) {
            this.field4611 = null;
        }
        if (this.field4611 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field4612.field9423;
        int var3 = this.field9979.method531();
        int var4 = this.field9979.method534();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method2890(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method2890(11, 1.0F / (float) this.field9979.method2720((byte) -88), (float) this.field9979.method2733(false) / 255.0F, this.field9979.field6508, 1.0F / (this.field9979.field6508 - this.field9979.field6500));
        this.field9979.method2730(this.field9979.method2756(124), -32755);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        if (arg1 != null) {
            if (this.field4608) {
                this.field9979.method2767(0, 25103, class68.field1225);
                this.field9979.method2755(false, 0, class68.field1225);
                this.field4608 = false;
            }
            this.field9979.method2732(-83, arg1);
            this.field9979.method2721(arg2, true);
        } else if (!this.field4608) {
            this.field9979.method2732(-80, this.field9979.field6529);
            this.field9979.method2721(1, true);
            this.field9979.method2767(0, 25103, class44.field665);
            this.field9979.method2755(false, 0, class44.field665);
            this.field4608 = true;
        }
        int var4 = -40 / ((31 - arg0) / 50);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.field4610 = null;
        }
        return this.field4616;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public final void method2085(byte arg0) {
        IDirect3DDevice var2 = this.field4612.field9423;
        int var3 = this.field9979.method2737(15);
        class25 var4 = this.field9979.method2775(0);
        IDirect3DVertexShader var5;
        if (this.field4613) {
            var5 = var3 == Integer.MAX_VALUE ? this.field4618 : this.field4610;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4615 : this.field4609;
        }
        if (this.field4611 != var5) {
            this.field4611 = var5;
            this.field4612.method3797(var5, (byte) -74);
            this.method2084((byte) -121);
            this.method884(-121);
            this.method888(false);
            this.method885(8);
            this.method887(-13878);
            this.method886(-104);
        }
        var4.method161(0.0F, 0.0F, -1.0F, field4614, (byte) -115, (float) var3);
        if (arg0 > -45) {
            this.field4615 = null;
        }
        var2.method2888(12, field4614);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public final void method888(boolean arg0) {
        if (this.field4611 != null) {
            IDirect3DDevice var2 = this.field4612.field9423;
            class25 var3 = this.field9979.method2722(-105);
            var2.SetVertexShaderConstantF(8, var3.method186(field4619, -121), 2);
        }
        if (arg0) {
            this.field4612 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V")
    public final void method887(int arg0) {
        if (this.field4611 != null) {
            IDirect3DDevice var2 = this.field4612.field9423;
            class25 var3 = this.field4612.method2742(15);
            var2.method2888(0, var3.method158(field4619, 1));
        }
        if (arg0 != -13878) {
            this.method888(true);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 > -105) {
            this.method687(-16, -102, -97);
        }
    }
}
