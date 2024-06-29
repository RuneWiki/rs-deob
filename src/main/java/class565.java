import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class565 extends class369 {

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "Ltt;")
    private class341 field8067;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "Leda;")
    private class561 field8066;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8069;

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "[F")
    private static float[] field8068 = new float[16];

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V", line = 4)
    public final void method1(int arg0) {
        if (arg0 != 8220) {
            this.field8066 = null;
        }
        if (this.field8069 != null) {
            IDirect3DDevice var2 = this.field8066.field8021;
            class537 var3 = this.field8066.method2032(arg0 - 8130);
            var2.method2528(0, var3.method3020((byte) -59, field8068));
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V", line = 22)
    public final void method2(int arg0) {
        if (arg0 == 17789 && this.field8069 != null) {
            IDirect3DDevice var2 = this.field8066.field8021;
            class537 var3 = this.field8066.method2032(53);
            var2.method2528(0, var3.method3020((byte) -59, field8068));
        }
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(I)V", line = 40)
    public final void method11(int arg0) {
        if (arg0 <= 52) {
            this.method2(90);
        }
        if (this.field8069 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8066.field8021;
        if (this.field5047.field4536 <= 0) {
            var2.method2520(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field5047.field4549;
            float var4 = this.field5047.field4550;
            float var5 = var4 - 512.0F;
            var2.method2520(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field5047.method1988(this.field5047.field4565, 4);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BILlc;)V", line = 70)
    public final void method9(byte arg0, int arg1, class686 arg2) {
        if (arg0 != -94) {
            this.field8067 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(I)Z", line = 82)
    public final boolean method8(int arg0) {
        int var2 = -82 % ((arg0 - 37) / 36);
        return this.field8069 != null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZI)V", line = 91)
    public final void method10(boolean arg0, int arg1) {
        this.field8066.field8021.SetVertexShader(this.field8069);
        this.field5047.method2012((byte) -78, 0, class304.field3769);
        this.field5047.method2012((byte) -113, 1, class107.field1154);
        if (arg1 != -14330) {
            return;
        }
        this.field5047.method1328(2, true, false, true, class590.field8337);
        this.field5047.method2041(false, false);
        this.method1(8220);
        this.method4((byte) 90);
        this.method6((byte) 76);
        this.method11(77);
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(B)V", line = 109)
    public final void method3(byte arg0) {
        this.field8066.field8021.SetVertexShader(null);
        this.field5047.method2012((byte) -38, 0, class304.field3769);
        int var2 = -25 % ((54 - arg0) / 47);
        this.field5047.method2012((byte) -103, 1, class590.field8337);
        this.field5047.method2012((byte) -49, 2, class107.field1154);
        this.field5047.method2041(false, true);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(III)V", line = 125)
    public final void method7(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field8066.field8021;
        if (this.field8067.field4308) {
            float var6 = (float) (this.field5047.field4585 % 4000) / 4000.0F;
            this.field5047.method1997(arg1 ^ 0x2044, this.field8067.field4314);
            var4.method2520(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field5047.field4585 % 4000 * 16 / 4000;
            this.field5047.method1997(arg1 ^ 0x2045, this.field8067.field4311[var5]);
            var4.method2520(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 8250) {
            this.method3((byte) -56);
        }
    }

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "(B)V", line = 150)
    public final void method6(byte arg0) {
        if (arg0 != 76) {
            field8068 = null;
        }
        if (this.field8069 != null) {
            IDirect3DDevice var2 = this.field8066.field8021;
            var2.method2528(4, this.field5047.method2049((byte) -50, field8068));
        }
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Leda;Ltf;Ltt;)V", line = 165)
    public class565(class561 arg0, class701 arg1, class341 arg2) {
        super(arg0);
        this.field8067 = arg2;
        this.field8066 = arg0;
        if (arg1 != null && this.field8067.method1974(-15210) && (this.field8066.field8017.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8069 = this.field8066.field8021.method2519(arg1.method3862("transparent_water", "dx", (byte) -127));
        } else {
            this.field8069 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "(B)V", line = 186)
    public final void method4(byte arg0) {
        if (arg0 <= 75) {
            this.field8066 = null;
        }
        if (this.field8069 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8066.field8021;
        class537 var3 = this.field5047.method2020(15);
        var3.method3024(true, field8068);
        field8068[2] *= 0.25F;
        field8068[0] *= 0.25F;
        field8068[7] *= 0.25F;
        field8068[4] *= 0.25F;
        field8068[1] *= 0.25F;
        field8068[3] *= 0.25F;
        field8068[6] *= 0.25F;
        field8068[5] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field8068, 2);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IZ)V", line = 213)
    public final void method5(int arg0, boolean arg1) {
        this.field5047.method1994(-30, class644.field9099, class239.field2967);
        if (arg0 != 382) {
            this.method9((byte) -14, 6, null);
        }
    }
}
