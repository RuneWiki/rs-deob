import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class284 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field3802 = 0;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lik;")
    public static class410 field3805 = new class410(16);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3806 = "Connecting to update server";

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Z")
    public static boolean field3807 = false;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lik;")
    public static class410 field3808 = new class410(200);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "B")
    public static byte field3800;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lbd;")
    public static class304 field3809;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BIII)V")
    public static final void method1791(byte arg0, int arg1, int arg2, int arg3) {
        field3801++;
        if (arg0 != -125) {
            field3809 = null;
        }
        class450 var4 = class59.method540(11, arg2, 1000);
        var4.method2800(256);
        var4.field6509 = arg3;
        var4.field6498 = arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        field3806 = null;
        int var1 = -52 % ((arg0 - 74) / 32);
        field3809 = null;
        field3808 = null;
        field3805 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method1793(int arg0) {
        class49.field832 = null;
        class338.field4619 = null;
        class43.field650 = null;
        class314.field4241 = null;
        class283.field3796 = null;
        class10.field80 = null;
        class15.field124 = null;
        class173.field2539 = null;
        class22.field414 = null;
        class255.field3460 = null;
        class400.field5589 = null;
        class377.field5308 = null;
        field3804++;
        class53.field859 = null;
        class96.field1387 = null;
        if (arg0 > -45) {
            field3806 = null;
        }
        class233.field3208 = null;
        class27.field475 = null;
        class269.field3617 = null;
    }
}
