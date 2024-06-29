import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class316 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
    public static boolean field4178 = false;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4175 = 1407;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4180 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4176;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "[[B")
    public static byte[][] field4174;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BJ)V", line = 17)
    public static final void method1733(byte arg0, long arg1) {
        field4176++;
        try {
            Thread.sleep(arg1);
            int var3 = 53 / ((arg0 - 51) / 59);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Z)V", line = 34)
    public static void method1734(boolean arg0) {
        if (arg0) {
            field4174 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)Z", line = 49)
    public static final boolean method1735(int arg0) {
        if (arg0 == 0) {
            field4179++;
            return class475.field6540 > 0;
        } else {
            return true;
        }
    }
}
