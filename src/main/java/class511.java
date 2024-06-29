import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class511 extends class150 {

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[Ljava/awt/Color;")
    public static Color[] field6942 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Lfh;")
    public static class266 field6943 = new class266(3, 7);

    @OriginalMember(owner = "client!os", name = "k", descriptor = "Lwp;")
    public static class453 field6944 = new class453(83, 4);

    @OriginalMember(owner = "client!os", name = "g", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
    public static int[] field6945;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "(I)V")
    public static final void method2758(int arg0) {
        class572.field7993 = new class377[arg0];
        field6940++;
        class265.field3368 = 0;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lkp;I)V")
    public static final void method2759(class507 arg0, int arg1) {
        field6941++;
        if (class472.field5990 == arg0.field6720) {
            if (class376.field4748.field7017 == null) {
                arg0.field6798 = 0;
                arg0.field6745 = 0;
            } else {
                arg0.field6813 = 150;
                arg0.field6799 = (int) (Math.sin((double) class133.field1735 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field6798 = class167.field2200;
                arg0.field6714 = 5;
                arg0.field6745 = class322.method1842(class376.field4748.field7017, false);
                arg0.field6820 = class376.field4748.field9724;
                arg0.field6746 = class376.field4748.field9744;
                arg0.field6742 = 0;
                arg0.field6717 = class376.field4748.field9699;
                class395 var2 = arg0.field6746 == -1 ? null : class583.field8149.method1844(64, arg0.field6746);
                if (var2 != null) {
                    class106.method602(var2, (byte) 125, arg0.field6717);
                }
            }
        } else if (arg1 < 68) {
            field6943 = null;
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
    public static void method2760(boolean arg0) {
        field6943 = null;
        field6945 = null;
        field6942 = null;
        field6944 = null;
        if (arg0) {
            field6942 = null;
        }
    }
}
