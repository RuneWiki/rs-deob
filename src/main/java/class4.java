import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 extends class28 {

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public int field46 = 0;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "Lqe;")
    public static class179 field51 = class206.method1380("gelb:", (byte) -126);

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "Lqe;")
    public static class179 field47 = class206.method1380("Neuer Benutzer", (byte) -127);

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "Lqe;")
    private static class179 field54 = class206.method1380("Please wait 5 minutes before trying again)3", (byte) -40);

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "Lqe;")
    public static class179 field56 = field54;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "Z")
    public static boolean field57 = false;

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "Lqe;")
    public static class179 field55 = class206.method1380("cross", (byte) 124);

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field59 = -1;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Ljc;")
    public static class100 field52 = new class100();

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    public static int field61 = 0;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Leh;Lqe;Lqe;I)[Lfc;")
    public static final class58[] method24(class52 arg0, class179 arg1, class179 arg2, int arg3) {
        field53++;
        if (arg3 != 5) {
            method27(-17, (byte) -47);
        }
        int var4 = arg0.method359(-1, arg2);
        int var5 = arg0.method362(-22, var4, arg1);
        return class234.method1524(arg0, var4, -1653, var5);
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static void method25(int arg0) {
        field52 = null;
        field55 = null;
        field54 = null;
        field56 = null;
        field51 = null;
        if (arg0 != -11135) {
            method26(null, -13, -88);
        }
        field47 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method26(Random arg0, int arg1, int arg2) {
        field58++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class149.method956(true, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg2);
            if (arg1 != 12024) {
                field59 = -14;
            }
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class240.method1556(var4, 100, arg2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)I")
    public static final int method27(int arg0, byte arg1) {
        if (arg1 != -91) {
            field56 = null;
        }
        field50++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Lra;I)V")
    public final void method28(class185 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1243(3);
            if (var3 == 0) {
                if (arg1 != -30671) {
                    field62 = 27;
                }
                field48++;
                return;
            }
            this.method29((byte) 123, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BILra;)V")
    private final void method29(byte arg0, int arg1, class185 arg2) {
        field60++;
        if (arg1 == 5) {
            this.field46 = arg2.method1252(2);
        }
        int var4 = 70 / ((63 - arg0) / 46);
    }
}
