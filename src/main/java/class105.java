import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class105 {

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lha;")
    public static class46 field1886 = class271.method1828("<br>", -46);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lha;")
    public static class46 field1889 = class271.method1828("Ausw-=hlen", -46);

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1882 = 0;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1890 = new int[32];

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1879 = -1;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "[I")
    public static int[] field1893 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Lha;")
    private static class46 field1894 = class271.method1828("Close", -46);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "Lha;")
    public static class46 field1881 = field1894;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lha;")
    private static class46 field1883 = class271.method1828("green:", -46);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lha;")
    public static class46 field1878 = field1883;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lha;")
    public static class46 field1895 = field1883;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lmc;")
    public static class165 field1880;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "Lpi;")
    public static class181 field1884;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method789(byte arg0) {
        field1893 = null;
        field1881 = null;
        field1883 = null;
        field1878 = null;
        field1884 = null;
        field1895 = null;
        field1886 = null;
        field1890 = null;
        field1889 = null;
        field1880 = null;
        field1894 = null;
        if (arg0 != -83) {
            field1878 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BJ)V")
    public static final void method790(byte arg0, long arg1) {
        field1887++;
        if (arg1 == 0L) {
            return;
        }
        if (arg0 != -27) {
            field1889 = null;
        }
        for (int var3 = 0; var3 < class97.field1806; var3++) {
            if (class194.field3492[var3] == arg1) {
                class97.field1806--;
                class177.field3170++;
                for (int var4 = var3; var4 < class97.field1806; var4++) {
                    class3.field37[var4] = class3.field37[var4 + 1];
                    class273.field4767[var4] = class273.field4767[var4 + 1];
                    class74.field1343[var4] = class74.field1343[var4 + 1];
                    class194.field3492[var4] = class194.field3492[var4 + 1];
                    class108.field2008[var4] = class108.field2008[var4 + 1];
                    class252.field4441[var4] = class252.field4441[var4 + 1];
                }
                class14.field219 = class86.field1635;
                class58.field967.method285((byte) -90, 69);
                class58.field967.method578((byte) -110, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLha;Z)V")
    public static final void method791(byte arg0, class46 arg1, boolean arg2) {
        field1892++;
        if (arg2) {
            try {
                class236.field4161.getAppletContext().showDocument(arg1.method337(0, class236.field4161.getCodeBase()), "_blank");
            } catch (Exception var4) {
            }
        } else {
            try {
                class236.field4161.getAppletContext().showDocument(arg1.method337(0, class236.field4161.getCodeBase()), "_top");
            } catch (Exception var3) {
            }
        }
        if (arg0 != -99) {
            field1893 = null;
        }
    }
}
