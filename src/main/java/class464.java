import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class464 extends class139 {

    @OriginalMember(owner = "client!va", name = "k", descriptor = "Ltca;")
    private class161 field5760;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "Ltga;")
    private class54 field5762;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5759;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "[F")
    private static float[] field5761 = new float[16];

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ltga;Lpfa;Ltca;)V", line = 3)
    public class464(class54 arg0, class275 arg1, class161 arg2) {
        super(arg0);
        this.field5760 = arg2;
        this.field5762 = arg0;
        if (this.field5760.method989(16) && (this.field5762.field693.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5759 = this.field5762.field696.method2474(arg1.method1649(-1, "transparent_water", "dx"));
        } else {
            this.field5759 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 20)
    public final void method882(byte arg0) {
        if (this.field5759 != null) {
            IDirect3DDevice var2 = this.field5762.field696;
            var2.method2472(4, this.field1681.method1320(field5761, (byte) 19));
        }
        if (arg0 != -91) {
            field5761 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)V", line = 36)
    public final void method148(int arg0, int arg1, int arg2) {
        if (arg0 != -2) {
            this.field5759 = null;
        }
        IDirect3DDevice var4 = this.field5762.field696;
        if (this.field5760.field1890) {
            float var6 = (float) (this.field1681.field2822 % 4000) / 4000.0F;
            this.field1681.method1349(this.field5760.field1891, false);
            var4.method2473(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field1681.field2822 % 4000 * 16 / 4000;
            this.field1681.method1349(this.field5760.field1896[var5], false);
            var4.method2473(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!va", name = "d", descriptor = "(I)V", line = 62)
    public final void method885(int arg0) {
        if (this.field5759 != null) {
            IDirect3DDevice var2 = this.field5762.field696;
            class581 var3 = this.field5762.method1338((byte) 23);
            var2.method2472(0, var3.method3220(field5761, (byte) -108));
        }
        if (arg0 != -2) {
            field5761 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 81)
    public final void method884(int arg0) {
        int var2 = 14 % ((-arg0 - 72) / 54);
        if (this.field5759 == null) {
            return;
        }
        IDirect3DDevice var3 = this.field5762.field696;
        class581 var4 = this.field1681.method1346((byte) -84);
        var4.method3224(field5761, 56);
        field5761[3] *= 0.25F;
        field5761[0] *= 0.25F;
        field5761[7] *= 0.25F;
        field5761[2] *= 0.25F;
        field5761[1] *= 0.25F;
        field5761[5] *= 0.25F;
        field5761[4] *= 0.25F;
        field5761[6] *= 0.25F;
        var3.SetVertexShaderConstantF(8, field5761, 2);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 107)
    public final void method149(int arg0) {
        if (arg0 >= -4) {
            this.method885(-105);
        }
        this.field5762.field696.SetVertexShader(null);
        this.field1681.method1274((byte) -75, class290.field3662, 0);
        this.field1681.method1274((byte) 50, class195.field2295, 1);
        this.field1681.method1274((byte) 94, class666.field9048, 2);
        this.field1681.method1327(126, true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)Z", line = 122)
    public final boolean method152(int arg0) {
        int var2 = -60 / ((50 - arg0) / 48);
        return this.field5759 != null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZ)V", line = 131)
    public final void method151(int arg0, boolean arg1) {
        if (arg0 == 43) {
            this.field1681.method1287(class375.field4829, (byte) 57, class597.field8016);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V", line = 144)
    public final void method153(boolean arg0, int arg1) {
        this.field5762.field696.SetVertexShader(this.field5759);
        this.field1681.method1274((byte) 108, class290.field3662, 0);
        this.field1681.method1274((byte) -69, class666.field9048, 1);
        this.field1681.method390(false, class195.field2295, true, 2, arg1 + 262101);
        if (arg1 != 43) {
            this.field5760 = null;
        }
        this.field1681.method1327(-112, false);
        this.method879(false);
        this.method884(arg1 + 20);
        this.method882((byte) -91);
        this.method881(true);
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)V", line = 163)
    public final void method881(boolean arg0) {
        if (this.field5759 != null) {
            IDirect3DDevice var2 = this.field5762.field696;
            if (this.field1681.field2837 <= 0) {
                var2.method2473(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field1681.field2834;
                float var4 = this.field1681.field2878;
                float var5 = var4 - 512.0F;
                var2.method2473(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field1681.method1341((byte) 60, this.field1681.field2808);
        }
        if (!arg0) {
            this.method884(10);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V", line = 194)
    public final void method879(boolean arg0) {
        if (this.field5759 != null) {
            IDirect3DDevice var2 = this.field5762.field696;
            class581 var3 = this.field5762.method1338((byte) 49);
            var2.method2472(0, var3.method3220(field5761, (byte) -116));
        }
        if (arg0) {
            this.field5759 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BILgl;)V", line = 215)
    public final void method150(byte arg0, int arg1, class562 arg2) {
        if (arg0 <= 103) {
            this.field5759 = null;
        }
    }
}
