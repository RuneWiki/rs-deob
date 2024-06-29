import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class39 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "Lcf;")
    public static class93 field601 = class147.method1066("(U1", -48);

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field602 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lcf;")
    public static class93 field608 = class147.method1066("(Z", -48);

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Lcf;")
    public static class93 field604 = class147.method1066(":clan:", -48);

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Lcf;")
    public static class93 field611 = class147.method1066("headicons_pk", -48);

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Lcf;")
    public static class93 field605 = class147.method1066("titlebg", -48);

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "[I")
    public static int[] field606 = new int[100];

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "Lcf;")
    public static class93 field613 = class147.method1066("3D)2Softwarebibliothek gestartet)3", -48);

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "[[I")
    public static int[][] field597;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIILtg;I)V")
    public static final void method223(int arg0, int arg1, int arg2, class181 arg3, int arg4) {
        field600++;
        class226.method1559(false);
        class75.method507(arg0, arg1, arg3.field3270 + arg0, arg3.field3252 + arg1);
        if (class14.field170 == 2 || class14.field170 == 5 || class242.field4374 == null) {
            class75.method526(arg0, arg1, 0, arg3.field3261, arg3.field3257);
        } else {
            int var5 = class166.field2927.field3868 / 32 + 48;
            int var6 = class50.field825 + class95.field1719 & 0x7FF;
            int var7 = 464 - (class166.field2927.field3784 / 32);
            ((class158) class242.field4374).method561(arg0, arg1, arg3.field3270, arg3.field3252, var5, var7, var6, class248.field4458 + 256, arg3.field3261, arg3.field3257);
            if (class51.field837 != null) {
                for (int var8 = 0; var8 < class51.field837.field2273; var8++) {
                    if (class51.field837.method944(false, var8)) {
                        int var9 = (class51.field837.field2277[var8] - class229.field4111) * 4 + 2 - (class166.field2927.field3868 / 32);
                        int var10 = (class51.field837.field2265[var8] - class4.field52) * 4 + 2 - (class166.field2927.field3784 / 32);
                        int var11 = class179.field3155[var6];
                        int var12 = class179.field3158[var6];
                        int var13 = var11 * 256 / (class248.field4458 + 256);
                        int var14 = var12 * 256 / (class248.field4458 + 256);
                        int var15 = var10 * var13 + (var9 * var14) >> 16;
                        class274 var16 = class63.field1149;
                        if (class51.field837.method940(var8, (byte) -112) == 1) {
                            var16 = class140.field2436;
                        }
                        int var17 = var10 * var14 - var9 * var13 >> 16;
                        if (class51.field837.method940(var8, (byte) -112) == 2) {
                            var16 = class183.field3383;
                        }
                        int var18 = var16.method1835(class51.field837.field2260[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= (-arg3.field3270) && arg3.field3270 >= var19 && var17 >= (-arg3.field3252) && var17 <= arg3.field3252) {
                            int var20 = 16777215;
                            if (class51.field837.field2276[var8] != -1) {
                                var20 = class51.field837.field2276[var8];
                            }
                            class75.method519(arg3.field3261, arg3.field3257);
                            var16.method1828(class51.field837.field2260[var8], arg3.field3270 / 2 + var19 + arg0, arg3.field3252 / 2 + -var17 + arg1, var18, 50, var20, 0, 256, 1, 0, 0);
                            class75.method506();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class78.field1467; var21++) {
                int var56 = class191.field3484[var21] * 4 - (class166.field2927.field3868 / 32 - 2);
                int var57 = class178.field3142[var21] * 4 + 2 - (class166.field2927.field3784 / 32);
                class240 var58 = class34.method197(-126, class25.field316[var21]);
                if (var58.field4275 != null) {
                    var58 = var58.method1631(arg4 ^ 0x20);
                    if (var58 == null || var58.field4272 == -1) {
                        continue;
                    }
                }
                class231.method1583(var56, 1, arg0, var57, arg1, class130.field2289[var58.field4272], arg3);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class160 var53 = class109.field1858[class138.field2405][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class166.field2927.field3868 / 32);
                        int var55 = var52 * 4 + 2 - (class166.field2927.field3784 / 32);
                        class231.method1583(var54, arg4 ^ 0x21, arg0, var55, arg1, class166.field2922[0], arg3);
                    }
                }
            }
            for (int var23 = 0; var23 < class72.field1299; var23++) {
                class227 var48 = class155.field2709[class58.field995[var23]];
                if (var48 != null && var48.method1478((byte) -116)) {
                    class145 var49 = var48.field4062;
                    if (var49 != null && var49.field2523 != null) {
                        var49 = var49.method1058(249);
                    }
                    if (var49 != null && var49.field2553 && var49.field2554) {
                        int var50 = var48.field3868 / 32 - class166.field2927.field3868 / 32;
                        int var51 = var48.field3784 / 32 - class166.field2927.field3784 / 32;
                        if (var49.field2545 == -1) {
                            class231.method1583(var50, 1, arg0, var51, arg1, class166.field2922[1], arg3);
                        } else {
                            class231.method1583(var50, arg4 - 31, arg0, var51, arg1, class130.field2289[var49.field2545], arg3);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class252.field4543; var24++) {
                class237 var38 = class224.field4031[class234.field4166[var24]];
                if (var38 != null && var38.method1478((byte) -117)) {
                    int var39 = var38.field3868 / 32 - (class166.field2927.field3868 / 32);
                    int var40 = var38.field3784 / 32 - (class166.field2927.field3784 / 32);
                    boolean var41 = false;
                    long var42 = var38.field4247.method679((byte) 84);
                    for (int var44 = 0; var44 < class145.field2567; var44++) {
                        if (class284.field5095[var44] == var42 && class220.field3999[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class161.field2834; var46++) {
                        if (class97.field1733[var46].field4006 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class166.field2927.field4220 != 0 && var38.field4220 != 0 && class166.field2927.field4220 == var38.field4220) {
                        var47 = true;
                    }
                    if (var41) {
                        class231.method1583(var39, 1, arg0, var40, arg1, class166.field2922[3], arg3);
                    } else if (var45) {
                        class231.method1583(var39, 1, arg0, var40, arg1, class166.field2922[5], arg3);
                    } else if (var47) {
                        class231.method1583(var39, 1, arg0, var40, arg1, class166.field2922[4], arg3);
                    } else {
                        class231.method1583(var39, 1, arg0, var40, arg1, class166.field2922[2], arg3);
                    }
                }
            }
            class174[] var25 = class44.field707;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class174 var29 = var25[var26];
                if (var29 != null && var29.field3028 != 0 && (class275.field4921 % 20) < 10) {
                    if (var29.field3028 == 1 && var29.field3022 >= 0 && class155.field2709.length > var29.field3022) {
                        class227 var30 = class155.field2709[var29.field3022];
                        if (var30 != null) {
                            int var31 = var30.field3868 / 32 - class166.field2927.field3868 / 32;
                            int var32 = var30.field3784 / 32 - (class166.field2927.field3784 / 32);
                            class9.method37(var31, arg3, arg1, var29.field3025, var32, arg0, (byte) 104);
                        }
                    }
                    if (var29.field3028 == 2) {
                        int var33 = (var29.field3038 - class229.field4111) * 4 - (class166.field2927.field3868 / 32 - 2);
                        int var34 = (var29.field3026 - class4.field52) * 4 + 2 - (class166.field2927.field3784 / 32);
                        class9.method37(var33, arg3, arg1, var29.field3025, var34, arg0, (byte) 115);
                    }
                    if (var29.field3028 == 10 && var29.field3022 >= 0 && var29.field3022 < class224.field4031.length) {
                        class237 var35 = class224.field4031[var29.field3022];
                        if (var35 != null) {
                            int var36 = var35.field3868 / 32 - (class166.field2927.field3868 / 32);
                            int var37 = var35.field3784 / 32 - (class166.field2927.field3784 / 32);
                            class9.method37(var36, arg3, arg1, var29.field3025, var37, arg0, (byte) 51);
                        }
                    }
                }
            }
            if (class55.field908 != 0) {
                int var27 = class269.field4802 * 4 + 2 - (class166.field2927.field3784 / 32);
                int var28 = class55.field908 * 4 + 2 - (class166.field2927.field3868 / 32);
                class231.method1583(var28, 1, arg0, var27, arg1, class101.field1752, arg3);
            }
            class75.method517(arg3.field3270 / 2 + arg0 - 1, arg3.field3252 / 2 + arg1 + -1, 3, 3, 16777215);
        }
        class252.field4541[arg2] = true;
        if (arg4 != 32) {
            field604 = null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V")
    public static void method224(byte arg0) {
        field611 = null;
        field606 = null;
        field597 = null;
        int var1 = 67 / ((arg0 - 65) / 40);
        field613 = null;
        field604 = null;
        field608 = null;
        field605 = null;
        field601 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
    public static final Object method225(byte[] arg0, boolean arg1, boolean arg2) {
        field598++;
        if (!arg1) {
            field611 = null;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class272.field4836) {
            try {
                class47 var3 = (class47) Class.forName("lc").getDeclaredConstructor().newInstance();
                var3.method263(arg0, (byte) -29);
                return var3;
            } catch (Throwable var4) {
                class272.field4836 = true;
            }
        }
        return arg2 ? class101.method729(arg0, (byte) 85) : arg0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method226(int arg0) {
        if (arg0 != -14863) {
            method223(-6, -35, -31, (class181) null, 32);
        }
        for (int var1 = 0; var1 < 100; var1++) {
            class25.field314[var1] = true;
        }
        field612++;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
    public static final int method227(boolean arg0) {
        field603++;
        if (class234.field4165 == null) {
            return -1;
        }
        while (class234.field4165.field2273 > class203.field3666) {
            if (class234.field4165.method936(class203.field3666, 0)) {
                return class203.field3666++;
            }
            class203.field3666++;
        }
        if (arg0) {
            field608 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static final void method228(int arg0) {
        field607++;
        int var1 = 37 % ((arg0 + 50) / 59);
        if (!class13.method57(2357) && class47.field767 != class138.field2405) {
            class125.method920(class15.field188, false, class138.field2405, class212.field3894, 8, class166.field2927.field3805[0], class166.field2927.field3820[0]);
        } else if (class145.field2518 != class138.field2405 && class44.method246(class138.field2405, (byte) 102)) {
            class145.field2518 = class138.field2405;
            class119.method886(-13858);
        }
    }
}
