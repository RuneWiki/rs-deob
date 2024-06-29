import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class24 extends class487 {

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "Liaa;")
    public class495 field180;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Z")
    public static boolean field181 = false;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "Lea;")
    public static class547 field178 = new class547(67, -1);

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "[I")
    public static int[] field183 = new int[5];

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Llga;")
    public static class712 field182 = new class712(40, 4);

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "[C")
    public static char[] field184 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "[Z")
    public static boolean[] field186 = new boolean[100];

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "Lvea;")
    public static class276 field185 = new class276(9, 0, 4, 1);

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[Z")
    public static boolean[] field187 = new boolean[200];

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "F")
    public static float field179;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)I", line = 10)
    public static final int method95(int arg0, byte arg1) {
        field176++;
        if (arg1 != 64) {
            method96(100);
        }
        return (arg0 & 0x3FF26) >> 11;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lac;II[B)V", line = 20)
    public class24(class541 arg0, int arg1, int arg2, byte[] arg3) {
        this.field180 = class457.method2550(6406, arg2, 14764, 6406, arg0, false, arg3, arg1);
        this.field180.method3471(false, 10242, false);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 31)
    public static void method96(int arg0) {
        field187 = null;
        if (arg0 != 6406) {
            method97(null, 9, null, null, null, null);
        }
        field186 = null;
        field182 = null;
        field185 = null;
        field183 = null;
        field178 = null;
        field184 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lni;ILjga;Lqn;Lni;Lni;)Z", line = 48)
    public static final boolean method97(class522 arg0, int arg1, class716 arg2, class65 arg3, class522 arg4, class522 arg5) {
        field177++;
        class68.field755 = arg2;
        class629.field8776 = arg4;
        class413.field5837 = arg5;
        class266.field3526 = new int[16];
        class66.field737 = arg3;
        class666.field9280 = arg0;
        if (arg1 != -25233) {
            field178 = null;
        }
        for (int var6 = 0; var6 < 16; var6++) {
            class266.field3526[var6] = 255;
        }
        return true;
    }
}
