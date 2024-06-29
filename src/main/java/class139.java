import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class139 {

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "S")
    public static short field2175 = 256;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "Ltm;")
    public static class334 field2174 = new class334(21, 6);

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Lraa;")
    public static class353 field2176 = null;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 14)
    public static void method1091(byte arg0) {
        if (arg0 != 43) {
            method1091((byte) 48);
        }
        field2174 = null;
        field2176 = null;
    }
}
