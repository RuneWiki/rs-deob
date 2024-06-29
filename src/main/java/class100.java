import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class100 extends class715 {

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "Lwv;")
    private class34 field1687;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "Llt;")
    private class672 field1689;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1684;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field1686;

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "Z")
    private boolean field1683;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "[F")
    private static float[] field1685 = new float[16];

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "Z")
    private boolean field1688;

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ZI)V")
    public final void method691(boolean arg0, int arg1) {
        class326 var3 = this.field9979.method2759(arg1 - 63);
        if (arg1 != 4) {
            this.field1688 = true;
        }
        if (!this.field1683 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field1689.field9423;
        this.field1689.method3797(this.field1684, (byte) -104);
        this.field1689.method3796(this.field1686, -27452);
        this.field9979.method2753((byte) -17, 1);
        this.field9979.method2732(-110, var3);
        this.field9979.method2753((byte) -17, 0);
        this.field9979.method2732(-87, this.field1687.field448);
        this.field1688 = true;
        this.method887(-13878);
        this.method888(false);
        this.method884(-120);
        this.method886(arg1 - 81);
        var4.method2892(1, -this.field9979.field6540[0], -this.field9979.field6540[1], -this.field9979.field6540[2], 0.0F);
        var4.method2892(2, this.field9979.field6474, this.field9979.field6536, this.field9979.field6547, 1.0F);
        var4.method2892(3, Math.abs(this.field9979.field6540[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)V")
    public final void method884(int arg0) {
        if (this.field1688) {
            IDirect3DDevice var2 = this.field1689.field9423;
            var2.method2888(8, this.field9979.method2705(125, field1685));
        }
        int var3 = -43 % ((-arg0 - 43) / 42);
    }

    @OriginalMember(owner = "client!eda", name = "e", descriptor = "(I)V")
    public final void method885(int arg0) {
        if (this.field1688) {
            IDirect3DDevice var2 = this.field1689.field9423;
            class25 var3 = this.field1689.method2742(15);
            var2.method2888(0, var3.method158(field1685, arg0 ^ 0x9));
        }
        if (arg0 != 8) {
            this.method888(false);
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(B)Z")
    public final boolean method690(byte arg0) {
        if (arg0 != -3) {
            this.method690((byte) 94);
        }
        return this.field1683;
    }

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(I)V")
    public final void method689(int arg0) {
        int var2 = -60 / ((-arg0 - 71) / 42);
        if (!this.field1688) {
            return;
        }
        this.field1689.method3797(null, (byte) -113);
        this.field1689.method3796(null, -27452);
        this.field9979.method2753((byte) -17, 1);
        this.field9979.method2732(-54, null);
        this.field9979.method2753((byte) -17, 0);
        this.field9979.method2732(-123, null);
        this.field1688 = false;
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)V")
    public final void method886(int arg0) {
        if (this.field1688) {
            IDirect3DDevice var2 = this.field1689.field9423;
            if (this.field9979.field6477 > 0) {
                float var3 = this.field9979.field6508;
                float var4 = this.field9979.field6500;
                var2.method2890(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method2890(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method2892(0, (float) (this.field9979.field6542 >> 16 & 0xFF) / 255.0F, (float) ((this.field9979.field6542 & 0xFF0D) >> 8) / 255.0F, (float) (this.field9979.field6542 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 > -37) {
            this.method885(19);
        }
    }

    @OriginalMember(owner = "client!eda", name = "b", descriptor = "(I)V")
    public final void method887(int arg0) {
        if (arg0 != -13878) {
            this.field1687 = null;
        }
        if (!this.field1688) {
            return;
        }
        IDirect3DDevice var2 = this.field1689.field9423;
        class25 var3 = this.field1689.method2775(0);
        class25 var4 = this.field1689.method2742(15);
        var2.method2888(0, var4.method158(field1685, 1));
        var2.method2888(4, var3.method163(true, field1685));
    }

    @OriginalMember(owner = "client!eda", name = "<init>", descriptor = "(Llt;Leq;Lwv;)V")
    public class100(class672 arg0, class209 arg1, class34 arg2) {
        super(arg0);
        this.field1687 = arg2;
        this.field1689 = arg0;
        if (arg1 != null && this.field9979.field6518 && this.field9979.field6465 && (this.field1689.field9417.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1684 = this.field1689.field9423.method2903(arg1.method1475("environment_mapped_water_v", (byte) 116, "dx"));
            this.field1686 = this.field1689.field9423.method2902(arg1.method1475("environment_mapped_water_f", (byte) 116, "dx"));
            this.field1683 = this.field1684 != null && this.field1686 != null && this.field1687.method222((byte) -21);
        } else {
            this.field1686 = null;
            this.field1683 = false;
            this.field1684 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(BZ)V")
    public final void method686(byte arg0, boolean arg1) {
        if (arg0 >= -105) {
            this.field1684 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)V")
    public final void method687(int arg0, int arg1, int arg2) {
        if (this.field1688) {
            IDirect3DDevice var4 = this.field1689.field9423;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x31E66) >> 16) / 8.0F;
            var4.method2890(14, (float) (this.field9979.field6479 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method2890(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2892(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2892(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 1782) {
            this.field1684 = null;
        }
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(ILdu;I)V")
    public final void method693(int arg0, class355 arg1, int arg2) {
        int var4 = -53 % ((arg0 - 31) / 50);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(Z)V")
    public final void method888(boolean arg0) {
        if (!arg0 && this.field1688) {
            IDirect3DDevice var2 = this.field1689.field9423;
            class25 var3 = this.field9979.method2722(-128);
            var2.SetVertexShaderConstantF(12, var3.method186(field1685, -26), 2);
        }
    }
}
