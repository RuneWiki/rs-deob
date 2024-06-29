import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class142 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2035 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)I")
    public static final int method977(int arg0, int arg1, int arg2) {
        int var3 = 56 % ((arg1 - 2) / 36);
        field2036++;
        return arg0 == 4 || arg0 == 5 ? class403.field5724[arg2 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lqa;III)V")
    public static final void method978(class134 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field5264 == arg3 && arg3 != -1) {
            class411 var4 = class108.method761((byte) -82, arg3);
            int var5 = var4.field5832;
            if (var5 == 1) {
                arg0.field5266 = 1;
                arg0.field5251 = arg1;
                arg0.field5250 = 0;
                arg0.field5319 = 0;
                arg0.field5255 = 0;
                class431.method2721(arg0.field6266, arg0.field6262, var4, 115, class412.field5841 == arg0, arg0.field5319);
            }
            if (var5 == 2) {
                arg0.field5250 = 0;
            }
        } else if (arg3 == -1 || arg0.field5264 == -1 || class108.method761((byte) -82, arg3).field5825 >= class108.method761((byte) -82, arg0.field5264).field5825) {
            arg0.field5255 = 0;
            arg0.field5250 = 0;
            arg0.field5319 = 0;
            arg0.field5266 = 1;
            arg0.field5328 = arg0.field5344;
            arg0.field5264 = arg3;
            arg0.field5251 = arg1;
            if (arg0.field5264 != -1) {
                class431.method2721(arg0.field6266, arg0.field6262, class108.method761((byte) -82, arg0.field5264), 2, class412.field5841 == arg0, arg0.field5319);
            }
        }
        if (arg2 != 1) {
            field2035 = -105;
        }
        field2037++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public static final void method979(int arg0, int arg1) {
        if (arg1 >= -66) {
            method980(false, 95, (byte) 84);
        }
        field2038++;
        if (class170.field2326 == arg0) {
            return;
        }
        class211.field2954 = class290.field4061 = class108.field1561[arg0];
        class64.field949.method47(50, (int) ((double) class211.field2954 * 34.46D));
        class2.field27 = new int[class211.field2954][class290.field4061];
        class210.field2941 = new int[4][class211.field2954 >> 3][class290.field4061 >> 3];
        class212.field2967 = new int[class211.field2954][class290.field4061];
        for (int var2 = 0; var2 < 4; var2++) {
            class426.field5999[var2] = class200.method1307(class290.field4061, class211.field2954, 125);
        }
        class222.field3108 = new byte[4][class211.field2954][class290.field4061];
        client.method1094(4, class211.field2954, 124, class290.field4061);
        class126.method858(class290.field4061 >> 3, class211.field2954 >> 3, class64.field949, false);
        class170.field2326 = arg0;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZIB)I")
    public static final int method980(boolean arg0, int arg1, byte arg2) {
        field2039++;
        if (arg0) {
            return 0;
        }
        class304 var3 = class356.method2281(arg1, arg0, 0);
        if (var3 == null) {
            return class148.method1003(0, arg1).field4456;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field4198.length; var5++) {
            if (var3.field4198[var5] == -1) {
                var4++;
            }
        }
        if (arg2 >= -47) {
            field2034 = -5;
        }
        return var4 + (class148.method1003(0, arg1).field4456 - var3.field4198.length);
    }
}
