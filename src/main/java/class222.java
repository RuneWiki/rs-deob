import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class222 {

    @OriginalMember(owner = "client!qs", name = "g", descriptor = "Lmq;")
    private class104 field3125 = new class104(64);

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "Lmq;")
    public class104 field3129 = new class104(2);

    @OriginalMember(owner = "client!qs", name = "h", descriptor = "Lfc;")
    private class343 field3126;

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "Lfc;")
    public class343 field3122;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "Lcs;")
    public static class351 field3123 = new class351(78, -1);

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "Lfn;")
    public static class52 field3130 = new class52(81, 1);

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "[I")
    public static int[] field3132 = new int[13];

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    public static int field3135 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Lop;")
    public static class63 field3134;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public final void method1402(int arg0) {
        field3128++;
        int var2 = 26 % ((-arg0 - 36) / 43);
        class104 var3 = this.field3125;
        synchronized (this.field3125) {
            this.field3125.method656(113);
        }
        class104 var4 = this.field3129;
        synchronized (this.field3129) {
            this.field3129.method656(105);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public final void method1403(int arg0) {
        class104 var2 = this.field3125;
        synchronized (this.field3125) {
            this.field3125.method654(false);
        }
        field3121++;
        class104 var3 = this.field3129;
        synchronized (this.field3129) {
            this.field3129.method654(false);
        }
        if (arg0 != 64) {
            this.method1402(-62);
        }
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)V")
    public static void method1404(int arg0) {
        field3130 = null;
        field3123 = null;
        field3132 = null;
        field3134 = null;
        if (arg0 <= 83) {
            field3123 = null;
        }
    }

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "(I)V")
    public static final void method1405(int arg0) {
        field3127++;
        if (!class410.method2404(-1) && class76.field1161 != class480.field6794) {
            class242.method1515(class182.field2643, class275.field3810, false, 24110, false);
            return;
        }
        if (arg0 > -33) {
            field3132 = null;
        }
        class155.method946(true, class338.field4636);
        if (class76.field1161 != class270.field3747) {
            class375.method2240(79);
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)Lh;")
    public final class335 method1406(int arg0, int arg1) {
        field3119++;
        class104 var3 = this.field3125;
        class335 var4;
        synchronized (this.field3125) {
            var4 = (class335) this.field3125.method659((long) arg1, (byte) -1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3126.method2029(arg0, arg1, 0);
        class335 var6 = new class335();
        var6.field4587 = this;
        if (var5 != null) {
            var6.method1994(new class425(var5), 25981);
        }
        class104 var7 = this.field3125;
        synchronized (this.field3125) {
            this.field3125.method653(58, (long) arg1, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IB)V")
    public final void method1407(int arg0, byte arg1) {
        class104 var3 = this.field3125;
        synchronized (this.field3125) {
            this.field3125.method666(arg0, false);
            if (arg1 >= -112) {
                this.field3129 = null;
            }
        }
        field3120++;
        class104 var4 = this.field3129;
        synchronized (this.field3129) {
            this.field3129.method666(arg0, false);
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Ldk;ILfc;Lfc;)V")
    public class222(class328 arg0, int arg1, class343 arg2, class343 arg3) {
        this.field3126 = arg2;
        this.field3122 = arg3;
        this.field3126.method2054(0, 33);
    }
}
