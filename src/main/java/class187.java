import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class187 {

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "Lpi;")
    public static class340 field2439 = new class340(9, -1);

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "Lpb;")
    public static class296 field2442 = new class296("", 17);

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "Lph;")
    public static class358 field2441;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "[[B")
    public static byte[][] field2443;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1233(boolean arg0) {
        field2441 = null;
        if (arg0) {
            field2443 = null;
        }
        field2442 = null;
        field2443 = null;
        field2439 = null;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method1234(int arg0, int arg1, int arg2) {
        field2440++;
        if (arg2 != 9) {
            field2444 = 102;
        }
        return ((arg1 & 0x2000) != 0 | class127.method810(arg0, arg1, arg2 ^ 0xFFFFFFC7) | class276.method1701(arg0, arg1, -1)) & class349.method2053(arg0, arg1, 256);
    }
}
