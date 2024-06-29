import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class193 extends class155 {

    @OriginalMember(owner = "client!nm", name = "I", descriptor = "Lcb;")
    public class208 field2853;

    @OriginalMember(owner = "client!nm", name = "G", descriptor = "Lhc;")
    public static class53 field2851 = new class53(new byte[5000]);

    @OriginalMember(owner = "client!nm", name = "D", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!nm", name = "H", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!nm", name = "J", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!nm", name = "K", descriptor = "Llc;")
    public static class270 field2855;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1370(Component arg0, int arg1) {
        field2849++;
        if (arg1 == -21532) {
            arg0.removeKeyListener(class34.field431);
            arg0.removeFocusListener(class34.field431);
            class241.field3538 = -1;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
    public static void method1371(byte arg0) {
        if (arg0 <= -46) {
            field2851 = null;
            field2855 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Llc;III)[Llf;")
    public static final class94[] method1372(class270 arg0, int arg1, int arg2, int arg3) {
        field2854++;
        if (arg2 == -1) {
            return class144.method1079(arg3, arg0, arg1, (byte) 59) ? class221.method1537((byte) -40) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B[BII)I")
    public static final int method1373(byte arg0, byte[] arg1, int arg2, int arg3) {
        field2852++;
        int var4 = -1;
        if (arg0 >= -108) {
            return 9;
        } else {
            for (int var5 = arg2; var5 < arg3; var5++) {
                var4 = class174.field2655[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lcb;)V")
    public class193(class208 arg0) {
        this.field2853 = arg0;
    }
}
