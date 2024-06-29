import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class244 {

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field3403 = -1;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "[[S")
    public static short[][] field3402 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "Lej;")
    public static class104 field3407 = new class104("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field3410 = 0;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field3400;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field3401;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field3406;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public int field3408;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)Lui;")
    public static final class193 method1515(byte arg0) {
        field3405++;
        try {
            int var1 = 34 / ((63 - arg0) / 49);
            return new class273();
        } catch (Throwable var3) {
            try {
                return (class193) Class.forName("ek").getDeclaredConstructor().newInstance();
            } catch (Throwable var2) {
                return new class70();
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)V")
    public static void method1516(byte arg0) {
        field3407 = null;
        int var1 = 80 / ((60 - arg0) / 43);
        field3402 = null;
    }
}
