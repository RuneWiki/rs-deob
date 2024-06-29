import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class211 extends class77 {

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "Lbm;")
    public class323 field3064;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "Z")
    public static boolean field3065 = false;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field3067 = 2;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)Z", line = 4)
    public static final boolean method1528(int arg0, int arg1) {
        field3066++;
        byte var2 = 0;
        byte var3 = 0;
        if (class109.field1574 == null) {
            if (class141.field2031 || class71.field1030 == null) {
                class109.field1574 = new class118(512, 512);
            } else {
                class109.field1574 = (class118) class71.field1030;
            }
            int[] var4 = class109.field1574.field1665;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < (104 - var2 - 1); var7++) {
                int var8 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var3 + 1; var9 < 104 - var3 - 1; var9++) {
                    if ((class230.field3491[arg1][var9][var7] & 0x18) == 0) {
                        class78.method636(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class230.field3491[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class78.method636(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class353.field5434 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class313.method2191(arg1, var3 + var10, var2 + var11);
                    if (var12 == 0L) {
                        var12 = class85.method693(arg1, var3 + var10, var2 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class62.method503(arg1, var3 + var10, var2 + var11);
                    }
                    if (var12 == 0L) {
                        var12 = class2.method14(arg1, var3 + var10, var2 + var11);
                    }
                    if (var12 != 0L) {
                        class261 var14 = class30.method212(0, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                        if (!var14.field3920 || class189.field2692) {
                            int var15 = var14.field3933;
                            if (var14.field3895 != null) {
                                for (int var16 = 0; var16 < var14.field3895.length; var16++) {
                                    if (var14.field3895[var16] != -1) {
                                        class261 var17 = class30.method212(0, var14.field3895[var16]);
                                        if (var17.field3933 >= 0) {
                                            var15 = var17.field3933;
                                        }
                                    }
                                }
                            }
                            if (var15 >= 0) {
                                boolean var18 = false;
                                class200 var19 = class349.method2447(var15, (byte) -9);
                                if (var19 != null && var19.field2907) {
                                    var18 = true;
                                }
                                int var20 = var2 + var11;
                                int var21 = var10 + var3;
                                if (var18) {
                                    int[][] var22 = class92.field1269[arg1].field1349;
                                    for (int var23 = 0; var23 < 10; var23++) {
                                        int var24 = (int) (Math.random() * 4.0D);
                                        if (var24 == 0 && var21 > 0 && (var10 - 3) < var21 && (var22[var21 - 1][var20] & 0x2C0108) == 0) {
                                            var21--;
                                        }
                                        if (var24 == 1 && var21 < 103 && (var10 + 3) > var21 && (var22[var21 + 1][var20] & 0x2C0180) == 0) {
                                            var21++;
                                        }
                                        if (var24 == 2 && var20 > 0 && var20 > (var11 - 3) && (var22[var21][var20 - 1] & 0x2C0102) == 0) {
                                            var20--;
                                        }
                                        if (var24 == 3 && var20 < 103 && var20 < (var11 + 3) && (var22[var21][var20 + 1] & 0x2C0120) == 0) {
                                            var20++;
                                        }
                                    }
                                }
                                class248.field3698[class353.field5434] = var14.field3977;
                                class278.field4230[class353.field5434] = var21 - var3;
                                class2.field72[class353.field5434] = var20 - var2;
                                class353.field5434++;
                            }
                        }
                    }
                }
            }
        }
        class109.field1574.method880();
        if (arg0 != 8221) {
            field3067 = 25;
        }
        int var25 = ((int) (Math.random() * 20.0D)) - (-238 - ((int) (Math.random() * 20.0D) + 238 - 10 << 8) - ((int) (Math.random() * 20.0D) + 228 << 16)) - 10;
        int var26 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var27 = 1; var27 < 103; var27++) {
            for (int var28 = 1; var28 < 103; var28++) {
                if ((class230.field3491[arg1][var28 + var3][var2 + var27] & 0x18) == 0 && !class236.method1759(var27, var25, var3, var2, var26, arg1, var28, 292)) {
                    if (class141.field2031) {
                        class44.field624 = null;
                    } else {
                        class356.field5460.method973(-27272);
                    }
                    return false;
                }
                if (arg1 < 3 && (class230.field3491[arg1 + 1][var3 + var28][var27 + var2] & 0x8) != 0 && !class236.method1759(var27, var25, var3, var2, var26, arg1 + 1, var28, 292)) {
                    if (class141.field2031) {
                        class44.field624 = null;
                    } else {
                        class356.field5460.method973(-27272);
                    }
                    return false;
                }
            }
        }
        if (class141.field2031) {
            int[] var29 = class109.field1574.field1665;
            int var30 = var29.length;
            for (int var31 = 0; var31 < var30; var31++) {
                if (var29[var31] == 0) {
                    var29[var31] = 1;
                }
            }
            class71.field1030 = new class325(class109.field1574);
        } else {
            class71.field1030 = class109.field1574;
        }
        if (class141.field2031) {
            class44.field624 = null;
        } else {
            class356.field5460.method973(-27272);
        }
        class109.field1574 = null;
        return true;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)Lgd;", line = 257)
    public static final class180 method1529(int arg0, int arg1, int arg2) {
        if (arg1 < 0 || arg1 >= class18.field295 || arg2 < 0 || arg2 >= class146.field2109) {
            return null;
        }
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        class180 var4 = null;
        int var5 = -1;
        int var6 = -1;
        for (int var7 = 0; var7 < var3.field2407; var7++) {
            class180 var8 = var3.field2406[var7];
            if ((var8.field2585 >> 29 & 0x3L) <= 1L && var8.field2590 == arg1 && var8.field2580 == arg2 && (var8.field2581 > var5 || var8.field2601 > var6)) {
                var4 = var8;
                var5 = var8.field2581;
                var6 = var8.field2601;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLjava/lang/String;)[B", line = 297)
    public static final byte[] method1530(byte arg0, String arg1) {
        field3063++;
        int var2 = arg1.length();
        byte[] var3 = new byte[var2];
        if (arg0 >= -51) {
            field3065 = true;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lbm;)V", line = 436)
    public class211(class323 arg0) {
        this.field3064 = arg0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I[Lqf;I)V", line = 447)
    public static final void method1531(int arg0, class359[] arg1, int arg2) {
        field3061++;
        if (arg0 != -1027) {
            field3065 = true;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class359 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field5554 == 0) {
                    if (var4.field5579 != null) {
                        method1531(-1027, var4.field5579, arg2);
                    }
                    class98 var5 = (class98) class288.field4360.method1405((long) var4.field5521, false);
                    if (var5 != null) {
                        class31.method217(-43, arg2, var5.field1393);
                    }
                }
                if (arg2 == 0 && var4.field5546 != null) {
                    class300 var6 = new class300();
                    var6.field4491 = var4;
                    var6.field4494 = var4.field5546;
                    class48.method412(var6, 200000);
                }
                if (arg2 == 1 && var4.field5616 != null) {
                    if (var4.field5620 >= 0) {
                        class359 var7 = class231.method1719(var4.field5521, 86);
                        if (var7 == null || var7.field5579 == null || var7.field5579.length <= var4.field5620 || var7.field5579[var4.field5620] != var4) {
                            continue;
                        }
                    }
                    class300 var8 = new class300();
                    var8.field4491 = var4;
                    var8.field4494 = var4.field5616;
                    class48.method412(var8, 200000);
                }
            }
        }
    }
}
