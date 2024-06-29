import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class297 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lhi;")
    public static class82 field5053 = class95.method664((byte) -84, "::clientdrop");

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lhi;")
    public static class82 field5055 = class95.method664((byte) -50, "<col=c0ff00>");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field5054 = 0;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lim;")
    public static class250 field5057;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)J", line = 23)
    public static final long method2054(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field165; var4++) {
            class69 var5 = var3.field158[var4];
            if ((var5.field1064 >> 29 & 0x3L) == 2L && var5.field1076 == arg1 && var5.field1080 == arg2) {
                return var5.field1064;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 56)
    public static final void method2055(int arg0, int arg1) {
        class205.field3592 = arg1;
        field5052++;
        class26.field349 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIII)Z", line = 64)
    public static final boolean method2056(int arg0, int arg1, int arg2, int arg3) {
        if (class305.method2107(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class160.method1163(var4 + 1, class245.field4255[arg0][arg1][arg2] + arg3, var5 + 1) && class160.method1163(var4 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class160.method1163(var4 + 128 - 1, class245.field4255[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class160.method1163(var4 + 1, class245.field4255[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZB)V", line = 85)
    public static final void method2057(boolean arg0, byte arg1) {
        field5059++;
        if (class282.field4745 != arg0) {
            class282.field4745 = arg0;
            int var2 = 107 / ((39 - arg1) / 59);
            class308.method2125((byte) -35);
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Llm;", line = 107)
    public static final class211 method2058(int arg0, int arg1) {
        class211 var2 = (class211) class140.field2409.method2250((long) arg1, false);
        field5056++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class296.field5049.method1577(11, arg1, -29569);
        if (arg0 != 19969) {
            return (class211) null;
        }
        class211 var4 = new class211();
        if (var3 != null) {
            var4.method1518(new class153(var3), -6);
        }
        class140.field2409.method2255(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 130)
    public static void method2059(int arg0) {
        field5055 = null;
        field5057 = null;
        if (arg0 == 1) {
            field5053 = null;
        }
    }
}
