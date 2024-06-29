import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class114 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[Lrt;")
    public static class489[] field1524 = new class489[37];

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field1525 = 1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field1526;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field1529;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method730(int arg0) {
        if (arg0 != 37) {
            method731(113, null);
        }
        field1524 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILha;)V")
    public static final void method731(int arg0, class548 arg1) {
        class1.field14 = class548.method3245(50, class261.field3774, arg1, true);
        field1530++;
        class488.field6818 = class145.method941(arg1, (byte) 87, class261.field3774);
        class272.field3950 = class548.method3245(-119, class486.field6799, arg1, true);
        class524.field7280 = class145.method941(arg1, (byte) 87, class486.field6799);
        class758.field10575 = class548.method3245(123, class453.field6276, arg1, true);
        class535.field7417 = class145.method941(arg1, (byte) 87, class453.field6276);
        if (arg0 != -29269) {
            field1525 = 69;
        }
    }
}
