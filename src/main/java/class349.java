import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class349 extends class669 {

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "Lss;")
    private class401 field4783;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Lmca;")
    private class29 field4786;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4784;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "[F")
    private static float[] field4785 = new float[16];

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)V")
    public final void method1974(boolean arg0) {
        if (this.field4784 != null) {
            IDirect3DDevice var2 = this.field4783.field5342;
            if (this.field9490.field1827 > 0) {
                float var3 = this.field9490.field1895;
                float var4 = this.field9490.field1854;
                float var5 = var4 - 512.0F;
                var2.method2573(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2573(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field9490.method865(this.field9490.field1830, -73);
        }
        if (!arg0) {
            this.field4786 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public final void method2052(byte arg0) {
        if (this.field4784 != null) {
            IDirect3DDevice var2 = this.field4783.field5342;
            var2.method2571(4, this.field9490.method888(field4785, (byte) -119));
        }
        if (arg0 >= -45) {
            this.field4783 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lss;Lbi;Lmca;)V")
    public class349(class401 arg0, class449 arg1, class29 arg2) {
        super(arg0);
        this.field4783 = arg0;
        this.field4786 = arg2;
        if (this.field4786.method246(16) && (this.field4783.field5336.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4784 = this.field4783.field5342.method2580(arg1.method2532("dx", "transparent_water", -24518));
        } else {
            this.field4784 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZI)V")
    public final void method4(boolean arg0, int arg1) {
        if (arg1 != 9512) {
            field4785 = null;
        }
        this.field9490.method909(class445.field6091, -128, class32.field520);
    }

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
    public final void method6(int arg0) {
        this.field4783.field5342.SetVertexShader(null);
        this.field9490.method859((byte) 29, class350.field4792, 0);
        if (arg0 != -21106) {
            this.method2050(-116);
        }
        this.field9490.method859((byte) 29, class681.field9596, 1);
        this.field9490.method859((byte) 29, class149.field2382, 2);
        this.field9490.method877(true, (byte) -68);
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(I)V")
    public final void method2050(int arg0) {
        int var2 = 48 / ((-arg0 - 58) / 38);
        if (this.field4784 != null) {
            IDirect3DDevice var3 = this.field4783.field5342;
            class74 var4 = this.field4783.method871(-6469);
            var3.method2571(0, var4.method566(field4785, 9));
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
    public final boolean method1(int arg0) {
        if (arg0 != 9567) {
            this.method2049(-91);
        }
        return this.field4784 != null;
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)V")
    public final void method2049(int arg0) {
        if (this.field4784 != null) {
            IDirect3DDevice var2 = this.field4783.field5342;
            class74 var3 = this.field4783.method871(arg0 - 6177);
            var2.method2571(0, var3.method566(field4785, 9));
        }
        if (arg0 != -292) {
            this.field4783 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZZ)V")
    public final void method5(boolean arg0, boolean arg1) {
        this.field4783.field5342.SetVertexShader(this.field4784);
        this.field9490.method859((byte) 29, class350.field4792, 0);
        this.field9490.method859((byte) 29, class149.field2382, 1);
        this.field9490.method60(1, 2, false, true, class681.field9596);
        this.field9490.method877(arg1, (byte) -106);
        this.method2050(26);
        this.method1978(119);
        this.method2052((byte) -111);
        this.method1974(true);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public final void method1978(int arg0) {
        int var2 = 44 % ((arg0 - 57) / 42);
        if (this.field4784 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field4783.field5342;
        class74 var4 = this.field9490.method830((byte) 69);
        var4.method553(11368, field4785);
        field4785[1] *= 0.25F;
        field4785[2] *= 0.25F;
        field4785[0] *= 0.25F;
        field4785[3] *= 0.25F;
        field4785[5] *= 0.25F;
        field4785[7] *= 0.25F;
        field4785[4] *= 0.25F;
        field4785[6] *= 0.25F;
        var3.SetVertexShaderConstantF(8, field4785, 2);
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILnq;)V")
    public final void method7(int arg0, int arg1, class430 arg2) {
        if (arg1 != -21254) {
            this.field4784 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BII)V")
    public final void method2(byte arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field4783.field5342;
        if (arg0 < 77) {
            this.field4784 = null;
        }
        if (this.field4786.field472) {
            float var6 = (float) (this.field9490.field1838 % 4000) / 4000.0F;
            this.field9490.method897(this.field4786.field471, true);
            var4.method2573(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field9490.field1838 % 4000 * 16 / 4000;
            this.field9490.method897(this.field4786.field474[var5], true);
            var4.method2573(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }
}
