import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class404 extends class252 {

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Ltb;")
    private class364 field5927;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5925;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5919;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5921;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5926;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Z")
    private boolean field5920;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Loi;")
    private class65 field5918;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "[F")
    private static float[] field5923 = new float[16];

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "[F")
    private static float[] field5922 = new float[4];

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5924;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "Z")
    private boolean field5917;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        if (!arg0) {
            return;
        }
        this.field3884.method2351(0, 1);
        this.field3884.method2337(false, null);
        this.field3884.method2339(class153.field2209, -32540, class153.field2209);
        this.field3884.method2324(0, class61.field1155, 1);
        this.field3884.method2324(2, class124.field1869, 1);
        this.field3884.method2360(0, class61.field1155, 1);
        this.field3884.method2351(0, 0);
        this.field3884.method2324(0, class61.field1155, 1);
        this.field3884.method2360(0, class61.field1155, 1);
        if (this.field5924 != null) {
            this.field5927.field5204.SetVertexShader(null);
            this.field5924 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method1685(int arg0) {
        IDirect3DDevice var2 = this.field5927.field5204;
        int var3 = this.field3884.method2347(1);
        class21 var4 = this.field3884.method2382(1);
        IDirect3DVertexShader var5;
        if (this.field5917) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field5919 : this.field5926;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field5925 : this.field5921;
        }
        if (this.field5924 != var5) {
            this.field5924 = var5;
            var2.SetVertexShader(var5);
            this.method2456(-23054);
            this.method1689(1);
            this.method1690(arg0 ^ 0xFFFFC888);
            this.method1684((byte) 65);
            this.method1681((byte) -19);
            this.method1691(0);
        }
        var4.method266(0.0F, -1.0F, (float) var3, 0.0F, 101, field5922);
        var2.method2654(12, field5922);
        if (arg0 != 14199) {
            this.field5925 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(I)V")
    public final void method1691(int arg0) {
        if (this.field5924 != null) {
            IDirect3DDevice var2 = this.field5927.field5204;
            int var3 = this.field3884.method115();
            int var4 = this.field3884.method110();
            float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
            float var6 = (float) var3 - ((float) (var3 - var4) * 0.25F);
            var2.method2645(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method2645(11, 1.0F / (float) this.field3884.method2377(100), (float) this.field3884.method2335(false) / 255.0F, this.field3884.field5644, 1.0F / (this.field3884.field5644 - this.field3884.field5735));
            this.field3884.method2321(this.field3884.method2317(100), arg0 ^ 0x18);
        }
        if (arg0 != 0) {
            this.method1681((byte) -27);
        }
    }

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "(I)V")
    private final void method2456(int arg0) {
        if (arg0 != -23054) {
            this.field5917 = true;
        }
        if (this.field5924 == null || !this.field5917) {
            return;
        }
        class21 var2 = this.field3884.method2354(25603);
        IDirect3DDevice var3 = this.field5927.field5204;
        var3.method2645(13, this.field3884.field5719 * this.field3884.field5650, this.field3884.field5719 * this.field3884.field5690, this.field3884.field5719 * this.field3884.field5717, 1.0F);
        var3.method2645(14, this.field3884.field5729 * this.field3884.field5650, this.field3884.field5729 * this.field3884.field5690, this.field3884.field5729 * this.field3884.field5717, 1.0F);
        var3.method2645(16, this.field3884.field5658 * this.field3884.field5650, this.field3884.field5690 * this.field3884.field5658, this.field3884.field5717 * this.field3884.field5658, 1.0F);
        var2.method244(this.field3884.field5635[1], this.field3884.field5635[0], -124, field5922, this.field3884.field5635[2]);
        var3.SetVertexShaderConstantF(15, field5922, 1);
        var2.method244(this.field3884.field5687[1], this.field3884.field5687[0], 116, field5922, this.field3884.field5687[2]);
        var3.SetVertexShaderConstantF(17, field5922, 1);
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V")
    public final void method1690(int arg0) {
        if (this.field5924 != null) {
            IDirect3DDevice var2 = this.field5927.field5204;
            class21 var3 = this.field3884.method2350((byte) 105);
            var2.SetVertexShaderConstantF(8, var3.method264(field5923, 3), 2);
        }
        if (arg0 != -1) {
            this.method1690(-77);
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
    public final void method1684(byte arg0) {
        if (this.field5924 != null) {
            IDirect3DDevice var2 = this.field5927.field5204;
            class21 var3 = this.field5927.method2349(arg0 - 73);
            var2.method2654(0, var3.method243((byte) 113, field5923));
        }
        if (arg0 != 65) {
            this.method1684((byte) 86);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 > -105) {
            this.method1689(52);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public final void method1681(byte arg0) {
        if (this.field5924 != null) {
            IDirect3DDevice var2 = this.field5927.field5204;
            class21 var3 = this.field5927.method2349(arg0 ^ 0x15);
            var2.method2654(0, var3.method243((byte) 112, field5923));
        }
        if (arg0 != -19) {
            field5923 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public final void method1689(int arg0) {
        if (this.field5924 != null) {
            IDirect3DDevice var2 = this.field5927.field5204;
            var2.method2654(4, this.field3884.method2367((byte) 1, field5923));
        }
        if (arg0 != 1) {
            this.method1691(31);
        }
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Ltb;Lpu;)V")
    public class404(class364 arg0, class522 arg1) {
        super(arg0);
        this.field5927 = arg0;
        if (arg1 == null || (this.field5927.field5210.VertexShaderVersion & 0xFFFF) < 257) {
            this.field5920 = false;
        } else {
            this.field5925 = this.field5927.field5204.method2644(arg1.method3009("uw_ground_unlit", "dx", 0));
            this.field5919 = this.field5927.field5204.method2644(arg1.method3009("uw_ground_lit", "dx", 0));
            this.field5921 = this.field5927.field5204.method2644(arg1.method3009("uw_model_unlit", "dx", 0));
            this.field5926 = this.field5927.field5204.method2644(arg1.method3009("uw_model_lit", "dx", 0));
            if ((this.field5921 != null & this.field5919 != null & this.field5925 != null & this.field5926 != null)) {
                this.field5918 = this.field3884.method2363(2, 0, false, new int[] { 0, -1 }, 1);
                this.field5918.method663((byte) -102, false, false);
                this.field5920 = true;
            } else {
                this.field5920 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        this.field5917 = arg0;
        if (arg1 != -1) {
            return;
        }
        this.field3884.method2351(0, 1);
        this.field3884.method2337(false, this.field5918);
        this.field3884.method2339(class203.field2875, arg1 ^ 0x7F1B, class190.field2740);
        this.field3884.method2324(0, class124.field1869, arg1 + 2);
        this.field3884.method1881(true, class61.field1155, 2, -4016, false);
        this.field3884.method2360(0, class319.field4696, 1);
        this.field3884.method2351(0, 0);
        this.method1685(14199);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.field5924 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            this.field5927 = null;
        }
        return this.field5920;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.field5927 = null;
        }
        if (arg0 == null) {
            this.field3884.method2337(false, this.field3884.field5706);
            this.field3884.method2308(arg2 ^ 0x0, 1);
            this.field3884.method2324(0, class319.field4696, 1);
            this.field3884.method2360(0, class319.field4696, 1);
        } else {
            this.field3884.method2337(false, arg0);
            this.field3884.method2308(-1, arg1);
        }
    }
}
