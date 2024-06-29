import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class324 extends class238 {

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "I")
    public int field4676;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "J")
    public static long field4678 = 0L;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "Lrd;")
    public static class204 field4674;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIB)I")
    public static final int method2056(int arg0, int arg1, byte arg2) {
        if (arg2 > -120) {
            field4678 = 74L;
        }
        field4677++;
        return arg1 == 1 || arg1 == 3 ? class2.field15[arg0 & 0x3] : class459.field6434[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "()V")
    public class324() {
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)V")
    public static void method2057(byte arg0) {
        field4674 = null;
        if (arg0 != 84) {
            field4675 = 4;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(I)V")
    public class324(int arg0) {
        this.field4676 = arg0;
    }
}
