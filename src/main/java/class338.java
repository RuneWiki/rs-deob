import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class338 {

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field4765 = 2;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lqaa;")
    public static class27 field4764 = new class27(40, -1);

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
    public static int[] field4768 = new int[32];

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field4767;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4770;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "Lvo;")
    public static class41 field4769;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V", line = 3)
    public static void method2149(byte arg0) {
        if (arg0 == -79) {
            field4764 = null;
            field4769 = null;
            field4768 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field4770++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)Z", line = 28)
    public static final boolean method2150(int arg0, boolean arg1) {
        field4763++;
        if (arg0 != 1) {
            method2151((char) 65439, 101);
        }
        boolean var2 = class359.field5046.method562();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class359.field5046.method595();
        } else if (!class359.field5046.method618()) {
            arg1 = false;
        }
        if (var2 == arg1) {
            return false;
        } else {
            class471.field6781.method2826(arg1 ? 1 : 0, (byte) 114, class471.field6781.field6676);
            class129.method994((byte) 44);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(CI)Z", line = 66)
    public static final boolean method2151(char arg0, int arg1) {
        field4766++;
        if (arg1 < 89) {
            method2149((byte) -24);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)I", line = 77)
    public final int method2152(int arg0, int arg1, int arg2) {
        field4767++;
        if (arg2 >= -94) {
            field4768 = null;
        }
        int var4 = class206.field2956 <= arg0 ? arg0 : class206.field2956;
        if (class2.field21 == this) {
            return 0;
        } else if (class739.field10382 == this) {
            return var4 - arg1;
        } else if (class319.field4542 == this) {
            return (var4 - arg1) / 2;
        } else {
            return 0;
        }
    }
}
