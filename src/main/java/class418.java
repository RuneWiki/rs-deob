import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class418 extends class504 {

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field5719;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public int field5720;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public static int field5715 = 1339;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Lcu;")
    public static class206 field5717 = new class206(2, 3);

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "Lqw;")
    public static class71 field5722 = new class71(14, 3);

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field5723;

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "J")
    public static long field5724;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "[I")
    public static int[] field5716;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "[I")
    public static int[] field5718;

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "[I")
    public static int[] field5721;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method2389(int arg0) {
        field5717 = null;
        field5721 = null;
        field5722 = null;
        field5716 = null;
        if (arg0 == 3) {
            field5718 = null;
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(II)V")
    public class418(int arg0, int arg1) {
        this.field5719 = arg0;
        this.field5720 = arg1;
    }
}
