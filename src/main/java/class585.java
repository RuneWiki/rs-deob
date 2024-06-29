import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class585 implements class243 {

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public int field8265;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public int field8255;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lkda;")
    public class388 field8257;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lcu;")
    public class219 field8264;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field8258;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8256 = 0;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "[S")
    private static short[] field8259 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "[S")
    private static short[] field8260 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[S")
    private static short[] field8266 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[[S")
    public static short[][] field8261 = new short[][] { field8259, field8266, field8260 };

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Lpia;")
    public static class94 field8254 = new class94(83, 3);

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field8262;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field8263;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field8267;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Lhs;", line = 3)
    public class325 method777(int arg0) {
        field8262++;
        return arg0 >= -8 ? null : class145.field1604;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 29)
    public static void method3362(int arg0) {
        field8259 = null;
        if (arg0 < 105) {
            method3363(111, 70, 10);
        }
        field8260 = null;
        field8254 = null;
        field8266 = null;
        field8261 = null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(ILkda;Lcu;II)V", line = 50)
    public class585(int arg0, class388 arg1, class219 arg2, int arg3, int arg4) {
        this.field8265 = arg0;
        this.field8255 = arg3;
        this.field8257 = arg1;
        this.field8264 = arg2;
        this.field8258 = arg4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)V", line = 63)
    public static final void method3363(int arg0, int arg1, int arg2) {
        if (arg1 > -125) {
            field8261 = null;
        }
        field8263++;
        class47 var3 = class258.method1546(1, arg2, (byte) 121);
        var3.method271((byte) 125);
        var3.field507 = arg0;
    }
}
