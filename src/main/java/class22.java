import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class22 extends class16 {

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "Lt;")
    public static class31 field265 = class11.method64(94, "General Store");

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lt;")
    public static class31 field263 = class11.method64(-53, "mapfunction");

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "Lt;")
    public static class31 field264 = class11.method64(105, "");

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "mapview!l", name = "n", descriptor = "Lq;")
    public static class29 field268;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(IJ)V", line = 21)
    public static final void method111(int arg0, long arg1) {
        if ((long) arg0 >= arg1) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class2.method34(arg1 - 1L, (byte) 38);
            class2.method34(1L, (byte) 38);
        } else {
            class2.method34(arg1, (byte) 38);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 70)
    public static void method112(int arg0) {
        field264 = null;
        if (arg0 != 0) {
            field266 = -49;
        }
        field268 = null;
        field265 = null;
        field263 = null;
    }
}
