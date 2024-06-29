import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class367 extends class315 {

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field5043 = 0;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public int field5040;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public int field5049;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lrc;")
    public static class108 field5044;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Ljava/lang/String;")
    public String field5041;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)Z", line = 7)
    public static final boolean method2243(byte arg0, int arg1) {
        field5054++;
        if (arg1 == 58 || arg1 == 23 || arg1 == 57 || arg1 == 45 || arg1 == 4) {
            return true;
        } else {
            if (arg0 >= -56) {
                method2250(-96, (char) 65518, 117);
            }
            return arg1 == 25 || arg1 == 1007;
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V", line = 27)
    public static final void method2244(int arg0) {
        field5045++;
        class324 var1 = null;
        try {
            class275 var2 = class436.field6206.method596(0);
            while (var2.field3979 == 0) {
                class89.method752(0, 1L);
            }
            if (arg0 != 4) {
                return;
            }
            if (var2.field3979 == 1) {
                var1 = (class324) var2.field3984;
                class161 var3 = new class161(class25.field265 * 6 + 3);
                var3.method1180((byte) -110, 1);
                var3.method1173(class25.field265, (byte) 114);
                for (int var4 = 0; var4 < class339.field4689.length; var4++) {
                    if (class394.field5443[var4]) {
                        var3.method1173(var4, (byte) 116);
                        var3.method1177(class339.field4689[var4], -86);
                    }
                }
                var1.method2044(var3.field2262, 31, var3.field2298, 0);
            }
        } catch (Exception var6) {
        }
        try {
            if (var1 != null) {
                var1.method2049(-109);
            }
        } catch (Exception var5) {
        }
        class7.field44 = class10.method51(-3183);
        class199.field2947 = false;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Ljava/lang/String;", line = 83)
    public static final String method2245(int arg0, int arg1) {
        if (arg1 != 255) {
            field5043 = 34;
        }
        field5048++;
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + ((arg0 & 0xFF1E) >> 8) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lup;IIII)V", line = 96)
    public static final void method2246(class340 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class265.method1789(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class310.field4401) {
            class265.method1789(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class265.method1789(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class97.field1374) {
            class265.method1789(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class97.field1374) {
            class265.method1789(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class310.field4401 && arg4 <= class97.field1374) {
            class265.method1789(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class265.method1789(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class310.field4401 && arg4 > 0) {
            class265.method1789(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V", line = 147)
    public static void method2247(int arg0) {
        field5044 = null;
        if (arg0 != 0) {
            method2244(-78);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)I", line = 161)
    public static final int method2248(boolean arg0) {
        if (arg0) {
            method2243((byte) -13, -75);
        }
        field5050++;
        return 6;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIII)V", line = 175)
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg4;
        if (arg3 != 1) {
            return;
        }
        while (var6 <= arg1) {
            class61.method558(arg0, -10647, class373.field5141[var6], arg5, arg2);
            var6++;
        }
        field5052++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ICI)I", line = 194)
    public static final int method2250(int arg0, char arg1, int arg2) {
        field5042++;
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return arg2 == 1762 ? var3 : -72;
    }
}
