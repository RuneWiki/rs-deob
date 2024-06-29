import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "Lraa;")
    public static class528 field16 = new class528("WTWIP", 3);

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field22 = 1;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "F")
    public static float field21;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "Lwc;")
    public static class59 field23;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIII)I", line = 29)
    public static final int method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field20++;
        if (class435.field6449 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg5 >> 9;
            int var7 = arg3 >> 9;
            if (arg1 < 0 || arg4 < 0 || arg1 > (class90.field1032 - 1) || class30.field349 - 1 < arg4) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class90.field1032 - 1) || class30.field349 - 1 < var7) {
                return 0;
            }
            boolean var8 = (class443.field6617[1][arg5 >> 9][arg3 >> 9] & 0x2) != 0;
            if ((arg5 & 0x1FF) == 0) {
                boolean var9 = (class443.field6617[1][var6 - 1][arg3 >> 9] & 0x2) != 0;
                boolean var10 = (class443.field6617[1][var6][arg3 >> 9] & 0x2) != 0;
                if (var9 != var10) {
                    var8 = (class443.field6617[1][arg1][arg4] & 0x2) != 0;
                }
            }
            if ((arg3 & 0x1FF) == 0) {
                boolean var11 = (class443.field6617[1][arg5 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class443.field6617[1][arg5 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class443.field6617[1][arg1][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        if (arg2 < 26) {
            return 38;
        } else {
            return class435.field6449[arg0].method249(arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIIIIII)V", line = 96)
    public static final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class613.field8922 = arg1;
        class406.field6126 = arg2;
        class39.field423 = arg3;
        class70.field752 = arg5;
        if (arg6 != 1) {
            method9(46, 115, -46, 13, -74, 25);
        }
        class156.field1937 = arg0;
        field19++;
        class122.field1523 = arg4;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V", line = 135)
    public static void method11(int arg0) {
        if (arg0 == 46) {
            field23 = null;
            field16 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)Lbw;", line = 148)
    public static final class599 method12(int arg0, int arg1, int arg2) {
        class99 var3 = class431.field6408[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1176;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Loa;Lva;III)V", line = 160)
    public static final void method13(class605 arg0, class429 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class588.field8441) {
            class99 var5 = class431.field6408[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field1174 != null && var5.field1174.method84(1630)) {
                arg1.method86(7, class193.field2559, 0, var5.field1174, arg0, true, 0);
            }
        }
        if (arg4 < class588.field8441) {
            class99 var6 = class431.field6408[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field1174 != null && var6.field1174.method84(1630)) {
                arg1.method86(7, 0, class193.field2559, var6.field1174, arg0, true, 0);
            }
        }
        if (arg3 < class588.field8441 && arg4 < class91.field1047) {
            class99 var7 = class431.field6408[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field1174 != null && var7.field1174.method84(1630)) {
                arg1.method86(7, class193.field2559, class193.field2559, var7.field1174, arg0, true, 0);
            }
        }
        if (arg3 < class588.field8441 && arg4 > 0) {
            class99 var8 = class431.field6408[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field1174 != null && var8.field1174.method84(1630)) {
                arg1.method86(7, class193.field2559, -class193.field2559, var8.field1174, arg0, true, 0);
            }
        }
    }
}
