import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bq")
public class class193 {

    @OriginalMember(owner = "client!bq", name = "d", descriptor = "[I")
    public static int[] field3261 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bq", name = "b", descriptor = "Lqu;")
    public static class65 field3259 = new class65(4, 1, 1, 1);

    @OriginalMember(owner = "client!bq", name = "c", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!bq", name = "e", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!bq", name = "f", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "Lop;")
    public static class128 field3258;

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V", line = 4)
    public static void method1357(int arg0) {
        field3259 = null;
        field3258 = null;
        if (arg0 != 47) {
            method1359(-94, (byte) -45);
        }
        field3261 = null;
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IZ)V", line = 17)
    public static final void method1358(int arg0, boolean arg1) {
        class319.field4810 = arg0;
        class108.field1510 = -1;
        if (arg1) {
            field3259 = null;
        }
        field3262++;
        class108.field1510 = -1;
        class233.method1632(-1);
    }

    @OriginalMember(owner = "client!bq", name = "a", descriptor = "(IB)V", line = 38)
    public static final void method1359(int arg0, byte arg1) {
        if (!field3258.field7250) {
            arg0 = -1;
        }
        field3260++;
        if (class371.field5520 == arg0) {
            return;
        }
        if (arg1 > -91) {
            field3263 = -59;
        }
        if (arg0 != -1) {
            class119 var2 = class347.field5134.method1611(33, arg0);
            class84 var3 = var2.method893(true);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class360.field5349.method2202(new Point(var2.field1800, var2.field1796), var3.method701(), var3.method700(), (byte) -123, class111.field1557, var3.method695());
                class371.field5520 = arg0;
            }
        }
        if (arg0 == -1 && class371.field5520 != -1) {
            class360.field5349.method2202(new Point(), null, -1, (byte) -26, class111.field1557, -1);
            class371.field5520 = -1;
        }
    }
}
