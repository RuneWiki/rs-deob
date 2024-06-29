import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class243 extends class202 {

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lqd;")
    public static class40 field4007 = class147.method1106(":", (byte) -45);

    @OriginalMember(owner = "client!md", name = "k", descriptor = "J")
    public static volatile long field4008 = 0L;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "[I")
    public static int[] field4015 = new int[2500];

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field4012;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lmb;")
    public static class99 field4011;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "[Lhf;")
    public static class193[] field4010;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 7)
    public static void method1709(int arg0) {
        if (arg0 != 2500) {
            method1712((byte) -116);
        }
        field4007 = null;
        field4015 = null;
        field4011 = null;
        field4010 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)V", line = 30)
    public static final void method1710(int arg0, int arg1) {
        field4004++;
        class92.field1674 = 1000 / arg1;
        if (arg0 != 0) {
            field4009 = 97;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 54)
    public static final void method1711(int arg0) {
        if (arg0 != -13500) {
            return;
        }
        field4013++;
        if (!class118.method893(2) && class188.field3022 != class160.field2671) {
            class173.method1273(class159.field2662, class78.field1319, false, class160.field2671, class255.field4233.field1532[0], (byte) 116, class255.field4233.field1489[0]);
        } else if (class172.field2806 != class160.field2671) {
            class172.field2806 = class160.field2671;
            class126.method947(238, class160.field2671);
            class255.method1795((byte) 124);
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V", line = 86)
    public static final void method1712(byte arg0) {
        field4005++;
        int var1 = 70 / ((-arg0 - 11) / 60);
        class310.field5202.method1347(0);
    }
}
