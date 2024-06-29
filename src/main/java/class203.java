import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class203 {

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "Z")
    public static boolean field2966 = false;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "Lpi;")
    public static class342 field2965 = new class342("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field2971 = 0;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[[S")
    public static short[][] field2972 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Liv;")
    public static class64 field2970 = new class64(44, 6);

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field2973 = 0;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lfc;")
    public static class169 field2969;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
    public static void method1397(int arg0) {
        field2969 = null;
        field2972 = null;
        field2965 = null;
        if (arg0 >= 12) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)[Lkr;")
    public static final class524[] method1398(int arg0) {
        if (arg0 != 0) {
            method1399((byte) 127);
        }
        if (class208.field3006 == null) {
            class524[] var1 = class55.method482((byte) 126, class368.field5553);
            class524[] var2 = new class524[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class524 var8 = var1[var4];
                if ((var8.field7773 <= 0 || var8.field7773 >= 24) && var8.field7774 >= 800 && var8.field7770 >= 600 && (class457.field6854 >= 96 || class169.field2624 != 0 || var8.field7774 <= 1024 && var8.field7770 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class524 var10 = var2[var9];
                        if (var8.field7774 == var10.field7774 && var8.field7770 == var10.field7770) {
                            if (var10.field7773 < var8.field7773) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class208.field3006 = new class524[var3];
            class73.method592(var2, 0, class208.field3006, 0, var3);
            int[] var5 = new int[class208.field3006.length];
            for (int var6 = 0; var6 < class208.field3006.length; var6++) {
                class524 var7 = class208.field3006[var6];
                var5[var6] = var7.field7774 * var7.field7770;
            }
            class352.method2238(false, var5, class208.field3006);
        }
        field2967++;
        return class208.field3006;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V")
    public static final void method1399(byte arg0) {
        class54.method479(false, (byte) 126);
        int var1 = -52 / ((arg0 - 38) / 60);
        field2968++;
        if (class6.field132 >= 0 && class6.field132 != 0) {
            class388.method2394(25, class6.field132);
            class6.field132 = -1;
        }
    }
}
