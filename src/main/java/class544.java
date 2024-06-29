import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class544 extends class648 {

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Z")
    private boolean field7745 = false;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "Lfi;")
    private class558 field7743;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7742;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7737;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7739;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7735;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "Lch;")
    private class465 field7734;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "Z")
    private boolean field7744;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "[F")
    private static float[] field7741 = new float[16];

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "[F")
    private static float[] field7738 = new float[4];

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7740;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "Z")
    private boolean field7736;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V", line = 4)
    private final void method3193(byte arg0) {
        if (this.field7740 != null && this.field7736) {
            class441 var2 = this.field9139.method2321(0);
            IDirect3DDevice var3 = this.field7743.field7959;
            var3.method2915(13, this.field9139.field5602 * this.field9139.field5575, this.field9139.field5639 * this.field9139.field5575, this.field9139.field5576 * this.field9139.field5575, 1.0F);
            var3.method2915(14, this.field9139.field5612 * this.field9139.field5602, this.field9139.field5639 * this.field9139.field5612, this.field9139.field5612 * this.field9139.field5576, 1.0F);
            var3.method2915(16, this.field9139.field5644 * this.field9139.field5602, this.field9139.field5644 * this.field9139.field5639, this.field9139.field5644 * this.field9139.field5576, 1.0F);
            var2.method2735(this.field9139.field5617[2], field7738, this.field9139.field5617[1], 2, this.field9139.field5617[0]);
            var3.SetVertexShaderConstantF(15, field7738, 1);
            var2.method2735(this.field9139.field5598[2], field7738, this.field9139.field5598[1], 2, this.field9139.field5598[0]);
            var3.SetVertexShaderConstantF(17, field7738, 1);
        }
        if (arg0 > -3) {
            this.field7735 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)V", line = 33)
    public final void method1448(boolean arg0, int arg1) {
        if (arg1 != 0) {
            this.method2630(true);
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)Z", line = 42)
    public final boolean method1449(int arg0) {
        if (arg0 != 13003) {
            this.field7742 = null;
        }
        return this.field7744;
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(Z)V", line = 54)
    public final void method2498(boolean arg0) {
        if (this.field7740 != null) {
            IDirect3DDevice var2 = this.field7743.field7959;
            int var3 = this.field9139.method514();
            int var4 = this.field9139.method457();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2915(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2915(11, 1.0F / (float) this.field9139.method2361(90), (float) this.field9139.method2416(1) / 255.0F, this.field9139.field5627, 1.0F / (this.field9139.field5627 - this.field9139.field5638));
            this.field9139.method2415(this.field9139.method2333(-71), 0);
        }
        if (!arg0) {
            this.method1455(null, -43, -127);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lbca;II)V", line = 80)
    public final void method1455(class663 arg0, int arg1, int arg2) {
        if (arg1 != 12885) {
            this.field7744 = true;
        }
        if (arg0 != null) {
            if (this.field7745) {
                this.field9139.method2329(0, (byte) -128, class331.field4759);
                this.field9139.method2407(0, class331.field4759, arg1 - 12799);
                this.field7745 = false;
            }
            this.field9139.method2294(arg0, arg1 ^ 0xFFFFCDAB);
            this.field9139.method2353((byte) -115, arg2);
        } else if (!this.field7745) {
            this.field9139.method2294(this.field9139.field5583, -2);
            this.field9139.method2353((byte) -69, 1);
            this.field9139.method2329(0, (byte) -128, class328.field4670);
            this.field9139.method2407(0, class328.field4670, arg1 - 12795);
            this.field7745 = true;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V", line = 119)
    public final void method2497(boolean arg0) {
        IDirect3DDevice var2 = this.field7743.field7959;
        int var3 = this.field9139.method2393((byte) 114);
        if (arg0) {
            this.field7739 = null;
        }
        class441 var4 = this.field9139.method2347((byte) -85);
        IDirect3DVertexShader var5;
        if (this.field7736) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field7737 : this.field7735;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field7742 : this.field7739;
        }
        if (this.field7740 != var5) {
            this.field7740 = var5;
            this.field7743.method3263(var5, -101);
            this.method3193((byte) -11);
            this.method2630(!arg0);
            this.method2631(!arg0);
            this.method2629((byte) 6);
            this.method2628(true);
            this.method2498(!arg0);
        }
        var4.method2740((byte) -95, field7738, 0.0F, (float) var3, 0.0F, -1.0F);
        var2.method2911(12, field7738);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lfi;Lvd;)V", line = 156)
    public class544(class558 arg0, class39 arg1) {
        super(arg0);
        this.field7743 = arg0;
        if (arg1 == null || (this.field7743.field7955.VertexShaderVersion & 0xFFFF) < 257) {
            this.field7744 = false;
        } else {
            this.field7742 = this.field7743.field7959.method2907(arg1.method233(-101, "dx", "uw_ground_unlit"));
            this.field7737 = this.field7743.field7959.method2907(arg1.method233(-103, "dx", "uw_ground_lit"));
            this.field7739 = this.field7743.field7959.method2907(arg1.method233(-109, "dx", "uw_model_unlit"));
            this.field7735 = this.field7743.field7959.method2907(arg1.method233(-98, "dx", "uw_model_lit"));
            if (this.field7739 != null & this.field7737 != null & this.field7742 != null & this.field7735 != null) {
                this.field7734 = this.field9139.method2358(37, false, 1, new int[] { 0, -1 }, 2);
                this.field7734.method1272(false, (byte) -78, false);
                this.field7744 = true;
            } else {
                this.field7744 = false;
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 185)
    public final void method2629(byte arg0) {
        if (arg0 != 6) {
            this.field7734 = null;
        }
        if (this.field7740 != null) {
            IDirect3DDevice var2 = this.field7743.field7959;
            class441 var3 = this.field7743.method2338(1);
            var2.method2911(0, var3.method2741(field7741, 7));
        }
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V", line = 203)
    public final void method2628(boolean arg0) {
        if (arg0 && this.field7740 != null) {
            IDirect3DDevice var2 = this.field7743.field7959;
            class441 var3 = this.field7743.method2338(1);
            var2.method2911(0, var3.method2741(field7741, 7));
        }
    }

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "(Z)V", line = 221)
    public final void method2631(boolean arg0) {
        if (!arg0) {
            this.method2630(true);
        }
        if (this.field7740 != null) {
            IDirect3DDevice var2 = this.field7743.field7959;
            class441 var3 = this.field9139.method2350((byte) 37);
            var2.SetVertexShaderConstantF(8, var3.method2733((byte) 115, field7741), 2);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 240)
    public final void method2630(boolean arg0) {
        if (this.field7740 != null) {
            IDirect3DDevice var2 = this.field7743.field7959;
            var2.method2911(4, this.field9139.method2372(field7741, (byte) -70));
        }
        if (!arg0) {
            this.field7743 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZZ)V", line = 265)
    public final void method1451(boolean arg0, boolean arg1) {
        this.field7736 = arg1;
        this.field9139.method2375((byte) -106, 1);
        this.field9139.method2294(this.field7734, -2);
        this.field9139.method2300(class499.field7099, class49.field706, 0);
        this.field9139.method2329(0, (byte) -126, class469.field6850);
        this.field9139.method2340(class331.field4759, true, 2, arg0, true);
        this.field9139.method2407(0, class328.field4670, 74);
        this.field9139.method2375((byte) -113, 0);
        this.method2497(false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BII)V", line = 284)
    public final void method1453(byte arg0, int arg1, int arg2) {
        if (arg0 < 33) {
            this.method1453((byte) -128, -64, 7);
        }
    }

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 293)
    public final void method1450(int arg0) {
        this.field9139.method2375((byte) 79, 1);
        this.field9139.method2294(null, -2);
        if (arg0 > -67) {
            this.method2497(false);
        }
        this.field9139.method2300(class336.field4874, class336.field4874, 0);
        this.field9139.method2329(0, (byte) -127, class331.field4759);
        this.field9139.method2329(2, (byte) -127, class469.field6850);
        this.field9139.method2407(0, class331.field4759, 124);
        this.field9139.method2375((byte) 97, 0);
        if (this.field7745) {
            this.field9139.method2329(0, (byte) -126, class331.field4759);
            this.field9139.method2407(0, class331.field4759, 53);
            this.field7745 = false;
        }
        if (this.field7740 != null) {
            this.field7743.method3263(null, -96);
            this.field7740 = null;
        }
    }
}
