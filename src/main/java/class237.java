import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class237 {

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "Z")
    public static boolean field3921 = false;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3923 = 0;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3924 = -1;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "F")
    public static float field3920;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3919;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIZIIIIIIII)V", line = 5)
    public static final void method1814(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3925++;
        for (int var11 = 0; var11 < 104; var11++) {
            for (int var12 = 0; var12 < 104; var12++) {
                class172.field2748[var11][var12] = 0;
                class332.field5270[var11][var12] = 99999999;
            }
        }
        class172.field2748[arg4][arg1] = 99;
        class332.field5270[arg4][arg1] = 0;
        int var13 = arg4;
        if (arg3 != 1) {
            return;
        }
        byte var14 = 0;
        class52.field881[var14] = arg4;
        int var15 = arg1;
        int var28 = var14 + 1;
        class204.field3224[var14] = arg1;
        int var16 = 0;
        int[][] var17 = class32.field459[class186.field2991].field266;
        boolean var18 = false;
        while (var28 != var16) {
            var15 = class204.field3224[var16];
            var13 = class52.field881[var16];
            var16 = var16 + 1 & 0xFFF;
            if (arg8 == var13 && arg6 == var15) {
                var18 = true;
                break;
            }
            if (arg0 != 0) {
                if ((arg0 < 5 || arg0 == 10) && class32.field459[class186.field2991].method146(arg6, arg0 - 1, 1, arg8, arg9, var15, var13, (byte) 74)) {
                    var18 = true;
                    break;
                }
                if (arg0 < 10 && class32.field459[class186.field2991].method145(arg8, arg6, arg0 - 1, var13, arg3 ^ 0x1, var15, arg9, 1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg5 != 0 && arg7 != 0 && class32.field459[class186.field2991].method144(arg7, arg8, var13, arg3 ^ 0x7DD4, arg6, arg5, 1, arg10, var15)) {
                var18 = true;
                break;
            }
            int var19 = class332.field5270[var13][var15] + 1;
            if (var13 > 0 && class172.field2748[var13 - 1][var15] == 0 && (var17[var13 - 1][var15] & 0x2C0108) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var15;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 - 1][var15] = 2;
                class332.field5270[var13 - 1][var15] = var19;
            }
            if (var13 < 103 && class172.field2748[var13 + 1][var15] == 0 && (var17[var13 + 1][var15] & 0x2C0180) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var15;
                class172.field2748[var13 + 1][var15] = 8;
                var28 = var28 + 1 & 0xFFF;
                class332.field5270[var13 + 1][var15] = var19;
            }
            if (var15 > 0 && class172.field2748[var13][var15 - 1] == 0 && (var17[var13][var15 - 1] & 0x2C0102) == 0) {
                class52.field881[var28] = var13;
                class204.field3224[var28] = var15 - 1;
                class172.field2748[var13][var15 - 1] = 1;
                class332.field5270[var13][var15 - 1] = var19;
                var28 = var28 + 1 & 0xFFF;
            }
            if (var15 < 103 && class172.field2748[var13][var15 + 1] == 0 && (var17[var13][var15 + 1] & 0x2C0120) == 0) {
                class52.field881[var28] = var13;
                class204.field3224[var28] = var15 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13][var15 + 1] = 4;
                class332.field5270[var13][var15 + 1] = var19;
            }
            if (var13 > 0 && var15 > 0 && class172.field2748[var13 - 1][var15 - 1] == 0 && (var17[var13 - 1][var15 - 1] & 0x2C010E) == 0 && (var17[var13 - 1][var15] & 0x2C0108) == 0 && (var17[var13][var15 - 1] & 0x2C0102) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var15 - 1;
                class172.field2748[var13 - 1][var15 - 1] = 3;
                var28 = var28 + 1 & 0xFFF;
                class332.field5270[var13 - 1][var15 - 1] = var19;
            }
            if (var13 < 103 && var15 > 0 && class172.field2748[var13 + 1][var15 - 1] == 0 && (var17[var13 + 1][var15 - 1] & 0x2C0183) == 0 && (var17[var13 + 1][var15] & 0x2C0180) == 0 && (var17[var13][var15 - 1] & 0x2C0102) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var15 - 1;
                class172.field2748[var13 + 1][var15 - 1] = 9;
                var28 = var28 + 1 & 0xFFF;
                class332.field5270[var13 + 1][var15 - 1] = var19;
            }
            if (var13 > 0 && var15 < 103 && class172.field2748[var13 - 1][var15 + 1] == 0 && (var17[var13 - 1][var15 + 1] & 0x2C0138) == 0 && (var17[var13 - 1][var15] & 0x2C0108) == 0 && (var17[var13][var15 + 1] & 0x2C0120) == 0) {
                class52.field881[var28] = var13 - 1;
                class204.field3224[var28] = var15 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 - 1][var15 + 1] = 6;
                class332.field5270[var13 - 1][var15 + 1] = var19;
            }
            if (var13 < 103 && var15 < 103 && class172.field2748[var13 + 1][var15 + 1] == 0 && (var17[var13 + 1][var15 + 1] & 0x2C01E0) == 0 && (var17[var13 + 1][var15] & 0x2C0180) == 0 && (var17[var13][var15 + 1] & 0x2C0120) == 0) {
                class52.field881[var28] = var13 + 1;
                class204.field3224[var28] = var15 + 1;
                var28 = var28 + 1 & 0xFFF;
                class172.field2748[var13 + 1][var15 + 1] = 12;
                class332.field5270[var13 + 1][var15 + 1] = var19;
            }
        }
        if (!var18) {
            if (!arg2) {
                return;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg8 - var22; var23 <= arg8 + var22; var23++) {
                for (int var24 = arg6 - var22; var24 <= (arg6 + var22); var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class332.field5270[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg6 > var24) {
                            var25 = arg6 - var24;
                        } else if ((arg7 + arg6 - 1) < var24) {
                            var25 = var24 + 1 - arg6 - arg7;
                        }
                        int var26 = 0;
                        if (arg8 > var23) {
                            var26 = arg8 - var23;
                        } else if ((arg8 + arg5 - 1) < var23) {
                            var26 = var23 + 1 - arg8 - arg5;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var20 > var27 || var20 == var27 && var21 > class332.field5270[var23][var24]) {
                            var15 = var24;
                            var21 = class332.field5270[var23][var24];
                            var20 = var27;
                            var13 = var23;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return;
            }
            if (arg4 == var13 && arg1 == var15) {
                return;
            }
        }
        class241.field3988 = var13;
        class326.field5182 = false;
        class335.field5305 = var15;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLhb;B)V", line = 246)
    public static final void method1815(boolean arg0, class259 arg1, byte arg2) {
        if (arg2 != 57) {
            return;
        }
        field3919++;
        int var3 = arg1.field4358;
        int var4 = (int) arg1.field698;
        arg1.method330(15);
        if (arg0) {
            class257.method1974(var3, (byte) 111);
        }
        class103.method796((byte) -96, var3);
        class250 var5 = class13.method74(-96, var4);
        if (var5 != null) {
            class205.method1568(var5, (byte) 121);
        }
        int var6 = class104.field1683;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class264.method2009(109, class51.field810[var7])) {
                class54.method428(arg2 - 57, var7);
            }
        }
        if (class104.field1683 == 1) {
            class358.field5687 = false;
            class56.method441(class259.field4361, -92, class178.field2858, class92.field1556, class24.field289);
        } else {
            class56.method441(class259.field4361, -103, class178.field2858, class92.field1556, class24.field289);
            int var8 = class109.field1792.method1338(class209.field3284);
            for (int var9 = 0; var9 < class104.field1683; var9++) {
                int var10 = class109.field1792.method1338(class6.method23(arg2 + 15, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class24.field289 = (class253.field4271 ? 26 : 22) + class104.field1683 * 15;
            class92.field1556 = var8 + 8;
        }
        if (class304.field4870 != -1) {
            class32.method221(class304.field4870, -32471, 1);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[B)V")
    public abstract void method1137(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1136(int arg0);
}
