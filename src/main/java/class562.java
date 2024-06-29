import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class562 extends class428 {

    @OriginalMember(owner = "client!pga", name = "x", descriptor = "Z")
    private boolean field8167 = false;

    @OriginalMember(owner = "client!pga", name = "r", descriptor = "Ler;")
    private class113 field8164;

    @OriginalMember(owner = "client!pga", name = "s", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8161;

    @OriginalMember(owner = "client!pga", name = "o", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8172;

    @OriginalMember(owner = "client!pga", name = "w", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8169;

    @OriginalMember(owner = "client!pga", name = "t", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8171;

    @OriginalMember(owner = "client!pga", name = "v", descriptor = "Z")
    private boolean field8168;

    @OriginalMember(owner = "client!pga", name = "p", descriptor = "Lah;")
    private class406 field8163;

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8173 = new String[] { method4130(method4129("121}0+0\u0000~\u001d(,\u001a")), method4130(method4129("121w-  \u0002E.-1")), method4130(method4129("121w-  \u0002E7*)\u0007n")), method4130(method4129(" =")), method4130(method4129("121}0+0\u0000~\u001d1+\u0002s6")) };

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "[F")
    private static float[] field8162 = new float[4];

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "[F")
    private static float[] field8165 = new float[16];

    @OriginalMember(owner = "client!pga", name = "q", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field8170;

    @OriginalMember(owner = "client!pga", name = "u", descriptor = "Z")
    private boolean field8166;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)V", line = 7)
    public final void method3296(byte arg0) {
        IDirect3DDevice var2 = this.field8164.field1575;
        if (arg0 != -26) {
            this.field8161 = null;
        }
        int var3 = this.field6741.method2249(arg0 + 26);
        class615 var4 = this.field6741.method2198(67);
        IDirect3DVertexShader var5;
        if (this.field8166) {
            var5 = ~var3 == Integer.MIN_VALUE ? this.field8172 : this.field8171;
        } else {
            var5 = var3 == Integer.MAX_VALUE ? this.field8161 : this.field8169;
        }
        if (this.field8170 != var5) {
            this.field8170 = var5;
            this.field8164.method1073(var5, (byte) -128);
            this.method4128(false);
            this.method3391(100);
            this.method2733(75);
            this.method3392(-142);
            this.method3394((byte) 56);
            this.method3297(120);
        }
        var4.method4487(0.0F, (float) var3, 0, -1.0F, 0.0F, field8162);
        var2.method3832(12, field8162);
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IZ)V", line = 46)
    public final void method1221(int arg0, boolean arg1) {
        if (arg0 != 6056) {
            this.method3296((byte) 75);
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)V", line = 56)
    public final void method3394(byte arg0) {
        if (arg0 <= 45) {
            this.method1224(false);
        }
        if (this.field8170 != null) {
            IDirect3DDevice var2 = this.field8164.field1575;
            class615 var3 = this.field8164.method2236(false);
            var2.method3832(0, var3.method4470((byte) 83, field8165));
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)V", line = 75)
    public final void method3391(int arg0) {
        if (arg0 == 100 && this.field8170 != null) {
            IDirect3DDevice var2 = this.field8164.field1575;
            var2.method3832(4, this.field6741.method2260(field8165, (byte) 68));
        }
    }

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "(I)Z", line = 92)
    public final boolean method1226(int arg0) {
        return arg0 > -111 ? true : this.field8168;
    }

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "(I)V", line = 105)
    public final void method2733(int arg0) {
        if (arg0 != 75) {
            this.method1221(49, false);
        }
        if (this.field8170 != null) {
            IDirect3DDevice var2 = this.field8164.field1575;
            class615 var3 = this.field6741.method2199(0);
            var2.SetVertexShaderConstantF(8, var3.method4483(89, field8165), 2);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(III)V", line = 125)
    public final void method1219(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            this.method3391(101);
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ZI)V", line = 135)
    public final void method1225(boolean arg0, int arg1) {
        this.field8166 = arg0;
        this.field6741.method2245(106, 1);
        this.field6741.method2233((byte) -48, this.field8163);
        this.field6741.method2223(class434.field6809, class539.field7915, (byte) 114);
        this.field6741.method2262((byte) -92, class119.field1723, 0);
        this.field6741.method1067(true, class339.field5532, false, -118, 2);
        this.field6741.method2248((byte) -109, class612.field8798, 0);
        this.field6741.method2245(78, 0);
        this.method3296((byte) -26);
        if (arg1 != 29145) {
            this.field8171 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "(I)V", line = 153)
    public final void method3392(int arg0) {
        if (arg0 != -142) {
            this.method1219(87, 31, 58);
        }
        if (this.field8170 != null) {
            IDirect3DDevice var2 = this.field8164.field1575;
            class615 var3 = this.field8164.method2236(false);
            var2.method3832(0, var3.method4470((byte) 83, field8165));
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Ler;Lgda;)V", line = 175)
    public class562(class113 arg0, class58 arg1) {
        super(arg0);
        this.field8164 = arg0;
        if (arg1 == null || (this.field8164.field1576.VertexShaderVersion & 0xFFFF) < 257) {
            this.field8168 = false;
        } else {
            this.field8161 = this.field8164.field1575.method3842(arg1.method591(true, field8173[4], field8173[3]));
            this.field8172 = this.field8164.field1575.method3842(arg1.method591(true, field8173[0], field8173[3]));
            this.field8169 = this.field8164.field1575.method3842(arg1.method591(true, field8173[2], field8173[3]));
            this.field8171 = this.field8164.field1575.method3842(arg1.method591(true, field8173[1], field8173[3]));
            if ((this.field8169 != null & this.field8161 != null & this.field8172 != null & this.field8171 != null)) {
                this.field8163 = this.field6741.method2206(1826, false, 2, new int[] { 0, -1 }, 1);
                this.field8163.method3166(false, 8095, false);
                this.field8168 = true;
            } else {
                this.field8168 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Lln;BI)V", line = 207)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        if (arg0 != null) {
            if (this.field8167) {
                this.field6741.method2262((byte) -107, class339.field5532, 0);
                this.field6741.method2248((byte) -109, class339.field5532, 0);
                this.field8167 = false;
            }
            this.field6741.method2233((byte) -59, arg0);
            this.field6741.method2258(arg2, (byte) -107);
        } else if (!this.field8167) {
            this.field6741.method2233((byte) -91, this.field6741.field4149);
            this.field6741.method2258(1, (byte) -123);
            this.field6741.method2262((byte) -73, class612.field8798, 0);
            this.field6741.method2248((byte) -109, class612.field8798, 0);
            this.field8167 = true;
        }
        if (arg1 <= 7) {
            this.field8167 = true;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V", line = 242)
    public final void method3297(int arg0) {
        if (arg0 < 114) {
            this.field8172 = null;
        }
        if (this.field8170 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field8164.field1575;
        int var3 = this.field6741.method193();
        int var4 = this.field6741.method155();
        float var5 = (float) var3 - ((float) (var3 - var4) * 0.125F);
        float var6 = (float) var3 - (float) (var3 - var4) * 0.25F;
        var2.method3834(10, var6, 1.0F / (var5 - var6), var5, 1.0F / ((float) var3 - var5));
        var2.method3834(11, 1.0F / (float) this.field6741.method2261(0), (float) this.field6741.method2210(-32377) / 255.0F, this.field6741.field4155, 1.0F / (this.field6741.field4155 - this.field6741.field4186));
        this.field6741.method2204(3, this.field6741.method2228(32647));
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)V", line = 271)
    public final void method1224(boolean arg0) {
        this.field6741.method2245(71, 1);
        this.field6741.method2233((byte) -102, null);
        this.field6741.method2223(class734.field10762, class734.field10762, (byte) 123);
        this.field6741.method2262((byte) 79, class339.field5532, 0);
        this.field6741.method2262((byte) -81, class119.field1723, 2);
        this.field6741.method2248((byte) -109, class339.field5532, 0);
        this.field6741.method2245(65, 0);
        if (this.field8167) {
            this.field6741.method2262((byte) -50, class339.field5532, 0);
            this.field6741.method2248((byte) -109, class339.field5532, 0);
            this.field8167 = false;
        }
        if (!arg0) {
            field8162 = null;
        }
        if (this.field8170 != null) {
            this.field8164.method1073(null, (byte) -118);
            this.field8170 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V", line = 301)
    private final void method4128(boolean arg0) {
        if (arg0) {
            this.method1226(36);
        }
        if (this.field8170 == null || !this.field8166) {
            return;
        }
        class615 var2 = this.field6741.method2247(10717);
        IDirect3DDevice var3 = this.field8164.field1575;
        var3.method3834(13, this.field6741.field4192 * this.field6741.field4180, this.field6741.field4196 * this.field6741.field4192, this.field6741.field4192 * this.field6741.field4189, 1.0F);
        var3.method3834(14, this.field6741.field4180 * this.field6741.field4139, this.field6741.field4196 * this.field6741.field4139, this.field6741.field4189 * this.field6741.field4139, 1.0F);
        var3.method3834(16, this.field6741.field4180 * this.field6741.field4163, this.field6741.field4196 * this.field6741.field4163, this.field6741.field4189 * this.field6741.field4163, 1.0F);
        var2.method4494(field8162, this.field6741.field4185[1], -19487, this.field6741.field4185[0], this.field6741.field4185[2]);
        var3.SetVertexShaderConstantF(15, field8162, 1);
        var2.method4494(field8162, this.field6741.field4169[1], -19487, this.field6741.field4169[0], this.field6741.field4169[2]);
        var3.SetVertexShaderConstantF(17, field8162, 1);
    }

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4129(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x42);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!pga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4130(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 68;
                    break;
                case 1:
                    var10005 = 69;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 66;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
