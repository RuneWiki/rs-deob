import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class40 {

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[Ljava/lang/String;")
    private String[] field478;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field474 = 0;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public static int[] field475 = new int[14];

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field479 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field473;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method203(int arg0, int arg1) {
        if (arg0 != -2) {
            field473 = null;
        }
        field477++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
    public static final void method204(int arg0, int arg1) {
        class470.field6610 = arg1 / arg0;
        field480++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method205(byte arg0, int arg1) {
        field476++;
        if (arg0 < 98) {
            field474 = -45;
        }
        return this.field478[arg1];
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method206(int arg0) {
        field475 = null;
        field473 = null;
        if (arg0 != -32542) {
            method203(-116, 37);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class40(String arg0, String arg1, String arg2, String arg3) {
        this.field478 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field472++;
        throw new IllegalStateException();
    }
}
