import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class628 implements class64 {

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "Ljava/lang/String;")
    private String field9061;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Lom;")
    private class344 field9055;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field9057;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field9058;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field9059;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field9060;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field9062;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/lang/String;")
    public static String field9063;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Z")
    public static boolean field9056;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method3596(int arg0) {
        if (class470.field6673 == 1 || class470.field6673 == 3 || class470.field6673 != class273.field4095 && (class470.field6673 == 0 || class273.field4095 == 0)) {
            class39.field1062 = 0;
            class363.field5389 = 0;
            class208.field3179.method2600((byte) -114);
        }
        field9059++;
        class273.field4095 = class470.field6673;
        if (arg0 != -1) {
            field9057 = -120;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    public static final void method3597(byte arg0) {
        if (arg0 > -97) {
            field9057 = -121;
        }
        if (class243.field3674 < 0) {
            class459.field6560 = -1;
            class243.field3674 = 0;
            class453.field6461 = -1;
        }
        field9060++;
        if (class407.field5892 < class243.field3674) {
            class459.field6560 = -1;
            class453.field6461 = -1;
            class243.field3674 = class407.field5892;
        }
        if (class254.field3763 < 0) {
            class453.field6461 = -1;
            class254.field3763 = 0;
            class459.field6560 = -1;
        }
        if (class407.field5882 < class254.field3763) {
            class254.field3763 = class407.field5882;
            class459.field6560 = -1;
            class453.field6461 = -1;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I")
    public final int method376(int arg0) {
        field9062++;
        if (this.field9055.method2214(84, this.field9061)) {
            return 100;
        } else if (arg0 == 11878) {
            return 0;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)Lwa;")
    public final class569 method378(byte arg0) {
        if (arg0 != 112) {
            this.field9055 = null;
        }
        field9058++;
        return class569.field8288;
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lom;Ljava/lang/String;)V")
    public class628(class344 arg0, String arg1) {
        this.field9061 = arg1;
        this.field9055 = arg0;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V")
    public static void method3598(int arg0) {
        if (arg0 == -1) {
            field9063 = null;
        }
    }
}
