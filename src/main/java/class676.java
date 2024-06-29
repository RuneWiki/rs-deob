import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class676 extends class616 {

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "[I")
    public int[] field9691;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "[I")
    public int[] field9694;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field9693 = 7000;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Lwo;")
    public static class690 field9692 = new class690(9, 5);

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 4)
    public static void method3839(byte arg0) {
        int var1 = -108 / ((arg0 + 11) / 38);
        field9692 = null;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)[Lsq;", line = 16)
    public static final class161[] method3840(int arg0) {
        if (arg0 < 103) {
            return null;
        } else {
            field9689++;
            return new class161[] { class9.field91, class331.field4404, class659.field9371, class141.field1770, class335.field4449, class299.field4031, class518.field7575, class557.field8055, class564.field8148, class531.field7748 };
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)V", line = 27)
    public static final void method3841(int arg0, int arg1) {
        if (class611.field8763 == 1) {
            class323.field4283 = arg0;
        } else if (class611.field8763 == 2 || class611.field8763 == 3) {
            class48.field816 = arg0;
        }
        if (arg1 < -2) {
            field9690++;
        }
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(II[I[I)V", line = 52)
    public class676(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field9691 = arg2;
        this.field9694 = arg3;
    }
}
