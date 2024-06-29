import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class165 {

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "[I")
    public static int[] field2732 = new int[100];

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2733 = " has logged out.";

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field2731;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V")
    public static final void method1175(int arg0, int arg1) {
        if (arg0 > -110) {
            field2732 = null;
        }
        if (class88.field1378 == 0) {
            class91.field1454.method1973(arg1, -100);
        } else {
            class161.field2631 = arg1;
        }
        field2734++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static void method1176(int arg0) {
        field2733 = null;
        field2732 = null;
        int var1 = 115 / ((-arg0 - 20) / 33);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(II)Lhm;")
    public static final class183 method1177(int arg0, int arg1) {
        field2731++;
        class183 var2 = (class183) class41.field630.method61(102, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class195.field3157.method1156(0, arg1, (byte) -16);
        } else {
            var3 = class238.field3738.method1156(0, arg1 & 0x7FFF, (byte) -16);
        }
        if (arg0 != 0) {
            field2732 = null;
        }
        class183 var4 = new class183();
        if (var3 != null) {
            var4.method1294(new class274(var3), (byte) 123);
        }
        if (arg1 >= 32768) {
            var4.method1291((byte) 30);
        }
        class41.field630.method59(var4, (long) arg1, 5);
        return var4;
    }
}
