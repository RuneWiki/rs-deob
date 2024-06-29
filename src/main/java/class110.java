import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class110 {

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
    public static final void method812(byte arg0) {
        if (arg0 == -127) {
            field1747++;
            class14.field242.method450(class182.field2745, class324.field4963, class87.field1462);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method813(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1748++;
        if ((class364.field5475[0][arg1][arg3] & 0x2) != 0) {
            return true;
        } else if ((class364.field5475[arg4][arg1][arg3] & 0x10) == 0) {
            int var5 = 69 % ((arg0 + 73) / 33);
            return arg2 == class91.method743(arg4, arg1, arg3, (byte) -121);
        } else {
            return false;
        }
    }
}
