import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class230 {

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3048 = 0;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3050 = 0;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "Lvg;")
    public static class622 field3049 = new class622(48, 10);

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lpl;")
    public static class215 field3051;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method1431(byte arg0) {
        if (arg0 <= 24) {
            field3048 = -105;
        }
        field3051 = null;
        field3049 = null;
    }
}
