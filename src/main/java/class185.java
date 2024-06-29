import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class185 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field2916 = 0;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "[I")
    public static int[] field2917 = new int[100];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "Lpf;")
    public static class305 field2915 = new class305(16);

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1320(int arg0) {
        if (arg0 != 100) {
            field2916 = -120;
        }
        field2915 = null;
        field2917 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)Lni;")
    public static final class157 method1321(int arg0, int arg1) {
        field2918++;
        class157 var2 = (class157) class121.field1829.method1173((long) arg1, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field1691.method721((byte) -117, arg0, arg1);
        class157 var4 = new class157();
        if (var3 != null) {
            var4.method1136(arg0 + 68, new class31(var3));
        }
        class121.field1829.method1167((byte) 127, var4, (long) arg1);
        return var4;
    }
}
