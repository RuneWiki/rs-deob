import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class182 {

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "Lmq;")
    private class104 field2642 = new class104(64);

    @OriginalMember(owner = "client!mt", name = "f", descriptor = "Lfc;")
    private class343 field2645;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "Lfn;")
    public static class52 field2646 = new class52(9, 2);

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "Z")
    public static boolean field2650 = false;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "I")
    public static int field2652 = -1;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "Ltm;")
    public static class112 field2651 = new class112(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "Lfn;")
    public static class52 field2653 = new class52(24, -1);

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!mt", name = "d", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!mt", name = "e", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "Lfc;")
    public static class343 field2641;

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(II)Lvj;")
    public final class165 method1194(int arg0, int arg1) {
        field2648++;
        int var3 = -52 % ((arg1 + 24) / 42);
        class104 var4 = this.field2642;
        class165 var5;
        synchronized (this.field2642) {
            var5 = (class165) this.field2642.method659((long) arg0, (byte) -1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field2645.method2029(31, arg0, 0);
        class165 var7 = new class165();
        if (var6 != null) {
            var7.method1017(-127, new class425(var6));
        }
        class104 var8 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method653(38, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(B)V")
    public final void method1195(byte arg0) {
        field2647++;
        int var2 = 91 / ((arg0 - 58) / 38);
        class104 var3 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method656(95);
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(BI)V")
    public final void method1196(byte arg0, int arg1) {
        class104 var3 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method666(arg1, false);
            if (arg0 >= -83) {
                this.field2645 = null;
            }
        }
        field2644++;
    }

    @OriginalMember(owner = "client!mt", name = "b", descriptor = "(B)V")
    public final void method1197(byte arg0) {
        class104 var2 = this.field2642;
        synchronized (this.field2642) {
            this.field2642.method654(false);
        }
        int var3 = 95 % ((arg0 + 32) / 48);
        field2640++;
    }

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Ldk;ILfc;)V")
    public class182(class328 arg0, int arg1, class343 arg2) {
        this.field2645 = arg2;
        this.field2645.method2054(0, 31);
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public static void method1198(int arg0) {
        field2653 = null;
        field2646 = null;
        field2641 = null;
        field2651 = null;
        if (arg0 <= 109) {
            method1198(-107);
        }
    }
}
