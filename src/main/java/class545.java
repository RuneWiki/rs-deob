import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class545 extends class701 {

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "B")
    public byte field7446 = 5;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "Z")
    public static boolean field7450 = false;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "[I")
    public static int[] field7453 = new int[1];

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "Ltt;")
    public static class338 field7449 = new class338(79, 7);

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "Ltca;")
    public static class141 field7457 = new class141(5, 1);

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field7459 = 1405;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public int field7444;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public int field7447;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "I")
    public int field7448;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public int field7451;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field7452;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public int field7454;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field7455;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public int field7456;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "Lbda;")
    public static class437 field7458;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "Z")
    public boolean field7445;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 6)
    public static final void method3048(int arg0) {
        field7452++;
        if (class51.field636 == null) {
            class51.field636 = class696.method3930((byte) 66);
            class226.field2934 = class51.field636[0];
            class352.field4692 = class529.method2982((byte) -69);
        }
        if (class540.field7407 == null) {
            class163.method1003((byte) 72);
        }
        if (arg0 >= -42) {
            method3049(-116, 44);
        }
        class696 var1 = class226.field2934;
        int var2 = class75.method413(8);
        if (class226.field2934 == var1) {
            class614.field8513 = class226.field2934.field9825.method2141(class422.field5539, true);
            if (class226.field2934.field9818) {
                class175.field2481 = (class226.field2934.field9823 - class226.field2934.field9820) * var2 / 100 + class226.field2934.field9820;
            }
            if (class226.field2934.field9829) {
                class614.field8513 = class614.field8513 + class175.field2481 + "%";
            }
        } else if (class696.field9850 == class226.field2934) {
            class540.field7407 = null;
            class28.method182(3, 29697);
        } else {
            class614.field8513 = var1.field9819.method2141(class422.field5539, true);
            if (class226.field2934.field9829) {
                class614.field8513 = class614.field8513 + var1.field9823 + "%";
            }
            class175.field2481 = var1.field9823;
            if (class226.field2934.field9818 || var1.field9818) {
                class352.field4692 = class529.method2982((byte) -69);
            }
        }
        if (class540.field7407 == null) {
            return;
        }
        class540.field7407.method2865(class352.field4692, class175.field2481, false, class614.field8513, class226.field2934);
        if (class284.field3760 == null) {
            return;
        }
        for (int var3 = class183.field2550 + 1; var3 < class284.field3760.length; var3++) {
            if (class284.field3760[var3].method154(19115) >= 100 && (var3 - 1) == class183.field2550 && class576.field7861 >= 1 && class540.field7407.method2864((byte) -125)) {
                try {
                    class284.field3760[var3].method146(-122);
                } catch (Exception var4) {
                    class284.field3760 = null;
                    return;
                }
                class540.field7407.method2863(class284.field3760[var3], 22);
                class183.field2550++;
                if (class183.field2550 >= class284.field3760.length - 1 && class284.field3760.length > 1) {
                    class183.field2550 = class101.field1214.method2820(-1) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 106)
    public static final void method3049(int arg0, int arg1) {
        field7455++;
        if (arg1 != -20934) {
            field7453 = null;
        }
        if (!class60.method341(arg0, 0)) {
            return;
        }
        class423[] var2 = class124.field1729[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class423 var4 = var2[var3];
            if (var4 != null) {
                var4.field5555 = 1;
                var4.field5680 = 0;
                var4.field5572 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 140)
    public static void method3050(byte arg0) {
        field7458 = null;
        int var1 = -57 / ((arg0 - 15) / 39);
        field7457 = null;
        field7449 = null;
        field7453 = null;
    }
}
