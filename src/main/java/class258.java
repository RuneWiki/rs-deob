import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class258 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lta;")
    public static class262 field3949 = new class262(16);

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "[I")
    public static int[] field3953 = new int[32];

    @OriginalMember(owner = "client!fj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3954 = "wave2:";

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lsc;")
    public static class256 field3952 = new class256(128);

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "Z")
    public static boolean field3956 = true;

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "Lob;")
    public static class132 field3955 = new class132();

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLcd;)V")
    public static final void method1711(byte arg0, class28 arg1) {
        field3948++;
        class144 var2 = (class144) class61.field981.method1414(true, class247.method1668(arg1.field446, true));
        int var3 = -73 / ((32 - arg0) / 57);
        if (var2 == null) {
            class184.method1237(arg1, 0, (class32) null, 128, (class73) null, arg1.field4143[0], arg1.field4204[0], class274.field4318);
        } else {
            var2.method996(true);
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Z)V")
    public static void method1712(boolean arg0) {
        field3952 = null;
        field3955 = null;
        field3949 = null;
        if (arg0) {
            field3953 = null;
            field3954 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIBIIIIII)V")
    public static final void method1713(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 >= -99) {
            return;
        }
        if (arg2 >= class75.field1265 && arg2 <= class261.field4025 && class75.field1265 <= arg5 && class261.field4025 >= arg5 && arg7 >= class75.field1265 && arg7 <= class261.field4025 && arg9 >= class75.field1265 && class261.field4025 >= arg9 && class271.field4289 <= arg8 && class113.field1779 >= arg8 && arg1 >= class271.field4289 && arg1 <= class113.field1779 && class271.field4289 <= arg6 && arg6 <= class113.field1779 && class271.field4289 <= arg0 && arg0 <= class113.field1779) {
            class188.method1262(arg2, arg8, arg5, 112, arg0, arg9, arg1, arg4, arg7, arg6);
        } else {
            class99.method772(arg8, (byte) 65, arg4, arg7, arg9, arg6, arg2, arg0, arg1, arg5);
        }
        field3950++;
    }
}
