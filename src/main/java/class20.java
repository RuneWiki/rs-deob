import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class20 extends class106 {

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "[I")
    public static int[] field206 = new int[14];

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field208 = "Loaded client variable data";

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "I")
    public static int field209 = 0;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method136(byte arg0) {
        field208 = null;
        field206 = null;
        if (arg0 != 0) {
            method136((byte) 45);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II[Ljf;IIZ)V")
    public static final void method137(int arg0, int arg1, class119[] arg2, int arg3, int arg4, boolean arg5) {
        for (int var6 = arg0; var6 < arg2.length; var6++) {
            class119 var7 = arg2[var6];
            if (var7 != null && var7.field1529 == arg4) {
                class379.method2412(var7, arg1, arg5, arg3, arg0 - 1);
                class443.method2745(var7, (byte) -22, arg1, arg3);
                if (var7.field1501 > (var7.field1578 - var7.field1552)) {
                    var7.field1501 = var7.field1578 - var7.field1552;
                }
                if (var7.field1593 - var7.field1498 < var7.field1467) {
                    var7.field1467 = var7.field1593 - var7.field1498;
                }
                if (var7.field1501 < 0) {
                    var7.field1501 = 0;
                }
                if (var7.field1467 < 0) {
                    var7.field1467 = 0;
                }
                if (var7.field1535 == 0) {
                    class433.method2686(arg5, var7, 0);
                }
            }
        }
        field210++;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII)V")
    public static final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field205++;
        int var6 = arg4 - arg3;
        int var7 = arg2 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class351.method2240(arg5, -126, arg4, arg3, arg1);
            }
        } else if (var6 == 0) {
            class326.method2008(arg3, (byte) -70, arg5, arg1, arg2);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg1;
                int var10 = arg2;
                arg1 = arg3;
                arg2 = arg4;
                arg3 = var9;
                arg4 = var10;
            }
            if (arg2 < arg1) {
                int var11 = arg1;
                int var12 = arg3;
                arg1 = arg2;
                arg3 = arg4;
                arg2 = var11;
                arg4 = var12;
            }
            int var13 = arg3;
            int var14 = arg2 - arg1;
            if (arg0 <= -43) {
                int var15 = arg4 - arg3;
                int var16 = -(var14 >> 1);
                int var17 = arg4 > arg3 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var18 = arg1; var18 <= arg2; var18++) {
                        class318.field4522[var18][var13] = arg5;
                        var16 += var15;
                        if (var16 > 0) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg1; var19 <= arg2; var19++) {
                        var16 += var15;
                        class318.field4522[var13][var19] = arg5;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;")
    public static final String method139(byte arg0, String arg1) {
        field211++;
        int var2 = arg1.length();
        char[] var3 = new char[var2];
        if (arg0 != -41) {
            method137(80, 42, (class119[]) null, -39, -77, false);
        }
        byte var4 = 2;
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var4 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var4 == 2 || Character.isUpperCase(var6)) {
                var6 = class420.method2607(var6, -59);
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
}
