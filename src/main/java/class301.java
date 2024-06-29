import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class301 extends class467 {

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public int field4449;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
    public static int field4445 = 1337;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
    public static int field4444;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "[[S")
    public static short[][] field4446;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 5)
    public static final boolean method1939(byte arg0, String arg1) {
        if (arg0 >= -18) {
            return false;
        } else {
            field4444++;
            return class438.method2631(arg1, true, 10, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(II)V", line = 26)
    public class301(int arg0, int arg1) {
        this.field4449 = arg0;
        this.field4448 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 35)
    public static void method1940(int arg0) {
        field4446 = null;
        if (arg0 != 14184) {
            field4447 = -111;
        }
    }
}
