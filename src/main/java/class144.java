import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class144 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "F")
    public static float field2156 = 0.0F;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field2158 = 0;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field2159 = 0;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1015(int arg0) {
        class21.field313.method1541(125, 45);
        field2155++;
        class35.field472++;
        if (arg0 != -797) {
            method1016((byte) -60, (String) null);
        }
        class21.field313.method1375(0L, 117);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 20)
    public static final boolean method1016(byte arg0, String arg1) {
        if (arg0 != 4) {
            field2156 = 0.6653525F;
        }
        field2160++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class271.field4291; var2++) {
            if (arg1.equalsIgnoreCase(class100.field1525[var2])) {
                return true;
            }
        }
        return false;
    }
}
