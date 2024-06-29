import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class757 extends class715 {

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "Lwv;")
    private class34 field10535;

    @OriginalMember(owner = "client!ms", name = "n", descriptor = "Llt;")
    private class672 field10534;

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field10536;

    @OriginalMember(owner = "client!ms", name = "m", descriptor = "[F")
    private static float[] field10533 = new float[16];

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V", line = 4)
    public final void method886(int arg0) {
        if (arg0 >= -37 || this.field10536 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field10534.field9423;
        if (this.field9979.field6477 <= 0) {
            var2.method2890(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field9979.field6508;
            float var4 = this.field9979.field6500;
            float var5 = var4 - 512.0F;
            var2.method2890(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field9979.method2730(this.field9979.field6542, -32755);
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V", line = 35)
    public final void method689(int arg0) {
        int var2 = -120 % ((-arg0 - 71) / 42);
        this.field10534.method3797(null, (byte) -117);
        this.field9979.method2767(0, 25103, class68.field1225);
        this.field9979.method2767(1, 25103, class165.field2440);
        this.field9979.method2767(2, 25103, class142.field2176);
        this.field9979.method2748(true, 0);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILdu;I)V", line = 48)
    public final void method693(int arg0, class355 arg1, int arg2) {
        int var4 = -99 % ((31 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)Z", line = 55)
    public final boolean method690(byte arg0) {
        if (arg0 == -3) {
            return this.field10536 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BZ)V", line = 65)
    public final void method686(byte arg0, boolean arg1) {
        this.field9979.method2769(class316.field4492, class218.field3121, 18721);
        if (arg0 > -105) {
            this.method693(-30, null, 3);
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V", line = 77)
    public final void method887(int arg0) {
        if (arg0 != -13878) {
            this.method884(-99);
        }
        if (this.field10536 != null) {
            IDirect3DDevice var2 = this.field10534.field9423;
            class25 var3 = this.field10534.method2742(15);
            var2.method2888(0, var3.method158(field10533, arg0 ^ 0xFFFFC9CB));
        }
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Llt;Leq;Lwv;)V", line = 96)
    public class757(class672 arg0, class209 arg1, class34 arg2) {
        super(arg0);
        this.field10535 = arg2;
        this.field10534 = arg0;
        if (arg1 != null && this.field10535.method219(-14072) && (this.field10534.field9417.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field10536 = this.field10534.field9423.method2903(arg1.method1475("transparent_water", (byte) 116, "dx"));
        } else {
            this.field10536 = null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V", line = 114)
    public final void method687(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field10534.field9423;
        if (this.field10535.field452) {
            float var5 = (float) (this.field9979.field6479 % 4000) / 4000.0F;
            this.field9979.method2732(arg1 ^ 0xFFFFF95C, this.field10535.field440);
            var4.method2890(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field9979.field6479 % 4000 * 16 / 4000;
            this.field9979.method2732(-114, this.field10535.field443[var6]);
            var4.method2890(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 1782) {
            this.method691(false, -122);
        }
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V", line = 142)
    public final void method885(int arg0) {
        if (arg0 != 8) {
            this.field10535 = null;
        }
        if (this.field10536 != null) {
            IDirect3DDevice var2 = this.field10534.field9423;
            class25 var3 = this.field10534.method2742(15);
            var2.method2888(0, var3.method158(field10533, 1));
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(I)V", line = 160)
    public final void method884(int arg0) {
        if (this.field10536 != null) {
            IDirect3DDevice var2 = this.field10534.field9423;
            var2.method2888(4, this.field9979.method2705(-102, field10533));
        }
        int var3 = 18 / ((-arg0 - 43) / 42);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)V", line = 176)
    public final void method691(boolean arg0, int arg1) {
        this.field9979.method2767(0, 25103, class68.field1225);
        this.field9979.method2767(1, arg1 ^ 0x620B, class142.field2176);
        this.field9979.method1020(true, false, (byte) 65, 2, class165.field2440);
        this.field9979.method2748(false, arg1 - 4);
        this.field10534.method3797(this.field10536, (byte) -92);
        if (arg1 != 4) {
            this.method689(24);
        }
        this.method885(arg1 ^ 0xC);
        this.method888(false);
        this.method884(-121);
        this.method886(-110);
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V", line = 194)
    public final void method888(boolean arg0) {
        if (this.field10536 != null) {
            IDirect3DDevice var2 = this.field10534.field9423;
            class25 var3 = this.field9979.method2722(-104);
            var3.method186(field10533, -118);
            field10533[3] *= 0.25F;
            field10533[6] *= 0.25F;
            field10533[1] *= 0.25F;
            field10533[0] *= 0.25F;
            field10533[4] *= 0.25F;
            field10533[5] *= 0.25F;
            field10533[7] *= 0.25F;
            field10533[2] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field10533, 2);
        }
        if (arg0) {
            this.field10535 = null;
        }
    }
}
