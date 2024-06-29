import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class499 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Z")
    private static boolean field6576 = false;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    private static int field6578 = 0;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "Lae;")
    private static class40 field6577 = new class40();

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ZB)V")
    public static final synchronized void method2688(boolean arg0, byte arg1) {
        field6576 = arg0;
        if (arg1 != -28) {
            field6578 = -14;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Lp;B)V")
    public static final synchronized void method2689(class249 arg0, byte arg1) {
        int var2 = 76 % ((-arg1 - 18) / 37);
        if (field6576) {
            return;
        }
        if (field6578 <= 0) {
            arg0.method548(false);
        } else {
            class143 var3 = new class143();
            var3.field1844 = arg0;
            field6577.method239(var3, (byte) 93);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static final synchronized void method2690(int arg0) {
        field6578--;
        if (field6578 == arg0) {
            method2692(-5175);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(B)V")
    public static final synchronized void method2691(byte arg0) {
        field6578++;
        if (arg0 != -75) {
            method2689(null, (byte) -102);
        }
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public static final synchronized void method2692(int arg0) {
        while (true) {
            class143 var1 = (class143) field6577.method244(true);
            if (var1 == null) {
                if (arg0 != -5175) {
                    method2692(-112);
                    return;
                }
                return;
            }
            var1.field1844.method548(true);
            var1.method1871(-57);
        }
    }
}
