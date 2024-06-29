import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class448 extends class381 {

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "Ljava/lang/String;")
    public String field6492;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "Ljava/lang/String;")
    public static String field6493 = "white:";

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "J")
    public static long field6495 = 0L;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field6488;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "Lao;")
    public static class116 field6489;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIBIIIII)Z")
    public static final boolean method2791(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6487++;
        int var9 = -52 / ((51 - arg3) / 60);
        if ((arg0 + arg2) > arg1 && arg2 < (arg1 + arg4)) {
            return arg5 < arg6 + arg7 && arg5 + arg8 > arg7;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)V")
    public static final void method2792(int arg0, byte arg1) {
        field6491++;
        class173.field2545 = arg0;
        class410 var2 = class244.field3366;
        synchronized (class244.field3366) {
            class244.field3366.method2533(0);
            if (arg1 <= 94) {
                method2791(103, 49, 87, (byte) -55, -89, 91, -29, 90, 114);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
    public static void method2793(boolean arg0) {
        field6493 = null;
        if (!arg0) {
            method2794(-115, -68, -86, 112);
        }
        field6489 = null;
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class448() {
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIII)V")
    public static final void method2794(int arg0, int arg1, int arg2, int arg3) {
        field6490++;
        if (arg2 != -13713) {
            field6495 = -70L;
        }
        class7.field57 = new byte[arg1][arg3][arg0];
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class448(String arg0) {
        this.field6492 = arg0;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IJBI)V")
    public static final void method2795(int arg0, long arg1, byte arg2, int arg3) {
        field6488++;
        int var5 = ((int) arg1 & 0x7C143) >> 14;
        if (arg2 != -124) {
            field6495 = 24L;
        }
        int var6 = (int) arg1 >> 20 & 0x3;
        int var7 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class256.method1669(true, 0, arg0, var6, class95.field1379.field5005[0], class95.field1379.field4998[0], 0, var5, 0, false, arg3);
            return;
        }
        class372 var8 = class10.method53(var7, true);
        int var9;
        int var10;
        if (var6 == 0 || var6 == 2) {
            var10 = var8.field5206;
            var9 = var8.field5147;
        } else {
            var9 = var8.field5206;
            var10 = var8.field5147;
        }
        int var11 = var8.field5144;
        if (var6 != 0) {
            var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
        }
        class256.method1669(true, var11, arg0, 0, class95.field1379.field5005[0], class95.field1379.field4998[0], var10, 0, var9, false, arg3);
    }
}
