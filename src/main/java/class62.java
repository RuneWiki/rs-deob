import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class62 {

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "J")
    public long field1034 = 0L;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field1037 = -1;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Loa;")
    public static class99 field1042 = class221.method1463(2844, ":clan:");

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field1027;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public int field1028;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field1033;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public int field1035;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    public int field1038;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public int field1039;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "Ltg;")
    public static class182 field1041;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Luk;")
    public class98 field1029;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Luk;")
    public class98 field1032;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
    public static void method407(byte arg0) {
        if (arg0 > -121) {
            method407((byte) -113);
        }
        field1042 = null;
        field1041 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method408(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class227.field3928; var5++) {
            if (arg0 < class94.field1584[var5] + class112.field2029[var5] && class112.field2029[var5] < (arg0 + arg4) && arg3 < class51.field848[var5] + class33.field581[var5] && (arg1 + arg3) > class51.field848[var5]) {
                class173.field3057[var5] = true;
            }
        }
        field1040++;
        if (arg2 < 96) {
            field1031 = 79;
        }
    }
}
