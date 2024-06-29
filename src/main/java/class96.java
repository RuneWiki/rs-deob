import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class96 extends class489 {

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Lwk;")
    public class145 field1335;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field1337 = 0;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "S")
    public static short field1336 = 256;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "Lcv;")
    public static class570 field1334;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V")
    public static void method773(byte arg0) {
        if (arg0 >= -77) {
            method773((byte) -75);
        }
        field1334 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)[Lwaa;")
    public static final class705[] method774(int arg0) {
        if (arg0 > -69) {
            return null;
        } else {
            field1338++;
            return new class705[] { class7.field75, class571.field8031, class10.field130, class762.field10627, class16.field325, class141.field2002 };
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lij;II[B)V")
    public class96(class424 arg0, int arg1, int arg2, byte[] arg3) {
        this.field1335 = arg0.method2376(arg3, class522.field7319, arg1, arg2, false, 106);
        this.field1335.method813((byte) -122, false, false);
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lij;II[I)V")
    public class96(class424 arg0, int arg1, int arg2, int[] arg3) {
        this.field1335 = arg0.method2407(103, false, arg3, arg2, arg1);
        this.field1335.method813((byte) 58, false, false);
    }
}
