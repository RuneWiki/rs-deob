import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 {

    @OriginalMember(owner = "mapview!f", name = "b", descriptor = "Lu;")
    public static class38 field104 = class9.method45(-41, "Mini)2Game");

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "Lu;")
    public static class38 field105 = class9.method45(-41, "Tannery");

    @OriginalMember(owner = "mapview!f", name = "d", descriptor = "Lu;")
    public static class38 field106 = class9.method45(-41, "Hunter Training");

    @OriginalMember(owner = "mapview!f", name = "e", descriptor = "Lu;")
    public static class38 field107 = class9.method45(-41, "Food Shop");

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "Lu;")
    public static class38 field113 = class9.method45(-41, "Transportation");

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "mapview!f", name = "i", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "mapview!f", name = "f", descriptor = "J")
    public static long field108;

    @OriginalMember(owner = "mapview!f", name = "g", descriptor = "[I")
    public static int[] field109;

    @OriginalMember(owner = "mapview!f", name = "h", descriptor = "[I")
    public static int[] field110;

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "[I")
    public static int[] field112;

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(III)B", line = 38)
    public static final byte method60(int arg0, int arg1, int arg2) {
        int var3 = arg2 >> 6;
        int var4 = arg0 >> 6;
        if (arg1 != 63) {
            field106 = null;
        }
        if (class31.field379[var4][var3] == null) {
            return 0;
        } else if (class31.field379[var4][var3].field445 == null) {
            return class31.field379[var4][var3].field449;
        } else {
            return class31.field379[var4][var3].field445[(arg0 & 0xFC0) + arg2 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(I)V", line = 83)
    public static void method61(int arg0) {
        field106 = null;
        field107 = null;
        field110 = null;
        field113 = null;
        if (arg0 != 22630) {
            field109 = null;
        }
        field109 = null;
        field112 = null;
        field105 = null;
        field104 = null;
    }
}
