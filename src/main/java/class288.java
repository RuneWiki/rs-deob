import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class288 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lgw;")
    private class118 field4265;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lbd;")
    public static class44 field4269 = new class44("white:", "weiss:", "blanc:", "branco:");

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[C")
    public static char[] field4271 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "Lqt;")
    public static class459 field4272 = new class459(16, 6);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "Lha;")
    private class42 field4267;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "[I")
    public static int[] field4270;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "[Laa;")
    public static class343[] field4263;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4270 = null;
        field4269 = null;
        field4263 = null;
        field4271 = null;
        int var1 = -119 / ((arg0 - 67) / 33);
        field4272 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lgw;I)V")
    public final void method1843(class118 arg0, int arg1) {
        this.field4265 = arg0;
        if (arg1 > -23) {
            this.method1844(10);
        }
        field4264++;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Lha;")
    public final class42 method1844(int arg0) {
        field4268++;
        class42 var2 = this.field4267;
        if (this.field4265.field1835 == var2) {
            this.field4267 = null;
            return null;
        }
        if (arg0 != 95) {
            this.field4265 = null;
        }
        this.field4267 = var2.field857;
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)I")
    public static int method1845(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)Lha;")
    public final class42 method1846(int arg0) {
        field4261++;
        class42 var2 = this.field4265.field1835.field857;
        if (this.field4265.field1835 == var2) {
            this.field4267 = null;
            return null;
        }
        this.field4267 = var2.field857;
        if (arg0 != -18451) {
            field4263 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
    public class288() {
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lgw;)V")
    public class288(class118 arg0) {
        this.field4265 = arg0;
    }
}
