import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class300 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field4718 = -1;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lmn;")
    public static class162 field4717;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method2022(int arg0) {
        if (arg0 <= -81) {
            field4717 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V")
    public static final void method2023(boolean arg0) {
        field4719++;
        class422 var1 = (class422) class497.field7476.method2123(-72);
        if (!arg0) {
            field4717 = null;
        }
        while (var1 != null) {
            if (var1.field6405 > 0) {
                var1.field6405--;
            }
            if (var1.field6405 != 0) {
                if (var1.field6408 > 0) {
                    var1.field6408--;
                }
                if (var1.field6408 == 0 && var1.field6402 >= 1 && var1.field6404 >= 1 && var1.field6402 <= class135.field1839 - 2 && (class197.field3038 - 2) >= var1.field6404 && (var1.field6397 < 0 || class35.method219(var1.field6396, var1.field6397, 4))) {
                    class128.method799(var1.field6397, var1.field6403, var1.field6402, var1.field6398, var1.field6396, -1, var1.field6404, 3, var1.field6407);
                    var1.field6408 = -1;
                    if (var1.field6400 == var1.field6397 && var1.field6400 == -1) {
                        var1.method3149(109);
                    } else if (var1.field6400 == var1.field6397 && var1.field6407 == var1.field6401 && var1.field6396 == var1.field6395) {
                        var1.method3149(115);
                    }
                }
            } else if (var1.field6400 < 0 || class35.method219(var1.field6395, var1.field6400, 4)) {
                class128.method799(var1.field6400, var1.field6403, var1.field6402, var1.field6398, var1.field6395, -1, var1.field6404, 3, var1.field6401);
                var1.method3149(91);
            }
            var1 = (class422) class497.field7476.method2126((byte) 61);
        }
    }
}
