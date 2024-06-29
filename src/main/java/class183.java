import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class183 extends class497 {

    @OriginalMember(owner = "client!tca", name = "n", descriptor = "Lta;")
    private class224 field2822;

    @OriginalMember(owner = "client!tca", name = "l", descriptor = "Lui;")
    private class240 field2820;

    @OriginalMember(owner = "client!tca", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2823;

    @OriginalMember(owner = "client!tca", name = "m", descriptor = "[F")
    private static float[] field2821 = new float[16];

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(BILkja;)V", line = 4)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 <= 83) {
            this.method1297(true);
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBI)V", line = 15)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 <= 5) {
            this.method1297(true);
        }
        IDirect3DDevice var4 = this.field2822.field3450;
        if (this.field2820.field3604) {
            float var6 = (float) (this.field7086.field2434 % 4000) / 4000.0F;
            this.field7086.method1118(0, this.field2820.field3600);
            var4.method3063(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7086.field2434 % 4000 * 16 / 4000;
            this.field7086.method1118(0, this.field2820.field3599[var5]);
            var4.method3063(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lta;Lwia;Lui;)V", line = 40)
    public class183(class224 arg0, class791 arg1, class240 arg2) {
        super(arg0);
        this.field2822 = arg0;
        this.field2820 = arg2;
        if (arg1 != null && this.field2820.method1598((byte) -74) && (this.field2822.field3440.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2823 = this.field2822.field3450.method3068(arg1.method4362("transparent_water", "dx", (byte) 103));
        } else {
            this.field2823 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)V", line = 58)
    public final void method1297(boolean arg0) {
        if (this.field2823 != null) {
            IDirect3DDevice var2 = this.field2822.field3450;
            class385 var3 = this.field2822.method1127(109);
            var2.method3075(0, var3.method2388(-110, field2821));
        }
        if (!arg0) {
            field2821 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)V", line = 76)
    public final void method1298(byte arg0) {
        if (arg0 == 82 && this.field2823 != null) {
            IDirect3DDevice var2 = this.field2822.field3450;
            class385 var3 = this.field2822.method1127(arg0 ^ 0x77);
            var2.method3075(0, var3.method2388(-87, field2821));
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)Z", line = 98)
    public final boolean method921(int arg0) {
        int var2 = -81 % ((19 - arg0) / 52);
        return this.field2823 != null;
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(Z)V", line = 106)
    public final void method1299(boolean arg0) {
        if (this.field2823 != null) {
            IDirect3DDevice var2 = this.field2822.field3450;
            if (this.field7086.field2451 <= 0) {
                var2.method3063(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field7086.field2460;
                float var4 = this.field7086.field2453;
                float var5 = var4 - 512.0F;
                var2.method3063(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field7086.method1159((byte) -31, this.field7086.field2441);
        }
        if (arg0) {
            this.method923(26, (byte) 95, -60);
        }
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(B)V", line = 139)
    public final void method1300(byte arg0) {
        if (this.field2823 != null) {
            IDirect3DDevice var2 = this.field2822.field3450;
            var2.method3075(4, this.field7086.method1112(field2821, (byte) -50));
        }
        int var3 = 66 / ((arg0 - 27) / 37);
    }

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(Z)V", line = 155)
    public final void method1301(boolean arg0) {
        if (arg0) {
            this.method928(false, (byte) 39);
        }
        if (this.field2823 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2822.field3450;
        class385 var3 = this.field7086.method1199(!arg0);
        var3.method2393(field2821, -110);
        field2821[2] *= 0.25F;
        field2821[0] *= 0.25F;
        field2821[1] *= 0.25F;
        field2821[5] *= 0.25F;
        field2821[7] *= 0.25F;
        field2821[6] *= 0.25F;
        field2821[4] *= 0.25F;
        field2821[3] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field2821, 2);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(ZB)V", line = 183)
    public final void method928(boolean arg0, byte arg1) {
        int var3 = -68 / ((24 - arg1) / 46);
        this.field7086.method1080(class116.field1782, class624.field8745, -30);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(I)V", line = 192)
    public final void method926(int arg0) {
        if (arg0 != -339) {
            this.method923(-66, (byte) 102, -100);
        }
        this.field2822.method1532(null, true);
        this.field7086.method1180(0, (byte) 91, class605.field8453);
        this.field7086.method1180(1, (byte) 91, class407.field5550);
        this.field7086.method1180(2, (byte) 91, class683.field9465);
        this.field7086.method1171((byte) -116, true);
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IZ)V", line = 206)
    public final void method929(int arg0, boolean arg1) {
        this.field7086.method1180(0, (byte) 91, class605.field8453);
        this.field7086.method1180(1, (byte) 91, class683.field9465);
        this.field7086.method1158(true, false, (byte) -96, class407.field5550, 2);
        if (arg0 > -83) {
            this.field2820 = null;
        }
        this.field7086.method1171((byte) -119, false);
        this.field2822.method1532(this.field2823, true);
        this.method1297(true);
        this.method1301(false);
        this.method1300((byte) 71);
        this.method1299(false);
    }
}
