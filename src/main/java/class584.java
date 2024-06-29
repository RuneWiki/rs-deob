import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class584 extends InputStream {

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "Lvj;")
    public static class373 field8488 = new class373(65, 8);

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field8483;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
    public static int field8485;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field8487;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field8489;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Ldn;")
    public static class438 field8484;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ldn;")
    public static class438 field8486;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public static final void method3395(int arg0, int arg1, int arg2) {
        field8487++;
        if (class341.field4399 == class320.field4082) {
            if (class546.method3204(0, true, 0, 1, arg0, arg1, 1, -2, false)) {
                return;
            }
            class546.method3204(0, true, 0, 1, arg0, arg1, 1, -3, false);
        } else if (class546.method3204(0, true, 0, 1, arg0, arg1, 1, -3, false)) {
            return;
        } else {
            class546.method3204(0, true, 0, 1, arg0, arg1, 1, -2, false);
        }
        if (arg2 != 0) {
            method3395(123, -25, 36);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public static void method3396(int arg0) {
        field8486 = null;
        field8484 = null;
        if (arg0 != 65) {
            method3395(-47, 48, 104);
        }
        field8488 = null;
    }

    @OriginalMember(owner = "client!ag", name = "read", descriptor = "()I")
    public final int read() {
        field8489++;
        class462.method2688(30000L, (byte) 110);
        return -1;
    }
}
