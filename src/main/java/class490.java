import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class490 {

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Lkr;")
    public class327 field6889 = new class327();

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field6890;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field6893;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "I")
    public static int field6895;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "Lkr;")
    private class327 field6894;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lco;Z)Lle;")
    public static final class402 method2797(class268 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field6886++;
            return new class402(arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1730(13436), arg0.method1700((byte) 44), arg0.method1738(255));
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)I")
    public final int method2798(boolean arg0) {
        field6895++;
        int var2 = 0;
        if (!arg0) {
            field6891 = 31;
        }
        for (class327 var3 = this.field6889.field4709; var3 != this.field6889; var3 = var3.field4709) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)V")
    public static final void method2799(int arg0, byte arg1) {
        field6887++;
        if (arg1 >= 65) {
            class21 var2 = class601.method3413(arg0, 2, (byte) 126);
            var2.method227(true);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Lkr;")
    public final class327 method2800(byte arg0) {
        int var2 = -89 % ((arg0 + 58) / 53);
        field6893++;
        class327 var3 = this.field6894;
        if (this.field6889 == var3) {
            this.field6894 = null;
            return null;
        } else {
            this.field6894 = var3.field4709;
            return var3;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lkr;B)V")
    public final void method2801(class327 arg0, byte arg1) {
        field6892++;
        if (arg0.field4714 != null) {
            arg0.method2036(true);
        }
        arg0.field4714 = this.field6889.field4714;
        if (arg1 >= -36) {
            method2797(null, true);
        }
        arg0.field4709 = this.field6889;
        arg0.field4714.field4709 = arg0;
        arg0.field4709.field4714 = arg0;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)Lkr;")
    public final class327 method2802(int arg0) {
        field6888++;
        class327 var2 = this.field6889.field4709;
        if (arg0 != 0) {
            return null;
        } else if (this.field6889 == var2) {
            this.field6894 = null;
            return null;
        } else {
            this.field6894 = var2.field4709;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
    public final void method2803(int arg0) {
        while (true) {
            class327 var2 = this.field6889.field4709;
            if (this.field6889 == var2) {
                field6890++;
                if (arg0 != 27385) {
                    return;
                }
                this.field6894 = null;
                return;
            }
            var2.method2036(true);
        }
    }

    @OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
    public class490() {
        this.field6889.field4714 = this.field6889;
        this.field6889.field4709 = this.field6889;
    }

    static {
        new class567("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
    }
}
