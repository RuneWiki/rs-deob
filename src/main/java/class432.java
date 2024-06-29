import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class432 extends class376 {

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public static int field6216 = 0;

    @OriginalMember(owner = "client!cm", name = "r", descriptor = "I")
    public static int field6220 = 104;

    @OriginalMember(owner = "client!cm", name = "s", descriptor = "Z")
    public static boolean field6221 = false;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field6215;

    @OriginalMember(owner = "client!cm", name = "o", descriptor = "I")
    public int field6217;

    @OriginalMember(owner = "client!cm", name = "p", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!cm", name = "q", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!cm", name = "t", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!cm", name = "v", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!cm", name = "u", descriptor = "Lqj;")
    public static class296 field6223;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIB)V")
    public static final void method2714(int arg0, int arg1, byte arg2) {
        if (arg2 >= -99) {
            method2716(-15, false);
        }
        field6215++;
        class399 var3 = class269.method1655(5, arg0, -67);
        var3.method2583((byte) 71);
        var3.field5842 = arg1;
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(B)V")
    public static void method2715(byte arg0) {
        field6223 = null;
        if (arg0 != 10) {
            field6221 = false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)V")
    public static final void method2716(int arg0, boolean arg1) {
        field6218++;
        int[] var2 = null;
        byte var3;
        byte[][] var4;
        if (arg1) {
            var3 = 1;
            var4 = class149.field2149;
        } else {
            var4 = class387.field5635;
            var3 = 4;
        }
        for (int var5 = 0; var5 < var3; var5++) {
            class154.method1038(arg0 ^ 0x5EDD78);
            for (int var6 = 0; var6 < (field6220 >> 3); var6++) {
                for (int var7 = 0; var7 < (class267.field3646 >> 3); var7++) {
                    boolean var8 = false;
                    int var9 = class25.field403[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var9 & 0x7) >> 1;
                            int var12 = (var9 & 0xFFFC75) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class324.field4432.length; var15++) {
                                if (class324.field4432[var15] == var14 && var4[var15] != null) {
                                    int[] var16 = class227.method1437(class408.field5920, var7 * 8, var5, class24.field326, var11, var13, var10, var6 * 8, arg1, var4[var15], -54, var12);
                                    if (var2 == null && var16 != null) {
                                        var2 = var16;
                                    }
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class261.method1607(var6 * 8, 8, true, 8, var7 * 8, var5);
                    }
                }
            }
        }
        if (arg0 != 6217080) {
            field6223 = null;
        }
        if (var2 == null) {
            class66.field1040 = null;
        } else {
            class66.field1040 = class313.method1987(var2[1], var2[2], var2[3], 77, var2[0]);
            class23.field305 = var2[4];
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IBZI)Ljava/lang/String;")
    public static final String method2717(int arg0, byte arg1, boolean arg2, int arg3) {
        field6222++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg3 >= 0) {
            int var4 = 2;
            int var5 = arg3 / arg0;
            if (arg1 != -70) {
                return null;
            }
            while (var5 != 0) {
                var4++;
                var5 /= arg0;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg3;
                arg3 /= arg0;
                int var9 = var8 - (arg0 * arg3);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg3, arg0);
        }
    }
}
