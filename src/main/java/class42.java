import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class42 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
    public static String field615 = "Loading interfaces - ";

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[Lsb;")
    public static class230[] field616;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILrf;)Lrf;")
    public static final class289 method278(int arg0, class289 arg1) {
        if (arg0 > -97) {
            return null;
        }
        class289 var2 = client.method973(arg1);
        if (var2 == null) {
            var2 = arg1.field4539;
        }
        field617++;
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method279(int arg0) {
        if (arg0 != 0) {
            method279(-120);
        }
        field616 = null;
        field615 = null;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public static final void method280(int arg0) {
        class202.method1287(0);
        field613++;
        class77.method512((byte) -121);
        class142.method872(80);
        class150.method911((byte) -108);
        class268.method1790((byte) 77);
        class297.method1990(-10393);
        class233.method1484((byte) 121);
        class278.method1841(true);
        class93.method596((byte) -99);
        class31.method207(720896);
        class69.method460(13);
        class32.method211(125);
        class13.method72((byte) 86);
        class184.method1145((byte) -109);
        class47.method317(10880);
        class92.method589((byte) 48);
        class116.method747(1);
        class50.method330((byte) -125);
        if (arg0 < 80) {
            return;
        }
        if (class241.field3603 != 0) {
            for (int var1 = 0; var1 < class283.field4233.length; var1++) {
                class283.field4233[var1] = null;
            }
            class63.field992 = 0;
        }
        class174.method1075(-42);
        class26.method165(-3166);
        class246.field3681.method1775(27147);
        ((class219) class249.field3775).method1407(116);
        class177.field2720.method118((byte) -58);
        client.field2381.method1956(1);
        class228.field3444.method1956(1);
        class265.field4001.method1956(1);
        class254.field3861.method1956(1);
        class165.field2540.method1956(1);
        class143.field2090.method1956(1);
        class192.field2959.method1956(1);
        class295.field4675.method1956(1);
        class174.field2657.method1956(1);
        class227.field3400.method1956(1);
        class176.field2697.method1956(1);
        class93.field1475.method1775(27147);
    }
}
