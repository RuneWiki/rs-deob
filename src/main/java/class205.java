import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class205 {

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field2820 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lkn;")
    public static class442 field2818 = new class442("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Lec;")
    public static class129 field2825 = new class129(32);

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Z")
    public static boolean field2826 = false;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static void method1330(int arg0) {
        if (arg0 == -18651) {
            field2825 = null;
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2821++;
        int var8 = 0;
        int var9 = arg3;
        int var10 = 0;
        int var11 = arg5 - arg1;
        int var12 = arg3 - arg1;
        int var13 = arg5 * arg5;
        int var14 = arg3 * arg3;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - arg0) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg3 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        int[] var39 = class296.field4138[arg6];
        class295.method1924(arg0 ^ 0x323231, var39, arg2 - var11, arg4, arg2 - arg5);
        class295.method1924(arg0 + 3289647, var39, arg2 + var11, arg7, arg2 - var11);
        class295.method1924(3289650, var39, arg2 + arg5, arg4, arg2 + var11);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var10++;
                        var33 += var30;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var25 += -var38;
                var26 += -var34;
                var34 -= var29;
                var38 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var36 -= var27;
            var32 -= var27;
            var9--;
            int var41 = arg6 - var9;
            int var42 = arg6 + var9;
            int var43 = arg2 + var8;
            int var44 = arg2 - var8;
            if (var40) {
                int var45 = arg2 + var10;
                int var46 = arg2 - var10;
                class295.method1924(3289650, class296.field4138[var41], var46, arg4, var44);
                class295.method1924(3289650, class296.field4138[var41], var45, arg7, var46);
                class295.method1924(3289650, class296.field4138[var41], var43, arg4, var45);
                class295.method1924(3289650, class296.field4138[var42], var46, arg4, var44);
                class295.method1924(3289650, class296.field4138[var42], var45, arg7, var46);
                class295.method1924(3289650, class296.field4138[var42], var43, arg4, var45);
            } else {
                class295.method1924(arg0 ^ 0x323231, class296.field4138[var41], var43, arg4, var44);
                class295.method1924(3289650, class296.field4138[var42], var43, arg4, var44);
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;BZ)I")
    public static final int method1332(int arg0, String arg1, byte arg2, boolean arg3) {
        field2817++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg1.length();
        int var8 = 0;
        if (arg2 != -10) {
            field2818 = null;
        }
        while (var7 > var8) {
            label85: {
                char var9 = arg1.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        break label85;
                    }
                    if (var9 == '+' && arg3) {
                        break label85;
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
                if (var11 >= arg0) {
                    throw new NumberFormatException();
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg0 * var6 + var11;
                if (var10 / arg0 != var6) {
                    throw new NumberFormatException();
                }
                var6 = var10;
                var5 = true;
            }
            var8++;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)Lgs;")
    public static final class29 method1333(int arg0, int arg1) {
        field2819++;
        class131 var2 = class73.field1045;
        class29 var3;
        synchronized (class73.field1045) {
            var3 = (class29) class73.field1045.method904(false, (long) arg0);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class19.field341.method1745(arg0, (byte) 74, 16);
        if (arg1 != -1) {
            method1330(118);
        }
        class29 var5 = new class29();
        if (var4 != null) {
            var5.method308(new class11(var4), (byte) -99);
        }
        class131 var6 = class73.field1045;
        synchronized (class73.field1045) {
            class73.field1045.method902((long) arg0, (byte) 112, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method1334(String arg0, byte arg1) {
        class41.method378(0, "", 0, "", arg0, (byte) -31);
        if (arg1 <= 45) {
            field2823 = 27;
        }
        field2822++;
    }
}
