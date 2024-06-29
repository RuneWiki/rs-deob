import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class255 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public int field3903 = -1;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public int field3910 = -1;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field3908 = 0;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3906 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lwg;")
    public static class178 field3909;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    public int[] field3907;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method1705(int arg0) {
        field3911++;
        if (arg0 != -1) {
            field3908 = 96;
        }
        class20.field286 = new class148();
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lql;IIB)V")
    private final void method1706(class224 arg0, int arg1, int arg2, byte arg3) {
        if (arg2 == 1) {
            this.field3903 = arg0.method1445(false);
        } else if (arg2 == 2) {
            this.field3907 = new int[arg0.method1453((byte) -127)];
            for (int var5 = 0; var5 < this.field3907.length; var5++) {
                this.field3907[var5] = arg0.method1445(false);
            }
        } else if (arg2 == 3) {
            this.field3910 = arg0.method1453((byte) -127);
        }
        field3912++;
        if (arg3 != -75) {
            field3909 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IILql;)V")
    public final void method1707(int arg0, int arg1, class224 arg2) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var4 = arg2.method1453((byte) -127);
            if (var4 == 0) {
                field3904++;
                return;
            }
            this.method1706(arg2, arg1, var4, (byte) -75);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static void method1708(int arg0) {
        if (arg0 > 41) {
            field3909 = null;
            field3906 = null;
        }
    }
}
