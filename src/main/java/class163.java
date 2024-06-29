import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class163 extends class34 {

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "Liv;")
    public static class64 field2522 = new class64(100, 14);

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "Z")
    public static boolean field2526 = false;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lrn;")
    public static class174 field2529 = new class174(46, 7);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public int field2524;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lto;")
    public class8 field2523;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "[Llc;")
    public class456[] field2516;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "[S")
    public static short[] field2527;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqa;IBI)Z", line = 6)
    public final boolean method1204(class162 arg0, int arg1, byte arg2, int arg3) {
        field2521++;
        if (arg2 != 22) {
            field2529 = null;
        }
        if (this.field2516 != null) {
            for (int var5 = 0; var5 < this.field2516.length; var5++) {
                if (this.field2516[var5].method2716(arg3, arg1) && this.field2523.method14(131072, arg0, arg1, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILeh;Leh;)V", line = 34)
    public static final void method1205(int arg0, int arg1, int arg2, class241 arg3, class241 arg4) {
        class429 var5 = class394.method2438(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6370 = arg3;
            var5.field6365 = arg4;
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V", line = 46)
    public static void method1206(boolean arg0) {
        if (!arg0) {
            method1205(116, -101, -75, null, null);
        }
        field2522 = null;
        field2527 = null;
        field2529 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 61)
    public static final void method1207(int arg0) {
        field2519++;
        class412.field6158.method243(class118.field1946, class443.field6623.field609 ? class134.field2105 + 256 << 0 : -1, 256);
        if (arg0 != -16886) {
            method1208(-66, -117);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 76)
    public static final void method1208(int arg0, int arg1) {
        field2518++;
        if (arg1 < 10) {
            field2526 = true;
        }
        class138.field2223 = 1000 / arg0;
    }
}
