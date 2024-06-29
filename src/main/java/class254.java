import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class254 extends class425 {

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lpm;")
    public static class349 field3761 = new class349("K", "T", "K", "K");

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public int field3755;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public int field3756;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public int field3759;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public int field3763;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public int field3766;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "I")
    public int field3767;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)Z", line = 16)
    public static final boolean method1764(int arg0, int arg1, int arg2) {
        int var3 = class309.field4490[arg0][arg1][arg2];
        if (-class239.field3528 == var3) {
            return false;
        } else if (class239.field3528 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class239.method1627(var4 + 1, class439.field6280[arg0].method359(arg1, arg2), var5 + 1) && class239.method1627(var4 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg2), var5 + 1) && class239.method1627(var4 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class239.method1627(var4 + 1, class439.field6280[arg0].method359(arg1, arg2 + 1), var5 + 128 - 1)) {
                class309.field4490[arg0][arg1][arg2] = class239.field3528;
                return true;
            } else {
                class309.field4490[arg0][arg1][arg2] = -class239.field3528;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 47)
    public static void method1765(int arg0) {
        field3761 = null;
        if (arg0 != 1) {
            field3762 = -61;
        }
    }
}
