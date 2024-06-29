import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class209 extends class439 {

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field2995;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    private int field3000;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    private int field2993;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    private int field2994;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    private int field3001;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public int field2992;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([IIII)V", line = 5)
    public final void method1389(int[] arg0, int arg1, int arg2, int arg3) {
        arg0[1] = arg2 - (this.field2992 - this.field2994);
        arg0[0] = this.field3001;
        if (arg3 < -77) {
            field2997++;
            arg0[2] = -this.field2989 - (-this.field2993 - arg1);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(BII)Z", line = 28)
    public final boolean method1390(byte arg0, int arg1, int arg2) {
        field2988++;
        int var4 = 46 % ((arg0 + 3) / 62);
        return this.field2992 <= arg1 && arg1 <= this.field2995 && this.field2989 <= arg2 && this.field2990 >= arg2;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z", line = 45)
    public final boolean method1391(int arg0, int arg1, int arg2) {
        field2991++;
        if (arg2 == 1) {
            return arg0 >= this.field2994 && arg0 <= this.field3002 && this.field2993 <= arg1 && this.field3000 >= arg1;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBI)Z", line = 61)
    public final boolean method1392(int arg0, int arg1, byte arg2, int arg3) {
        field2999++;
        if (arg2 > -48) {
            return true;
        } else {
            return this.field3001 == arg0 && this.field2994 <= arg1 && arg1 <= this.field3002 && arg3 >= this.field2993 && arg3 <= this.field3000;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I[III)V", line = 76)
    public final void method1393(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[0] = 0;
        arg1[2] = arg2 - (this.field2993 - this.field2989);
        field2996++;
        arg1[1] = arg0 - (this.field2994 - this.field2992);
        if (arg3 <= 96) {
            this.field2989 = -52;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(IIIIIIIII)V", line = 89)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field2995 = arg7;
        this.field3000 = arg4;
        this.field2990 = arg8;
        this.field3002 = arg3;
        this.field2993 = arg2;
        this.field2994 = arg1;
        this.field2989 = arg6;
        this.field3001 = arg0;
        this.field2992 = arg5;
    }
}
