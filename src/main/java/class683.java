import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class683 extends class606 {

    @OriginalMember(owner = "client!jca", name = "u", descriptor = "Lic;")
    private class698 field9371;

    @OriginalMember(owner = "client!jca", name = "q", descriptor = "Ltg;")
    private class229 field9367;

    @OriginalMember(owner = "client!jca", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9366;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field9365;

    @OriginalMember(owner = "client!jca", name = "s", descriptor = "Z")
    private boolean field9369;

    @OriginalMember(owner = "client!jca", name = "r", descriptor = "[F")
    private static float[] field9368 = new float[16];

    @OriginalMember(owner = "client!jca", name = "t", descriptor = "Z")
    private boolean field9370;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1985(boolean arg0) {
        if (arg0 && this.field9370) {
            IDirect3DDevice var2 = this.field9367.field3093;
            var2.method2884(8, this.field8525.method1657(-20248, field9368));
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V", line = 21)
    public final void method521(byte arg0) {
        if (this.field9370) {
            this.field9367.method1471((byte) 72, null);
            this.field9367.method1431(-94, null);
            this.field8525.method1648(1, (byte) 66);
            this.field8525.method1663(null, -2);
            this.field8525.method1648(0, (byte) 66);
            this.field8525.method1663(null, -2);
            this.field9370 = false;
        }
        int var2 = -115 / ((-arg0 - 26) / 56);
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IZ)V", line = 41)
    public final void method518(int arg0, boolean arg1) {
        if (arg0 != 5486) {
            this.method1052((byte) -106);
        }
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V", line = 50)
    public final void method1988(byte arg0) {
        if (arg0 >= -111) {
            this.field9367 = null;
        }
        if (this.field9370) {
            IDirect3DDevice var2 = this.field9367.field3093;
            class328 var3 = this.field9367.method1654(54);
            var2.method2884(0, var3.method2143(49, field9368));
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(I)Z", line = 68)
    public final boolean method525(int arg0) {
        if (arg0 <= 19) {
            this.field9370 = false;
        }
        return this.field9369;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lma;II)V", line = 79)
    public final void method523(class12 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.method525(-103);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZI)V", line = 89)
    public final void method517(boolean arg0, int arg1) {
        class168 var3 = this.field8525.method1590(22);
        if (this.field9369 && var3 != null) {
            IDirect3DDevice var4 = this.field9367.field3093;
            this.field9367.method1471((byte) 106, this.field9366);
            this.field9367.method1431(103, this.field9365);
            this.field8525.method1648(1, (byte) 66);
            this.field8525.method1663(var3, -2);
            this.field8525.method1648(0, (byte) 66);
            this.field8525.method1663(this.field9371.field9630, -2);
            this.field9370 = true;
            this.method1986(64);
            this.method1052((byte) -122);
            this.method1985(true);
            this.method1984(25411);
            var4.method2891(1, -this.field8525.field3569[0], -this.field8525.field3569[1], -this.field8525.field3569[2], 0.0F);
            var4.method2891(2, this.field8525.field3617, this.field8525.field3604, this.field8525.field3624, 1.0F);
            var4.method2891(3, Math.abs(this.field8525.field3569[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 > -64) {
            this.field9371 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)V", line = 120)
    public final void method516(int arg0, int arg1, int arg2) {
        if (arg1 <= 91) {
            this.method518(78, true);
        }
        if (!this.field9370) {
            return;
        }
        IDirect3DDevice var4 = this.field9367.field3093;
        int var5 = 0x1 << (arg2 & 0x3);
        float var6 = (float) (0x1 << (arg2 >> 3 & 0x7)) / 32.0F;
        int var7 = arg0 & 0xFFFF;
        float var8 = (float) (arg0 >> 16 & 0x3) / 8.0F;
        var4.method2896(14, (float) (this.field8525.field3567 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method2896(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method2891(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method2891(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "(I)V", line = 148)
    public final void method1986(int arg0) {
        if (arg0 != 64) {
            this.field9369 = false;
        }
        if (!this.field9370) {
            return;
        }
        IDirect3DDevice var2 = this.field9367.field3093;
        class328 var3 = this.field9367.method1619(-95);
        class328 var4 = this.field9367.method1654(55);
        var2.method2884(0, var4.method2143(-98, field9368));
        var2.method2884(4, var3.method2149(-127, field9368));
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(I)V", line = 176)
    public final void method1984(int arg0) {
        if (this.field9370) {
            IDirect3DDevice var2 = this.field9367.field3093;
            if (this.field8525.field3591 <= 0) {
                var2.method2896(16, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field8525.field3623;
                float var4 = this.field8525.field3598;
                var2.method2896(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            }
            var2.method2891(0, (float) (this.field8525.field3627 >> 16 & 0xFF) / 255.0F, (float) (this.field8525.field3627 >> 8 & 0xFF) / 255.0F, (float) (this.field8525.field3627 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0 != 25411) {
            this.method1985(false);
        }
    }

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "(B)V", line = 203)
    public final void method1052(byte arg0) {
        if (this.field9370) {
            IDirect3DDevice var2 = this.field9367.field3093;
            class328 var3 = this.field8525.method1658(false);
            var2.SetVertexShaderConstantF(12, var3.method2146((byte) 72, field9368), 2);
        }
        if (arg0 != -122) {
            this.method523(null, -122, -88);
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(Ltg;Lfp;Lic;)V", line = 220)
    public class683(class229 arg0, class323 arg1, class698 arg2) {
        super(arg0);
        this.field9371 = arg2;
        this.field9367 = arg0;
        if (arg1 != null && this.field8525.field3540 && this.field8525.field3603 && (this.field9367.field3089.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9366 = this.field9367.field3093.method2886(arg1.method2102("dx", "environment_mapped_water_v", 0));
            this.field9365 = this.field9367.field3093.method2885(arg1.method2102("dx", "environment_mapped_water_f", 0));
            this.field9369 = this.field9366 != null && this.field9365 != null && this.field9371.method3924(false);
        } else {
            this.field9369 = false;
            this.field9366 = null;
            this.field9365 = null;
        }
    }
}
