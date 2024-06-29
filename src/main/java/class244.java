import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class244 extends class379 {

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Lgha;")
    public static class366 field2876 = new class366();

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public int field2880;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "I")
    public int field2882;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "[I")
    public int[] field2879;

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "[I")
    public int[] field2881;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "[I")
    public int[] field2883;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[Lpga;")
    public class561[] field2875;

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[Lpga;")
    public class561[] field2884;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[[[B")
    public byte[][][] field2877;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method1470(int arg0) {
        if (arg0 != 947) {
            method1471(-45, -87, 101, -66, -73, -17);
        }
        field2876 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIII)V")
    public static final void method1471(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2878++;
        if (arg2 == arg3) {
            class607.method3449(arg4, arg0, arg1, (byte) -78, arg3);
            return;
        }
        if (arg5 != 8616) {
            field2876 = null;
        }
        if (arg1 - arg3 >= class471.field6572 && class223.field2604 >= (arg1 + arg3) && class187.field2268 <= arg0 - arg2 && class461.field6480 >= (arg0 + arg2)) {
            class740.method4154(arg3, arg1, (byte) 57, arg0, arg4, arg2);
        } else {
            class66.method602(arg0, arg5 - 8721, arg3, arg4, arg1, arg2);
        }
    }
}
