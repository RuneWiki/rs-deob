import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class329 {

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public int field4026 = 0;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
    public static int[] field4028 = new int[14];

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "Lrn;")
    public static class633 field4029 = new class633(79, 3);

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "D")
    public static double field4027;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "[[B")
    public static byte[][] field4032;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
    public static void method1906(int arg0) {
        field4028 = null;
        field4029 = null;
        int var1 = 63 / ((arg0 + 52) / 49);
        field4032 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILmc;I)V")
    private final void method1907(int arg0, class234 arg1, int arg2) {
        field4025++;
        if (arg2 != -1) {
            this.method1907(-15, null, 118);
        }
        if (arg0 == 5) {
            this.field4026 = arg1.method1553((byte) -122);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)I")
    public static final int method1908(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 7338) {
            method1908(-21, -4, 107, -60, 52, 3);
        }
        field4024++;
        if (class116.field1542 == null) {
            return 0;
        }
        if (arg0 < 3) {
            int var6 = arg3 >> 9;
            int var7 = arg5 >> 9;
            if (arg2 < 0 || arg4 < 0 || class240.field3280 - 1 < arg2 || arg4 > (class276.field3602 - 1)) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class240.field3280 - 1) || var7 > (class276.field3602 - 1)) {
                return 0;
            }
            boolean var8 = (class410.field5439[1][arg3 >> 9][arg5 >> 9] & 0x2) != 0;
            if ((arg3 & 0x1FF) == 0) {
                boolean var9 = (class410.field5439[1][var6 - 1][arg5 >> 9] & 0x2) != 0;
                boolean var10 = (class410.field5439[1][var6][arg5 >> 9] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class410.field5439[1][arg2][arg4] & 0x2) != 0;
                }
            }
            if ((arg5 & 0x1FF) == 0) {
                boolean var11 = (class410.field5439[1][arg3 >> 9][var7 - 1] & 0x2) != 0;
                boolean var12 = (class410.field5439[1][arg3 >> 9][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class410.field5439[1][arg2][arg4] & 0x2) != 0;
                }
            }
            if (var8) {
                arg0++;
            }
        }
        return class116.field1542[arg0].method2072((byte) 89, arg3, arg5);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BI)V")
    public static final void method1909(byte arg0, int arg1) {
        if (arg0 < 6) {
            method1909((byte) -47, 38);
        }
        field4031++;
        class720 var2 = (class720) class479.field6198.method2616((long) arg1, (byte) -98);
        if (var2 != null) {
            var2.field9460 = !var2.field9460;
            var2.field9464.method599(113, var2.field9460);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lmc;B)V")
    public final void method1910(class234 arg0, byte arg1) {
        field4030++;
        while (true) {
            int var3 = arg0.method1509(true);
            if (var3 == 0) {
                if (arg1 < 25) {
                    method1906(-121);
                    return;
                } else {
                    return;
                }
            }
            this.method1907(var3, arg0, -1);
        }
    }
}
