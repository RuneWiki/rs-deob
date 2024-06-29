import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public class class31 {

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!mca", name = "b", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!mca", name = "c", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!mca", name = "d", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(III)V")
    public static final void method206(int arg0, int arg1, int arg2) {
        field414++;
        if (class696.field9784 == class649.field9170) {
            if (class453.method2713(0, false, 1, (byte) -112, -2, 1, arg0, arg2, 0)) {
                return;
            }
            class453.method2713(0, false, 1, (byte) -112, -3, 1, arg0, arg2, 0);
        } else if (class453.method2713(0, false, 1, (byte) 121, -3, 1, arg0, arg2, 0)) {
            return;
        } else {
            class453.method2713(0, false, 1, (byte) 24, -2, 1, arg0, arg2, 0);
        }
        if (arg1 < 96) {
            field415 = -118;
        }
    }

    @OriginalMember(owner = "client!mca", name = "a", descriptor = "(II[B)I")
    public static final int method207(int arg0, int arg1, byte[] arg2) {
        field412++;
        return arg1 == 0 ? class573.method3334(arg2, 0, arg0, (byte) -76) : 22;
    }
}
