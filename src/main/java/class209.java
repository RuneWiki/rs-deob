import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class209 extends class321 {

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Lwba;")
    public class537 field2842;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "[J")
    public static long[] field2840 = new long[32];

    @OriginalMember(owner = "client!er", name = "u", descriptor = "S")
    public static short field2841 = 1;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 3)
    public static void method1334(byte arg0) {
        field2840 = null;
        if (arg0 != -79) {
            method1334((byte) 118);
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lwba;)V", line = 34)
    public class209(class537 arg0) {
        this.field2842 = arg0;
    }
}
