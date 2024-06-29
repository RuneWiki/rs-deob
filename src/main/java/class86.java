import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class86 extends class155 {

    @OriginalMember(owner = "client!qf", name = "H", descriptor = "I")
    public static int field1425 = 0;

    @OriginalMember(owner = "client!qf", name = "J", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1427 = Calendar.getInstance();

    @OriginalMember(owner = "client!qf", name = "M", descriptor = "I")
    public static int field1430 = 64;

    @OriginalMember(owner = "client!qf", name = "N", descriptor = "Ljava/lang/String;")
    public static String field1431 = "white:";

    @OriginalMember(owner = "client!qf", name = "I", descriptor = "C")
    private char field1426;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "I")
    public static int field1419;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!qf", name = "K", descriptor = "Laj;")
    public static class151 field1428;

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "Ljava/lang/String;")
    public String field1424;

    @OriginalMember(owner = "client!qf", name = "L", descriptor = "[[I")
    public static int[][] field1429;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)Z")
    public final boolean method604(byte arg0) {
        field1422++;
        if (arg0 != 14) {
            this.method608((class249) null, 97);
        }
        return this.field1426 == 's';
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIB)V")
    public static final void method605(int arg0, int arg1, byte arg2) {
        if (class169.field2739 == 2) {
            class183.field2926 = arg1;
            class245.field4102 = arg0;
        }
        class265.field4432 = (float) arg0;
        class187.field2993 = (float) arg1;
        field1420++;
        if (arg2 > 76) {
            class249.method1776(124);
            class271.field4520 = true;
        }
    }

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "(I)V")
    public static void method606(int arg0) {
        field1429 = null;
        field1428 = null;
        if (arg0 < -90) {
            field1427 = null;
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(BILab;)V")
    private final void method607(byte arg0, int arg1, class249 arg2) {
        if (arg1 == 1) {
            this.field1426 = class1.method12(true, arg2.method1768(79));
        } else if (arg1 == 2) {
            this.field1423 = arg2.method1800(-87);
        } else if (arg1 == 5) {
            this.field1424 = arg2.method1769(arg0 - 91);
        }
        field1419++;
        if (arg0 != 92) {
            field1431 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lab;I)V")
    public final void method608(class249 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1802((byte) 81);
            if (var3 == 0) {
                if (arg1 != 0) {
                    this.field1423 = -100;
                }
                field1421++;
                return;
            }
            this.method607((byte) 92, var3, arg0);
        }
    }
}
