import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class30 {

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public int field478 = 128;

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
    public int field489 = 128;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "I")
    public int field484;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "Lgg;")
    public static class114 field487 = new class114(50);

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "Lgg;")
    public static class114 field488 = new class114(64);

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
    public static int[] field490 = new int[3];

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)[I", line = 6)
    public static final int[] method298(int arg0) {
        field485++;
        if (arg0 != 64) {
            method298(59);
        }
        return new int[] { class14.field199, class275.field3484, class238.field3073 };
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(I)V", line = 90)
    public class30(int arg0) {
        this.field486 = arg0;
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(IIIIII)V", line = 97)
    private class30(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field483 = arg3;
        this.field481 = arg5;
        this.field486 = arg0;
        this.field484 = arg4;
        this.field478 = arg1;
        this.field489 = arg2;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lnia;I)V", line = 28)
    public final void method299(class30 arg0, int arg1) {
        this.field484 = arg0.field484;
        this.field486 = arg0.field486;
        field480++;
        this.field489 = arg0.field489;
        this.field478 = arg0.field478;
        this.field483 = arg0.field483;
        this.field481 = arg0.field481;
        if (arg1 != 128) {
            this.method299(null, -24);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIII)V", line = 44)
    public static final void method300(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field482++;
        int var8 = 19 / ((arg0 - 10) / 58);
        if (arg4 == arg6) {
            class734.method4110(arg3, arg5, arg2, arg7, arg6, false, arg1);
        } else if ((arg2 - arg6) >= class108.field1334 && (arg2 + arg6) <= class592.field8242 && class112.field1386 <= arg1 - arg4 && class328.field4190 >= (arg1 + arg4)) {
            class670.method3623(arg6, arg2, arg3, arg7, -1, arg4, arg5, arg1);
        } else {
            class15.method192(arg2, arg5, arg4, arg6, (byte) -126, arg1, arg7, arg3);
        }
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)Lnia;", line = 71)
    public final class30 method301(int arg0) {
        field479++;
        return arg0 == 128 ? new class30(this.field486, this.field478, this.field489, this.field483, this.field484, this.field481) : null;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)V", line = 113)
    public static void method302(byte arg0) {
        field487 = null;
        field488 = null;
        field490 = null;
        if (arg0 <= 125) {
            field487 = null;
        }
    }
}
