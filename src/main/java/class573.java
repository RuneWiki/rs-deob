import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class573 {

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "[I")
    public static int[] field7937 = new int[13];

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "[I")
    public static int[] field7939 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field7938;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "I")
    public static int field7940;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)Lun;")
    public static final class604 method3239(byte arg0, int arg1) {
        field7938++;
        class604 var2 = (class604) class3.field26.method3134((long) arg1, -56);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class23.field219.method1087(1, arg1, 1);
        class604 var4 = new class604();
        var4.field8248 = arg1;
        if (arg0 >= -46) {
            field7937 = null;
        }
        if (var3 != null) {
            var4.method3343(new class138(var3), (byte) 114);
        }
        var4.method3338(true);
        if (var4.field8262 == 2 && class381.field5517.method2506(65, (long) arg1) == null) {
            class381.field5517.method2504((long) arg1, -44, new class360(class349.field5114));
            class537.field7375[class349.field5114++] = var4;
        }
        class3.field26.method3130((long) arg1, true, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public static void method3240(boolean arg0) {
        field7937 = null;
        if (!arg0) {
            field7939 = null;
        }
    }
}
