import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class92 extends class129 {

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Lcda;")
    private class182 field1050;

    @OriginalMember(owner = "client!rf", name = "p", descriptor = "Lsd;")
    private class103 field1047;

    @OriginalMember(owner = "client!rf", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field1049;

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1051 = new String[] { method793(method792(")\u0016")), method793(method792("9\u001cwV\u0010=\u000fd]\r91aY\u0017(\u001c")) };

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "[F")
    private static float[] field1048 = new float[16];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        this.field1509.method2498(0, class48.field546, (byte) 91);
        this.field1509.method2498(arg1, class114.field1352, (byte) 101);
        this.field1509.method889(true, 2, false, arg1 + 101, class335.field5233);
        this.field1509.method2419(false, false);
        this.field1047.method859(253, this.field1049);
        this.method782(1);
        this.method789((byte) 33);
        this.method785(-48);
        this.method787(1);
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
    public final void method782(int arg0) {
        if (arg0 == 1 && this.field1049 != null) {
            IDirect3DDevice var2 = this.field1047.field1151;
            class770 var3 = this.field1047.method2497((byte) -79);
            var2.method3837(0, var3.method5567(field1048, 10));
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        this.field1047.method859(253, null);
        this.field1509.method2498(0, class48.field546, (byte) -111);
        this.field1509.method2498(arg0, class335.field5233, (byte) -109);
        this.field1509.method2498(2, class114.field1352, (byte) -126);
        this.field1509.method2419(false, true);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        if (arg1 != -34) {
            field1048 = null;
        }
        this.field1509.method2417(-125, class362.field5530, class134.field1562);
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lsd;Lla;Lcda;)V")
    public class92(class103 arg0, class476 arg1, class182 arg2) {
        super(arg0);
        this.field1050 = arg2;
        this.field1047 = arg0;
        if (arg1 != null && this.field1050.method1594(-120) && (this.field1047.field1152.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field1049 = this.field1047.field1151.method3841(arg1.method3640((byte) 78, field1051[1], field1051[0]));
        } else {
            this.field1049 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public final void method785(int arg0) {
        if (arg0 > -2) {
            this.field1047 = null;
        }
        if (this.field1049 != null) {
            IDirect3DDevice var2 = this.field1047.field1151;
            var2.method3837(4, this.field1509.method2475(field1048, -116));
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        int var4 = -31 / ((arg2 - 21) / 56);
        IDirect3DDevice var5 = this.field1047.field1151;
        if (this.field1050.field2518) {
            float var6 = (float) (this.field1509.field4603 % 4000) / 4000.0F;
            this.field1509.method2467(12, this.field1050.field2516);
            var5.method3844(11, var6, 0.0F, 0.0F, 0.0F);
        } else {
            int var7 = this.field1509.field4603 % 4000 * 16 / 4000;
            this.field1509.method2467(12, this.field1050.field2520[var7]);
            var5.method3844(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
    public final void method787(int arg0) {
        if (this.field1049 != null) {
            IDirect3DDevice var2 = this.field1047.field1151;
            if (this.field1509.field4608 > 0) {
                float var3 = this.field1509.field4600;
                float var4 = this.field1509.field4605;
                float var5 = var4 - 512.0F;
                var2.method3844(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
            } else {
                var2.method3844(10, 0.0F, 0.0F, 0.0F, 0.0F);
            }
            this.field1509.method2462(this.field1509.field4590, arg0 ^ 0xFFFFFFFE);
        }
        if (arg0 != 1) {
            this.method783(123);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        if (arg1 > -3) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public final void method789(byte arg0) {
        if (this.field1049 != null) {
            IDirect3DDevice var2 = this.field1047.field1151;
            class770 var3 = this.field1509.method2431((byte) -105);
            var3.method5559(field1048, true);
            field1048[1] *= 0.25F;
            field1048[7] *= 0.25F;
            field1048[2] *= 0.25F;
            field1048[5] *= 0.25F;
            field1048[3] *= 0.25F;
            field1048[4] *= 0.25F;
            field1048[6] *= 0.25F;
            field1048[0] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field1048, 2);
        }
        if (arg0 <= 22) {
            field1048 = null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        if (arg0) {
            this.field1050 = null;
        }
        return this.field1049 != null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public final void method791(byte arg0) {
        if (arg0 == -127 && this.field1049 != null) {
            IDirect3DDevice var2 = this.field1047.field1151;
            class770 var3 = this.field1047.method2497((byte) -57);
            var2.method3837(0, var3.method5567(field1048, 10));
        }
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method792(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x63);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method793(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 77;
                    break;
                case 1:
                    var10005 = 110;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 56;
                    break;
                default:
                    var10005 = 99;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
