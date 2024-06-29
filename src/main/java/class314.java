import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class314 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "Z")
    public static boolean field4071 = true;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field4072;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field4074;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field4075;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IB)Lhm;")
    public static final class216 method1831(int arg0, byte arg1) {
        if (arg1 != -96) {
            method1831(-47, (byte) -21);
        }
        field4072++;
        class216 var2 = (class216) class486.field6470.method3655(arg1 + 138, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class603.field8117.method3346(arg1 ^ 0x5F, 0, arg0);
        class216 var4 = new class216();
        if (var3 != null) {
            var4.method1382(new class418(var3), true);
        }
        var4.method1381((byte) 36);
        class486.field6470.method3650((long) arg0, -109, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1832(int arg0, int arg1, boolean arg2) {
        field4074++;
        if (!class431.method2470(arg1, arg0, 1059)) {
            return false;
        } else if (arg2) {
            return (arg1 & 0x9000) != 0 | class491.method2684(arg0, (byte) 5, arg1) | class420.method2422(!arg2, arg1, arg0) ? true : (arg0 & 0x37) == 0 & (class216.method1380(arg0, arg2, arg1) | (arg1 & 0x2000) != 0 | class59.method505(arg0, !arg2, arg1));
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BLoa;I)Z")
    public static final boolean method1833(byte arg0, class43 arg1, int arg2) {
        field4070++;
        int var3 = (class611.field8258 - 104) / 2;
        int var4 = (class656.field9155 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg2; var58 <= 3; var58++) {
                    if (class133.method969(var58, arg2, 122, var57, var6)) {
                        int var59 = var58;
                        if (class589.method3215(var6, (byte) -52, var57)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class254.method1604(true, var57, var6, var59);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        if (arg0 != -22) {
            field4071 = false;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class667.field9255 = arg1.method381(var7, 0, 512, 512, 512);
        class195.method1286(-16608);
        int var9 = ((int) (Math.random() * 20.0D)) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (-10 + (int) (Math.random() * 20.0D) + 238 << 16) + 238 - 10 | 0xFF000000;
        int var10 = (238 - (10 - ((int) (Math.random() * 20.0D))) | 0x79C4FF00) << 16;
        int var11 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class628.field8773 + 1][class628.field8773 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class628.field8773) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class628.field8773) {
                int var37 = 0;
                int var38 = 0;
                int var39 = var13;
                if (var13 > 0) {
                    var39 = var13 - 1;
                    var37 += 4;
                }
                int var40 = var36;
                if (var36 > 0) {
                    var40 = var36 - 1;
                }
                int var41 = var13 + class628.field8773;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class628.field8773 + var36;
                if (var42 < 104) {
                    var42++;
                    var38 += 4;
                }
                arg1.method376(0, 0, class628.field8773 * 4 + var37, class628.field8773 * 4 + var38);
                arg1.method162(-16777216);
                for (int var43 = arg2; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class628.field8773; var50++) {
                        for (int var56 = 0; var56 <= class628.field8773; var56++) {
                            var12[var50][var56] = class133.method969(var43, arg2, class392.method2234(arg0, -65), var40 + var56, var39 + var50);
                        }
                    }
                    class353.field4540[var43].method670(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class366.field4726) {
                        for (int var51 = -4; var51 < class628.field8773; var51++) {
                            for (int var52 = -4; var52 < class628.field8773; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var3 <= var53 && var54 >= var4 && class133.method969(var43, arg2, 126, var54, var53)) {
                                    int var55 = var43;
                                    if (class589.method3215(var53, (byte) -52, var54)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        class289.method1722(false, arg1, var51 * 4 + var37, var9, (class628.field8773 - var52) * 4 + var38 - 4, var10, var54, var55, var53);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class366.field4726) {
                    class36 var44 = class703.field9806[arg2];
                    for (int var45 = 0; var45 < class628.field8773; var45++) {
                        for (int var46 = 0; var46 < class628.field8773; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field530[var47 - var44.field523][var48 - var44.field519];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method400(-1713569622, var37 + (var45 * 4), 4, (byte) 101, 4, (class628.field8773 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method331((class628.field8773 - var46) * 4 + var38 - 4, 1, 4, -1713569622, var37 + (var45 * 4));
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method372(4, 1, -1713569622, (class628.field8773 - var46) * 4 + var38 - 4, var45 * 4 + var37 + 3);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method331((class628.field8773 - var46) * 4 + (var38 + 3 - 4), 1, 4, -1713569622, var45 * 4 + var37);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method372(4, 1, -1713569622, var38 + ((class628.field8773 - var46) * 4) - 4, var45 * 4 + var37);
                            }
                        }
                    }
                }
                arg1.method353(var37, var38, class628.field8773 * 4, class628.field8773 * 4, var11, 2);
                class667.field9255.method603((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + -(class628.field8773 * 4) + 464, class628.field8773 * 4, class628.field8773 * 4, var37, var38);
            }
        }
        arg1.method396();
        arg1.method162(-16777215);
        class211.method1355(arg0 - 21762);
        class542.field7042 = 0;
        class223.field2911.method2085((byte) 9);
        if (!class366.field4726) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < var4 + 104; var20++) {
                    for (int var21 = arg2; var21 <= arg2 + 1 && var21 <= 3; var21++) {
                        if (class133.method969(var21, arg2, 125, var20, var14)) {
                            class620 var22 = (class620) class377.method2155(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class620) class47.method432(var21, var14, var20, field4075 == null ? (field4075 = method1834("ut")) : field4075);
                            }
                            if (var22 == null) {
                                var22 = (class620) class549.method2909(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class620) class186.method1237(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class698 var23 = class348.field4436.method1900(76, var22.method76((byte) -109));
                                if (!var23.field9611 || class454.field5922) {
                                    int var24 = var23.field9681;
                                    if (var23.field9630 != null) {
                                        for (int var25 = 0; var25 < var23.field9630.length; var25++) {
                                            if (var23.field9630[var25] != -1) {
                                                class698 var26 = class348.field4436.method1900(arg0 - 102, var23.field9630[var25]);
                                                if (var26.field9681 >= 0) {
                                                    var24 = var26.field9681;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class576 var28 = class650.field9060.method2291((byte) 118, var24);
                                            if (var28 != null && var28.field7820) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class703.field9806[var21].field530;
                                            int var32 = class703.field9806[var21].field523;
                                            int var33 = class703.field9806[var21].field519;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 103 && var29 < var14 + 3 && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var20 - 3 < var30 && (var31[var29 - var32][var30 - (var33 + 1)] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && (var4 + 104 - 1) > var30 && (var20 + 3) > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class696.field9530[class542.field7042] = var23.field9625;
                                        class72.field981[class542.field7042] = var29;
                                        class559.field7302[class542.field7042] = var30;
                                        class542.field7042++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class155.field1966 != null) {
                class262.field3517.field8306 = 1;
                class650.field9060.method2292(arg0 ^ 0x67, 64, 1024);
                for (int var15 = 0; var15 < class155.field1966.field9164; var15++) {
                    int var16 = class155.field1966.field9165[var15];
                    if (var16 >> 28 == class233.field3130.field508) {
                        int var17 = (var16 >> 14 & 0x3FFF) - class100.field1326;
                        int var18 = (var16 & 0x3FFF) - class186.field2376;
                        if (var17 >= 0 && class611.field8258 > var17 && var18 >= 0 && class656.field9155 > var18) {
                            class223.field2911.method2087(new class195(var15), arg0 + 64);
                        } else {
                            class576 var19 = class650.field9060.method2291((byte) 127, class155.field1966.field9162[var15]);
                            if (var19.field7805 != null && var19.field7829 + var17 >= 0 && class611.field8258 > var19.field7808 + var17 && (var18 + var19.field7846) >= 0 && class656.field9155 > (var19.field7828 + var18)) {
                                class223.field2911.method2087(new class195(var15), -119);
                            }
                        }
                    }
                }
                class650.field9060.method2292(-119, 64, 128);
                class262.field3517.field8306 = 2;
                class262.field3517.method3337(arg0 ^ 0xFFFFFFEA);
            }
        }
        return true;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1834(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
