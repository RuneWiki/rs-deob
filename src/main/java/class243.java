import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class243 extends class595 {

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "Lpaa;")
    private class534 field3399;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lbv;")
    private class256 field3396;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field3397;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[F")
    private static float[] field3398 = new float[16];

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        this.field3396.field3527.SetVertexShader(null);
        this.field8612.method2315(class583.field8185, 0, 8);
        this.field8612.method2315(class453.field6402, 1, 8);
        this.field8612.method2315(class610.field8770, 2, 8);
        this.field8612.method2306(true, (byte) -79);
        if (arg0 != -60) {
            this.method1484((byte) 39);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lbv;Lan;Lpaa;)V")
    public class243(class256 arg0, class21 arg1, class534 arg2) {
        super(arg0);
        this.field3399 = arg2;
        this.field3396 = arg0;
        if (this.field3399.method3067(71) && (this.field3396.field3537.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field3397 = this.field3396.field3527.method2443(arg1.method228("transparent_water", 104, "dx"));
        } else {
            this.field3397 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    public final void method1484(byte arg0) {
        if (arg0 > -123) {
            this.method301(null, -84, -19);
        }
        if (this.field3397 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field3396.field3527;
        if (this.field8612.field5398 > 0) {
            float var3 = this.field8612.field5451;
            float var4 = this.field8612.field5474;
            float var5 = var4 - 512.0F;
            var2.method2438(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method2438(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field8612.method2309(this.field8612.field5460, -9683);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            this.method297((byte) -1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public final void method1487(boolean arg0) {
        if (!arg0 && this.field3397 != null) {
            IDirect3DDevice var2 = this.field3396.field3527;
            var2.method2439(4, this.field8612.method2281(-116, field3398));
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public final void method1485(int arg0) {
        if (this.field3397 != null) {
            IDirect3DDevice var2 = this.field3396.field3527;
            class557 var3 = this.field3396.method2297((byte) 95);
            var2.method2439(0, var3.method3171((byte) -91, field3398));
        }
        if (arg0 != -1) {
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public final void method1489(int arg0) {
        if (this.field3397 != null) {
            IDirect3DDevice var2 = this.field3396.field3527;
            class557 var3 = this.field3396.method2297((byte) 95);
            var2.method2439(0, var3.method3171((byte) -91, field3398));
        }
        if (arg0 != -1) {
            this.method303(-9, -74, -101);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        this.field8612.method2313(class205.field2890, 89, class583.field8102);
        if (arg0 != -1) {
            field3398 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)V")
    public final void method1486(int arg0) {
        if (this.field3397 != null) {
            IDirect3DDevice var2 = this.field3396.field3527;
            class557 var3 = this.field8612.method2331((byte) -31);
            var3.method3172(74, field3398);
            field3398[4] *= 0.25F;
            field3398[7] *= 0.25F;
            field3398[5] *= 0.25F;
            field3398[0] *= 0.25F;
            field3398[6] *= 0.25F;
            field3398[3] *= 0.25F;
            field3398[1] *= 0.25F;
            field3398[2] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field3398, 2);
        }
        if (arg0 < 113) {
            this.field3396 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        if (arg0 > -119) {
            this.method299(-77, true);
        }
        return this.field3397 != null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field3396.field3527;
        if (arg2 >= -114) {
            this.method303(-75, 4, -27);
        }
        if (this.field3399.field7467) {
            float var5 = (float) (this.field8612.field5401 % 4000) / 4000.0F;
            this.field8612.method2267(2, this.field3399.field7469);
            var4.method2438(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field8612.field5401 % 4000 * 16 / 4000;
            this.field8612.method2267(2, this.field3399.field7468[var6]);
            var4.method2438(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        this.field3396.field3527.SetVertexShader(this.field3397);
        this.field8612.method2315(class583.field8185, 0, 8);
        this.field8612.method2315(class610.field8770, 1, 8);
        this.field8612.method1641(false, arg1, 2, class453.field6402, 0);
        this.field8612.method2306(false, (byte) -88);
        this.method1485(-1);
        this.method1486(114);
        this.method1487(false);
        this.method1484((byte) -127);
    }
}
