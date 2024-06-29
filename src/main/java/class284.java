import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class284 extends class544 {

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    public volatile int field3720 = -1;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Ljava/lang/String;")
    public volatile String field3719;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lcea;")
    public static class180 field3723 = new class180("Loaded JAGMISC", "JAGMISC geladen", "JAGMISC chargé", "JAGMISC carregado");

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field3722;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "Lkb;")
    public static class590 field3721;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 10)
    public static void method1603(int arg0) {
        if (arg0 != -1) {
            field3723 = null;
        }
        field3721 = null;
        field3723 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 27)
    public class284(String arg0) {
        this.field3719 = arg0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)Lqn;", line = 38)
    public static final class56 method1604(int arg0, int arg1, int arg2) {
        class349 var3 = class383.field5070[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4498;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 45)
    public static final void method1605(byte arg0) {
        field3722++;
        class528.field7388.method3694(0);
        class307.field3899.method3694(0);
        class209.field2523.method3694(0);
        class216.field2638.method3694(0);
        class370.field4880.method3694(0);
        if (arg0 > -63) {
            field3723 = null;
        }
    }
}
