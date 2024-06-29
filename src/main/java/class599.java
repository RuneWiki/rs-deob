import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class599 extends class606 {

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Ltg;")
    private class229 field8412;

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Lic;")
    private class698 field8414;

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8413;

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "[F")
    private static float[] field8411 = new float[16];

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
    public final void method1985(boolean arg0) {
        if (this.field8413 != null) {
            IDirect3DDevice var2 = this.field8412.field3093;
            var2.method2884(4, this.field8525.method1657(-20248, field8411));
        }
        if (!arg0) {
            this.method516(32, 39, 37);
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public final void method1984(int arg0) {
        if (this.field8413 != null) {
            IDirect3DDevice var2 = this.field8412.field3093;
            if (this.field8525.field3591 <= 0) {
                var2.method2896(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field8525.field3623;
                float var4 = this.field8525.field3598;
                float var5 = var4 - 512.0F;
                var2.method2896(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field8525.method1640(true, this.field8525.field3627);
        }
        if (arg0 != 25411) {
            this.method1988((byte) -18);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IZ)V")
    public final void method518(int arg0, boolean arg1) {
        this.field8525.method1613(arg0 - 5516, class589.field8300, class170.field2330);
        if (arg0 != 5486) {
            field8411 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
    public final void method1052(byte arg0) {
        if (arg0 != -122) {
            field8411 = null;
        }
        if (this.field8413 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8412.field3093;
        class328 var3 = this.field8525.method1658(false);
        var3.method2146((byte) 42, field8411);
        field8411[6] *= 0.25F;
        field8411[4] *= 0.25F;
        field8411[0] *= 0.25F;
        field8411[3] *= 0.25F;
        field8411[1] *= 0.25F;
        field8411[5] *= 0.25F;
        field8411[7] *= 0.25F;
        field8411[2] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field8411, 2);
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public final void method1988(byte arg0) {
        if (arg0 >= -111) {
            this.method1986(-82);
        }
        if (this.field8413 != null) {
            IDirect3DDevice var2 = this.field8412.field3093;
            class328 var3 = this.field8412.method1654(90);
            var2.method2884(0, var3.method2143(-89, field8411));
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(III)V")
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 < 91) {
            this.method523(null, -88, -15);
        }
        IDirect3DDevice var4 = this.field8412.field3093;
        if (this.field8414.field9625) {
            float var6 = (float) (this.field8525.field3567 % 4000) / 4000.0F;
            this.field8525.method1663(this.field8414.field9629, -2);
            var4.method2896(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field8525.field3567 % 4000 * 16 / 4000;
            this.field8525.method1663(this.field8414.field9622[var5], -2);
            var4.method2896(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Ltg;Lfp;Lic;)V")
    public class599(class229 arg0, class323 arg1, class698 arg2) {
        super(arg0);
        this.field8412 = arg0;
        this.field8414 = arg2;
        if (arg1 != null && this.field8414.method3925(-30571) && (this.field8412.field3089.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field8413 = this.field8412.field3093.method2886(arg1.method2102("dx", "transparent_water", 0));
        } else {
            this.field8413 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "(I)V")
    public final void method1986(int arg0) {
        if (this.field8413 != null) {
            IDirect3DDevice var2 = this.field8412.field3093;
            class328 var3 = this.field8412.method1654(arg0 ^ 0x18);
            var2.method2884(0, var3.method2143(56, field8411));
        }
        if (arg0 != 64) {
            this.method525(-98);
        }
    }

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Z")
    public final boolean method525(int arg0) {
        if (arg0 < 19) {
            return false;
        } else {
            return this.field8413 != null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZI)V")
    public final void method517(boolean arg0, int arg1) {
        this.field8525.method1664((byte) -119, class597.field8397, 0);
        this.field8525.method1664((byte) -82, class679.field9315, 1);
        this.field8525.method1450(true, class539.field7554, 2, false, false);
        this.field8525.method1636(false, (byte) 20);
        this.field8412.method1471((byte) 111, this.field8413);
        if (arg1 >= -64) {
            this.method521((byte) -57);
        }
        this.method1988((byte) -118);
        this.method1052((byte) -122);
        this.method1985(true);
        this.method1984(25411);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public final void method521(byte arg0) {
        this.field8412.method1471((byte) 119, null);
        this.field8525.method1664((byte) -106, class597.field8397, 0);
        this.field8525.method1664((byte) -96, class539.field7554, 1);
        int var2 = 53 / ((-arg0 - 26) / 56);
        this.field8525.method1664((byte) -93, class679.field9315, 2);
        this.field8525.method1636(true, (byte) 20);
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lma;II)V")
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field8412 = null;
        }
    }
}
