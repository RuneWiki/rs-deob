import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class26 extends class135 {

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "Lhg;")
    public class177 field365;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "[I")
    public static int[] field362 = new int[1000];

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "Ljava/lang/String;")
    public static String field367 = "Please remove ";

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lpg;")
    public static class75 field369;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "Lcf;")
    public static class93 field368;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z")
    public static final boolean method227(int arg0) {
        field364++;
        if (arg0 != 10920) {
            method228(26);
        }
        return class168.field2580;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)I")
    public static final int method228(int arg0) {
        if (arg0 != -28243) {
            method229(43);
        }
        field366++;
        return class129.field1890 && class123.field1844[81] && class245.field3920 > 2 ? client.field2330[class245.field3920 - 2] : client.field2330[class245.field3920 - 1];
    }

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)V")
    public static void method229(int arg0) {
        field362 = null;
        field367 = null;
        int var1 = -37 / ((arg0 - 39) / 61);
        field369 = null;
        field368 = null;
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)Lil;")
    public static final class162 method230(boolean arg0) {
        field363++;
        if (!arg0) {
            method227(-64);
        }
        return class176.field2755;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lhg;)V")
    public class26(class177 arg0) {
        this.field365 = arg0;
    }
}
