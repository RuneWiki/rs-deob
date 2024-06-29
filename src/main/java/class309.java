import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class309 {

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4181 = 0;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "[[S")
    public static short[][] field4178;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public static void method1814(int arg0) {
        if (arg0 != 0) {
            method1814(56);
        }
        field4178 = null;
    }
}
