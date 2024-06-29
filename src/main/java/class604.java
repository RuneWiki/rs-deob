import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class604 {

    @OriginalMember(owner = "client!po", name = "e", descriptor = "Lds;")
    private class73 field7662;

    @OriginalMember(owner = "client!po", name = "b", descriptor = "I")
    public int field7659;

    @OriginalMember(owner = "client!po", name = "g", descriptor = "I")
    private int field7664;

    @OriginalMember(owner = "client!po", name = "f", descriptor = "I")
    public int field7663;

    @OriginalMember(owner = "client!po", name = "h", descriptor = "Lpo;")
    public static class604 field7665 = new class604(0, 3, class73.field994);

    @OriginalMember(owner = "client!po", name = "i", descriptor = "Lpo;")
    public static class604 field7666 = new class604(1, 3, class73.field994);

    @OriginalMember(owner = "client!po", name = "j", descriptor = "Lpo;")
    public static class604 field7667 = new class604(2, 4, class73.field990);

    @OriginalMember(owner = "client!po", name = "k", descriptor = "Lpo;")
    public static class604 field7668 = new class604(3, 1, class73.field994);

    @OriginalMember(owner = "client!po", name = "l", descriptor = "Lpo;")
    public static class604 field7669 = new class604(4, 2, class73.field994);

    @OriginalMember(owner = "client!po", name = "m", descriptor = "Lpo;")
    public static class604 field7670 = new class604(5, 3, class73.field994);

    @OriginalMember(owner = "client!po", name = "n", descriptor = "Lpo;")
    public static class604 field7671 = new class604(6, 4, class73.field994);

    @OriginalMember(owner = "client!po", name = "o", descriptor = "I")
    public static int field7672 = class194.method1347(16, true);

    @OriginalMember(owner = "client!po", name = "p", descriptor = "I")
    public static int field7673 = 0;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "Lfca;")
    public static class661 field7674 = new class661();

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Lgp;")
    public static class576 field7675 = new class576(0, 1);

    @OriginalMember(owner = "client!po", name = "a", descriptor = "I")
    public static int field7658;

    @OriginalMember(owner = "client!po", name = "c", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!po", name = "d", descriptor = "I")
    public static int field7661;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(II)Lpo;", line = 9)
    public static final class604 method3251(int arg0, int arg1) {
        field7658++;
        if (arg0 != 3) {
            field7675 = null;
        }
        if (arg1 == 0) {
            return field7665;
        } else if (arg1 == 1) {
            return field7666;
        } else if (arg1 == 2) {
            return field7667;
        } else if (arg1 == 3) {
            return field7668;
        } else if (arg1 == 4) {
            return field7669;
        } else if (arg1 == 5) {
            return field7670;
        } else if (arg1 == 6) {
            return field7671;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!po", name = "toString", descriptor = "()Ljava/lang/String;", line = 86)
    public final String toString() {
        field7661++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)V", line = 94)
    public static void method3252(int arg0) {
        if (arg0 != 0) {
            method3251(71, 63);
        }
        field7674 = null;
        field7667 = null;
        field7665 = null;
        field7669 = null;
        field7668 = null;
        field7666 = null;
        field7670 = null;
        field7675 = null;
        field7671 = null;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(IILds;)V", line = 111)
    private class604(int arg0, int arg1, class73 arg2) {
        this.field7662 = arg2;
        this.field7659 = arg0;
        this.field7664 = arg1;
        this.field7663 = this.field7662.field987 * this.field7664;
        if (this.field7659 >= 16) {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(BLjha;IIB)V", line = 128)
    public static final void method3253(byte arg0, class33 arg1, int arg2, int arg3, byte arg4) {
        field7660++;
        int var5 = arg1.field4767[0];
        int var6 = arg1.field4758[0];
        if (var5 < 0 || var5 >= class240.field3280 || var6 < 0 || class276.field3602 <= var6) {
            return;
        }
        int var7 = 17 / ((arg0 + 50) / 44);
        if (arg2 < 0 || arg2 >= class240.field3280 || arg3 < 0 || class276.field3602 <= arg3) {
            return;
        }
        int var8 = class15.method64(var5, -4, (byte) 90, 0, 0, class106.field1449, var6, arg2, 0, 0, arg3, arg1.method190((byte) -39), true, class299.field3792, class179.field2391[arg1.field2895]);
        if (var8 >= 1 && var8 <= 3) {
            for (int var9 = 0; var9 < (var8 - 1); var9++) {
                arg1.method178(class299.field3792[var9], class106.field1449[var9], arg4, -8617);
            }
        }
    }
}
