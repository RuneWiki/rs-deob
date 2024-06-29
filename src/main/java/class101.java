import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class101 extends class135 {

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "Ldf;")
    public static class231 field1445 = new class231(8);

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    public static int field1447 = 99;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "Lqj;")
    public static class196 field1450 = class80.method502("Eingabeprozedur geladen)3", -48);

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "client!uc", name = "cb", descriptor = "[I")
    public static int[] field1451;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)[I")
    public final int[] method99(int arg0, boolean arg1) {
        field1444++;
        if (arg1) {
            method609(-26);
        }
        return class82.field1189;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class101() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V")
    public static void method609(int arg0) {
        if (arg0 == 115) {
            field1445 = null;
            field1450 = null;
            field1451 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)V")
    public static final void method610(boolean arg0, int arg1, int arg2) {
        class126 var3 = class185.method1210(arg2, 65535);
        field1448++;
        int var4 = var3.field1788;
        int var5 = var3.field1783;
        int var6 = var3.field1791;
        int var7 = class84.field1232[var6 - var5];
        if (arg1 < 0 || var7 < arg1) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class150.method944(arg0, var4, class214.field3823[var4] & ~var8 | arg1 << var5 & var8);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lec;IIIZ)V")
    public static final void method611(class178 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1446++;
        int var5 = arg0.field2997;
        if (arg0.field2991 == 0) {
            arg0.field2997 = arg0.field3082;
        } else if (arg0.field2991 == 1) {
            arg0.field2997 = arg3 - arg0.field3082;
        } else if (arg0.field2991 == 2) {
            arg0.field2997 = arg0.field3082 * arg3 >> 14;
        } else if (arg0.field2991 == 3) {
            if (arg0.field3123 == 2) {
                arg0.field2997 = arg0.field3082 * 32 + (arg0.field3082 - 1) * arg0.field3100;
            } else if (arg0.field3123 == 7) {
                arg0.field2997 = arg0.field3082 * 12 + (arg0.field3082 - 1) * arg0.field3100;
            }
        }
        int var6 = arg0.field3085;
        if (arg0.field3005 == 0) {
            arg0.field3085 = arg0.field2995;
        } else if (arg0.field3005 == 1) {
            arg0.field3085 = arg2 - arg0.field2995;
        } else if (arg0.field3005 == 2) {
            arg0.field3085 = arg0.field2995 * arg2 >> 14;
        } else if (arg0.field3005 == 3) {
            if (arg0.field3123 == 2) {
                arg0.field3085 = (arg0.field2995 - 1) * arg0.field3115 + arg0.field2995 * 32;
            } else if (arg0.field3123 == 7) {
                arg0.field3085 = arg0.field2995 * 115 + (arg0.field2995 - 1) * arg0.field3115;
            }
        }
        if (arg0.field3005 == 4) {
            arg0.field3085 = arg0.field3049 * arg0.field2997 / arg0.field3137;
        }
        if (arg0.field2991 == 4) {
            arg0.field2997 = arg0.field3137 * arg0.field3085 / arg0.field3049;
        }
        if (class236.field4195 && (client.method614(arg0) != 0 || arg0.field3123 == 0)) {
            if (arg0.field2997 < 5 && arg0.field3085 < 5) {
                arg0.field3085 = 5;
                arg0.field2997 = 5;
            } else {
                if (arg0.field2997 <= 0) {
                    arg0.field2997 = 5;
                }
                if (arg0.field3085 <= 0) {
                    arg0.field3085 = 5;
                }
            }
        }
        if (arg0.field3121 == 1337) {
            class130.field1845 = arg0;
        }
        if (arg4 && arg0.field3139 != null && (arg0.field3085 != var6 || arg0.field2997 != var5)) {
            class157 var7 = new class157();
            var7.field2526 = arg0;
            var7.field2534 = arg0.field3139;
            class22.field277.method1652(26532, var7);
        }
        if (arg1 > -99) {
            field1445 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)I")
    public static final int method612(int arg0, int arg1, int arg2) {
        field1449++;
        if (arg2 > -37) {
            method612(96, 99, -126);
        }
        class249 var3 = (class249) class110.field1562.method1551(32768, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var3.field4411.length) {
            return var3.field4411[arg0];
        } else {
            return 0;
        }
    }
}
