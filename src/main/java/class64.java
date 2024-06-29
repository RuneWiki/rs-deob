import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class64 {

    @OriginalMember(owner = "client!me", name = "h", descriptor = "I")
    public int field1097 = -1;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Lmb;")
    public static class96 field1105 = class243.method1708("loc", (byte) 102);

    @OriginalMember(owner = "client!me", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1099 = Calendar.getInstance();

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lmb;")
    public static class96 field1106 = class243.method1708("www", (byte) 103);

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lmb;")
    public static class96 field1107 = class243.method1708("Konfig geladen)3", (byte) 121);

    @OriginalMember(owner = "client!me", name = "s", descriptor = "Lmb;")
    public static class96 field1108 = class243.method1708(" loggt sich ein)3", (byte) 111);

    @OriginalMember(owner = "client!me", name = "a", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "I")
    public int field1091;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!me", name = "e", descriptor = "I")
    public int field1094;

    @OriginalMember(owner = "client!me", name = "f", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!me", name = "g", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!me", name = "i", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    public int field1102;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field1103;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field1104;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)Z")
    public static final boolean method451(int arg0, int arg1) {
        field1100++;
        int var2 = 108 / ((arg1 + 35) / 35);
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
    public static final void method452(int arg0) {
        field1093++;
        int var1 = -112 / ((arg0 + 83) / 36);
        class241.field4190.method83(0);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
    public static void method453(byte arg0) {
        field1107 = null;
        field1106 = null;
        field1105 = null;
        field1108 = null;
        field1099 = null;
        if (arg0 >= -26) {
            field1099 = null;
        }
    }
}
