import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class162 {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public int field2576 = -1;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2573 = 0;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[I")
    public static int[] field2575 = new int[32];

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[I")
    public static int[] field2578 = new int[2];

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field2585 = 0;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field2571;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public int field2577;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field2580;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public int field2581;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V", line = 25)
    public static final void method1143(int arg0, int arg1) {
        class77.field1142 = -1;
        class60.field888 = false;
        class65.field994 = -1;
        class44.field698 = arg1;
        field2572++;
        class199.field3199 = 1;
        int var2 = -15 / ((45 - arg0) / 42);
        class298.field4829 = 0;
        class301.field4874 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lmh;IBLmh;I)Lwb;", line = 73)
    public static final class82 method1144(class65 arg0, int arg1, byte arg2, class65 arg3, int arg4) {
        if (arg2 < 57) {
            field2585 = 70;
        }
        field2586++;
        return class10.method40(arg4, true, arg1, arg3) ? class196.method1404(arg0.method454(arg1, 0, arg4), 0) : null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 104)
    public static void method1145(byte arg0) {
        field2575 = null;
        field2578 = null;
        if (arg0 != -89) {
            field2578 = (int[]) null;
        }
    }
}
