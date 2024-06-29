import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class80 implements class401 {

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Lega;")
    public class713 field1129;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public int field1125;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public int field1135;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "Log;")
    public class651 field1127;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public int field1126;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Lqe;")
    public static class469 field1131 = new class469(15, 6);

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "[Lpga;")
    public static class536[] field1134;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "[[[Lffa;")
    public static class186[][][] field1136;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)Lio;", line = 5)
    public class439 method69(byte arg0) {
        int var2 = -95 / ((arg0 + 69) / 39);
        field1128++;
        return class247.field3593;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZIII)V", line = 16)
    public static final void method648(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 - arg0 >= class497.field7073 && (arg0 + arg4) <= class391.field5895 && (arg2 - arg0) >= class166.field2622 && class432.field6446 >= (arg0 + arg2)) {
            class51.method374(arg3, arg1, arg0, arg2, arg4);
        } else {
            class627.method3621(arg0, arg2, arg3, (byte) 106, arg4);
        }
        field1132++;
        if (!arg1) {
            field1136 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 35)
    public static void method649(int arg0) {
        field1134 = null;
        field1136 = null;
        if (arg0 <= -73) {
            field1131 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(I)V", line = 49)
    public static final void method650(int arg0) {
        field1133++;
        if (arg0 >= -71) {
            field1136 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class251.field3626[var1] = false;
        }
        class67.field967 = -1;
        class656.field9191 = -1;
        class70.field988 = -1;
        class520.field7451 = -1;
        class762.field10618 = 0;
        class264.field3784 = 1;
        class583.field8297 = 0;
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(ILog;Lega;II)V", line = 85)
    public class80(int arg0, class651 arg1, class713 arg2, int arg3, int arg4) {
        this.field1129 = arg2;
        this.field1125 = arg4;
        this.field1135 = arg3;
        this.field1127 = arg1;
        this.field1126 = arg0;
    }
}
