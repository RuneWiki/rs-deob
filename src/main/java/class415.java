import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class415 {

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field6005 = -1;

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "[[I")
    public static int[][] field6012 = new int[128][128];

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field6011 = 52;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2596(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class13.field216.field565 = 0;
        field6015++;
        class13.field216.method267(20, false);
        class13.field216.method267(arg4, false);
        class13.field216.method267(arg2, false);
        if (arg0 < 100) {
            method2598(9);
        }
        class13.field216.method324(arg1, -90);
        class13.field216.method324(arg3, -55);
        class205.field3012 = 1;
        class28.field421 = 0;
        class8.field110 = 0;
        class349.field4965 = -3;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 27)
    public static final void method2597(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        field6008++;
        class164 var7 = new class164();
        if (arg3 != -21001) {
            return;
        }
        var7.field2468 = arg4;
        var7.field2464 = arg1;
        var7.field2465 = arg5;
        var7.field2461 = arg6;
        var7.field2472 = class267.field4002 + arg0;
        var7.field2471 = arg2;
        class61.field981.method2483(120, var7);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 51)
    public static void method2598(int arg0) {
        field6012 = null;
        if (arg0 != 20) {
            field6012 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIII)I", line = 72)
    public static final int method2599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 8070) {
            field6011 = 57;
        }
        field6010++;
        if (class50.field816 == null) {
            return 0;
        }
        if (arg1 < 3) {
            int var6 = arg2 >> 7;
            int var7 = arg4 >> 7;
            if (arg0 < 0 || arg5 < 0 || arg0 > class183.field2703 - 1 || (class66.field1056 - 1) < arg5) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || class183.field2703 - 1 < var6 || (class66.field1056 - 1) < var7) {
                return 0;
            }
            boolean var8 = (class278.field4176[1][arg2 >> 7][arg4 >> 7] & 0x2) != 0;
            if ((arg2 & 0x7F) == 0) {
                boolean var9 = (class278.field4176[1][var6 - 1][arg4 >> 7] & 0x2) != 0;
                boolean var10 = (class278.field4176[1][var6][arg4 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class278.field4176[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if ((arg4 & 0x7F) == 0) {
                boolean var11 = (class278.field4176[1][arg2 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class278.field4176[1][arg2 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class278.field4176[1][arg0][arg5] & 0x2) != 0;
                }
            }
            if (var8) {
                arg1++;
            }
        }
        return class50.field816[arg1].method809(arg2, arg4);
    }
}
