import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class155 extends class231 {

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    private int field2435 = 0;

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    private int field2444 = -32768;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
    private int field2436 = 0;

    @OriginalMember(owner = "client!vd", name = "K", descriptor = "Z")
    public boolean field2453 = false;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public int field2458;

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "I")
    public int field2450;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
    private int field2445;

    @OriginalMember(owner = "client!vd", name = "I", descriptor = "I")
    public int field2451;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public int field2433;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "I")
    public int field2454;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "Lug;")
    private class190 field2442;

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Luf;")
    private static class168 field2438 = class148.method1019(-1720, "Loading config )2 ");

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "[I")
    public static int[] field2447 = new int[25];

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Luf;")
    public static class168 field2448 = field2438;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "Z")
    public static boolean field2440 = true;

    @OriginalMember(owner = "client!vd", name = "J", descriptor = "Luf;")
    public static class168 field2452 = class148.method1019(-1720, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "I")
    public static int field2457 = 0;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "[Lml;")
    public static class13[] field2456;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)Lj;", line = 5)
    public static final class153 method1101(boolean arg0) {
        field2443++;
        class153 var1 = new class153(24);
        var1.method1095(3, -35);
        var1.method1095(class69.field913, -96);
        var1.method1095(field2440 ? 1 : 0, -127);
        var1.method1095(class263.field4460 ? 1 : 0, -39);
        var1.method1095(class69.field914 ? 1 : 0, -85);
        var1.method1095(class145.field2250 ? 1 : 0, -91);
        var1.method1095(class120.field1865 ? 1 : 0, -62);
        var1.method1095(class61.field796 ? 1 : 0, -119);
        var1.method1095(class165.field2654 ? 1 : 0, -91);
        var1.method1095(class164.field2631 ? 1 : 0, -39);
        var1.method1095(class201.field3310, -103);
        if (!arg0) {
            return (class153) null;
        }
        var1.method1095(class44.field539 ? 1 : 0, -52);
        var1.method1095(client.field4939 ? 1 : 0, -68);
        var1.method1095(class164.field2632 ? 1 : 0, -55);
        var1.method1095(class161.field2599, -62);
        var1.method1095(class53.field653 ? 1 : 0, -114);
        var1.method1095(class1.field1, -89);
        var1.method1095(class48.field593, -39);
        var1.method1095(class72.field968, -103);
        var1.method1047(95, class17.field201);
        var1.method1047(116, class219.field3558);
        var1.method1095(class12.field133 ? 1 : 0, -127);
        return var1;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIIIIIJ)V", line = 43)
    public final void method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2441++;
        class152 var11 = this.method1104(false);
        if (var11 != null) {
            var11.method112(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2444 = var11.method116();
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Z", line = 58)
    public static final boolean method1102(int arg0) {
        int var1 = -124 / ((70 - arg0) / 49);
        field2434++;
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 75)
    public final void method1103(int arg0, int arg1) {
        field2446++;
        if (this.field2453) {
            return;
        }
        this.field2435 += arg0;
        while (this.field2435 > this.field2442.field3075[this.field2436]) {
            this.field2435 -= this.field2442.field3075[this.field2436];
            this.field2436++;
            if (this.field2442.field3063.length <= this.field2436) {
                this.field2453 = true;
                break;
            }
        }
        if (arg1 != 2) {
            this.field2444 = -101;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I", line = 103)
    public final int method116() {
        field2439++;
        return this.field2444;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(IIIIIII)V", line = 203)
    public class155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2458 = arg3;
        this.field2450 = arg4;
        this.field2445 = arg0;
        this.field2451 = arg2;
        this.field2433 = arg6 + arg5;
        this.field2454 = arg1;
        int var8 = class270.method1873(this.field2445, false).field48;
        if (var8 == -1) {
            this.field2453 = true;
        } else {
            this.field2453 = false;
            this.field2442 = class119.method858(true, var8);
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)Lfc;", line = 127)
    private final class152 method1104(boolean arg0) {
        field2449++;
        class5 var2 = class270.method1873(this.field2445, arg0);
        class152 var3;
        if (this.field2453) {
            var3 = var2.method11(-4, -1);
        } else {
            var3 = var2.method11(-4, this.field2436);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V", line = 157)
    public static void method1105(int arg0) {
        field2456 = null;
        field2438 = null;
        field2448 = null;
        field2452 = null;
        if (arg0 != 0) {
            field2452 = (class168) null;
        }
        field2447 = null;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZB)V", line = 230)
    public static final void method1106(boolean arg0, byte arg1) {
        field2455++;
        if (class270.field4537 == null) {
            return;
        }
        try {
            if (arg1 != -88) {
                return;
            }
            class153 var2 = new class153(4);
            var2.method1095(arg0 ? 2 : 3, -39);
            var2.method1097(-979940696, 0);
            class270.field4537.method1233((byte) 29, var2.field2359, 4, 0);
        } catch (IOException var6) {
            try {
                class270.field4537.method1229(545);
            } catch (Exception var5) {
            }
            class270.field4537 = null;
            class214.field3497++;
        }
    }
}
