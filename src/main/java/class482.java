import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class482 extends class382 {

    @OriginalMember(owner = "client!vm", name = "i", descriptor = "Lcq;")
    public class325 field7073;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field7072 = 0;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field7070 = -1;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "[I")
    public static int[] field7069 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!vm", name = "j", descriptor = "Lbj;")
    public static class159 field7074 = new class159(512);

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field7071;

    @OriginalMember(owner = "client!vm", name = "k", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!vm", name = "l", descriptor = "Lf;")
    public static class529 field7076;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BI)V")
    public static final void method2847(byte arg0, int arg1) {
        field7075++;
        if (arg0 > 42) {
            class163 var2 = class271.method1546(arg1, 3, true);
            var2.method1010(1504);
        }
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
    public static final void method2848(int arg0) {
        field7067++;
        if (arg0 != 2) {
            return;
        }
        for (class309 var1 = (class309) class36.field504.method3072((byte) 52); var1 != null; var1 = (class309) class36.field504.method3066(2)) {
            class423 var2 = var1.field4232;
            if (var2.field6184) {
                var1.method2946(-112);
                var2.method2524((byte) -31);
            } else if (var2.field6181 <= class393.field5484) {
                var2.method2526(60, class424.field6196);
                if (var2.field6184) {
                    var1.method2946(-124);
                } else {
                    class7.method41(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(III)V")
    public static final void method2849(int arg0, int arg1, int arg2) {
        field7071++;
        class163 var3 = class271.method1546(0, 15, true);
        var3.method1017(0);
        if (arg0 != -2365) {
            method2849(46, -29, -28);
        }
        var3.field2332 = arg1;
        var3.field2328 = arg2;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
    public static void method2850(int arg0) {
        field7069 = null;
        field7074 = null;
        field7076 = null;
        if (arg0 != 4) {
            field7070 = 127;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lht;II[B)V")
    public class482(class410 arg0, int arg1, int arg2, byte[] arg3) {
        this.field7073 = class288.method1647(arg2, arg3, 6406, 6406, (byte) 21, arg0, arg1, false);
        this.field7073.method1751(false, false, (byte) 81);
    }
}
