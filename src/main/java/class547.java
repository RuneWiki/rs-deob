import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class547 {

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lja;")
    public static class254 field7771 = new class254(13, 0, 1, 0);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "Lqfa;")
    public static class85 field7775 = new class85(65, 11);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field7772;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7773;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lqfa;")
    public static class85 field7769;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
    public static final boolean method3153(boolean arg0) {
        field7774++;
        if (class199.field3098 < 1) {
            return false;
        } else {
            if (!arg0) {
                method3153(true);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method3154(byte arg0) {
        field7771 = null;
        field7769 = null;
        if (arg0 >= 12) {
            field7775 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILr;)V")
    public static final void method3155(int arg0, class167 arg1) {
        field7770++;
        for (class45 var2 = (class45) class705.field9921.method3317(-121); var2 != null; var2 = (class45) class705.field9921.method3321(-121)) {
            if (var2.field1114) {
                var2.method586(arg1);
            }
        }
        int var3 = -32 % ((-arg0 - 68) / 43);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
    public final int method3156(int arg0, int arg1, int arg2) {
        field7772++;
        int var4 = arg0 < class310.field4626 ? class310.field4626 : arg0;
        if (class506.field7181 == this) {
            return 0;
        }
        if (arg1 != 4416) {
            field7775 = null;
        }
        if (class224.field3360 == this) {
            return var4 - arg2;
        } else if (class619.field8964 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7773++;
        throw new IllegalStateException();
    }
}
