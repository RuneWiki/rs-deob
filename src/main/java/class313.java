import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class313 {

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "[I")
    public static int[] field5405 = new int[500];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "Lsf;")
    public static class108 field5404 = class140.method973(255, "::rect_debug");

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Lsf;")
    public static class108 field5410 = class140.method973(255, ")4a=");

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
    public static int[] field5409 = new int[100];

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5412 = 0;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5411;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[Lt;")
    public static class257[] field5408;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)Lrl;", line = 7)
    public static final class197 method2181(int arg0, int arg1) {
        field5407++;
        class197 var2 = (class197) class43.field566.method466((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1168.method1868(12236, 5, arg0);
        class197 var4 = new class197();
        if (var3 != null) {
            var4.method1395((byte) -18, new class249(var3));
        }
        if (arg1 >= -97) {
            method2182(59);
        }
        class43.field566.method468((long) arg0, (byte) -115, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 32)
    public static void method2182(int arg0) {
        field5405 = null;
        if (arg0 != -1) {
            field5408 = (class257[]) null;
        }
        field5408 = null;
        field5404 = null;
        field5410 = null;
        field5409 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 51)
    public static final void method2183(byte arg0) {
        if (arg0 != 105) {
            return;
        }
        field5411++;
        for (class261 var1 = (class261) class94.field1502.method13(0); var1 != null; var1 = (class261) class94.field1502.method15((byte) 47)) {
            class14 var2 = var1.field4597;
            if (class295.field5159 != var2.field162 || var2.field176) {
                var1.method1325(0);
            } else if (class116.field2000 >= var2.field164) {
                var2.method97((byte) -13, class195.field3534);
                if (var2.field176) {
                    var1.method1325(0);
                } else {
                    class146.method1018(var2.field162, var2.field170, var2.field187, var2.field167, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lrm;I)Lta;", line = 96)
    public static final class200 method2184(class249 arg0, int arg1) {
        field5406++;
        if (arg1 != 32044) {
            method2181(123, 58);
        }
        return new class200(arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1728(true), arg0.method1749(false), arg0.method1731(true));
    }
}
