import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class359 {

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Ljia;")
    private class645 field4910;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Z")
    public static boolean field4904 = false;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static volatile int field4911 = -1;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Lwk;")
    private class154 field4912;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Lda;")
    public static class67 field4908;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILjia;)V")
    public final void method2209(int arg0, class645 arg1) {
        field4907++;
        this.field4910 = arg1;
        if (arg0 != 29533) {
            this.method2210((byte) 36);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Lwk;")
    public final class154 method2210(byte arg0) {
        field4909++;
        if (arg0 != 61) {
            this.method2210((byte) 4);
        }
        class154 var2 = this.field4910.field8920.field2524;
        if (this.field4910.field8920 == var2) {
            this.field4912 = null;
            return null;
        } else {
            this.field4912 = var2.field2524;
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
    public static void method2211(byte arg0) {
        if (arg0 != -14) {
            method2211((byte) -21);
        }
        field4908 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)Lwk;")
    public final class154 method2212(int arg0) {
        field4905++;
        class154 var2 = this.field4912;
        if (this.field4910.field8920 == var2) {
            this.field4912 = null;
            return null;
        } else {
            this.field4912 = var2.field2524;
            int var3 = -128 / ((61 - arg0) / 61);
            return var2;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfl;B)V")
    public static final void method2213(class771 arg0, byte arg1) {
        field4906++;
        if (arg1 < 13) {
            field4911 = 39;
        }
        class570 var2 = (class570) class663.field9213.method337((long) arg0.field5288, 1);
        if (var2 == null) {
            class129.method1095(arg0.field5308[0], arg0.field7391, null, 0, arg0.field5304[0], arg0, null, (byte) 97);
        } else {
            var2.method3310((byte) -89);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
    public class359() {
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Ljia;)V")
    public class359(class645 arg0) {
        this.field4910 = arg0;
    }
}
