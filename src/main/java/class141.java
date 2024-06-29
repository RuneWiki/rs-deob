import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class141 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public int field1862 = -1;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field1869 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "Lwf;")
    public static class79 field1874 = new class79(7, 7);

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
    public static int field1875 = 0;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "Lwf;")
    public static class79 field1879;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "Ldk;")
    public static class326 field1880;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "Lmt;")
    public static class249 field1881;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "[J")
    public static long[] field1882;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "I")
    public int field1863;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1864;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "I")
    public int field1865;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "I")
    public int field1868;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "I")
    public int field1872;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "Lnp;")
    public static class313 field1878;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static final void method887(int arg0) {
        if (arg0 != 24) {
            method888(64);
        }
        class398.field5648 = true;
        field1870++;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)[Lae;")
    public static final class150[] method888(int arg0) {
        if (arg0 != 23654) {
            field1869 = null;
        }
        if (class75.field927 == null) {
            class150[] var1 = class277.method1755(class252.field3718, -12867);
            class150[] var2 = new class150[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class150 var8 = var1[var4];
                if ((var8.field2237 <= 0 || var8.field2237 >= 24) && var8.field2240 >= 800 && var8.field2241 >= 600 && (class347.field5026 >= 96 || class437.field6083 != 0 || var8.field2240 <= 1024 && var8.field2241 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class150 var10 = var2[var9];
                        if (var8.field2240 == var10.field2240 && var8.field2241 == var10.field2241) {
                            if (var10.field2237 < var8.field2237) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class75.field927 = new class150[var3];
            class415.method2450(var2, 0, class75.field927, 0, var3);
            int[] var5 = new int[class75.field927.length];
            for (int var6 = 0; var6 < class75.field927.length; var6++) {
                class150 var7 = class75.field927[var6];
                var5[var6] = var7.field2241 * var7.field2240;
            }
            class311.method1925(class75.field927, var5, 15554);
        }
        field1867++;
        return class75.field927;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public static void method889(int arg0) {
        field1878 = null;
        if (arg0 != 18828) {
            field1875 = 121;
        }
        field1874 = null;
        field1879 = null;
        field1869 = null;
        field1882 = null;
        field1880 = null;
        field1881 = null;
    }

    static {
        new class326("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
        field1879 = new class79(72, -1);
        field1880 = new class326("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");
        field1881 = new class249();
        field1882 = new long[32];
    }
}
