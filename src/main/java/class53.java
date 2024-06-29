import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class53 extends class712 {

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "Lep;")
    private class374 field773;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "Lkfa;")
    private class386 field769;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field770;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field772;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "Z")
    private boolean field771;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "[F")
    private static float[] field774 = new float[16];

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "Z")
    private boolean field768;

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(Z)V", line = 4)
    public final void method389(boolean arg0) {
        if (arg0 || !this.field768) {
            return;
        }
        this.field769.method2424(arg0, null);
        this.field769.method2420(-3098, null);
        this.field9945.method1431(0, 1);
        this.field9945.method1458(399403340, null);
        this.field9945.method1431(0, 0);
        this.field9945.method1458(399403340, null);
        this.field768 = false;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(Z)V", line = 24)
    public final void method390(boolean arg0) {
        if (this.field768) {
            IDirect3DDevice var2 = this.field769.field5542;
            class474 var3 = this.field769.method1403(-127);
            var2.method4125(0, var3.method2893(field774, (byte) -83));
        }
        if (arg0) {
            this.method390(true);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILhba;)V", line = 43)
    public final void method391(int arg0, int arg1, class190 arg2) {
        if (arg1 != 0) {
            this.method395(false);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)V", line = 53)
    public final void method392(byte arg0) {
        if (arg0 >= -92) {
            this.method394((byte) 81, true);
        }
        if (this.field768) {
            IDirect3DDevice var2 = this.field769.field5542;
            var2.method4125(8, this.field9945.method1384(field774, 9));
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(III)V", line = 70)
    public final void method393(int arg0, int arg1, int arg2) {
        if (arg2 <= 96) {
            this.field770 = null;
        }
        if (!this.field768) {
            return;
        }
        IDirect3DDevice var4 = this.field769.field5542;
        int var5 = 0x1 << (arg1 & 0x3);
        float var6 = (float) (0x1 << ((arg1 & 0x39) >> 3)) / 32.0F;
        int var7 = arg0 & 0xFFFF;
        float var8 = (float) (arg0 >> 16 & 0x3) / 8.0F;
        var4.method4120(14, (float) (this.field9945.field3380 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        var4.method4120(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method4122(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method4122(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)V", line = 98)
    public final void method394(byte arg0, boolean arg1) {
        if (arg0 <= 39) {
            this.method397(0);
        }
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(Z)V", line = 108)
    public final void method395(boolean arg0) {
        if (this.field768) {
            IDirect3DDevice var2 = this.field769.field5542;
            if (this.field9945.field3406 > 0) {
                float var3 = this.field9945.field3345;
                float var4 = this.field9945.field3399;
                var2.method4120(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
            } else {
                var2.method4120(16, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            var2.method4122(0, (float) (this.field9945.field3405 >> 16 & 0xFF) / 255.0F, (float) (this.field9945.field3405 >> 8 & 0xFF) / 255.0F, (float) (this.field9945.field3405 & 0xFF) / 255.0F, 0.0F);
        }
        if (arg0) {
            this.method394((byte) -33, true);
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lkfa;Luu;Lep;)V", line = 136)
    public class53(class386 arg0, class237 arg1, class374 arg2) {
        super(arg0);
        this.field773 = arg2;
        this.field769 = arg0;
        if (arg1 != null && this.field9945.field3394 && this.field9945.field3359 && (this.field769.field5536.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field770 = this.field769.field5542.method4113(arg1.method1582("environment_mapped_water_v", false, "dx"));
            this.field772 = this.field769.field5542.method4121(arg1.method1582("environment_mapped_water_f", false, "dx"));
            this.field771 = this.field770 != null && this.field772 != null && this.field773.method2352(true);
        } else {
            this.field770 = null;
            this.field771 = false;
            this.field772 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(Z)Z", line = 159)
    public final boolean method396(boolean arg0) {
        if (arg0) {
            this.method391(92, -10, null);
        }
        return this.field771;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 171)
    public final void method397(int arg0) {
        if (this.field768) {
            IDirect3DDevice var2 = this.field769.field5542;
            class474 var3 = this.field769.method1456(15903);
            class474 var4 = this.field769.method1403(-121);
            var2.method4125(0, var4.method2893(field774, (byte) 101));
            var2.method4125(4, var3.method2876((byte) -119, field774));
        }
        if (arg0 != -1) {
            this.method394((byte) 117, true);
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 193)
    public final void method398(int arg0) {
        if (arg0 != 10700) {
            this.method390(true);
        }
        if (this.field768) {
            IDirect3DDevice var2 = this.field769.field5542;
            class474 var3 = this.field9945.method1466(1);
            var2.SetVertexShaderConstantF(12, var3.method2889((byte) -122, field774), 2);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ZB)V", line = 213)
    public final void method399(boolean arg0, byte arg1) {
        class492 var3 = this.field9945.method1436(0);
        if (this.field771 && var3 != null) {
            IDirect3DDevice var4 = this.field769.field5542;
            this.field769.method2424(false, this.field770);
            this.field769.method2420(-3098, this.field772);
            this.field9945.method1431(0, 1);
            this.field9945.method1458(399403340, var3);
            this.field9945.method1431(0, 0);
            this.field9945.method1458(399403340, this.field773.field5265);
            this.field768 = true;
            this.method397(-1);
            this.method398(10700);
            this.method392((byte) -110);
            this.method395(false);
            var4.method4122(1, -this.field9945.field3355[0], -this.field9945.field3355[1], -this.field9945.field3355[2], 0.0F);
            var4.method4122(2, this.field9945.field3420, this.field9945.field3413, this.field9945.field3365, 1.0F);
            var4.method4122(3, Math.abs(this.field9945.field3355[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 < 44) {
            this.field769 = null;
        }
    }
}
