import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class725 {

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public int field10471 = 1;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10478 = new String[] { method5287(method5286("73s C")), method5287(method5286("=71\u000e")), method5287(method5286("(lsL\u0016")), method5287(method5286("73s'C")), method5287(method5286("73s&C")), method5287(method5286("=&<")), method5287(method5286("73s!C")), method5287(method5286("73s#C")) };

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "D")
    public static double field10475 = -1.0D;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "C")
    public char field10476;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field10468;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field10474;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "Lsg;")
    public static class417 field10470;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/lang/Class;")
    public static Class field10477;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field10472;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5285(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method5280(byte arg0, int arg1) {
        try {
            if (arg0 != -92) {
                field10470 = null;
            }
            field10474++;
            return arg1 == 7 || arg1 == 9;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field10478[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIB)Z", line = 16)
    public static final boolean method5281(int arg0, int arg1, int arg2, byte arg3) {
        try {
            field10469++;
            boolean var4 = true;
            class583 var5 = (class583) class599.method4456(arg1, arg0, arg2);
            if (var5 != null) {
                var4 &= class774.method5606(99, var5);
            }
            class583 var6 = (class583) class261.method2196(arg1, arg0, arg2, field10477 == null ? (field10477 = method5285(field10478[5])) : field10477);
            if (var6 != null) {
                var4 &= class774.method5606(23, var6);
            }
            class583 var7 = (class583) class89.method766(arg1, arg0, arg2);
            int var8 = -6 / ((-arg3 - 68) / 32);
            if (var7 != null) {
                var4 &= class774.method5606(60, var7);
            }
            return var4;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field10478[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IILib;)V", line = 47)
    private final void method5282(int arg0, int arg1, class163 arg2) {
        try {
            field10468++;
            if (arg0 == 1) {
                this.field10476 = class259.method2185(-161, arg2.method1414(1));
            } else if (arg0 == 2) {
                this.field10471 = 0;
            }
            if (arg1 != -19473) {
                field10472 = null;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10478[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field10478[1] : field10478[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lib;I)V", line = 67)
    public final void method5283(class163 arg0, int arg1) {
        try {
            field10473++;
            if (arg1 < 32) {
                this.field10471 = 21;
            }
            while (true) {
                int var3 = arg0.method1455((byte) 62);
                if (var3 == 0) {
                    return;
                }
                this.method5282(var3, -19473, arg0);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field10478[3] + (arg0 == null ? field10478[1] : field10478[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V", line = 90)
    public static void method5284(byte arg0) {
        try {
            if (arg0 > -31) {
                method5280((byte) 101, -62);
            }
            field10470 = null;
            field10472 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10478[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5286(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5287(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 93;
                    break;
                case 3:
                    var10005 = 98;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
