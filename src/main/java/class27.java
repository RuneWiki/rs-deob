import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class27 {

    @OriginalMember(owner = "mapview!n", name = "c", descriptor = "I")
    public static int field346 = 0;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "Lu;")
    public static class38 field344 = class28.method177("Fur Trader", (byte) -84);

    @OriginalMember(owner = "mapview!n", name = "d", descriptor = "Lu;")
    public static class38 field347 = class28.method177("sprites", (byte) -84);

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "Lu;")
    public static class38 field345 = class28.method177("Bank", (byte) -84);

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "J")
    public static long field348 = 0L;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(B)V", line = 40)
    public static void method175(byte arg0) {
        field345 = null;
        field347 = null;
        if (arg0 != 84) {
            field345 = null;
        }
        field344 = null;
    }
}
