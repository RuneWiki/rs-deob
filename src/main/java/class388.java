import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class388 extends class497 {

    @OriginalMember(owner = "client!bfa", name = "r", descriptor = "Lta;")
    private class224 field5370;

    @OriginalMember(owner = "client!bfa", name = "n", descriptor = "Lui;")
    private class240 field5366;

    @OriginalMember(owner = "client!bfa", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5367;

    @OriginalMember(owner = "client!bfa", name = "m", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field5365;

    @OriginalMember(owner = "client!bfa", name = "q", descriptor = "Z")
    private boolean field5369;

    @OriginalMember(owner = "client!bfa", name = "l", descriptor = "[F")
    private static float[] field5364 = new float[16];

    @OriginalMember(owner = "client!bfa", name = "p", descriptor = "Z")
    private boolean field5368;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "(Z)V", line = 4)
    public final void method1299(boolean arg0) {
        if (this.field5368) {
            IDirect3DDevice var2 = this.field5370.field3450;
            if (this.field7086.field2451 > 0) {
                float var3 = this.field7086.field2460;
                float var4 = this.field7086.field2453;
                var2.method3063(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method3063(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method3062(0, (float) ((this.field7086.field2441 & 0xFF0E7C) >> 16) / 255.0F, (float) ((this.field7086.field2441 & 0xFFC5) >> 8) / 255.0F, (float) (this.field7086.field2441 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0) {
            this.method1301(true);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(ZB)V", line = 33)
    public final void method928(boolean arg0, byte arg1) {
        int var3 = -43 / ((24 - arg1) / 46);
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(Lta;Lwia;Lui;)V", line = 40)
    public class388(class224 arg0, class791 arg1, class240 arg2) {
        super(arg0);
        this.field5370 = arg0;
        this.field5366 = arg2;
        if (arg1 != null && this.field7086.field2481 && this.field7086.field2440 && (this.field5370.field3440.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5367 = this.field5370.field3450.method3068(arg1.method4362("environment_mapped_water_v", "dx", (byte) 50));
            this.field5365 = this.field5370.field3450.method3067(arg1.method4362("environment_mapped_water_f", "dx", (byte) -99));
            this.field5369 = this.field5367 != null && this.field5365 != null && this.field5366.method1601((byte) -112);
        } else {
            this.field5365 = null;
            this.field5369 = false;
            this.field5367 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(I)Z", line = 64)
    public final boolean method921(int arg0) {
        int var2 = 34 % ((arg0 - 19) / 52);
        return this.field5369;
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(B)V", line = 73)
    public final void method1300(byte arg0) {
        int var2 = 55 % ((27 - arg0) / 37);
        if (this.field5368) {
            IDirect3DDevice var3 = this.field5370.field3450;
            var3.method3075(8, this.field7086.method1112(field5364, (byte) -50));
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z)V", line = 87)
    public final void method1297(boolean arg0) {
        if (this.field5368) {
            IDirect3DDevice var2 = this.field5370.field3450;
            class385 var3 = this.field5370.method1127(-112);
            var2.method3075(0, var3.method2388(-118, field5364));
        }
        if (!arg0) {
            this.field5369 = true;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IZ)V", line = 110)
    public final void method929(int arg0, boolean arg1) {
        if (arg0 > -83) {
            this.method925((byte) 29, 3, null);
        }
        class461 var3 = this.field7086.method1157(0);
        if (!this.field5369 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field5370.field3450;
        this.field5370.method1532(this.field5367, true);
        this.field5370.method1523((byte) 78, this.field5365);
        this.field7086.method1192(-22137, 1);
        this.field7086.method1118(0, var3);
        this.field7086.method1192(-22137, 0);
        this.field7086.method1118(0, this.field5366.field3607);
        this.field5368 = true;
        this.method1298((byte) 82);
        this.method1301(false);
        this.method1300((byte) -103);
        this.method1299(false);
        var4.method3062(1, -this.field7086.field2416[0], -this.field7086.field2416[1], -this.field7086.field2416[2], 0.0F);
        var4.method3062(2, this.field7086.field2489, this.field7086.field2457, this.field7086.field2458, 1.0F);
        var4.method3062(3, Math.abs(this.field7086.field2416[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BILkja;)V", line = 143)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 < 83) {
            this.method928(false, (byte) -106);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 153)
    public final void method926(int arg0) {
        if (this.field5368) {
            this.field5370.method1532(null, true);
            this.field5370.method1523((byte) 78, null);
            this.field7086.method1192(-22137, 1);
            this.field7086.method1118(0, null);
            this.field7086.method1192(-22137, 0);
            this.field7086.method1118(0, null);
            this.field5368 = false;
        }
        if (arg0 != -339) {
            this.field5365 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "(Z)V", line = 175)
    public final void method1301(boolean arg0) {
        if (this.field5368) {
            IDirect3DDevice var2 = this.field5370.field3450;
            class385 var3 = this.field7086.method1199(true);
            var2.SetVertexShaderConstantF(12, var3.method2393(field5364, -96), 2);
        }
        if (arg0) {
            this.method1301(true);
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 194)
    public final void method1298(byte arg0) {
        if (this.field5368) {
            IDirect3DDevice var2 = this.field5370.field3450;
            class385 var3 = this.field5370.method1187(true);
            class385 var4 = this.field5370.method1127(-114);
            var2.method3075(0, var4.method2388(-126, field5364));
            var2.method3075(4, var3.method2404((byte) -128, field5364));
        }
        if (arg0 != 82) {
            this.field5366 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IBI)V", line = 215)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (this.field5368) {
            IDirect3DDevice var4 = this.field5370.field3450;
            int var5 = 0x1 << (arg0 & 0x3);
            float var6 = (float) (0x1 << ((arg0 & 0x38) >> 3)) / 32.0F;
            int var7 = arg2 & 0xFFFF;
            var4.method3063(14, (float) (this.field7086.field2434 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
            float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
            var4.method3063(15, var6, 0.0F, 0.0F, 0.0F);
            var4.method3062(4, (float) var7, 0.0F, 0.0F, 0.0F);
            var4.method3062(5, var8, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 < 5) {
            this.field5369 = false;
        }
    }
}
