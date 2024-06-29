import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class565 {

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Z")
    public boolean field8052 = false;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "Z")
    public static boolean field8057 = false;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[J")
    public static long[] field8056 = new long[32];

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public int field8048;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field8049;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field8051;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "I")
    public static int field8054;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public int field8058;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field8059;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Ln;")
    public class16 field8055;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lhg;")
    public static class602 field8053;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)Z")
    public final boolean method3269(boolean arg0) {
        field8051++;
        if (arg0) {
            this.method3272(null, 84);
        }
        return this.field8055.field163.method1311(this.field8048, (byte) -93);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZLrt;)V")
    private final void method3270(int arg0, boolean arg1, class194 arg2) {
        field8049++;
        if (arg1) {
            this.method3271(false, null, 31, -84);
        }
        if (arg0 == 1) {
            this.field8048 = arg2.method1220(-16);
        } else if (arg0 == 2) {
            this.field8058 = arg2.method1180(-832631516);
        } else if (arg0 == 3) {
            this.field8052 = true;
            return;
        } else if (arg0 == 4) {
            this.field8048 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ZLoa;II)Lxa;")
    public final class433 method3271(boolean arg0, class605 arg1, int arg2, int arg3) {
        field8050++;
        long var5 = (long) (arg1.field8846 << 19 | (arg0 ? 262144 : 0) | arg2 << 16 | this.field8048);
        class433 var7 = (class433) this.field8055.field164.method1801(arg3, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field8055.field163.method1311(this.field8048, (byte) -93)) {
            class372 var8 = class372.method2398(this.field8055.field163, this.field8048, 0);
            if (var8 != null) {
                var8.field5689 = var8.field5686 = var8.field5690 = var8.field5687 = 0;
                if (arg0) {
                    var8.method2392();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method2404();
                }
            }
            class433 var10 = arg1.method388(var8, true);
            if (var10 != null) {
                this.field8055.field164.method1808(var5, var10, (byte) -107);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lrt;I)V")
    public final void method3272(class194 arg0, int arg1) {
        field8059++;
        while (true) {
            int var3 = arg0.method1177(255);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.method3272(null, -80);
                    return;
                }
            }
            this.method3270(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method3273(int arg0) {
        field8053 = null;
        field8056 = null;
        if (arg0 != -3) {
            field8057 = true;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BI)V")
    public static final void method3274(byte arg0, int arg1) {
        field8054++;
        class277 var2 = class4.field33;
        synchronized (class4.field33) {
            class4.field33.method1811((byte) 117, arg1);
        }
        if (arg0 <= -27) {
            class277 var3 = class191.field2508;
            synchronized (class191.field2508) {
                class191.field2508.method1811((byte) -47, arg1);
            }
        }
    }
}
