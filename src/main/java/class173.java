import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class173 extends class211 {

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "Ljava/lang/String;")
    public static String field2389 = " is already on your ignore list.";

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BLjava/lang/String;)I", line = 4)
    public static final int method1271(byte arg0, String arg1) {
        if (arg0 <= 78) {
            field2389 = (String) null;
        }
        field2391++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 27)
    public static void method1272(int arg0) {
        if (arg0 == -4112) {
            field2389 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)V", line = 38)
    public static final void method1273(int arg0) {
        int var1 = 122 % ((-arg0 - 78) / 37);
        class217.field3062.method2262(false);
        field2390++;
    }

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)I", line = 47)
    public static final int method1274(int arg0) {
        field2388++;
        if (arg0 != 1) {
            method1274(-54);
        }
        return class137.field1871;
    }
}
