import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class298 extends class134 {

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public int field4897;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public int field4899;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public int field4903;

    @OriginalMember(owner = "client!vh", name = "y", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!vh", name = "z", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!vh", name = "v", descriptor = "Lkk;")
    public class254 field4906;

    @OriginalMember(owner = "client!vh", name = "w", descriptor = "Lkk;")
    public class254 field4907;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "Ljava/lang/String;")
    public String field4902;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "Z")
    public boolean field4904;

    @OriginalMember(owner = "client!vh", name = "x", descriptor = "[I")
    public static int[] field4908;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "[Ljava/lang/Object;")
    public Object[] field4905;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)Lr;")
    public static final class42 method2068(int arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        field4901++;
        class42 var2 = (class42) class93.field1411.method149((byte) -40, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class277.field4598.method1877(arg0, 0, (byte) 53);
        class42 var4 = new class42();
        if (var3 != null) {
            var4.method272((byte) -97, new class202(var3));
        }
        var4.method270(arg1 - 28807);
        class93.field1411.method152(var4, (long) arg0, true);
        return var4;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public static void method2069(byte arg0) {
        int var1 = 110 / ((37 - arg0) / 59);
        field4908 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BLfa;IZIII)V")
    public static final void method2070(byte arg0, class273 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class180.field2793 = arg6;
        int var7 = 126 / ((arg0 + 88) / 36);
        field4910++;
        class169.field2637 = arg5;
        class124.field1909 = arg2;
        class202.field3238 = 1;
        class231.field3705 = arg4;
        class79.field1257 = arg1;
        class278.field4621 = arg3;
    }
}
