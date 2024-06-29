import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class276 {

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public int field4104;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "Loi;")
    public static class53 field4102;

    @OriginalMember(owner = "client!mt", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4099++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IIIZI)V")
    public static final void method1737(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (!arg3) {
            field4100 = -126;
        }
        class215.field3118 = arg4;
        class338.field4885 = arg2;
        class127.field1712 = arg0;
        field4098++;
        class78.field1023 = arg1;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public static void method1738(byte arg0) {
        field4102 = null;
        int var1 = -119 % ((-arg0 - 45) / 58);
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(IIII)V")
    public class276(int arg0, int arg1, int arg2, int arg3) {
        this.field4105 = arg1;
        this.field4104 = arg0;
        this.field4101 = arg3;
        this.field4103 = arg2;
    }
}
