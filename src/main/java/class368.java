import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class368 extends class243 {

    @OriginalMember(owner = "client!ll", name = "I", descriptor = "J")
    public static long field5169 = 0L;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!ll", name = "G", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)Z", line = 4)
    public static final boolean method2184(int arg0) {
        field5167++;
        if (class584.field8175) {
            try {
                if ((Boolean) class679.method3851("showingVideoAd", class144.field1868, -26978)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 <= 67) {
            field5168 = 88;
        }
        return true;
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIB)Z", line = 25)
    public static final boolean method2185(int arg0, int arg1, byte arg2) {
        field5170++;
        if (arg2 != -11) {
            field5169 = -40L;
        }
        return class147.method908(arg1, arg0, arg2 - 101) | (arg0 & 0x70000) != 0 || class584.method3261(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BI)V", line = 38)
    public static final void method2186(byte arg0, int arg1) {
        field5166++;
        if (arg0 == 97) {
            class252 var2 = class150.method916(arg1, arg0 ^ 0xFFFFFFA6, 7);
            var2.method1497(0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(II)[I", line = 51)
    public final int[] method5(int arg0, int arg1) {
        if (arg0 != 255) {
            field5169 = -124L;
        }
        field5165++;
        return class666.field9279;
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "()V", line = 63)
    public class368() {
        super(0, true);
    }
}
