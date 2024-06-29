import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class164 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "F")
    public static float field2255;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)I", line = 9)
    public static final int method1177(int arg0, int arg1) {
        field2252++;
        return arg1 == 255 ? arg0 & 0xFF : 11;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLkm;)V", line = 21)
    public static final void method1178(byte arg0, class133 arg1) {
        class134.field1854 = arg1.method964(22, "runes");
        field2253++;
        if (arg0 < 92) {
            method1178((byte) -105, (class133) null);
        }
    }
}
