import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class175 extends class593 {

    @OriginalMember(owner = "client!tga", name = "k", descriptor = "Ljd;")
    private class130 field2300;

    @OriginalMember(owner = "client!tga", name = "i", descriptor = "Los;")
    private class253 field2303;

    @OriginalMember(owner = "client!tga", name = "h", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field2301;

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2304 = new String[] { method1475(method1474("._")), method1475(method1474(">UPO0:FCD->xF@7/U")) };

    @OriginalMember(owner = "client!tga", name = "j", descriptor = "[F")
    private static float[] field2302 = new float[16];

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        if (arg0 <= 70) {
            return false;
        } else {
            return this.field2301 != null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "g", descriptor = "(I)V")
    public final void method456(int arg0) {
        if (this.field2301 != null) {
            IDirect3DDevice var2 = this.field2303.field3618;
            class639 var3 = this.field8530.method2680((byte) -51);
            var3.method4669(field2302, 2);
            field2302[2] *= 0.25F;
            field2302[5] *= 0.25F;
            field2302[0] *= 0.25F;
            field2302[3] *= 0.25F;
            field2302[7] *= 0.25F;
            field2302[4] *= 0.25F;
            field2302[1] *= 0.25F;
            field2302[6] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field2302, 2);
        }
        if (arg0 != 30824) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        if (arg2 > -98) {
            return;
        }
        IDirect3DDevice var4 = this.field2303.field3618;
        if (this.field2300.field1621) {
            float var6 = (float) (this.field8530.field4774 % 4000) / 4000.0F;
            this.field8530.method2668(24, this.field2300.field1618);
            var4.method3139(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var5 = this.field8530.field4774 % 4000 * 16 / 4000;
            this.field8530.method2668(24, this.field2300.field1615[var5]);
            var4.method3139(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        if (arg1 != -106) {
            field2302 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        this.field8530.method2655(1, 0, class784.field11325);
        int var3 = 72 % ((-arg0 - 51) / 39);
        this.field8530.method2655(1, 1, class659.field9335);
        this.field8530.method2096(false, true, (byte) 75, class801.field11657, 2);
        this.field8530.method2612(false, true);
        this.field2303.method2089(this.field2301, 127);
        this.method1470(107);
        this.method456(30824);
        this.method1471(false);
        this.method1472(-5405);
    }

    @OriginalMember(owner = "client!tga", name = "e", descriptor = "(I)V")
    public final void method1470(int arg0) {
        if (arg0 >= 71 && this.field2301 != null) {
            IDirect3DDevice var2 = this.field2303.field3618;
            class639 var3 = this.field2303.method2686(-111);
            var2.method3141(0, var3.method4666(field2302, 16383));
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Z)V")
    public final void method1471(boolean arg0) {
        if (this.field2301 != null) {
            IDirect3DDevice var2 = this.field2303.field3618;
            var2.method3141(4, this.field8530.method2657(field2302, 10));
        }
        if (arg0) {
            this.method456(125);
        }
    }

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        if (arg0 != -20) {
            this.method1472(-6);
        }
        this.field8530.method2624(class795.field11565, (byte) 116, class647.field9205);
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(Los;Llga;Ljd;)V")
    public class175(class253 arg0, class47 arg1, class130 arg2) {
        super(arg0);
        this.field2300 = arg2;
        this.field2303 = arg0;
        if (arg1 != null && this.field2300.method1142((byte) -119) && (this.field2303.field3629.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field2301 = this.field2303.field3618.method3140(arg1.method529(field2304[0], 1, field2304[1]));
        } else {
            this.field2301 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "(I)V")
    public final void method1472(int arg0) {
        if (this.field2301 != null) {
            IDirect3DDevice var2 = this.field2303.field3618;
            if (this.field8530.field4732 > 0) {
                float var3 = this.field8530.field4809;
                float var4 = this.field8530.field4718;
                float var5 = var4 - 512.0F;
                var2.method3139(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method3139(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field8530.method2658(this.field8530.field4768, -8793);
        }
        if (arg0 != -5405) {
            this.field2301 = null;
        }
    }

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)V")
    public final void method1473(int arg0) {
        if (this.field2301 != null) {
            IDirect3DDevice var2 = this.field2303.field3618;
            class639 var3 = this.field2303.method2686(-121);
            var2.method3141(0, var3.method4666(field2302, 16383));
        }
        int var4 = -95 % ((50 - arg0) / 62);
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        this.field2303.method2089(null, 113);
        this.field8530.method2655(1, 0, class784.field11325);
        if (arg0 != -15226) {
            field2302 = null;
        }
        this.field8530.method2655(1, 1, class801.field11657);
        this.field8530.method2655(1, 2, class659.field9335);
        this.field8530.method2612(true, true);
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1474(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!tga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1475(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 74;
                    break;
                case 1:
                    var10005 = 39;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 33;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
