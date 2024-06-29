import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class630 extends class499 {

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "Z")
    private boolean field7998 = false;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "Lcka;")
    private class248 field7997;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7992;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7991;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7995;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7990;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Lw;")
    private class471 field7994;

    @OriginalMember(owner = "client!qs", name = "B", descriptor = "Z")
    private boolean field8000;

    @OriginalMember(owner = "client!qs", name = "A", descriptor = "[F")
    private static float[] field7999 = new float[16];

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "[F")
    private static float[] field7989 = new float[4];

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7996;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "Z")
    private boolean field7993;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
    public final void method204(byte arg0, int arg1, int arg2) {
        if (arg0 <= 11) {
            this.field7994 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(B)V")
    public final void method198(byte arg0) {
        int var2 = 83 % ((-arg0 - 66) / 36);
        if (this.field7996 != null) {
            IDirect3DDevice var3 = this.field7997.field3402;
            class588 var4 = this.field6405.method3757(-8);
            var3.SetVertexShaderConstantF(8, var4.method3144(field7999, (byte) -117), 2);
        }
    }

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "(I)V")
    private final void method3366(int arg0) {
        if (arg0 >= -87) {
            this.method1766((byte) 5);
        }
        if (this.field7996 == null || !this.field7993) {
            return;
        }
        class588 var2 = this.field6405.method3784(-15173);
        IDirect3DDevice var3 = this.field7997.field3402;
        var3.method4176(13, this.field6405.field9179 * this.field6405.field9143, this.field6405.field9188 * this.field6405.field9143, this.field6405.field9213 * this.field6405.field9143, 1.0F);
        var3.method4176(14, this.field6405.field9179 * this.field6405.field9154, this.field6405.field9188 * this.field6405.field9154, this.field6405.field9213 * this.field6405.field9154, 1.0F);
        var3.method4176(16, this.field6405.field9179 * this.field6405.field9173, this.field6405.field9188 * this.field6405.field9173, this.field6405.field9213 * this.field6405.field9173, 1.0F);
        var2.method3166(this.field6405.field9203[0], field7989, this.field6405.field9203[1], 116, this.field6405.field9203[2]);
        var3.SetVertexShaderConstantF(15, field7989, 1);
        var2.method3166(this.field6405.field9175[0], field7989, this.field6405.field9175[1], 111, this.field6405.field9175[2]);
        var3.SetVertexShaderConstantF(17, field7989, 1);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZZ)V")
    public final void method202(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method206(-50, null, 69);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public final void method205(int arg0) {
        this.field6405.method3712(-14720, 1);
        this.field6405.method3756(10, null);
        this.field6405.method3759(false, class137.field1820, class137.field1820);
        this.field6405.method3736(class171.field2262, arg0, (byte) -88);
        this.field6405.method3736(class324.field4001, 2, (byte) -88);
        this.field6405.method3718(0, class171.field2262, 1);
        this.field6405.method3712(-14720, 0);
        if (this.field7998) {
            this.field6405.method3736(class171.field2262, 0, (byte) -88);
            this.field6405.method3718(0, class171.field2262, 1);
            this.field7998 = false;
        }
        if (this.field7996 != null) {
            this.field7997.method1619(0, null);
            this.field7996 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lcka;Lwm;)V")
    public class630(class248 arg0, class30 arg1) {
        super(arg0);
        this.field7997 = arg0;
        if (arg1 == null || (this.field7997.field3400.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8000 = false;
        } else {
            this.field7992 = this.field7997.field3402.method4185(arg1.method142(-1, "dx", "uw_ground_unlit"));
            this.field7991 = this.field7997.field3402.method4185(arg1.method142(-1, "dx", "uw_ground_lit"));
            this.field7995 = this.field7997.field3402.method4185(arg1.method142(-1, "dx", "uw_model_unlit"));
            this.field7990 = this.field7997.field3402.method4185(arg1.method142(-1, "dx", "uw_model_lit"));
            if (this.field7990 != null & this.field7995 != null & this.field7991 != null & this.field7992 != null) {
                this.field7994 = this.field6405.method3719(2, new int[] { 0, -1 }, (byte) -117, 1, false);
                this.field7994.method1131(false, false, 78);
                this.field8000 = true;
            } else {
                this.field8000 = false;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ILsfa;I)V")
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg1 != null) {
            if (this.field7998) {
                this.field6405.method3736(class171.field2262, 0, (byte) -88);
                this.field6405.method3718(0, class171.field2262, 1);
                this.field7998 = false;
            }
            this.field6405.method3756(10, arg1);
            this.field6405.method3740(arg0, 36);
        } else if (!this.field7998) {
            this.field6405.method3756(10, this.field6405.field9128);
            this.field6405.method3740(1, 49);
            this.field6405.method3736(class13.field134, 0, (byte) -88);
            this.field6405.method3718(0, class13.field134, 1);
            this.field7998 = true;
        }
        if (arg2 != 26917) {
            this.field7998 = true;
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(B)V")
    public final void method1766(byte arg0) {
        IDirect3DDevice var2 = this.field7997.field3402;
        int var3 = this.field6405.method3785(3261);
        class588 var4 = this.field6405.method3780(1);
        int var5 = -17 / ((-arg0 - 41) / 33);
        IDirect3DVertexShader var6;
        if (this.field7993) {
            var6 = var3 == Integer.MAX_VALUE ? this.field7991 : this.field7990;
        } else {
            var6 = ~var3 == Integer.MIN_VALUE ? this.field7992 : this.field7995;
        }
        if (this.field7996 != var6) {
            this.field7996 = var6;
            this.field7997.method1619(0, var6);
            this.method3366(-92);
            this.method203((byte) 13);
            this.method198((byte) 107);
            this.method197((byte) 112);
            this.method199(-69);
            this.method196(7);
        }
        var4.method3154((float) var3, field7989, -1.0F, 91, 0.0F, 0.0F);
        var2.method4178(12, field7989);
    }

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "(I)V")
    public final void method196(int arg0) {
        if (arg0 != 7 || this.field7996 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7997.field3402;
        int var3 = this.field6405.method985();
        int var4 = this.field6405.method951();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
        var2.method4176(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method4176(11, 1.0F / (float) this.field6405.method3741(false), (float) this.field6405.method3747(arg0 ^ 0xFFFFFFA5) / 255.0F, this.field6405.field9120, 1.0F / (this.field6405.field9120 - this.field6405.field9159));
        this.field6405.method3771(this.field6405.method3710(arg0 ^ 0x23F0), -9445);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IZ)V")
    public final void method201(int arg0, boolean arg1) {
        this.field7993 = arg1;
        this.field6405.method3712(arg0 - 14811, 1);
        this.field6405.method3756(10, this.field7994);
        if (arg0 != 91) {
            return;
        }
        this.field6405.method3759(false, class361.field4395, class174.field2285);
        this.field6405.method3736(class324.field4001, 0, (byte) -88);
        this.field6405.method1205(2, 31, class171.field2262, true, false);
        this.field6405.method3718(0, class13.field134, arg0 ^ 0x5A);
        this.field6405.method3712(-14720, 0);
        this.method1766((byte) 49);
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
    public final void method203(byte arg0) {
        if (this.field7996 != null) {
            IDirect3DDevice var2 = this.field7997.field3402;
            var2.method4178(4, this.field6405.method3721((byte) -120, field7999));
        }
        if (arg0 != 13) {
            this.method199(-88);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method199(int arg0) {
        if (this.field7996 != null) {
            IDirect3DDevice var2 = this.field7997.field3402;
            class588 var3 = this.field7997.method3743(2);
            var2.method4178(0, var3.method3163(field7999, 124));
        }
        if (arg0 > -28) {
            this.field7991 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Z)Z")
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            this.field7990 = null;
        }
        return this.field8000;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)V")
    public final void method197(byte arg0) {
        if (this.field7996 != null) {
            IDirect3DDevice var2 = this.field7997.field3402;
            class588 var3 = this.field7997.method3743(2);
            var2.method4178(0, var3.method3163(field7999, -24));
        }
        int var4 = -24 % ((-arg0 - 69) / 46);
    }
}
