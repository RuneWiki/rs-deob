import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class313 {

    @OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
    public int field4340;

    @OriginalMember(owner = "client!lfa", name = "g", descriptor = "I")
    public static int field4342 = 2;

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!lfa", name = "d", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!lfa", name = "f", descriptor = "Lpda;")
    public static class138 field4341;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "Ldu;")
    public static class383 field4336;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(BII)Z")
    public static final boolean method1893(byte arg0, int arg1, int arg2) {
        if (arg0 <= 15) {
            field4339 = -37;
        }
        field4337++;
        if ((class425.method2499(arg2, arg1, (byte) 48) | (arg2 & 0x10000) != 0) || class662.method3722(arg2, 11322, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class229.method1499(arg1, arg2, 24314);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4338++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method1894(int arg0) {
        field4336 = null;
        field4341 = null;
        if (arg0 != 15150) {
            field4342 = -102;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(II)V")
    public class313(int arg0, int arg1) {
        this.field4340 = arg0;
    }
}
