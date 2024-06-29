import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class242 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lid;")
    public static class149 field4261 = class60.method382("tbrefresh", (byte) 118);

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "Lid;")
    public static class149 field4260 = class60.method382("0", (byte) 53);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public int field4250;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public int field4253;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public int field4263;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "Ljava/awt/Image;")
    public static Image field4257;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLaj;I)I")
    public static final int method1687(byte arg0, class47 arg1, int arg2) {
        field4258++;
        if (!client.method1104(arg1).method1182((byte) -117, arg2) && arg1.field733 == null) {
            return -1;
        } else if (arg0 >= -47) {
            return -87;
        } else if (arg1.field715 == null || arg1.field715.length <= arg2) {
            return -1;
        } else {
            return arg1.field715[arg2];
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(BI)V")
    public static final void method1688(byte arg0, int arg1) {
        class11.field162 = 20;
        if (arg0 <= 30) {
            method1687((byte) -64, (class47) null, -18);
        }
        class118.field2030 = 3;
        field4256++;
        class195.field3502 = arg1;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method1689(int arg0) {
        field4260 = null;
        field4261 = null;
        field4257 = null;
        if (arg0 <= 103) {
            method1689(-127);
        }
    }
}
