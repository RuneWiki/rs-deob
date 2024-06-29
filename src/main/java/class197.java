import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class197 extends class30 {

    @OriginalMember(owner = "client!qga", name = "G", descriptor = "Lmw;")
    public static class517 field2552 = new class517(53, 4);

    @OriginalMember(owner = "client!qga", name = "J", descriptor = "[I")
    public static int[] field2554 = new int[5];

    @OriginalMember(owner = "client!qga", name = "K", descriptor = "Lqw;")
    public static class84 field2555 = new class84();

    @OriginalMember(owner = "client!qga", name = "M", descriptor = "Lmw;")
    public static class517 field2557 = new class517(24, -1);

    @OriginalMember(owner = "client!qga", name = "L", descriptor = "B")
    public byte field2556;

    @OriginalMember(owner = "client!qga", name = "A", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!qga", name = "B", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!qga", name = "C", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!qga", name = "D", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!qga", name = "E", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!qga", name = "F", descriptor = "Ldt;")
    public class254 field2551;

    @OriginalMember(owner = "client!qga", name = "H", descriptor = "Ljava/lang/Object;")
    public static Object field2553;

    @OriginalMember(owner = "client!qga", name = "e", descriptor = "(B)V", line = 3)
    public static void method1290(byte arg0) {
        field2554 = null;
        field2552 = null;
        field2557 = null;
        field2555 = null;
        int var1 = -106 / ((-19 - arg0) / 60);
        field2553 = null;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(III)Z", line = 18)
    public static final boolean method1291(int arg0, int arg1, int arg2) {
        ++field2549;
        if (arg1 != -22235) {
            field2554 = null;
        }
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!qga", name = "d", descriptor = "(B)[B", line = 32)
    public final byte[] method171(byte arg0) {
        ++field2546;
        if (arg0 != 90) {
            method1290((byte) 110);
        }
        if (!super.field295 && this.field2551.field3789.length + -this.field2556 <= this.field2551.field3725) {
            return this.field2551.field3789;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I)I", line = 52)
    public final int method170(int arg0) {
        ++field2548;
        if (arg0 > -29) {
            field2554 = null;
        }
        return this.field2551 == null ? 0 : this.field2551.field3725 * 100 / (this.field2551.field3789.length - this.field2556);
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 74)
    public static final void method1292(int arg0, String[] arg1) {
        if (arg0 == -1953) {
            ++field2550;
            if (~arg1.length >= -2) {
                class753.field10200 = class753.field10200 + arg1[0];
                class382.field5560 += arg1[0].length();
            } else {
                for (int var2 = 0; ~var2 > ~arg1.length; ++var2) {
                    if (arg1[var2].startsWith("pause")) {
                        int var3 = 5;
                        try {
                            var3 = Integer.parseInt(arg1[var2].substring(6));
                        } catch (Exception var4) {
                        }
                        class280.method1834((byte) 88, "Pausing for " + var3 + " seconds...");
                        class91.field1287 = var2 - -1;
                        class659.field8886 = arg1;
                        class42.field453 = (long) (var3 * 1000) + class401.method2440(false);
                        return;
                    }
                    class753.field10200 = arg1[var2];
                    class55.method338(false, 74);
                }
            }
        }
    }
}
