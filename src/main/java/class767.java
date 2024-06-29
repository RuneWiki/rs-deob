import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class767 {

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    private int field10957;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    private int field10950;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Z")
    private boolean field10962;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "Lml;")
    public class194 field10956;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field10960;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10963 = new String[] { method5544(method5543("\r=vl\"\u001464c1\u001f\u007f")), method5544(method5543("\r=v6\"\u0014>,4c")), method5544(method5543("\u0001yv$6")), method5544(method5543("\u0014\"4f")), method5544(method5543("\r=vAc")), method5544(method5543("\r=vCc")), method5544(method5543("U6e")), method5544(method5543("\r /'<\u000e&9")), method5544(method5543("\r /'<\u000e%;")), method5544(method5543("U'e")), method5544(method5543("\r /'<\u000e 1z")), method5544(method5543("\r /")), method5544(method5543("\r=v@c")), method5544(method5543("T47gd\u0016j")), method5544(method5543("\u0012#,zqUx")) };

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lsb;")
    public static class261 field10959 = new class261(22, -1);

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public static int field10951;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field10952;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "I")
    public static int field10954;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field10955;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field10958;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field10961;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "Llga;")
    public static class47 field10953;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "Z")
    public static boolean field10949;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IZ[B)V", line = 5)
    public final void method5540(int arg0, boolean arg1, byte[] arg2) {
        try {
            field10952++;
            if (!arg1) {
                this.field10950 = -50;
            }
            this.method3447(0);
            if (this.field10950 >= arg0) {
                OpenGL.glBufferSubDataARBub(this.field10957, 0, arg0, arg2, 0);
            } else {
                OpenGL.glBufferDataARBub(this.field10957, arg0, arg2, 0, this.field10962 ? 35040 : 35044);
                this.field10956.field2776 += arg0 - this.field10950;
                this.field10950 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field10963[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10963[3] : field10963[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 29)
    public static void method5541(int arg0) {
        try {
            field10953 = null;
            if (arg0 > 56) {
                field10959 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10963[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        try {
            field10951++;
            this.field10956.method1681(this.field10960, -115, this.field10950);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10963[0] + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(B)Ljava/lang/String;", line = 54)
    public static final String method5542(byte arg0) {
        try {
            if (arg0 != 118) {
                method5541(91);
            }
            field10958++;
            String var1 = field10963[11];
            if (class35.field426 == class226.field3284) {
                var1 = field10963[8];
            } else if (class447.field6570 == class35.field426) {
                var1 = field10963[7];
            } else if (class46.field648 == class35.field426) {
                var1 = field10963[10];
            }
            String var2 = "";
            if (class269.field3808 != null) {
                var2 = field10963[9] + class269.field3808;
            }
            return field10963[14] + var1 + "." + class544.field7978.field11574 + field10963[13] + class405.field5883 + field10963[6] + class713.field10069 + var2 + "/";
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10963[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lml;I[BIZ)V", line = 96)
    public class767(class194 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        try {
            this.field10957 = arg1;
            this.field10950 = arg3;
            this.field10962 = arg4;
            this.field10956 = arg0;
            OpenGL.glGenBuffersARB(1, class9.field115, 0);
            this.field10960 = class9.field115[0];
            this.method3447(0);
            OpenGL.glBufferDataARBub(arg1, this.field10950, arg2, 0, this.field10962 ? 35040 : 35044);
            this.field10956.field2776 += this.field10950;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10963[1] + (arg0 == null ? field10963[3] : field10963[2]) + ',' + arg1 + ',' + (arg2 == null ? field10963[3] : field10963[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "(Lml;ILjaclib/memory/Buffer;IZ)V", line = 115)
    public class767(class194 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        try {
            this.field10962 = arg4;
            this.field10957 = arg1;
            this.field10956 = arg0;
            this.field10950 = arg3;
            OpenGL.glGenBuffersARB(1, class9.field115, 0);
            this.field10960 = class9.field115[0];
            this.method3447(0);
            OpenGL.glBufferDataARBa(arg1, this.field10950, arg2.getAddress(), this.field10962 ? 35040 : 35044);
            this.field10956.field2776 += this.field10950;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field10963[1] + (arg0 == null ? field10963[3] : field10963[2]) + ',' + arg1 + ',' + (arg2 == null ? field10963[3] : field10963[2]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)V")
    public abstract void method3447(int arg0);

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5543(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5544(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 87;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 10;
                    break;
                default:
                    var10005 = 75;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
