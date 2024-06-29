import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class311 extends class757 {

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "Z")
    public static volatile boolean field4437 = true;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field4434 = 1;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "Z")
    public static boolean field4436 = false;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "S")
    public static short field4438 = 32767;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)Lls;", line = 4)
    public static final class149 method1994(int arg0, int arg1) {
        field4439++;
        class149[] var2 = class296.method1927(true);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class149 var4 = var2[var3];
            if (var4.field2144 == arg0) {
                return var4;
            }
        }
        if (arg1 <= 91) {
            field4436 = false;
        }
        return null;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lsd;Z)V", line = 38)
    public static final void method1995(class101 arg0, boolean arg1) {
        arg0.field1178 = false;
        field4435++;
        if (!arg1) {
            method1995(null, true);
        }
        if (arg0.field1179 != null) {
            arg0.field1179.field3925 = 0;
        }
        for (class101 var2 = arg0.method191(); var2 != null; var2 = arg0.method176()) {
            method1995(var2, true);
        }
    }
}
