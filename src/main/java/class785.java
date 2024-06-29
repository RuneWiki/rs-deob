import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class785 extends class155 {

    @OriginalMember(owner = "client!nca", name = "o", descriptor = "Z")
    private boolean field10783 = false;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "Laia;")
    private class242 field10791;

    @OriginalMember(owner = "client!nca", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10782;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10785;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10786;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10787;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "Z")
    private boolean field10790;

    @OriginalMember(owner = "client!nca", name = "m", descriptor = "Lgl;")
    private class627 field10781;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "[F")
    private static float[] field10789 = new float[16];

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "[F")
    private static float[] field10788 = new float[4];

    @OriginalMember(owner = "client!nca", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10784;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "Z")
    private boolean field10792;

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Laia;Lgj;)V", line = 3)
    public class785(class242 arg0, class662 arg1) {
        super(arg0);
        this.field10791 = arg0;
        if (arg1 == null || (this.field10791.field3449.VertexShaderVersion & 0xFFFF) < 257) {
            this.field10790 = false;
        } else {
            this.field10782 = this.field10791.field3462.method2929(arg1.method3726(-99, "dx", "uw_ground_unlit"));
            this.field10785 = this.field10791.field3462.method2929(arg1.method3726(-119, "dx", "uw_ground_lit"));
            this.field10786 = this.field10791.field3462.method2929(arg1.method3726(-82, "dx", "uw_model_unlit"));
            this.field10787 = this.field10791.field3462.method2929(arg1.method3726(-128, "dx", "uw_model_lit"));
            if ((this.field10787 != null & this.field10782 != null & this.field10785 != null & this.field10786 != null)) {
                this.field10781 = this.field2533.method3139(false, 1, false, 2, new int[] { 0, -1 });
                this.field10781.method2679(false, false, -17383);
                this.field10790 = true;
            } else {
                this.field10790 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZ)V", line = 32)
    public final void method258(int arg0, boolean arg1) {
        this.field10792 = arg1;
        this.field2533.method3114(1, false);
        if (arg0 != 205) {
            return;
        }
        this.field2533.method3090(this.field10781, (byte) -21);
        this.field2533.method3118(class371.field5051, class34.field565, 0);
        this.field2533.method3143(class633.field8767, true, 0);
        this.field2533.method841(class327.field4459, true, 2, false, arg0 + 18475);
        this.field2533.method3168((byte) 61, 0, class606.field8459);
        this.field2533.method3114(0, false);
        this.method1210((byte) 2);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)V", line = 50)
    public final void method254(int arg0, int arg1, byte arg2) {
        if (arg2 != -92) {
            this.method260(-107);
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)Z", line = 61)
    public final boolean method250(int arg0) {
        int var2 = 123 % ((-arg0 - 8) / 41);
        return this.field10790;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V", line = 69)
    public final void method251(byte arg0) {
        if (this.field10784 != null) {
            IDirect3DDevice var2 = this.field10791.field3462;
            int var3 = this.field2533.method563();
            int var4 = this.field2533.method552();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2927(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2927(11, 1.0F / (float) this.field2533.method3106(0), (float) this.field2533.method3124((byte) -80) / 255.0F, this.field2533.field7722, 1.0F / (this.field2533.field7722 - this.field2533.field7702));
            this.field2533.method3130((byte) -100, this.field2533.method3137(-29));
        }
        if (arg0 < 87) {
            this.method256(-46);
        }
    }

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V", line = 96)
    private final void method4286(int arg0) {
        if (arg0 != 76) {
            this.field10785 = null;
        }
        if (this.field10784 == null || !this.field10792) {
            return;
        }
        class421 var2 = this.field2533.method3158(0);
        IDirect3DDevice var3 = this.field10791.field3462;
        var3.method2927(13, this.field2533.field7700 * this.field2533.field7685, this.field2533.field7692 * this.field2533.field7685, this.field2533.field7715 * this.field2533.field7685, 1.0F);
        var3.method2927(14, this.field2533.field7721 * this.field2533.field7700, this.field2533.field7721 * this.field2533.field7692, this.field2533.field7721 * this.field2533.field7715, 1.0F);
        var3.method2927(16, this.field2533.field7725 * this.field2533.field7700, this.field2533.field7725 * this.field2533.field7692, this.field2533.field7725 * this.field2533.field7715, 1.0F);
        var2.method2474(field10788, 38, this.field2533.field7726[2], this.field2533.field7726[1], this.field2533.field7726[0]);
        var3.SetVertexShaderConstantF(15, field10788, 1);
        var2.method2474(field10788, 27, this.field2533.field7738[2], this.field2533.field7738[1], this.field2533.field7738[0]);
        var3.SetVertexShaderConstantF(17, field10788, 1);
    }

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)V", line = 120)
    public final void method260(int arg0) {
        if (arg0 != 110) {
            this.method255(39);
        }
        if (this.field10784 != null) {
            IDirect3DDevice var2 = this.field10791.field3462;
            class421 var3 = this.field10791.method3091(true);
            var2.method2918(0, var3.method2495(field10789, (byte) -37));
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lbr;II)V", line = 139)
    public final void method259(class416 arg0, int arg1, int arg2) {
        if (arg0 != null) {
            if (this.field10783) {
                this.field2533.method3143(class327.field4459, true, 0);
                this.field2533.method3168((byte) 26, 0, class327.field4459);
                this.field10783 = false;
            }
            this.field2533.method3090(arg0, (byte) 103);
            this.field2533.method3113(-3334, arg2);
        } else if (!this.field10783) {
            this.field2533.method3090(this.field2533.field7686, (byte) -87);
            this.field2533.method3113(-3334, 1);
            this.field2533.method3143(class606.field8459, true, 0);
            this.field2533.method3168((byte) 88, 0, class606.field8459);
            this.field10783 = true;
        }
        if (arg1 >= -71) {
            this.field10783 = true;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V", line = 181)
    public final void method257(boolean arg0, boolean arg1) {
        if (arg0) {
            this.method250(-7);
        }
    }

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)V", line = 191)
    public final void method252(int arg0) {
        if (arg0 != 155) {
            field10788 = null;
        }
        if (this.field10784 != null) {
            IDirect3DDevice var2 = this.field10791.field3462;
            var2.method2918(4, this.field2533.method3100(field10789, 18895));
        }
    }

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V", line = 209)
    public final void method255(int arg0) {
        this.field2533.method3114(1, false);
        this.field2533.method3090(null, (byte) -74);
        this.field2533.method3118(class671.field9318, class671.field9318, 0);
        if (arg0 >= -119) {
            return;
        }
        this.field2533.method3143(class327.field4459, true, 0);
        this.field2533.method3143(class633.field8767, true, 2);
        this.field2533.method3168((byte) 46, 0, class327.field4459);
        this.field2533.method3114(0, false);
        if (this.field10783) {
            this.field2533.method3143(class327.field4459, true, 0);
            this.field2533.method3168((byte) 102, 0, class327.field4459);
            this.field10783 = false;
        }
        if (this.field10784 != null) {
            this.field10791.method1620(null, (byte) 73);
            this.field10784 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V", line = 240)
    public final void method1210(byte arg0) {
        IDirect3DDevice var2 = this.field10791.field3462;
        int var3 = this.field2533.method3165(1);
        if (arg0 != 2) {
            this.method255(-75);
        }
        class421 var4 = this.field2533.method3094((byte) -124);
        IDirect3DVertexShader var5;
        if (this.field10792) {
            var5 = var3 == Integer.MAX_VALUE ? this.field10785 : this.field10787;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field10782 : this.field10786;
        }
        if (this.field10784 != var5) {
            this.field10784 = var5;
            this.field10791.method1620(var5, (byte) 73);
            this.method4286(76);
            this.method252(arg0 ^ 0x99);
            this.method256(-92);
            this.method260(110);
            this.method253(155);
            this.method251((byte) 114);
        }
        var4.method2484(0.0F, arg0 - 1, field10788, -1.0F, (float) var3, 0.0F);
        var2.method2918(12, field10788);
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V", line = 282)
    public final void method256(int arg0) {
        if (arg0 > -19) {
            this.method260(63);
        }
        if (this.field10784 != null) {
            IDirect3DDevice var2 = this.field10791.field3462;
            class421 var3 = this.field2533.method3152(8);
            var2.SetVertexShaderConstantF(8, var3.method2479(-24175, field10789), 2);
        }
    }

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V", line = 301)
    public final void method253(int arg0) {
        if (arg0 != 155) {
            this.method260(85);
        }
        if (this.field10784 != null) {
            IDirect3DDevice var2 = this.field10791.field3462;
            class421 var3 = this.field10791.method3091(true);
            var2.method2918(0, var3.method2495(field10789, (byte) -37));
        }
    }
}
