import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class313 extends class157 {

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    private int field4927;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    private int field4931;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    private int field4926;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "Z")
    public static volatile boolean field4930 = false;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "D")
    public static double field4928 = -1.0D;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "Lgd;")
    public static class325 field4923 = new class325(64);

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lpk;")
    public static class120 field4924;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V", line = 6)
    public final void method142(int arg0, int arg1, int arg2) {
        field4925++;
        if (arg1 != -1) {
            method2204((class120) null, (class120) null, -49, (byte) 20, 94);
        }
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(III)V", line = 23)
    public final void method144(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            method2207(true, -26);
        }
        field4922++;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(IIIIII)V", line = 34)
    public class313(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4935 = arg2;
        this.field4927 = arg0;
        this.field4931 = arg3;
        this.field4926 = arg1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lpk;Lpk;IBI)Ljj;", line = 48)
    public static final class159 method2204(class120 arg0, class120 arg1, int arg2, byte arg3, int arg4) {
        if (arg3 < 117) {
            return (class159) null;
        } else {
            field4936++;
            return class107.method854(arg1, arg4, arg2, (byte) 97) ? class323.method2275(arg0.method967(arg2, arg4, 65280), 94) : null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 64)
    public static void method2205(int arg0) {
        field4924 = null;
        if (arg0 != -16872) {
            method2204((class120) null, (class120) null, 10, (byte) 43, -85);
        }
        field4923 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(III)V", line = 80)
    public final void method141(int arg0, int arg1, int arg2) {
        field4934++;
        int var4 = this.field4927 * arg0 >> 12;
        int var5 = 46 / ((-arg1 - 24) / 60);
        int var6 = this.field4935 * arg0 >> 12;
        int var7 = this.field4931 * arg2 >> 12;
        int var8 = this.field4926 * arg2 >> 12;
        class191.method1376(var4, var8, this.field2573, var6, -93, var7);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 101)
    public static final void method2206(int arg0) {
        field4933++;
        if (!class314.field4950) {
            return;
        }
        class288.field4547 = null;
        class6.field142 = null;
        if (arg0 == -1) {
            class314.field4950 = false;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V", line = 118)
    public static final void method2207(boolean arg0, int arg1) {
        field4929++;
        if (arg1 != 27113) {
            method2206(-47);
        }
        if (class129.field2069 != arg0) {
            class129.field2069 = arg0;
            class20.method210(-1);
        }
    }
}
