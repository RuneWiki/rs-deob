import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class10 extends class369 {

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Leda;")
    private class561 field97;

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field96;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field98;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field100;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field104;

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "Lpm;")
    private class134 field102;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Z")
    private boolean field103;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "[F")
    private static float[] field105 = new float[4];

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "[F")
    private static float[] field101 = new float[16];

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field99;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "Z")
    private boolean field106;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)V", line = 11)
    public final void method7(int arg0, int arg1, int arg2) {
        if (arg1 != 8250) {
            this.method57(-121);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 22)
    public final void method56(byte arg0) {
        IDirect3DDevice var2 = this.field97.field8021;
        int var3 = this.field5047.method2037(9);
        class537 var4 = this.field5047.method2030(29443);
        if (arg0 <= 36) {
            field105 = null;
        }
        IDirect3DVertexShader var5;
        if (this.field106) {
            var5 = var3 == Integer.MAX_VALUE ? this.field98 : this.field104;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field96 : this.field100;
        }
        if (this.field99 != var5) {
            this.field99 = var5;
            var2.SetVertexShader(var5);
            this.method57(-13225);
            this.method6((byte) 76);
            this.method4((byte) 84);
            this.method1(8220);
            this.method2(17789);
            this.method11(103);
        }
        var4.method3018(0.0F, -1.0F, 0.0F, field105, (float) var3, -32586);
        var2.method2528(12, field105);
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(I)Z", line = 62)
    public final boolean method8(int arg0) {
        int var2 = -17 % ((arg0 - 37) / 36);
        return this.field103;
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(I)V", line = 70)
    public final void method11(int arg0) {
        if (this.field99 != null) {
            IDirect3DDevice var2 = this.field97.field8021;
            int var3 = this.field5047.method971();
            int var4 = this.field5047.method966();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2520(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2520(11, 1.0F / (float) this.field5047.method2022(0), (float) this.field5047.method2052(-6771) / 255.0F, this.field5047.field4549, 1.0F / (this.field5047.field4549 - this.field5047.field4550));
            this.field5047.method1988(this.field5047.method1990(0), 4);
        }
        if (arg0 < 52) {
            this.method10(true, 30);
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Leda;Ltf;)V", line = 96)
    public class10(class561 arg0, class701 arg1) {
        super(arg0);
        this.field97 = arg0;
        if (arg1 == null || (this.field97.field8017.VertexShaderVersion & 0xFFFF) < 257) {
            this.field103 = false;
        } else {
            this.field96 = this.field97.field8021.method2519(arg1.method3862("uw_ground_unlit", "dx", (byte) 87));
            this.field98 = this.field97.field8021.method2519(arg1.method3862("uw_ground_lit", "dx", (byte) -127));
            this.field100 = this.field97.field8021.method2519(arg1.method3862("uw_model_unlit", "dx", (byte) 81));
            this.field104 = this.field97.field8021.method2519(arg1.method3862("uw_model_lit", "dx", (byte) 61));
            if (this.field96 != null & this.field98 != null & this.field100 != null & this.field104 != null) {
                this.field102 = this.field5047.method1983(false, (byte) 95, 1, 2, new int[] { 0, -1 });
                this.field102.method759(false, -19314, false);
                this.field103 = true;
            } else {
                this.field103 = false;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 124)
    public final void method2(int arg0) {
        if (arg0 == 17789 && this.field99 != null) {
            IDirect3DDevice var2 = this.field97.field8021;
            class537 var3 = this.field97.method2032(52);
            var2.method2528(0, var3.method3020((byte) -59, field101));
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)V", line = 143)
    public final void method3(byte arg0) {
        this.field5047.method2015(1, -2);
        this.field5047.method1997(126, null);
        this.field5047.method1994(-30, class250.field3133, class250.field3133);
        this.field5047.method2012((byte) -128, 0, class304.field3769);
        this.field5047.method2012((byte) -81, 2, class107.field1154);
        this.field5047.method1979(0, class304.field3769, (byte) -128);
        this.field5047.method2015(0, -2);
        this.field5047.method2012((byte) -62, 0, class304.field3769);
        int var2 = 48 / ((arg0 - 54) / 47);
        this.field5047.method1979(0, class304.field3769, (byte) -77);
        if (this.field99 != null) {
            this.field97.field8021.SetVertexShader(null);
            this.field99 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BILlc;)V", line = 167)
    public final void method9(byte arg0, int arg1, class686 arg2) {
        if (arg2 == null) {
            this.field5047.method1997(127, this.field5047.field4582);
            this.field5047.method2004(1, 2);
            this.field5047.method2012((byte) -128, 0, class692.field9717);
            this.field5047.method1979(0, class692.field9717, (byte) -40);
        } else {
            this.field5047.method1997(arg0 + 220, arg2);
            this.field5047.method2004(arg1, 2);
        }
        if (arg0 != -94) {
            this.method1(-14);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V", line = 190)
    public final void method10(boolean arg0, int arg1) {
        this.field106 = arg0;
        this.field5047.method2015(1, arg1 ^ 0x37F8);
        this.field5047.method1997(127, this.field102);
        this.field5047.method1994(-30, class428.field6081, class239.field2967);
        this.field5047.method2012((byte) -51, 0, class107.field1154);
        this.field5047.method1328(2, false, true, true, class304.field3769);
        this.field5047.method1979(0, class692.field9717, (byte) -51);
        this.field5047.method2015(0, arg1 ^ 0x37F8);
        if (arg1 != -14330) {
            this.method6((byte) -55);
        }
        this.method56((byte) 91);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V", line = 209)
    public final void method5(int arg0, boolean arg1) {
        if (arg0 != 382) {
            this.method7(-37, 15, 86);
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(B)V", line = 218)
    public final void method4(byte arg0) {
        if (this.field99 != null) {
            IDirect3DDevice var2 = this.field97.field8021;
            class537 var3 = this.field5047.method2020(15);
            var2.SetVertexShaderConstantF(8, var3.method3024(true, field101), 2);
        }
        if (arg0 <= 75) {
            this.method10(false, 70);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V", line = 236)
    public final void method1(int arg0) {
        if (this.field99 != null) {
            IDirect3DDevice var2 = this.field97.field8021;
            class537 var3 = this.field97.method2032(122);
            var2.method2528(0, var3.method3020((byte) -59, field101));
        }
        if (arg0 != 8220) {
            this.field103 = false;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(B)V", line = 255)
    public final void method6(byte arg0) {
        if (this.field99 != null) {
            IDirect3DDevice var2 = this.field97.field8021;
            var2.method2528(4, this.field5047.method2049((byte) -50, field101));
        }
        if (arg0 != 76) {
            this.method7(-126, -73, 105);
        }
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V", line = 274)
    private final void method57(int arg0) {
        if (this.field99 != null && this.field106) {
            class537 var2 = this.field5047.method2047(arg0 ^ 0xFFFFCC56);
            IDirect3DDevice var3 = this.field97.field8021;
            var3.method2520(13, this.field5047.field4596 * this.field5047.field4589, this.field5047.field4596 * this.field5047.field4526, this.field5047.field4596 * this.field5047.field4572, 1.0F);
            var3.method2520(14, this.field5047.field4602 * this.field5047.field4589, this.field5047.field4602 * this.field5047.field4526, this.field5047.field4602 * this.field5047.field4572, 1.0F);
            var3.method2520(16, this.field5047.field4593 * this.field5047.field4589, this.field5047.field4593 * this.field5047.field4526, this.field5047.field4593 * this.field5047.field4572, 1.0F);
            var2.method3019(field105, this.field5047.field4563[2], this.field5047.field4563[0], -60, this.field5047.field4563[1]);
            var3.SetVertexShaderConstantF(15, field105, 1);
            var2.method3019(field105, this.field5047.field4541[2], this.field5047.field4541[0], -85, this.field5047.field4541[1]);
            var3.SetVertexShaderConstantF(17, field105, 1);
        }
        if (arg0 != -13225) {
            this.field106 = true;
        }
    }
}
