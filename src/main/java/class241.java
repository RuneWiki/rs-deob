import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class class241 extends class8 {

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public int field3473;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "[Lku;")
    public static class254[] field3477 = new class254[5];

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "Let;")
    public static class419 field3476;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "Ljava/lang/Object;")
    public static Object field3481;

    static {
        for (int var0 = 0; var0 < field3477.length; var0++) {
            field3477[var0] = new class254();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIB)V", line = 3)
    public static final void method1576(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field3479++;
        if (arg3 >= class315.field4754 && arg3 <= class156.field2455) {
            int var5 = class9.method50(class70.field1213, arg0, class389.field5859, true);
            int var6 = class9.method50(class70.field1213, arg2, class389.field5859, true);
            class1.method2(var5, arg3, arg1, var6, (byte) 114);
        }
        if (arg4 != -73) {
            field3477 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V", line = 27)
    public static void method1577(int arg0) {
        if (arg0 != -29966) {
            field3477 = null;
        }
        field3476 = null;
        field3481 = null;
        field3477 = null;
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V", line = 40)
    public static final void method1578(boolean arg0) {
        class355.method2253(-84);
        field3478++;
        class14.field226 = null;
        class480.field7153 = null;
        class237.field3431 = null;
        class453.field6777 = null;
        class412.field6158 = null;
        if (arg0) {
            field3481 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(IIII)V", line = 57)
    public class241(int arg0, int arg1, int arg2, int arg3) {
        this.field3480 = arg0;
        this.field3473 = arg1;
        this.field3474 = arg2;
        this.field3475 = arg3;
    }
}
