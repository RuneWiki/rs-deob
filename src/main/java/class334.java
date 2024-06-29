import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class334 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field4512 = 0;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Ljia;")
    public static class645 field4513 = new class645();

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lvl;")
    public static class15 field4515 = new class15(58, 7);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Lgs;")
    public static class49 field4514;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 11)
    public static void method2096(byte arg0) {
        field4514 = null;
        field4513 = null;
        if (arg0 < 91) {
            method2096((byte) 56);
        }
        field4515 = null;
    }
}
