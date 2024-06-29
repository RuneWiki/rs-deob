import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class505 extends class607 {

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "Lki;")
    private class616 field7304;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lrca;")
    private class391 field7302;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7301;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "[F")
    private static float[] field7303 = new float[16];

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBLiu;)V")
    public final void method810(int arg0, byte arg1, class502 arg2) {
        if (arg1 >= -73) {
            field7303 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
    public final void method2065(boolean arg0) {
        if (!arg0) {
            this.method2065(false);
        }
        if (this.field7301 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7302.field5990;
        class646 var3 = this.field8870.method1938((byte) 113);
        var3.method3701(field7303, -15);
        field7303[6] *= 0.25F;
        field7303[1] *= 0.25F;
        field7303[2] *= 0.25F;
        field7303[5] *= 0.25F;
        field7303[3] *= 0.25F;
        field7303[0] *= 0.25F;
        field7303[4] *= 0.25F;
        field7303[7] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field7303, 2);
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)V")
    public final void method3005(int arg0) {
        if (arg0 != 17367) {
            this.field7302 = null;
        }
        if (this.field7301 != null) {
            IDirect3DDevice var2 = this.field7302.field5990;
            class646 var3 = this.field7302.method1937((byte) -93);
            var2.method2621(0, var3.method3686((byte) 114, field7303));
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)V")
    public final void method3006(int arg0) {
        if (this.field7301 != null) {
            IDirect3DDevice var2 = this.field7302.field5990;
            var2.method2621(4, this.field8870.method1955(field7303, arg0 + 15201));
        }
        if (arg0 != -15201) {
            this.method3005(-8);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZB)V")
    public final void method811(boolean arg0, byte arg1) {
        this.field7302.field5990.SetVertexShader(this.field7301);
        this.field8870.method1970(-104, class83.field935, 0);
        if (arg1 != 91) {
            this.method3006(116);
        }
        this.field8870.method1970(-115, class173.field2123, 1);
        this.field8870.method1521(false, 2, false, class242.field3434, true);
        this.field8870.method1920(false, (byte) 111);
        this.method3007(-18969);
        this.method2065(true);
        this.method3006(-15201);
        this.method813(-8635);
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(B)Z")
    public final boolean method814(byte arg0) {
        if (arg0 == -97) {
            return this.field7301 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(B)V")
    public final void method805(byte arg0) {
        this.field7302.field5990.SetVertexShader(null);
        this.field8870.method1970(66, class83.field935, 0);
        this.field8870.method1970(-7, class242.field3434, 1);
        this.field8870.method1970(arg0 ^ 0x51, class173.field2123, 2);
        this.field8870.method1920(true, (byte) 61);
        if (arg0 != -58) {
            this.field7302 = null;
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
    public final void method3007(int arg0) {
        if (arg0 == -18969 && this.field7301 != null) {
            IDirect3DDevice var2 = this.field7302.field5990;
            class646 var3 = this.field7302.method1937((byte) -118);
            var2.method2621(0, var3.method3686((byte) 114, field7303));
        }
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public final void method813(int arg0) {
        if (this.field7301 != null) {
            IDirect3DDevice var2 = this.field7302.field5990;
            if (this.field8870.field4310 > 0) {
                float var3 = this.field8870.field4270;
                float var4 = this.field8870.field4342;
                float var5 = var4 - 512.0F;
                var2.method2631(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2631(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field8870.method1939(this.field8870.field4359, true);
        }
        if (arg0 != -8635) {
            this.method815(-47, 88, -34);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IZ)V")
    public final void method808(int arg0, boolean arg1) {
        if (arg0 == 993) {
            this.field8870.method1912(class107.field1276, class310.field4559, 105);
        }
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(III)V")
    public final void method815(int arg0, int arg1, int arg2) {
        if (arg0 != 12868) {
            return;
        }
        IDirect3DDevice var4 = this.field7302.field5990;
        if (this.field7304.field8956) {
            float var6 = (float) (this.field8870.field4317 % 4000) / 4000.0F;
            this.field8870.method1971((byte) -72, this.field7304.field8960);
            var4.method2631(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field8870.field4317 % 4000 * 16 / 4000;
            this.field8870.method1971((byte) -68, this.field7304.field8964[var5]);
            var4.method2631(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lrca;Lkea;Lki;)V")
    public class505(class391 arg0, class203 arg1, class616 arg2) {
        super(arg0);
        this.field7304 = arg2;
        this.field7302 = arg0;
        if (this.field7304.method3555((byte) 62) && (this.field7302.field5984.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7301 = this.field7302.field5990.method2626(arg1.method1281((byte) -37, "transparent_water", "dx"));
        } else {
            this.field7301 = null;
        }
    }
}
