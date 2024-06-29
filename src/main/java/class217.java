import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class217 {

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Z")
    public static boolean field3019 = false;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Ldi;")
    public static class83 field3016 = new class83(68, -1);

    @OriginalMember(owner = "client!js", name = "g", descriptor = "[Z")
    public static boolean[] field3022 = new boolean[8];

    @OriginalMember(owner = "client!js", name = "j", descriptor = "Lwj;")
    public static class270 field3025 = new class270(105, 6);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "Lbm;")
    public static class75 field3029;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "[I")
    public static int[] field3024;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIZLmg;III)V")
    public static final void method1342(int arg0, int arg1, boolean arg2, class101 arg3, int arg4, int arg5, int arg6) {
        class449.field6616 = arg1;
        class88.field1282 = 1;
        class3.field19 = arg4;
        class216.field3008 = arg6;
        class12.field183 = arg3;
        class88.field1281 = arg0;
        class385.field5610 = arg2;
        field3018++;
        if (arg5 != -3) {
            method1342(96, 8, false, null, 64, 56, 46);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public static void method1343(int arg0) {
        field3024 = null;
        field3025 = null;
        int var1 = -95 / ((arg0 + 41) / 37);
        field3022 = null;
        field3016 = null;
        field3029 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)I")
    public static final int method1344(int arg0, byte arg1) {
        field3017++;
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else {
            int var2 = -64 % ((65 - arg1) / 61);
            if (arg0 == 6409 || arg0 == 34846) {
                return 6409;
            } else if (arg0 == 6410 || arg0 == 34847) {
                return 6410;
            } else if (arg0 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)Z")
    public static final boolean method1345(int arg0, int arg1) {
        field3020++;
        if (arg0 == 0) {
            return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(II)V")
    public static final void method1346(int arg0, int arg1) {
        class225.field3205.method1065((byte) -95, arg1);
        field3023++;
        class89.field1301.method1065((byte) -95, arg1);
        if (arg0 <= -72) {
            class74.field1005.method1065((byte) -95, arg1);
            class88.field1287.method1065((byte) -95, arg1);
            class446.field6572.method1065((byte) -95, arg1);
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)Leq;")
    public static final class141 method1347(int arg0, int arg1, int arg2) {
        if (arg1 != 5761) {
            method1343(-6);
        }
        field3027++;
        class141 var3 = new class141();
        var3.field1994 = -1;
        var3.field1997 = arg0 + 5 + 1;
        var3.field1998 = arg2 + 6;
        var3.field1992 = -1;
        var3.field2013 = new int[var3.field1997][var3.field1998];
        var3.method945((byte) 66);
        return var3;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([Ljava/lang/Object;IBI[J)V")
    public static final void method1348(Object[] arg0, int arg1, byte arg2, int arg3, long[] arg4) {
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg1; var11++) {
                if (((long) (var11 & var10) + var7) > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method1348(arg0, var6 - 1, (byte) 57, arg3, arg4);
            method1348(arg0, arg1, (byte) 106, var6 + 1, arg4);
        }
        if (arg2 < 23) {
            field3028 = -2;
        }
        field3021++;
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V")
    public static final void method1349(int arg0) {
        if (class283.method1685(-11182)) {
            if (class63.field790 == null) {
                class515.method3073(500);
            }
            class77.field1061 = 0;
            class48.field570 = true;
            try {
                class52.field635 = class67.field921.getToolkit().getSystemClipboard();
            } catch (Exception var1) {
            }
        }
        if (arg0 != 14246) {
            method1343(82);
        }
        field3026++;
    }
}
