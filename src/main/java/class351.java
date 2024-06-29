import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class351 {

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "Lwu;")
    public static class582 field4286 = new class582("", 10);

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field4288 = 0;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field4289 = 0;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
    public static void method2026(int arg0) {
        field4286 = null;
        if (arg0 != 0) {
            method2026(-40);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BZ)V")
    public static final void method2027(byte arg0, boolean arg1) {
        field4287++;
        int var2 = class564.field7166;
        int var3 = class497.field6373;
        if (arg1 && class653.field8360) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class576.field7320.method976(var3, var2);
        if (arg0 >= -94) {
            field4289 = 103;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILsi;Lsi;)V")
    public static final void method2028(int arg0, int arg1, int arg2, class721 arg3, class721 arg4) {
        class766 var5 = class196.method1355(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field10433 = arg3;
        var5.field10423 = arg4;
        int var6 = class735.field9973 == class116.field1542 ? 1 : 0;
        if (!arg3.method743((byte) -117)) {
            arg3.field2890 = class640.field8187[var6];
            class640.field8187[var6] = arg3;
        } else if (arg3.method738(true)) {
            arg3.field2890 = class336.field4089[var6];
            class336.field4089[var6] = arg3;
        } else {
            arg3.field2890 = class177.field2327[var6];
            class177.field2327[var6] = arg3;
            class689.field8852 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method743((byte) -94)) {
            if (arg4.method738(true)) {
                arg4.field2890 = class336.field4089[var6];
                class336.field4089[var6] = arg4;
                return;
            }
            arg4.field2890 = class177.field2327[var6];
            class177.field2327[var6] = arg4;
            class689.field8852 = true;
            return;
        }
        arg4.field2890 = class640.field8187[var6];
        class640.field8187[var6] = arg4;
    }
}
