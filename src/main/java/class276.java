import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class276 extends class122 {

    @OriginalMember(owner = "client!oca", name = "r", descriptor = "I")
    private int field4162;

    @OriginalMember(owner = "client!oca", name = "m", descriptor = "I")
    private int field4164;

    @OriginalMember(owner = "client!oca", name = "n", descriptor = "I")
    private int field4165;

    @OriginalMember(owner = "client!oca", name = "t", descriptor = "I")
    private int field4159;

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4169 = new String[] { method2278(method2277("k\u001b-bh,")), method2278(method2277("k\u001b-bm,")), method2278(method2277("k\u001b-b\u0010m\u0016%8\u0012,")), method2278(method2277("k\u001b-bi,")), method2278(method2277("k\u001b-bo,")) };

    @OriginalMember(owner = "client!oca", name = "q", descriptor = "Z")
    public static boolean field4163 = false;

    @OriginalMember(owner = "client!oca", name = "s", descriptor = "Lel;")
    public static class573 field4167 = new class573(73, 6);

    @OriginalMember(owner = "client!oca", name = "o", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!oca", name = "u", descriptor = "I")
    public static int field4161;

    @OriginalMember(owner = "client!oca", name = "p", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "Lfb;")
    public static class702 field4168;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V")
    public static void method2276(byte arg0) {
        try {
            field4167 = null;
            if (arg0 != 70) {
                field4163 = false;
            }
            field4168 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4169[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(III)V")
    public final void method1062(int arg0, int arg1, int arg2) {
        try {
            if (arg0 >= 0) {
                ++field4160;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4169[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IIIIII)V")
    public class276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        try {
            this.field4162 = arg0;
            this.field4164 = arg2;
            this.field4165 = arg3;
            this.field4159 = arg1;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4169[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZII)V")
    public final void method1061(boolean arg0, int arg1, int arg2) {
        try {
            if (!arg0) {
                ++field4161;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field4169[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IIB)V")
    public final void method1056(int arg0, int arg1, byte arg2) {
        try {
            ++field4166;
            int var4 = this.field4162 * arg1 >> 12;
            int var5 = this.field4164 * arg1 >> 12;
            int var6 = this.field4159 * arg0 >> 12;
            int var7 = this.field4165 * arg0 >> 12;
            class316.method2658(super.field1434, var4, var5, -1767209748, var6, var7);
            if (arg2 < 59) {
                this.field4164 = -45;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field4169[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2277(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 44);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2278(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 120;
                    break;
                case 2:
                    var10005 = 76;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 44;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
