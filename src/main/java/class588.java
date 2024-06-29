import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class588 {

    @OriginalMember(owner = "client!su", name = "c", descriptor = "Lla;")
    private class423 field8371;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "I")
    public int field8369;

    @OriginalMember(owner = "client!su", name = "e", descriptor = "Leda;")
    public static class14 field8373 = new class14();

    @OriginalMember(owner = "client!su", name = "f", descriptor = "Lgr;")
    public static class530 field8374 = new class530(58, 2);

    @OriginalMember(owner = "client!su", name = "b", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!su", name = "d", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIZIBI)V", line = 9)
    public static final void method3458(int arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != -64) {
            method3460(-90, -44, -37, 9, 125);
        }
        field8370++;
        if ((arg3 ? class243.field3580.field7969.method3577(false) : class243.field3580.field7989.method3577(false)) != 0 && arg0 != 0 && class279.field3914 < 50 && arg1 != -1) {
            class585.field8346[class279.field3914++] = new class105((byte) (arg3 ? 3 : 2), arg1, arg0, arg2, arg6, 0, arg4, null);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(B)V", line = 28)
    public static void method3459(byte arg0) {
        field8373 = null;
        if (arg0 != -43) {
            field8373 = null;
        }
        field8374 = null;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method3460(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8372++;
        int var5 = class188.field2634;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class4.field26 = arg0;
            class562.field8141 = arg3;
            class713.field10043 = arg1;
            class188.field2634 = 2;
            class603.field8551 = arg2;
        } else if (var5 == 2) {
            if (class4.field26 < arg0) {
                class4.field26 = arg0;
            }
            if (arg2 < class603.field8551) {
                class603.field8551 = arg2;
            }
            if (arg1 > class713.field10043) {
                class713.field10043 = arg1;
            }
            if (class562.field8141 > arg3) {
                class562.field8141 = arg3;
            }
        } else if (arg4 != 58) {
            method3459((byte) 0);
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 110)
    public class588(class315 arg0, int arg1, class423 arg2) {
        new class348(64);
        this.field8371 = arg2;
        this.field8369 = this.field8371.method2616(15, 0);
    }
}
