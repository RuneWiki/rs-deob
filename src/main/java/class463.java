import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class463 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public int field6880 = class442.method2749((byte) -27);

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public int field6887 = class287.field3982;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public int field6883;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Ljava/lang/String;")
    public String field6882;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field6881;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "Ljava/lang/String;")
    public String field6894;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Ljava/lang/String;")
    public String field6879;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Ljava/lang/String;")
    public String field6884;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Ljava/lang/String;")
    public String field6885;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field6891 = new Hashtable();

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "Leea;")
    public static class114 field6892 = new class114();

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IBIILjava/lang/String;)V", line = 11)
    public final void method2836(String arg0, String arg1, String arg2, String arg3, int arg4, byte arg5, int arg6, int arg7, String arg8) {
        field6888++;
        this.field6880 = class442.method2749((byte) -6);
        this.field6879 = arg1;
        this.field6881 = arg6;
        if (arg5 != 98) {
            field6892 = null;
        }
        this.field6887 = class287.field3982;
        this.field6894 = arg2;
        this.field6890 = arg7;
        this.field6883 = arg4;
        this.field6882 = arg0;
        this.field6884 = arg8;
        this.field6885 = arg3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILfm;)V", line = 33)
    public static final void method2837(int arg0, int arg1, int arg2, class636 arg3) {
        if (arg0 < 37) {
            method2839(46);
        }
        class316.field4605[arg2][arg1] = arg3;
        field6886++;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z", line = 51)
    public static final boolean method2838(int arg0, int arg1) {
        if (arg0 != 10) {
            field6891 = null;
        }
        field6889++;
        return arg1 == 9 || arg1 == 10 || arg1 == 11;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 63)
    public static void method2839(int arg0) {
        field6892 = null;
        field6891 = null;
        if (arg0 <= 43) {
            field6893 = 15;
        }
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 78)
    public class463(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field6883 = arg0;
        this.field6890 = arg1;
        this.field6882 = arg3;
        this.field6881 = arg6;
        this.field6894 = arg5;
        this.field6879 = arg7;
        this.field6884 = arg2;
        this.field6885 = arg4;
    }
}
