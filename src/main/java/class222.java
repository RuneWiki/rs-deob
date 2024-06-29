import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public class class222 extends class333 {

    @OriginalMember(owner = "client!kea", name = "D", descriptor = "I")
    public int field2762;

    @OriginalMember(owner = "client!kea", name = "E", descriptor = "I")
    public int field2763;

    @OriginalMember(owner = "client!kea", name = "w", descriptor = "I")
    private int field2756;

    @OriginalMember(owner = "client!kea", name = "n", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!kea", name = "x", descriptor = "I")
    private int field2757;

    @OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
    private int field2754;

    @OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
    public int field2760;

    @OriginalMember(owner = "client!kea", name = "l", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
    public int field2752;

    @OriginalMember(owner = "client!kea", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2755 = "";

    @OriginalMember(owner = "client!kea", name = "z", descriptor = "Lsb;")
    public static class305 field2759 = new class305(82, -1);

    @OriginalMember(owner = "client!kea", name = "k", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!kea", name = "o", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!kea", name = "p", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!kea", name = "y", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!kea", name = "F", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!kea", name = "B", descriptor = "Ltf;")
    public static class701 field2761;

    @OriginalMember(owner = "client!kea", name = "m", descriptor = "[[B")
    public static byte[][] field2746;

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIII)V", line = 3)
    public final void method1338(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -1) {
            method1343(55);
        }
        arg0[2] = this.field2747 + arg3 - this.field2762;
        arg0[1] = this.field2757 + arg1 - this.field2752;
        field2753++;
        arg0[0] = this.field2745;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIII)Z", line = 20)
    public final boolean method1339(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method1345(20, 61, -124, -51, -77);
        }
        field2765++;
        return this.field2745 == arg1 && this.field2757 <= arg0 && arg0 <= this.field2754 && arg2 >= this.field2747 && this.field2756 >= arg2;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(III)Z", line = 35)
    public final boolean method1340(int arg0, int arg1, int arg2) {
        field2748++;
        int var4 = 66 % ((arg2 - 24) / 38);
        return arg0 >= this.field2757 && arg0 <= this.field2754 && this.field2747 <= arg1 && this.field2756 >= arg1;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IBIIIIII)V", line = 49)
    public static final void method1341(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -114) {
            field2744 = -66;
        }
        field2750++;
        if (class412.field5526 <= arg2 && arg7 <= class72.field740 && arg4 >= class93.field949 && arg3 <= class360.field4834) {
            class546.method3100(arg6, arg3, arg7, arg5, arg0, arg4, arg2, 55);
        } else {
            class631.method3540(arg3, arg7, (byte) -115, arg5, arg6, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "([IIIB)V", line = 69)
    public final void method1342(int[] arg0, int arg1, int arg2, byte arg3) {
        field2751++;
        arg0[1] = this.field2752 + arg1 - this.field2757;
        if (arg3 == -4) {
            arg0[2] = arg2 + this.field2762 - this.field2747;
            arg0[0] = 0;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)V", line = 90)
    public static void method1343(int arg0) {
        field2761 = null;
        if (arg0 != -13914) {
            field2746 = null;
        }
        field2746 = null;
        field2755 = null;
        field2759 = null;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(ILwp;IB)V", line = 106)
    public static final void method1344(int arg0, class452 arg1, int arg2, byte arg3) {
        class239.field2969 = arg1;
        class628.field8857 = arg2;
        field2764++;
        class201.field2381 = arg0;
        if (arg3 != -13) {
            field2744 = -59;
        }
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IIIII)V", line = 122)
    public static final void method1345(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2749++;
        float var5 = (float) class482.field6964 / (float) class482.field6946;
        int var6 = arg0;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg3 - (arg2 - var7) / 2;
        int var9 = arg1 - (arg0 - var6) / 2;
        class36.field373 = class482.field6964 - (class482.field6964 * var8 / var7);
        if (arg4 != -11567) {
            method1343(123);
        }
        class81.field838 = class482.field6946 * var9 / var6;
        class453.field6485 = -1;
        class634.field8930 = -1;
        class158.method858(118);
    }

    @OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(IIIIIIIII)V", line = 153)
    public class222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2762 = arg6;
        this.field2763 = arg7;
        this.field2756 = arg4;
        this.field2747 = arg2;
        this.field2757 = arg1;
        this.field2754 = arg3;
        this.field2760 = arg8;
        this.field2745 = arg0;
        this.field2752 = arg5;
    }

    @OriginalMember(owner = "client!kea", name = "a", descriptor = "(IZI)Z", line = 169)
    public final boolean method1346(int arg0, boolean arg1, int arg2) {
        field2758++;
        if (arg1) {
            this.field2747 = -59;
        }
        return arg0 >= this.field2752 && arg0 <= this.field2763 && this.field2762 <= arg2 && arg2 <= this.field2760;
    }
}
