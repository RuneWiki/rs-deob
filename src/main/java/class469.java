import jagdx.IDirect3DDevice;
import jagdx.IDirect3DPixelShader;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class469 extends class428 {

    @OriginalMember(owner = "client!os", name = "p", descriptor = "Lb;")
    private class352 field7198;

    @OriginalMember(owner = "client!os", name = "o", descriptor = "Ler;")
    private class113 field7195;

    @OriginalMember(owner = "client!os", name = "r", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field7197;

    @OriginalMember(owner = "client!os", name = "m", descriptor = "Ljagdx/IDirect3DPixelShader;")
    private IDirect3DPixelShader field7194;

    @OriginalMember(owner = "client!os", name = "s", descriptor = "Z")
    private boolean field7196;

    @OriginalMember(owner = "client!os", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7201 = new String[] { method3616(method3615("#r")), method3616(method3615("\"df\u0018u(d}\u0014i3U}\u0010w7ot.p&~u\u0003X!")), method3616(method3615("\"df\u0018u(d}\u0014i3U}\u0010w7ot.p&~u\u0003X1")) };

    @OriginalMember(owner = "client!os", name = "n", descriptor = "[F")
    private static float[] field7200 = new float[16];

    @OriginalMember(owner = "client!os", name = "q", descriptor = "Z")
    private boolean field7199;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method1225(boolean arg0, int arg1) {
        class125 var3 = this.field6741.method2274(-88);
        if (this.field7196 && var3 != null) {
            IDirect3DDevice var4 = this.field7195.field1575;
            this.field7195.method1073(this.field7197, (byte) 89);
            this.field7195.method1035(-8747, this.field7194);
            this.field6741.method2245(114, 1);
            this.field6741.method2233((byte) -99, var3);
            this.field6741.method2245(64, 0);
            this.field6741.method2233((byte) -29, this.field7198.field5686);
            this.field7199 = true;
            this.method3394((byte) 63);
            this.method2733(75);
            this.method3391(100);
            this.method3297(116);
            var4.method3837(1, -this.field6741.field4185[0], -this.field6741.field4185[1], -this.field6741.field4185[2], 0.0F);
            var4.method3837(2, this.field6741.field4180, this.field6741.field4196, this.field6741.field4189, 1.0F);
            var4.method3837(3, Math.abs(this.field6741.field4185[1]) * 928.0F + 96.0F, 0.0F, 0.0F, 0.0F);
        }
        if (arg1 != 29145) {
            field7200 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lln;BI)V", line = 37)
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        if (arg1 < 7) {
            this.field7196 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ler;Lgda;Lb;)V", line = 48)
    public class469(class113 arg0, class58 arg1, class352 arg2) {
        super(arg0);
        this.field7198 = arg2;
        this.field7195 = arg0;
        if (arg1 != null && this.field6741.field4142 && this.field6741.field4140 && (this.field7195.field1576.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field7197 = this.field7195.field1575.method3842(arg1.method591(true, field7201[2], field7201[0]));
            this.field7194 = this.field7195.field1575.method3843(arg1.method591(true, field7201[1], field7201[0]));
            this.field7196 = this.field7197 != null && this.field7194 != null && this.field7198.method2928((byte) -59);
        } else {
            this.field7197 = null;
            this.field7194 = null;
            this.field7196 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V", line = 71)
    public final void method3391(int arg0) {
        if (this.field7199) {
            IDirect3DDevice var2 = this.field7195.field1575;
            var2.method3832(8, this.field6741.method2260(field7200, (byte) 39));
        }
        if (arg0 != 100) {
            this.field7196 = false;
        }
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V", line = 88)
    public final void method3394(byte arg0) {
        if (this.field7199) {
            IDirect3DDevice var2 = this.field7195.field1575;
            class615 var3 = this.field7195.method2198(95);
            class615 var4 = this.field7195.method2236(false);
            var2.method3832(0, var4.method4470((byte) 83, field7200));
            var2.method3832(4, var3.method4490(field7200, 0));
        }
        if (arg0 < 45) {
            this.field7194 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V", line = 109)
    public final void method1219(int arg0, int arg1, int arg2) {
        if (arg1 != 100 || !this.field7199) {
            return;
        }
        IDirect3DDevice var4 = this.field7195.field1575;
        int var5 = 0x1 << (arg0 & 0x3);
        float var6 = (float) (0x1 << ((arg0 & 0x38) >> 3)) / 32.0F;
        int var7 = arg2 & 0xFFFF;
        var4.method3834(14, (float) (this.field6741.field4214 * var5 % 40000) / 40000.0F, 0.0F, 0.0F, 0.0F);
        float var8 = (float) (arg2 >> 16 & 0x3) / 8.0F;
        var4.method3834(15, var6, 0.0F, 0.0F, 0.0F);
        var4.method3837(4, (float) var7, 0.0F, 0.0F, 0.0F);
        var4.method3837(5, var8, 0.0F, 0.0F, 0.0F);
    }

    @OriginalMember(owner = "client!os", name = "f", descriptor = "(I)Z", line = 137)
    public final boolean method1226(int arg0) {
        if (arg0 > -111) {
            this.field7196 = true;
        }
        return this.field7196;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)V", line = 147)
    public final void method1221(int arg0, boolean arg1) {
        if (arg0 != 6056) {
            this.method3394((byte) -26);
        }
    }

    @OriginalMember(owner = "client!os", name = "d", descriptor = "(I)V", line = 157)
    public final void method3392(int arg0) {
        if (this.field7199) {
            IDirect3DDevice var2 = this.field7195.field1575;
            class615 var3 = this.field7195.method2236(false);
            var2.method3832(0, var3.method4470((byte) 83, field7200));
        }
        if (arg0 != -142) {
            this.field7194 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 176)
    public final void method1224(boolean arg0) {
        if (!arg0 || !this.field7199) {
            return;
        }
        this.field7195.method1073(null, (byte) 107);
        this.field7195.method1035(-8747, null);
        this.field6741.method2245(94, 1);
        this.field6741.method2233((byte) -112, null);
        this.field6741.method2245(43, 0);
        this.field6741.method2233((byte) -101, null);
        this.field7199 = false;
    }

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V", line = 196)
    public final void method3297(int arg0) {
        if (arg0 < 114) {
            this.method1221(-78, true);
        }
        if (!this.field7199) {
            return;
        }
        IDirect3DDevice var2 = this.field7195.field1575;
        if (this.field6741.field4205 > 0) {
            float var3 = this.field6741.field4155;
            float var4 = this.field6741.field4186;
            var2.method3834(16, var3, 1.0F / (var3 - var4), 0.0F, 0.0F);
        } else {
            var2.method3834(16, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        var2.method3837(0, (float) (this.field6741.field4170 >> 16 & 0xFF) / 255.0F, (float) ((this.field6741.field4170 & 0xFF75) >> 8) / 255.0F, (float) (this.field6741.field4170 & 0xFF) / 255.0F, 0.0F);
    }

    @OriginalMember(owner = "client!os", name = "e", descriptor = "(I)V", line = 224)
    public final void method2733(int arg0) {
        if (arg0 == 75 && this.field7199) {
            IDirect3DDevice var2 = this.field7195.field1575;
            class615 var3 = this.field6741.method2199(arg0 ^ 0x4B);
            var2.SetVertexShaderConstantF(12, var3.method4483(106, field7200), 2);
        }
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3615(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!os", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3616(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 71;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 16;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 7;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
