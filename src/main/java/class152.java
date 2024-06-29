import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class152 extends class509 {

    @OriginalMember(owner = "client!fe", name = "C", descriptor = "I")
    public int field2314 = -1;

    @OriginalMember(owner = "client!fe", name = "D", descriptor = "Ldp;")
    public static class347 field2315 = new class347("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!fe", name = "E", descriptor = "I")
    public static int field2316 = -50;

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field2302;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!fe", name = "w", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!fe", name = "x", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!fe", name = "y", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!fe", name = "z", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!fe", name = "A", descriptor = "I")
    public static int field2312;

    @OriginalMember(owner = "client!fe", name = "B", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!fe", name = "F", descriptor = "Lav;")
    public static class236 field2317;

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Ljava/lang/String;")
    public String field2305;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "Ljava/lang/String;")
    public String field2307;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Z", line = 5)
    public static final boolean method1094(int arg0, byte arg1) {
        ++field2304;
        if (arg1 != 12) {
            method1102(-54);
        }
        for (class477 var2 = (class477) class154.field2334.method2957(-128); var2 != null; var2 = (class477) class154.field2334.method2947(-125)) {
            if (class26.method255(var2.field7034, 122) && ~((long) arg0) == ~var2.field7030) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIB)Z", line = 29)
    public static final boolean method1095(int arg0, int arg1, byte arg2) {
        if (arg2 != 56) {
            method1100(false, (int[]) null, (long[]) null);
        }
        ++field2308;
        return ~(65536 & arg0) != -1;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)V", line = 40)
    public static final void method1096(int arg0, int arg1) {
        ++field2302;
        if (!class454.field6661.field1004) {
            arg1 = -1;
        }
        if (~class65.field884 != ~arg1) {
            if (arg1 != -1) {
                class452 var2 = class312.field4844.method1062(arg1, (byte) -81);
                class319 var3 = var2.method2629((byte) 97);
                if (var3 != null) {
                    class25.field375.method820(var3.method1987(), new Point(var2.field6641, var2.field6643), var3.method1989(), class357.field5469, (byte) -102, var3.method1998());
                    class65.field884 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg1 == -1 && ~class65.field884 != 0) {
                class25.field375.method820((int[]) null, new Point(), -1, class357.field5469, (byte) -99, -1);
                class65.field884 = -1;
            }
            if (arg0 != 19716) {
                field2316 = -51;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIZII)V", line = 80)
    public static final void method1097(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field2312;
        if (class250.method1495(true, arg3)) {
            class378.method2232(arg2, class174.field2549[arg3], -1, arg4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)Lgs;", line = 92)
    public final class439 method1098(int arg0) {
        int var2 = 14 % ((-41 - arg0) / 34);
        ++field2303;
        return class153.field2327[super.field7477];
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIZ)V", line = 106)
    public static final void method1099(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = class454.field6661.field980 * arg0 >> 8;
        ++field2306;
        if (~var4 != -1 && arg2 != -1) {
            class428.method2537((byte) -77, arg2, 0, class71.field964, false, var4);
            class520.field7641 = true;
        }
        if (!arg3) {
            field2315 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z[I[J)V", line = 125)
    public static final void method1100(boolean arg0, int[] arg1, long[] arg2) {
        if (arg0) {
            class119.method901(arg2, arg2.length + -1, 0, arg1, (byte) -96);
            ++field2309;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/lang/String;IZZ)I", line = 144)
    public static final int method1101(String arg0, int arg1, boolean arg2, boolean arg3) {
        ++field2313;
        if (~arg1 <= -3 && ~arg1 >= -37) {
            boolean var4 = false;
            boolean var5 = arg2;
            int var6 = 0;
            int var7 = arg0.length();
            for (int var8 = 0; ~var8 > ~var7; ++var8) {
                char var9 = arg0.charAt(var8);
                if (~var8 == -1) {
                    if (~var9 == -46) {
                        var4 = true;
                        continue;
                    }
                    if (~var9 == -44 && arg3) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && ~var9 >= -58) {
                    var11 = var9 - '0';
                } else if (~var9 <= -66 && ~var9 >= -91) {
                    var11 = var9 - '7';
                } else {
                    if (~var9 > -98 || var9 > 'z') {
                        throw new NumberFormatException();
                    }
                    var11 = var9 - 'W';
                }
                if (var11 >= arg1) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg1 * var6 + var11;
                if (~(var10 / arg1) != ~var6) {
                    throw new NumberFormatException();
                }
                var5 = true;
                var6 = var10;
            }
            if (!var5) {
                throw new NumberFormatException();
            } else {
                return var6;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "(I)V", line = 223)
    public static void method1102(int arg0) {
        field2315 = null;
        field2317 = null;
        if (arg0 != -21156) {
            method1102(-70);
        }
    }
}
