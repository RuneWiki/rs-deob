import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class211 extends class7 {

    @OriginalMember(owner = "client!ln", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3381 = "Loading...";

    @OriginalMember(owner = "client!ln", name = "x", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!ln", name = "y", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ln", name = "A", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!ln", name = "B", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!ln", name = "E", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!ln", name = "F", descriptor = "I")
    public int field3383;

    @OriginalMember(owner = "client!ln", name = "G", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!ln", name = "H", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!ln", name = "I", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!ln", name = "J", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!ln", name = "w", descriptor = "Lmo;")
    public static class447 field3375;

    @OriginalMember(owner = "client!ln", name = "v", descriptor = "Ljava/lang/String;")
    public String field3374;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "(B)Z", line = 9)
    public static final boolean method1483(byte arg0) {
        ++field3385;
        if (arg0 != -42) {
            field3375 = null;
        }
        return ~class141.field2184 != -1 || class382.field5772 >= 2;
    }

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "(B)I", line = 23)
    public final int method1484(byte arg0) {
        ++field3377;
        if (arg0 != -7) {
            method1487(-87, -89, (class172) null);
        }
        return (int) (super.field2539 >>> 32 & 255L);
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(I)J", line = 34)
    public final long method1485(int arg0) {
        if (arg0 != 0) {
            return 126L;
        } else {
            ++field3387;
            return Long.MAX_VALUE & super.field86;
        }
    }

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "(B)V", line = 46)
    public static void method1486(byte arg0) {
        field3375 = null;
        field3381 = null;
        if (arg0 >= -50) {
            method1483((byte) -126);
        }
    }

    @OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V", line = 59)
    public class211(int arg0, int arg1) {
        super.field2539 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILne;)Ljava/lang/String;", line = 67)
    public static final String method1487(int arg0, int arg1, class172 arg2) {
        ++field3382;
        if (!client.method1149(arg2).method352(arg0 ^ arg0, arg1) && arg2.field2767 == null) {
            return null;
        } else if (arg2.field2823 != null && ~arg2.field2823.length < ~arg1 && arg2.field2823[arg1] != null && arg2.field2823[arg1].trim().length() != 0) {
            return arg2.field2823[arg1];
        } else {
            return class80.field1000 ? "Hidden-" + arg1 : null;
        }
    }

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "(B)I", line = 90)
    public final int method1488(byte arg0) {
        ++field3380;
        if (arg0 <= 88) {
            this.method1489((byte) 50);
        }
        return (int) super.field2539;
    }

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "(B)V", line = 102)
    public final void method1489(byte arg0) {
        super.field86 = Long.MIN_VALUE & super.field86 | 500L + class46.method297(27104);
        ++field3386;
        if (arg0 != -100) {
            this.method1489((byte) 121);
        }
        class8.field105.method363(true, this);
    }

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "(B)V", line = 117)
    public final void method1490(byte arg0) {
        ++field3384;
        if (arg0 != 117) {
            this.method1488((byte) -4);
        }
        super.field86 |= Long.MIN_VALUE;
        if (this.method1485(0) == 0L) {
            class58.field758.method363(true, this);
        }
    }
}
