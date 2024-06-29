import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class159 extends class291 {

    @OriginalMember(owner = "client!mf", name = "Z", descriptor = "Ldk;")
    private final class193 field2650;

    @OriginalMember(owner = "client!mf", name = "S", descriptor = "Lqh;")
    public final class28 field2643;

    @OriginalMember(owner = "client!mf", name = "W", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2647 = Calendar.getInstance();

    @OriginalMember(owner = "client!mf", name = "gb", descriptor = "Leg;")
    public static class37 field2657 = class174.method1167("titlebg", 95);

    @OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
    public static int field2658 = 0;

    @OriginalMember(owner = "client!mf", name = "cb", descriptor = "[[B")
    public static byte[][] field2653 = new byte[50][];

    @OriginalMember(owner = "client!mf", name = "jb", descriptor = "Leg;")
    public static class37 field2660 = class174.method1167(":duelfriend:", 65);

    @OriginalMember(owner = "client!mf", name = "kb", descriptor = "I")
    public static int field2661 = 0;

    @OriginalMember(owner = "client!mf", name = "ib", descriptor = "I")
    public static int field2659 = -1;

    @OriginalMember(owner = "client!mf", name = "fb", descriptor = "Leg;")
    private static class37 field2656 = class174.method1167("shake:", -111);

    @OriginalMember(owner = "client!mf", name = "ab", descriptor = "Leg;")
    public static class37 field2651 = field2656;

    @OriginalMember(owner = "client!mf", name = "db", descriptor = "Leg;")
    public static class37 field2654 = field2656;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!mf", name = "T", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mf", name = "U", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!mf", name = "V", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
    public int field2648;

    @OriginalMember(owner = "client!mf", name = "Y", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!mf", name = "bb", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!mf", name = "eb", descriptor = "I")
    public static int field2655;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(Z)V")
    public static void method1081(boolean arg0) {
        field2651 = null;
        field2653 = null;
        if (arg0) {
            method1084(56);
        }
        field2660 = null;
        field2657 = null;
        field2656 = null;
        field2647 = null;
        field2654 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIII)V")
    public final void method1082(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 0) {
            method1083(101, (byte) 77, -62, 85, -91, 38, -39, 111, 18, 121);
        }
        this.field2642 = arg0;
        this.field2641 = arg2;
        this.field2637 = arg1;
        field2644++;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method1083(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg1 != 9) {
            field2647 = null;
        }
        if (class178.field2972 <= arg4 && arg4 <= class217.field3741 && arg2 >= class178.field2972 && arg2 <= class217.field3741 && arg7 >= class178.field2972 && class217.field3741 >= arg7 && class178.field2972 <= arg6 && arg6 <= class217.field3741 && arg0 >= class286.field5050 && arg0 <= class96.field1507 && class286.field5050 <= arg3 && arg3 <= class96.field1507 && arg8 >= class286.field5050 && class96.field1507 >= arg8 && arg9 >= class286.field5050 && class96.field1507 >= arg9) {
            class59.method429(arg5, arg8, arg0, arg2, -125, arg7, arg4, arg3, arg9, arg6);
        } else {
            class113.method812(arg0, arg5, arg9, arg8, arg3, arg2, arg7, arg4, (byte) -40, arg6);
        }
        field2646++;
    }

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "(I)Lmd;")
    public static final class208 method1084(int arg0) {
        if (arg0 < 97) {
            field2656 = null;
        }
        field2638++;
        class14 var1 = new class14(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], class170.field2848[0], class262.field4617);
        class5.method33(24094);
        return var1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lqh;Ldk;)V")
    public class159(class28 arg0, class193 arg1) {
        this.field2650 = arg1;
        this.field2643 = arg0;
    }
}
