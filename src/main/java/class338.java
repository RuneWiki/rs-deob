import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class338 extends class593 {

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Los;")
    private class253 field4893;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Ljd;")
    private class130 field4891;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field4890;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field4895;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Z")
    private boolean field4892;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4897 = new String[] { method2716(method2715("^\r")), method2716(method2715("_\u001b-\u0012\u0011U\u001b6\u001e\rN*6\u001a\u0013J\u0010?$\u0014[\u0001>\t<L")), method2716(method2715("_\u001b-\u0012\u0011U\u001b6\u001e\rN*6\u001a\u0013J\u0010?$\u0014[\u0001>\t<\\")) };

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "[F")
    private static float[] field4894 = new float[16];

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Z")
    private boolean field4896;

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Los;Llga;Ljd;)V")
    public class338(class253 arg0, class47 arg1, class130 arg2) {
        super(arg0);
        this.field4893 = arg0;
        this.field4891 = arg2;
        if (arg1 != null && this.field8530.field4750 && this.field8530.field4780 && (this.field4893.field3629.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field4890 = this.field4893.field3618.method3140(arg1.method529(field4897[0], 1, field4897[1]));
            this.field4895 = this.field4893.field3618.method3134(arg1.method529(field4897[0], 1, field4897[2]));
            this.field4892 = this.field4890 != null && this.field4895 != null && this.field4891.method1145(0);
        } else {
            this.field4892 = false;
            this.field4890 = null;
            this.field4895 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
    public final void method456(int arg0) {
        if (arg0 != 30824) {
            this.field4890 = null;
        }
        if (this.field4896) {
            IDirect3DDevice var2 = this.field4893.field3618;
            class639 var3 = this.field8530.method2680((byte) -94);
            var2.SetVertexShaderConstantF(12, var3.method4669(field4894, 2), 2);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public final void method460(byte arg0, boolean arg1) {
        if (arg0 != -20) {
            this.method452(30, (byte) -118, null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(I)V")
    public final void method1473(int arg0) {
        int var2 = -18 % ((arg0 - 50) / 62);
        if (!this.field4896) {
            return;
        }
        IDirect3DDevice var3 = this.field4893.field3618;
        class639 var4 = this.field4893.method2610(true);
        class639 var5 = this.field4893.method2686(-114);
        var3.method3141(0, var5.method4666(field4894, 16383));
        var3.method3141(4, var4.method4665(field4894, 7));
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public final void method1471(boolean arg0) {
        if (this.field4896) {
            IDirect3DDevice var2 = this.field4893.field3618;
            var2.method3141(8, this.field8530.method2657(field4894, 10));
        }
        if (arg0) {
            this.field4890 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
    public final boolean method458(int arg0) {
        if (arg0 <= 70) {
            this.method452(49, (byte) 35, null);
        }
        return this.field4892;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLah;)V")
    public final void method452(int arg0, byte arg1, class764 arg2) {
        if (arg1 != -106) {
            this.method1471(true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V")
    public final void method455(int arg0) {
        if (arg0 != -15226 || !this.field4896) {
            return;
        }
        this.field4893.method2089(null, 118);
        this.field4893.method2118(4, null);
        this.field8530.method2661(arg0 + 15337, 1);
        this.field8530.method2668(24, null);
        this.field8530.method2661(91, 0);
        this.field8530.method2668(24, null);
        this.field4896 = false;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)V")
    public final void method1470(int arg0) {
        if (arg0 <= 71) {
            this.method456(83);
        }
        if (this.field4896) {
            IDirect3DDevice var2 = this.field4893.field3618;
            class639 var3 = this.field4893.method2686(-119);
            var2.method3141(0, var3.method4666(field4894, 16383));
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIB)V")
    public final void method463(int arg0, int arg1, byte arg2) {
        if (arg2 > -98) {
            this.method460((byte) -120, true);
        }
        if (!this.field4896) {
            return;
        }
        IDirect3DDevice var4 = this.field4893.field3618;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << (arg0 >> 3 & 0x7)) / 32.0F;
        int var7 = arg1 & 0xFFFF;
        var4.method3139(14, (float) (this.field8530.field4774 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg1 >> 16 & 0x3) / 8.0F;
        var4.method3139(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method3144(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method3144(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method1472(int arg0) {
        if (arg0 != -5405) {
            this.field4896 = false;
        }
        if (!this.field4896) {
            return;
        }
        IDirect3DDevice var2 = this.field4893.field3618;
        if (this.field8530.field4732 > 0) {
            float var3 = this.field8530.field4809;
            float var4 = this.field8530.field4718;
            var2.method3139(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method3139(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method3144(0, (float) ((this.field8530.field4768 & 0xFF30BF) >> 16) / 255.0F, (float) ((this.field8530.field4768 & 0xFF3C) >> 8) / 255.0F, (float) (this.field8530.field4768 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
    public final void method454(int arg0, boolean arg1) {
        int var3 = -114 % ((arg0 + 51) / 39);
        class361 var4 = this.field8530.method2676(1);
        if (!this.field4892 || var4 == null) {
            return;
        }
        IDirect3DDevice var5 = this.field4893.field3618;
        this.field4893.method2089(this.field4890, 108);
        this.field4893.method2118(4, this.field4895);
        this.field8530.method2661(71, 1);
        this.field8530.method2668(24, var4);
        this.field8530.method2661(106, 0);
        this.field8530.method2668(24, this.field4891.field1627);
        this.field4896 = true;
        this.method1473(119);
        this.method456(30824);
        this.method1471(false);
        this.method1472(-5405);
        var5.method3144(1, -this.field8530.field4746[0], -this.field8530.field4746[1], -this.field8530.field4746[2], 0.0F);
        var5.method3144(2, this.field8530.field4807, this.field8530.field4767, this.field8530.field4758, 1.0F);
        var5.method3144(3, Math.abs(this.field8530.field4746[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2715(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2716(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 58;
                    break;
                case 1:
                    var10005 = 117;
                    break;
                case 2:
                    var10005 = 91;
                    break;
                case 3:
                    var10005 = 123;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
