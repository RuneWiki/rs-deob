import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class104 {

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field1503 = 0;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1510 = 0;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1508 = 1;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "I")
    public int field1502;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field1504;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field1506;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field1512;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "[Llj;")
    public static class289[] field1509;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[Z")
    public static boolean[] field1505;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIILre;I)V", line = 6)
    public static final void method692(int arg0, int arg1, int arg2, int arg3, int arg4, class287 arg5, int arg6) {
        if (arg6 != -5837) {
            field1508 = 52;
        }
        class293.method2085(arg0, arg5.field4796, arg1, arg4, arg3, 512, arg2, arg5.field4783);
        field1512++;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lsi;IIIZ)V", line = 39)
    public static final void method693(class264 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            field1508 = -122;
        }
        field1507++;
        if (class245.field3886) {
            class335.method2375(arg3, arg2, arg3 + arg0.field4223, arg0.field4236 + arg2);
        }
        if (class203.field3112 < 3) {
            if (class245.field3886) {
                ((class232) class139.field2184).method1601(arg3, arg2, arg0.field4223, arg0.field4236, class139.field2184.field4802 / 2, class139.field2184.field4811 / 2, (int) class355.field5628, 256, (class232) arg0.method1859(-1, false));
            } else {
                ((class137) class139.field2184).method964(arg3, arg2, arg0.field4223, arg0.field4236, class139.field2184.field4802 / 2, class139.field2184.field4811 / 2, (int) class355.field5628, 256, arg0.field4260, arg0.field4338);
            }
        } else if (class245.field3886) {
            class289 var5 = arg0.method1859(-1, false);
            if (var5 != null) {
                var5.method945(arg3, arg2);
            }
        } else {
            class317.method2291(arg3, arg2, 0, arg0.field4260, arg0.field4338);
        }
        class324.field5309[arg1] = true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 78)
    public static void method694(byte arg0) {
        field1509 = null;
        field1505 = null;
        if (arg0 > -78) {
            field1505 = (boolean[]) null;
        }
    }
}
