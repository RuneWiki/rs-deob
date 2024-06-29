import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class386 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field5435 = 0;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public int field5438;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Lfa;")
    public static class209 field5437;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "Lbi;")
    public static class443 field5433;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "Lpu;")
    public static class522 field5439;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Ljava/lang/String;")
    public String field5434;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[[S")
    public static short[][] field5441;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method2305(int arg0, int arg1) {
        field5440++;
        if (arg0 != 57) {
            field5439 = null;
        }
        return arg1 == 7 || arg1 == 9;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IC)Z", line = 18)
    public static final boolean method2306(int arg0, char arg1) {
        int var2 = 32 % ((arg0 + 35) / 38);
        field5442++;
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 30)
    public static void method2307(byte arg0) {
        field5437 = null;
        field5441 = null;
        if (arg0 != -87) {
            method2307((byte) -35);
        }
        field5439 = null;
        field5433 = null;
    }
}
