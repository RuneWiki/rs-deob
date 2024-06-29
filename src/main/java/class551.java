import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class551 extends class252 {

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "Luk;")
    private class234 field7818;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Ltb;")
    private class364 field7817;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7819;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "[F")
    private static float[] field7816 = new float[16];

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public final void method1681(byte arg0) {
        if (this.field7819 != null) {
            IDirect3DDevice var2 = this.field7817.field5204;
            class21 var3 = this.field7817.method2349(arg0 ^ 0x15);
            var2.method2654(0, var3.method243((byte) 126, field7816));
        }
        if (arg0 != -19) {
            this.field7817 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "(I)V")
    public final void method1691(int arg0) {
        if (this.field7819 != null) {
            IDirect3DDevice var2 = this.field7817.field5204;
            if (this.field3884.field5651 > 0) {
                float var3 = this.field3884.field5644;
                float var4 = this.field3884.field5735;
                float var5 = var4 - 512.0F;
                var2.method2645(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method2645(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field3884.method2321(this.field3884.field5718, 24);
        }
        if (arg0 != 0) {
            this.method1689(57);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(ZI)V")
    public final void method791(boolean arg0, int arg1) {
        this.field3884.method2339(class203.field2875, -32540, class413.field6010);
        if (arg1 != 1) {
            this.method790(null, -85, 57);
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V")
    public final void method1689(int arg0) {
        if (this.field7819 != null) {
            IDirect3DDevice var2 = this.field7817.field5204;
            var2.method2654(4, this.field3884.method2367((byte) 1, field7816));
        }
        if (arg0 != 1) {
            this.method792(34);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lbb;II)V")
    public final void method790(class301 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field7816 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "(I)V")
    public final void method1690(int arg0) {
        if (this.field7819 != null) {
            IDirect3DDevice var2 = this.field7817.field5204;
            class21 var3 = this.field3884.method2350((byte) 115);
            var3.method264(field7816, 3);
            field7816[0] *= 0.25F;
            field7816[1] *= 0.25F;
            field7816[7] *= 0.25F;
            field7816[6] *= 0.25F;
            field7816[4] *= 0.25F;
            field7816[3] *= 0.25F;
            field7816[2] *= 0.25F;
            field7816[5] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field7816, 2);
        }
        if (arg0 != -1) {
            this.method788(false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public final void method794(boolean arg0, int arg1) {
        this.field7817.field5204.SetVertexShader(this.field7819);
        this.field3884.method2324(0, class61.field1155, arg1 + 2);
        this.field3884.method2324(1, class124.field1869, arg1 + 2);
        this.field3884.method1881(false, class315.field4669, 2, -4016, true);
        this.field3884.method2344(arg1 ^ 0x2936, false);
        this.method1684((byte) 65);
        this.method1690(arg1);
        this.method1689(arg1 ^ 0xFFFFFFFE);
        this.method1691(0);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)V")
    public final void method796(int arg0, int arg1, int arg2) {
        if (arg2 > -105) {
            return;
        }
        IDirect3DDevice var4 = this.field7817.field5204;
        if (this.field7818.field3626) {
            float var5 = (float) (this.field3884.field5688 % 4000) / 4000.0F;
            this.field3884.method2337(false, this.field7818.field3634);
            var4.method2645(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field3884.field5688 % 4000 * 16 / 4000;
            this.field3884.method2337(false, this.field7818.field3627[var6]);
            var4.method2645(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V")
    public final void method1684(byte arg0) {
        if (arg0 == 65 && this.field7819 != null) {
            IDirect3DDevice var2 = this.field7817.field5204;
            class21 var3 = this.field7817.method2349(-8);
            var2.method2654(0, var3.method243((byte) 102, field7816));
        }
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)Z")
    public final boolean method792(int arg0) {
        if (arg0 != 6439) {
            this.field7817 = null;
        }
        return this.field7819 != null;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Ltb;Lpu;Luk;)V")
    public class551(class364 arg0, class522 arg1, class234 arg2) {
        super(arg0);
        this.field7818 = arg2;
        this.field7817 = arg0;
        if (arg1 != null && this.field7818.method1605(-27703) && (this.field7817.field5210.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7819 = this.field7817.field5204.method2644(arg1.method3009("transparent_water", "dx", 0));
        } else {
            this.field7819 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)V")
    public final void method788(boolean arg0) {
        this.field7817.field5204.SetVertexShader(null);
        this.field3884.method2324(0, class61.field1155, 1);
        this.field3884.method2324(1, class315.field4669, 1);
        this.field3884.method2324(2, class124.field1869, 1);
        this.field3884.method2344(-10551, arg0);
    }
}
