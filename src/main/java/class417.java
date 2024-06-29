import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class417 extends class593 {

    @OriginalMember(owner = "client!fba", name = "n", descriptor = "Z")
    private boolean field6008 = false;

    @OriginalMember(owner = "client!fba", name = "k", descriptor = "Los;")
    private class253 field6012;

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6011;

    @OriginalMember(owner = "client!fba", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6016;

    @OriginalMember(owner = "client!fba", name = "l", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6019;

    @OriginalMember(owner = "client!fba", name = "m", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6009;

    @OriginalMember(owner = "client!fba", name = "j", descriptor = "Z")
    private boolean field6018;

    @OriginalMember(owner = "client!fba", name = "i", descriptor = "Lcf;")
    private class196 field6010;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6020 = new String[] { method3258(method3257("\n:2\tH\u001b(\u0001;K\u00169")), method3258(method3257("\u001b5")), method3258(method3257("\n:2\u0003U\u00108\u0003\u0000x\n#\u0001\rS")), method3258(method3257("\n:2\tH\u001b(\u0001;R\u0011!\u0004\u0010")), method3258(method3257("\n:2\u0003U\u00108\u0003\u0000x\u0013$\u0019")) };

    @OriginalMember(owner = "client!fba", name = "p", descriptor = "[F")
    private static float[] field6013 = new float[16];

    @OriginalMember(owner = "client!fba", name = "s", descriptor = "[F")
    private static float[] field6017 = new float[4];

    @OriginalMember(owner = "client!fba", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field6015;

    @OriginalMember(owner = "client!fba", name = "q", descriptor = "Z")
    private boolean field6014;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Z)V", line = 5)
    public final void method1471(boolean arg0) {
        if (arg0) {
            this.method455(64);
        }
        if (this.field6015 != null) {
            IDirect3DDevice var2 = this.field6012.field3618;
            var2.method3141(4, this.field8530.method2657(field6013, 10));
        }
    }

    @OriginalMember(owner = "client!fba", name = "g", descriptor = "(I)V", line = 22)
    public final void method456(int arg0) {
        if (this.field6015 != null) {
            IDirect3DDevice var2 = this.field6012.field3618;
            class639 var3 = this.field8530.method2680((byte) -79);
            var2.SetVertexShaderConstantF(8, var3.method4669(field6013, arg0 - 30822), 2);
        }
        if (arg0 != 30824) {
            this.method3255(-97);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IZ)V", line = 42)
    public final void method454(int arg0, boolean arg1) {
        this.field6014 = arg1;
        this.field8530.method2661(90, 1);
        this.field8530.method2668(24, this.field6010);
        this.field8530.method2624(class795.field11565, (byte) 126, class256.field3668);
        this.field8530.method2655(1, 0, class659.field9335);
        int var3 = 98 % ((-arg0 - 51) / 39);
        this.field8530.method2096(true, false, (byte) 105, class784.field11325, 2);
        this.field8530.method2670(-128, 0, class514.field7551);
        this.field8530.method2661(89, 0);
        this.method3256(16934);
    }

    @OriginalMember(owner = "client!fba", name = "b", descriptor = "(I)V", line = 59)
    public final void method1472(int arg0) {
        if (arg0 != -5405) {
            this.field6011 = null;
        }
        if (this.field6015 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field6012.field3618;
        int var3 = this.field8530.method187();
        int var4 = this.field8530.method195();
        float var5 = (float) var3 - (float) (var3 - var4) * 0.125F;
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method3139(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method3139(11, 1.0F / (float) this.field8530.method2615(2), (float) this.field8530.method2665((byte) 86) / 255.0F, this.field8530.field4809, 1.0F / (this.field8530.field4809 - this.field8530.field4718));
        this.field8530.method2658(this.field8530.method2653(3), -8793);
    }

    @OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V", line = 86)
    public final void method1473(int arg0) {
        int var2 = 49 % ((arg0 - 50) / 62);
        if (this.field6015 != null) {
            IDirect3DDevice var3 = this.field6012.field3618;
            class639 var4 = this.field6012.method2686(-122);
            var3.method3141(0, var4.method4666(field6013, 16383));
        }
    }

    @OriginalMember(owner = "client!fba", name = "h", descriptor = "(I)V", line = 102)
    private final void method3255(int arg0) {
        if (arg0 != -23767 || this.field6015 == null || !this.field6014) {
            return;
        }
        class639 var2 = this.field8530.method2641(2);
        IDirect3DDevice var3 = this.field6012.field3618;
        var3.method3139(13, this.field8530.field4807 * this.field8530.field4801, this.field8530.field4801 * this.field8530.field4767, this.field8530.field4801 * this.field8530.field4758, 1.0F);
        var3.method3139(14, this.field8530.field4807 * this.field8530.field4757, this.field8530.field4767 * this.field8530.field4757, this.field8530.field4758 * this.field8530.field4757, 1.0F);
        var3.method3139(16, this.field8530.field4807 * this.field8530.field4736, this.field8530.field4767 * this.field8530.field4736, this.field8530.field4758 * this.field8530.field4736, 1.0F);
        var2.method4655(this.field8530.field4746[0], this.field8530.field4746[2], field6017, (byte) 40, this.field8530.field4746[1]);
        var3.SetVertexShaderConstantF(15, field6017, 1);
        var2.method4655(this.field8530.field4771[0], this.field8530.field4771[2], field6017, (byte) 92, this.field8530.field4771[1]);
        var3.SetVertexShaderConstantF(17, field6017, 1);
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(I)V", line = 130)
    public final void method1470(int arg0) {
        if (this.field6015 != null) {
            IDirect3DDevice var2 = this.field6012.field3618;
            class639 var3 = this.field6012.method2686(-118);
            var2.method3141(0, var3.method4666(field6013, 16383));
        }
        if (arg0 <= 71) {
            this.method1473(-2);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BZ)V", line = 149)
    public final void method460(byte arg0, boolean arg1) {
        if (arg0 != -20) {
            this.method1470(41);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IBLah;)V", line = 158)
    public final void method452(int arg0, byte arg1, class764 arg2) {
        if (arg2 != null) {
            if (this.field6008) {
                this.field8530.method2655(1, 0, class784.field11325);
                this.field8530.method2670(-128, 0, class784.field11325);
                this.field6008 = false;
            }
            this.field8530.method2668(24, arg2);
            this.field8530.method2679(2, arg0);
        } else if (!this.field6008) {
            this.field8530.method2668(arg1 + 130, this.field8530.field4751);
            this.field8530.method2679(arg1 ^ 0xFFFFFF94, 1);
            this.field8530.method2655(1, 0, class514.field7551);
            this.field8530.method2670(-128, 0, class514.field7551);
            this.field6008 = true;
        }
        if (arg1 != -106) {
            this.field6012 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "<init>", descriptor = "(Los;Llga;)V", line = 192)
    public class417(class253 arg0, class47 arg1) {
        super(arg0);
        this.field6012 = arg0;
        if (arg1 == null || (this.field6012.field3629.VertexShaderVersion & 0xFFFF) < 257) {
            this.field6018 = false;
        } else {
            this.field6011 = this.field6012.field3618.method3140(arg1.method529(field6020[1], 1, field6020[2]));
            this.field6016 = this.field6012.field3618.method3140(arg1.method529(field6020[1], 1, field6020[4]));
            this.field6019 = this.field6012.field3618.method3140(arg1.method529(field6020[1], 1, field6020[3]));
            this.field6009 = this.field6012.field3618.method3140(arg1.method529(field6020[1], 1, field6020[0]));
            if ((this.field6011 != null & this.field6016 != null & this.field6019 != null & this.field6009 != null)) {
                this.field6010 = this.field8530.method2613(2, 10, false, new int[] { 0, -1 }, 1);
                this.field6010.method1706(-18440, false, false);
                this.field6018 = true;
            } else {
                this.field6018 = false;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)Z", line = 223)
    public final boolean method458(int arg0) {
        if (arg0 <= 70) {
            field6013 = null;
        }
        return this.field6018;
    }

    @OriginalMember(owner = "client!fba", name = "c", descriptor = "(I)V", line = 238)
    public final void method455(int arg0) {
        this.field8530.method2661(46, 1);
        this.field8530.method2668(arg0 + 15250, null);
        this.field8530.method2624(class539.field7920, (byte) 109, class539.field7920);
        this.field8530.method2655(1, 0, class784.field11325);
        if (arg0 != -15226) {
            this.field6009 = null;
        }
        this.field8530.method2655(1, 2, class659.field9335);
        this.field8530.method2670(arg0 ^ 0x3B06, 0, class784.field11325);
        this.field8530.method2661(arg0 ^ 0xFFFFC4FA, 0);
        if (this.field6008) {
            this.field8530.method2655(1, 0, class784.field11325);
            this.field8530.method2670(arg0 ^ 0x3B06, 0, class784.field11325);
            this.field6008 = false;
        }
        if (this.field6015 != null) {
            this.field6012.method2089(null, 101);
            this.field6015 = null;
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIB)V", line = 269)
    public final void method463(int arg0, int arg1, byte arg2) {
        if (arg2 > -98) {
            this.field6018 = false;
        }
    }

    @OriginalMember(owner = "client!fba", name = "d", descriptor = "(I)V", line = 281)
    public final void method3256(int arg0) {
        IDirect3DDevice var2 = this.field6012.field3618;
        if (arg0 != 16934) {
            this.field6016 = null;
        }
        int var3 = this.field8530.method2682(8);
        class639 var4 = this.field8530.method2610(true);
        IDirect3DVertexShader var5;
        if (this.field6014) {
            var5 = var3 == Integer.MAX_VALUE ? this.field6016 : this.field6009;
        } else {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field6011 : this.field6019;
        }
        if (this.field6015 != var5) {
            this.field6015 = var5;
            this.field6012.method2089(var5, 117);
            this.method3255(-23767);
            this.method1471(false);
            this.method456(30824);
            this.method1470(94);
            this.method1473(114);
            this.method1472(arg0 ^ 0xFFFFA8C5);
        }
        var4.method4657(false, 0.0F, field6017, (float) var3, -1.0F, 0.0F);
        var2.method3141(12, field6017);
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3257(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3258(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 109;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
