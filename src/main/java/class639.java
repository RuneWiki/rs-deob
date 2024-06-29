import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class639 extends class454 {

    @OriginalMember(owner = "client!lk", name = "D", descriptor = "Lhc;")
    public class316 field9008;

    @OriginalMember(owner = "client!lk", name = "E", descriptor = "[I")
    public static int[] field9009 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Lsi;")
    public static class769 field9007 = new class769(16);

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!lk", name = "F", descriptor = "I")
    public static int field9010;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "Ljava/lang/Object;")
    public static Object field9005;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method3630(byte arg0) {
        field9007 = null;
        field9005 = null;
        field9009 = null;
        int var1 = -119 / ((-arg0 - 52) / 46);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Lnk;")
    public static final class480 method3631(int arg0, int arg1) {
        field9006++;
        class480 var2 = (class480) class94.field1348.method2882((long) arg1, (byte) -95);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class395.field5468.method3019(arg0, arg1, 70);
        class480 var4 = new class480();
        if (var3 != null) {
            var4.method2841(true, arg1, new class431(var3));
        }
        class94.field1348.method2890(arg0 - 7307, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIBI)Z")
    public static final boolean method3632(int arg0, int arg1, byte arg2, int arg3) {
        field9010++;
        class705.field9884.method1571(arg1, arg3, arg0, class426.field5916);
        int var4 = class426.field5916[2];
        if (var4 < 50) {
            return false;
        }
        class426.field5916[2] = var4;
        class426.field5916[1] = class426.field5916[1] * class406.field5589 / var4 + class209.field3068;
        if (arg2 <= 91) {
            method3630((byte) 38);
        }
        class426.field5916[0] = class426.field5916[0] * class227.field3309 / var4 + class297.field4319;
        return true;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lhc;)V")
    public class639(class316 arg0) {
        this.field9008 = arg0;
    }
}
