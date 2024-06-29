import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class196 {

    @OriginalMember(owner = "client!c", name = "a", descriptor = "[I")
    public static int[] field2876 = new int[1000];

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lfda;")
    public static class336 field2877 = new class336();

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
    public static int[] field2879 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1 };

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 11)
    public static void method1422(byte arg0) {
        field2876 = null;
        int var1 = -128 % ((arg0 - 46) / 41);
        field2879 = null;
        field2877 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZLjava/lang/String;Lrv;)I", line = 27)
    public static final int method1423(boolean arg0, String arg1, class120 arg2) {
        field2878++;
        int var3 = arg2.field1521;
        byte[] var4 = class328.method2122(arg0, arg1);
        arg2.method886(-1, var4.length);
        arg2.field1521 += class285.field4370.method3807(var4.length, var4, arg2.field1521, (byte) 71, arg2.field1556, 0);
        return arg2.field1521 - var3;
    }
}
