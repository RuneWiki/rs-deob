import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class43 extends class701 {

    @OriginalMember(owner = "client!eaa", name = "w", descriptor = "I")
    public int field530 = (int) (class529.method2982((byte) -69) / 1000L);

    @OriginalMember(owner = "client!eaa", name = "u", descriptor = "S")
    public short field528;

    @OriginalMember(owner = "client!eaa", name = "t", descriptor = "Ljava/lang/String;")
    public String field527;

    @OriginalMember(owner = "client!eaa", name = "s", descriptor = "Leba;")
    public static class550 field526 = new class550(12, 3);

    @OriginalMember(owner = "client!eaa", name = "x", descriptor = "Leba;")
    public static class550 field531 = new class550(79, 11);

    @OriginalMember(owner = "client!eaa", name = "y", descriptor = "Leba;")
    public static class550 field532 = new class550(65, -1);

    @OriginalMember(owner = "client!eaa", name = "r", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!eaa", name = "v", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(B)V", line = 5)
    public static void method227(byte arg0) {
        int var1 = 104 % ((arg0 - 58) / 63);
        field531 = null;
        field532 = null;
        field526 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method228(int arg0, int arg1, int arg2) {
        if (arg2 < 5) {
            field526 = null;
        }
        field525++;
        return (arg1 & 0x40000) != 0 | class670.method3805(arg1, arg0, (byte) 113) || class229.method1421(arg1, arg0, -1);
    }

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V", line = 33)
    public static final void method229(int arg0) {
        field529++;
        if (class228.field2962) {
            return;
        }
        class634.field8770 = true;
        class228.field2962 = true;
        if (class602.field8408.field4332) {
            class475.field6610 = ((int) class475.field6610 + 47 & 0xFFFFFFF0);
        } else {
            class635.field8787 += (12.0F - class635.field8787) / 2.0F;
        }
        if (arg0 != 47) {
            method227((byte) 124);
        }
    }

    @OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 65)
    public class43(String arg0, int arg1) {
        this.field528 = (short) arg1;
        this.field527 = arg0;
    }
}
