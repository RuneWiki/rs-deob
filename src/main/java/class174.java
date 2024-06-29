import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class174 {

    @OriginalMember(owner = "client!u", name = "e", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field2448 = 0;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "[[[Z")
    public static boolean[][][] field2449;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method1258(byte arg0, int arg1) {
        field2447++;
        if (class243.field3580.field7977.method2272(false) == 0) {
            arg1 = -1;
        }
        if (class112.field1585 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class266 var2 = class113.field1587.method3422(arg1, (byte) -99);
            class676 var3 = var2.method1753(false);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class345.field4749.method1875(var3.method3839(), -128, var3.method3843(), var3.method3848(), new Point(var2.field3802, var2.field3807), class95.field1383);
                class112.field1585 = arg1;
            }
        }
        if (arg1 == -1 && class112.field1585 != -1) {
            class345.field4749.method1875(null, -125, -1, -1, new Point(), class95.field1383);
            class112.field1585 = -1;
        }
        if (arg0 < 125) {
            field2449 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 58)
    public static void method1259(int arg0) {
        field2449 = null;
        if (arg0 < 120) {
            method1258((byte) 43, 62);
        }
    }
}
