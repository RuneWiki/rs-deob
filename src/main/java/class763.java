import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class763 {

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11201 = new String[] { method5510(method5509("\u001dN9\u0007)")), method5510(method5509("\u001dN9\u0006)")), method5510(method5509("\u001dN9\u0005)")) };

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "Lmp;")
    public static class796 field11195 = new class796(method5510(method5509("(uE\u0007")), method5510(method5509("\u0010Gq-b\u001a")), method5510(method5509(" St")), 1);

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "[I")
    public static int[] field11199 = new int[16384];

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "[I")
    public static int[] field11200 = new int[16384];

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field11196;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field11197;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Ldca;")
    public static class186 field11198;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
    public static void method5506(byte arg0) {
        try {
            if (arg0 >= -100) {
                method5507(-124, 47, 95, -32, true, -62);
            }
            field11199 = null;
            field11200 = null;
            field11195 = null;
            field11198 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11201[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIIZI)V")
    public static final void method5507(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            field11196++;
            if (class85.field1280 == null) {
                class662.field9437.method664(arg0, -16777216, arg2, arg1, arg3, true);
            } else if (class438.field6846.field9985 >= 0 && (class126.field1823 * 512) > class438.field6846.field9985 && class438.field6846.field9983 >= 0 && class438.field6846.field9983 < (class169.field2725 * 512)) {
                class680.field9672++;
                if (class438.field6846 != null && class438.field6846.field9985 - ((class438.field6846.method804(true) - 1) * 256) >> 9 == class83.field1262 && class438.field6846.field9983 - ((class438.field6846.method804(true) - 1) * 256) >> 9 == class232.field3598) {
                    class232.field3598 = -1;
                    class83.field1262 = -1;
                    class67.method704(-107);
                }
                class549.method4077((byte) -78);
                if (!arg4) {
                    class75.method780((byte) 114);
                }
                class505.method3805((byte) -122);
                class625.method4560(arg2, 100, true, arg0, arg3, arg1);
                int var24 = class672.field9542;
                if (arg5 > 65) {
                    int var21 = class624.field8999;
                    int var22 = class340.field5549;
                    class547.field8042 = class547.field8037;
                    int var23 = class361.field5823;
                    if (class401.field6334 == 1) {
                        int var6 = (int) class418.field6612;
                        if ((class585.field8485 >> 8) > var6) {
                            var6 = class585.field8485 >> 8;
                        }
                        if (class576.field8309[4] && var6 < class639.field9141[4] + 128) {
                            var6 = class639.field9141[4] + 128;
                        }
                        int var7 = (int) class29.field293 + class592.field8574 & 0x3FFF;
                        class128.method1230(false, var24, var6, class207.method1873(class438.field6846.field9985, -10, class673.field9554, class438.field6846.field9983) - 200, (var6 >> 3) * 3 + 600 << 2, class147.field2059, var7, class524.field7735);
                    } else if (class401.field6334 == 4) {
                        int var8 = (int) class418.field6612;
                        if (var8 < class585.field8485 >> 8) {
                            var8 = class585.field8485 >> 8;
                        }
                        if (class576.field8309[4] && class639.field9141[4] + 128 > var8) {
                            var8 = class639.field9141[4] + 128;
                        }
                        int var9 = (int) class29.field293 & 0x3FFF;
                        class128.method1230(false, var24, var8, class207.method1873(class537.field7887, -10, class673.field9554, class505.field7560) - 200, (var8 >> 3) * 3 + 600 << 2, class147.field2059, var9, class524.field7735);
                    } else if (class401.field6334 == 5) {
                        class264.method2293(var24, (byte) -122);
                    }
                    int var10 = class791.field11550;
                    int var11 = class396.field6285;
                    int var12 = class133.field1896;
                    int var13 = class134.field1902;
                    int var14 = class728.field10661;
                    for (int var15 = 0; var15 < 5; var15++) {
                        if (class576.field8309[var15]) {
                            int var16 = (int) (Math.random() * (double) (class71.field995[var15] * 2 + 1) + Math.sin((double) class222.field3487[var15] / 100.0D * (double) class31.field365[var15]) * (double) class639.field9141[var15] - (double) class71.field995[var15]);
                            if (var15 == 2) {
                                class133.field1896 += var16 << 2;
                            }
                            if (var15 == 4) {
                                class134.field1902 += var16;
                                if (class134.field1902 < 1024) {
                                    class134.field1902 = 1024;
                                } else if (class134.field1902 > 3072) {
                                    class134.field1902 = 3072;
                                }
                            }
                            if (var15 == 0) {
                                class791.field11550 += var16 << 2;
                            }
                            if (var15 == 3) {
                                class728.field10661 = class728.field10661 + var16 & 0x3FFF;
                            }
                            if (var15 == 1) {
                                class396.field6285 += var16 << 2;
                            }
                        }
                    }
                    if (class791.field11550 < 0) {
                        class791.field11550 = 0;
                    }
                    if (((class150.field2096 << 9) - 1) < class791.field11550) {
                        class791.field11550 = (class150.field2096 << 9) - 1;
                    }
                    if (class133.field1896 < 0) {
                        class133.field1896 = 0;
                    }
                    if (class133.field1896 > (class117.field1705 << 9) - 1) {
                        class133.field1896 = (class117.field1705 << 9) - 1;
                    }
                    class665.method4827(73);
                    class138.method1285((byte) 126);
                    class662.field9437.method221(var22, var21, var22 + var23, var21 + var24);
                    class381.method3120(21690, true);
                    if (class316.field5141) {
                        class587.method4309(29, class711.field10286);
                        if (class551.field8085 != class547.field8042) {
                            class540.field7961 = true;
                        }
                        class551.field8085 = class547.field8042;
                    } else {
                        class662.field9437.method196();
                        int var17 = class711.field10286;
                        if (class641.field9192 == null) {
                            class662.field9437.method182(var17);
                        } else {
                            class641.field9192.method928(0, var24, class662.field9437, class134.field1902, var17, var21, class652.field9338 << 3, var23, class728.field10661, var22);
                        }
                    }
                    class672.method4864(123);
                    class400.field6321.method2478(class791.field11550, class396.field6285, class133.field1896, -class134.field1902 & 0x3FFF, -class728.field10661 & 0x3FFF, -class554.field8109 & 0x3FFF);
                    class662.field9437.method254(class400.field6321);
                    class662.field9437.method156(var23 / 2 + var22, var24 / 2 + var21, class129.field1845 << 1, class129.field1845 << 1);
                    class689.method5014(-26998, class129.field1845 << 1, class129.field1845 << 1, var22 + (var23 / 2), var24 / 2 + var21);
                    class116.method1151(4096, class133.field1896, class396.field6285, class791.field11550, -class554.field8109 & 0x3FFF, -class728.field10661 & 0x3FFF, -class134.field1902 & 0x3FFF);
                    byte var18 = class623.field8996.field6384.method5351(true) == 2 ? (byte) class680.field9672 : 1;
                    if (class316.field5141) {
                        class653.method4757(2, -class554.field8109 & 0x3FFF, -class728.field10661 & 0x3FFF, -class134.field1902 & 0x3FFF);
                        class260.method2192(class396.field6285, class547.field8042, true, class438.field6846.field9985 >> 9, class32.field388, class133.field1896, class738.field10850, class431.field6776, var18, class438.field6846.field9975 + 1, class783.field11429, class623.field8996.field6373.method5657(true) == 0, class69.field987, true, class390.field6231, class438.field6846.field9983 >> 9, class297.field4845, class791.field11550);
                    } else {
                        class644.method4660(class431.field6776, class791.field11550, class396.field6285, class133.field1896, class32.field388, class783.field11429, class738.field10850, class297.field4845, class390.field6231, class69.field987, class438.field6846.field9975 + 1, var18, class438.field6846.field9985 >> 9, class438.field6846.field9983 >> 9, class623.field8996.field6373.method5657(true) == 0, true, class200.field3163 ? class547.field8042 : -1, 0, false);
                    }
                    class672.method4864(106);
                    if (class315.field5127 == 11) {
                        class297.method2563(var21, 2, 256, var24, var22, 256, var23);
                        class687.method5001(var23, 256, (byte) 99, var24, var21, var22, 256);
                        class734.method5330(var22, 256, var23, -239315007, var24, 256, var21);
                        class62.method652(var24, var22, var23, var21, -8);
                    }
                    class751.method5450();
                    class134.field1902 = var13;
                    class133.field1896 = var12;
                    class791.field11550 = var10;
                    class728.field10661 = var14;
                    class396.field6285 = var11;
                    if (class32.field387 && class173.field2772.method5632(80) == 0) {
                        class32.field387 = false;
                    }
                    if (class32.field387) {
                        class662.field9437.method664(var21, -16777216, var23, var22, var24, true);
                        class567.method4167(false, (byte) 120, class662.field9437, class64.field877, class709.field10214.method5154(class795.field11624, (byte) 65), class213.field3367);
                    }
                    class381.method3120(21690, false);
                }
            } else {
                class662.field9437.method664(arg0, -16777216, arg2, arg1, arg3, true);
            }
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field11201[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(III)Z")
    public static final boolean method5508(int arg0, int arg1, int arg2) {
        try {
            if (arg2 > -30) {
                return true;
            } else {
                field11197++;
                return (arg1 & 0x84080) != 0;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11201[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field11199[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field11200[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5509(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5510(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 127;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 68;
                    break;
                default:
                    var10005 = 1;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
