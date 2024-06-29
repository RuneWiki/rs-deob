import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class115 extends class45 {

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "S")
    public short field1608;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Lcq;")
    public static class67 field1606;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 7)
    public static void method736(boolean arg0) {
        field1606 = null;
        if (!arg0) {
            method736(true);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIII)V", line = 19)
    public static final void method737(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1607++;
        class306 var10 = null;
        for (class306 var11 = (class306) class198.field2639.method332(arg8 ^ 0x7F0263FA); var11 != null; var11 = (class306) class198.field2639.method343((byte) -103)) {
            if (var11.field4493 == arg6 && var11.field4492 == arg5 && var11.field4503 == arg9 && var11.field4495 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (arg8 != -28070) {
            field1609 = 64;
        }
        if (var10 == null) {
            var10 = new class306();
            var10.field4492 = arg5;
            var10.field4495 = arg7;
            var10.field4493 = arg6;
            var10.field4503 = arg9;
            class99.method676(0, var10);
            class198.field2639.method330(var10, -2130841184);
        }
        var10.field4501 = arg1;
        var10.field4499 = arg2;
        var10.field4500 = arg3;
        var10.field4509 = arg0;
        var10.field4505 = arg4;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V", line = 61)
    public class115() {
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(S)V", line = 71)
    public class115(short arg0) {
        this.field1608 = arg0;
    }
}
