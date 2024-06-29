import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class38 {

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "[I")
    public int[] field478;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[I")
    public int[] field477;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "Lgda;")
    public static class53 field479 = new class53(59, 7);

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "Lbe;")
    public static class37 field482;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLjava/lang/String;BLvc;Z)V")
    public static final void method213(boolean arg0, String arg1, byte arg2, class316 arg3, boolean arg4) {
        field481++;
        if (arg0) {
            if (class316.field4377.startsWith("win") && arg3.field4385) {
                String var5 = null;
                if (class213.field2800 != null) {
                    var5 = class213.field2800.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class249 var6 = class49.method311(arg3, arg1, 0, true);
                    class1.field8 = arg3;
                    class54.field625 = arg1;
                    class346.field4874 = var6;
                    return;
                }
            }
            if (class316.field4377.startsWith("mac")) {
                String var7 = null;
                if (class213.field2800 != null) {
                    var7 = class213.field2800.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg4) {
                    class49.method311(arg3, arg1, 1, true);
                    return;
                }
            }
            class49.method311(arg3, arg1, 2, true);
        } else {
            class49.method311(arg3, arg1, 3, true);
        }
        if (arg2 < 114) {
            method215((byte) -29);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIZII)V")
    public static final void method214(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (!arg3) {
            method215((byte) -13);
        }
        if (class71.field960 <= arg0 && class549.field7665 >= arg5 && arg2 >= class143.field2050 && arg1 <= class461.field6495) {
            class565.method3256(-86, arg0, arg1, arg2, arg4, arg5);
        } else {
            class725.method4076(arg4, arg5, arg0, 63, arg2, arg1);
        }
        field480++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
    public static void method215(byte arg0) {
        field482 = null;
        if (arg0 < 86) {
            field482 = null;
        }
        field479 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(I)V")
    public class38(int arg0) {
        this.field483 = arg0;
        this.field478 = new int[this.field483];
        this.field477 = new int[this.field483];
    }
}
