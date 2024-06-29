import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class101 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljd;")
    public static class92 field2070 = class202.method1325((byte) 90, ":duelfriend:");

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Ljd;")
    public static class92 field2082 = class202.method1325((byte) 90, "hel");

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "Ljd;")
    private static class92 field2080 = class202.method1325((byte) 90, "Please enter your password)3");

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Ljd;")
    public static class92 field2079 = field2080;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static volatile int field2074 = 0;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public static int field2076 = 10;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "Ljd;")
    private static class92 field2075 = class202.method1325((byte) 90, "Loaded input handler");

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "Ljd;")
    public static class92 field2077 = field2075;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
    public static final boolean method698(int arg0) {
        field2072++;
        class196 var1 = class79.field1617;
        synchronized (class79.field1617) {
            if (class22.field526 == class193.field3773) {
                return false;
            }
            class34.field764 = class18.field453[class193.field3773];
            class120.field2426 = class114.field2294[class193.field3773];
            if (arg0 == -12501) {
                class193.field3773 = class193.field3773 + 1 & 0x7F;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method699(int arg0) {
        field2070 = null;
        field2075 = null;
        if (arg0 == -1) {
            field2080 = null;
            field2079 = null;
            field2077 = null;
            field2082 = null;
        }
    }
}
