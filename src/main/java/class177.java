import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class class177 extends class217 {

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Z")
    public boolean field2649;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "[Lkj;")
    public class177[] field2646;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "[I")
    public static int[] field2641 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!kj", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2657 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "I")
    public static int field2653;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
    public static int field2656;

    @OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "Lhf;")
    public class201 field2645;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "Ltl;")
    public class208 field2652;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIZ)[I", line = 5)
    public final int[] method1280(int arg0, int arg1, boolean arg2) {
        field2651++;
        if (arg2) {
            this.method465(115);
        }
        return this.field2646[arg1].field2649 ? this.field2646[arg1].method95(-112, arg0) : this.field2646[arg1].method99(arg0, -23387)[0];
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)I", line = 31)
    public int method1281(byte arg0) {
        if (arg0 <= 59) {
            this.field2646 = (class177[]) null;
        }
        field2639++;
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[I", line = 47)
    public int[] method95(int arg0, int arg1) {
        field2638++;
        if (arg0 > -52) {
            this.field2646 = (class177[]) null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V", line = 59)
    public static final void method1282(byte arg0) {
        field2644++;
        if (arg0 == 53 && class242.field3637 == 5) {
            class242.field3637 = 6;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BI)I", line = 78)
    public static final int method1283(byte arg0, int arg1) {
        if (arg0 > -24) {
            field2657 = (String[]) null;
        }
        field2647++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lhb;B)Ltm;", line = 97)
    public static final class71 method1284(class35 arg0, byte arg1) {
        if (arg1 == -79) {
            field2643++;
            return new class71(arg0.method260((byte) 115), arg0.method260((byte) -71), arg0.method260((byte) -63), arg0.method260((byte) -67), arg0.method260((byte) 110), arg0.method260((byte) -106), arg0.method260((byte) 105), arg0.method260((byte) 116), arg0.method269(false), arg0.method273(arg1 ^ 0xFFFF00B1));
        } else {
            return (class71) null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 112)
    public void method465(int arg0) {
        int var2 = 126 % ((arg0 + 6) / 43);
        field2655++;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I", line = 123)
    public int method111(int arg0) {
        int var2 = 78 / ((arg0 - 74) / 40);
        field2653++;
        return -1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)[[I", line = 140)
    public final int[][] method1285(int arg0, int arg1, int arg2) {
        if (arg2 != 27847) {
            return (int[][]) ((int[][]) null);
        }
        field2658++;
        if (this.field2646[arg0].field2649) {
            int[] var4 = this.field2646[arg0].method95(arg2 ^ 0xFFFF9379, arg1);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field2646[arg0].method99(arg1, -23387);
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V", line = 175)
    public static void method1286(int arg0) {
        field2657 = null;
        if (arg0 != 3) {
            field2642 = -30;
        }
        field2641 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IIZ)V", line = 187)
    public final void method1287(int arg0, int arg1, boolean arg2) {
        int var4 = this.field2648 == 255 ? arg1 : this.field2648;
        if (!arg2) {
            this.field2649 = true;
        }
        field2654++;
        if (this.field2649) {
            this.field2652 = new class208(var4, arg1, arg0);
        } else {
            this.field2645 = new class201(var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V", line = 209)
    public void method115(boolean arg0) {
        field2656++;
        if (arg0) {
            return;
        }
        if (this.field2649) {
            this.field2652.method1482(2);
            this.field2652 = null;
        } else {
            this.field2645.method1453((byte) 39);
            this.field2645 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lhb;II)V", line = 234)
    public void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 == -18061) {
            field2650++;
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IZ)V", line = 242)
    public class177(int arg0, boolean arg1) {
        this.field2649 = arg1;
        this.field2646 = new class177[arg0];
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)[[I", line = 263)
    public int[][] method99(int arg0, int arg1) {
        field2640++;
        if (arg1 == -23387) {
            throw new IllegalStateException("This operation does not have a colour output");
        }
        return (int[][]) ((int[][]) null);
    }
}
