import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class114 {

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "Lsc;")
    public static class181 field1851 = class149.method967(255, "Fps:");

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Lsc;")
    private static class181 field1847 = class149.method967(255, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[Lsc;")
    public static class181[] field1852 = new class181[8];

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lsc;")
    private static class181 field1846 = class149.method967(255, "Location");

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "[Z")
    public static boolean[] field1849 = new boolean[100];

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "Lsc;")
    public static class181 field1856 = field1846;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "Lsc;")
    public static class181 field1854 = class149.method967(255, "VOLL");

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lsc;")
    public static class181 field1848 = field1847;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lpe;")
    public static class245 field1853;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lng;")
    public static class46 field1857;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method753(byte arg0) {
        if (arg0 < 107) {
            return;
        }
        field1847 = null;
        field1853 = null;
        field1854 = null;
        field1849 = null;
        field1852 = null;
        field1846 = null;
        field1851 = null;
        field1857 = null;
        field1856 = null;
        field1848 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(JI)V")
    public static final void method754(long arg0, int arg1) {
        if (arg1 != 26934) {
            method754(5L, -107);
        }
        field1858++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)V")
    public static final void method755(int arg0, int arg1) {
        class76.field1222 = -1;
        if (arg1 != 20061) {
            return;
        }
        if (arg0 == 37) {
            class108.field1775 = 3.0F;
        } else if (arg0 == 50) {
            class108.field1775 = 4.0F;
        } else if (arg0 == 75) {
            class108.field1775 = 6.0F;
        } else {
            class108.field1775 = 8.0F;
        }
        class76.field1222 = -1;
        field1850++;
    }
}
