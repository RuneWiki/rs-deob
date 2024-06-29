import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class134 extends class213 {

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "Lui;")
    private class130 field1692;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "Lrba;")
    private class494 field1691;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1693;

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "[F")
    private static float[] field1694 = new float[16];

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V", line = 4)
    public final void method870(int arg0) {
        if (arg0 != 8) {
            this.method19(-10, 28, null);
        }
        if (this.field1693 != null) {
            IDirect3DDevice var2 = this.field1692.field1657;
            class492 var3 = this.field1692.method1906(3);
            var2.method3784(0, var3.method2767((byte) 119, field1694));
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IILaw;)V", line = 22)
    public final void method19(int arg0, int arg1, class619 arg2) {
        if (arg1 != 8) {
            this.method19(100, -69, null);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V", line = 32)
    public final void method871(byte arg0) {
        if (this.field1693 != null) {
            IDirect3DDevice var2 = this.field1692.field1657;
            class492 var3 = this.field2766.method2013(0);
            var3.method2780(field1694, 0);
            field1694[2] *= 0.25F;
            field1694[6] *= 0.25F;
            field1694[0] *= 0.25F;
            field1694[5] *= 0.25F;
            field1694[3] *= 0.25F;
            field1694[7] *= 0.25F;
            field1694[1] *= 0.25F;
            field1694[4] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field1694, 2);
        }
        int var4 = 115 / ((arg0 - 38) / 46);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 59)
    public final void method20(int arg0) {
        if (arg0 < 32) {
            this.method870(-105);
        }
        this.field1692.field1657.SetVertexShader(null);
        this.field2766.method1997(class322.field4722, 0, -117);
        this.field2766.method1997(class275.field3735, 1, -112);
        this.field2766.method1997(class577.field7974, 2, -62);
        this.field2766.method1893(true, -19894);
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(B)V", line = 74)
    public final void method872(byte arg0) {
        if (arg0 <= -122 && this.field1693 != null) {
            IDirect3DDevice var2 = this.field1692.field1657;
            class492 var3 = this.field1692.method1906(3);
            var2.method3784(0, var3.method2767((byte) 83, field1694));
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)V", line = 93)
    public final void method873(int arg0) {
        if (this.field1693 != null) {
            IDirect3DDevice var2 = this.field1692.field1657;
            var2.method3784(4, this.field2766.method2015(false, field1694));
        }
        if (arg0 >= -95) {
            this.method870(8);
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lui;Lpq;Lrba;)V", line = 109)
    public class134(class130 arg0, class159 arg1, class494 arg2) {
        super(arg0);
        this.field1692 = arg0;
        this.field1691 = arg2;
        if (this.field1691.method2788(72) && (this.field1692.field1647.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1693 = this.field1692.field1657.method3792(arg1.method1063("dx", "transparent_water", -121));
        } else {
            this.field1693 = null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(ZI)V", line = 126)
    public final void method17(boolean arg0, int arg1) {
        this.field1692.field1657.SetVertexShader(this.field1693);
        this.field2766.method1997(class322.field4722, 0, -60);
        if (arg1 < 37) {
            this.field1691 = null;
        }
        this.field2766.method1997(class577.field7974, 1, -118);
        this.field2766.method807(false, 2, true, -21480, class275.field3735);
        this.field2766.method1893(false, -19894);
        this.method870(8);
        this.method871((byte) 114);
        this.method873(-126);
        this.method874(false);
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)Z", line = 146)
    public final boolean method22(byte arg0) {
        if (arg0 == 75) {
            return this.field1693 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)V", line = 157)
    public final void method28(int arg0, int arg1, int arg2) {
        if (arg0 != -16595) {
            this.method22((byte) 127);
        }
        IDirect3DDevice var4 = this.field1692.field1657;
        if (this.field1691.field6681) {
            float var6 = (float) (this.field2766.field4453 % 4000) / 4000.0F;
            this.field2766.method1884(this.field1691.field6679, -2);
            var4.method3787(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field2766.field4453 % 4000 * 16 / 4000;
            this.field2766.method1884(this.field1691.field6678[var5], -2);
            var4.method3787(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V", line = 183)
    public final void method874(boolean arg0) {
        if (this.field1693 != null) {
            IDirect3DDevice var2 = this.field1692.field1657;
            if (this.field2766.field4439 > 0) {
                float var3 = this.field2766.field4451;
                float var4 = this.field2766.field4478;
                float var5 = var4 - 512.0F;
                var2.method3787(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method3787(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field2766.method1883(this.field2766.field4441, (byte) 85);
        }
        if (arg0) {
            this.method874(false);
        }
    }

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "(ZI)V", line = 217)
    public final void method23(boolean arg0, int arg1) {
        this.field2766.method1917(false, class129.field1635, class75.field948);
        if (arg1 != -18) {
            this.field1691 = null;
        }
    }
}
