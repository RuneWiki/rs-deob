import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class531 extends class504 {

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    public int field7070;

    @OriginalMember(owner = "client!kj", name = "u", descriptor = "I")
    public int field7077;

    @OriginalMember(owner = "client!kj", name = "x", descriptor = "I")
    private int field7080;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "I")
    private int field7073;

    @OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    private int field7074;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    private int field7066;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public int field7072;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field7069;

    @OriginalMember(owner = "client!kj", name = "w", descriptor = "[I")
    public static int[] field7079 = new int[6];

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!kj", name = "t", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!kj", name = "v", descriptor = "I")
    public static int field7078;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7075;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "[I")
    public static int[] field7071;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)Z", line = 6)
    public final boolean method2960(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            this.field7066 = 73;
        }
        field7076++;
        return this.field7080 == arg1 && arg0 >= this.field7066 && arg0 <= this.field7074 && arg3 >= this.field7073 && this.field7069 >= arg3;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III[I)V", line = 30)
    public final void method2961(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = this.field7070 + arg0 - this.field7066;
        arg3[2] = arg2 - (this.field7073 - this.field7072);
        arg3[0] = 0;
        field7065++;
        if (arg1 != 6) {
            this.field7073 = -65;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z", line = 43)
    public final boolean method2962(int arg0, int arg1, int arg2) {
        field7067++;
        if (arg2 == -26516) {
            return this.field7066 <= arg1 && this.field7074 >= arg1 && this.field7073 <= arg0 && this.field7069 >= arg0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 58)
    public static void method2963(byte arg0) {
        field7071 = null;
        field7075 = null;
        field7079 = null;
        if (arg0 > -51) {
            field7071 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(III)Z", line = 70)
    public final boolean method2964(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            this.field7070 = 94;
        }
        field7078++;
        return arg1 >= this.field7070 && arg1 <= this.field7081 && this.field7072 <= arg2 && this.field7077 >= arg2;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(IIIIIIIII)V", line = 97)
    public class531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field7070 = arg5;
        this.field7077 = arg8;
        this.field7080 = arg0;
        this.field7073 = arg2;
        this.field7081 = arg7;
        this.field7074 = arg3;
        this.field7066 = arg1;
        this.field7072 = arg6;
        this.field7069 = arg4;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IBI[I)V", line = 113)
    public final void method2965(int arg0, byte arg1, int arg2, int[] arg3) {
        arg3[1] = this.field7066 + arg0 - this.field7070;
        arg3[0] = this.field7080;
        int var5 = -58 / ((arg1 - 68) / 49);
        arg3[2] = this.field7073 + arg2 - this.field7072;
        field7068++;
    }
}
