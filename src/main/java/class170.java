import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class170 extends class12 {

    @OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
    public int field3059 = 0;

    @OriginalMember(owner = "client!pf", name = "G", descriptor = "[Lfa;")
    public class57[] field3063 = new class57[5];

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "[I")
    public int[] field3079 = new int[5];

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "I")
    public int field3077;

    @OriginalMember(owner = "client!pf", name = "M", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!pf", name = "E", descriptor = "I")
    public int field3061;

    @OriginalMember(owner = "client!pf", name = "J", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "Z")
    public static boolean field3051 = true;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!pf", name = "D", descriptor = "I")
    public int field3060;

    @OriginalMember(owner = "client!pf", name = "H", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!pf", name = "I", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "Lba;")
    public class13 field3057;

    @OriginalMember(owner = "client!pf", name = "B", descriptor = "Lpf;")
    public class170 field3058;

    @OriginalMember(owner = "client!pf", name = "K", descriptor = "Lqd;")
    public class179 field3067;

    @OriginalMember(owner = "client!pf", name = "N", descriptor = "Lvi;")
    public class238 field3070;

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "Lw;")
    public class239 field3073;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "Lce;")
    public class28 field3074;

    @OriginalMember(owner = "client!pf", name = "F", descriptor = "Lib;")
    public class90 field3062;

    @OriginalMember(owner = "client!pf", name = "L", descriptor = "Z")
    public boolean field3068;

    @OriginalMember(owner = "client!pf", name = "O", descriptor = "Z")
    public boolean field3071;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "Z")
    public boolean field3075;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "[I")
    public static int[] field3052;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 0) {
            return;
        }
        if (arg5 >= class240.field4355 && class146.field2678 >= arg5 && arg8 >= class240.field4355 && class146.field2678 >= arg8 && class240.field4355 <= arg0 && arg0 <= class146.field2678 && arg6 >= class240.field4355 && arg6 <= class146.field2678 && class159.field2910 <= arg3 && class224.field4040 >= arg3 && arg9 >= class159.field2910 && arg9 <= class224.field4040 && class159.field2910 <= arg7 && arg7 <= class224.field4040 && arg2 >= class159.field2910 && class224.field4040 >= arg2) {
            class159.method1131(arg9, arg4, arg3, arg5, arg8, -121, arg0, arg6, arg2, arg7);
        } else {
            class165.method1173(arg5, arg0, arg2, arg7, arg8, arg4, arg6, arg9, arg3, 28223);
        }
        field3055++;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(III)V")
    public class170(int arg0, int arg1, int arg2) {
        this.field3077 = arg2;
        this.field3061 = this.field3069 = arg0;
        this.field3066 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(B)V")
    public static void method1198(byte arg0) {
        if (arg0 != 116) {
            field3051 = false;
        }
        field3052 = null;
    }
}
