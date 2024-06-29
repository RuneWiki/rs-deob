import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class580 {

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Laq;")
    public static class494 field8354 = new class494(4);

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "Lsaa;")
    public static class657 field8356 = new class657();

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "Z")
    public static boolean field8359 = false;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field8358 = 0;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "C")
    public char field8355;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public int field8350;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field8352;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public int field8353;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public static int field8357;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lgh;I)V", line = 11)
    public static final void method3407(class506 arg0, int arg1) {
        field8348++;
        class421 var2 = (class421) class254.field3641.method3731((byte) -111);
        if (arg1 != -30920) {
            field8359 = true;
        }
        while (var2 != null) {
            if (var2.field5846 == arg0) {
                if (var2.field5835 != null) {
                    class234.field3399.method4220(var2.field5835);
                    var2.field5835 = null;
                }
                var2.method4237(arg1 + 30919);
                return;
            }
            var2 = (class421) class254.field3641.method3729((byte) -127);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lol;II)V", line = 46)
    private final void method3408(class431 arg0, int arg1, int arg2) {
        field8351++;
        int var4 = 83 % ((-arg2 - 2) / 42);
        if (arg1 == 1) {
            this.field8355 = class478.method2834((byte) -68, arg0.method2529(96));
        } else if (arg1 == 2) {
            this.field8350 = arg0.method2565((byte) -123);
            this.field8353 = arg0.method2557(14929);
            this.field8352 = arg0.method2557(14929);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 71)
    public static final void method3409(int arg0) {
        if (class263.field3723 != null) {
            try {
                class263.field3723.close();
            } catch (IOException var1) {
            }
        }
        field8357++;
        class263.field3723 = null;
        if (arg0 != 802) {
            method3409(39);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 100)
    public static void method3410(boolean arg0) {
        if (!arg0) {
            method3409(23);
        }
        field8356 = null;
        field8354 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLol;)V", line = 111)
    public final void method3411(byte arg0, class431 arg1) {
        field8349++;
        int var3 = 34 / ((-arg0 - 63) / 54);
        while (true) {
            int var4 = arg1.method2557(14929);
            if (var4 == 0) {
                return;
            }
            this.method3408(arg1, var4, -120);
        }
    }
}
