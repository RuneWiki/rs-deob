import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class408 extends class498 {

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public int field5766 = 0;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public int field5776 = -1;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "[I")
    public static int[] field5767 = new int[13];

    @OriginalMember(owner = "client!hj", name = "n", descriptor = "[I")
    public static int[] field5765 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "Lmq;")
    public static class358 field5775 = new class358();

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field5782 = 0;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public int field5769;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
    public int field5771;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public static int field5772;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public int field5774;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "I")
    public int field5777;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public int field5778;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public int field5779;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field5780;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public int field5781;

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "I")
    public static int field5783;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIII)I", line = 3)
    public static final int method2417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5772++;
        if (class330.field4818 == null) {
            return 0;
        }
        if (arg2 < 3) {
            label102: {
                int var6 = arg0 >> 7;
                int var7 = arg5 >> 7;
                if (arg4 >= 0 && arg3 >= 0 && class43.field494 - 1 >= arg4 && (class500.field7068 - 1) >= arg3) {
                    if (var6 >= 1 && var7 >= 1 && var6 <= (class43.field494 - 1) && (class500.field7068 - 1) >= var7) {
                        boolean var8 = (class368.field5253[1][arg0 >> 7][arg5 >> 7] & 0x2) != 0;
                        if ((arg0 & 0x7F) == 0) {
                            boolean var9 = (class368.field5253[1][var6 - 1][arg5 >> 7] & 0x2) != 0;
                            boolean var10 = (class368.field5253[1][var6][arg5 >> 7] & 0x2) != 0;
                            if (var9 != var10) {
                                var8 = (class368.field5253[1][arg4][arg3] & 0x2) != 0;
                            }
                        }
                        if ((arg5 & 0x7F) == 0) {
                            boolean var11 = (class368.field5253[1][arg0 >> 7][var7 - 1] & 0x2) != 0;
                            boolean var12 = (class368.field5253[1][arg0 >> 7][var7] & 0x2) != 0;
                            if (var12 != var11) {
                                var8 = (class368.field5253[1][arg4][arg3] & 0x2) != 0;
                            }
                        }
                        if (var8) {
                            arg2++;
                        }
                        break label102;
                    }
                    return 0;
                }
                return 0;
            }
        }
        if (arg1 != -19425) {
            field5765 = null;
        }
        return class330.field4818[arg2].method11(arg0, arg5);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V", line = 79)
    public static void method2418(int arg0) {
        field5767 = null;
        field5765 = null;
        if (arg0 != 2) {
            field5767 = null;
        }
        field5775 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lza;B)V", line = 94)
    public static final void method2419(class290 arg0, byte arg1) {
        if (arg1 != -27) {
            method2418(-70);
        }
        field5780++;
        if (class424.field5977) {
            class12.method68(true, arg0);
        } else {
            class132.method839((byte) -72, arg0);
        }
    }
}
