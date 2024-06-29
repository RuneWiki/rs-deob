import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class290 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lsw;")
    public static class641 field3763 = new class641(64);

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3767 = 52;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lvj;")
    public static class373 field3768 = new class373(33, -2);

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[C")
    public static char[] field3770 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "F")
    public static float field3769;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lhe;")
    public static class310 field3764;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lss;")
    public static class364 field3765;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lsi;")
    public static class478 field3771;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILvi;)I", line = 5)
    public static final int method1628(int arg0, class459 arg1) {
        field3766++;
        class74 var2 = arg1.field6334;
        if (var2.field800 != null) {
            var2 = var2.method420(class281.field3700, 123);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field806;
        class352 var4 = arg1.method2704(0);
        if (arg1.field6430) {
            var3 = var2.field872;
        } else if (arg1.field6474 == var4.field4543 || arg1.field6474 == var4.field4565 || arg1.field6474 == var4.field4546 || arg1.field6474 == var4.field4574) {
            var3 = var2.field823;
        } else if (arg1.field6474 == var4.field4557 || arg1.field6474 == var4.field4575 || arg1.field6474 == var4.field4558 || arg1.field6474 == var4.field4547) {
            var3 = var2.field864;
        }
        int var5 = 28 % ((-arg0 - 14) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "toString", descriptor = "()Ljava/lang/String;", line = 47)
    public final String toString() {
        field3762++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 60)
    public static void method1629(int arg0) {
        field3771 = null;
        field3763 = null;
        field3764 = null;
        field3768 = null;
        field3765 = null;
        field3770 = null;
        if (arg0 != 32) {
            field3764 = null;
        }
    }
}
