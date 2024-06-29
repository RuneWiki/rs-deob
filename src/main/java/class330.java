import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class class330 {

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Lfc;")
    public static class216 field4307;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field4309;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4302;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "[[[B")
    public static byte[][][] field4304;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public abstract void method168(byte arg0);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ILqa;B)Z")
    public static final boolean method1856(int arg0, class206 arg1, byte arg2) {
        field4303++;
        int var3 = (class106.field1289 - 104) / 2;
        int var4 = (class422.field5452 - 104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; var6++) {
            for (int var57 = var4; var57 < var4 + 104; var57++) {
                for (int var58 = arg0; var58 <= 3; var58++) {
                    if (class566.method3298(var6, var58, arg0, (byte) -121, var57)) {
                        int var59 = var58;
                        if (class150.method821(var57, var6, 0)) {
                            var59 = var58 - 1;
                        }
                        if (var59 >= 0) {
                            var5 &= class515.method2952((byte) 105, var59, var57, var6);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        }
        int[] var7 = new int[262144];
        for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = -16777216;
        }
        class19.field138 = arg1.method1114(var7, 0, 512, 512, 512);
        class199.method1075((byte) -81);
        int var9 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 228 << 16) + ((int) (Math.random() * 20.0D) + 238 + -10 << 8) + 238 - 10 | 0xFF000000;
        int var10 = (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF00 << 16;
        int var11 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
        boolean[][] var12 = new boolean[class290.field3767 + 1][class290.field3767 + 1];
        for (int var13 = var3; var13 < var3 + 104; var13 += class290.field3767) {
            for (int var36 = var4; var36 < var4 + 104; var36 += class290.field3767) {
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
                int var41 = var13 + class290.field3767;
                if (var41 < 104) {
                    var41++;
                }
                int var42 = class290.field3767 + var36;
                if (var42 < 104) {
                    var38 += 4;
                    var42++;
                }
                arg1.method1107(0, 0, class290.field3767 * 4 + var37, var38 - -(class290.field3767 * 4));
                arg1.method1156(-16777216);
                for (int var43 = arg0; var43 <= 3; var43++) {
                    for (int var50 = 0; var50 <= class290.field3767; var50++) {
                        for (int var56 = 0; var56 <= class290.field3767; var56++) {
                            var12[var50][var56] = class566.method3298(var39 + var50, var43, arg0, (byte) -121, var40 + var56);
                        }
                    }
                    class90.field1114[var43].method852(0, 0, 1024, var39, var40, var41, var42, var12);
                    if (!class360.field4735) {
                        for (int var51 = -4; var51 < class290.field3767; var51++) {
                            for (int var52 = -4; var52 < class290.field3767; var52++) {
                                int var53 = var13 + var51;
                                int var54 = var36 + var52;
                                if (var53 >= var3 && var54 >= var4 && class566.method3298(var53, var43, arg0, (byte) -121, var54)) {
                                    int var55 = var43;
                                    if (class150.method821(var54, var53, arg2 ^ 0x4B)) {
                                        var55 = var43 - 1;
                                    }
                                    if (var55 >= 0) {
                                        client.method1404(var53, var54, (class290.field3767 - var52) * 4 + var38 - 4, var9, 0, arg1, var55, var51 * 4 + var37, var10);
                                    }
                                }
                            }
                        }
                    }
                }
                if (class360.field4735) {
                    class542 var44 = class309.field3939[arg0];
                    for (int var45 = 0; var45 < class290.field3767; var45++) {
                        for (int var46 = 0; var46 < class290.field3767; var46++) {
                            int var47 = var13 + var45;
                            int var48 = var36 + var46;
                            int var49 = var44.field7922[var47 - var44.field7939][var48 - var44.field7915];
                            if ((var49 & 0x40240000) != 0) {
                                arg1.method1118(-1713569622, (byte) 113, 4, var45 * 4 + var37, (-var46 + class290.field3767) * 4 + var38 + -4, 4);
                            } else if ((var49 & 0x800000) != 0) {
                                arg1.method1115(4, -1713569622, (class290.field3767 - var46) * 4 + var38 - 4, var37 - -(var45 * 4), true);
                            } else if ((var49 & 0x2000000) != 0) {
                                arg1.method1195(arg2 ^ 0x4A, var45 * 4 + var37 + 3, 4, -1713569622, (class290.field3767 - var46) * 4 + var38 - 4);
                            } else if ((var49 & 0x8000000) != 0) {
                                arg1.method1115(4, -1713569622, (class290.field3767 - var46) * 4 + var38 + 3 - 4, var37 - -(var45 * 4), true);
                            } else if ((var49 & 0x20000000) != 0) {
                                arg1.method1195(1, var45 * 4 + var37, 4, -1713569622, (class290.field3767 - var46) * 4 + var38 - 4);
                            }
                        }
                    }
                }
                arg1.method1133(var37, var38, class290.field3767 * 4, class290.field3767 * 4, var11, 2);
                class19.field138.method4((var13 - var3) * 4 + 48, -((-var4 + var36) * 4) + 464 + -(class290.field3767 * 4), class290.field3767 * 4, class290.field3767 * 4, var37, var38);
            }
        }
        arg1.method1182();
        arg1.method1156(-16777215);
        class562.method3279((byte) -108);
        class163.field1994 = 0;
        class425.field5478.method1048(arg2 - 7805);
        if (arg2 != 75) {
            return true;
        }
        if (!class360.field4735) {
            for (int var14 = var3; var14 < var3 + 104; var14++) {
                for (int var20 = var4; var20 < (var4 + 104); var20++) {
                    for (int var21 = arg0; var21 <= arg0 + 1 && var21 <= 3; var21++) {
                        if (class566.method3298(var14, var21, arg0, (byte) -121, var20)) {
                            class269 var22 = (class269) class543.method3171(var21, var14, var20);
                            if (var22 == null) {
                                var22 = (class269) class198.method1072(var21, var14, var20, field4309 == null ? (field4309 = method1860("fp")) : field4309);
                            }
                            if (var22 == null) {
                                var22 = (class269) class19.method124(var21, var14, var20);
                            }
                            if (var22 == null) {
                                var22 = (class269) class31.method181(var21, var14, var20);
                            }
                            if (var22 != null) {
                                class437 var23 = class16.field126.method1759(false, var22.method342(arg2 ^ 0xFFFFF6AC));
                                if (!var23.field5991 || class170.field2073) {
                                    int var24 = var23.field6008;
                                    if (var23.field6004 != null) {
                                        for (int var25 = 0; var25 < var23.field6004.length; var25++) {
                                            if (var23.field6004[var25] != -1) {
                                                class437 var26 = class16.field126.method1759(false, var23.field6004[var25]);
                                                if (var26.field6008 >= 0) {
                                                    var24 = var26.field6008;
                                                }
                                            }
                                        }
                                    }
                                    if (var24 >= 0) {
                                        boolean var27 = false;
                                        if (var24 >= 0) {
                                            class107 var28 = class450.field6233.method3245((byte) -119, var24);
                                            if (var28 != null && var28.field1334) {
                                                var27 = true;
                                            }
                                        }
                                        int var29 = var14;
                                        int var30 = var20;
                                        if (var27) {
                                            int[][] var31 = class309.field3939[var21].field7922;
                                            int var32 = class309.field3939[var21].field7939;
                                            int var33 = class309.field3939[var21].field7915;
                                            for (int var34 = 0; var34 < 10; var34++) {
                                                int var35 = (int) (Math.random() * 4.0D);
                                                if (var35 == 0 && var29 > var3 && var29 > var14 - 3 && (var31[var29 - var32 - 1][var30 - var33] & 0x2C0108) == 0) {
                                                    var29--;
                                                }
                                                if (var35 == 1 && var29 < var3 + 104 - 1 && var29 < (var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 0x2C0180) == 0) {
                                                    var29++;
                                                }
                                                if (var35 == 2 && var30 > var4 && var30 > var20 - 3 && (var31[var29 - var32][var30 - var33 - 1] & 0x2C0102) == 0) {
                                                    var30--;
                                                }
                                                if (var35 == 3 && var4 + 104 - 1 > var30 && var20 + 3 > var30 && (var31[var29 - var32][var30 + 1 - var33] & 0x2C0120) == 0) {
                                                    var30++;
                                                }
                                            }
                                        }
                                        class643.field9313[class163.field1994] = var23.field5996;
                                        class634.field9126[class163.field1994] = var29;
                                        class250.field3230[class163.field1994] = var30;
                                        class163.field1994++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (class315.field4019 != null) {
                class489.field6828.field6068 = 1;
                class450.field6233.method3246(1024, 64, false);
                for (int var15 = 0; var15 < class315.field4019.field4406; var15++) {
                    int var16 = class315.field4019.field4403[var15];
                    if (var16 >> 28 == class103.field1265.field8660) {
                        int var17 = ((var16 & 0xFFFC61A) >> 14) - class632.field9113;
                        int var18 = (var16 & 0x3FFF) - class119.field1504;
                        if (var17 >= 0 && class106.field1289 > var17 && var18 >= 0 && var18 < class422.field5452) {
                            class425.field5478.method1040(new class171(var15), -115);
                        } else {
                            class107 var19 = class450.field6233.method3245((byte) -119, class315.field4019.field4404[var15]);
                            if (var19.field1309 != null && (var17 + var19.field1312) >= 0 && var19.field1302 + var17 < class106.field1289 && var19.field1313 + var18 >= 0 && var19.field1328 + var18 < class422.field5452) {
                                class425.field5478.method1040(new class171(var15), -122);
                            }
                        }
                    }
                }
                class450.field6233.method3246(128, 64, false);
                class489.field6828.field6068 = 2;
                class489.field6828.method2549(arg2 + 22);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
    public static void method1857(byte arg0) {
        field4302 = null;
        field4304 = null;
        int var1 = -86 % ((arg0 - 1) / 63);
        field4307 = null;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z")
    public abstract boolean method166(boolean arg0);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public abstract void method174(int arg0);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)I")
    public abstract int method167(int arg0);

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I")
    public abstract int method169(int arg0);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z")
    public abstract boolean method175(int arg0);

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)Z")
    public static final boolean method1858(byte arg0, int arg1) {
        field4306++;
        if (arg0 != -58) {
            method1856(-55, null, (byte) 124);
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Z")
    public final boolean method1859(byte arg0) {
        field4308++;
        int var2 = -80 / ((-arg0 - 58) / 49);
        return this.method175(20) || this.method176(-66) || this.method166(false);
    }

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)Z")
    public abstract boolean method176(int arg0);

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "(B)Luf;")
    public abstract class379 method178(byte arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1860(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field4305 = 0;
    }
}
