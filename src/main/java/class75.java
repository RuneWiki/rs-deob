import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class75 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field1108 = 0;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field1110 = -1;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "[I")
    public static int[] field1109;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 9)
    public static void method696(boolean arg0) {
        if (arg0) {
            method696(true);
        }
        field1109 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLug;)V", line = 19)
    public final void method697(byte arg0, class25 arg1) {
        field1112++;
        while (true) {
            int var3 = arg1.method281(-124);
            if (var3 == 0) {
                if (arg0 <= 31) {
                    this.method697((byte) -58, (class25) null);
                }
                return;
            }
            this.method698(arg1, 66, var3);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lug;II)V", line = 52)
    private final void method698(class25 arg0, int arg1, int arg2) {
        if (arg1 > 23) {
            field1111++;
            if (arg2 == 5) {
                this.field1108 = arg0.method314((byte) 89);
            }
        }
    }
}
