import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class110 {

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Lsj;")
    public static class47 field1927;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)Lnb;")
    public static final class199 method753(int arg0, byte arg1) {
        field1929++;
        class199 var2 = (class199) class52.field903.method1269((long) arg0, (byte) 78);
        if (var2 != null) {
            return var2;
        }
        int var3 = -124 % ((59 - arg1) / 57);
        byte[] var4 = class50.field880.method464(-1, class200.method1372(arg0, (byte) -28), class131.method881((byte) 125, arg0));
        class199 var5 = new class199();
        var5.field3420 = arg0;
        if (var4 != null) {
            var5.method1354(new class247(var4), (byte) -85);
        }
        var5.method1365((byte) 89);
        if (!class202.field3515 && var5.field3459) {
            var5.field3435 = null;
        }
        if (var5.field3400) {
            var5.field3429 = false;
            var5.field3416 = 0;
        }
        class52.field903.method1271(-15561, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)V")
    public static final void method754(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 61 / ((arg1 + 4) / 62);
        field1930++;
        class255 var5 = class67.method449(arg2, (byte) 70, arg3);
        if (var5 != null && var5.field4472 != null) {
            class5 var6 = new class5();
            var6.field67 = var5.field4472;
            var6.field58 = var5;
            class127.method863(104, var6);
        }
        class105.field1849 = arg2;
        class12.field193 = true;
        class206.field3606 = arg3;
        class227.field3946 = arg0;
        class16.method120((byte) -104, var5);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)Z")
    public static final boolean method755(int arg0, int arg1) {
        if (arg1 < 29) {
            field1927 = null;
        }
        field1928++;
        return arg0 == 198 || arg0 == 230 || arg0 == 156 || arg0 == 140 || arg0 == 223;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
    public static void method756(byte arg0) {
        field1927 = null;
        if (arg0 != -4) {
            method755(-48, 13);
        }
    }
}
