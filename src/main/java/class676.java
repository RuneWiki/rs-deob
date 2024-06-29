import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class676 extends class497 {

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "Z")
    private boolean field9411 = false;

    @OriginalMember(owner = "client!pl", name = "m", descriptor = "Lta;")
    private class224 field9412;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9416;

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9417;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9419;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9422;

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "Z")
    private boolean field9414;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Loga;")
    private class498 field9421;

    @OriginalMember(owner = "client!pl", name = "n", descriptor = "[F")
    private static float[] field9413 = new float[16];

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "[F")
    private static float[] field9420 = new float[4];

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9415;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "Z")
    private boolean field9418;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)V", line = 4)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 <= 5) {
            this.method1298((byte) -107);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZB)V", line = 15)
    public final void method928(boolean arg0, byte arg1) {
        int var3 = 8 / ((arg1 - 24) / 46);
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)V", line = 22)
    public final void method1299(boolean arg0) {
        if (this.field9415 != null) {
            IDirect3DDevice var2 = this.field9412.field3450;
            int var3 = this.field7086.method513();
            int var4 = this.field7086.method457();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method3063(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method3063(11, 1.0F / (float) this.field7086.method1146(true), (float) this.field7086.method1106((byte) -56) / 255.0F, this.field7086.field2460, 1.0F / (this.field7086.field2460 - this.field7086.field2453));
            this.field7086.method1159((byte) 127, this.field7086.method1099(119));
        }
        if (arg0) {
            this.method3841(-97);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILkja;)V", line = 49)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        if (arg0 <= 83) {
            this.method1298((byte) -90);
        }
        if (arg2 != null) {
            if (this.field9411) {
                this.field7086.method1180(0, (byte) 91, class605.field8453);
                this.field7086.method1082(0, class605.field8453, (byte) -112);
                this.field9411 = false;
            }
            this.field7086.method1118(0, arg2);
            this.field7086.method1189(55, arg1);
        } else if (!this.field9411) {
            this.field7086.method1118(0, this.field7086.field2465);
            this.field7086.method1189(63, 1);
            this.field7086.method1180(0, (byte) 91, class639.field8962);
            this.field7086.method1082(0, class639.field8962, (byte) -112);
            this.field9411 = true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)V", line = 86)
    public final void method929(int arg0, boolean arg1) {
        this.field9418 = arg1;
        this.field7086.method1192(-22137, 1);
        this.field7086.method1118(0, this.field9421);
        if (arg0 > -83) {
            this.method1297(true);
        }
        this.field7086.method1080(class116.field1782, class776.field10666, -30);
        this.field7086.method1180(0, (byte) 91, class683.field9465);
        this.field7086.method1158(false, true, (byte) -104, class605.field8453, 2);
        this.field7086.method1082(0, class639.field8962, (byte) -112);
        this.field7086.method1192(-22137, 0);
        this.method3022(false);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method921(int arg0) {
        int var2 = -119 / ((19 - arg0) / 52);
        return this.field9414;
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)V", line = 114)
    private final void method3841(int arg0) {
        if (this.field9415 != null && this.field9418) {
            class385 var2 = this.field7086.method1113(1);
            IDirect3DDevice var3 = this.field9412.field3450;
            var3.method3063(13, this.field7086.field2489 * this.field7086.field2399, this.field7086.field2457 * this.field7086.field2399, this.field7086.field2458 * this.field7086.field2399, 1.0F);
            var3.method3063(14, this.field7086.field2489 * this.field7086.field2410, this.field7086.field2457 * this.field7086.field2410, this.field7086.field2458 * this.field7086.field2410, 1.0F);
            var3.method3063(16, this.field7086.field2495 * this.field7086.field2489, this.field7086.field2495 * this.field7086.field2457, this.field7086.field2495 * this.field7086.field2458, 1.0F);
            var2.method2408(this.field7086.field2416[2], this.field7086.field2416[1], field9420, this.field7086.field2416[0], 31414);
            var3.SetVertexShaderConstantF(15, field9420, 1);
            var2.method2408(this.field7086.field2419[2], this.field7086.field2419[1], field9420, this.field7086.field2419[0], 31414);
            var3.SetVertexShaderConstantF(17, field9420, 1);
        }
        int var4 = 105 % ((arg0 - 46) / 44);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 140)
    public final void method1300(byte arg0) {
        if (this.field9415 != null) {
            IDirect3DDevice var2 = this.field9412.field3450;
            var2.method3075(4, this.field7086.method1112(field9413, (byte) -50));
        }
        int var3 = -89 % ((arg0 - 27) / 37);
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)V", line = 157)
    public final void method1301(boolean arg0) {
        if (arg0) {
            this.method929(21, true);
        }
        if (this.field9415 != null) {
            IDirect3DDevice var2 = this.field9412.field3450;
            class385 var3 = this.field7086.method1199(true);
            var2.SetVertexShaderConstantF(8, var3.method2393(field9413, -32), 2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lta;Lwia;)V", line = 176)
    public class676(class224 arg0, class791 arg1) {
        super(arg0);
        this.field9412 = arg0;
        if (arg1 == null || (this.field9412.field3440.VertexShaderVersion & 0xFFFF) < 257) {
            this.field9414 = false;
        } else {
            this.field9416 = this.field9412.field3450.method3068(arg1.method4362("uw_ground_unlit", "dx", (byte) 68));
            this.field9417 = this.field9412.field3450.method3068(arg1.method4362("uw_ground_lit", "dx", (byte) 106));
            this.field9419 = this.field9412.field3450.method3068(arg1.method4362("uw_model_unlit", "dx", (byte) 111));
            this.field9422 = this.field9412.field3450.method3068(arg1.method4362("uw_model_lit", "dx", (byte) -96));
            if ((this.field9417 != null & this.field9416 != null & this.field9419 != null & this.field9422 != null)) {
                this.field9421 = this.field7086.method1093((byte) 112, false, 1, new int[] { 0, -1 }, 2);
                this.field9421.method2021(false, false, (byte) 23);
                this.field9414 = true;
            } else {
                this.field9414 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(Z)V", line = 204)
    public final void method3022(boolean arg0) {
        if (arg0) {
            return;
        }
        IDirect3DDevice var2 = this.field9412.field3450;
        int var3 = this.field7086.method1096(127);
        class385 var4 = this.field7086.method1187(true);
        IDirect3DVertexShader var5;
        if (this.field9418) {
            var5 = var3 == Integer.MAX_VALUE ? this.field9417 : this.field9422;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field9416 : this.field9419;
        }
        if (this.field9415 != var5) {
            this.field9415 = var5;
            this.field9412.method1532(var5, true);
            this.method3841(93);
            this.method1300((byte) 111);
            this.method1301(false);
            this.method1297(true);
            this.method1298((byte) 82);
            this.method1299(false);
        }
        var4.method2406(0.0F, -1.0F, (byte) 70, (float) var3, 0.0F, field9420);
        var2.method3075(12, field9420);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V", line = 244)
    public final void method1297(boolean arg0) {
        if (!arg0) {
            field9420 = null;
        }
        if (this.field9415 != null) {
            IDirect3DDevice var2 = this.field9412.field3450;
            class385 var3 = this.field9412.method1127(41);
            var2.method3075(0, var3.method2388(-100, field9413));
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 276)
    public final void method926(int arg0) {
        this.field7086.method1192(-22137, 1);
        this.field7086.method1118(arg0 + 339, null);
        this.field7086.method1080(class463.field6532, class463.field6532, -30);
        this.field7086.method1180(0, (byte) 91, class605.field8453);
        this.field7086.method1180(2, (byte) 91, class683.field9465);
        this.field7086.method1082(0, class605.field8453, (byte) -112);
        this.field7086.method1192(-22137, 0);
        if (arg0 != -339) {
            field9420 = null;
        }
        if (this.field9411) {
            this.field7086.method1180(0, (byte) 91, class605.field8453);
            this.field7086.method1082(0, class605.field8453, (byte) -112);
            this.field9411 = false;
        }
        if (this.field9415 != null) {
            this.field9412.method1532(null, true);
            this.field9415 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 306)
    public final void method1298(byte arg0) {
        if (arg0 == 82 && this.field9415 != null) {
            IDirect3DDevice var2 = this.field9412.field3450;
            class385 var3 = this.field9412.method1127(59);
            var2.method3075(0, var3.method2388(arg0 - 177, field9413));
        }
    }
}
