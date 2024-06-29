import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class89 {

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    public int field1177 = -1;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public static int field1172 = 0;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field1167 = -1;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
    public static int[] field1180 = new int[14];

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public int field1168;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public int field1169;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public int field1171;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public int field1174;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public int field1175;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public int field1176;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public int field1182;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    public int field1183;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method562(int arg0, int arg1) {
        field1181++;
        if (arg1 < 0) {
            return false;
        }
        int var2 = class105.field1442[arg1];
        if (arg0 == 14) {
            if (var2 >= 2000) {
                var2 -= 2000;
            }
            return var2 == 1006;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 30)
    public static void method563(byte arg0) {
        field1180 = null;
        if (arg0 > -25) {
            field1172 = -61;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 68)
    public static final void method564(String arg0, byte arg1) {
        field1173++;
        if (class77.field1008 == null) {
            return;
        }
        if (arg1 <= 32) {
            field1180 = (int[]) null;
        }
        int var2 = 0;
        long var3 = class294.method2093((byte) 100, arg0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class77.field1008.length && class77.field1008[var2].field2834 != var3) {
            var2++;
        }
        if (class77.field1008.length > var2 && class77.field1008[var2] != null) {
            class328.field5282.method304(7, 19830);
            class328.field5282.method1039(class77.field1008[var2].field2834, (byte) 108);
            class323.field5136++;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBLnk;)Lcf;", line = 111)
    public static final class149 method565(int arg0, byte arg1, class16 arg2) {
        if (arg1 != -44) {
            field1167 = 18;
        }
        field1178++;
        return class313.method2208(arg2, (byte) -79, arg0) ? class131.method900(2) : null;
    }
}
