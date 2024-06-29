import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class49 {

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Z")
    private static boolean field408 = false;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    private static int field410 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lui;")
    private static class193 field409 = new class193();

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static final synchronized void method259(int arg0) {
        if (arg0 != 0) {
            method263((byte) 110);
        }
        field410++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZ)V")
    public static final synchronized void method260(byte arg0, boolean arg1) {
        field408 = arg1;
        int var2 = -9 / ((arg0 - 58) / 55);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILo;)V")
    public static final synchronized void method261(int arg0, class28 arg1) {
        if (field408) {
            return;
        }
        if (field410 <= arg0) {
            arg1.method61(false);
        } else {
            class38 var2 = new class38();
            var2.field294 = arg1;
            field409.method1040(var2, -95);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static final synchronized void method262(int arg0) {
        field410--;
        if (field410 == arg0) {
            method263((byte) -1);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)V")
    public static final synchronized void method263(byte arg0) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            class38 var1 = (class38) field409.method1054((byte) -105);
            if (var1 == null) {
                return;
            }
            var1.field294.method61(true);
            var1.method3187(true);
        }
    }
}
