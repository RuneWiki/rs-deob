import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class59 {

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field1162 = 0;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Ljava/lang/String;")
    public static String field1165 = "Ok";

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public int field1157;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    public int field1158;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public int field1159;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
    public int field1163;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "J")
    public long field1161;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Lsc;")
    public class19 field1154;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lsc;")
    public class19 field1155;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lsc;")
    public class19 field1166;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V", line = 9)
    public static final void method454(byte arg0, int arg1) {
        class159.field2598.method1883(2047773287, arg1);
        field1160++;
        if (arg0 >= 26) {
            class200.field3198.method1883(2047773287, arg1);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V", line = 38)
    public static void method455(int arg0) {
        field1165 = null;
        if (arg0 != 0) {
            method454((byte) -119, -21);
        }
    }
}
