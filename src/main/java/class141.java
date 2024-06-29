import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class141 extends class259 {

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public int field2602 = 0;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "Z")
    public static boolean field2606 = false;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    public static int field2608 = 0;

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "I")
    public static volatile int field2604 = 0;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "Lcc;")
    public static class209 field2609 = class95.method669(127, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!nj", name = "I", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IZ)V")
    public static final void method980(int arg0, boolean arg1) {
        field2603++;
        if (arg0 > 107) {
            class191.method1315((byte) -50, arg1, class149.field2727, class50.field981, class25.field442);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ltf;ZI)V")
    private final void method981(class106 arg0, boolean arg1, int arg2) {
        if (arg2 == 2) {
            this.field2602 = arg0.method736(127);
        }
        field2607++;
        if (arg1) {
            method983(28, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILtf;)V")
    public final void method982(int arg0, class106 arg1) {
        field2611++;
        while (true) {
            int var3 = arg1.method774((byte) 96);
            if (var3 == 0) {
                if (arg0 < 103) {
                    method984(15, -125, 100, 65, -72, 15, 28);
                    return;
                } else {
                    return;
                }
            }
            this.method981(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IB)I")
    public static final int method983(int arg0, byte arg1) {
        field2612++;
        return arg1 <= 55 ? -121 : arg0 >>> 7;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIII)I")
    public static final int method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2605++;
        int var7 = arg6 & 0x3;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg3;
            arg3 = var8;
        }
        if (var7 == 0) {
            return arg0;
        } else if (var7 == 1) {
            return 8 - arg4 - arg2;
        } else if (var7 == 2) {
            return 1 + 7 - arg3 - arg0;
        } else {
            int var9 = -32 % ((-arg1 - 54) / 38);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!nj", name = "h", descriptor = "(I)V")
    public static void method985(int arg0) {
        if (arg0 != -8) {
            field2604 = 40;
        }
        field2609 = null;
    }
}
