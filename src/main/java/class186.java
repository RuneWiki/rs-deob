import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class186 extends class125 {

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "S")
    public short field3511 = -32768;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Loe;")
    public static class139 field3510 = new class139(30);

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "Ljd;")
    private static class92 field3514 = class202.method1325((byte) 90, "Loaded config");

    @OriginalMember(owner = "client!tg", name = "J", descriptor = "Ljd;")
    public static class92 field3517 = field3514;

    @OriginalMember(owner = "client!tg", name = "I", descriptor = "I")
    public static int field3516 = 1;

    @OriginalMember(owner = "client!tg", name = "K", descriptor = "Ljd;")
    public static class92 field3518 = class202.method1325((byte) 90, "Ung-Ultiges Anmelde)2Paket)3");

    @OriginalMember(owner = "client!tg", name = "H", descriptor = "Ljd;")
    public static class92 field3515 = class202.method1325((byte) 90, "<col=00ff00>");

    @OriginalMember(owner = "client!tg", name = "L", descriptor = "Loe;")
    public static class139 field3519 = new class139(64);

    @OriginalMember(owner = "client!tg", name = "M", descriptor = "[I")
    public static int[] field3520 = new int[500];

    @OriginalMember(owner = "client!tg", name = "N", descriptor = "Ljd;")
    public static class92 field3521 = class202.method1325((byte) 90, "; Expires=");

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "Lnh;")
    public static class133 field3512;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "(I)Ldg;")
    public class38 method221(int arg0) {
        if (arg0 > -51) {
            field3514 = null;
        }
        field3508++;
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3509++;
        class38 var11 = this.method221(-62);
        if (var11 != null) {
            var11.method600(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3511 = var11.field3511;
        }
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
    public static void method1205(byte arg0) {
        field3510 = null;
        field3519 = null;
        field3515 = null;
        field3514 = null;
        field3518 = null;
        field3512 = null;
        field3520 = null;
        int var1 = -60 / ((8 - arg0) / 62);
        field3517 = null;
        field3521 = null;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIBIIIZIIIII)Z")
    public static final boolean method1206(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var37 = 0; var37 < 104; var37++) {
                class176.field3398[var12][var37] = 0;
                class148.field2937[var12][var37] = 99999999;
            }
        }
        class176.field3398[arg0][arg3] = 99;
        class148.field2937[arg0][arg3] = 0;
        field3507++;
        int var13 = arg3;
        byte var14 = 0;
        class180.field3448[var14] = arg0;
        int var38 = var14 + 1;
        class97.field1943[var14] = arg3;
        int var15 = arg0;
        int var16 = 0;
        int var17 = class180.field3448.length;
        boolean var18 = false;
        int[][] var19 = class32.field729[class81.field1639].field2373;
        while (var38 != var16) {
            var15 = class180.field3448[var16];
            var13 = class97.field1943[var16];
            var16 = (var16 + 1) % var17;
            if (arg4 == var15 && arg10 == var13) {
                var18 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class32.field729[class81.field1639].method802(arg9 - 1, arg10, var15, arg1, arg4, (byte) 59, var13)) {
                    var18 = true;
                    break;
                }
                if (arg9 < 10 && class32.field729[class81.field1639].method803(arg4, arg9 - 1, -70, var15, var13, arg10, arg1)) {
                    var18 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg5 != 0 && class32.field729[class81.field1639].method793(arg4, arg10, -1, var15, arg8, arg7, arg5, var13)) {
                var18 = true;
                break;
            }
            int var36 = class148.field2937[var15][var13] + 1;
            if (var15 > 0 && class176.field3398[var15 - 1][var13] == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0) {
                class180.field3448[var38] = var15 - 1;
                class97.field1943[var38] = var13;
                class176.field3398[var15 - 1][var13] = 2;
                var38 = (var38 + 1) % var17;
                class148.field2937[var15 - 1][var13] = var36;
            }
            if (var15 < 103 && class176.field3398[var15 + 1][var13] == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0) {
                class180.field3448[var38] = var15 + 1;
                class97.field1943[var38] = var13;
                var38 = (var38 + 1) % var17;
                class176.field3398[var15 + 1][var13] = 8;
                class148.field2937[var15 + 1][var13] = var36;
            }
            if (var13 > 0 && class176.field3398[var15][var13 - 1] == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class180.field3448[var38] = var15;
                class97.field1943[var38] = var13 - 1;
                var38 = (var38 + 1) % var17;
                class176.field3398[var15][var13 - 1] = 1;
                class148.field2937[var15][var13 - 1] = var36;
            }
            if (var13 < 103 && class176.field3398[var15][var13 + 1] == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class180.field3448[var38] = var15;
                class97.field1943[var38] = var13 + 1;
                var38 = (var38 + 1) % var17;
                class176.field3398[var15][var13 + 1] = 4;
                class148.field2937[var15][var13 + 1] = var36;
            }
            if (var15 > 0 && var13 > 0 && class176.field3398[var15 - 1][var13 - 1] == 0 && (var19[var15 - 1][var13 - 1] & 0x12C010E) == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class180.field3448[var38] = var15 - 1;
                class97.field1943[var38] = var13 - 1;
                class176.field3398[var15 - 1][var13 - 1] = 3;
                var38 = (var38 + 1) % var17;
                class148.field2937[var15 - 1][var13 - 1] = var36;
            }
            if (var15 < 103 && var13 > 0 && class176.field3398[var15 + 1][var13 - 1] == 0 && (var19[var15 + 1][var13 - 1] & 0x12C0183) == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0 && (var19[var15][var13 - 1] & 0x12C0102) == 0) {
                class180.field3448[var38] = var15 + 1;
                class97.field1943[var38] = var13 - 1;
                class176.field3398[var15 + 1][var13 - 1] = 9;
                class148.field2937[var15 + 1][var13 - 1] = var36;
                var38 = (var38 + 1) % var17;
            }
            if (var15 > 0 && var13 < 103 && class176.field3398[var15 - 1][var13 + 1] == 0 && (var19[var15 - 1][var13 + 1] & 0x12C0138) == 0 && (var19[var15 - 1][var13] & 0x12C0108) == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class180.field3448[var38] = var15 - 1;
                class97.field1943[var38] = var13 + 1;
                var38 = (var38 + 1) % var17;
                class176.field3398[var15 - 1][var13 + 1] = 6;
                class148.field2937[var15 - 1][var13 + 1] = var36;
            }
            if (var15 < 103 && var13 < 103 && class176.field3398[var15 + 1][var13 + 1] == 0 && (var19[var15 + 1][var13 + 1] & 0x12C01E0) == 0 && (var19[var15 + 1][var13] & 0x12C0180) == 0 && (var19[var15][var13 + 1] & 0x12C0120) == 0) {
                class180.field3448[var38] = var15 + 1;
                class97.field1943[var38] = var13 + 1;
                var38 = (var38 + 1) % var17;
                class176.field3398[var15 + 1][var13 + 1] = 12;
                class148.field2937[var15 + 1][var13 + 1] = var36;
            }
        }
        class111.field2270 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var20 = 1000;
            int var21 = 100;
            byte var22 = 10;
            for (int var23 = arg4 - var22; var23 <= arg4 + var22; var23++) {
                for (int var24 = arg10 - var22; var24 <= arg10 + var22; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class148.field2937[var23][var24] < 100) {
                        int var25 = 0;
                        int var26 = 0;
                        if (var24 < arg10) {
                            var26 = arg10 - var24;
                        } else if (arg10 + arg5 - 1 < var24) {
                            var26 = var24 + 1 - arg5 - arg10;
                        }
                        if (arg4 > var23) {
                            var25 = arg4 - var23;
                        } else if (var23 > arg4 + arg7 - 1) {
                            var25 = var23 + 1 - arg4 - arg7;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var27 < var20 || var20 == var27 && class148.field2937[var23][var24] < var21) {
                            var20 = var27;
                            var21 = class148.field2937[var23][var24];
                            var15 = var23;
                            var13 = var24;
                        }
                    }
                }
            }
            if (var20 == 1000) {
                return false;
            }
            if (arg0 == var15 && arg3 == var13) {
                return false;
            }
            class111.field2270 = 1;
        }
        byte var28 = 0;
        int var29 = 43 % ((arg2 - 70) / 55);
        class180.field3448[var28] = var15;
        int var39 = var28 + 1;
        class97.field1943[var28] = var13;
        int var30;
        int var31 = var30 = class176.field3398[var15][var13];
        while (arg0 != var15 || arg3 != var13) {
            if (var30 != var31) {
                class180.field3448[var39] = var15;
                var30 = var31;
                class97.field1943[var39++] = var13;
            }
            if ((var31 & 0x2) != 0) {
                var15++;
            } else if ((var31 & 0x8) != 0) {
                var15--;
            }
            if ((var31 & 0x1) != 0) {
                var13++;
            } else if ((var31 & 0x4) != 0) {
                var13--;
            }
            var31 = class176.field3398[var15][var13];
        }
        if (var39 > 0) {
            int var32 = var39;
            if (var39 > 25) {
                var32 = 25;
            }
            var39--;
            int var33 = class97.field1943[var39];
            int var34 = class180.field3448[var39];
            if (arg11 == 0) {
                class99.field2000.method405(183, 7);
                class30.field655++;
                class99.field2000.method428(var32 + var32 + 3, 117);
            }
            if (arg11 == 1) {
                class99.field2000.method405(126, 7);
                class33.field744++;
                class99.field2000.method428(var32 + var32 + 17, 122);
            }
            if (arg11 == 2) {
                class99.field2000.method405(39, 7);
                class99.field2000.method428(var32 + var32 + 3, 123);
                class214.field4176++;
            }
            class99.field2000.method450(class210.field4077 + var33, (byte) -69);
            class99.field2000.method412(class16.field445[82] ? 1 : 0, (byte) 112);
            class4.field262 = class180.field3448[0];
            class193.field3765 = class97.field1943[0];
            for (int var35 = 1; var35 < var32; var35++) {
                var39--;
                class99.field2000.method427(class180.field3448[var39] - var34, (byte) 115);
                class99.field2000.method427(class97.field1943[var39] - var33, (byte) 123);
            }
            class99.field2000.method464(1361896040, class115.field2343 + var34);
            return true;
        } else if (arg11 == 1) {
            return false;
        } else {
            return true;
        }
    }
}
