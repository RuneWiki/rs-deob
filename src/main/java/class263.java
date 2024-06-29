import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class263 implements class637 {

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field3448;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public int field3441;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Lee;")
    public class676 field3444;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lhaa;")
    public class82 field3446;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public int field3447;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[I")
    public static int[] field3442 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "J")
    public static long field3443;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 5)
    public static void method1579(int arg0) {
        field3442 = null;
        if (arg0 != 10003) {
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)Lhda;", line = 15)
    public class750 method333(int arg0) {
        field3440++;
        if (arg0 != 30778) {
            this.method333(-3);
        }
        return class268.field3558;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(ILee;Lhaa;II)V", line = 38)
    public class263(int arg0, class676 arg1, class82 arg2, int arg3, int arg4) {
        this.field3448 = arg4;
        this.field3441 = arg0;
        this.field3444 = arg1;
        this.field3446 = arg2;
        this.field3447 = arg3;
    }
}
