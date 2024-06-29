import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class725 {

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field10088;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field10089;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field10090;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILvfa;B)I")
    public static final int method4080(int arg0, class672 arg1, byte arg2) {
        if (arg2 != -26) {
            return 55;
        }
        field10091++;
        if (!client.method1875(arg1).method1348(arg0, 3) && arg1.field9296 == null) {
            return -1;
        } else if (arg1.field9278 == null || arg0 >= arg1.field9278.length) {
            return -1;
        } else {
            return arg1.field9278[arg0];
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZBIIIII)V")
    public static final void method4081(boolean arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class324.field4605 = arg3;
        if (arg1 != -118) {
            return;
        }
        field10090++;
        class168.field2588 = arg2;
        class75.field918 = arg4;
        class45.field583 = arg6;
        class762.field10616 = arg5;
        if (arg0 && class75.field918 >= 100) {
            class314.field4488 = class324.field4605 * 512 + 256;
            class694.field9662 = class45.field583 * 512 + 256;
            class222.field3162 = class153.method1118(class314.field4488, class694.field9662, arg1 ^ 0xFFFFFFF4, class507.field6775) - class762.field10616;
        }
        class12.field193 = -1;
        class264.field3680 = -1;
        class278.field3898 = 2;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    public static final int method4082(int arg0, int arg1) {
        int var2 = -91 % ((arg1 - 52) / 37);
        field10089++;
        return arg0 == 16711935 ? -1 : class592.method3223(arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Lkn;II)V")
    public static final void method4083(class742 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method4081(true, (byte) 35, -99, 121, -35, 81, 36);
        }
        field10088++;
        if (arg0.field10227 == null) {
            return;
        }
        int var3 = arg0.field10227[arg1 + 1];
        if (arg0.field10257 == var3) {
            return;
        }
        arg0.field10233 = 0;
        arg0.field10220 = 1;
        arg0.field10318 = arg0.field10316;
        arg0.field10232 = 0;
        arg0.field10279 = 0;
        arg0.field10257 = var3;
        if (arg0.field10257 != -1) {
            class514.method2871(class509.field6780.method663((byte) -90, arg0.field10257), arg0.field10233, arg0, true);
            return;
        }
    }
}
