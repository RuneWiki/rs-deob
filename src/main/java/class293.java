import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class293 extends class155 {

    @OriginalMember(owner = "client!qf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4440 = "Take";

    @OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
    public static int field4442 = 0;

    @OriginalMember(owner = "client!qf", name = "u", descriptor = "[I")
    public static int[] field4439 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!qf", name = "D", descriptor = "[I")
    public static int[] field4448 = new int[256];

    @OriginalMember(owner = "client!qf", name = "G", descriptor = "[Z")
    public static boolean[] field4451 = new boolean[112];

    @OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
    public static int field4443;

    @OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
    public int field4444;

    @OriginalMember(owner = "client!qf", name = "A", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!qf", name = "C", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!qf", name = "E", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!qf", name = "w", descriptor = "Lwh;")
    public static class289 field4441;

    @OriginalMember(owner = "client!qf", name = "B", descriptor = "Ljava/lang/String;")
    public String field4446;

    @OriginalMember(owner = "client!qf", name = "F", descriptor = "Ljava/lang/String;")
    public String field4450;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)Lja;")
    public final class247 method1933(int arg0) {
        ++field4443;
        return arg0 != 29290 ? null : class50.field819[super.field2263];
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(Z)V")
    public static void method1934(boolean arg0) {
        field4440 = null;
        field4451 = null;
        field4439 = null;
        if (!arg0) {
            field4441 = null;
            field4448 = null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lpk;IB)Lwh;")
    public static final class289 method1935(class237 arg0, int arg1, byte arg2) {
        if (arg2 != -29) {
            field4439 = null;
        }
        ++field4449;
        return !class125.method878(arg1, arg0, -1) ? null : class148.method1007((byte) 98);
    }

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)V")
    public static final void method1936(int arg0) {
        class135.field1973 = null;
        class27.field525 = null;
        class15.field221 = null;
        class209.field3125 = null;
        class5.field69 = null;
        if (arg0 < -11) {
            class173.field2530 = null;
            ++field4445;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; ++var2) {
                if ((var1 & 1) != 1) {
                    var1 >>>= 1;
                } else {
                    var1 = -306674912 ^ var1 >>> 1;
                }
            }
            field4448[var0] = var1;
        }
    }
}
