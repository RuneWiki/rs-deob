import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class577 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[F")
    public static float[] field8034 = new float[] { 0.0F, -1.0F, 0.0F, 0.0F };

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field8035;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static final void method3243(byte arg0) {
        if (arg0 >= -70) {
            field8037 = -47;
        }
        class610.field8774.method317((byte) 21);
        field8036++;
        class583.field8437.method317((byte) 21);
        class276.field3592.method317((byte) 21);
        class280.field3670.method317((byte) 21);
        class628.field9150.method317((byte) 21);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILlg;)I")
    public static final int method3244(int arg0, class32 arg1) {
        field8035++;
        if (arg0 <= 87) {
            field8037 = -83;
        }
        if (class93.field1233 == arg1) {
            return 5890;
        } else if (class542.field7574 == arg1) {
            return 34167;
        } else if (class17.field173 == arg1) {
            return 34168;
        } else if (class320.field4434 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
    public static final void method3245(byte arg0) {
        field8033++;
        if (arg0 >= -7) {
            method3244(51, null);
        }
        class510.field7112.method315(1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
    public static void method3246(int arg0) {
        field8034 = null;
        if (arg0 != -32428) {
            field8037 = 27;
        }
    }
}
