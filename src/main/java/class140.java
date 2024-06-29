import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class140 {

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lwf;")
    public static class79 field1854 = new class79(76, -1);

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "Lwf;")
    public static class79 field1855 = new class79(74, 16);

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[I")
    public static int[] field1857 = new int[1000];

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "Lkr;")
    public static class486 field1858 = new class486();

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "Ltr;")
    public static class176 field1860;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lip;")
    public static class460 field1859;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
    public static void method885(byte arg0) {
        field1859 = null;
        field1860 = null;
        if (arg0 != -97) {
            method885((byte) -108);
        }
        field1857 = null;
        field1858 = null;
        field1854 = null;
        field1855 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static final void method886(int arg0) {
        field1853++;
        if (class224.field3399.length() == 0) {
            return;
        }
        class414.method2443(false, "--> " + class224.field3399);
        class393.method2351(arg0 ^ arg0, false, class224.field3399);
        class293.field4256 = 0;
        class136.field1806 = 0;
        class224.field3399 = "";
    }
}
