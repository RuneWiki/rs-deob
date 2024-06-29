import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class495 extends class667 {

    @OriginalMember(owner = "client!pi", name = "B", descriptor = "Lqaa;")
    public static class27 field7060 = new class27(19, -1);

    @OriginalMember(owner = "client!pi", name = "E", descriptor = "I")
    public static int field7063 = -1;

    @OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
    public static int field7061;

    @OriginalMember(owner = "client!pi", name = "D", descriptor = "I")
    public static int field7062;

    @OriginalMember(owner = "client!pi", name = "F", descriptor = "I")
    public static int field7064;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 3)
    public static void method2979(int arg0) {
        field7060 = null;
        if (arg0 != 0) {
            method2981(-39, -37, -74, -110, -74, -63, -95);
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V", line = 13)
    public static final void method2980(int arg0) {
        class153.method1174(2, 22050, (byte) -118, class471.field6781.field6718.method710(27669) == 1);
        field7061++;
        if (arg0 >= -38) {
            field7060 = null;
        }
        class443.field6166 = class127.method989(22050, class341.field4796, class567.field8085, 0, 5);
        class219.method1518(true, 0, class184.method1315((byte) 10, null));
        class338.field4769 = class127.method989(2048, class341.field4796, class567.field8085, 1, 5);
        class484.field6848 = new class728();
        class338.field4769.method375(false, class484.field6848);
        class67.field1219 = new class490(22050, class215.field3077);
        class226.method1558(-16032);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I", line = 32)
    public final int[] method117(byte arg0, int arg1) {
        if (arg0 >= -87) {
            return null;
        } else {
            field7062++;
            return class20.field261;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIII)V", line = 45)
    public static final void method2981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7064++;
        class340[] var7 = class220.field3146;
        if (arg0 != -22579) {
            field7063 = 8;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class340 var9 = var7[var8];
            if (var9 != null && var9.field4782 == 2) {
                class590.method3387(var9.field4790, var9.field4785, arg6 >> 1, var9.field4784 * 2, arg3, arg5, var9.field4783, (byte) 90, arg1 >> 1);
                if (class686.field9681[0] > -1 && class605.field8787 % 20 < 10) {
                    class743 var10 = class283.field4028[var9.field4788];
                    int var11 = class686.field9681[0] + arg2 - 12;
                    int var12 = class686.field9681[1] + arg4 - 28;
                    var10.method4135(var11, var12);
                    class6.method33(true, var12 + var10.method83(), var12, var11, var10.method82() + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V", line = 84)
    public class495() {
        super(0, true);
    }
}
