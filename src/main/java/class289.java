import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class289 {

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "J")
    public long field4574 = 0L;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "[[S")
    public static short[][] field4565 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "[[[I")
    public static int[][][] field4576 = new int[2][][];

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field4566;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field4567;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public int field4570;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public int field4571;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field4573;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field4575;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public int field4577;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lik;")
    public class260 field4581;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)Lmi;")
    public static final class259 method1932(int arg0) {
        if (arg0 > -46) {
            method1933(25);
        }
        field4568++;
        class259 var1 = (class259) class56.field951.method766((byte) -127);
        if (var1 != null) {
            var1.method1388(-110);
            var1.method40(0);
            return var1;
        }
        class259 var2;
        do {
            var2 = (class259) class36.field555.method766((byte) -127);
            if (var2 == null) {
                return null;
            }
            if (var2.method1769(true) > class276.method1861((byte) 122)) {
                return null;
            }
            var2.method1388(89);
            var2.method40(0);
        } while ((var2.field48 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
    public static void method1933(int arg0) {
        if (arg0 != 4574) {
            method1932(-120);
        }
        field4565 = null;
        field4576 = null;
    }
}
