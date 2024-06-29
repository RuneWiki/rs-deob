import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class43 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lod;")
    public static class101 field1026 = class46.method335(-91, "(U");

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1025 = 0;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1027 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lod;")
    public static class101 field1031 = class46.method335(-112, "p12_full");

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lod;")
    public static class101 field1028 = class46.method335(111, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public static volatile int field1037 = 0;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "[I")
    public static int[] field1036;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "[Lqe;")
    public static class116[] field1040;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "[[B")
    public static byte[][] field1035;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZII)I")
    public static final int method318(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field1034 = 110;
        }
        class130 var3 = (class130) class93.field1999.method1141((long) arg1, -1);
        field1024++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field2971.length > arg2) {
            return var3.field2971[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public static void method319(byte arg0) {
        field1036 = null;
        field1032 = null;
        field1028 = null;
        field1031 = null;
        field1040 = null;
        field1026 = null;
        if (arg0 > 10) {
            field1035 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)Z")
    public static final boolean method320(int arg0) {
        field1039++;
        if (arg0 <= 35) {
            method318(false, -43, -6);
        }
        return class11.field167 == 0 ? class33.field849.method58((byte) 123) : true;
    }
}
