import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class327 extends class97 {

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[I")
    public static int[] field4906 = new int[25];

    @OriginalMember(owner = "client!te", name = "A", descriptor = "Loa;")
    public static class149 field4918 = new class149(64);

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public static int field4919 = -1;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "Lpf;")
    public static class425 field4920 = new class425(0, 0);

    @OriginalMember(owner = "client!te", name = "E", descriptor = "Lns;")
    public static class55 field4922 = new class55(6, 6);

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public int field4905;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public int field4907;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public int field4911;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public int field4914;

    @OriginalMember(owner = "client!te", name = "z", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "Lfh;")
    public class170 field4909;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "Lfh;")
    public class170 field4913;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "Ljava/lang/String;")
    public String field4915;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "Z")
    public boolean field4916;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[Ljava/lang/Object;")
    public Object[] field4908;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method2018(int arg0, byte[] arg1) {
        field4910++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class129.method768(arg1, 0, var3, 0, var2);
        if (arg0 != -1) {
            method2018(92, (byte[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static void method2019(byte arg0) {
        int var1 = -41 / ((arg0 - 53) / 61);
        field4922 = null;
        field4906 = null;
        field4920 = null;
        field4918 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2020(int arg0, int arg1, String arg2) {
        field4912++;
        class363.field5339++;
        class177.method1082(class30.field376, 0);
        int var3 = -117 / ((arg0 - 73) / 34);
        class189.field2840.method2366(class386.method2384(-4580, arg2) + 1, true);
        class189.field2840.method2375(110, arg2);
        class189.field2840.method2360(128, arg1);
    }
}
