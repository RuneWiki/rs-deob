import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class233 {

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "[I")
    public static int[] field3452 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "[I")
    public static int[] field3454 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "[I")
    public static int[] field3450 = new int[14];

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "Lqaa;")
    public static class309 field3457;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Lvo;")
    public static class345 field3455;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "Liga;")
    public static class78 field3451;

    @OriginalMember(owner = "client!tw", name = "toString", descriptor = "()Ljava/lang/String;", line = 6)
    public final String toString() {
        field3458++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)Lvp;", line = 16)
    public static final class613 method1530(int arg0) {
        field3456++;
        int var1 = 81 % ((arg0 - 36) / 56);
        class603.field8672 = 0;
        return class225.method1489(true);
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)V", line = 33)
    public static final void method1531(byte arg0) {
        class332.method1977(true, 2, 22050, class525.field7713.field5963);
        field3453++;
        class313.field4341 = class8.method36(22050, class653.field9220, 3, class126.field2061, 0);
        class23.method219(true, class236.method1544(-26634, null), (byte) 10);
        class183.field2894 = class8.method36(2048, class653.field9220, 3, class126.field2061, 1);
        class387.field5675 = new class524();
        class183.field2894.method1052(25185, class387.field5675);
        class211.field3228 = new class282(22050, class616.field8814);
        class333.field4635 = class97.field1451.method2083(2, "scape main");
        if (arg0 >= -32) {
            field3451 = null;
        }
        class468.method2768((byte) -110);
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V", line = 64)
    public static void method1532(int arg0) {
        field3454 = null;
        field3452 = null;
        field3455 = null;
        if (arg0 == 0) {
            field3450 = null;
            field3457 = null;
            field3451 = null;
        }
    }
}
