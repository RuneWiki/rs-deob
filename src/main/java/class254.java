import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class254 extends class498 {

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field3759 = new String[100];

    @OriginalMember(owner = "client!he", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field3760 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!he", name = "s", descriptor = "Z")
    public static boolean field3758 = false;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIII)I", line = 5)
    public static final int method1639(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field3753++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            if (arg0 < 64) {
                method1641((byte) 117);
            }
            return 1023 - arg3;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1640(int arg0, int arg1) {
        field3755++;
        if (arg1 > arg0 || arg0 > 2) {
            arg0 = 0;
        }
        class450.field6300 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V", line = 51)
    public static void method1641(byte arg0) {
        field3760 = null;
        if (arg0 < -55) {
            field3759 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V", line = 61)
    public class254() {
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V", line = 74)
    public class254(int arg0) {
        this.field3757 = arg0;
    }
}
