import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class572 {

    @OriginalMember(owner = "client!h", name = "b", descriptor = "[Ljava/lang/String;")
    private String[] field8426;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[Ljc;")
    public static class374[] field8427 = new class374[5];

    @OriginalMember(owner = "client!h", name = "a", descriptor = "I")
    public static int field8425;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method3408(int arg0, int arg1) {
        field8425++;
        if (arg0 <= 70) {
            this.method3408(-102, -106);
        }
        return this.field8426[arg1];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)I")
    public static final int method3409(byte arg0) {
        field8428++;
        if ((double) class339.field4678 == 3.0D) {
            return 37;
        } else if ((double) class339.field4678 == 4.0D) {
            return 50;
        } else if ((double) class339.field4678 == 6.0D) {
            return 75;
        } else if ((double) class339.field4678 == 8.0D) {
            return 100;
        } else if (arg0 == 3) {
            return 200;
        } else {
            return 39;
        }
    }

    @OriginalMember(owner = "client!h", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8430++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class572(String arg0, String arg1, String arg2, String arg3) {
        this.field8426 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public static void method3410(int arg0) {
        field8427 = null;
        if (arg0 != -9223) {
            method3410(-44);
        }
    }

    static {
        for (int var0 = 0; var0 < field8427.length; var0++) {
            field8427[var0] = new class374();
        }
    }
}
