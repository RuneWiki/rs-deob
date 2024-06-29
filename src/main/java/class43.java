import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class43 extends class170 {

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Z")
    public static boolean field674 = false;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field675 = 0;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "Ljava/lang/String;")
    public static String field678 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!ul", name = "m", descriptor = "Z")
    public static boolean field676 = false;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field680 = 99;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "Lcb;")
    public static class283 field682;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "[Lsd;")
    public static class27[] field673;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V", line = 11)
    public static void method405(int arg0) {
        field673 = null;
        field682 = null;
        if (arg0 == 0) {
            field678 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIB)V", line = 29)
    public static final void method406(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field677++;
        if (arg1 >= class298.field4667 && class327.field5072 >= arg1) {
            int var5 = class257.method1784((byte) 91, arg2, class34.field432, class75.field1064);
            int var6 = class257.method1784((byte) 91, arg3, class34.field432, class75.field1064);
            class49.method457(-29605, arg0, var5, arg1, var6);
        }
        if (arg4 != -56) {
            method405(27);
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIII)V", line = 60)
    public static final void method407(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field679++;
        if (arg0 < 32) {
            field673 = (class27[]) null;
        }
        if (class34.field432 <= arg2 && class75.field1064 >= arg2) {
            int var5 = class257.method1784((byte) 91, arg4, class298.field4667, class327.field5072);
            int var6 = class257.method1784((byte) 91, arg3, class298.field4667, class327.field5072);
            class113.method890(arg2, arg1, 113, var6, var5);
        }
    }
}
