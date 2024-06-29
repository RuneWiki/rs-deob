import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class313 {

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "F")
    public static float field4846 = 0.0F;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4847 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V", line = 12)
    public static void method2215(int arg0) {
        if (arg0 >= -5) {
            method2216(true, 52, 110);
        }
        field4847 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZII)I", line = 24)
    public static final int method2216(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field4847 = (String) null;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg1 & 0x1;
            arg2--;
            arg1 >>>= 0x1;
        }
        field4849++;
        return var3;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)I", line = 44)
    public static final int method2217(int arg0, int arg1) {
        field4850++;
        if (arg0 < 0) {
            return 0;
        }
        class133 var2 = (class133) class81.field1169.method370((byte) -120, (long) arg0);
        if (var2 == null) {
            return class226.method1690(arg0, 58).field3162;
        }
        int var3 = 0;
        if (arg1 != 18794) {
            method2217(97, 25);
        }
        for (int var4 = 0; var4 < var2.field2231.length; var4++) {
            if (var2.field2231[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class226.method1690(arg0, 36).field3162 - var2.field2231.length);
    }
}
