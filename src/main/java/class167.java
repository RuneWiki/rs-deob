import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class167 extends class14 {

    @OriginalMember(owner = "client!bp", name = "t", descriptor = "I")
    public int field2223;

    @OriginalMember(owner = "client!bp", name = "s", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "Luw;")
    public static class208 field2216 = new class208(8, -1);

    @OriginalMember(owner = "client!bp", name = "q", descriptor = "[J")
    public static long[] field2220 = new long[100];

    @OriginalMember(owner = "client!bp", name = "u", descriptor = "[Ljba;")
    public static class11[] field2224 = new class11[14];

    @OriginalMember(owner = "client!bp", name = "r", descriptor = "I")
    public static int field2221 = -1;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!bp", name = "v", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method1062(int arg0, int arg1) {
        if (arg1 != -1) {
            method1064(null, -54, 112);
        }
        field2218++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lpf;Ldg;IIIIIIIIII)V", line = 16)
    public class167(class759 arg0, class20 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2223 = arg11;
        this.field2222 = arg10;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 27)
    public static void method1063(int arg0) {
        field2224 = null;
        int var1 = -41 / ((arg0 + 57) / 57);
        field2216 = null;
        field2220 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 46)
    public static final void method1064(String arg0, int arg1, int arg2) {
        field2219++;
        if (arg1 <= 55) {
            field2216 = null;
        }
        class614 var3 = class497.method2759(3, 5977, (long) arg2);
        var3.method3277(639);
        var3.field7737 = arg0;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)Lgp;", line = 61)
    public final class576 method3(byte arg0) {
        if (arg0 >= -15) {
            this.field2222 = 4;
        }
        field2217++;
        return class170.field2261;
    }
}
