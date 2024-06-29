import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class99 extends class145 {

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Z")
    public static boolean field1869 = false;

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "Lmb;")
    public static class132 field1871 = class166.method1092("oder ung-Ultiges Passwort)3", 122);

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)Llf;")
    public static final class125 method618(int arg0, int arg1) {
        field1873++;
        class125 var2 = (class125) class192.field3588.method777(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        } else if (arg0 <= 78) {
            return null;
        } else {
            byte[] var3 = class56.field945.method1079(28, -65, arg1);
            class125 var4 = new class125();
            if (var3 != null) {
                var4.method823(0, new class112(var3));
            }
            class192.field3588.method774((long) arg1, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)Lwb;")
    public static final class236 method619(int arg0, int arg1) {
        field1870++;
        class236 var2 = (class236) class101.field1893.method777(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class8.field74.method1079(class10.method49(arg1 ^ 0x6BBE3103, arg0), -122, class22.method148(arg0, 127));
        class236 var4 = new class236();
        if (var3 != null) {
            var4.method1496(new class112(var3), (byte) 2);
        }
        var4.method1497((byte) -84);
        class101.field1893.method774((long) arg0, var4, arg1 ^ arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III)V")
    public static final void method620(int arg0, int arg1, int arg2) {
        int[] var3 = new int[arg0];
        field1872++;
        var3[0] = arg2;
        int[] var4 = new int[4];
        var4[0] = arg1;
        int var5 = 1;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class236.field4283[var6] != arg2) {
                var3[var5] = class236.field4283[var6];
                var4[var5] = class145.field2702[var6];
                var5++;
            }
        }
        class145.field2702 = var4;
        class236.field4283 = var3;
        class14.method76(class211.field3870, 0, class211.field3870.length - 1, (byte) 89);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
    public static void method621(int arg0) {
        int var1 = 124 % ((-arg0 - 26) / 37);
        field1871 = null;
    }
}
