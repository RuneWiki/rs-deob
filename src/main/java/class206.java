import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class206 extends class288 {

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "I")
    public int field2923 = 0;

    @OriginalMember(owner = "client!hg", name = "B", descriptor = "I")
    public int field2933 = -1;

    @OriginalMember(owner = "client!hg", name = "z", descriptor = "I")
    public static int field2931 = 0;

    @OriginalMember(owner = "client!hg", name = "x", descriptor = "Ljava/lang/String;")
    public static String field2929 = "Please wait...";

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Ljava/util/Random;")
    public static Random field2919 = new Random();

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public int field2918;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field2921;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field2922;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!hg", name = "v", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!hg", name = "w", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!hg", name = "y", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
    public int field2932;

    @OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "Lbc;")
    public static class282 field2920;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2926++;
        if (arg1 == arg2) {
            class204.method1319(arg0, (byte) 90, arg5, arg3, arg1);
            return;
        }
        if (arg4 != -24074) {
            field2935 = 90;
        }
        if (arg0 - arg1 >= class177.field2514 && class279.field4238 >= (arg0 + arg1) && (arg5 - arg2) >= class286.field4431 && class230.field3302 >= arg2 + arg5) {
            class175.method1136(arg2, arg5, arg3, arg1, arg0, (byte) 72);
        } else {
            class14.method86(7, arg0, arg5, arg1, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
    public static final int method1322(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2928++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (arg2 == var4) {
            return 7 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field2929 = null;
        if (arg0 <= 57) {
            field2931 = 13;
        }
        field2919 = null;
        field2920 = null;
    }
}
