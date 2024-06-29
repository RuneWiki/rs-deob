import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class539 extends class129 {

    @OriginalMember(owner = "client!nga", name = "n", descriptor = "Lcda;")
    private class182 field7907;

    @OriginalMember(owner = "client!nga", name = "q", descriptor = "Lsd;")
    private class103 field7903;

    @OriginalMember(owner = "client!nga", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7905;

    @OriginalMember(owner = "client!nga", name = "p", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field7904;

    @OriginalMember(owner = "client!nga", name = "s", descriptor = "Z")
    private boolean field7908;

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7910 = new String[] { method4063(method4062("0\fDN!:\f_B=!=_F#%\u0007Vx$4\u0016WU\f3")), method4063(method4062("0\fDN!:\f_B=!=_F#%\u0007Vx$4\u0016WU\f#")), method4063(method4062("1\u001a")) };

    @OriginalMember(owner = "client!nga", name = "t", descriptor = "[F")
    private static float[] field7909 = new float[16];

    @OriginalMember(owner = "client!nga", name = "o", descriptor = "Z")
    private boolean field7906;

    @OriginalMember(owner = "client!nga", name = "<init>", descriptor = "(Lsd;Lla;Lcda;)V")
    public class539(class103 arg0, class476 arg1, class182 arg2) {
        super(arg0);
        this.field7907 = arg2;
        this.field7903 = arg0;
        if (arg1 != null && this.field1509.field4640 && this.field1509.field4592 && (this.field7903.field1152.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7905 = this.field7903.field1151.method3841(arg1.method3640((byte) 101, field7910[1], field7910[2]));
            this.field7904 = this.field7903.field1151.method3835(arg1.method3640((byte) 55, field7910[0], field7910[2]));
            this.field7908 = this.field7905 != null && this.field7904 != null && this.field7907.method1593(97);
        } else {
            this.field7904 = null;
            this.field7908 = false;
            this.field7905 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        if (arg1 >= -3) {
            this.method784(true, (byte) -23);
        }
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(B)V")
    public final void method791(byte arg0) {
        if (arg0 != -127 || !this.field7906) {
            return;
        }
        IDirect3DDevice var2 = this.field7903.field1151;
        class770 var3 = this.field7903.method2499(85);
        class770 var4 = this.field7903.method2497((byte) 110);
        var2.method3837(0, var4.method5567(field7909, arg0 + 137));
        var2.method3837(4, var3.method5572(4, field7909));
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public final void method789(byte arg0) {
        if (this.field7906) {
            IDirect3DDevice var2 = this.field7903.field1151;
            class770 var3 = this.field1509.method2431((byte) 40);
            var2.SetVertexShaderConstantF(12, var3.method5559(field7909, true), 2);
        }
        if (arg0 < 22) {
            this.field7904 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        if (arg1 != -34) {
            this.field7906 = true;
        }
    }

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "(I)V")
    public final void method782(int arg0) {
        if (arg0 != 1) {
            this.field7903 = null;
        }
        if (this.field7906) {
            IDirect3DDevice var2 = this.field7903.field1151;
            class770 var3 = this.field7903.method2497((byte) 113);
            var2.method3837(0, var3.method5567(field7909, 10));
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        if (arg0 != 1) {
            this.field7903 = null;
        }
        if (!this.field7906) {
            return;
        }
        this.field7903.method859(253, null);
        this.field7903.method880(null, 24631);
        this.field1509.method2453(1, 13);
        this.field1509.method2467(12, null);
        this.field1509.method2453(0, arg0 ^ 0xC);
        this.field1509.method2467(12, null);
        this.field7906 = false;
    }

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "(I)V")
    public final void method785(int arg0) {
        if (this.field7906) {
            IDirect3DDevice var2 = this.field7903.field1151;
            var2.method3837(8, this.field1509.method2475(field7909, -121));
        }
        if (arg0 >= -2) {
            this.field7903 = null;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        if (arg1 != 1) {
            this.method781(false, -115);
        }
        class380 var3 = this.field1509.method2465(true);
        if (!this.field7908 || var3 == null) {
            return;
        }
        IDirect3DDevice var4 = this.field7903.field1151;
        this.field7903.method859(arg1 ^ 0xFC, this.field7905);
        this.field7903.method880(this.field7904, 24631);
        this.field1509.method2453(1, arg1 ^ 0xC);
        this.field1509.method2467(arg1 ^ 0xD, var3);
        this.field1509.method2453(0, 13);
        this.field1509.method2467(arg1 + 11, this.field7907.field2523);
        this.field7906 = true;
        this.method791((byte) -127);
        this.method789((byte) 89);
        this.method785(-118);
        this.method787(1);
        var4.method3843(1, -this.field1509.field4577[0], -this.field1509.field4577[1], -this.field1509.field4577[2], 0.0F);
        var4.method3843(2, this.field1509.field4555, this.field1509.field4627, this.field1509.field4633, 1.0F);
        var4.method3843(3, Math.abs(this.field1509.field4577[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "(I)V")
    public final void method787(int arg0) {
        if (arg0 != 1) {
            this.field7908 = false;
        }
        if (!this.field7906) {
            return;
        }
        IDirect3DDevice var2 = this.field7903.field1151;
        if (this.field1509.field4608 <= 0) {
            var2.method3844(16, 0.0F, 0.0F, 0.0F, 0.0F);
        } else {
            float var3 = this.field1509.field4600;
            float var4 = this.field1509.field4605;
            var2.method3844(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        }
        var2.method3843(0, (float) (this.field1509.field4590 >> 16 & 0xFF) / 255.0F, (float) ((this.field1509.field4590 & 0xFFBE) >> 8) / 255.0F, (float) (this.field1509.field4590 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        if (arg0) {
            this.field7904 = null;
        }
        return this.field7908;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        int var4 = 43 / ((21 - arg2) / 56);
        if (!this.field7906) {
            return;
        }
        IDirect3DDevice var5 = this.field7903.field1151;
        int var6 = 0x1 << (arg1 & 0x3);
        float var7 = (float) (0x1 << (arg1 >> 3 & 0x7)) / 32.0F;
        int var8 = arg0 & 0xFFFF;
        var5.method3844(14, (float) (this.field1509.field4603 * var6 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var9 = (float) ((arg0 & 0x3A0FF) >> 16) / 8.0F;
        var5.method3844(15, var7, 0.0F, 0.0F, 0.0F);
        var5.method3843(4, (float) var8, 0.0F, 0.0F, 0.0F);
        var5.method3843(5, var9, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4062(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4063(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 85;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 39;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
