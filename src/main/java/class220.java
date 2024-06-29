import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class220 {

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field3430 = -1;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
    public static volatile long field3435 = 0L;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3437 = "Connected to update server";

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3436 = "flash1:";

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3438 = "Hidden";

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 14)
    public static void method1599(byte arg0) {
        field3437 = null;
        if (arg0 != -55) {
            field3437 = (String) null;
        }
        field3438 = null;
        field3436 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ltk;IBIZ)V", line = 28)
    public static final void method1600(class266 arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        int var5 = arg0.field3939;
        int var6 = arg0.field3941;
        field3432++;
        if (arg0.field4057 == 0) {
            arg0.field3941 = arg0.field3987;
        } else if (arg0.field4057 == 1) {
            arg0.field3941 = arg3 - arg0.field3987;
        } else if (arg0.field4057 == 2) {
            arg0.field3941 = arg0.field3987 * arg3 >> 14;
        } else if (arg0.field4057 == 3) {
            if (arg0.field4084 == 2) {
                arg0.field3941 = (arg0.field3987 - 1) * arg0.field3999 + arg0.field3987 * 32;
            } else if (arg0.field4084 == 7) {
                arg0.field3941 = arg0.field3987 * 115 + ((arg0.field3987 - 1) * arg0.field3999);
            }
        }
        if (arg0.field3990 == 0) {
            arg0.field3939 = arg0.field4009;
        } else if (arg0.field3990 == 1) {
            arg0.field3939 = arg1 - arg0.field4009;
        } else if (arg0.field3990 == 2) {
            arg0.field3939 = arg0.field4009 * arg1 >> 14;
        } else if (arg0.field3990 == 3) {
            if (arg0.field4084 == 2) {
                arg0.field3939 = (arg0.field4009 - 1) * arg0.field4049 + arg0.field4009 * 32;
            } else if (arg0.field4084 == 7) {
                arg0.field3939 = (arg0.field4009 - 1) * arg0.field4049 + arg0.field4009 * 12;
            }
        }
        if (arg0.field4057 == 4) {
            arg0.field3941 = arg0.field4040 * arg0.field3939 / arg0.field4018;
        }
        if (arg0.field3990 == 4) {
            arg0.field3939 = arg0.field4018 * arg0.field3941 / arg0.field4040;
        }
        int var7 = 91 / ((arg2 - 30) / 61);
        if (class320.field5011 && (client.method1867(arg0).field3822 != 0 || arg0.field4084 == 0)) {
            if (arg0.field3939 < 5 && arg0.field3941 < 5) {
                arg0.field3941 = 5;
                arg0.field3939 = 5;
            } else {
                if (arg0.field3941 <= 0) {
                    arg0.field3941 = 5;
                }
                if (arg0.field3939 <= 0) {
                    arg0.field3939 = 5;
                }
            }
        }
        if (arg0.field4064 == 1337) {
            class342.field5302 = arg0;
        }
        if (arg4 && arg0.field4023 != null && (arg0.field3941 != var6 || arg0.field3939 != var5)) {
            class150 var8 = new class150();
            var8.field2458 = arg0;
            var8.field2450 = arg0.field4023;
            class44.field698.method277(var8, (byte) -119);
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Ljava/lang/String;", line = 130)
    public static final String method1601(int arg0) {
        field3431++;
        String var1 = "www";
        if (class260.field3874 != 0) {
            var1 = "www-wtqa";
        }
        String var2 = "";
        if (class259.field3844 != null) {
            var2 = "/p=" + class259.field3844;
        }
        return arg0 == 4 ? "http://" + var1 + ".runescape.com/l=" + class28.field453 + "/a=" + class151.field2464 + var2 + "/" : (String) null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B[B)Lcm;", line = 154)
    public static final class205 method1602(byte arg0, byte[] arg1) {
        field3440++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < 7) {
            field3437 = (String) null;
        }
        class205 var2;
        if (class162.field2623) {
            var2 = new class223(arg1, class61.field892, class183.field2902, class309.field4887, class83.field1288, class207.field3277);
        } else {
            var2 = new class159(arg1, class61.field892, class183.field2902, class309.field4887, class83.field1288, class207.field3277);
        }
        class260.method1796(1952227009);
        return var2;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 186)
    public static final String method1603(String arg0, byte arg1, String arg2, String arg3) {
        field3434++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = arg0.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        if (arg1 != 5) {
            method1600((class266) null, -6, (byte) -27, -41, false);
        }
        int var7 = var4;
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg3.indexOf(arg2, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var7 += var8;
            }
        }
        int var11 = 0;
        StringBuffer var12 = new StringBuffer(var7);
        while (true) {
            int var13 = arg3.indexOf(arg2, var11);
            if (var13 < 0) {
                var12.append(arg3.substring(var11));
                return var12.toString();
            }
            var12.append(arg3.substring(var11, var13));
            var12.append(arg0);
            var11 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IB)V", line = 246)
    public static final void method1604(int arg0, byte arg1) {
        if (arg1 < 104) {
            return;
        }
        class225.field3492 = new int[arg0];
        class93.field1517 = new int[arg0];
        class73.field1108 = new int[arg0];
        field3433++;
        class142.field2304 = new int[arg0];
        class32.field500 = new int[arg0];
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[[III)I", line = 261)
    public static final int method1605(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        if (arg0 == -1) {
            field3439++;
            int var6 = (128 - arg2) * arg3[arg1][arg5] + (arg3[arg1 + 1][arg5] * arg2) >> 7;
            int var7 = (128 - arg2) * arg3[arg1][arg5 + 1] + arg3[arg1 + 1][arg5 + 1] * arg2 >> 7;
            return (128 - arg4) * var6 + arg4 * var7 >> 7;
        } else {
            return -66;
        }
    }
}
