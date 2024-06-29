import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class437 extends class554 {

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "Lhv;")
    private class188 field5946;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "Lpv;")
    private class64 field5948;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5947;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "[F")
    private static float[] field5945 = new float[16];

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public final void method2173(int arg0) {
        int var2 = 11 % ((arg0 + 6) / 56);
        if (this.field5947 != null) {
            IDirect3DDevice var3 = this.field5946.field2418;
            class186 var4 = this.field5946.method3313((byte) -8);
            var3.method2396(0, var4.method1128((byte) 81, field5945));
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lhv;Lkr;Lpv;)V")
    public class437(class188 arg0, class329 arg1, class64 arg2) {
        super(arg0);
        this.field5946 = arg0;
        this.field5948 = arg2;
        if (this.field5948.method370((byte) -25) && (this.field5946.field2422.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field5947 = this.field5946.field2418.method2391(arg1.method2045("transparent_water", (byte) -22, "dx"));
        } else {
            this.field5947 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        if (!arg0) {
            this.field5948 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public final void method2169(byte arg0) {
        if (this.field5947 != null) {
            IDirect3DDevice var2 = this.field5946.field2418;
            class186 var3 = this.field5946.method3313((byte) -8);
            var2.method2396(0, var3.method1128((byte) 81, field5945));
        }
        if (arg0 <= 11) {
            this.field5947 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method2174(int arg0) {
        if (arg0 != 1406) {
            this.method2169((byte) -89);
        }
        if (this.field5947 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field5946.field2418;
        if (this.field7743.field8323 <= 0) {
            var2.method2393(10, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field7743.field8384;
            float var4 = this.field7743.field8388;
            float var5 = var4 - 512.0F;
            var2.method2393(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        }
        this.field7743.method3334(8, this.field7743.field8305);
    }

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 == 4096) {
            return this.field5947 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    public final void method2170(boolean arg0) {
        if (this.field5947 != null) {
            IDirect3DDevice var2 = this.field5946.field2418;
            class186 var3 = this.field7743.method3285(116);
            var3.method1142(16383, field5945);
            field5945[1] *= 0.25F;
            field5945[2] *= 0.25F;
            field5945[4] *= 0.25F;
            field5945[7] *= 0.25F;
            field5945[0] *= 0.25F;
            field5945[3] *= 0.25F;
            field5945[6] *= 0.25F;
            field5945[5] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field5945, 2);
        }
        if (!arg0) {
            this.method2174(16);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2172((byte) 113);
        }
        IDirect3DDevice var4 = this.field5946.field2418;
        if (this.field5948.field869) {
            float var5 = (float) (this.field7743.field8378 % 4000) / 4000.0F;
            this.field7743.method3344(29639, this.field5948.field867);
            var4.method2393(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field7743.field8378 % 4000 * 16 / 4000;
            this.field7743.method3344(29639, this.field5948.field864[var6]);
            var4.method2393(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
    public final void method2172(byte arg0) {
        if (arg0 < -111 && this.field5947 != null) {
            IDirect3DDevice var2 = this.field5946.field2418;
            var2.method2396(4, this.field7743.method3347(field5945, -127));
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        this.field5946.field2418.SetVertexShader(null);
        if (arg0 == 4096) {
            this.field7743.method3300(true, 0, class93.field1233);
            this.field7743.method3300(true, 1, class542.field7574);
            this.field7743.method3300(true, 2, class320.field4434);
            this.field7743.method3304(7, true);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        this.field7743.method3316(class550.field7639, -128, class505.field7041);
        if (arg1 < 74) {
            field5945 = null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        this.field5946.field2418.SetVertexShader(this.field5947);
        this.field7743.method3300(true, 0, class93.field1233);
        this.field7743.method3300(true, 1, class320.field4434);
        this.field7743.method1210(class542.field7574, true, true, false, 2);
        this.field7743.method3304(7, false);
        this.method2169((byte) 63);
        this.method2170(true);
        this.method2172((byte) -127);
        this.method2174(1406);
        if (arg0 != 61) {
            this.field5947 = null;
        }
    }
}
