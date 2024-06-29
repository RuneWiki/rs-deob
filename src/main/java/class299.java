import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class299 extends class184 {

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "I")
    public int field4234 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public int field4236 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
    public int field4238 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    public int field4235 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "I")
    public int field4242 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nba", name = "y", descriptor = "I")
    public int field4246 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public int field4248 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "I")
    public int field4247 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "Ltl;")
    public class622 field4237;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "Lada;")
    public static class164 field4241 = new class164();

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field4243 = 0;

    @OriginalMember(owner = "client!nba", name = "x", descriptor = "Lqe;")
    public static class469 field4245 = new class469(5, 4);

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "Lef;")
    public static class489 field4249 = new class489();

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "Ljava/util/Random;")
    public static Random field4250 = new Random();

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "I")
    public static int field4240;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "Lvd;")
    public static class39 field4244;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V", line = 6)
    public static void method1883(byte arg0) {
        field4249 = null;
        field4244 = null;
        field4241 = null;
        field4250 = null;
        field4245 = null;
        if (arg0 <= 36) {
            field4244 = null;
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Ltl;)V", line = 110)
    public class299(class622 arg0) {
        this.field4237 = arg0;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)Z", line = 48)
    public final boolean method1884(int arg0, int arg1, int arg2) {
        field4239++;
        if (arg2 >= this.field4246 && arg2 <= this.field4238 && this.field4235 <= arg0 && this.field4234 >= arg0) {
            return true;
        } else if (arg1 == 11384) {
            return arg2 >= this.field4248 && arg2 <= this.field4247 && this.field4236 <= arg0 && this.field4242 >= arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIII)V", line = 73)
    public static final void method1885(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 5) {
            method1883((byte) -107);
        }
        field4240++;
        if (class497.field7073 <= arg3 && arg2 <= class391.field5895 && class166.field2622 <= arg1 && class432.field6446 >= arg4) {
            class447.method2761((byte) 97, arg2, arg1, arg4, arg5, arg3);
        } else {
            class578.method3351(arg1, arg3, (byte) 1, arg4, arg5, arg2);
        }
    }
}
