import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public abstract class class206 extends class128 {

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "Z")
    public boolean field2777 = false;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "Z")
    public boolean field2784 = false;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field2775;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public int field2780;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    public static int field2782 = 0;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "Ljava/lang/String;")
    public static String field2786 = "Prepared sound engine";

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(B)V")
    public static final void method1116(byte arg0) {
        class96.field1145 = null;
        class162.field2076 = null;
        class371.field5197 = null;
        field2785++;
        class126.field1621 = null;
        class75.field821 = null;
        class440.field6433 = null;
        class200.field2667 = null;
        if (arg0 >= -2) {
            field2782 = -102;
        }
        class171.field2151 = null;
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(B)V")
    public static void method1117(byte arg0) {
        field2786 = null;
        if (arg0 != -74) {
            field2778 = -12;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Lik;")
    public static final class409 method1118(int arg0, int arg1) {
        field2783++;
        if (arg1 != 32767) {
            method1116((byte) 50);
        }
        class409 var2 = (class409) class21.field200.method222((long) arg0, arg1 - 41174);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class106.field1312.method1687(arg0 & 0x7FFF, 1, 255);
        } else {
            var3 = class272.field3683.method1687(arg0, 1, 255);
        }
        class409 var4 = new class409();
        if (var3 != null) {
            var4.method2551(new class250(var3), 0);
        }
        if (arg0 >= 32768) {
            var4.method2554((byte) -17);
        }
        class21.field200.method218((long) arg0, (byte) -125, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "(B)V")
    public static final void method1119(byte arg0) {
        field2779++;
        class194.method1053((byte) -70, class38.field391);
        class143.method778(class38.field391, 2);
        if (class141.field1807 != null) {
            class141.field1807.method535(class38.field391, -9140);
        }
        if (arg0 != 115) {
            return;
        }
        class267.field3646.method963(0);
        class38.field391.setBackground(Color.black);
        class376.field5282 = -1;
        class88.method481((byte) 55, class38.field391);
        class372.method2241(arg0 ^ 0x73, class38.field391);
        if (class141.field1807 != null) {
            class141.field1807.method537(class38.field391, (byte) 82);
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIZZ)V")
    public class206(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field2775 = arg0;
        this.field2776 = arg2;
        this.field2777 = arg4;
        this.field2780 = arg1;
        this.field2784 = arg3;
    }
}
