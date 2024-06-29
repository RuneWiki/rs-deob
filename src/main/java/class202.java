import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class202 {

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3104 = 0;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[I")
    public static int[] field3108;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "[S")
    public static short[] field3107;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 4)
    public static final void method1460(byte arg0) {
        field3110++;
        class307.field4788 = null;
        class308.field4805 = null;
        class103.field1513 = null;
        int var1 = 95 / ((-arg0 - 37) / 40);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIII)V", line = 23)
    public static final void method1461(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 != 3) {
            method1460((byte) 110);
        }
        if (arg0 == arg7 && arg8 == arg9 && arg1 == arg3 && arg5 == arg6) {
            class135.method1035(arg6, arg8, arg0, (byte) 117, arg2, arg1);
        } else {
            int var10 = arg0;
            int var11 = arg8;
            int var12 = arg8 * 3;
            int var13 = arg0 * 3;
            int var14 = arg9 * 3;
            int var15 = arg3 * 3;
            int var16 = arg7 * 3;
            int var17 = arg5 * 3;
            int var18 = arg1 + var16 - var15 - arg0;
            int var19 = var14 + arg6 - var17 - arg8;
            int var20 = var17 + var12 - var14 - var14;
            int var21 = var14 - var12;
            int var22 = var13 + var15 - var16 - var16;
            int var23 = var16 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var19 * var26;
                int var28 = var23 * var24;
                int var29 = var18 * var26;
                int var30 = var22 * var25;
                int var31 = var20 * var25;
                int var32 = arg0 + (var29 + var30 + var28 >> 12);
                int var33 = var21 * var24;
                int var34 = (var27 + var31 + var33 >> 12) + arg8;
                class135.method1035(var34, var11, var10, (byte) 118, arg2, var32);
                var10 = var32;
                var11 = var34;
            }
        }
        field3102++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 107)
    public static final String method1462(String arg0, int arg1) {
        field3105++;
        int var2 = arg0.length();
        byte var3 = 2;
        if (arg1 != 24) {
            field3104 = 5;
        }
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class5.method44(var6, 181);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(SIJIIILjava/lang/String;Ljava/lang/String;)V", line = 161)
    public static final void method1463(short arg0, int arg1, long arg2, int arg3, int arg4, int arg5, String arg6, String arg7) {
        field3106++;
        if (arg5 > -32) {
            method1462((String) null, -116);
        }
        if (class330.field5089 || class32.field393 >= 500) {
            return;
        }
        class204.field3122[class32.field393] = arg7;
        class311.field4832[class32.field393] = arg6;
        class336.field5229[class32.field393] = arg3 == -1 ? class38.field552 : arg3;
        class118.field1843[class32.field393] = arg0;
        class115.field1805[class32.field393] = arg2;
        class25.field290[class32.field393] = arg4;
        class323.field4993[class32.field393] = arg1;
        class32.field393++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILcm;BII)V", line = 186)
    public static final void method1464(int arg0, class332 arg1, byte arg2, int arg3, int arg4) {
        field3103++;
        if (class32.field393 >= 400) {
            return;
        }
        if (arg1.field5162 != null) {
            arg1 = arg1.method2324((byte) -119);
        }
        if (arg1 == null || !arg1.field5139) {
            return;
        }
        if (arg2 < 70) {
            method1462((String) null, -83);
        }
        String var5 = arg1.field5125;
        if (arg1.field5152 != 0) {
            String var6 = class248.field3754 == 1 ? class260.field4002 : class63.field835;
            var5 = var5 + class8.method83(class39.field575.field4203, arg1.field5152, (byte) -44) + " (" + var6 + arg1.field5152 + ")";
        }
        if (class320.field4939 == 1) {
            class223.field3408++;
            method1463((short) 19, arg3, (long) arg0, class314.field4864, arg4, -109, class170.field2757 + " -> <col=ffff00>" + var5, class201.field3092);
        } else if (class7.field110) {
            class21 var14 = class280.field4352 == -1 ? null : class111.method851(class280.field4352, 11);
            if ((class201.field3098 & 0x2) != 0 && (var14 == null || arg1.method2314(var14.field239, class280.field4352, (byte) 115) != var14.field239)) {
                class158.field2404++;
                method1463((short) 58, arg3, (long) arg0, class242.field3685, arg4, -46, class267.field4153 + " -> <col=ffff00>" + var5, class60.field794);
            }
        } else {
            class229.field3497++;
            String[] var7 = arg1.field5143;
            if (class341.field5299) {
                var7 = class245.method1686(var7, 2048);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (class248.field3754 != 0 || !var7[var8].equalsIgnoreCase(class293.field4521))) {
                        byte var9 = 0;
                        class284.field4427++;
                        if (var8 == 0) {
                            var9 = 12;
                        }
                        int var10 = -1;
                        if (var8 == 1) {
                            var9 = 24;
                        }
                        if (var8 == 2) {
                            var9 = 42;
                        }
                        if (var8 == 3) {
                            var9 = 39;
                        }
                        if (arg1.field5170 == var8) {
                            var10 = arg1.field5149;
                        }
                        if (var8 == 4) {
                            var9 = 8;
                        }
                        if (arg1.field5157 == var8) {
                            var10 = arg1.field5188;
                        }
                        method1463(var9, arg3, (long) arg0, var10, arg4, -126, "<col=ffff00>" + var5, var7[var8]);
                    }
                }
            }
            if (class248.field3754 == 0 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class293.field4521)) {
                        class101.field1458++;
                        short var12 = 0;
                        short var13 = 0;
                        if (class39.field575.field4203 < arg1.field5152) {
                            var12 = 2000;
                        }
                        if (var11 == 0) {
                            var13 = 12;
                        }
                        if (var11 == 1) {
                            var13 = 24;
                        }
                        if (var11 == 2) {
                            var13 = 42;
                        }
                        if (var11 == 3) {
                            var13 = 39;
                        }
                        if (var11 == 4) {
                            var13 = 8;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        method1463(var13, arg3, (long) arg0, arg1.field5183, arg4, -45, "<col=ffff00>" + var5, var7[var11]);
                    }
                }
            }
            method1463((short) 1004, arg3, (long) arg0, class283.field4410, arg4, -36, "<col=ffff00>" + var5, class133.field2032);
        }
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)V", line = 346)
    public static void method1465(byte arg0) {
        field3108 = null;
        if (arg0 == -109) {
            field3107 = null;
        }
    }
}
