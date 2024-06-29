import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class611 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field8450;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field8451;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field8452;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)Lgaa;", line = 4)
    public static final class460 method3340(int arg0, int arg1, int arg2) {
        field8452++;
        class460 var3 = class102.method684(5025, arg1);
        if (arg2 >= -63) {
            method3341(-28, 60);
        }
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field6567 == null || arg0 >= var3.field6567.length) {
            return null;
        } else {
            return var3.field6567[arg0];
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)I", line = 26)
    public static final int method3341(int arg0, int arg1) {
        if (arg1 == 127) {
            field8450++;
            return arg0 & 0x7F;
        } else {
            return 106;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V", line = 37)
    public static final void method3342(boolean arg0) {
        if (arg0) {
            class495.field7002 = class618.field8658;
            class517.field7282 = class109.field1341;
        } else {
            class495.field7002 = class93.field1177;
            class517.field7282 = class716.field10106;
        }
        class126.field1511 = class495.field7002.length;
    }
}
