import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class138 extends class16 {

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    public int field3125 = -1;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    public int field3106 = 0;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Lje;")
    public static class67 field3112 = class85.method592(255, "(U1");

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public static int field3116 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "Lje;")
    private static class67 field3117 = class85.method592(255, "slide:");

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "Lje;")
    public static class67 field3115 = field3117;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "I")
    public static int field3109 = 0;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "Lje;")
    public static class67 field3130 = field3117;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    public static int field3104;

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    public int field3107;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
    public int field3111;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public int field3113;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public int field3114;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public int field3118;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public int field3119;

    @OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
    public int field3120;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public int field3122;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    public int field3127;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "Lkc;")
    public static class72 field3108;

    @OriginalMember(owner = "client!tf", name = "S", descriptor = "[I")
    public static int[] field3121;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "[Lnb;")
    public static class92[] field3110;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
    public static final void method1048(byte arg0) {
        class92.field2069.method767(1);
        field3123++;
        if (arg0 > -45) {
            field3109 = 27;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V")
    public static void method1049(int arg0) {
        field3115 = null;
        field3108 = null;
        if (arg0 != -1) {
            return;
        }
        field3117 = null;
        field3130 = null;
        field3112 = null;
        field3121 = null;
        field3110 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lje;")
    public static final class67 method1050(int arg0, int arg1) {
        field3104++;
        if (arg1 > -22) {
            return null;
        } else {
            class67 var2 = new class67();
            var2.field1324 = new byte[arg0];
            var2.field1307 = 0;
            return var2;
        }
    }
}
