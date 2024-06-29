import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class65 extends class46 {

    @OriginalMember(owner = "client!g", name = "v", descriptor = "J")
    public long field1022;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field1018 = 0;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1023 = "green:";

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field1020 = new String[5];

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ll;I)V", line = 22)
    public static final void method493(class133 arg0, int arg1) {
        field1021++;
        if (arg1 >= -39) {
            field1023 = (String) null;
        }
        class189.field2836 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 39)
    public class65() {
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V", line = 43)
    public static void method494(boolean arg0) {
        field1020 = null;
        if (arg0) {
            field1023 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(J)V", line = 52)
    public class65(long arg0) {
        this.field1022 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(Z)V", line = 64)
    public static final void method495(boolean arg0) {
        field1017++;
        if (!arg0) {
            field1020 = (String[]) null;
        }
        class247.field3918.method2174(-10385);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 78)
    public static final void method496(byte arg0) {
        if (arg0 != 96) {
            method493((class133) null, 85);
        }
        class217.field3298.method2174(arg0 - 10481);
        field1015++;
    }
}
