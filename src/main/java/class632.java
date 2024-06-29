import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class632 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field8968;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lvj;III)V", line = 11)
    public static final void method3565(class204 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class33.field474) {
            class293 var4 = class541.field7946[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4084 != null && var4.field4084.method592(-15258)) {
                arg0.method590(var4.field4084, class457.field6576, true, class490.field7029, 0, 0, (byte) 37);
            }
        }
        if (arg3 < class33.field474) {
            class293 var5 = class541.field7946[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4084 != null && var5.field4084.method592(-15258)) {
                arg0.method590(var5.field4084, 0, true, class490.field7029, 0, class457.field6576, (byte) 25);
            }
        }
        if (arg2 < class33.field474 && arg3 < class687.field9758) {
            class293 var6 = class541.field7946[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4084 != null && var6.field4084.method592(-15258)) {
                arg0.method590(var6.field4084, class457.field6576, true, class490.field7029, 0, class457.field6576, (byte) 25);
            }
        }
        if (arg2 < class33.field474 && arg3 > 0) {
            class293 var7 = class541.field7946[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4084 != null && var7.field4084.method592(-15258)) {
                arg0.method590(var7.field4084, class457.field6576, true, class490.field7029, 0, -class457.field6576, (byte) 52);
            }
        }
    }
}
