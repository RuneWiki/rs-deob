import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class214 {

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "I")
    public int field2721 = 0;

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "I")
    public int field2720 = 0;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lgg;")
    private class114 field2719 = new class114(64);

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "Lgia;")
    private class490 field2723 = null;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "Lkha;")
    private class687 field2717;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "Lkha;")
    private class687 field2713;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "[F")
    public static float[] field2714 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field2716 = 0;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "I")
    public static int field2722;

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Lkha;")
    public static class687 field2715;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "([IJILfq;)Ljava/lang/String;")
    public final String method1300(int[] arg0, long arg1, int arg2, class141 arg3) {
        field2722++;
        if (this.field2723 != null) {
            String var6 = this.field2723.method2316(arg3, arg0, (byte) 115, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        if (arg2 >= -42) {
            this.method1300(null, -1L, -57, null);
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field2714 = null;
        int var1 = -115 / ((arg0 - 70) / 42);
        field2715 = null;
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)Lrk;")
    public final class277 method1302(int arg0, int arg1) {
        field2718++;
        class277 var3 = (class277) this.field2719.method778((long) arg0, -99);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field2713.method3810(1, -23360, arg0);
        } else {
            var4 = this.field2717.method3810(1, -23360, arg0 & 0x7FFF);
        }
        class277 var5 = new class277();
        var5.field3498 = this;
        if (var4 != null) {
            var5.method1658(7967, new class179(var4));
        }
        if (arg1 != 1) {
            return null;
        }
        if (arg0 >= 32768) {
            var5.method1661(25402);
        }
        this.field2719.method774((long) arg0, -124, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(ILkha;Lkha;Lgia;)V")
    public class214(int arg0, class687 arg1, class687 arg2, class490 arg3) {
        this.field2723 = arg3;
        this.field2717 = arg2;
        this.field2713 = arg1;
        if (this.field2713 != null) {
            this.field2721 = this.field2713.method3812(0, 1);
        }
        if (this.field2717 != null) {
            this.field2720 = this.field2717.method3812(0, 1);
        }
    }
}
