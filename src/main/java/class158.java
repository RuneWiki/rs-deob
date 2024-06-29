import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class158 extends class573 {

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "Lmh;")
    private class632 field2389;

    @OriginalMember(owner = "client!wea", name = "y", descriptor = "Lwda;")
    private class639 field2395;

    @OriginalMember(owner = "client!wea", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2394;

    @OriginalMember(owner = "client!wea", name = "w", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field2393;

    @OriginalMember(owner = "client!wea", name = "u", descriptor = "Z")
    private boolean field2391;

    @OriginalMember(owner = "client!wea", name = "v", descriptor = "[F")
    private static float[] field2392 = new float[16];

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "Z")
    private boolean field2390;

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)V")
    public final void method1138(int arg0) {
        if (arg0 == 3 && this.field2390) {
            IDirect3DDevice var2 = this.field2389.field8422;
            class615 var3 = this.field2389.method913((byte) 74);
            var2.method2758(0, var3.method3367(-99, field2392));
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZZ)V")
    public final void method611(boolean arg0, boolean arg1) {
        if (!arg0) {
            this.method611(true, true);
        }
        class493 var3 = this.field7517.method868(0);
        if (!this.field2391 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field2389.field8422;
        this.field2389.method3470((byte) 71, this.field2394);
        this.field2389.method3477(this.field2393, 23);
        this.field7517.method934(1, (byte) -65);
        this.field7517.method823(var3, -8423);
        this.field7517.method934(0, (byte) -65);
        this.field7517.method823(this.field2395.field8473, -8423);
        this.field2390 = true;
        this.method1141((byte) 126);
        this.method1139(4095);
        this.method1142(4095);
        this.method1140(true);
        var4.method2756(1, -this.field7517.field1754[0], -this.field7517.field1754[1], -this.field7517.field1754[2], 0.0F);
        var4.method2756(2, this.field7517.field1757, this.field7517.field1796, this.field7517.field1774, 1.0F);
        var4.method2756(3, Math.abs(this.field7517.field1754[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
    public final void method1139(int arg0) {
        if (arg0 != 4095) {
            field2392 = null;
        }
        if (this.field2390) {
            IDirect3DDevice var2 = this.field2389.field8422;
            class615 var3 = this.field7517.method873((byte) 114);
            var2.SetVertexShaderConstantF(12, var3.method3350(false, field2392), 2);
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Z)V")
    public final void method1140(boolean arg0) {
        if (this.field2390) {
            IDirect3DDevice var2 = this.field2389.field8422;
            if (this.field7517.field1730 <= 0) {
                var2.method2763(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field7517.field1762;
                float var4 = this.field7517.field1743;
                var2.method2763(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2756(0, (float) ((this.field7517.field1786 & 0xFFC2E0) >> 16) / 255.0F, (float) ((this.field7517.field1786 & 0xFF43) >> 8) / 255.0F, (float) (this.field7517.field1786 & 0xFF) / 255.0F, 0.0F);
        }
        if (!arg0) {
            this.method1142(-116);
        }
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Lmh;Lwu;Lwda;)V")
    public class158(class632 arg0, class376 arg1, class639 arg2) {
        super(arg0);
        this.field2389 = arg0;
        this.field2395 = arg2;
        if (arg1 != null && this.field7517.field1811 && this.field7517.field1805 && (this.field2389.field8435.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2394 = this.field2389.field8422.method2760(arg1.method2204("environment_mapped_water_v", "dx", (byte) 106));
            this.field2393 = this.field2389.field8422.method2752(arg1.method2204("environment_mapped_water_f", "dx", (byte) 117));
            this.field2391 = this.field2394 != null && this.field2393 != null && this.field2395.method3494(-17546);
        } else {
            this.field2393 = null;
            this.field2394 = null;
            this.field2391 = false;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lwc;IB)V")
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg2 <= 68) {
            this.field2393 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public final void method1141(byte arg0) {
        if (this.field2390) {
            IDirect3DDevice var2 = this.field2389.field8422;
            class615 var3 = this.field2389.method867(true);
            class615 var4 = this.field2389.method913((byte) 34);
            var2.method2758(0, var4.method3367(107, field2392));
            var2.method2758(4, var3.method3345(field2392, 26071));
        }
        if (arg0 <= 115) {
            this.field2390 = false;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)V")
    public final void method610(boolean arg0, int arg1) {
        if (arg1 <= 109) {
            this.method1142(110);
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(I)Z")
    public final boolean method605(int arg0) {
        return arg0 == 4095 ? this.field2391 : true;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)V")
    public final void method602(int arg0, int arg1, int arg2) {
        if (this.field2390) {
            IDirect3DDevice var4 = this.field2389.field8422;
            int var5 = 0x1 << (arg1 & 0x3);
            float var6 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            var4.method2763(14, (float) (this.field7517.field1759 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) ((arg2 & 0x3B787) >> 16) / 8.0F;
            var4.method2763(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method2756(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method2756(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != -26427) {
            this.method1139(57);
        }
    }

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "(Z)V")
    public final void method603(boolean arg0) {
        if (!arg0) {
            this.method602(36, 1, 93);
        }
        if (!this.field2390) {
            return;
        }
        this.field2389.method3470((byte) 71, null);
        this.field2389.method3477(null, 23);
        this.field7517.method934(1, (byte) -65);
        this.field7517.method823(null, -8423);
        this.field7517.method934(0, (byte) -65);
        this.field7517.method823(null, -8423);
        this.field2390 = false;
    }

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "(I)V")
    public final void method1142(int arg0) {
        if (arg0 == 4095 && this.field2390) {
            IDirect3DDevice var2 = this.field2389.field8422;
            var2.method2758(8, this.field7517.method821(true, field2392));
        }
    }
}
