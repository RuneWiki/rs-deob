import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class615 extends class232 {

    @OriginalMember(owner = "client!vs", name = "m", descriptor = "Llo;")
    private class785 field8683;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "Lki;")
    private class735 field8680;

    @OriginalMember(owner = "client!vs", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8685;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field8679;

    @OriginalMember(owner = "client!vs", name = "k", descriptor = "Z")
    private boolean field8681;

    @OriginalMember(owner = "client!vs", name = "l", descriptor = "[F")
    private static float[] field8682 = new float[16];

    @OriginalMember(owner = "client!vs", name = "n", descriptor = "Z")
    private boolean field8684;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 != 2305) {
            this.field8681 = false;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        if (arg1 != -126) {
            field8682 = null;
        }
        class320 var3 = this.field3368.method1046(34);
        if (!this.field8681 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field8680.field10253;
        this.field8680.method4117(false, this.field8685);
        this.field8680.method4115(this.field8679, -5251);
        this.field3368.method1140((byte) -95, 1);
        this.field3368.method1104(true, var3);
        this.field3368.method1140((byte) -108, 0);
        this.field3368.method1104(true, this.field8683.field10793);
        this.field8684 = true;
        this.method1266(-9611);
        this.method908((byte) 116);
        this.method1267((byte) 117);
        this.method1268(84);
        var4.method2962(1, -this.field3368.field2172[0], -this.field3368.field2172[1], -this.field3368.field2172[2], 0.0F);
        var4.method2962(2, this.field3368.field2212, this.field3368.field2144, this.field3368.field2221, 1.0F);
        var4.method2962(3, Math.abs(this.field3368.field2172[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        if (arg1 < 21) {
            this.method908((byte) 96);
        }
    }

    @OriginalMember(owner = "client!vs", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        return arg0 == -30998 ? this.field8681 : true;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lki;Lcb;Llo;)V")
    public class615(class735 arg0, class544 arg1, class785 arg2) {
        super(arg0);
        this.field8683 = arg2;
        this.field8680 = arg0;
        if (arg1 != null && this.field3368.field2210 && this.field3368.field2184 && (this.field8680.field10268.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8685 = this.field8680.field10253.method2966(arg1.method3126((byte) -94, "dx", "environment_mapped_water_v"));
            this.field8679 = this.field8680.field10253.method2954(arg1.method3126((byte) -98, "dx", "environment_mapped_water_f"));
            this.field8681 = this.field8685 != null && this.field8679 != null && this.field8683.method4299(true);
        } else {
            this.field8679 = null;
            this.field8685 = null;
            this.field8681 = false;
        }
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V")
    public final void method1267(byte arg0) {
        if (arg0 >= 57 && this.field8684) {
            IDirect3DDevice var2 = this.field8680.field10253;
            var2.method2967(8, this.field3368.method1160(false, field8682));
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
    public final void method1268(int arg0) {
        if (this.field8684) {
            IDirect3DDevice var2 = this.field8680.field10253;
            if (this.field3368.field2201 <= 0) {
                var2.method2968(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field3368.field2186;
                float var4 = this.field3368.field2155;
                var2.method2968(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2962(0, (float) (this.field3368.field2180 >> 16 & 0xFF) / 255.0F, (float) ((this.field3368.field2180 & 0xFF5D) >> 8) / 255.0F, (float) (this.field3368.field2180 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 < 35) {
            this.method1265(-36);
        }
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        if (arg0 < 77) {
            this.method1266(-11);
        }
        if (!this.field8684) {
            return;
        }
        this.field8680.method4117(false, null);
        this.field8680.method4115(null, -5251);
        this.field3368.method1140((byte) -97, 1);
        this.field3368.method1104(true, null);
        this.field3368.method1140((byte) -43, 0);
        this.field3368.method1104(true, null);
        this.field8684 = false;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)V")
    public final void method1266(int arg0) {
        if (this.field8684) {
            IDirect3DDevice var2 = this.field8680.field10253;
            class468 var3 = this.field8680.method1047((byte) -85);
            class468 var4 = this.field8680.method1168(127);
            var2.method2967(0, var4.method2771(field8682, 9));
            var2.method2967(4, var3.method2761(field8682, (byte) -54));
        }
        if (arg0 != -9611) {
            this.method1267((byte) -13);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public final void method1265(int arg0) {
        if (this.field8684) {
            IDirect3DDevice var2 = this.field8680.field10253;
            class468 var3 = this.field8680.method1168(108);
            var2.method2967(0, var3.method2771(field8682, 9));
        }
        if (arg0 != -18866) {
            this.field8680 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        if (this.field8684) {
            IDirect3DDevice var4 = this.field8680.field10253;
            int var5 = 0x1 << (arg2 & 0x3);
            float var6 = (float) (0x1 << (arg2 >> 3 & 0x7)) / 32.0F;
            int var7 = arg1 & 0xFFFF;
            var4.method2968(14, (float) (this.field3368.field2209 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
            var4.method2968(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2962(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2962(5, var8, 0.0F, 0.0F, 0.0F);
        }
        int var9 = 31 % ((48 - arg0) / 51);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)V")
    public final void method908(byte arg0) {
        if (this.field8684) {
            IDirect3DDevice var2 = this.field8680.field10253;
            class468 var3 = this.field3368.method1165(false);
            var2.SetVertexShaderConstantF(12, var3.method2779((byte) 44, field8682), 2);
        }
        if (arg0 <= 101) {
            this.field8684 = true;
        }
    }
}
