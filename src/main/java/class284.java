import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class284 extends class223 {

    @OriginalMember(owner = "client!l", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field4876;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "Lmh;")
    public static class128 field4874 = class22.method156(125, "headicons_prayer");

    @OriginalMember(owner = "client!l", name = "X", descriptor = "[I")
    public static int[] field4880 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!l", name = "db", descriptor = "Z")
    public static volatile boolean field4886 = true;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!l", name = "U", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!l", name = "V", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!l", name = "W", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!l", name = "Y", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!l", name = "Z", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!l", name = "ab", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!l", name = "bb", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!l", name = "cb", descriptor = "I")
    public static int field4885;

    @OriginalMember(owner = "client!l", name = "S", descriptor = "Lal;")
    public static class309 field4875;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 4)
    public final Object method1535(boolean arg0) {
        if (arg0) {
            field4874 = (class128) null;
        }
        field4881++;
        return this.field4876;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZIIIIIII)V", line = 18)
    public static final void method1966(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4873++;
        if (arg2 < 128 || arg1 < 128 || arg2 > 13056 || arg1 > 13056) {
            class128.field2205 = -1;
            class193.field3339 = -1;
            return;
        }
        int var8 = class64.method427(arg2, arg1, class133.field2315, (byte) 109) - arg4;
        int var9 = class141.field2424[class311.field5271];
        int var10 = var8 - class187.field3249;
        int var11 = arg2 - class142.field2436;
        int var12 = class141.field2411[class311.field5271];
        int var13 = arg1 - class143.field2445;
        int var14 = class141.field2424[class33.field716];
        int var15 = class141.field2411[class33.field716];
        int var16 = var11 * var15 + var13 * var14 >> 16;
        int var17 = var13 * var15 - var11 * var14 >> 16;
        if (!arg0) {
            field4875 = (class309) null;
        }
        int var19 = var10 * var12 - var9 * var17 >> 16;
        int var20 = var9 * var10 + var12 * var17 >> 16;
        if (var20 < 50) {
            class128.field2205 = -1;
            class193.field3339 = -1;
        } else if (class247.field4247) {
            int var22 = arg3 * 512 >> 8;
            class193.field3339 = arg6 + (var19 * var22 / var20);
            int var23 = arg7 * 512 >> 8;
            class128.field2205 = var16 * var23 / var20 + arg5;
        } else {
            class193.field3339 = arg6 + ((var19 << 9) / var20);
            class128.field2205 = (var16 << 9) / var20 + arg5;
        }
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V", line = 84)
    public static void method1967(int arg0) {
        field4874 = null;
        if (arg0 == -1) {
            field4875 = null;
            field4880 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 95)
    public class284(Object arg0) {
        this.field4876 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)I", line = 109)
    public static final int method1968(int arg0, byte arg1) {
        field4878++;
        if (arg1 != -121) {
            method1969(32, 82);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Z", line = 121)
    public final boolean method1532(byte arg0) {
        int var2 = -53 % ((arg0 - 71) / 42);
        field4884++;
        return false;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)V", line = 131)
    public static final void method1969(int arg0, int arg1) {
        if (arg0 != 31356) {
            method1967(109);
        }
        field4877++;
        class229 var2 = class241.method1638(12, 117, arg1);
        var2.method1566((byte) -3);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)V", line = 144)
    public static final void method1970(byte arg0, int arg1) {
        class37.field748.method1833(arg1, (byte) 74);
        if (arg0 != 125) {
            field4879 = -30;
        }
        field4883++;
        class99.field1713.method1833(arg1, (byte) 64);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)I", line = 178)
    public static final int method1971(int arg0, int arg1, int arg2) {
        field4882++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            int var4 = -58 % ((arg1 + 13) / 55);
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
