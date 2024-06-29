import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class292 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Lgd;")
    public static class170 field4538 = new class170(16);

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4543 = "Please wait...";

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
    public static int[] field4542 = new int[128];

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4541 = 0;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "[[B")
    public static byte[][] field4537;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(JIIBZ)Ljava/lang/String;", line = 7)
    public static final String method1994(long arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field4540++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var6 = '.';
            var7 = ',';
        }
        boolean var8 = false;
        if (arg0 < 0L) {
            arg0 = -arg0;
            var8 = true;
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > -113) {
            field4541 = -25;
        }
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg0;
                arg0 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg0 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg0;
            arg0 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg0 * 10)));
            if (arg0 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 90)
    public static void method1995(byte arg0) {
        field4543 = null;
        field4537 = (byte[][]) null;
        field4542 = null;
        if (arg0 != -95) {
            method1996(116, 20, (class220) null, 52);
        }
        field4538 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IILtb;I)V", line = 104)
    public static final void method1996(int arg0, int arg1, class220 arg2, int arg3) {
        if (arg3 < 103) {
            method1997((byte) -38, 11);
        }
        if (arg2.field3424 == 0) {
            arg2.field3464 = arg2.field3444;
        } else if (arg2.field3424 == 1) {
            arg2.field3464 = (arg0 - arg2.field3458) / 2 + arg2.field3444;
        } else if (arg2.field3424 == 2) {
            arg2.field3464 = arg0 - arg2.field3458 - arg2.field3444;
        } else if (arg2.field3424 == 3) {
            arg2.field3464 = arg2.field3444 * arg0 >> 14;
        } else if (arg2.field3424 == 4) {
            arg2.field3464 = (arg0 - arg2.field3458) / 2 + (arg2.field3444 * arg0 >> 14);
        } else {
            arg2.field3464 = arg0 - arg2.field3458 - (arg2.field3444 * arg0 >> 14);
        }
        if (arg2.field3527 == 0) {
            arg2.field3361 = arg2.field3435;
        } else if (arg2.field3527 == 1) {
            arg2.field3361 = (arg1 - arg2.field3526) / 2 + arg2.field3435;
        } else if (arg2.field3527 == 2) {
            arg2.field3361 = arg1 - arg2.field3526 - arg2.field3435;
        } else if (arg2.field3527 == 3) {
            arg2.field3361 = arg2.field3435 * arg1 >> 14;
        } else if (arg2.field3527 == 4) {
            arg2.field3361 = (arg1 - arg2.field3526) / 2 + (arg2.field3435 * arg1 >> 14);
        } else {
            arg2.field3361 = arg1 - arg2.field3526 - (arg2.field3435 * arg1 >> 14);
        }
        if (class175.field2653 && (client.method393(arg2).field2403 != 0 || arg2.field3468 == 0)) {
            if (arg2.field3464 < 0) {
                arg2.field3464 = 0;
            } else if (arg2.field3464 + arg2.field3458 > arg0) {
                arg2.field3464 = arg0 - arg2.field3458;
            }
            if (arg2.field3361 < 0) {
                arg2.field3361 = 0;
            } else if (arg1 < arg2.field3526 + arg2.field3361) {
                arg2.field3361 = arg1 - arg2.field3526;
            }
        }
        field4539++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 181)
    public static final String method1997(byte arg0, int arg1) {
        field4536++;
        if (arg1 >= 999999999) {
            return arg0 >= -84 ? (String) null : "*";
        } else {
            return Integer.toString(arg1);
        }
    }
}
