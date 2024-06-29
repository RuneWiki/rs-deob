import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class137 extends class73 {

    @OriginalMember(owner = "client!df", name = "r", descriptor = "I")
    public int field2564;

    @OriginalMember(owner = "client!df", name = "z", descriptor = "I")
    public int field2572;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field2560;

    @OriginalMember(owner = "client!df", name = "v", descriptor = "I")
    public int field2568;

    @OriginalMember(owner = "client!df", name = "s", descriptor = "Z")
    public static boolean field2565 = false;

    @OriginalMember(owner = "client!df", name = "p", descriptor = "Lli;")
    public static class185 field2562 = class245.method1649("b12_full", 126);

    @OriginalMember(owner = "client!df", name = "q", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!df", name = "t", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!df", name = "u", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!df", name = "w", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!df", name = "x", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!df", name = "y", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[S")
    public static short[] field2561;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BII)Z")
    public final boolean method980(byte arg0, int arg1, int arg2) {
        if (arg0 <= 1) {
            field2567 = 107;
        }
        field2571++;
        return this.field2564 <= arg2 && this.field2572 >= arg2 && arg1 >= this.field2568 && arg1 <= this.field2560;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method981(byte arg0) {
        field2561 = null;
        if (arg0 > 112) {
            field2562 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method982(int arg0, String arg1) {
        field2570++;
        for (int var2 = arg1.indexOf("%0a"); var2 != -1; var2 = arg1.indexOf("%0a", var2)) {
            arg1 = arg1.substring(0, var2) + "\n" + arg1.substring(var2 + 3);
        }
        System.out.println("Error: " + arg1);
        int var3 = -52 / ((arg0 - 55) / 42);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIZII)Ldd;")
    public static final class211 method983(int arg0, byte arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg1 != 64) {
            field2561 = null;
        }
        field2563++;
        int var6 = (arg3 ? 65536 : 0) + arg0 - (-(arg2 << 17) + -(arg4 << 19));
        long var8 = (long) arg5 * 3147483667L + ((long) var6 * 3849834839L);
        class211 var10 = (class211) class198.field3619.method82(-41, var8);
        if (var10 != null) {
            return var10;
        }
        class167.field3108 = false;
        class211 var11 = class246.method1655(false, arg0, arg4, arg2, arg5, -1868, false, arg3);
        if (var11 != null && !class167.field3108) {
            class198.field3619.method84(105, var8, var11);
        }
        return var11;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(IIII)V")
    public class137(int arg0, int arg1, int arg2, int arg3) {
        this.field2564 = arg0;
        this.field2572 = arg2;
        this.field2560 = arg3;
        this.field2568 = arg1;
    }
}
