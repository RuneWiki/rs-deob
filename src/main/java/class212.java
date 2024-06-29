import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class212 {

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    private int field3104;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lon;")
    private class496 field3106;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public int field3108;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3122 = new String[] { method1790(method1789("\u0013\u001a82\r")), method1790(method1789("\u0019\u000bz\u001d")), method1790(method1789("\u0013\u001a80\r")), method1790(method1789("\fP8_X")), method1790(method1789("\u0013\u001a8ML\u0019\u0017bO\r")), method1790(method1789("\u0013\u001a83\r")), method1790(method1789("\u0013\u001a8\u0005J$\nd\u0018K\u0010V")) };

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "Ldd;")
    public static class212 field3105 = new class212(0, 3, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Ldd;")
    public static class212 field3110 = new class212(1, 3, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ldd;")
    public static class212 field3111 = new class212(2, 4, class496.field7281);

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ldd;")
    public static class212 field3112 = new class212(3, 1, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "Ldd;")
    public static class212 field3113 = new class212(4, 2, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Ldd;")
    public static class212 field3114 = new class212(5, 3, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Ldd;")
    public static class212 field3115 = new class212(6, 4, class496.field7285);

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3116 = class626.method4593(3, 16);

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Lmv;")
    public static class125 field3118 = new class125(65, -1);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field3121 = 0;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Z")
    public static boolean field3119 = false;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "F")
    public static float field3117;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field3107;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "[J")
    public static long[] field3120;

    @OriginalMember(owner = "client!dd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        try {
            field3102++;
            throw new IllegalStateException();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3122[6] + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method1786(int arg0) {
        try {
            field3110 = null;
            field3114 = null;
            field3113 = null;
            field3120 = null;
            if (arg0 == 2) {
                field3115 = null;
                field3112 = null;
                field3111 = null;
                field3118 = null;
                field3105 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3122[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1787(boolean arg0, String arg1, int arg2) {
        try {
            field3103++;
            if (arg0) {
                field3118 = null;
            }
            class294 var3 = class146.method1261((long) arg2, 106, 2);
            var3.method2378(-55);
            var3.field4135 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3122[2] + arg0 + ',' + (arg1 == null ? field3122[1] : field3122[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)Ldd;")
    public static final class212 method1788(byte arg0, int arg1) {
        try {
            field3107++;
            if (arg1 == 0) {
                return field3105;
            } else if (arg1 == 1) {
                return field3110;
            } else if (arg1 == 2) {
                return field3111;
            } else if (arg1 == 3) {
                return field3112;
            } else if (arg1 == 4) {
                return field3113;
            } else if (arg1 == 5) {
                return field3114;
            } else if (arg1 == 6) {
                return field3115;
            } else {
                if (arg0 < 94) {
                    field3121 = -30;
                }
                return null;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3122[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IILon;)V")
    private class212(int arg0, int arg1, class496 arg2) {
        try {
            this.field3104 = arg1;
            this.field3106 = arg2;
            this.field3109 = arg0;
            this.field3108 = this.field3106.field7279 * this.field3104;
            if (this.field3109 >= 16) {
                throw new RuntimeException();
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3122[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3122[1] : field3122[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1789(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x25);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1790(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 119;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 22;
                    break;
                case 3:
                    var10005 = 113;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
