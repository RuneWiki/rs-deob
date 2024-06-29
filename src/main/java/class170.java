import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class170 {

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2662 = -1;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2664 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2671 = -1;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2660;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public int field2672;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Ldl;")
    public static class123 field2668;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(JB)V")
    public static final void method1183(long arg0, byte arg1) {
        field2667++;
        if (arg0 <= 0L) {
            return;
        }
        int var3 = 77 % ((16 - arg1) / 60);
        if (arg0 % 10L == 0L) {
            class203.method1393(arg0 - 1L, (byte) 65);
            class203.method1393(1L, (byte) 99);
        } else {
            class203.method1393(arg0, (byte) 66);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public static void method1184(int arg0) {
        field2668 = null;
        if (arg0 != -20079) {
            field2668 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILlj;I)V")
    private final void method1185(int arg0, class25 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2672 = arg1.method190(-3);
            this.field2661 = arg1.method201(255);
            this.field2660 = arg1.method201(255);
        }
        if (arg2 <= 0) {
            this.field2660 = -74;
        }
        field2669++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[B)Lma;")
    public static final class188 method1186(int arg0, byte[] arg1) {
        field2663++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != 128) {
            field2664 = 10;
        }
        class166 var2 = new class166(arg1, class206.field3221, class226.field3653, class236.field3777, class228.field3696, class101.field1574);
        class222.method1506((byte) 120);
        return var2;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Llj;I)V")
    public final void method1187(class25 arg0, int arg1) {
        field2670++;
        if (arg1 != 28718) {
            method1183(64L, (byte) -27);
        }
        while (true) {
            int var3 = arg0.method201(255);
            if (var3 == 0) {
                return;
            }
            this.method1185(var3, arg0, 89);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
    public static final boolean method1188(int arg0, int arg1, int arg2) {
        int var3 = class74.field1044[arg0][arg1][arg2];
        if (-class31.field420 == var3) {
            return false;
        } else if (class31.field420 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class174.method1226(var4 + 1, class200.field3128[arg0][arg1][arg2], var5 + 1) && class174.method1226(var4 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg2], var5 + 1) && class174.method1226(var4 + 128 - 1, class200.field3128[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class174.method1226(var4 + 1, class200.field3128[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class74.field1044[arg0][arg1][arg2] = class31.field420;
                return true;
            } else {
                class74.field1044[arg0][arg1][arg2] = -class31.field420;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)Lpf;")
    public static final class287 method1189(boolean arg0) {
        if (arg0) {
            return null;
        }
        field2666++;
        class287 var1 = (class287) class225.field3641.method1467(0);
        if (var1 != null) {
            var1.method784(false);
            var1.method912(-125);
            return var1;
        }
        class287 var2;
        do {
            var2 = (class287) class175.field2738.method1467(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1920(-93) > class260.method1785((byte) -103)) {
                return null;
            }
            var2.method784(false);
            var2.method912(-118);
        } while ((var2.field1958 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
