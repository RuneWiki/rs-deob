import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class185 extends class280 {

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public static int field2987 = -1;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field2988 = 0;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "B")
    public byte field2982;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "C")
    public static char field2985;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "Ljava/lang/String;")
    public String field2981;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "Ljava/lang/String;")
    public String field2983;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
    public static final void method1374(int arg0, int arg1) {
        if (arg1 > 39) {
            field2991++;
            class141.field2271.method1548(arg0, 0);
            class96.field1414.method1548(arg0, 0);
            class189.field3055.method1548(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(ICI)I")
    public static final int method1375(int arg0, char arg1, int arg2) {
        if (arg2 <= 99) {
            return 49;
        }
        int var3 = arg1 << 4;
        field2989++;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }
}
