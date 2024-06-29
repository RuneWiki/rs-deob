import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class446 extends class545 {

    @OriginalMember(owner = "client!gb", name = "t", descriptor = "Lad;")
    private class173 field6365;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Lur;")
    private class617 field6362;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6364;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "[F")
    private static float[] field6363 = new float[16];

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public final void method1740(boolean arg0) {
        if (arg0) {
            this.method459(100);
        }
        if (this.field6364 != null) {
            IDirect3DDevice var2 = this.field6365.field2418;
            var2.method4105(4, this.field7920.method291((byte) -32, field6363));
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
    public final void method451(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field6365.field2418;
        if (this.field6362.field8795) {
            float var6 = (float) (this.field7920.field585 % 4000) / 4000.0F;
            this.field7920.method264(this.field6362.field8796, -2);
            var4.method4097(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7920.field585 % 4000 * 16 / 4000;
            this.field7920.method264(this.field6362.field8787[var5], arg0 - 2);
            var4.method4097(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg0 != 0) {
            this.method1739(80);
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public final void method1739(int arg0) {
        int var2 = 85 % ((arg0 - 85) / 33);
        if (this.field6364 != null) {
            IDirect3DDevice var3 = this.field6365.field2418;
            class417 var4 = this.field6365.method244(1);
            var3.method4105(0, var4.method2530(-89, field6363));
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)V")
    public final void method1742(int arg0) {
        if (this.field6364 != null) {
            IDirect3DDevice var2 = this.field6365.field2418;
            class417 var3 = this.field6365.method244(arg0 ^ 0xFFFFFC34);
            var2.method4105(0, var3.method2530(-121, field6363));
        }
        if (arg0 != -971) {
            this.method1742(-101);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public final void method452(int arg0) {
        this.field6365.method1256((byte) -45, null);
        this.field7920.method230(class234.field3509, 0, 122);
        this.field7920.method230(class272.field3857, 1, 122);
        this.field7920.method230(class231.field3462, arg0, 110);
        this.field7920.method320(true, (byte) -95);
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Z")
    public final boolean method459(int arg0) {
        if (arg0 < 63) {
            this.method1739(21);
        }
        return this.field6364 != null;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public final void method1741(int arg0) {
        if (this.field6364 != null) {
            IDirect3DDevice var2 = this.field6365.field2418;
            class417 var3 = this.field7920.method349((byte) 25);
            var3.method2534(field6363, (byte) 104);
            field6363[2] *= 0.25F;
            field6363[3] *= 0.25F;
            field6363[0] *= 0.25F;
            field6363[5] *= 0.25F;
            field6363[4] *= 0.25F;
            field6363[7] *= 0.25F;
            field6363[1] *= 0.25F;
            field6363[6] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field6363, 2);
        }
        if (arg0 != 12) {
            this.field6365 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BZ)V")
    public final void method457(byte arg0, boolean arg1) {
        this.field7920.method230(class234.field3509, 0, 87);
        this.field7920.method230(class231.field3462, 1, 65);
        this.field7920.method282(true, false, (byte) -60, 2, class272.field3857);
        this.field7920.method320(false, (byte) -125);
        this.field6365.method1256((byte) -82, this.field6364);
        this.method1739(-52);
        this.method1741(12);
        this.method1740(false);
        if (arg0 < 101) {
            this.field6362 = null;
        }
        this.method453(0);
    }

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
    public final void method453(int arg0) {
        if (arg0 != 0) {
            this.field6362 = null;
        }
        if (this.field6364 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6365.field2418;
        if (this.field7920.field621 > 0) {
            float var3 = this.field7920.field546;
            float var4 = this.field7920.field563;
            float var5 = var4 - 512.0F;
            var2.method4097(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method4097(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field7920.method213(this.field7920.field575, 3);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILec;)V")
    public final void method455(int arg0, int arg1, class101 arg2) {
        if (arg0 != 2) {
            this.method452(119);
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lad;Lla;Lur;)V")
    public class446(class173 arg0, class423 arg1, class617 arg2) {
        super(arg0);
        this.field6365 = arg0;
        this.field6362 = arg2;
        if (arg1 != null && this.field6362.method3581(128) && (this.field6365.field2419.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field6364 = this.field6365.field2418.method4110(arg1.method2591("dx", (byte) 71, "transparent_water"));
        } else {
            this.field6364 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)V")
    public final void method454(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method1742(-110);
        }
        this.field7920.method386((byte) -1, class684.field9720, class596.field8472);
    }
}
