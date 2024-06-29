import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public abstract class class140 {

    @OriginalMember(owner = "client!og", name = "a", descriptor = "[[S")
    public static short[][] field2417 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public static int field2419 = 0;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public static int field2421 = 0;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "Lbc;")
    public static class201 field2420 = new class201(4096);

    @OriginalMember(owner = "client!og", name = "f", descriptor = "[I")
    public static int[] field2422 = new int[1000];

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Lub;")
    public static class227 field2424 = class257.method1749("blinken2:", 17263);

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(B)V")
    public static void method889(byte arg0) {
        field2420 = null;
        field2417 = null;
        if (arg0 >= 11) {
            field2424 = null;
            field2422 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method890(byte arg0, Component arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method891(int arg0, Component arg1);

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(III)I")
    public static final int method892(int arg0, int arg1, int arg2) {
        int var3 = arg0;
        field2418++;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
            arg2--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)I")
    public abstract int method893(int arg0);
}
