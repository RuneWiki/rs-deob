import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class189 extends class529 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    public int field2758;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    private int field2743;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field2754;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field2748;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "I")
    private int field2761;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    private int field2759;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public static int field2756 = 0;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "[B")
    public static byte[] field2762 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2753 = 0;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "[Lnb;")
    public static class249[] field2745 = new class249[14];

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "F")
    public static float field2746;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "Lo;")
    public static class139 field2751;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BIII)Z")
    public final boolean method1180(byte arg0, int arg1, int arg2, int arg3) {
        int var5 = -104 % ((arg0 + 16) / 56);
        field2752++;
        return this.field2743 == arg3 && this.field2759 <= arg1 && this.field2747 >= arg1 && this.field2761 <= arg2 && arg2 <= this.field2757;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI[I)V")
    public final void method1181(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[1] = this.field2759 + arg2 - this.field2748;
        field2749++;
        arg3[2] = arg0 + this.field2761 - this.field2754;
        arg3[0] = this.field2743;
        if (arg1 > -120) {
            this.method1185(17, 122, (byte) 32);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B[III)V")
    public final void method1182(byte arg0, int[] arg1, int arg2, int arg3) {
        field2750++;
        arg1[1] = arg2 + this.field2748 - this.field2759;
        arg1[0] = 0;
        arg1[2] = this.field2754 - (this.field2761 - arg3);
        if (arg0 != -96) {
            this.method1185(118, -28, (byte) -48);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public final boolean method1183(int arg0, int arg1, int arg2) {
        field2763++;
        if (arg1 == -12070) {
            return this.field2748 <= arg2 && arg2 <= this.field2760 && arg0 >= this.field2754 && arg0 <= this.field2758;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1184(byte arg0) {
        if (arg0 != 95) {
            field2753 = 51;
        }
        field2762 = null;
        field2751 = null;
        field2745 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB)Z")
    public final boolean method1185(int arg0, int arg1, byte arg2) {
        field2755++;
        if (arg2 != 4) {
            field2744 = 29;
        }
        return this.field2759 <= arg1 && arg1 <= this.field2747 && this.field2761 <= arg0 && arg0 <= this.field2757;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2747 = arg3;
        this.field2758 = arg8;
        this.field2757 = arg4;
        this.field2743 = arg0;
        this.field2754 = arg6;
        this.field2748 = arg5;
        this.field2761 = arg2;
        this.field2760 = arg7;
        this.field2759 = arg1;
    }
}
