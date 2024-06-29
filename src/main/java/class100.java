import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class100 {

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lha;")
    public static class46 field1839 = class271.method1828("::breakcon", -46);

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public static volatile int field1846 = -1;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lha;")
    public static class46 field1847 = class271.method1828("Speicher wird zugewiesen)3", -46);

    @OriginalMember(owner = "client!je", name = "f", descriptor = "Lha;")
    private static class46 field1844 = class271.method1828("You can(Wt add yourself to your own ignore list)3", -46);

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Lha;")
    public static class46 field1845 = field1844;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lha;")
    private static class46 field1848 = class271.method1828("Continue", -46);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lha;")
    public static class46 field1842 = field1848;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1850 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "Lha;")
    public static class46 field1849 = null;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field1840;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILhi;)Lhi;")
    public static final class24 method766(int arg0, class24 arg1) {
        field1840++;
        if (arg1.field440 != -1) {
            return class13.method73(1506528624, arg1.field440);
        }
        int var2 = arg1.field374 >>> 16;
        class212 var3 = new class212(class93.field1727);
        if (arg0 > -91) {
            method767(48);
        }
        for (class31 var4 = (class31) var3.method1499((byte) -3); var4 != null; var4 = (class31) var3.method1495((byte) 93)) {
            if (var4.field582 == var2) {
                return class13.method73(1506528624, (int) var4.field1195);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method767(int arg0) {
        field1847 = null;
        field1842 = null;
        field1845 = null;
        field1839 = null;
        if (arg0 == 0) {
            field1848 = null;
            field1849 = null;
            field1844 = null;
        }
    }
}
