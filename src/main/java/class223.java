import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class223 {

    @OriginalMember(owner = "client!in", name = "e", descriptor = "Luq;")
    private class339 field2893 = new class339();

    @OriginalMember(owner = "client!in", name = "g", descriptor = "Lgfa;")
    private class150 field2895 = new class150();

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    private int field2897;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    private int field2896;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "Lwh;")
    private class546 field2894;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Lwo;")
    public static class445 field2892 = new class445();

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JB)Luq;")
    public final class339 method1390(long arg0, byte arg1) {
        if (arg1 != 78) {
            field2892 = null;
        }
        field2891++;
        class339 var4 = (class339) this.field2894.method3057(arg1 - 77, arg0);
        if (var4 != null) {
            this.field2895.method879((byte) -98, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final void method1391(int arg0) {
        field2889++;
        this.field2895.method884(-126);
        this.field2894.method3063((byte) 99);
        if (arg0 != 1) {
            this.method1393(45L, 12, null);
        }
        this.field2893 = new class339();
        this.field2896 = this.field2897;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field2892 = null;
        if (arg0 != -91) {
            method1392(-1);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JILuq;)V")
    public final void method1393(long arg0, int arg1, class339 arg2) {
        field2890++;
        if (arg1 != -91) {
            field2892 = null;
        }
        if (this.field2896 == 0) {
            class339 var5 = this.field2895.method885((byte) -126);
            var5.method242(true);
            var5.method1982((byte) -24);
            if (this.field2893 == var5) {
                class339 var6 = this.field2895.method885((byte) -120);
                var6.method242(true);
                var6.method1982((byte) -24);
            }
        } else {
            this.field2896--;
        }
        this.field2894.method3061(123, arg0, arg2);
        this.field2895.method879((byte) -66, arg2);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V")
    public class223(int arg0) {
        this.field2897 = arg0;
        this.field2896 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2894 = new class546(var2);
    }
}
