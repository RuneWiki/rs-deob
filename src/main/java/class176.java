import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class176 extends class657 {

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lur;")
    private class537 field2719;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lbfa;")
    private class370 field2717;

    @OriginalMember(owner = "client!gg", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2716;

    @OriginalMember(owner = "client!gg", name = "j", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field2714;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "Z")
    private boolean field2718;

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "[F")
    private static float[] field2713 = new float[16];

    @OriginalMember(owner = "client!gg", name = "k", descriptor = "Z")
    private boolean field2715;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)V")
    public final void method730(int arg0, int arg1, int arg2) {
        if (arg0 != 10756) {
            this.method736(-80, null, 80);
        }
        if (!this.field2715) {
            return;
        }
        IDirect3DDevice var4 = this.field2717.field5282;
        int var5 = 0x1 << (arg1 & 0x3);
        float var6 = (float) (0x1 << ((arg1 & 0x38) >> 3)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        float var8 = (float) ((arg2 & 0x320D7) >> 16) / 8.0F;
        var4.method2850(14, (float) (this.field9010.field10260 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method2850(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2851(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2851(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZB)V")
    public final void method734(boolean arg0, byte arg1) {
        if (arg1 != -103) {
            this.field2715 = true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public final void method733(int arg0) {
        if (this.field2715) {
            IDirect3DDevice var2 = this.field2717.field5282;
            class81 var3 = this.field9010.method4095(arg0 - 10420);
            var2.SetVertexShaderConstantF(12, var3.method746(field2713, 1), 2);
        }
        if (arg0 != 10425) {
            this.field2716 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILdu;I)V")
    public final void method736(int arg0, class357 arg1, int arg2) {
        if (arg2 != -16776) {
            this.method733(16);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public final void method1312(int arg0) {
        if (this.field2715) {
            IDirect3DDevice var2 = this.field2717.field5282;
            if (this.field9010.field10205 <= 0) {
                var2.method2850(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field9010.field10229;
                float var4 = this.field9010.field10287;
                var2.method2850(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2851(0, (float) (this.field9010.field10258 >> 16 & 0xFF) / 255.0F, (float) (this.field9010.field10258 >> 8 & 0xFF) / 255.0F, (float) (this.field9010.field10258 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != -16252) {
            this.field2717 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lbfa;Lin;Lur;)V")
    public class176(class370 arg0, class91 arg1, class537 arg2) {
        super(arg0);
        this.field2719 = arg2;
        this.field2717 = arg0;
        if (arg1 != null && this.field9010.field10215 && this.field9010.field10273 && (this.field2717.field5263.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2716 = this.field2717.field5282.method2848(arg1.method844("dx", "environment_mapped_water_v", -29832));
            this.field2714 = this.field2717.field5282.method2843(arg1.method844("dx", "environment_mapped_water_f", -29832));
            this.field2718 = this.field2716 != null && this.field2714 != null && this.field2719.method3092((byte) 49);
        } else {
            this.field2716 = null;
            this.field2718 = false;
            this.field2714 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
    public final void method735(int arg0, boolean arg1) {
        if (arg0 != 15192) {
            return;
        }
        class247 var3 = this.field9010.method4086(-16777216);
        if (!this.field2718 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field2717.field5282;
        this.field2717.method2352(this.field2716, (byte) -89);
        this.field2717.method2357(22927, this.field2714);
        this.field9010.method4126(1, -4382);
        this.field9010.method4097((byte) 63, var3);
        this.field9010.method4126(0, -4382);
        this.field9010.method4097((byte) -127, this.field2719.field7425);
        this.field2715 = true;
        this.method1315(false);
        this.method733(10425);
        this.method1314(-14775);
        this.method1312(-16252);
        var4.method2851(1, -this.field9010.field10284[0], -this.field9010.field10284[1], -this.field9010.field10284[2], 0.0F);
        var4.method2851(2, this.field9010.field10294, this.field9010.field10201, this.field9010.field10282, 1.0F);
        var4.method2851(3, Math.abs(this.field9010.field10284[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)Z")
    public final boolean method731(int arg0) {
        if (arg0 > -57) {
            this.field2714 = null;
        }
        return this.field2718;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public final void method1313(byte arg0) {
        if (this.field2715) {
            IDirect3DDevice var2 = this.field2717.field5282;
            class81 var3 = this.field2717.method4157(-22036);
            var2.method2839(0, var3.method761(11, field2713));
        }
        if (arg0 != 12) {
            field2713 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)V")
    public final void method728(byte arg0) {
        if (this.field2715) {
            this.field2717.method2352(null, (byte) -89);
            this.field2717.method2357(22927, null);
            this.field9010.method4126(1, -4382);
            this.field9010.method4097((byte) -98, null);
            this.field9010.method4126(0, -4382);
            this.field9010.method4097((byte) -124, null);
            this.field2715 = false;
        }
        if (arg0 != 87) {
            this.method1315(true);
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
    public final void method1314(int arg0) {
        if (arg0 == -14775 && this.field2715) {
            IDirect3DDevice var2 = this.field2717.field5282;
            var2.method2839(8, this.field9010.method4087(field2713, arg0 + 14651));
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)V")
    public final void method1315(boolean arg0) {
        if (arg0 || !this.field2715) {
            return;
        }
        IDirect3DDevice var2 = this.field2717.field5282;
        class81 var3 = this.field2717.method4119((byte) -123);
        class81 var4 = this.field2717.method4157(-22036);
        var2.method2839(0, var4.method761(11, field2713));
        var2.method2839(4, var3.method772(0, field2713));
    }
}
