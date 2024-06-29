import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class212 extends class264 {

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    private int field2983;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    private int field2976;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    private int field2995;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "I")
    private int field2992;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    private int field2991;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public int field2978;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "[I")
    public static int[] field2977 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "J")
    public static long field2982 = 0L;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "S")
    public static short field2990 = 256;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "I")
    public static int field2993 = -1;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field2981;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field2986;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    public static int field2994;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)Z", line = 6)
    public final boolean method1450(int arg0, int arg1, int arg2) {
        if (arg0 == 13980) {
            field2994++;
            return arg1 >= this.field2989 && this.field2988 >= arg1 && this.field2984 <= arg2 && arg2 <= this.field2978;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V", line = 28)
    public static final void method1451(int arg0, byte arg1) {
        field2985++;
        if (class315.field4618 == arg0) {
            return;
        }
        class195.field2745 = class78.field984 = class124.field1651[arg0];
        if (arg1 != 86) {
            method1455(4, 109, -119, -5, -90, 118, 90);
        }
        class74.field942.method93(50, (int) ((double) class195.field2745 * 34.46D));
        class252.field3702 = new int[class195.field2745][class78.field984];
        class387.field5661 = new int[class195.field2745][class78.field984];
        class75.field960 = new int[4][class195.field2745 >> 3][class78.field984 >> 3];
        for (int var2 = 0; var2 < 4; var2++) {
            class382.field5610[var2] = class281.method1900(-1, class78.field984, class195.field2745);
        }
        class444.field6472 = new byte[4][class195.field2745][class78.field984];
        class136.method908(class195.field2745, 4, class78.field984, true);
        class86.method584((byte) 30, class78.field984 >> 3, class195.field2745 >> 3, class74.field942);
        class315.field4618 = arg0;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZI)Z", line = 69)
    public final boolean method1452(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg2) {
            field2987++;
            return this.field2991 == arg1 && arg3 >= this.field2983 && this.field2976 >= arg3 && this.field2992 <= arg0 && arg0 <= this.field2995;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[III)V", line = 87)
    public final void method1453(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg2 == -19671) {
            arg1[0] = 0;
            arg1[1] = -this.field2983 - (-this.field2989 - arg3);
            field2981++;
            arg1[2] = arg0 + this.field2984 - this.field2992;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[IIB)V", line = 100)
    public final void method1454(int arg0, int[] arg1, int arg2, byte arg3) {
        arg1[2] = arg0 + this.field2992 - this.field2984;
        arg1[1] = this.field2983 + arg2 - this.field2989;
        arg1[0] = this.field2991;
        field2980++;
        int var5 = -29 % ((arg3 + 47) / 44);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)I", line = 117)
    public static final int method1455(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0 & 0x3;
        if ((arg3 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg5;
            arg5 = var8;
        }
        field2986++;
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 + 7 - arg4 - arg1;
        } else {
            if (arg2 != 7) {
                field2993 = -32;
            }
            return var7 == 2 ? 7 - arg6 - (arg5 - 1) : arg1;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZI)Z", line = 148)
    public final boolean method1456(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.method1450(74, -90, -115);
        }
        field2979++;
        return this.field2983 <= arg2 && this.field2976 >= arg2 && this.field2992 <= arg0 && arg0 <= this.field2995;
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 164)
    public static void method1457(byte arg0) {
        if (arg0 >= 95) {
            field2977 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIII)V", line = 178)
    public class212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2983 = arg1;
        this.field2976 = arg3;
        this.field2995 = arg4;
        this.field2984 = arg6;
        this.field2992 = arg2;
        this.field2991 = arg0;
        this.field2989 = arg5;
        this.field2988 = arg7;
        this.field2978 = arg8;
    }
}
