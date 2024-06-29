import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class292 extends class86 {

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field4597 = 0;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lgb;")
    public static class149 field4594 = new class149();

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4602 = "slide:";

    @OriginalMember(owner = "client!p", name = "A", descriptor = "Lag;")
    public static class188 field4606 = null;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lcb;")
    public static class249 field4605 = new class249();

    @OriginalMember(owner = "client!p", name = "B", descriptor = "Led;")
    public static class186 field4607 = new class186(5000);

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "J")
    public long field4603;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lsl;")
    public static class18 field4608;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "Lp;")
    public class292 field4596;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "Lp;")
    public class292 field4599;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)V")
    public static final void method1963(int arg0, int arg1) {
        field4601++;
        if (arg0 == 0) {
            class245.field3797.method1778(arg1, -113);
        }
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
    public final void method1964(int arg0) {
        field4600++;
        if (this.field4596 == null) {
            return;
        }
        this.field4596.field4599 = this.field4599;
        this.field4599.field4596 = this.field4596;
        this.field4599 = null;
        this.field4596 = null;
        if (arg0 != 12213) {
            method1966(-1, -99);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V")
    public static void method1965(byte arg0) {
        field4606 = null;
        int var1 = 29 / ((arg0 + 72) / 34);
        field4605 = null;
        field4608 = null;
        field4594 = null;
        field4607 = null;
        field4602 = null;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(II)Lfb;")
    public static final class30 method1966(int arg0, int arg1) {
        field4604++;
        class30 var2 = (class30) class16.field263.method1780((long) arg1, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class131.field2028.method1163(arg0, arg1, 48);
        class30 var4 = new class30();
        if (var3 != null) {
            var4.method246((byte) -124, new class37(var3));
        }
        class16.field263.method1784(var4, false, (long) arg1);
        return var4;
    }
}
