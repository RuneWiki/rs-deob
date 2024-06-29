import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class217 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)V")
    public static final void method1480(int arg0, byte arg1) {
        field3543++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class26.method230((byte) -78);
        } else if (arg0 == 2) {
            class35.method293(0);
        } else if (arg0 == 3) {
            class264.method1793((byte) 106);
        } else {
            throw new RuntimeException();
        }
        int var2 = -16 / ((arg1 - 39) / 57);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1481(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg0 != -62) {
            return;
        }
        field3542++;
        if (arg3 < 0 || arg7 < 0 || arg3 >= 103 || arg7 >= 103) {
            return;
        }
        if (arg4 == 0) {
            class229 var8 = class91.method682(arg5, arg3, arg7);
            if (var8 != null) {
                int var9 = (int) (var8.field3779 >>> 32) & Integer.MAX_VALUE;
                if (arg2 == 2) {
                    var8.field3775 = new class148(var9, 2, arg1 + 4, arg5, arg3, arg7, arg6, false, var8.field3775);
                    var8.field3784 = new class148(var9, 2, arg1 + 1 & 0x3, arg5, arg3, arg7, arg6, false, var8.field3784);
                } else {
                    var8.field3775 = new class148(var9, arg2, arg1, arg5, arg3, arg7, arg6, false, var8.field3775);
                }
            }
        }
        if (arg4 == 1) {
            class278 var10 = class179.method1220(arg5, arg3, arg7);
            if (var10 != null) {
                int var11 = Integer.MAX_VALUE & (int) (var10.field4372 >>> 32);
                if (arg2 == 4 || arg2 == 5) {
                    var10.field4390 = new class148(var11, 4, arg1, arg5, arg3, arg7, arg6, false, var10.field4390);
                } else if (arg2 == 6) {
                    var10.field4390 = new class148(var11, 4, arg1 + 4, arg5, arg3, arg7, arg6, false, var10.field4390);
                } else if (arg2 == 7) {
                    var10.field4390 = new class148(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg3, arg7, arg6, false, var10.field4390);
                } else if (arg2 == 8) {
                    var10.field4390 = new class148(var11, 4, arg1 + 4, arg5, arg3, arg7, arg6, false, var10.field4390);
                    var10.field4375 = new class148(var11, 4, (arg1 + 2 & 0x3) + 4, arg5, arg3, arg7, arg6, false, var10.field4375);
                }
            }
        }
        if (arg4 == 2) {
            if (arg2 == 11) {
                arg2 = 10;
            }
            class289 var12 = class10.method78(arg5, arg3, arg7);
            if (var12 != null) {
                var12.field4581 = new class148((int) (var12.field4574 >>> 32) & Integer.MAX_VALUE, arg2, arg1, arg5, arg3, arg7, arg6, false, var12.field4581);
            }
        }
        if (arg4 != 3) {
            return;
        }
        class42 var13 = class57.method425(arg5, arg3, arg7);
        if (var13 != null) {
            var13.field789 = new class148((int) (var13.field786 >>> 32) & Integer.MAX_VALUE, 22, arg1, arg5, arg3, arg7, arg6, false, var13.field789);
            return;
        }
    }
}
