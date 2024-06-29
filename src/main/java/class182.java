import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rfa")
public class class182 extends class366 {

    @OriginalMember(owner = "client!rfa", name = "j", descriptor = "Lpj;")
    private class132 field2685;

    @OriginalMember(owner = "client!rfa", name = "h", descriptor = "I")
    public static int field2683 = 0;

    @OriginalMember(owner = "client!rfa", name = "e", descriptor = "I")
    public static int field2680 = 0;

    @OriginalMember(owner = "client!rfa", name = "o", descriptor = "[Lpd;")
    public static class233[] field2690 = new class233[0];

    @OriginalMember(owner = "client!rfa", name = "q", descriptor = "Z")
    public static boolean field2692 = false;

    @OriginalMember(owner = "client!rfa", name = "i", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!rfa", name = "k", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!rfa", name = "l", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!rfa", name = "m", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!rfa", name = "n", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!rfa", name = "r", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!rfa", name = "s", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!rfa", name = "f", descriptor = "Lfc;")
    public static class235 field2681;

    @OriginalMember(owner = "client!rfa", name = "g", descriptor = "Lew;")
    public static class453 field2682;

    @OriginalMember(owner = "client!rfa", name = "p", descriptor = "Lxa;")
    private class461 field2691;

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method104(byte arg0) {
        ++field2687;
        return arg0 <= 18 ? false : this.field2685.method947(-80, ((class11) super.field5206).field209);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZI)V", line = 14)
    public final void method1227(int arg0, int arg1, boolean arg2, int arg3) {
        ++field2693;
        class630.field8790.method399(arg1 + -2, arg0, super.field5206.field1113 + 4, super.field5206.field1109 + 2, ((class11) super.field5206).field212, 0);
        class630.field8790.method399(arg1 - 1, arg0 + 1, super.field5206.field1113 + 2, super.field5206.field1109, 0, 0);
        if (arg3 != 63) {
            field2682 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIZB)V", line = 26)
    public final void method1228(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field2684;
        if (arg2 || class514.field7031 != this.field2686) {
            this.field2686 = class514.field7031;
            int var5 = class514.field7031 * super.field5206.field1113 / 100;
            int[] var6 = new int[4];
            class630.field8790.method416(var6);
            class630.field8790.method442(arg0, arg1 + 2, arg0 - -var5, super.field5206.field1109 + arg1);
            this.field2691.method2661(arg0, arg1 + 2, super.field5206.field1113, super.field5206.field1109);
            class630.field8790.method442(var6[0], var6[1], var6[2], var6[3]);
        }
        if (arg3 != -68) {
            method1231(-37, 31, -52, -18);
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Ljava/lang/String;II)Lbp;", line = 57)
    public static final class351 method1229(String arg0, int arg1, int arg2) {
        ++field2689;
        class351 var3;
        try {
            var3 = (class351) Class.forName("nj").newInstance();
            if (arg1 != 100) {
                field2692 = false;
            }
        } catch (Throwable var4) {
            var3 = new class217();
        }
        var3.field5050 = arg2;
        var3.field5053 = arg0;
        return var3;
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(II)V", line = 78)
    public static final void method1230(int arg0, int arg1) {
        ++field2688;
        class679 var2 = class669.method3708(7, arg0, 1403048928);
        var2.method3749(-66);
        int var3 = -69 % ((arg1 - 35) / 60);
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIII)V", line = 94)
    public static final void method1231(int arg0, int arg1, int arg2, int arg3) {
        class486 var4 = class658.field9266[arg0][arg1][arg2];
        if (var4 != null) {
            class404 var5 = var4.field6729;
            class404 var6 = var4.field6728;
            if (var5 != null) {
                var5.field5715 = var5.field5715 * arg3 / (16 << class627.field8753 - 7);
                var5.field5718 = var5.field5718 * arg3 / (16 << class627.field8753 - 7);
            }
            if (var6 != null) {
                var6.field5715 = var6.field5715 * arg3 / (16 << class627.field8753 - 7);
                var6.field5718 = var6.field5718 * arg3 / (16 << class627.field8753 - 7);
            }
        }
    }

    @OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I)V", line = 116)
    public final void method108(int arg0) {
        this.field2691 = class110.method823(this.field2685.method938(((class11) super.field5206).field209, (byte) -53), true);
        ++field2694;
        this.method109(8444, true);
        int var2 = -38 / ((41 - arg0) / 54);
    }

    @OriginalMember(owner = "client!rfa", name = "b", descriptor = "(I)V", line = 132)
    public static void method1232(int arg0) {
        field2681 = null;
        if (arg0 == 3719) {
            field2682 = null;
            field2690 = null;
        }
    }

    @OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(Lpj;Ldaa;)V", line = 152)
    public class182(class132 arg0, class11 arg1) {
        super(arg1);
        this.field2685 = arg0;
    }
}
