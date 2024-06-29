import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field83 = 503;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "Z")
    public static boolean field81 = true;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field78;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field84;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field85;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public int field90;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Lll;")
    public static class235 field87;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lhf;")
    public static class260 field86;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "[Lig;")
    public static class154[] field89;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public static final void method37(boolean arg0) {
        if (arg0) {
            class321.field4830 = class471.field7206;
            class99.field1801 = class262.field3978;
        } else {
            class321.field4830 = class20.field253;
            class99.field1801 = class201.field3195;
        }
        class483.field7381 = class321.field4830.length;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIB)I")
    public static final int method38(int arg0, int arg1, int arg2, byte arg3) {
        field88++;
        if (class99.field1801 == null) {
            return 0;
        }
        int var4 = arg0 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > class150.field2422 - 1 || var5 > (class21.field272 - 1)) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class146.field2369[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        if (arg3 != -54) {
            field89 = null;
        }
        return class99.field1801[var6].method314(arg0, arg2);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public static final void method39(int arg0, int arg1) {
        if (arg0 > arg1 || arg1 > 2) {
            arg1 = 0;
        }
        field80++;
        class456.field7000 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static void method40(int arg0) {
        int var1 = -77 % ((arg0 + 23) / 48);
        field87 = null;
        field86 = null;
        field89 = null;
    }
}
