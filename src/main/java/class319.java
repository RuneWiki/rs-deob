import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class319 extends class587 implements class284 {

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "Laba;")
    public static class150 field4319 = new class150();

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "[I")
    public static int[] field4325 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "Lcba;")
    public static class471 field4324 = new class471(52, 2);

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field4323;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "Lmc;")
    public static class114 field4326;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILss;Lqa;II)V")
    public static final void method1986(int arg0, int arg1, class364 arg2, class207 arg3, int arg4, int arg5) {
        ++field4320;
        class283 var6 = class340.field4583.method3256(arg2.field4957, (byte) 23);
        if (var6.field3906 != -1) {
            if (arg5 <= 37) {
                field4324 = null;
            }
            int var7;
            if (!arg2.field4898) {
                var7 = 0;
            } else {
                int var8 = arg2.field4908 + arg4;
                var7 = var8 & 3;
            }
            class52 var9 = var6.method1821(0, var7, arg2.field4947, arg3);
            if (var9 != null) {
                int var10 = arg2.field4910;
                int var11 = arg2.field4926;
                if (~(var7 & 1) == -2) {
                    var10 = arg2.field4926;
                    var11 = arg2.field4910;
                }
                int var12 = var9.method419();
                int var13 = var9.method432();
                if (var6.field3901) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (~var6.field3903 == -1) {
                    var9.method499(arg1, -(var11 * 4) + arg0 + 4, var12, var13);
                } else {
                    var9.method423(arg1, -((var11 + -1) * 4) + arg0, var12, var13, 0, var6.field3903 | -16777216, 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZLjava/lang/String;I)Z")
    public static final boolean method1987(int arg0, boolean arg1, String arg2, int arg3) {
        ++field4322;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            boolean var4 = false;
            if (arg0 != 16) {
                return false;
            } else {
                boolean var5 = false;
                int var6 = 0;
                int var7 = arg2.length();
                for (int var8 = 0; var7 > var8; ++var8) {
                    char var9 = arg2.charAt(var8);
                    if (~var8 == -1) {
                        if (~var9 == -46) {
                            var4 = true;
                            continue;
                        }
                        if (var9 == '+' && arg1) {
                            continue;
                        }
                    }
                    int var11;
                    if (var9 >= '0' && ~var9 >= -58) {
                        var11 = var9 - '0';
                    } else if (var9 >= 'A' && ~var9 >= -91) {
                        var11 = var9 - '7';
                    } else {
                        if (~var9 > -98 || ~var9 < -123) {
                            return false;
                        }
                        var11 = var9 - 'W';
                    }
                    if (arg3 <= var11) {
                        return false;
                    }
                    if (var4) {
                        var11 = -var11;
                    }
                    int var10 = arg3 * var6 + var11;
                    if (~(var10 / arg3) != ~var6) {
                        return false;
                    }
                    var6 = var10;
                    var5 = true;
                }
                return var5;
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lpi;IZ[[I)V")
    public class319(class424 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class49.field958, class608.field8759, arg1 * arg1 * 6, arg2);
        super.field8393.method2267(2, this);
        if (!arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                OpenGL.glTexImage2Di(34069 - -var5, 0, this.method3448(-1), arg1, arg1, 0, class32.method327(super.field8412, (byte) 124), super.field8393.field6024, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                this.method3450(arg3[var6], arg1, (byte) -92, var6 + 34069, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
    public static final void method1988(int arg0) {
        if (class210.method1381(true)) {
            if (class607.field8742 == null) {
                class56.method512(false);
            }
            class58.field1054 = true;
            class519.field7316 = 0;
            try {
                class639.field9301 = class313.field4221.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        int var1 = -37 % ((-25 - arg0) / 45);
        ++field4323;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)V")
    public static final void method1989(int arg0) {
        ++field4321;
        if (arg0 >= 104) {
            for (class442 var1 = (class442) class448.field6352.method456((byte) -62); var1 != null; var1 = (class442) class448.field6352.method460((byte) 105)) {
                if (class526.method3030(var1.field6298, 1)) {
                    class522.method3015(5, var1);
                }
            }
            if (class210.field2958 == 1) {
                class300.method1907(255);
            } else {
                class481.method2802(-121, class467.field6582, class166.field2389, class28.field477, class228.field3256);
                int var2 = class40.field798.method2810(class459.field6463.method739(class173.field2491, 95), (byte) 124);
                for (class442 var3 = (class442) class448.field6352.method456((byte) -60); var3 != null; var3 = (class442) class448.field6352.method460((byte) -94)) {
                    int var4 = class623.method3632(var3, -95);
                    if (var2 < var4) {
                        var2 = var4;
                    }
                }
                class228.field3256 = var2 + 8;
                class28.field477 = (!class379.field5098 ? 22 : 26) + class210.field2958 * 16;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)V")
    public static void method1990(int arg0) {
        field4319 = null;
        field4326 = null;
        if (arg0 != 22) {
            field4319 = null;
        }
        field4325 = null;
        field4324 = null;
    }
}
