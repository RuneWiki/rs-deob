import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class373 extends InputStream {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Luv;")
    public static class2 field5640 = new class2(6, 8);

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "[C")
    public static char[] field5643 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lgu;")
    public static class101 field5641;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIZIIII)V")
    public static final void method2216(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class16.field272 = arg1;
        class452.field6649 = arg4;
        class94.field1456 = arg3;
        field5644++;
        class175.field2589 = arg6;
        class117.field1753 = arg0;
        if (arg5 != 128) {
            field5641 = null;
        }
        if (arg2 && class117.field1753 >= 100) {
            class282.field4263 = class94.field1456 * 128 + 64;
            class393.field5897 = class16.field272 * 128 + 64;
            class201.field2925 = class50.method373(class521.field7651, 14966, class393.field5897, class282.field4263) - class175.field2589;
        }
        class350.field5388 = 2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method2217(int arg0) {
        field5641 = null;
        if (arg0 < 3) {
            field5642 = -14;
        }
        field5643 = null;
        field5640 = null;
    }

    @OriginalMember(owner = "client!wc", name = "read", descriptor = "()I")
    public final int read() {
        field5639++;
        class389.method2332(112, 30000L);
        return -1;
    }
}
