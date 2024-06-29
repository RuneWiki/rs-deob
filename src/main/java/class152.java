import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class152 {

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2415 = -2;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2411 = "Loading wordpack - ";

    @OriginalMember(owner = "client!am", name = "u", descriptor = "[[S")
    public static short[][] field2428 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field2417 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public int field2409;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public int field2414;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public int field2419;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public int field2420;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public int field2422;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public int field2423;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public int field2426;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public int field2429;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public int field2432;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIILhd;IJIIII)Z", line = 22)
    public static final boolean method1170(int arg0, int arg1, int arg2, int arg3, class161 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class130.method993(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V", line = 40)
    public static void method1171(boolean arg0) {
        field2411 = null;
        field2428 = (short[][]) null;
        if (!arg0) {
            method1174(1, 23, 111);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 57)
    public static final void method1172(int arg0) {
        field2418++;
        if (arg0 < class221.field3609) {
            class74.method620((byte) -114);
        } else {
            class353.field5609 = class342.field5449;
            class342.field5449 = null;
            class22.method143(-29, 40);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ZLth;Lth;)V", line = 83)
    public static final void method1173(boolean arg0, class57 arg1, class57 arg2) {
        class322.field5123 = arg1;
        class86.field1465 = arg2;
        class322.field5123.method482(27535, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        if (arg0) {
            return;
        }
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 41.0D) - 20;
        class22.field269 = var5 + var6;
        field2431++;
        class326.field5184 = var3 + var6;
        class46.field747 = var4 + var6;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lqa;", line = 114)
    public static final class338 method1174(int arg0, int arg1, int arg2) {
        class36 var3 = class129.field2184[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class338 var4 = var3.field533;
            var3.field533 = null;
            return var4;
        }
    }
}
