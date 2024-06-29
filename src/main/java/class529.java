import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class529 extends class55 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ltn;")
    private class88 field7364;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "Lul;")
    private class574 field7367;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7366;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "[F")
    private static float[] field7365 = new float[16];

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IZ)V")
    public final void method196(int arg0, boolean arg1) {
        this.field759.method2394(class447.field5937, (byte) 99, 0);
        this.field759.method2394(class21.field383, (byte) 104, 1);
        this.field759.method2036((byte) 105, true, false, class479.field6523, 2);
        this.field759.method2381((byte) -103, false);
        this.field7367.method3293(arg0 ^ 0x52, this.field7366);
        this.method402(arg0 - 8);
        if (arg0 != 5) {
            this.field7366 = null;
        }
        this.method406(arg0 - 4);
        this.method404(36);
        this.method403((byte) 119);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final void method406(int arg0) {
        if (arg0 != 1) {
            this.method404(127);
        }
        if (this.field7366 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field7367.field8080;
        class477 var3 = this.field759.method2406(false);
        var3.method2743(-89, field7365);
        field7365[0] *= 0.25F;
        field7365[4] *= 0.25F;
        field7365[5] *= 0.25F;
        field7365[2] *= 0.25F;
        field7365[3] *= 0.25F;
        field7365[1] *= 0.25F;
        field7365[6] *= 0.25F;
        field7365[7] *= 0.25F;
        var2.SetVertexShaderConstantF(8, field7365, 2);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
    public final void method403(byte arg0) {
        if (this.field7366 != null) {
            IDirect3DDevice var2 = this.field7367.field8080;
            if (this.field759.field5599 <= 0) {
                var2.method2869(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field759.field5607;
                float var4 = this.field759.field5598;
                float var5 = var4 - 512.0F;
                var2.method2869(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field759.method2382(this.field759.field5644, -4068);
        }
        if (arg0 != 119) {
            field7365 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZ)V")
    public final void method199(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        IDirect3DDevice var4 = this.field7367.field8080;
        if (this.field7364.field1225) {
            float var6 = (float) (this.field759.field5633 % 4000) / 4000.0F;
            this.field759.method2396(22357, this.field7364.field1222);
            var4.method2869(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field759.field5633 % 4000 * 16 / 4000;
            this.field759.method2396(22357, this.field7364.field1220[var5]);
            var4.method2869(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method404(int arg0) {
        if (this.field7366 != null) {
            IDirect3DDevice var2 = this.field7367.field8080;
            var2.method2867(4, this.field759.method2432(-23481, field7365));
        }
        if (arg0 < 20) {
            this.method201(true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZB)V")
    public final void method197(boolean arg0, byte arg1) {
        this.field759.method2397(class740.field10325, class155.field2108, (byte) -83);
        int var3 = -9 / ((-arg1 - 61) / 44);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILfe;)V")
    public final void method200(int arg0, int arg1, class572 arg2) {
        if (arg1 <= 30) {
            field7365 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public final void method201(boolean arg0) {
        this.field7367.method3293(87, null);
        this.field759.method2394(class447.field5937, (byte) 72, 0);
        this.field759.method2394(class479.field6523, (byte) 63, 1);
        this.field759.method2394(class21.field383, (byte) 89, 2);
        this.field759.method2381((byte) -103, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Z")
    public final boolean method202(int arg0) {
        if (arg0 == 1) {
            return this.field7366 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public final void method402(int arg0) {
        if (arg0 == -3 && this.field7366 != null) {
            IDirect3DDevice var2 = this.field7367.field8080;
            class477 var3 = this.field7367.method2429(11);
            var2.method2867(0, var3.method2731(field7365, (byte) -115));
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(Lul;Lnd;Ltn;)V")
    public class529(class574 arg0, class547 arg1, class88 arg2) {
        super(arg0);
        this.field7364 = arg2;
        this.field7367 = arg0;
        if (arg1 != null && this.field7364.method722((byte) 17) && (this.field7367.field8059.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7366 = this.field7367.field8080.method2868(arg1.method3158("dx", (byte) 101, "transparent_water"));
        } else {
            this.field7366 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V")
    public final void method407(int arg0) {
        if (arg0 >= 21 && this.field7366 != null) {
            IDirect3DDevice var2 = this.field7367.field8080;
            class477 var3 = this.field7367.method2429(11);
            var2.method2867(0, var3.method2731(field7365, (byte) -115));
        }
    }
}
