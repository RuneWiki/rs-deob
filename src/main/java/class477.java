import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class477 extends class627 {

    @OriginalMember(owner = "client!ap", name = "s", descriptor = "I")
    private int field6814;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!ap", name = "z", descriptor = "I")
    private int field6821;

    @OriginalMember(owner = "client!ap", name = "v", descriptor = "I")
    private int field6817;

    @OriginalMember(owner = "client!ap", name = "p", descriptor = "I")
    public int field6811;

    @OriginalMember(owner = "client!ap", name = "r", descriptor = "I")
    private int field6813;

    @OriginalMember(owner = "client!ap", name = "u", descriptor = "I")
    private int field6816;

    @OriginalMember(owner = "client!ap", name = "q", descriptor = "I")
    public int field6812;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public int field6807;

    @OriginalMember(owner = "client!ap", name = "x", descriptor = "I")
    public static int field6819 = 0;

    @OriginalMember(owner = "client!ap", name = "A", descriptor = "[[I")
    public static int[][] field6822 = new int[6][];

    @OriginalMember(owner = "client!ap", name = "y", descriptor = "I")
    public static int field6820 = 0;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6806;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "I")
    public static int field6808;

    @OriginalMember(owner = "client!ap", name = "n", descriptor = "I")
    public static int field6809;

    @OriginalMember(owner = "client!ap", name = "o", descriptor = "I")
    public static int field6810;

    @OriginalMember(owner = "client!ap", name = "t", descriptor = "I")
    public static int field6815;

    @OriginalMember(owner = "client!ap", name = "w", descriptor = "I")
    public static int field6818;

    @OriginalMember(owner = "client!ap", name = "B", descriptor = "I")
    public static int field6823;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    public static int field6824;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIII)Z")
    public final boolean method2788(byte arg0, int arg1, int arg2, int arg3) {
        field6809++;
        if (arg0 <= 3) {
            this.field6811 = -13;
        }
        return this.field6817 == arg1 && arg3 >= this.field6813 && arg3 <= this.field6814 && this.field6816 <= arg2 && this.field6821 >= arg2;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I[IIB)V")
    public final void method2789(int arg0, int[] arg1, int arg2, byte arg3) {
        field6815++;
        arg1[2] = this.field6807 + arg0 - this.field6816;
        arg1[0] = 0;
        arg1[1] = this.field6811 + arg2 - this.field6813;
        if (arg3 < 91) {
            this.method2790(-18, true, -94);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IZI)Z")
    public final boolean method2790(int arg0, boolean arg1, int arg2) {
        field6818++;
        if (arg1) {
            return arg0 >= this.field6811 && arg0 <= this.field6805 && arg2 >= this.field6807 && this.field6812 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IBI)Z")
    public final boolean method2791(int arg0, byte arg1, int arg2) {
        int var4 = 72 % ((arg1 + 8) / 50);
        field6808++;
        return this.field6813 <= arg2 && this.field6814 >= arg2 && this.field6816 <= arg0 && arg0 <= this.field6821;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BIIII)Z")
    public static final boolean method2792(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field6824++;
        if (!class182.field2387 || !class379.field5297) {
            return false;
        } else if (class540.field7599 < 100) {
            return false;
        } else if (class432.method2572(arg4, arg2, 1, arg3)) {
            int var5 = arg2 << class455.field6383;
            int var6 = arg3 << class455.field6383;
            if (arg0 != -114) {
                field6820 = 11;
            }
            if (class600.method3306(class431.field6109, arg1, class431.field6109, (byte) -62, class517.field7282[arg4].method2381(-107, arg2, arg3), var6, var5)) {
                class15.field208++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(II[II)V")
    public final void method2793(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[arg0] = arg3 - (this.field6807 - this.field6816);
        arg2[1] = arg1 + this.field6813 - this.field6811;
        field6810++;
        arg2[0] = this.field6817;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Z)V")
    public static void method2794(boolean arg0) {
        field6822 = null;
        if (!arg0) {
            field6819 = -101;
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6814 = arg3;
        this.field6805 = arg7;
        this.field6821 = arg4;
        this.field6817 = arg0;
        this.field6811 = arg5;
        this.field6813 = arg1;
        this.field6816 = arg2;
        this.field6812 = arg8;
        this.field6807 = arg6;
    }
}
