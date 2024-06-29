import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class366 extends class384 {

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "Leb;")
    private class9 field5181;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lcu;")
    private class287 field5179;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5183;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field5178;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Z")
    private boolean field5180;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "[F")
    private static float[] field5184 = new float[16];

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "Z")
    private boolean field5182;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1866(boolean arg0) {
        if (!arg0) {
            this.method1015(null, (byte) -72, 90);
        }
        if (this.field5182) {
            IDirect3DDevice var2 = this.field5179.field3643;
            class462 var3 = this.field5179.method3756((byte) 109);
            var2.method4014(0, var3.method2717(field5184, false));
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)Z", line = 23)
    public final boolean method1021(byte arg0) {
        if (arg0 < 78) {
            this.field5183 = null;
        }
        return this.field5180;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lbia;BI)V", line = 34)
    public final void method1015(class329 arg0, byte arg1, int arg2) {
        if (arg1 != 80) {
            field5184 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZB)V", line = 45)
    public final void method1020(boolean arg0, byte arg1) {
        if (arg1 < 23) {
            return;
        }
        class207 var3 = this.field5337.method3707(110);
        if (!this.field5180 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field5179.field3643;
        this.field5179.method1714((byte) 87, this.field5183);
        this.field5179.method1717(this.field5178, (byte) 127);
        this.field5337.method3723(true, 1);
        this.field5337.method3711(false, var3);
        this.field5337.method3723(true, 0);
        this.field5337.method3711(false, this.field5181.field92);
        this.field5182 = true;
        this.method1865(-23163);
        this.method1023((byte) -52);
        this.method1868((byte) 94);
        this.method1867(-89);
        var4.method4019(1, -this.field5337.field9585[0], -this.field5337.field9585[1], -this.field5337.field9585[2], 0.0F);
        var4.method4019(2, this.field5337.field9564, this.field5337.field9571, this.field5337.field9606, 1.0F);
        var4.method4019(3, Math.abs(this.field5337.field9585[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lcu;Lkha;Leb;)V", line = 75)
    public class366(class287 arg0, class687 arg1, class9 arg2) {
        super(arg0);
        this.field5181 = arg2;
        this.field5179 = arg0;
        if (arg1 != null && this.field5337.field9612 && this.field5337.field9604 && (this.field5179.field3641.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5183 = this.field5179.field3643.method4013(arg1.method3813("dx", "environment_mapped_water_v", -74));
            this.field5178 = this.field5179.field3643.method4009(arg1.method3813("dx", "environment_mapped_water_f", -87));
            this.field5180 = this.field5183 != null && this.field5178 != null && this.field5181.method40(3997);
        } else {
            this.field5180 = false;
            this.field5183 = null;
            this.field5178 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 98)
    public final void method1865(int arg0) {
        if (arg0 != -23163) {
            this.method1025(22, (byte) -107, -81);
        }
        if (!this.field5182) {
            return;
        }
        IDirect3DDevice var2 = this.field5179.field3643;
        class462 var3 = this.field5179.method3718(-97);
        class462 var4 = this.field5179.method3756((byte) 68);
        var2.method4014(0, var4.method2717(field5184, false));
        var2.method4014(4, var3.method2735(field5184, true));
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V", line = 119)
    public final void method1023(byte arg0) {
        if (arg0 != -52) {
            this.method1019((byte) 84);
        }
        if (this.field5182) {
            IDirect3DDevice var2 = this.field5179.field3643;
            class462 var3 = this.field5337.method3743(-32721);
            var2.SetVertexShaderConstantF(12, var3.method2732(field5184, (byte) 75), 2);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 138)
    public final void method1019(byte arg0) {
        if (this.field5182) {
            this.field5179.method1714((byte) 87, null);
            this.field5179.method1717(null, (byte) 126);
            this.field5337.method3723(true, 1);
            this.field5337.method3711(false, null);
            this.field5337.method3723(true, 0);
            this.field5337.method3711(false, null);
            this.field5182 = false;
        }
        if (arg0 != -60) {
            this.field5178 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V", line = 159)
    public final void method1018(int arg0, boolean arg1) {
        if (arg0 != 4) {
            this.field5179 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 171)
    public final void method1868(byte arg0) {
        if (arg0 <= 91) {
            this.method1867(-107);
        }
        if (this.field5182) {
            IDirect3DDevice var2 = this.field5179.field3643;
            var2.method4014(8, this.field5337.method3747(field5184, true));
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 190)
    public final void method1867(int arg0) {
        if (this.field5182) {
            IDirect3DDevice var2 = this.field5179.field3643;
            if (this.field5337.field9586 > 0) {
                float var3 = this.field5337.field9577;
                float var4 = this.field5337.field9637;
                var2.method4012(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method4012(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method4019(0, (float) (this.field5337.field9573 >> 16 & 0xFF) / 255.0F, (float) ((this.field5337.field9573 & 0xFF42) >> 8) / 255.0F, (float) (this.field5337.field9573 & 0xFF) / 255.0F, 0.0F);
        }
        int var5 = -44 % ((-arg0 - 45) / 32);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)V", line = 217)
    public final void method1025(int arg0, byte arg1, int arg2) {
        if (this.field5182) {
            IDirect3DDevice var4 = this.field5179.field3643;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            float var8 = (float) ((arg2 & 0x33F61) >> 16) / 8.0F;
            var4.method4012(14, (float) (this.field5337.field9610 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            var4.method4012(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method4019(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method4019(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 102) {
            this.field5181 = null;
        }
    }
}
