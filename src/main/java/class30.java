import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class30 implements class5 {

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public int field304;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field307 = -1;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Lap;")
    public static class310 field306 = new class310(55, -1);

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Lap;")
    public static class310 field310 = new class310(52, 8);

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    public static int[] field313 = new int[32];

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field312 = 0;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIII)V", line = 6)
    public static final void method193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class295.field4153 <= arg6 - arg5 && arg6 + arg5 <= class103.field1457 && class444.field6338 <= arg2 - arg5 && (arg2 + arg5) <= class151.field2091) {
            class256.method1735(20550, arg4, arg6, arg3, arg5, arg1, arg2);
        } else {
            class466.method2777(arg1, arg3, arg2, 6037, arg5, arg6, arg4);
        }
        field305++;
        if (arg0 != 55) {
            method194((byte) 39, 95);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BI)Ljg;", line = 27)
    public static final class475 method194(byte arg0, int arg1) {
        field308++;
        class475 var2 = (class475) class162.field2347.method2113(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class347.field4786.method2633(0, arg1, -65);
        class475 var4 = new class475();
        if (var3 != null) {
            var4.method2812(new class161(var3), -1);
        }
        var4.method2810(11758);
        class162.field2347.method2116((long) arg1, (byte) -75, var4);
        if (arg0 != -25) {
            method193(91, -127, 15, -31, 78, -112, -44);
        }
        return var4;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 61)
    public static void method195(int arg0) {
        field310 = null;
        if (arg0 >= -20) {
            field307 = -31;
        }
        field306 = null;
        field313 = null;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 85)
    public class30(String arg0, int arg1) {
        this.field304 = arg1;
    }

    @OriginalMember(owner = "client!hq", name = "toString", descriptor = "()Ljava/lang/String;", line = 99)
    public final String toString() {
        field302++;
        throw new IllegalStateException();
    }
}
