import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class189 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Ldh;")
    public static class320 field2240 = new class320(14, 8);

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Ldh;")
    public static class320 field2241 = new class320(3, 6);

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field2242 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        int var1 = 119 % (arg0 / 61);
        field2240 = null;
        field2241 = null;
    }
}
