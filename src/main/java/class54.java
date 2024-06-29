import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cba")
public class class54 {

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "Ldw;")
    private class664 field776;

    @OriginalMember(owner = "client!cba", name = "c", descriptor = "J")
    public long field777;

    @OriginalMember(owner = "client!cba", name = "f", descriptor = "Lgw;")
    public static class690 field780 = new class690(128, 4);

    @OriginalMember(owner = "client!cba", name = "h", descriptor = "Lkr;")
    public static class602 field782 = new class602(96, 10);

    @OriginalMember(owner = "client!cba", name = "i", descriptor = "I")
    public static int field783 = 0;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!cba", name = "d", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!cba", name = "e", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!cba", name = "g", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(Laq;BLst;)Lkaa;", line = 4)
    public static final class583 method400(class312 arg0, byte arg1, class335 arg2) {
        field778++;
        int var3 = 41 / ((41 - arg1) / 46);
        class583 var4 = class231.method1374((byte) 10);
        var4.field7966 = arg2;
        var4.field7965 = arg2.field4724;
        if (var4.field7965 == -1) {
            var4.field7963 = new class409(260);
        } else if (var4.field7965 == -2) {
            var4.field7963 = new class409(10000);
        } else if (var4.field7965 <= 18) {
            var4.field7963 = new class409(20);
        } else if (var4.field7965 <= 98) {
            var4.field7963 = new class409(100);
        } else {
            var4.field7963 = new class409(260);
        }
        var4.field7963.method2568(arg0, (byte) 125);
        var4.field7963.method2570(var4.field7966.method2135(4), (byte) -66);
        var4.field7961 = 0;
        return var4;
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "(I)V", line = 38)
    public static void method401(int arg0) {
        field782 = null;
        if (arg0 != 98) {
            method400(null, (byte) 106, null);
        }
        field780 = null;
    }

    @OriginalMember(owner = "client!cba", name = "finalize", descriptor = "()V", line = 57)
    protected final void finalize() throws Throwable {
        this.field776.method3693(this.field777, -25658);
        field781++;
        super.finalize();
    }

    @OriginalMember(owner = "client!cba", name = "a", descriptor = "([[SZ[[F)[[S", line = 67)
    public static final short[][] method402(short[][] arg0, boolean arg1, float[][] arg2) {
        if (arg1) {
            field783 = -126;
        }
        field775++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            for (int var4 = 0; var4 < arg0[var3].length; var4++) {
                arg0[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!cba", name = "b", descriptor = "(I)V", line = 95)
    public static final void method403(int arg0) {
        if (arg0 != 0) {
            method401(22);
        }
        class601.field8141 = null;
        field779++;
    }

    @OriginalMember(owner = "client!cba", name = "<init>", descriptor = "(Ldw;J[Lie;)V", line = 109)
    public class54(class664 arg0, long arg1, class193[] arg2) {
        this.field776 = arg0;
        this.field777 = arg1;
    }
}
