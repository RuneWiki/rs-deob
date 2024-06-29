import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class333 extends class129 {

    @OriginalMember(owner = "client!iw", name = "p", descriptor = "Z")
    private boolean field5214 = false;

    @OriginalMember(owner = "client!iw", name = "o", descriptor = "Lsd;")
    private class103 field5218;

    @OriginalMember(owner = "client!iw", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5219;

    @OriginalMember(owner = "client!iw", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5211;

    @OriginalMember(owner = "client!iw", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5213;

    @OriginalMember(owner = "client!iw", name = "u", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5216;

    @OriginalMember(owner = "client!iw", name = "x", descriptor = "Z")
    private boolean field5209;

    @OriginalMember(owner = "client!iw", name = "r", descriptor = "Lwp;")
    private class191 field5217;

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5220 = new String[] { method2799(method2798("KLO\r\u0007Z^|?\u001dPWy\u0014")), method2799(method2798("KLO\r\u0007Z^|?\u0004WO")), method2799(method2798("ZC")), method2799(method2798("KLO\u0007\u001aQN~\u00047KU|\t\u001c")), method2799(method2798("KLO\u0007\u001aQN~\u00047RRd")) };

    @OriginalMember(owner = "client!iw", name = "n", descriptor = "[F")
    private static float[] field5210 = new float[16];

    @OriginalMember(owner = "client!iw", name = "s", descriptor = "[F")
    private static float[] field5215 = new float[4];

    @OriginalMember(owner = "client!iw", name = "v", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field5208;

    @OriginalMember(owner = "client!iw", name = "y", descriptor = "Z")
    private boolean field5212;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IILrca;)V")
    public final void method788(int arg0, int arg1, class479 arg2) {
        if (arg2 != null) {
            if (this.field5214) {
                this.field1509.method2498(0, class48.field546, (byte) -76);
                this.field1509.method2443(0, class48.field546, false);
                this.field5214 = false;
            }
            this.field1509.method2467(12, arg2);
            this.field1509.method2433(-16075, arg0);
        } else if (!this.field5214) {
            this.field1509.method2467(12, this.field1509.field4553);
            this.field1509.method2433(-16075, 1);
            this.field1509.method2498(0, class185.field2557, (byte) 112);
            this.field1509.method2443(0, class185.field2557, false);
            this.field5214 = true;
        }
        if (arg1 > -3) {
            this.method781(false, 11);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Z")
    public final boolean method790(boolean arg0) {
        if (arg0) {
            this.method2797(-10);
        }
        return this.field5209;
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
    public final void method787(int arg0) {
        if (this.field5208 != null) {
            IDirect3DDevice var2 = this.field5218.field1151;
            int var3 = this.field1509.method558();
            int var4 = this.field1509.method583();
            float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
            float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
            var2.method3844(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
            var2.method3844(11, 1.0F / (float) this.field1509.method2452(true), (float) this.field1509.method2428((byte) 110) / 255.0F, this.field1509.field4600, 1.0F / (this.field1509.field4600 - this.field1509.field4605));
            this.field1509.method2462(this.field1509.method2451((byte) -62), arg0 ^ 0xFFFFFFFE);
        }
        if (arg0 != 1) {
            this.method782(-60);
        }
    }

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "(I)V")
    public final void method782(int arg0) {
        if (arg0 != 1) {
            this.field5208 = null;
        }
        if (this.field5208 != null) {
            IDirect3DDevice var2 = this.field5218.field1151;
            class770 var3 = this.field5218.method2497((byte) -45);
            var2.method3837(0, var3.method5567(field5210, 10));
        }
    }

    @OriginalMember(owner = "client!iw", name = "f", descriptor = "(I)V")
    private final void method2797(int arg0) {
        if (this.field5208 != null && this.field5212) {
            class770 var2 = this.field1509.method2466((byte) -121);
            IDirect3DDevice var3 = this.field5218.field1151;
            var3.method3844(13, this.field1509.field4601 * this.field1509.field4555, this.field1509.field4627 * this.field1509.field4601, this.field1509.field4633 * this.field1509.field4601, 1.0F);
            var3.method3844(14, this.field1509.field4611 * this.field1509.field4555, this.field1509.field4627 * this.field1509.field4611, this.field1509.field4633 * this.field1509.field4611, 1.0F);
            var3.method3844(16, this.field1509.field4559 * this.field1509.field4555, this.field1509.field4627 * this.field1509.field4559, this.field1509.field4633 * this.field1509.field4559, 1.0F);
            var2.method5573(field5215, this.field1509.field4577[0], this.field1509.field4577[1], -107, this.field1509.field4577[2]);
            var3.SetVertexShaderConstantF(15, field5215, 1);
            var2.method5573(field5215, this.field1509.field4598[0], this.field1509.field4598[1], -19, this.field1509.field4598[2]);
            var3.SetVertexShaderConstantF(17, field5215, 1);
        }
        int var4 = 0 / ((arg0 + 39) / 42);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public final void method783(int arg0) {
        this.field1509.method2453(arg0, arg0 + 12);
        this.field1509.method2467(12, null);
        this.field1509.method2417(-60, class684.field9909, class684.field9909);
        this.field1509.method2498(0, class48.field546, (byte) 110);
        this.field1509.method2498(2, class114.field1352, (byte) 39);
        this.field1509.method2443(0, class48.field546, false);
        this.field1509.method2453(0, 13);
        if (this.field5214) {
            this.field1509.method2498(0, class48.field546, (byte) -122);
            this.field1509.method2443(0, class48.field546, false);
            this.field5214 = false;
        }
        if (this.field5208 != null) {
            this.field5218.method859(arg0 ^ 0xFC, null);
            this.field5208 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(B)V")
    public final void method1124(byte arg0) {
        if (arg0 != -44) {
            this.method791((byte) 13);
        }
        IDirect3DDevice var2 = this.field5218.field1151;
        int var3 = this.field1509.method2427(8);
        class770 var4 = this.field1509.method2499(121);
        IDirect3DVertexShader var5;
        if (this.field5212) {
            var5 = var3 == Integer.MAX_VALUE ? this.field5211 : this.field5216;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field5219 : this.field5213;
        }
        if (this.field5208 != var5) {
            this.field5208 = var5;
            this.field5218.method859(253, var5);
            this.method2797(-122);
            this.method785(-79);
            this.method789((byte) 99);
            this.method782(1);
            this.method791((byte) -127);
            this.method787(1);
        }
        var4.method5564(field5215, 0.0F, 0.0F, 9274, (float) var3, -1.0F);
        var2.method3837(12, field5215);
    }

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "(B)V")
    public final void method791(byte arg0) {
        if (this.field5208 != null) {
            IDirect3DDevice var2 = this.field5218.field1151;
            class770 var3 = this.field5218.method2497((byte) -94);
            var2.method3837(0, var3.method5567(field5210, 10));
        }
        if (arg0 != -127) {
            this.method787(33);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZB)V")
    public final void method784(boolean arg0, byte arg1) {
        if (arg1 != -34) {
            field5215 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)V")
    public final void method786(int arg0, int arg1, byte arg2) {
        int var4 = 26 / ((arg2 - 21) / 56);
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)V")
    public final void method789(byte arg0) {
        if (arg0 < 22) {
            this.field5217 = null;
        }
        if (this.field5208 != null) {
            IDirect3DDevice var2 = this.field5218.field1151;
            class770 var3 = this.field1509.method2431((byte) -77);
            var2.SetVertexShaderConstantF(8, var3.method5559(field5210, true), 2);
        }
    }

    @OriginalMember(owner = "client!iw", name = "<init>", descriptor = "(Lsd;Lla;)V")
    public class333(class103 arg0, class476 arg1) {
        super(arg0);
        this.field5218 = arg0;
        if (arg1 == null || (this.field5218.field1152.VertexShaderVersion & 0xFFFF) < 257) {
            this.field5209 = false;
        } else {
            this.field5219 = this.field5218.field1151.method3841(arg1.method3640((byte) -111, field5220[3], field5220[2]));
            this.field5211 = this.field5218.field1151.method3841(arg1.method3640((byte) -119, field5220[4], field5220[2]));
            this.field5213 = this.field5218.field1151.method3841(arg1.method3640((byte) 64, field5220[0], field5220[2]));
            this.field5216 = this.field5218.field1151.method3841(arg1.method3640((byte) -26, field5220[1], field5220[2]));
            if ((this.field5213 != null & this.field5211 != null & this.field5219 != null & this.field5216 != null)) {
                this.field5217 = this.field1509.method2447(new int[] { 0, -1 }, 2, 1, false, 26236);
                this.field5217.method751(false, 43, false);
                this.field5209 = true;
            } else {
                this.field5209 = false;
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "(I)V")
    public final void method785(int arg0) {
        if (arg0 > -2) {
            this.field5208 = null;
        }
        if (this.field5208 != null) {
            IDirect3DDevice var2 = this.field5218.field1151;
            var2.method3837(4, this.field1509.method2475(field5210, -127));
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZI)V")
    public final void method781(boolean arg0, int arg1) {
        this.field5212 = arg0;
        this.field1509.method2453(arg1, 13);
        this.field1509.method2467(arg1 ^ 0xD, this.field5217);
        this.field1509.method2417(-81, class206.field3175, class134.field1562);
        this.field1509.method2498(0, class114.field1352, (byte) -77);
        this.field1509.method889(false, 2, true, 109, class48.field546);
        this.field1509.method2443(0, class185.field2557, false);
        this.field1509.method2453(0, 13);
        this.method1124((byte) -44);
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2798(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!iw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2799(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 62;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 96;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
