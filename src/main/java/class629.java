import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexShader;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public class class629 extends class428 {

    @OriginalMember(owner = "client!kfa", name = "p", descriptor = "Ler;")
    private class113 field9050;

    @OriginalMember(owner = "client!kfa", name = "m", descriptor = "Lb;")
    private class352 field9049;

    @OriginalMember(owner = "client!kfa", name = "n", descriptor = "Ljagdx/IDirect3DVertexShader;")
    private IDirect3DVertexShader field9052;

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field9053 = new String[] { method4582(method4581("$u")), method4582(method4581("4\u007fsB\u00110l`I\f4ReM\u0016%\u007f")) };

    @OriginalMember(owner = "client!kfa", name = "o", descriptor = "[F")
    private static float[] field9051 = new float[16];

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
    public final void method3394(byte arg0) {
        if (this.field9052 != null) {
            IDirect3DDevice var2 = this.field9050.field1575;
            class615 var3 = this.field9050.method2236(false);
            var2.method3832(0, var3.method4470((byte) 83, field9051));
        }
        if (arg0 <= 45) {
            this.method3297(-43);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(ZI)V")
    public final void method1225(boolean arg0, int arg1) {
        this.field6741.method2262((byte) 78, class339.field5532, 0);
        this.field6741.method2262((byte) -78, class119.field1723, 1);
        this.field6741.method1067(false, class186.field2964, true, arg1 ^ 0xFFFF8E53, 2);
        this.field6741.method2211(false, 113);
        this.field9050.method1073(this.field9052, (byte) -127);
        this.method3392(-142);
        this.method2733(75);
        this.method3391(100);
        this.method3297(120);
        if (arg1 != 29145) {
            this.method1226(2);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(IZ)V")
    public final void method1221(int arg0, boolean arg1) {
        if (arg0 != 6056) {
            this.field9050 = null;
        }
        this.field6741.method2223(class440.field6863, class539.field7915, (byte) 115);
    }

    @OriginalMember(owner = "client!kfa", name = "f", descriptor = "(I)Z")
    public final boolean method1226(int arg0) {
        if (arg0 > -111) {
            this.method1225(false, 89);
        }
        return this.field9052 != null;
    }

    @OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Ler;Lgda;Lb;)V")
    public class629(class113 arg0, class58 arg1, class352 arg2) {
        super(arg0);
        this.field9050 = arg0;
        this.field9049 = arg2;
        if (arg1 != null && this.field9049.method2924(20) && (this.field9050.field1576.VertexShaderVersion & 0xFFFF) >= 257) {
            this.field9052 = this.field9050.field1575.method3842(arg1.method591(true, field9053[1], field9053[0]));
        } else {
            this.field9052 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "b", descriptor = "(I)V")
    public final void method3297(int arg0) {
        if (arg0 < 114) {
            this.field9049 = null;
        }
        if (this.field9052 == null) {
            return;
        }
        IDirect3DDevice var2 = this.field9050.field1575;
        if (this.field6741.field4205 > 0) {
            float var3 = this.field6741.field4155;
            float var4 = this.field6741.field4186;
            float var5 = var4 - 512.0F;
            var2.method3834(10, var5, 1.0F / (var4 - var5), var4, 1.0F / (var3 - var4));
        } else {
            var2.method3834(10, 0.0F, 0.0F, 0.0F, 0.0F);
        }
        this.field6741.method2204(3, this.field6741.field4170);
    }

    @OriginalMember(owner = "client!kfa", name = "e", descriptor = "(I)V")
    public final void method2733(int arg0) {
        if (this.field9052 != null) {
            IDirect3DDevice var2 = this.field9050.field1575;
            class615 var3 = this.field6741.method2199(0);
            var3.method4483(127, field9051);
            field9051[4] *= 0.25F;
            field9051[1] *= 0.25F;
            field9051[7] *= 0.25F;
            field9051[6] *= 0.25F;
            field9051[0] *= 0.25F;
            field9051[5] *= 0.25F;
            field9051[3] *= 0.25F;
            field9051[2] *= 0.25F;
            var2.SetVertexShaderConstantF(8, field9051, 2);
        }
        if (arg0 != 75) {
            this.field9052 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "d", descriptor = "(I)V")
    public final void method3392(int arg0) {
        if (arg0 == -142 && this.field9052 != null) {
            IDirect3DDevice var2 = this.field9050.field1575;
            class615 var3 = this.field9050.method2236(false);
            var2.method3832(0, var3.method4470((byte) 83, field9051));
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(I)V")
    public final void method3391(int arg0) {
        if (this.field9052 != null) {
            IDirect3DDevice var2 = this.field9050.field1575;
            var2.method3832(4, this.field6741.method2260(field9051, (byte) 65));
        }
        if (arg0 != 100) {
            field9051 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Z)V")
    public final void method1224(boolean arg0) {
        this.field9050.method1073(null, (byte) 6);
        this.field6741.method2262((byte) 111, class339.field5532, 0);
        this.field6741.method2262((byte) -110, class186.field2964, 1);
        this.field6741.method2262((byte) 93, class119.field1723, 2);
        this.field6741.method2211(arg0, 110);
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(Lln;BI)V")
    public final void method1222(class399 arg0, byte arg1, int arg2) {
        if (arg1 <= 7) {
            field9051 = null;
        }
    }

    @OriginalMember(owner = "client!kfa", name = "a", descriptor = "(III)V")
    public final void method1219(int arg0, int arg1, int arg2) {
        if (arg1 != 100) {
            this.method1226(-99);
        }
        IDirect3DDevice var4 = this.field9050.field1575;
        if (this.field9049.field5689) {
            float var5 = (float) (this.field6741.field4214 % 4000) / 4000.0F;
            this.field6741.method2233((byte) -104, this.field9049.field5687);
            var4.method3834(11, var5, 0.0F, 0.0F, 0.0F);
        } else {
            int var6 = this.field6741.field4214 % 4000 * 16 / 4000;
            this.field6741.method2233((byte) -37, this.field9049.field5681[var6]);
            var4.method3834(11, 0.0F, 0.0F, 0.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4581(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kfa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4582(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 64;
                    break;
                case 1:
                    var10005 = 13;
                    break;
                case 2:
                    var10005 = 18;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
