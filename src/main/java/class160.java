import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class160 extends class232 {

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lki;")
    private class735 field2368;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Llo;")
    private class785 field2370;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2371;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "[F")
    private static float[] field2369 = new float[16];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public final void method1265(int arg0) {
        if (this.field2371 != null) {
            IDirect3DDevice var2 = this.field2368.field10253;
            class468 var3 = this.field2368.method1168(125);
            var2.method2967(0, var3.method2771(field2369, 9));
        }
        if (arg0 != -18866) {
            this.method908((byte) -17);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final void method1266(int arg0) {
        if (this.field2371 != null) {
            IDirect3DDevice var2 = this.field2368.field10253;
            class468 var3 = this.field2368.method1168(arg0 + 9729);
            var2.method2967(0, var3.method2771(field2369, 9));
        }
        if (arg0 != -9611) {
            this.method1268(-53);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public final void method569(int arg0, int arg1, int arg2) {
        int var4 = 47 % ((arg0 - 48) / 51);
        IDirect3DDevice var5 = this.field2368.field10253;
        if (this.field2370.field10788) {
            float var6 = (float) (this.field3368.field2209 % 4000) / 4000.0F;
            this.field3368.method1104(true, this.field2370.field10792);
            var5.method2968(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var7 = this.field3368.field2209 % 4000 * 16 / 4000;
            this.field3368.method1104(true, this.field2370.field10787[var7]);
            var5.method2968(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZB)V")
    public final void method568(boolean arg0, byte arg1) {
        if (arg1 != -126) {
            return;
        }
        this.field3368.method1056(32, class412.field5814, 0);
        this.field3368.method1056(32, class490.field6966, 1);
        this.field3368.method1057(2, true, class492.field6991, false, (byte) 121);
        this.field3368.method1162(arg1 + 29721, false);
        this.field2368.method4117(false, this.field2371);
        this.method1265(-18866);
        this.method908((byte) 120);
        this.method1267((byte) 102);
        this.method1268(arg1 ^ 0xFFFFFFC5);
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Lki;Lcb;Llo;)V")
    public class160(class735 arg0, class544 arg1, class785 arg2) {
        super(arg0);
        this.field2368 = arg0;
        this.field2370 = arg2;
        if (arg1 != null && this.field2370.method4301(3344) && (this.field2368.field10268.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2371 = this.field2368.field10253.method2966(arg1.method3126((byte) -107, "dx", "transparent_water"));
        } else {
            this.field2371 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILdr;I)V")
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 != 2305) {
            this.method570(75, null, -61);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final void method908(byte arg0) {
        if (this.field2371 != null) {
            IDirect3DDevice var2 = this.field2368.field10253;
            class468 var3 = this.field3368.method1165(false);
            var3.method2779((byte) 44, field2369);
            field2369[7] *= 0.25F;
            field2369[5] *= 0.25F;
            field2369[0] *= 0.25F;
            field2369[1] *= 0.25F;
            field2369[3] *= 0.25F;
            field2369[4] *= 0.25F;
            field2369[2] *= 0.25F;
            field2369[6] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field2369, 2);
        }
        if (arg0 < 101) {
            this.field2368 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)V")
    public final void method1267(byte arg0) {
        if (arg0 > 57 && this.field2371 != null) {
            IDirect3DDevice var2 = this.field2368.field10253;
            var2.method2967(4, this.field3368.method1160(false, field2369));
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public final void method573(byte arg0) {
        this.field2368.method4117(false, null);
        this.field3368.method1056(32, class412.field5814, 0);
        this.field3368.method1056(32, class492.field6991, 1);
        this.field3368.method1056(32, class490.field6966, 2);
        this.field3368.method1162(29595, true);
        if (arg0 <= 77) {
            field2369 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public final void method1268(int arg0) {
        if (arg0 <= 35) {
            this.method1267((byte) -66);
        }
        if (this.field2371 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field2368.field10253;
        if (this.field3368.field2201 <= 0) {
            var2.method2968(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field3368.field2186;
            float var4 = this.field3368.field2155;
            float var5 = var4 - 512.0F;
            var2.method2968(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field3368.method1059(true, this.field3368.field2180);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)V")
    public final void method572(boolean arg0, int arg1) {
        this.field3368.method1136((byte) -115, class468.field6696, class576.field8141);
        if (arg1 < 21) {
            this.field2371 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)Z")
    public final boolean method571(int arg0) {
        if (arg0 == -30998) {
            return this.field2371 != null;
        } else {
            return false;
        }
    }
}
