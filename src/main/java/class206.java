import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class206 extends class435 {

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public volatile int field2716 = -1;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field2718;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Ltd;")
    public static class317 field2714 = new class317("LIVE", 0);

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "Lao;")
    public static class191 field2717 = new class191(60, 6);

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Lao;")
    public static class191 field2719 = new class191(99, 12);

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 8)
    public static void method1306(byte arg0) {
        field2717 = null;
        field2714 = null;
        if (arg0 != 69) {
            field2719 = null;
        }
        field2719 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIIIIII)V", line = 20)
    public static final void method1307(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2715++;
        if (arg0 != 17354) {
            field2717 = null;
        }
        class263 var10 = null;
        for (class263 var11 = (class263) class366.field4995.method970(arg0 - 17342); var11 != null; var11 = (class263) class366.field4995.method976((byte) -47)) {
            if (var11.field3535 == arg6 && var11.field3534 == arg1 && var11.field3527 == arg4 && var11.field3532 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class263();
            var10.field3532 = arg5;
            var10.field3534 = arg1;
            var10.field3527 = arg4;
            var10.field3535 = arg6;
            if (arg1 >= 0 && arg4 >= 0 && arg1 < class308.field4128 && class426.field6200 > arg4) {
                class113.method687(var10, (byte) 85);
            }
            class366.field4995.method975(0, var10);
        }
        var10.field3523 = arg3;
        var10.field3518 = arg8;
        var10.field3531 = arg2;
        var10.field3521 = arg7;
        var10.field3522 = arg9;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 77)
    public class206(String arg0) {
        this.field2718 = arg0;
    }
}
