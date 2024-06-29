import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class431 {

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "Los;")
    public static class374 field5845 = new class374(new byte[5000]);

    @OriginalMember(owner = "client!mq", name = "f", descriptor = "[I")
    public static int[] field5846 = new int[500];

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
    public static int field5842;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Ljava/awt/Frame;")
    public static Frame field5843;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method2494(int arg0, int arg1, int arg2) {
        if (arg2 < 90) {
            field5843 = null;
        }
        field5841++;
        return class259.method1456(arg0, 126, arg1) || class548.method3214(arg0, arg1, 45056);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V", line = 20)
    public static void method2495(int arg0) {
        field5843 = null;
        field5846 = null;
        if (arg0 != 19649) {
            field5843 = null;
        }
        field5845 = null;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(III)Z", line = 33)
    public static final boolean method2496(int arg0, int arg1, int arg2) {
        field5842++;
        if (arg0 == 262144) {
            return (arg1 & 0x40000) != 0 | class521.method2968(arg1, arg2, (byte) 122) || class337.method1896(arg2, (byte) 69, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2497(byte arg0) {
        class425.field5472 = class503.method2907(0.4F, 35, 2048, 4, 8, 8, true, -28918);
        field5844++;
        if (arg0 <= 105) {
            method2494(92, 3, -124);
        }
    }
}
