import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class71 {

    @OriginalMember(owner = "client!no", name = "i", descriptor = "I")
    public static int field1081 = 0;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!no", name = "b", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!no", name = "d", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!no", name = "g", descriptor = "J")
    public long field1079;

    @OriginalMember(owner = "client!no", name = "h", descriptor = "Luu;")
    public static class237 field1080;

    @OriginalMember(owner = "client!no", name = "f", descriptor = "Lnc;")
    public static class496 field1078;

    @OriginalMember(owner = "client!no", name = "c", descriptor = "Lno;")
    public class71 field1075;

    @OriginalMember(owner = "client!no", name = "e", descriptor = "Lno;")
    public class71 field1077;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(Liv;I)I", line = 5)
    public static final int method547(class25 arg0, int arg1) {
        field1076++;
        if (arg1 != -8807) {
            field1078 = null;
        }
        if (class218.field2855 == arg0) {
            return 6407;
        } else if (class623.field8394 == arg0) {
            return 6408;
        } else if (class401.field5747 == arg0) {
            return 6406;
        } else if (class762.field10618 == arg0) {
            return 6409;
        } else if (class718.field9995 == arg0) {
            return 6410;
        } else if (class397.field5707 == arg0) {
            return 6145;
        } else {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!no", name = "b", descriptor = "(Z)V", line = 41)
    public static void method548(boolean arg0) {
        if (!arg0) {
            method547(null, -111);
        }
        field1078 = null;
        field1080 = null;
    }

    @OriginalMember(owner = "client!no", name = "e", descriptor = "(I)V", line = 52)
    public final void method549(int arg0) {
        field1074++;
        if (this.field1075 == null) {
            return;
        }
        this.field1075.field1077 = this.field1077;
        this.field1077.field1075 = this.field1075;
        this.field1077 = null;
        if (arg0 == 6410) {
            this.field1075 = null;
        }
    }

    @OriginalMember(owner = "client!no", name = "c", descriptor = "(Z)Z", line = 72)
    public final boolean method550(boolean arg0) {
        field1073++;
        if (arg0) {
            this.field1075 = null;
        }
        return this.field1075 != null;
    }
}
