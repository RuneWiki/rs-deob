import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class127 {

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[I")
    public static int[] field1896 = new int[5];

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Ltl;")
    public static class222 field1899 = new class222(64);

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field1902 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Lao;")
    public static class194 field1891;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "[Z")
    public static boolean[] field1897;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V", line = 8)
    public static final void method869(int arg0, byte arg1) {
        if (arg1 == -81) {
            field1889++;
            class179 var2 = class319.method2220(arg0, (byte) -115, 1);
            var2.method1239(true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V", line = 31)
    public static final void method870(int arg0, boolean arg1) {
        class237.field3757 = arg1;
        class49.field678 = !class152.method1062(124);
        field1892++;
        if (arg0 != 1404591760) {
            field1902 = -44;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)Lt;", line = 47)
    public static final class268 method871(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1893++;
        long var5 = (long) arg0 & 0xFFFFL << 16 | (long) arg4 << 48 & 0xFFFF000000000000L | (long) arg3 & 0xFFFFL << 32 | (long) arg2 & 0xFFFFL;
        class268 var7 = (class268) class182.field2939.method1619(var5, 79);
        if (var7 != null) {
            return var7;
        }
        class203[] var8 = null;
        class281 var9 = class4.method15(arg2, (byte) 76);
        if (arg1 != 5) {
            field1891 = (class194) null;
        }
        if (var9.field4421 != null) {
            var8 = new class203[var9.field4421.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class333 var11 = class339.method2340(-6047, var9.field4421[var10]);
                var8[var10] = new class203(var11.field5173, var11.field5170, var11.field5168, var11.field5165, var11.field5167, var11.field5171, var11.field5163, var11.field5176);
            }
        }
        class268 var12 = new class268(var9.field4420, var8, var9.field4429, arg4, arg3, arg0);
        class182.field2939.method1621(var5, arg1 + 74, var12);
        return var12;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 89)
    public static void method872(int arg0) {
        field1899 = null;
        if (arg0 != 0) {
            field1896 = (int[]) null;
        }
        field1891 = null;
        field1897 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V", line = 111)
    public static final void method873(boolean arg0, int arg1) {
        class179 var2 = class319.method2220(arg1, (byte) -90, 10);
        var2.method1239(arg0);
        field1898++;
    }
}
