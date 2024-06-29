import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class266 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field3708;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Lqo;")
    public static class141 field3707 = new class141(16);

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lnq;")
    public static class116 field3712 = null;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lbc;")
    public static class8 field3711 = new class8();

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3714 = null;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method1705(int arg0) {
        field3711 = null;
        field3707 = null;
        field3714 = null;
        if (arg0 != 25821) {
            field3707 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
    public final int method1706(int arg0) {
        if (arg0 != 7219) {
            field3711 = null;
        }
        field3713++;
        return this.field3708;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Ldb;")
    public static final class66 method1707(byte arg0) {
        field3710++;
        try {
            int var1 = -62 % ((arg0 - 29) / 32);
            return (class66) Class.forName("mr").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class266(String arg0, int arg1) {
        this.field3708 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3709++;
        throw new IllegalStateException();
    }
}
