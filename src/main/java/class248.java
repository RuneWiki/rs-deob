import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class248 extends class213 {

    @OriginalMember(owner = "client!w", name = "C", descriptor = "Lhe;")
    public class133 field3610;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[I")
    public static int[] field3609 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!w", name = "z", descriptor = "I")
    public static volatile int field3607 = 0;

    @OriginalMember(owner = "client!w", name = "G", descriptor = "[I")
    public static int[] field3613 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!w", name = "y", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 5)
    public static void method1735(int arg0) {
        field3609 = null;
        if (arg0 != 7581) {
            method1736(26, -114, 79, -74, -123, -65, -64, -86);
        }
        field3613 = null;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lhe;)V", line = 25)
    public class248(class133 arg0) {
        this.field3610 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIII)V", line = 35)
    public static final void method1736(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3611++;
        if (arg6 != 4194303) {
            method1735(58);
        }
        if (arg0 >= class245.field3574 && arg5 <= class321.field4722 && class207.field2937 <= arg7 && arg4 <= class25.field292) {
            class323.method2233(arg1, arg5, arg7, arg0, arg4, (byte) -57, arg2, arg3);
        } else {
            class282.method1923(arg4, arg3, arg2, arg1, arg0, (byte) 105, arg5, arg7);
        }
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(I)V", line = 56)
    public static final void method1737(int arg0) {
        class96.field1259++;
        class251.field3681.method1309(23, 156);
        if (arg0 != 33554431) {
            field3609 = (int[]) null;
        }
        field3612++;
        class251.field3681.method2098(-112, class107.field1386);
    }
}
