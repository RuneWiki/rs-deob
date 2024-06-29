import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public abstract class class167 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "[S")
    public static short[] field2686 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILlh;BI)V")
    public static final void method1153(int arg0, class200 arg1, byte arg2, int arg3) {
        field2685++;
        if (arg2 < 117) {
            method1153(-84, (class200) null, (byte) -26, 86);
        }
        if (arg1.field3827 == arg3 && arg3 != -1) {
            class165 var4 = class208.method1458((byte) 111, arg3);
            int var5 = var4.field2647;
            if (var5 == 1) {
                arg1.field3800 = 0;
                arg1.field3765 = arg0;
                arg1.field3738 = 1;
                arg1.field3782 = 0;
                arg1.field3759 = 0;
                class221.method1562(arg1.field3782, arg1.field3820, arg1.field3818, var4, (byte) 47, false);
            }
            if (var5 == 2) {
                arg1.field3759 = 0;
                return;
            }
        } else if (arg3 == -1 || arg1.field3827 == -1 || class208.method1458((byte) 107, arg3).field2646 >= class208.method1458((byte) 107, arg1.field3827).field2646) {
            arg1.field3784 = arg1.field3791;
            arg1.field3800 = 0;
            arg1.field3759 = 0;
            arg1.field3738 = 1;
            arg1.field3827 = arg3;
            arg1.field3765 = arg0;
            arg1.field3782 = 0;
            if (arg1.field3827 == -1) {
                return;
            }
            class221.method1562(arg1.field3782, arg1.field3820, arg1.field3818, class208.method1458((byte) 100, arg1.field3827), (byte) 47, false);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method1154(int arg0) {
        field2686 = null;
        if (arg0 != -14255) {
            field2683 = 94;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Ltb;I)Ltb;")
    public abstract class152 method181(class152 arg0, int arg1);
}
