import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class116 extends RuntimeException {

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2664;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Ljava/lang/String;")
    public String field2666;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
    public static boolean field2660 = false;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lwd;")
    private static class150 field2662 = class2.method9(true, "Your friendlist is full)3 Max of 100 for free users)1 and 200 for members");

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    public static int[] field2663 = new int[500];

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lwd;")
    public static class150 field2665 = null;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lwd;")
    public static class150 field2667 = class2.method9(true, "Okay");

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Lwd;")
    public static class150 field2668 = class2.method9(true, "Aus");

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lwd;")
    public static class150 field2669 = class2.method9(true, " x");

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lwd;")
    public static class150 field2671 = field2662;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method809(int arg0, Component arg1) {
        field2670++;
        arg1.removeMouseListener(class83.field1986);
        if (arg0 != 849316225) {
            method811((byte) -93);
        }
        arg1.removeMouseMotionListener(class83.field1986);
        arg1.removeFocusListener(class83.field1986);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII)I")
    public static final int method810(byte arg0, int arg1, int arg2) {
        field2661++;
        if (arg0 >= -97) {
            return -51;
        }
        int var3 = class4.method17(arg1 + 45365, false, arg2 + 91923, 4) + (class4.method17(arg1 + 10294, false, arg2 + 37821, 2) - 128 >> 1) + (class4.method17(arg1, false, arg2, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class116(Throwable arg0, String arg1) {
        this.field2664 = arg0;
        this.field2666 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V")
    public static void method811(byte arg0) {
        field2662 = null;
        field2669 = null;
        field2668 = null;
        field2671 = null;
        field2667 = null;
        if (arg0 != 29) {
            field2667 = null;
        }
        field2663 = null;
        field2665 = null;
    }
}
