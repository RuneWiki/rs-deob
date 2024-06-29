import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class225 {

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "[S")
    public short[] field3854;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[B")
    public byte[] field3847;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "[S")
    public short[] field3853;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "[I")
    public int[] field3858;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "[Loh;")
    public class258[] field3851;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[Loh;")
    public static class258[] field3849 = new class258[500];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "[I")
    public static int[] field3857 = new int[2048];

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Loh;")
    public static class258 field3859 = class153.method1046("Angreifen", 88);

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lvj;")
    public static class96 field3852 = new class96(64);

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Loh;")
    public static class258 field3861 = class153.method1046("(U4", 115);

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "[I")
    public static int[] field3863 = new int[500];

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3860 = Calendar.getInstance();

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "S")
    public static short field3864 = 1;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Loh;")
    private static class258 field3867 = class153.method1046("skill: ", 96);

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Loh;")
    public static class258 field3868 = field3867;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Loh;")
    public static class258 field3869 = class153.method1046(" ", 93);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "[B")
    public static byte[] field3866;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "[S")
    public static short[] field3865;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IZ)Z", line = 13)
    public static final boolean method1511(int arg0, boolean arg1) {
        field3846++;
        if (arg1) {
            method1511(-101, true);
        }
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)Z", line = 26)
    public final boolean method1512(int arg0, int arg1) {
        if (arg1 == -6916) {
            field3855++;
            return (this.field3847[arg0] & 0x4) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 44)
    public static void method1513(int arg0) {
        if (arg0 != -199) {
            method1511(115, true);
        }
        field3860 = null;
        field3852 = null;
        field3869 = null;
        field3867 = null;
        field3861 = null;
        field3868 = null;
        field3859 = null;
        field3866 = null;
        field3857 = null;
        field3863 = null;
        field3865 = null;
        field3849 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(I)V", line = 67)
    public class225(int arg0) {
        this.field3856 = arg0;
        this.field3854 = new short[this.field3856];
        this.field3847 = new byte[this.field3856];
        this.field3853 = new short[this.field3856];
        this.field3858 = new int[this.field3856];
        this.field3851 = new class258[this.field3856];
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)I", line = 81)
    public final int method1514(int arg0, int arg1) {
        field3848++;
        if (arg1 != 500) {
            field3849 = (class258[]) null;
        }
        return this.field3847[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V", line = 96)
    public static final void method1515(int arg0) {
        class287.field4943 = new class144(arg0);
        field3850++;
    }
}
