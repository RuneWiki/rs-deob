import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class108 extends class623 {

    @OriginalMember(owner = "client!r", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1330 = null;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1334 = 0;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lus;")
    public static class328 field1335 = new class328(0, 7);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILgaa;)V", line = 3)
    public static final void method742(int arg0, class460 arg1) {
        if (arg0 != 0) {
            method743((byte) 52);
        }
        field1332++;
        if (arg1.field6483 == 5 && arg1.field6556 != -1) {
            class739.method4138(class458.field6407, arg1, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 17)
    public static void method743(byte arg0) {
        if (arg0 > 4) {
            field1335 = null;
            field1330 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(B)Lng;", line = 28)
    public static final class377 method744(byte arg0) {
        field1329++;
        if (arg0 >= -110) {
            field1336 = 122;
        }
        return class341.field4407;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lida;I)V", line = 40)
    public static final void method745(class650 arg0, int arg1) {
        field1333++;
        if (arg1 >= -6) {
            field1336 = 39;
        }
        class4.field33.method3110(arg0, 1);
        arg0.field8930 = arg0.field8928.field2354;
        class756.field10532 += arg0.field8930;
        arg0.field8928.field2354 = 0;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ltn;I)Lfm;", line = 61)
    public static final class267 method746(class179 arg0, int arg1) {
        field1331++;
        if (arg1 != 23582) {
            method746(null, -120);
        }
        class565 var2 = class654.method3530((byte) 126, arg0);
        int var3 = arg0.method1143((byte) 124);
        return new class267(var2.field7904, var2.field7905, var2.field7902, var2.field7910, var2.field7903, var3);
    }
}
