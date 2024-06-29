import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 {

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "[[I")
    public static int[][] field420 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Lwo;")
    public static class522 field422 = new class522();

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field426;

    static {
        new class83(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIII)V", line = 8)
    public static final void method191(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field421++;
        class64 var10 = null;
        for (class64 var11 = (class64) class114.field1552.method3072((byte) 12); var11 != null; var11 = (class64) class114.field1552.method3066(2)) {
            if (var11.field883 == arg2 && var11.field885 == arg6 && var11.field884 == arg8 && var11.field876 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class64();
            var10.field876 = arg7;
            var10.field885 = arg6;
            var10.field883 = arg2;
            var10.field884 = arg8;
            if (arg6 >= 0 && arg8 >= 0 && class442.field6435 > arg6 && class232.field3217 > arg8) {
                class59.method378(-21863, var10);
            }
            class114.field1552.method3070(var10, (byte) -128);
        }
        var10.field882 = arg4;
        var10.field873 = arg5;
        int var12 = -85 / ((27 - arg3) / 37);
        var10.field874 = arg0;
        var10.field881 = arg9;
        var10.field880 = arg1;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V", line = 52)
    public static void method192(boolean arg0) {
        if (arg0) {
            field422 = null;
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lvh;I)V", line = 66)
    public static final void method193(class240 arg0, int arg1) {
        field425++;
        class3.field34 = arg0;
        if (arg1 != 0) {
            method191(42, 70, 77, 80, 38, 42, 120, -22, 125, -67);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIII)V", line = 79)
    public static final void method194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field424++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = arg6;
        int var11 = arg5 - arg0;
        int var12 = arg2 - arg0;
        int var13 = arg5 * arg5;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
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
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        if (arg4 >= class343.field4727 && arg4 <= class54.field753) {
            int[] var38 = class225.field3174[arg4];
            int var39 = class497.method2935(class175.field2497, arg3 - arg5, class382.field5379, arg6 ^ 0xFFFFFF83);
            int var40 = class497.method2935(class175.field2497, arg3 + arg5, class382.field5379, -127);
            int var41 = class497.method2935(class175.field2497, arg3 - var11, class382.field5379, arg6 - 126);
            int var42 = class497.method2935(class175.field2497, arg3 + var11, class382.field5379, -127);
            class419.method2511(var38, var39, arg7, var41, arg6 ^ 0xFFFFFFF6);
            class419.method2511(var38, var41, arg1, var42, 82);
            class419.method2511(var38, var42, arg7, var40, 77);
        }
        int var43 = (var12 - 1) * var29;
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var33 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var43;
                var34 -= var29;
                var43 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var35 += var28;
                var31 += var28;
                var8++;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg4 - var9;
            int var46 = arg4 + var9;
            if (var46 >= class343.field4727 && var45 <= class54.field753) {
                int var47 = class497.method2935(class175.field2497, arg3 + var8, class382.field5379, -128);
                int var48 = class497.method2935(class175.field2497, arg3 - var8, class382.field5379, -126);
                if (var44) {
                    int var49 = class497.method2935(class175.field2497, arg3 + var10, class382.field5379, arg6 - 127);
                    int var50 = class497.method2935(class175.field2497, arg3 - var10, class382.field5379, -126);
                    if (class343.field4727 <= var45) {
                        int[] var51 = class225.field3174[var45];
                        class419.method2511(var51, var48, arg7, var50, 112);
                        class419.method2511(var51, var50, arg1, var49, 97);
                        class419.method2511(var51, var49, arg7, var47, arg6 ^ 0x4A);
                    }
                    if (class54.field753 >= var46) {
                        int[] var52 = class225.field3174[var46];
                        class419.method2511(var52, var48, arg7, var50, arg6 + 123);
                        class419.method2511(var52, var50, arg1, var49, arg6 - 105);
                        class419.method2511(var52, var49, arg7, var47, arg6 ^ 0x6F);
                    }
                } else {
                    if (var45 >= class343.field4727) {
                        class419.method2511(class225.field3174[var45], var48, arg7, var47, arg6 - 64);
                    }
                    if (var46 <= class54.field753) {
                        class419.method2511(class225.field3174[var46], var48, arg7, var47, 95);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lir;II)V", line = 281)
    public static final void method195(class22 arg0, int arg1, int arg2) {
        field419++;
        if (arg1 != 18878) {
            return;
        }
        int var3 = -1;
        int var4 = 0;
        if (class393.field5484 < arg0.field287) {
            class348.method1928(23458, arg0);
        } else if (class393.field5484 <= arg0.field304) {
            class412.method2457(false, arg0);
        } else {
            class112.method722(false, true, arg0);
            var3 = class9.field100;
            var4 = class102.field1403;
        }
        if (arg0.field466 < 128 || arg0.field461 < 128 || ((class442.field6435 - 1) * 128) <= arg0.field466 || arg0.field461 >= (class232.field3217 * 128 - 128)) {
            arg0.field304 = 0;
            var3 = -1;
            arg0.field303 = -1;
            arg0.field271 = -1;
            arg0.field324 = -1;
            var4 = 0;
            arg0.field287 = 0;
            arg0.field466 = arg0.field372[0] * 128 + (arg0.method167(-1) * 64);
            arg0.field461 = arg0.field362[0] * 128 + (arg0.method167(-1) * 64);
            arg0.method173((byte) 92);
        }
        if (class75.field1089 == arg0 && (arg0.field466 < 1536 || arg0.field461 < 1536 || (class442.field6435 - 12) * 128 <= arg0.field466 || arg0.field461 >= class232.field3217 * 128 - 1536)) {
            arg0.field303 = -1;
            var4 = 0;
            var3 = -1;
            arg0.field324 = -1;
            arg0.field271 = -1;
            arg0.field304 = 0;
            arg0.field287 = 0;
            arg0.field466 = arg0.field372[0] * 128 + arg0.method167(-1) * 64;
            arg0.field461 = arg0.field362[0] * 128 + arg0.method167(-1) * 64;
            arg0.method173((byte) 61);
        }
        int var5 = class106.method691(arg0, (byte) -122);
        class53.method329(var4, (byte) -117, arg0, var3, var5);
        class84.method594(true, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V", line = 348)
    public static final void method196(int arg0, int arg1) {
        class279.field3768 = arg0;
        field426++;
        if (arg1 != 8230) {
            method194(52, -64, 18, 96, -76, -91, 79, -96);
        }
        class52.field706 = 100;
        class210.field2971 = -1;
        class319.field4418 = 3;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLjava/awt/Component;)Loo;", line = 363)
    public static final class441 method197(boolean arg0, Component arg1) {
        field423++;
        if (!arg0) {
            method197(true, null);
        }
        return new class196(arg1);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[BLjava/lang/String;IIB)I", line = 379)
    public static final int method198(int arg0, byte[] arg1, String arg2, int arg3, int arg4, byte arg5) {
        field418++;
        int var6 = arg3 - arg0;
        if (arg5 > -26) {
            method192(false);
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg2.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg4 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg4 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg4 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg4 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg4 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg4 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg4 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg4 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg4 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg4 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg4 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg4 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg4 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg4 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg4 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg4 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg4 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg4 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg4 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg4 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg4 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg4 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg4 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg4 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg4 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg4 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg4 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg4 + var7] = -97;
            } else {
                arg1[arg4 + var7] = 63;
            }
        }
        return var6;
    }
}
