import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class96 {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1355 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1352;

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lhc;")
    public static class235 field1353;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static void method638(byte arg0) {
        if (arg0 != 27) {
            method638((byte) 80);
        }
        field1353 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Lge;")
    public static final class72 method639(byte arg0) {
        field1356++;
        class72 var1 = new class72(class21.field296, class287.field4535, class273.field4208[0], class198.field2749[0], class50.field729[0], class39.field576[0], class140.field1956[0], class9.field79);
        int var2 = -46 % ((30 - arg0) / 58);
        class15.method88(-15971);
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public static final void method640(int arg0) {
        for (class71 var1 = (class71) class34.field524.method990(-124); var1 != null; var1 = (class71) class34.field524.method993(-33)) {
            if (var1.field982) {
                var1.method439(22387);
            }
        }
        if (arg0 > -38) {
            return;
        }
        for (class71 var2 = (class71) class235.field3541.method990(-116); var2 != null; var2 = (class71) class235.field3541.method993(-117)) {
            if (var2.field982) {
                var2.method439(22387);
            }
        }
        field1354++;
    }
}
