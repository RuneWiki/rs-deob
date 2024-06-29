import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class694 extends class499 {

    @OriginalMember(owner = "client!pv", name = "s", descriptor = "Lcka;")
    private class248 field8906;

    @OriginalMember(owner = "client!pv", name = "t", descriptor = "Ljga;")
    private class135 field8907;

    @OriginalMember(owner = "client!pv", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8904;

    @OriginalMember(owner = "client!pv", name = "r", descriptor = "[F")
    private static float[] field8905 = new float[16];

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ZZ)V", line = 5)
    public final void method202(boolean arg0, boolean arg1) {
        this.field6405.method3759(arg1, class361.field4395, class177.field2325);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)V", line = 12)
    public final void method203(byte arg0) {
        if (this.field8904 != null) {
            IDirect3DDevice var2 = this.field8906.field3402;
            var2.method4178(4, this.field6405.method3721((byte) -120, field8905));
        }
        if (arg0 != 13) {
            this.field8907 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)Z", line = 30)
    public final boolean method200(boolean arg0) {
        if (!arg0) {
            this.field8906 = null;
        }
        return this.field8904 != null;
    }

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "(I)V", line = 40)
    public final void method196(int arg0) {
        if (arg0 != 7) {
            this.method199(68);
        }
        if (this.field8904 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8906.field3402;
        if (this.field6405.field9183 > 0) {
            float var3 = this.field6405.field9120;
            float var4 = this.field6405.field9159;
            float var5 = var4 - 512.0F;
            var2.method4176(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method4176(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field6405.method3771(this.field6405.field9141, -9445);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 70)
    public final void method205(int arg0) {
        this.field8906.method1619(0, null);
        this.field6405.method3736(class171.field2262, 0, (byte) -88);
        this.field6405.method3736(class436.field5734, 1, (byte) -88);
        this.field6405.method3736(class324.field4001, 2, (byte) -88);
        this.field6405.method3778(arg0 ^ arg0, true);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)V", line = 81)
    public final void method201(int arg0, boolean arg1) {
        this.field6405.method3736(class171.field2262, 0, (byte) -88);
        this.field6405.method3736(class324.field4001, 1, (byte) -88);
        this.field6405.method1205(2, arg0 - 9, class436.field5734, false, true);
        this.field6405.method3778(0, false);
        this.field8906.method1619(0, this.field8904);
        this.method197((byte) -115);
        this.method198((byte) 12);
        this.method203((byte) 13);
        if (arg0 == 91) {
            this.method196(arg0 - 84);
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V", line = 99)
    public final void method199(int arg0) {
        if (arg0 > -28) {
            this.field8904 = null;
        }
        if (this.field8904 != null) {
            IDirect3DDevice var2 = this.field8906.field3402;
            class588 var3 = this.field8906.method3743(2);
            var2.method4178(0, var3.method3163(field8905, 112));
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(BII)V", line = 120)
    public final void method204(byte arg0, int arg1, int arg2) {
        if (arg0 <= 11) {
            this.field8904 = null;
        }
        IDirect3DDevice var4 = this.field8906.field3402;
        if (this.field8907.field1786) {
            float var6 = (float) (this.field6405.field9192 % 4000) / 4000.0F;
            this.field6405.method3756(10, this.field8907.field1785);
            var4.method4176(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field6405.field9192 % 4000 * 16 / 4000;
            this.field6405.method3756(10, this.field8907.field1787[var5]);
            var4.method4176(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lcka;Lwm;Ljga;)V", line = 145)
    public class694(class248 arg0, class30 arg1, class135 arg2) {
        super(arg0);
        this.field8906 = arg0;
        this.field8907 = arg2;
        if (arg1 != null && this.field8907.method781(-1) && (this.field8906.field3400.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8904 = this.field8906.field3402.method4185(arg1.method142(-1, "dx", "transparent_water"));
        } else {
            this.field8904 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 165)
    public final void method197(byte arg0) {
        int var2 = 64 / ((-arg0 - 69) / 46);
        if (this.field8904 != null) {
            IDirect3DDevice var3 = this.field8906.field3402;
            class588 var4 = this.field8906.method3743(2);
            var3.method4178(0, var4.method3163(field8905, -122));
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILsfa;I)V", line = 181)
    public final void method206(int arg0, class132 arg1, int arg2) {
        if (arg2 != 26917) {
            field8905 = null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "(B)V", line = 193)
    public final void method198(byte arg0) {
        if (this.field8904 != null) {
            IDirect3DDevice var2 = this.field8906.field3402;
            class588 var3 = this.field6405.method3757(-8);
            var3.method3144(field8905, (byte) -120);
            field8905[6] *= 0.25F;
            field8905[7] *= 0.25F;
            field8905[5] *= 0.25F;
            field8905[0] *= 0.25F;
            field8905[3] *= 0.25F;
            field8905[2] *= 0.25F;
            field8905[1] *= 0.25F;
            field8905[4] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field8905, 2);
        }
        int var4 = -28 / ((arg0 + 66) / 36);
    }
}
