import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class487 extends class687 implements class377 {

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "I")
    private int field7141 = -1;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    private int field7147 = -1;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "Lml;")
    private class194 field7142;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    public int field7149;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public int field7145;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    private int field7143;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "I")
    private int field7148;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    private int field7135;

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field7154 = new String[] { method3755(method3754("\u0012]\u000b}j\u0016HIry\u001d\u0001")), method3755(method3754("\u0003\u0007\u000b5~")), method3755(method3754("\u0012]\u000b_+")), method3755(method3754("\u0016\\Iw")), method3755(method3754("\u0012]\u000b^+")), method3755(method3754("\u0012]\u000bZ+")), method3755(method3754("\u0012]\u000b'j\u0016@Q%+")), method3755(method3754("\u0012]\u000bX+")), method3755(method3754("\u0012]\u000bY+")) };

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "[I")
    public static int[] field7144 = new int[4];

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "Lsb;")
    public static class261 field7137 = new class261(92, 0);

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "[I")
    public static int[] field7150 = new int[16384];

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "[I")
    public static int[] field7151 = new int[16384];

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "Lsb;")
    public static class261 field7152;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field7146;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V")
    public final void method992(int arg0) {
        try {
            OpenGL.glFramebufferRenderbufferEXT(this.field7141, this.field7147, 36161, 0);
            field7140++;
            this.field7141 = arg0;
            this.field7147 = -1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7154[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.method3751(-28648);
            field7136++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7154[0] + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method3750(String arg0, byte arg1) {
        try {
            field7146++;
            String var2 = class98.method966(class237.method1961(-16515, arg0), 5);
            if (var2 == null) {
                var2 = "";
            }
            return arg1 > -16 ? null : var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7154[2] + (arg0 == null ? field7154[3] : field7154[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V")
    public final void method3751(int arg0) {
        try {
            if (this.field7148 > 0) {
                this.field7142.method1630((byte) -5, this.field7135, this.field7148);
                this.field7148 = 0;
            }
            if (arg0 != -28648) {
                field7137 = null;
            }
            field7139++;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7154[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Z)V")
    public static void method3752(boolean arg0) {
        try {
            field7152 = null;
            field7150 = null;
            field7151 = null;
            if (!arg0) {
                field7144 = null;
            }
            field7137 = null;
            field7144 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7154[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lml;III)V")
    public class487(class194 arg0, int arg1, int arg2, int arg3) {
        try {
            this.field7142 = arg0;
            this.field7149 = arg2;
            this.field7145 = arg3;
            this.field7143 = arg1;
            OpenGL.glGenRenderbuffersEXT(1, class431.field6253, 0);
            this.field7148 = class431.field6253[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field7148);
            OpenGL.glRenderbufferStorageEXT(36161, this.field7143, this.field7149, this.field7145);
            this.field7135 = this.field7149 * this.field7145 * this.field7142.method1661((byte) -68, this.field7143);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7154[6] + (arg0 == null ? field7154[3] : field7154[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZ)V")
    public final void method3753(int arg0, int arg1, boolean arg2) {
        try {
            field7138++;
            if (arg2) {
                OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field7148);
                this.field7147 = arg1;
                this.field7141 = arg0;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7154[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(Lml;IIII)V")
    public class487(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            this.field7142 = arg0;
            this.field7145 = arg3;
            this.field7143 = arg1;
            this.field7149 = arg2;
            OpenGL.glGenRenderbuffersEXT(1, class431.field6253, 0);
            this.field7148 = class431.field6253[0];
            OpenGL.glBindRenderbufferEXT(36161, this.field7148);
            OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7143, this.field7149, this.field7145);
            this.field7135 = this.field7149 * this.field7145 * this.field7142.method1661((byte) -68, this.field7143);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field7154[6] + (arg0 == null ? field7154[3] : field7154[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7151[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field7150[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field7152 = new class261(60, -2);
        field7153 = -1;
    }

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3754(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3755(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 120;
                    break;
                case 1:
                    var10005 = 41;
                    break;
                case 2:
                    var10005 = 37;
                    break;
                case 3:
                    var10005 = 27;
                    break;
                default:
                    var10005 = 3;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
