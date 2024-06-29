import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class537 extends class459 {

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "Lsu;")
    public class220 field7892;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field7893 = new String[] { method4012(method4011("-fX~")), method4012(method4011("2y\u001a.g-z@,&")), method4012(method4011("8=\u001a<s")), method4012(method4011("2y\u001aP&")), method4012(method4011("2y\u001aV&")), method4012(method4011("2y\u001aQ&")), method4012(method4011("2y\u001aS&")), method4012(method4011("0{[eX*wQ}O'")) };

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lpo;")
    public static class585 field7885 = new class585(method4012(method4011("$rYw=")), method4012(method4011("\u0004rYw.p")), 2);

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field7887 = 0;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field7888;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field7889;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field7891;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "[Z")
    public static boolean[] field7884;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
    public static final boolean method4007(int arg0) {
        try {
            field7890++;
            if (arg0 != -21) {
                method4010(false, null);
            }
            if (class40.field466) {
                try {
                    class470.method3617((byte) -105, class476.field7255, field7893[7]);
                    return true;
                } catch (Throwable var2) {
                }
            }
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7893[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(Z)V")
    public static void method4008(boolean arg0) {
        try {
            if (!arg0) {
                field7885 = null;
                field7884 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7893[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lgda;[IBLgda;)V")
    public static final void method4009(class58 arg0, int[] arg1, byte arg2, class58 arg3) {
        try {
            class266.field4311 = arg0;
            if (arg1 != null) {
                class321.field5230 = arg1;
            }
            field7889++;
            if (arg2 >= -106) {
                method4008(false);
            }
            class453.field7008 = arg3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7893[3] + (arg0 == null ? field7893[0] : field7893[2]) + ',' + (arg1 == null ? field7893[0] : field7893[2]) + ',' + arg2 + ',' + (arg3 == null ? field7893[0] : field7893[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZLcaa;)V")
    public static final void method4010(boolean arg0, class318 arg1) {
        try {
            field7891++;
            arg1.field5183 = null;
            if (class324.field5262 < 20) {
                class108.field1547.method748(-83, arg1);
                class324.field5262++;
            }
            if (arg0) {
                field7887 = 42;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7893[4] + arg0 + ',' + (arg1 == null ? field7893[0] : field7893[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lsu;)V")
    public class537(class220 arg0) {
        try {
            this.field7892 = arg0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7893[1] + (arg0 == null ? field7893[0] : field7893[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4011(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4012(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 19;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 18;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
