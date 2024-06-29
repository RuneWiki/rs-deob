import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class109 extends class521 {

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Llba;")
    private class468 field1352;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Lhg;")
    private class591 field1353;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1354;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "[F")
    private static float[] field1351 = new float[16];

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lhg;Ldn;Llba;)V", line = 3)
    public class109(class591 arg0, class438 arg1, class468 arg2) {
        super(arg0);
        this.field1352 = arg2;
        this.field1353 = arg0;
        if (this.field1352.method2729(false) && (this.field1353.field8571.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1354 = this.field1353.field8586.method2323(arg1.method2570((byte) 102, "transparent_water", "dx"));
        } else {
            this.field1354 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z", line = 20)
    public final boolean method452(int arg0) {
        if (arg0 <= 49) {
            this.field1354 = null;
        }
        return this.field1354 != null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 30)
    public final void method633(byte arg0) {
        if (arg0 != -44) {
            this.method633((byte) 103);
        }
        if (this.field1354 != null) {
            IDirect3DDevice var2 = this.field1353.field8586;
            class335 var3 = this.field1353.method2404(false);
            var2.method2331(0, var3.method1876(arg0 ^ 0xFFFFFFEF, field1351));
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V", line = 48)
    public final void method449(int arg0, boolean arg1) {
        this.field7319.method2429(class402.field5281, class529.field7403, 47);
        if (arg0 != 256) {
            this.method454((byte) -11, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(BZ)V", line = 58)
    public final void method454(byte arg0, boolean arg1) {
        this.field1353.field8586.SetVertexShader(this.field1354);
        this.field7319.method2435(0, 21, class289.field3751);
        if (arg0 != 21) {
            return;
        }
        this.field7319.method2435(1, arg0 + 5, class264.field3445);
        this.field7319.method1798(false, true, 2, 6, class167.field2044);
        this.field7319.method2420(false, arg0 - 10);
        this.method635(true);
        this.method447(15);
        this.method634(72);
        this.method636(256);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILhv;I)V", line = 77)
    public final void method446(int arg0, class440 arg1, int arg2) {
        if (arg2 != 26440) {
            this.method454((byte) -84, false);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)V", line = 90)
    public final void method448(boolean arg0) {
        this.field1353.field8586.SetVertexShader(null);
        this.field7319.method2435(0, 84, class289.field3751);
        this.field7319.method2435(1, 43, class167.field2044);
        this.field7319.method2435(2, 66, class264.field3445);
        this.field7319.method2420(true, 11);
        if (arg0) {
            this.method449(121, true);
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 104)
    public final void method447(int arg0) {
        if (this.field1354 != null) {
            IDirect3DDevice var2 = this.field1353.field8586;
            class335 var3 = this.field7319.method2466(0);
            var3.method1891(field1351, arg0 ^ 0x66C0);
            field1351[2] *= 0.25F;
            field1351[4] *= 0.25F;
            field1351[3] *= 0.25F;
            field1351[7] *= 0.25F;
            field1351[5] *= 0.25F;
            field1351[6] *= 0.25F;
            field1351[1] *= 0.25F;
            field1351[0] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field1351, 2);
        }
        if (arg0 != 15) {
            this.method633((byte) -27);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V", line = 132)
    public final void method634(int arg0) {
        if (arg0 != 72) {
            this.field1353 = null;
        }
        if (this.field1354 != null) {
            IDirect3DDevice var2 = this.field1353.field8586;
            var2.method2331(4, this.field7319.method2464(field1351, (byte) 127));
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)V", line = 149)
    public final void method455(int arg0, int arg1, int arg2) {
        IDirect3DDevice var4 = this.field1353.field8586;
        if (arg0 != 0) {
            return;
        }
        if (this.field1352.field6540) {
            float var6 = (float) (this.field7319.field5779 % 4000) / 4000.0F;
            this.field7319.method2459(121, this.field1352.field6545);
            var4.method2324(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field7319.field5779 % 4000 * 16 / 4000;
            this.field7319.method2459(arg0 ^ 0x70, this.field1352.field6541[var5]);
            var4.method2324(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V", line = 176)
    public final void method635(boolean arg0) {
        if (!arg0) {
            this.method634(108);
        }
        if (this.field1354 != null) {
            IDirect3DDevice var2 = this.field1353.field8586;
            class335 var3 = this.field1353.method2404(false);
            var2.method2331(0, var3.method1876(105, field1351));
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V", line = 196)
    public final void method636(int arg0) {
        if (this.field1354 != null) {
            IDirect3DDevice var2 = this.field1353.field8586;
            if (this.field7319.field5697 <= 0) {
                var2.method2324(10, 0.0F, 0.0F, 0.0F, 0.0F);
            } else {
                float var3 = this.field7319.field5714;
                float var4 = this.field7319.field5698;
                float var5 = var4 - 512.0F;
                var2.method2324(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            }
            this.field7319.method2434(5, this.field7319.field5751);
        }
        if (arg0 != 256) {
            this.method635(false);
        }
    }
}
