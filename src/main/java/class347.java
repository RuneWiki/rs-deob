import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class347 extends class554 {

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "Lhv;")
    private class188 field4793;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "Z")
    private boolean field4799;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4797;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4790;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4794;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4798;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "[F")
    private static float[] field4795 = new float[4];

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "[F")
    private static float[] field4791 = new float[16];

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4792;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "Z")
    private boolean field4796;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V")
    public final void method2168(int arg0) {
        IDirect3DDevice var2 = this.field4793.field2418;
        int var3 = this.field7743.method3294((byte) -62);
        class186 var4 = this.field7743.method3360(-1);
        IDirect3DVertexShader var5;
        if (this.field4796) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field4790 : this.field4798;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field4797 : this.field4794;
        }
        if (this.field4792 != var5) {
            this.field4792 = var5;
            var2.SetVertexShader(var5);
            this.method2171(false);
            this.method2172((byte) -120);
            this.method2170(true);
            this.method2169((byte) 40);
            this.method2173(-82);
            this.method2174(1406);
        }
        var4.method1130(122, 0.0F, -1.0F, (float) var3, 0.0F, field4795);
        var2.method2396(12, field4795);
        if (arg0 <= 99) {
            this.method2168(77);
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z")
    public final boolean method467(int arg0) {
        if (arg0 != 4096) {
            this.method2172((byte) 88);
        }
        return this.field4799;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZILsw;)V")
    public final void method464(boolean arg0, int arg1, class11 arg2) {
        this.field7743.method3344(29639, arg2);
        if (!arg0) {
            this.method467(-26);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BZ)V")
    public final void method466(byte arg0, boolean arg1) {
        this.field4796 = arg1;
        if (arg0 != 61) {
            this.field4798 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V")
    public final void method2169(byte arg0) {
        if (this.field4792 != null) {
            IDirect3DDevice var2 = this.field4793.field2418;
            class186 var3 = this.field4793.method3313((byte) -8);
            var2.method2396(0, var3.method1128((byte) 81, field4791));
        }
        if (arg0 <= 11) {
            this.method473(71, true, 9);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V")
    public final void method2170(boolean arg0) {
        if (!arg0) {
            this.method2168(-36);
        }
        if (this.field4792 != null) {
            IDirect3DDevice var2 = this.field4793.field2418;
            class186 var3 = this.field7743.method3285(116);
            var2.SetVertexShaderConstantF(8, var3.method1142(16383, field4791), 2);
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V")
    private final void method2171(boolean arg0) {
        if (this.field4792 != null && this.field4796) {
            class186 var2 = this.field7743.method3360(-1);
            IDirect3DDevice var3 = this.field4793.field2418;
            var3.method2393(13, this.field7743.field8355 * this.field7743.field8352, this.field7743.field8402 * this.field7743.field8355, this.field7743.field8363 * this.field7743.field8355, 1.0F);
            var3.method2393(14, this.field7743.field8385 * this.field7743.field8352, this.field7743.field8402 * this.field7743.field8385, this.field7743.field8385 * this.field7743.field8363, 1.0F);
            var3.method2393(16, this.field7743.field8352 * this.field7743.field8343, this.field7743.field8402 * this.field7743.field8343, this.field7743.field8363 * this.field7743.field8343, 1.0F);
            var2.method1140(this.field7743.field8377[0], field4795, this.field7743.field8377[2], this.field7743.field8377[1], 0);
            var3.SetVertexShaderConstantF(15, field4795, 1);
            var2.method1140(this.field7743.field8400[0], field4795, this.field7743.field8400[2], this.field7743.field8400[1], 0);
            var3.SetVertexShaderConstantF(15, field4795, 1);
        }
        if (arg0) {
            this.method471(true, -34);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZI)V")
    public final void method473(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.method2168(-102);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZI)V")
    public final void method471(boolean arg0, int arg1) {
        if (arg1 < 74) {
            this.field4790 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public final void method470(int arg0) {
        if (arg0 == 4096 && this.field4792 != null) {
            this.field4793.field2418.SetVertexShader(null);
            this.field4792 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lhv;Lkr;)V")
    public class347(class188 arg0, class329 arg1) {
        super(arg0);
        this.field4793 = arg0;
        if ((this.field4793.field2422.VertexShaderVersion & 0xFFFF) < 257) {
            this.field4799 = false;
        } else {
            this.field4797 = this.field4793.field2418.method2391(arg1.method2045("uw_ground_unlit", (byte) -22, "dx"));
            this.field4790 = this.field4793.field2418.method2391(arg1.method2045("uw_ground_lit", (byte) -22, "dx"));
            this.field4794 = this.field4793.field2418.method2391(arg1.method2045("uw_model_unlit", (byte) -22, "dx"));
            this.field4798 = this.field4793.field2418.method2391(arg1.method2045("uw_model_lit", (byte) -22, "dx"));
            this.field4799 = this.field4798 != null & this.field4790 != null & this.field4797 != null & this.field4794 != null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V")
    public final void method2172(byte arg0) {
        if (arg0 > -111) {
            field4791 = null;
        }
        if (this.field4792 != null) {
            IDirect3DDevice var2 = this.field4793.field2418;
            var2.method2396(4, this.field7743.method3347(field4791, -110));
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public final void method2173(int arg0) {
        if (this.field4792 != null) {
            IDirect3DDevice var2 = this.field4793.field2418;
            class186 var3 = this.field4793.method3313((byte) -8);
            var2.method2396(0, var3.method1128((byte) 81, field4791));
        }
        int var4 = -36 / ((-arg0 - 6) / 56);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public final void method2174(int arg0) {
        if (this.field4792 != null) {
            IDirect3DDevice var2 = this.field4793.field2418;
            int var3 = this.field7743.method954();
            int var4 = this.field7743.method958();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method2393(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2393(11, 1.0F / (float) this.field7743.method3310((byte) -23), (float) this.field7743.method3363((byte) -82) / 255.0F, 0.0F, 0.0F);
        }
        if (arg0 != 1406) {
            this.method471(false, 121);
        }
    }
}
