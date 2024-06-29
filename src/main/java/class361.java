import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class361 extends class381 {

    @OriginalMember(owner = "client!me", name = "y", descriptor = "Z")
    public static boolean field4911 = false;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4909 = "Loaded client variable data";

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field4900;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public int field4904;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public int field4912;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "Lbi;")
    public class139 field4903;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "Lbi;")
    public class139 field4907;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "Ljava/lang/String;")
    public String field4899;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "Z")
    public boolean field4902;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "[Ljava/lang/Object;")
    public Object[] field4905;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V", line = 4)
    public static final void method2263(int arg0, byte arg1) {
        if (class163.field2408 == null) {
            class163.field2408 = new byte[4][class116.field1621][class385.field5425];
        }
        field4906++;
        if (arg0 >= -60) {
            return;
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class116.field1621; var3++) {
                for (int var4 = 0; var4 < class385.field5425; var4++) {
                    class163.field2408[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IILjava/lang/String;JILjava/lang/String;II)V", line = 45)
    public static final void method2264(int arg0, int arg1, String arg2, long arg3, int arg4, String arg5, int arg6, int arg7) {
        field4898++;
        if (class94.field1369 || class415.field5808 >= 500) {
            return;
        }
        int var9 = arg1 == -1 ? class124.field1733 : arg1;
        int var10 = 47 / ((arg4 + 46) / 54);
        class63 var11 = new class63(arg2, arg5, var9, arg6, arg3, arg7, arg0);
        class268.field3613.method1249(var11, (byte) -107);
        class415.field5808++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILsa;)V", line = 66)
    public static final void method2265(int arg0, class411 arg1) {
        class91.field1351[arg0] = arg1;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIII)I", line = 70)
    public static final int method2266(int arg0, int arg1, int arg2, int arg3) {
        field4908++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg0;
        } else {
            if (arg3 != -20991) {
                method2263(-78, (byte) 88);
            }
            return var4 == 2 ? 1023 - arg1 : arg0;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(B)V", line = 99)
    public static void method2267(byte arg0) {
        if (arg0 >= 55) {
            field4909 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V", line = 117)
    public static final void method2268(int arg0) {
        field4914++;
        if (arg0 > 67) {
            class260.field3508 = true;
        }
    }
}
