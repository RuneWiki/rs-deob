import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class228 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public int field2692;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field2700;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public int field2702;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "Lgda;")
    public class61 field2703;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "B")
    public byte field2693;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field2698;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Lhj;")
    public static class596 field2701 = new class596(9, -1);

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "J")
    public static long field2706 = 0L;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field2707 = 0;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Laia;")
    public class242 field2697;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "Ltb;")
    public class420 field2694;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Leaa;")
    public class527 field2691;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Loi;")
    public class80 field2699;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V", line = 9)
    public static void method1408(int arg0) {
        field2701 = null;
        if (arg0 <= 83) {
            method1408(-91);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLjava/awt/Component;)Lev;", line = 19)
    public static final class722 method1409(byte arg0, Component arg1) {
        field2704++;
        return arg0 <= 13 ? null : new class17(arg1);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)Z", line = 34)
    public final boolean method1410(byte arg0) {
        if (arg0 > -44) {
            this.field2699 = null;
        }
        field2696++;
        return this.field2693 == 2 || this.field2693 == 3;
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(BIIIIIILgda;)V", line = 50)
    public class228(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class61 arg7) {
        this.field2692 = arg5;
        this.field2700 = arg6;
        this.field2695 = arg2;
        this.field2702 = arg3;
        this.field2703 = arg7;
        this.field2705 = arg4;
        this.field2693 = arg0;
        this.field2698 = arg1;
    }
}
