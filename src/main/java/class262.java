import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class262 implements class250 {

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "Lla;")
    private class476 field4032;

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4036 = new String[] { method2204(method2203("\ne;\bV")), method2204(method2203("\ne;\u000fV")), method2204(method2203("\u000fgy'")), method2204(method2203("\u001a<;e\u0003")), method2204(method2203("\ne;w\u0017\u000f{auV")), method2204(method2203("\ne;\nV")), method2204(method2203("\ne;\u000eV")), method2204(method2203("\ne;\tV")) };

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "Lwia;")
    public static class790 field4027 = new class790(0, -1);

    @OriginalMember(owner = "client!kw", name = "i", descriptor = "F")
    public static float field4030;

    @OriginalMember(owner = "client!kw", name = "e", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!kw", name = "h", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!kw", name = "f", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!kw", name = "g", descriptor = "Lmd;")
    public static class569 field4035;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(IIBI[BI)V", line = 5)
    public static final void method2200(int arg0, int arg1, byte arg2, int arg3, byte[] arg4, int arg5) {
        try {
            int var6 = 30 / ((39 - arg2) / 52);
            field4034++;
            if (arg3 > arg1) {
                int var15 = arg3 - arg1 >> 2;
                arg5 += arg1;
                while (true) {
                    var15--;
                    if (var15 < 0) {
                        var15 = arg3 - arg1 & 0x3;
                        while (true) {
                            var15--;
                            if (var15 < 0) {
                                return;
                            }
                            arg4[arg5++] = 1;
                        }
                    }
                    int var9 = arg5 + 1;
                    arg4[arg5] = 1;
                    int var10 = var9 + 1;
                    arg4[var9] = 1;
                    int var11 = var10 + 1;
                    arg4[var10] = 1;
                    arg5 = var11 + 1;
                    arg4[var11] = 1;
                }
            }
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field4036[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field4036[2] : field4036[3]) + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)I", line = 33)
    public final int method670(int arg0) {
        try {
            field4029++;
            if (this.field4032.method3624(false)) {
                return 100;
            } else if (arg0 == 18366) {
                return this.field4032.method3634(-83);
            } else {
                return 86;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4036[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)V", line = 48)
    public static final void method2201(int arg0, int arg1) {
        try {
            if (class84.field940 == 0) {
                class396.field5927.method4563((byte) 101, arg0);
            } else {
                class550.field8199 = arg0;
            }
            field4028++;
            if (arg1 != 22421) {
                field4033 = 127;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4036[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)Lud;", line = 68)
    public final class39 method671(int arg0) {
        try {
            int var2 = 15 / ((arg0 + 46) / 56);
            field4031++;
            return class39.field453;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field4036[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "(I)V", line = 81)
    public static void method2202(int arg0) {
        try {
            if (arg0 == -1592534046) {
                field4035 = null;
                field4027 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field4036[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "<init>", descriptor = "(Lla;)V", line = 93)
    public class262(class476 arg0) {
        try {
            this.field4032 = arg0;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field4036[4] + (arg0 == null ? field4036[2] : field4036[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2203(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2204(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 97;
                    break;
                case 1:
                    var10005 = 18;
                    break;
                case 2:
                    var10005 = 21;
                    break;
                case 3:
                    var10005 = 75;
                    break;
                default:
                    var10005 = 126;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
