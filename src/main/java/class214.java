import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class214 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V", line = 8)
    public static final void method1459(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 47) {
            field3003 = -77;
        }
        if (arg2 > arg3) {
            for (int var5 = arg3; var5 < arg2; var5++) {
                class206.field2886[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg3; var6++) {
                class206.field2886[var6][arg4] = arg0;
            }
        }
        field3000++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 46)
    public static final void method1460(int arg0) {
        int var1 = 126 % ((arg0 + 15) / 34);
        class180.field2607.method1237((byte) -120);
        field3001++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 56)
    public static final void method1461(byte arg0) {
        if (class265.field4175.toLowerCase().indexOf("microsoft") == -1) {
            class41.field486[93] = 43;
            if (class265.field4190 == null) {
                class41.field486[222] = 59;
                class41.field486[192] = 58;
            } else {
                class41.field486[222] = 58;
                class41.field486[520] = 59;
                class41.field486[192] = 28;
            }
            class41.field486[91] = 42;
            class41.field486[46] = 72;
            class41.field486[45] = 26;
            class41.field486[59] = 57;
            class41.field486[61] = 27;
            class41.field486[47] = 73;
            class41.field486[44] = 71;
            class41.field486[92] = 74;
        } else {
            class41.field486[219] = 42;
            class41.field486[223] = 28;
            class41.field486[221] = 43;
            class41.field486[187] = 27;
            class41.field486[188] = 71;
            class41.field486[190] = 72;
            class41.field486[192] = 58;
            class41.field486[186] = 57;
            class41.field486[189] = 26;
            class41.field486[222] = 59;
            class41.field486[220] = 74;
            class41.field486[191] = 73;
        }
        if (arg0 == -122) {
            field3006++;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 107)
    public static final String method1462(String arg0, byte arg1) {
        field3007++;
        if (arg1 == 41) {
            int var2 = class286.method2046(arg0, 0);
            return var2 == -1 ? "" : class170.method1106(class334.field5162.field4251[var2], 1, "<br>", " ");
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZILjava/lang/String;)I", line = 133)
    public static final int method1463(int arg0, boolean arg1, int arg2, String arg3) {
        field3004++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var5 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var11) {
                throw new NumberFormatException();
            }
            if (var5) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if (var10 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var4 = true;
        }
        if (arg0 != 55) {
            method1460(-118);
        }
        if (!var4) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)I", line = 210)
    public static final int method1464(int arg0, int arg1, int arg2, int arg3) {
        field3002++;
        if (arg0 <= 82) {
            field3003 = -38;
        }
        if (arg3 > 243) {
            arg1 >>= 0x4;
        } else if (arg3 > 217) {
            arg1 >>= 0x3;
        } else if (arg3 > 192) {
            arg1 >>= 0x2;
        } else if (arg3 > 179) {
            arg1 >>= 0x1;
        }
        return (arg3 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
    }
}
