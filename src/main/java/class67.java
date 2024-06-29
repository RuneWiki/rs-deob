import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lr;")
    public static class66 field1343 = class93.method641(43, "blinken2:");

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lr;")
    public static class66 field1345 = class93.method641(43, "weiss:");

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field1349 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "Lr;")
    public static class66 field1347 = class93.method641(43, "loc");

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
    public static int field1350 = -1;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lr;")
    public static class66 field1348 = class93.method641(43, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1342;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method494(int arg0) {
        field1345 = null;
        field1343 = null;
        field1348 = null;
        if (arg0 != -31601) {
            field1347 = null;
        }
        field1347 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILeh;I)V")
    public static final void method495(int arg0, int arg1, class37 arg2, int arg3) {
        if (arg0 != 0) {
            return;
        }
        if (arg2.field2084 == arg1 && arg1 != -1) {
            class224 var4 = class47.method335((byte) -36, arg1);
            int var5 = var4.field3837;
            if (var5 == 1) {
                arg2.field2038 = 0;
                arg2.field2061 = arg3;
                arg2.field2065 = 0;
                arg2.field2072 = 0;
                class103.method713(false, arg2.field2038, arg2.field2077, var4, false, arg2.field2053);
            }
            if (var5 == 2) {
                arg2.field2065 = 0;
            }
        } else if (arg1 == -1 || arg2.field2084 == -1 || class47.method335((byte) -36, arg1).field3827 >= class47.method335((byte) -36, arg2.field2084).field3827) {
            arg2.field2073 = arg2.field2095;
            arg2.field2065 = 0;
            arg2.field2038 = 0;
            arg2.field2084 = arg1;
            arg2.field2061 = arg3;
            arg2.field2072 = 0;
            if (arg2.field2084 != -1) {
                class103.method713(false, arg2.field2038, arg2.field2077, class47.method335((byte) -36, arg2.field2084), false, arg2.field2053);
            }
        }
        field1344++;
    }
}
