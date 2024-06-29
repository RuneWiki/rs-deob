import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class248 {

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    private static int field4242 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    private static boolean field4241 = false;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "Lpu;")
    private static class411 field4243 = new class411();

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 4)
    public static final synchronized void method1683(int arg0) {
        if (arg0 != 0) {
            method1684((byte) -111);
        }
        field4242--;
        if (field4242 == 0) {
            method1684((byte) -21);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V", line = 21)
    public static final synchronized void method1684(byte arg0) {
        while (true) {
            class342 var1 = (class342) field4243.method2539(arg0 + 21);
            if (var1 == null) {
                if (arg0 != -21) {
                    field4241 = false;
                    return;
                }
                return;
            }
            var1.field5356.method224();
            var1.method1821((byte) 49);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZZ)V", line = 42)
    public static final synchronized void method1685(boolean arg0, boolean arg1) {
        if (arg1) {
            field4241 = true;
        }
        field4241 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZLcl;)V", line = 54)
    public static final synchronized void method1686(boolean arg0, class242 arg1) {
        if (field4241) {
            return;
        }
        if (arg0) {
            method1684((byte) 82);
        }
        if (field4242 > 0) {
            class342 var2 = new class342();
            var2.field5356 = arg1;
            field4243.method2541(0, var2);
        } else {
            arg1.method224();
        }
    }
}
