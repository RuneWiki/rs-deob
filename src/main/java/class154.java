import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class154 extends class141 {

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[J")
    public static long[] field2486 = new long[100];

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
    public static int field2483 = 0;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2487 = " ";

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "Z")
    public static boolean field2492 = false;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
    public static int[] field2493 = new int[50];

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2494 = " is already on your friend list.";

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "Ljava/lang/String;")
    public static String field2496 = null;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BILjava/lang/String;Z)Z")
    public static final boolean method1068(byte arg0, int arg1, String arg2, boolean arg3) {
        field2490++;
        if (arg1 < 2 || arg1 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
        boolean var4 = false;
        int var5 = arg2.length();
        boolean var6 = false;
        int var7 = 0;
        if (arg0 >= -13) {
            field2496 = null;
        }
        for (int var8 = 0; var8 < var5; var8++) {
            char var9 = arg2.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg3) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                return false;
            }
            if (arg1 <= var11) {
                return false;
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg1 * var7 + var11;
            if (var10 / arg1 != var7) {
                return false;
            }
            var6 = true;
            var7 = var10;
        }
        return var6;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static void method1069(byte arg0) {
        if (arg0 >= -9) {
            field2487 = null;
        }
        field2494 = null;
        field2493 = null;
        field2487 = null;
        field2496 = null;
        field2486 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1070(String arg0, byte arg1, String arg2, String arg3) {
        field2489++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = arg3.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var4;
        if (arg1 != 55) {
            method1069((byte) -79);
        }
        int var8 = var6 - var5;
        if (var8 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg2.indexOf(arg0, var9);
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
            int var13 = arg2.indexOf(arg0, var11);
            if (var13 < 0) {
                var12.append(arg2.substring(var11));
                return var12.toString();
            }
            var12.append(arg2.substring(var11, var13));
            var11 = var5 + var13;
            var12.append(arg3);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lqh;Lqh;III)Ljb;")
    public static final class269 method1071(class201 arg0, class201 arg1, int arg2, int arg3, int arg4) {
        if (arg3 == -10727) {
            field2484++;
            return class239.method1657(arg2, -87, arg4, arg0) ? class13.method110(-7559, arg1.method1357(arg2, arg4, -1)) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V")
    public static final void method1072(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2497++;
        int var5 = -82 / ((-arg4 - 66) / 33);
        for (int var6 = 0; var6 < class98.field1615; var6++) {
            if (arg3 < (class142.field2295[var6] + class124.field2006[var6]) && class142.field2295[var6] < arg2 + arg3 && arg0 < (class98.field1616[var6] + class158.field2550[var6]) && (arg0 + arg1) > class98.field1616[var6]) {
                class275.field4352[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1073(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2495++;
        if (class255.field4055 <= arg5 && class9.field128 >= arg5 && class255.field4055 <= arg7 && arg7 <= class9.field128 && arg1 >= class255.field4055 && arg1 <= class9.field128 && arg9 >= class255.field4055 && arg9 <= class9.field128 && arg2 >= class161.field2561 && class51.field896 >= arg2 && class161.field2561 <= arg4 && arg4 <= class51.field896 && arg6 >= class161.field2561 && arg6 <= class51.field896 && arg8 >= class161.field2561 && class51.field896 >= arg8) {
            class94.method705(arg2, arg7, arg0, -11430, arg1, arg8, arg6, arg4, arg9, arg5);
        } else {
            class216.method1477(arg6, arg2, arg0, arg7, arg5, arg4, (byte) -90, arg8, arg1, arg9);
        }
        if (arg3 != 6192) {
            field2493 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lf;I)Z")
    public static final boolean method1074(class36 arg0, int arg1) {
        field2488++;
        if (arg1 < 122) {
            method1071((class201) null, (class201) null, -96, 56, -52);
        }
        if (arg0.field611 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field611.length; var2++) {
            int var3 = class127.method902((byte) -52, var2, arg0);
            int var4 = arg0.field572[var2];
            if (arg0.field611[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field611[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field611[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILqh;Lqh;)V")
    public static final void method1075(int arg0, class201 arg1, class201 arg2) {
        if (arg0 <= 16) {
            method1068((byte) -73, -58, (String) null, false);
        }
        class48.field854 = arg2;
        field2485++;
        class32.field496 = arg1;
        class8.field100 = class48.field854.method1361(3, -93);
    }
}
