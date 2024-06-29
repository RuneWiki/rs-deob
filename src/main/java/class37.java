import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class37 {

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field631 = -1;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "J")
    public static long field628 = 0L;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    public static int field626 = 0;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lic;")
    public static class160 field630 = new class160(32);

    @OriginalMember(owner = "client!w", name = "j", descriptor = "Ljava/util/Calendar;")
    public static Calendar field632 = Calendar.getInstance();

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field634 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "Lpi;")
    public class193 field624;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "[I")
    public int[] field625;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[Ljava/lang/String;")
    public String[] field633;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public static void method313(byte arg0) {
        field630 = null;
        if (arg0 == 98) {
            field632 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method314(int arg0, int arg1, int arg2) {
        class87.field1405.method607(183, (byte) 118);
        class87.field1405.method1026(52, arg1);
        int var3 = -44 % ((-arg2 - 35) / 44);
        field623++;
        class233.field3689++;
        class87.field1405.method1017((byte) 108, arg0);
    }
}
