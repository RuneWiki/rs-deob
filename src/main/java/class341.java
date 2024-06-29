import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class341 extends class428 {

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5264 = null;

    @OriginalMember(owner = "client!ul", name = "j", descriptor = "Z")
    public static boolean field5266 = true;

    @OriginalMember(owner = "client!ul", name = "i", descriptor = "I")
    public static int field5265 = -1;

    @OriginalMember(owner = "client!ul", name = "k", descriptor = "Z")
    public static boolean field5267 = true;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;")
    public static final String method2238(boolean arg0, String arg1) {
        field5268++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        byte var4 = 2;
        if (!arg0) {
            return null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class132.method965(22413, var6);
            }
            if (Character.isLetter(var6)) {
                var4 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var4 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var4 = 1;
            } else if (var4 != 2) {
                var4 = 1;
            }
            var3[var5] = var6;
        }
        return new String(var3);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I[IIII[IIILfn;IIIZII)I")
    public static final int method2239(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, class72 arg8, int arg9, int arg10, int arg11, boolean arg12, int arg13, int arg14) {
        if (arg3 != -3) {
            return 61;
        }
        field5263++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class74.field939[var15][var35] = 0;
                class238.field3973[var15][var35] = 99999999;
            }
        }
        boolean var16;
        if (arg11 == 1) {
            var16 = class405.method2542(arg10, arg0, -78, arg2, arg14, arg4, arg13, arg8, arg6, arg9, arg7);
        } else if (arg11 == 2) {
            var16 = class231.method1644(arg4, 1625554944, arg14, arg8, arg13, arg7, arg10, arg0, arg2, arg9, arg6);
        } else {
            var16 = class214.method1516(arg0, arg9, arg4, arg13, arg6, arg3 + 131, arg7, arg14, arg10, arg8, arg11, arg2);
        }
        int var17 = arg6 - 64;
        int var18 = arg14 - 64;
        int var19 = class193.field3142;
        int var20 = class134.field2111;
        if (!var16) {
            if (!arg12) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg7 - var23; var24 <= arg7 + var23; var24++) {
                for (int var25 = arg0 - var23; var25 <= arg0 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class238.field3973[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg7) {
                            var28 = arg7 - var24;
                        } else if (var24 > (arg7 - (1 - arg2))) {
                            var28 = var24 + 1 - arg2 - arg7;
                        }
                        int var29 = 0;
                        if (var25 < arg0) {
                            var29 = arg0 - var25;
                        } else if (var25 > (arg0 + arg4 - 1)) {
                            var29 = var25 + 1 - arg0 - arg4;
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var21 || var21 == var30 && var22 > class238.field3973[var26][var27]) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class238.field3973[var26][var27];
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg6 == var19 && arg14 == var20) {
            return 0;
        }
        byte var31 = 0;
        class303.field4790[var31] = var19;
        int var37 = var31 + 1;
        class354.field5453[var31] = var20;
        int var32;
        int var33 = var32 = class74.field939[var19 - var17][var20 - var18];
        while (arg6 != var19 || arg14 != var20) {
            if (var32 != var33) {
                class303.field4790[var37] = var19;
                var32 = var33;
                class354.field5453[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class74.field939[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while (var37-- > 0) {
            arg5[var34] = class303.field4790[var37];
            arg1[var34++] = class354.field5453[var37];
            if (var34 >= arg5.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
    public static void method2240(byte arg0) {
        if (arg0 > 27) {
            field5264 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
    public static final void method2241(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field5262++;
        class52 var1 = class142.field2250;
        synchronized (class142.field2250) {
            class142.field2250.method335((byte) 96);
        }
        class52 var2 = class287.field4601;
        synchronized (class287.field4601) {
            class287.field4601.method335((byte) 83);
        }
        class392 var3 = class110.field1528;
        synchronized (class110.field1528) {
            class110.field1528.method2473((byte) -53);
        }
    }
}
