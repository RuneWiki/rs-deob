import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class284 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field4129 = -1;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "[I")
    public static int[] field4131 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Lcr;")
    public static class189 field4133 = new class189(500);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4136 = "Loading wordpack - ";

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field4132;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "[I")
    public static int[] field4134;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)Lrm;", line = 11)
    public static final class166 method1954(int arg0, int arg1) {
        field4130++;
        class166 var2 = (class166) class196.field2623.method2674((long) arg1, 22300);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field324.method2261(arg1, 19, 88);
        class166 var4 = new class166();
        if (var3 != null) {
            var4.method1024(arg0 - 107, new class228(var3));
        }
        if (arg0 != 137) {
            field4133 = null;
        }
        class196.field2623.method2673((long) arg1, var4, 11465);
        return var4;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 41)
    public static final void method1955(int arg0) {
        field4132++;
        class124.method786(0);
        class369.field5336 = null;
        class69.field894 = null;
        class380.field5535 = null;
        class243.field3241 = null;
        class315.field4611 = null;
        if (arg0 != 19) {
            field4133 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(II)Lns;", line = 60)
    public static final class172 method1956(int arg0, int arg1) {
        field4135++;
        class189 var2 = class439.field6453;
        class172 var3;
        synchronized (class439.field6453) {
            var3 = (class172) class439.field6453.method1137((long) arg0, 2108653711);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class295.field4228.method2261(arg0, 16, 96);
        class172 var5 = new class172();
        if (var4 != null) {
            var5.method1066(new class228(var4), -120);
        }
        int var6 = 112 % ((41 - arg1) / 52);
        class189 var7 = class439.field6453;
        synchronized (class439.field6453) {
            class439.field6453.method1144((long) arg0, var5, -3480);
            return var5;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 89)
    public static void method1957(byte arg0) {
        field4136 = null;
        field4133 = null;
        field4134 = null;
        field4131 = null;
        if (arg0 != -95) {
            field4129 = 75;
        }
    }
}
