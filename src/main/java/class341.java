import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public class class341 extends class55 {

    @OriginalMember(owner = "client!vu", name = "w", descriptor = "Z")
    private boolean field4318 = false;

    @OriginalMember(owner = "client!vu", name = "n", descriptor = "Lul;")
    private class574 field4309;

    @OriginalMember(owner = "client!vu", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4313;

    @OriginalMember(owner = "client!vu", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4310;

    @OriginalMember(owner = "client!vu", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4308;

    @OriginalMember(owner = "client!vu", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4311;

    @OriginalMember(owner = "client!vu", name = "v", descriptor = "Z")
    private boolean field4317;

    @OriginalMember(owner = "client!vu", name = "l", descriptor = "Lwk;")
    private class145 field4307;

    @OriginalMember(owner = "client!vu", name = "q", descriptor = "[F")
    private static float[] field4312 = new float[16];

    @OriginalMember(owner = "client!vu", name = "t", descriptor = "[F")
    private static float[] field4315 = new float[4];

    @OriginalMember(owner = "client!vu", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4316;

    @OriginalMember(owner = "client!vu", name = "s", descriptor = "Z")
    private boolean field4314;

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field4316 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "b", descriptor = "(I)V")
    public final void method404(int arg0) {
        if (arg0 < 20) {
            this.method404(-108);
        }
        if (this.field4316 != null) {
            IDirect3DDevice var2 = this.field4309.field8080;
            var2.method2867(4, this.field759.method2432(-23481, field4312));
        }
    }

    @OriginalMember(owner = "client!vu", name = "e", descriptor = "(I)V")
    public final void method407(int arg0) {
        if (arg0 >= 21 && this.field4316 != null) {
            IDirect3DDevice var2 = this.field4309.field8080;
            class477 var3 = this.field4309.method2429(11);
            var2.method2867(0, var3.method2731(field4312, (byte) -115));
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        int var3 = -44 % ((arg1 + 61) / 44);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        this.field759.method2393(1, (byte) -110);
        if (!arg0) {
            this.method196(-43, false);
        }
        this.field759.method2396(22357, null);
        this.field759.method2397(class405.field5120, class405.field5120, (byte) -127);
        this.field759.method2394(class447.field5937, (byte) 63, 0);
        this.field759.method2394(class21.field383, (byte) 93, 2);
        this.field759.method2422(class447.field5937, 0, (byte) -10);
        this.field759.method2393(0, (byte) -120);
        if (this.field4318) {
            this.field759.method2394(class447.field5937, (byte) 116, 0);
            this.field759.method2422(class447.field5937, 0, (byte) -10);
            this.field4318 = false;
        }
        if (this.field4316 != null) {
            this.field4309.method3293(87, null);
            this.field4316 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)V")
    public final void method403(byte arg0) {
        if (this.field4316 != null) {
            IDirect3DDevice var2 = this.field4309.field8080;
            int var3 = this.field759.method546();
            int var4 = this.field759.method451();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2869(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2869(11, 1.0F / (float) this.field759.method2411(arg0 ^ 0x689B), (float) this.field759.method2401(10426) / 255.0F, this.field759.field5607, 1.0F / (this.field759.field5607 - this.field759.field5598));
            this.field759.method2382(this.field759.method2425((byte) 103), -4068);
        }
        if (arg0 != 119) {
            this.method1970(-120);
        }
    }

    @OriginalMember(owner = "client!vu", name = "g", descriptor = "(I)V")
    private final void method1970(int arg0) {
        if (arg0 < 29 || this.field4316 == null || !this.field4314) {
            return;
        }
        class477 var2 = this.field759.method2357(30513);
        IDirect3DDevice var3 = this.field4309.field8080;
        var3.method2869(13, this.field759.field5650 * this.field759.field5620, this.field759.field5656 * this.field759.field5650, this.field759.field5650 * this.field759.field5600, 1.0F);
        var3.method2869(14, this.field759.field5620 * this.field759.field5610, this.field759.field5656 * this.field759.field5610, this.field759.field5610 * this.field759.field5600, 1.0F);
        var3.method2869(16, this.field759.field5669 * this.field759.field5620, this.field759.field5669 * this.field759.field5656, this.field759.field5669 * this.field759.field5600, 1.0F);
        var2.method2735(field4315, this.field759.field5596[0], 2, this.field759.field5596[1], this.field759.field5596[2]);
        var3.SetVertexShaderConstantF(15, field4315, 1);
        var2.method2735(field4315, this.field759.field5590[0], 2, this.field759.field5590[1], this.field759.field5590[2]);
        var3.SetVertexShaderConstantF(17, field4315, 1);
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        this.field4314 = arg1;
        this.field759.method2393(1, (byte) 19);
        this.field759.method2396(22357, this.field4307);
        this.field759.method2397(class740.field10325, class476.field6418, (byte) -106);
        this.field759.method2394(class21.field383, (byte) 112, 0);
        if (arg0 != 5) {
            this.method202(-37);
        }
        this.field759.method2036((byte) 120, false, true, class447.field5937, 2);
        this.field759.method2422(class84.field1162, 0, (byte) -10);
        this.field759.method2393(0, (byte) 59);
        this.method405(7289);
    }

    @OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)V")
    public final void method405(int arg0) {
        IDirect3DDevice var2 = this.field4309.field8080;
        int var3 = this.field759.method2389(110);
        class477 var4 = this.field759.method2383((byte) 80);
        IDirect3DVertexShader var5;
        if (this.field4314) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4310 : this.field4311;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4313 : this.field4308;
        }
        if (this.field4316 != var5) {
            this.field4316 = var5;
            this.field4309.method3293(87, var5);
            this.method1970(89);
            this.method404(arg0 ^ 0x1C45);
            this.method406(arg0 - 7288);
            this.method402(-3);
            this.method407(71);
            this.method403((byte) 119);
        }
        var4.method2751((float) var3, 0.0F, field4315, (byte) 119, -1.0F, 0.0F);
        var2.method2867(12, field4315);
        if (arg0 != 7289) {
            this.method196(-47, true);
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)V")
    public final void method402(int arg0) {
        if (this.field4316 != null) {
            IDirect3DDevice var2 = this.field4309.field8080;
            class477 var3 = this.field4309.method2429(11);
            var2.method2867(0, var3.method2731(field4312, (byte) -115));
        }
        if (arg0 != -3) {
            this.method202(-80);
        }
    }

    @OriginalMember(owner = "client!vu", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        if (arg0 != 1) {
            this.field4309 = null;
        }
        return this.field4317;
    }

    @OriginalMember(owner = "client!vu", name = "<init>", descriptor = "(Lul;Lnd;)V")
    public class341(class574 arg0, class547 arg1) {
        super(arg0);
        this.field4309 = arg0;
        if (arg1 == null || (this.field4309.field8059.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4317 = false;
        } else {
            this.field4313 = this.field4309.field8080.method2868(arg1.method3158("dx", (byte) 100, "uw_ground_unlit"));
            this.field4310 = this.field4309.field8080.method2868(arg1.method3158("dx", (byte) 94, "uw_ground_lit"));
            this.field4308 = this.field4309.field8080.method2868(arg1.method3158("dx", (byte) 115, "uw_model_unlit"));
            this.field4311 = this.field4309.field8080.method2868(arg1.method3158("dx", (byte) 95, "uw_model_lit"));
            if ((this.field4311 != null & this.field4310 != null & this.field4313 != null & this.field4308 != null)) {
                this.field4307 = this.field759.method2407(122, false, new int[] { 0, -1 }, 1, 2);
                this.field4307.method813((byte) -93, false, false);
                this.field4317 = true;
            } else {
                this.field4317 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vu", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg2 != null) {
            if (this.field4318) {
                this.field759.method2394(class447.field5937, (byte) 103, 0);
                this.field759.method2422(class447.field5937, 0, (byte) -10);
                this.field4318 = false;
            }
            this.field759.method2396(22357, arg2);
            this.field759.method2379(arg0, -15829);
        } else if (!this.field4318) {
            this.field759.method2396(22357, this.field759.field5648);
            this.field759.method2379(1, -15829);
            this.field759.method2394(class84.field1162, (byte) 67, 0);
            this.field759.method2422(class84.field1162, 0, (byte) -10);
            this.field4318 = true;
        }
        if (arg1 <= 30) {
            field4315 = null;
        }
    }

    @OriginalMember(owner = "client!vu", name = "d", descriptor = "(I)V")
    public final void method406(int arg0) {
        if (arg0 != 1) {
            this.method403((byte) -17);
        }
        if (this.field4316 != null) {
            IDirect3DDevice var2 = this.field4309.field8080;
            class477 var3 = this.field759.method2406(false);
            var2.SetVertexShaderConstantF(8, var3.method2743(-123, field4312), 2);
        }
    }
}
