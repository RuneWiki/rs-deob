import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public abstract class class77 extends class151 {

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lbg;")
    public static class310 field1374 = new class310(37, -1);

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "[Z")
    public static boolean[] field1376 = new boolean[100];

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "Lbg;")
    public static class310 field1377 = new class310(72, -1);

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Lqi;")
    public static class382 field1378 = new class382("LIVE", 0);

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)I", line = 8)
    public static final int method563(int arg0, boolean arg1) {
        if (!arg1) {
            method563(-110, true);
        }
        field1373++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIBIIII)V", line = 19)
    public static final void method564(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= class355.field5296 && class320.field4818 >= arg5 && arg4 >= class248.field3808 && arg3 <= class478.field7310) {
            if (arg6 == 1) {
                class199.method1238(arg3, arg1, arg0, arg4, 288551336, arg5);
            } else {
                class166.method1045(arg1, arg5, arg6, 9890, arg3, arg4, arg0);
            }
        } else if (arg6 == 1) {
            class96.method721(arg3, arg1, arg5, false, arg4, arg0);
        } else {
            class370.method2242(arg6, arg0, arg1, arg4, 7, arg3, arg5);
        }
        if (arg2 == 14) {
            field1375++;
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V", line = 51)
    public static void method565(byte arg0) {
        field1374 = null;
        field1377 = null;
        field1376 = null;
        field1378 = null;
        if (arg0 < 45) {
            method563(-12, false);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)Lsl;")
    public abstract class304 method423(int arg0);
}
