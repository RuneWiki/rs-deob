import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class210 {

    @OriginalMember(owner = "client!of", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3385 = "green:";

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lih;")
    public static class143 field3388;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "[[Lej;")
    public static class336[][] field3387;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V", line = 5)
    public static void method1420(int arg0) {
        field3388 = null;
        if (arg0 != 7724) {
            field3387 = (class336[][]) ((class336[][]) null);
        }
        field3387 = (class336[][]) null;
        field3385 = null;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)V", line = 18)
    public static final void method1421(int arg0, byte arg1) {
        field3389++;
        if (arg1 >= -110) {
            method1424(-45, (byte) 78, -38);
        }
        class159.field2601.method1883(2047773287, arg0);
        class341.field5286.method1883(2047773287, arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILbm;)V", line = 34)
    public static final void method1422(int arg0, class307 arg1) {
        if (arg0 >= -18) {
            field3385 = (String) null;
        }
        class165.field2673 = arg1;
        class196.field3154 = class165.field2673.method2056(4, -118);
        field3392++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V", line = 49)
    public static final void method1423(byte arg0) {
        int var1 = -111 % ((-arg0 - 36) / 57);
        field3391++;
        int var2 = class239.method1586(true);
        if (var2 == 0) {
            class6.field137 = (byte[][][]) null;
            class281.method1889((byte) -93, 0);
        } else if (var2 == 1) {
            class118.method774((byte) 0, true);
            class281.method1889((byte) 116, 512);
            class190.method1216((byte) -92);
        } else {
            class118.method774((byte) (class158.field2589 - 4 & 0xFF), true);
            class281.method1889((byte) -117, 2);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IBI)V", line = 83)
    public static final void method1424(int arg0, byte arg1, int arg2) {
        int var3 = class171.field2751 * arg0 >> 8;
        if (arg2 == -1 && !class146.field2389) {
            class269.method1793(-27795);
        } else if (arg2 != -1 && (class328.field5039 != arg2 || !class123.method799(false)) && var3 != 0 && !class146.field2389) {
            class80.method584(false, false, 0, arg2, class75.field1530, 2, var3);
        }
        if (arg1 != -59) {
            method1420(-68);
        }
        class328.field5039 = arg2;
        field3386++;
    }
}
