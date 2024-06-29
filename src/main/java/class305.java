import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class305 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "Z")
    private static boolean field4244 = false;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    private static int field4246 = 0;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "Luh;")
    private static class168 field4245 = new class168();

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)V", line = 4)
    public static final synchronized void method1995(byte arg0, boolean arg1) {
        if (arg0 < -120) {
            field4244 = arg1;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 14)
    public static final synchronized void method1996(int arg0) {
        field4246--;
        if (arg0 >= -83) {
            method1997(-1, null);
        }
        if (field4246 == 0) {
            method1998((byte) -109);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILe;)V", line = 36)
    public static final synchronized void method1997(int arg0, class532 arg1) {
        if (field4244) {
            return;
        }
        if (arg0 >= field4246) {
            arg1.method129(false);
        } else {
            class757 var2 = new class757();
            var2.field10562 = arg1;
            field4245.method1273(var2, -20180);
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)V", line = 58)
    public static final synchronized void method1998(byte arg0) {
        while (true) {
            class757 var1 = (class757) field4245.method1271(8);
            if (var1 == null) {
                if (arg0 > -22) {
                    field4244 = false;
                    return;
                }
                return;
            }
            var1.field10562.method129(true);
            var1.method2314((byte) 69);
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(B)V", line = 80)
    public static final synchronized void method1999(byte arg0) {
        field4246++;
        int var1 = -68 % ((arg0 + 79) / 45);
    }
}
