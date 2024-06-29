import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class318 extends class264 {

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4494 = new String[100];

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "I")
    public static int field4496 = 0;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "F")
    public static float field4498;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Lrn;")
    public static class417 field4497;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 3)
    public class318() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "(I)V", line = 6)
    public static void method2025(int arg0) {
        field4494 = null;
        if (arg0 != 0) {
            field4494 = null;
        }
        field4497 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I", line = 18)
    public final int[] method90(int arg0, int arg1) {
        field4493++;
        if (arg1 != 21034) {
            method2027(-104, 16);
        }
        return class151.field2084;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)V", line = 32)
    public static final void method2026(int arg0, int arg1) {
        if (arg0 != -1360172240) {
            return;
        }
        for (class449 var2 = class329.field4558.method1097(64); var2 != null; var2 = class329.field4558.method1105(false)) {
            if ((var2.field6382 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method2714(-73);
            }
        }
        field4495++;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)I", line = 62)
    public static final int method2027(int arg0, int arg1) {
        return class332.field4610 == null ? 0 : class332.field4610[arg0][arg1] & 0xFF;
    }
}
