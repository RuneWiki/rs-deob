import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class261 {

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "S")
    public static short field3796 = 256;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Lab;")
    public static class472 field3797 = null;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "Lok;")
    public static class166 field3793;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "[Lf;")
    public static class529[] field3789;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;IIIIIIB)V", line = 3)
    public static final void method1688(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3794++;
        class418 var8 = new class418();
        var8.field6246 = arg3;
        var8.field6242 = arg4;
        var8.field6245 = arg2;
        var8.field6249 = arg0;
        int var9 = -104 / ((67 - arg7) / 55);
        var8.field6248 = arg6;
        var8.field6243 = arg1;
        var8.field6244 = class531.field7821 + arg5;
        class343.field5157.method1636(9, var8);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZB)Ljava/lang/String;", line = 24)
    public static final String method1689(int arg0, int arg1, boolean arg2, byte arg3) {
        field3791++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg2 && arg1 >= 0) {
            int var4 = 2;
            if (arg3 != -71) {
                method1688(null, -2, 21, 50, -110, 42, 39, (byte) -31);
            }
            int var5 = arg1 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - (arg0 * arg1);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 74)
    public static void method1690(int arg0) {
        field3789 = null;
        field3797 = null;
        field3793 = null;
        if (arg0 != -11) {
            field3793 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V", line = 86)
    public static final void method1691(byte arg0) {
        field3790++;
        if (arg0 == 29) {
            class412.field6158.method215(class219.field3143, class97.field1620, class234.field3408);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)V", line = 103)
    public static final void method1692(int arg0, int arg1) {
        class377 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class35 var4 = class43.field829[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < field3792; var5++) {
                    for (int var6 = 0; var6 < class151.field2408; var6++) {
                        var2 = var4.method372(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class426.field6345;
                            int var8 = var5 << class426.field6345;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class35 var10 = class43.field829[var9];
                                if (var10 != null) {
                                    int var11 = var4.method376(var6, var5) - var10.method376(var6, var5);
                                    int var12 = var4.method376(var6 + 1, var5) - var10.method376(var6 + 1, var5);
                                    int var13 = var4.method376(var6 + 1, var5 + 1) - var10.method376(var6 + 1, var5 + 1);
                                    int var14 = var4.method376(var6, var5 + 1) - var10.method376(var6, var5 + 1);
                                    var10.method364(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I", line = 177)
    public static final int method1693(String arg0, int arg1, String arg2, int arg3) {
        field3795++;
        int var4 = arg2.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var8) < var4 || var5 > var7 - var9) {
            if (var4 <= (var6 - var8)) {
                return -1;
            }
            if (var7 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg2.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class374.method2329((byte) 82, var22);
            var9 = class374.method2329((byte) 82, var24);
            char var26 = class462.method2743(arg1, var22, -242);
            char var27 = class462.method2743(arg1, var24, -242);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class36.method380(arg1, (byte) 52, var28) - class36.method380(arg1, (byte) 114, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg1 == 2) {
                var16 = var5 - (var11 + 1);
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg2.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class36.method380(arg1, (byte) 111, var20) - class36.method380(arg1, (byte) 102, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        if (arg3 != 25911) {
            method1691((byte) 58);
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg2.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class36.method380(arg1, (byte) 50, var14) - class36.method380(arg1, (byte) 124, var15);
            }
        }
        return 0;
    }
}
