import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class218 extends class367 {

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field3070;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[I")
    public static int[] field3073 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "[Lkb;")
    public static class412[] field3072 = new class412[14];

    @OriginalMember(owner = "client!ml", name = "T", descriptor = "I")
    public static int field3074 = -1;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!ml", name = "U", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ml", name = "V", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!ml", name = "W", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!ml", name = "X", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIZI)I")
    public static final int method1459(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg0 != 10) {
            method1459(53, 30, false, 62);
        }
        field3077++;
        class411 var4 = class144.method878(arg2, arg3, -103);
        if (var4 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var4.field5904.length) {
            return var4.field5904[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(B)V")
    public static void method1460(byte arg0) {
        field3073 = null;
        if (arg0 != -27) {
            field3073 = null;
        }
        field3072 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIII)V")
    public static final void method1461(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 89) {
            field3072 = null;
        }
        field3069++;
        class180 var4 = class311.field4398[arg1][arg3];
        class341.method2190(-1, arg2, var4 == null ? class82.field951 : var4);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;")
    public static final String method1462(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field3067++;
        char var6 = ',';
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            var8 = true;
            arg4 = -arg4;
        }
        if (arg2 >= -20) {
            return null;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg1 > 0) {
            for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg4 * 10));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg4 * 10)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class218(Object arg0) {
        this.field3070 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
    public static final void method1463(int arg0, int arg1, int arg2) {
        field3076++;
        class244 var3 = class414.method2636(arg1, 31392);
        int var4 = var3.field3454;
        int var5 = var3.field3461;
        int var6 = 76 % ((-arg0 - 10) / 54);
        int var7 = var3.field3464;
        int var8 = class127.field1543[var7 - var5];
        if (arg2 < 0 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var5;
        class102.method572((byte) -72, var4, var9 & arg2 << var5 | class151.field1865[var4] & ~var9);
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)V")
    public static final void method1464(int arg0) {
        if (arg0 <= 54) {
            method1462(-23, 2, -5, true, 116L);
        }
        field3071++;
        if (class162.field2210 != null) {
            class162.field2210.method824(-102);
            class162.field2210 = null;
            class138.field1714 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)Z")
    public final boolean method934(byte arg0) {
        field3075++;
        return arg0 == -40 ? false : false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1465(boolean arg0, String arg1) {
        if (!arg0) {
            return;
        }
        field3068++;
        if (class65.field748 != null) {
            class62.field718.method2143(212, -2);
            class154.field1903++;
            class62.field718.method1583(class81.method457(arg1, (byte) -49), (byte) -96);
            class62.field718.method1596(arg1, false);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public final Object method935(boolean arg0) {
        field3078++;
        return arg0 ? this.field3070 : null;
    }
}
