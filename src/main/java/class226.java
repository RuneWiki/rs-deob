import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class226 {

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field3667 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field3671 = 0;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lwm;")
    public static class152 field3675 = class157.method1048(")4p=", 125);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[Z")
    public static boolean[] field3665 = new boolean[8];

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "[[I")
    public static int[][] field3674 = new int[104][104];

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3672 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "[I")
    public static int[] field3677 = new int[64];

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public int field3661;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field3662;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field3663;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field3666;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public int field3668;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field3670;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field3673;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[B")
    public byte[] field3669;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[B")
    public byte[] field3676;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 12)
    public static void method1552(byte arg0) {
        field3675 = null;
        if (arg0 >= -121) {
            field3664 = 68;
        }
        field3665 = null;
        field3677 = null;
        field3672 = null;
        field3674 = (int[][]) null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(III)J", line = 32)
    public static final long method1553(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        return var3 == null || var3.field558 == null ? 0L : var3.field558.field1685;
    }
}
