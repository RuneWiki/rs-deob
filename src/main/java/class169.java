import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class169 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lid;")
    public static class149 field3131 = class60.method382(" <col=ffff00>", (byte) 110);

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "Lid;")
    public static class149 field3135 = class60.method382("voudrait faire un -Bchange avec vous)3", (byte) 63);

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field3137 = 0;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "Lid;")
    public static class149 field3136 = class60.method382("Musik)2Engine vorbereitet)3", (byte) 79);

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public static int field3134 = -1;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Lal;")
    public static class230 field3133;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
    public static final int method1220(byte arg0, int arg1) {
        field3132++;
        return arg1 == 255 ? arg0 & 0xFF : 1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3131 = null;
        if (arg0 != -1) {
            method1221(111);
        }
        field3136 = null;
        field3135 = null;
        field3133 = null;
    }
}
