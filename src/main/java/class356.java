import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class356 {

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static final void method2141(int arg0) {
        if (arg0 != 13086) {
            field5463 = 97;
        }
        if (class4.field37 != null) {
            class4.field37.method1629((byte) 15);
        }
        field5461++;
        if (class72.field973 != null) {
            class72.field973.method1629((byte) 15);
        }
    }
}
