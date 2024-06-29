import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class67 {

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Lqe;")
    public static class179 field1355 = class206.method1380("Clientscript error in: ", (byte) -1);

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "[[Z")
    public static boolean[][] field1356;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILeh;)Llg;")
    public static final class126 method432(int arg0, int arg1, int arg2, class52 arg3) {
        field1353++;
        if (class77.method495(20480, arg2, arg1, arg3)) {
            if (arg0 > -76) {
                field1356 = null;
            }
            return class201.method1335(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V")
    public static void method433(int arg0) {
        field1356 = null;
        if (arg0 == 4) {
            field1355 = null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)V")
    public static final void method434(int arg0, int arg1, int arg2) {
        field1357++;
        if (arg2 != -235144880) {
            method435(49, 64, 101);
        }
        long var3 = (long) ((arg1 << 16) + arg0);
        class116 var5 = (class116) class174.field3115.method909(-1, var3);
        if (var5 != null) {
            class56.field1241.method1019(106, var5);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(III)J")
    public static final long method435(int arg0, int arg1, int arg2) {
        class197 var3 = class229.field4232[arg0][arg1][arg2];
        return var3 == null || var3.field3678 == null ? 0L : var3.field3678.field3049;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIII)I")
    public static final int method436(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 217) {
            method435(-19, -35, 117);
        }
        if (arg0 > 243) {
            arg3 >>= 0x4;
        } else if (arg0 > 217) {
            arg3 >>= 0x3;
        } else if (arg0 > 192) {
            arg3 >>= 0x2;
        } else if (arg0 > 179) {
            arg3 >>= 0x1;
        }
        field1354++;
        return (arg0 >> 1) + (arg1 >> 2 << 10) + (arg3 >> 5 << 7);
    }
}
