import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class6 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "Lai;")
    public static class10 field70 = class44.method278("Neuer Benutzer", -72);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "Lai;")
    public static class10 field72 = class44.method278("mapdots", 96);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "Lmb;")
    public static class111 field75;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method15(byte arg0) {
        field70 = null;
        field72 = null;
        if (arg0 != 86) {
            field76 = 85;
        }
        field75 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I")
    public static final int method16(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg1 >>= 0x4;
        } else if (arg0 > 217) {
            arg1 >>= 0x3;
        } else if (arg0 > 192) {
            arg1 >>= 0x2;
        } else if (arg0 > 179) {
            arg1 >>= 0x1;
        }
        field71++;
        if (arg3 != 3) {
            field69 = -14;
        }
        return (arg1 >> 5 << 7) + (arg2 >> 2 << 10) + (arg0 >> 1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public abstract void method17(int arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lc;I)V")
    public static final void method18(class21 arg0, int arg1) {
        field68++;
        class47.field822 = arg0;
        class5.field63 = class47.field822.method142(16, -114);
        int var2 = 59 % ((arg1 - 23) / 49);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
    public abstract int method19(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILai;BLai;)V")
    public static final void method20(int arg0, class10 arg1, byte arg2, class10 arg3) {
        field74++;
        class201.method1305(null, arg3, arg1, false, arg0);
        if (arg2 != 117) {
            method16(108, -55, 111, 24);
        }
    }
}
