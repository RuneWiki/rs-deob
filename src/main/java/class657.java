import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class657 {

    @OriginalMember(owner = "client!pw", name = "c", descriptor = "Lem;")
    public static class206 field9129 = new class206(14, 8);

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field9136 = 16777215;

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "[Lks;")
    public static class403[] field9139 = new class403[14];

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "I")
    public int field9127;

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "I")
    public int field9130;

    @OriginalMember(owner = "client!pw", name = "e", descriptor = "I")
    public static int field9131;

    @OriginalMember(owner = "client!pw", name = "f", descriptor = "I")
    public static int field9132;

    @OriginalMember(owner = "client!pw", name = "g", descriptor = "I")
    public static int field9133;

    @OriginalMember(owner = "client!pw", name = "h", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field9137;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "[Lcea;")
    public class196[] field9128;

    @OriginalMember(owner = "client!pw", name = "i", descriptor = "[S")
    public static short[] field9135;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3695(boolean arg0) {
        field9139 = null;
        field9135 = null;
        if (!arg0) {
            field9129 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Lac;I)V", line = 24)
    public final void method3696(class501 arg0, int arg1) {
        field9131++;
        this.field9127 = arg0.method2819((byte) 72);
        this.field9130 = arg0.method2845(-1);
        this.field9128 = new class196[arg0.method2874((byte) -75)];
        if (arg1 != -21882) {
            field9136 = -86;
        }
        class370[] var3 = class602.method3392((byte) 125);
        for (int var4 = 0; var4 < this.field9128.length; var4++) {
            this.field9128[var4] = this.method3697((byte) -109, arg0, var3[arg0.method2874((byte) -75)]);
        }
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(BLac;Loh;)Lcea;", line = 49)
    private final class196 method3697(byte arg0, class501 arg1, class370 arg2) {
        field9134++;
        if (class417.field5884 == arg2) {
            return class631.method3534(arg1, 95);
        } else if (class543.field7377 == arg2) {
            return class370.method2133((byte) -34, arg1);
        } else if (class364.field4801 == arg2) {
            return class635.method3546(arg1, (byte) -116);
        } else if (class129.field1846 == arg2) {
            return class34.method310((byte) -23, arg1);
        } else if (class444.field6144 == arg2) {
            return class36.method314(-23765, arg1);
        } else if (class373.field5025 == arg2) {
            return class369.method2130(arg1, -19935);
        } else if (class643.field8874 == arg2) {
            return class663.method3752((byte) -118, arg1);
        } else {
            if (arg0 > -2) {
                field9136 = -30;
            }
            if (class198.field2803 == arg2) {
                return class552.method3098(-16094, arg1);
            } else if (client.field3715 == arg2) {
                return class22.method232(0, arg1);
            } else if (class659.field9161 == arg2) {
                return class37.method326(false, arg1);
            } else {
                return null;
            }
        }
    }
}
