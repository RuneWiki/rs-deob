import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
    public static int[] field336 = new int[8];

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "[I")
    public static int[] field340 = null;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIZI)I", line = 3)
    public static final int method150(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field340 = null;
        }
        field339++;
        if (arg0 >= arg1) {
            return arg3 >= arg0 ? arg0 : arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 15)
    public static void method151(int arg0) {
        field340 = null;
        if (arg0 != -18169) {
            field338 = -91;
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLee;)Led;", line = 26)
    public static final class704 method152(byte arg0, class675 arg1) {
        field337++;
        int var2 = -2 % ((arg0 - 3) / 44);
        class196 var3 = class531.method3096(false, arg1);
        int var4 = arg1.method3752(-126);
        return new class704(var3.field2609, var3.field2610, var3.field2605, var3.field2611, var3.field2607, var4);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjb;)V", line = 49)
    public static final void method153(int arg0, class493 arg1) {
        field335++;
        if (arg0 != 0) {
            method150(-19, 79, true, 66);
        }
        if (class399.field5642 != arg1.field7021) {
            return;
        }
        if (class660.field9039.field3965 == null) {
            arg1.field7047 = 0;
            arg1.field6997 = 0;
            return;
        }
        arg1.field6981 = 150;
        arg1.field7063 = (int) (Math.sin((double) class740.field10285 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field7082 = 5;
        arg1.field6997 = class389.field5512;
        arg1.field7047 = class662.method3632(class660.field9039.field3965, -27550);
        arg1.field6987 = 0;
        arg1.field7024 = class660.field9039.field7906;
        arg1.field6976 = class660.field9039.field7930;
        arg1.field7030 = class660.field9039.field7927;
        class709 var2 = arg1.field6976 == -1 ? null : class343.field4785.method3525(arg1.field6976, (byte) -78);
        if (var2 != null) {
            class469.method2803((byte) 121, arg1.field7024, var2);
        }
    }
}
