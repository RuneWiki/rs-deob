import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class211 extends class51 {

    @OriginalMember(owner = "client!lm", name = "H", descriptor = "Z")
    public static volatile boolean field3698 = true;

    @OriginalMember(owner = "client!lm", name = "L", descriptor = "I")
    public static int field3702 = 0;

    @OriginalMember(owner = "client!lm", name = "N", descriptor = "I")
    public static int field3704 = 0;

    @OriginalMember(owner = "client!lm", name = "E", descriptor = "I")
    public int field3695;

    @OriginalMember(owner = "client!lm", name = "F", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!lm", name = "I", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!lm", name = "J", descriptor = "I")
    private int field3700;

    @OriginalMember(owner = "client!lm", name = "M", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!lm", name = "O", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!lm", name = "K", descriptor = "Lhi;")
    public class82 field3701;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(II)V", line = 5)
    public static final void method1517(int arg0, int arg1) {
        field3705++;
        if (class77.field1324 == arg0) {
            class86.field1537.method1423(0, arg1);
        } else {
            class28.field380 = arg1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lbc;I)V", line = 28)
    public final void method1518(class153 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1082(-28);
            if (var3 == 0) {
                field3696++;
                if (arg1 != -6) {
                    field3702 = -60;
                }
                return;
            }
            this.method1520(-119, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "(I)Z", line = 63)
    public final boolean method1519(int arg0) {
        if (arg0 < 22) {
            return true;
        } else {
            field3697++;
            return this.field3700 == 115;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IILbc;)V", line = 78)
    private final void method1520(int arg0, int arg1, class153 arg2) {
        field3699++;
        if (arg1 == 1) {
            this.field3700 = arg2.method1082(-43);
        } else if (arg1 == 2) {
            this.field3695 = arg2.method1097((byte) -92);
        } else if (arg1 == 5) {
            this.field3701 = arg2.method1092((byte) 118);
        }
        int var4 = -20 / ((33 - arg0) / 53);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILum;I)[Lti;", line = 117)
    public static final class186[] method1521(int arg0, class222 arg1, int arg2) {
        field3703++;
        if (arg2 > -60) {
            return (class186[]) null;
        } else if (class281.method1959(-125, arg1, arg0)) {
            return class37.method292((byte) 70);
        } else {
            return null;
        }
    }
}
