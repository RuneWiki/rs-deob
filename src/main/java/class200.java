import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class200 extends IOException {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
    public static final int method1417(int arg0) {
        field2974++;
        if (arg0 != 100) {
            field2976 = 43;
        }
        if ((double) class664.field9493 == 3.0D) {
            return 37;
        } else if ((double) class664.field9493 == 4.0D) {
            return 50;
        } else if ((double) class664.field9493 == 6.0D) {
            return 75;
        } else if ((double) class664.field9493 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class200(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static final void method1418(boolean arg0) {
        class524.field7614 = (int) ((double) class184.field2546 * 34.46D);
        if (!arg0) {
            method1417(3);
        }
        field2975++;
        class148.field2159 = 200;
        class524.field7614 <<= 0x2;
        if (class211.field3164.method412()) {
            class524.field7614 += 512;
        }
        class451.method2763(-45, false);
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)Z")
    public static final boolean method1419(boolean arg0) {
        if (arg0) {
            field2976 = -76;
        }
        field2973++;
        class732.field10259++;
        class348.field5154 = true;
        return true;
    }
}
