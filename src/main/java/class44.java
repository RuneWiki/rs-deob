import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class44 {

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "I")
    private int field882 = 0;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    private int field885 = -1;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "Lcc;")
    public static class209 field879 = null;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "Lcc;")
    public static class209 field870 = class95.method669(81, "Clientscript error in: ");

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lcc;")
    public static class209 field878 = class95.method669(100, "mem=");

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lcc;")
    public static class209 field890 = class95.method669(89, "Cach-B");

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public int field874;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field875;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public int field886;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Ln;")
    public static class16 field873;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "[Lal;")
    public static class231[] field876;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[[[B")
    public static byte[][][] field868;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BIIII)V")
    public static final void method327(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class84.field1677.field2085 = 0;
        class84.field1677.method773(-6385, 237);
        class84.field1677.method773(-6385, arg2);
        class84.field1677.method773(-6385, arg4);
        field877++;
        class84.field1677.method740(255, arg1);
        class84.field1677.method740(255, arg3);
        class64.field1247 = 0;
        class141.field2608 = 0;
        class78.field1444 = 1;
        if (arg0 >= -27) {
            field873 = null;
        }
        class72.field1360 = -3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltf;III)V")
    private final void method328(class106 arg0, int arg1, int arg2, int arg3) {
        field871++;
        if (arg2 != -15134) {
            field887 = -46;
        }
        if (arg1 == 1) {
            this.field882 = arg0.method776(arg2 ^ 0xFFFFC49E);
            this.method336(this.field882, 65377);
        } else if (arg1 == 2) {
            this.field885 = arg0.method736(arg2 + 15261);
            if (this.field885 == 65535) {
                this.field885 = -1;
                return;
            }
        } else if (arg1 == 3) {
            arg0.method736(arg2 + 15260);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIILji;I)V")
    public static final void method329(int arg0, int arg1, int arg2, class42 arg3, int arg4) {
        field881++;
        class117.method831(-413981948);
        class4.method32(arg0, arg4, arg3.field789 + arg0, arg3.field758 + arg4);
        if (class8.field158 == 2 || class8.field158 == 5 || class254.field4593 == null) {
            class4.method27(arg0, arg4, 0, arg3.field838, arg3.field757);
        } else {
            int var5 = class54.field1066 + class253.field4565 & 0x7FF;
            int var6 = (class223.field4069.field1571 / 32) + 48;
            int var7 = 464 - (class223.field4069.field1534 / 32);
            ((class269) class254.field4593).method234(arg0, arg4, arg3.field789, arg3.field758, var6, var7, var5, class132.field2523 + 256, arg3.field838, arg3.field757);
            if (class126.field2433 != null) {
                for (int var8 = 0; var8 < class126.field2433.field3036; var8++) {
                    if (class126.field2433.method1156(var8, (byte) -126)) {
                        int var9 = (class126.field2433.field3031[var8] - class174.field3178) * 4 + 2 - (class223.field4069.field1571 / 32);
                        int var10 = (class126.field2433.field3035[var8] - class245.field4444) * 4 + 2 - (class223.field4069.field1534 / 32);
                        int var11 = class15.field280[var5];
                        int var12 = var11 * 256 / (class132.field2523 + 256);
                        int var13 = class15.field278[var5];
                        int var14 = var13 * 256 / (class132.field2523 + 256);
                        int var15 = var10 * var12 - (var9 * var14) >> 16;
                        int var16 = var9 * var12 + var10 * var14 >> 16;
                        class188 var17 = class66.field1270;
                        if (class126.field2433.method1154(var8, 3) == 1) {
                            var17 = class256.field4623;
                        }
                        if (class126.field2433.method1154(var8, 3) == 2) {
                            var17 = class66.field1269;
                        }
                        int var18 = var17.method1286(class126.field2433.field3032[var8], 100);
                        int var19 = var16 - var18 / 2;
                        if (var19 >= (-arg3.field789) && var19 <= arg3.field789 && -arg3.field758 <= var15 && arg3.field758 >= var15) {
                            int var20 = 16777215;
                            if (class126.field2433.field3029[var8] != -1) {
                                var20 = class126.field2433.field3029[var8];
                            }
                            class4.method35(arg3.field838, arg3.field757);
                            var17.method1278(class126.field2433.field3032[var8], var19 + arg0 + (arg3.field789 / 2), arg4 - -(arg3.field758 / 2) + -var15, var18, 50, var20, 0, 256, 1, 0, 0);
                            class4.method26();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class52.field1031; var21++) {
                int var56 = class153.field2763[var21] * 4 + 2 - (class223.field4069.field1571 / 32);
                int var57 = class290.field5109[var21] * 4 + 2 - class223.field4069.field1534 / 32;
                class218 var58 = class245.method1711(arg1 ^ 0x1450, class58.field1177[var21]);
                if (var58.field3917 != null) {
                    var58 = var58.method1535((byte) -123);
                    if (var58 == null || var58.field3944 == -1) {
                        continue;
                    }
                }
                class279.method1887(class230.field4186[var58.field3944], arg4, (byte) 82, var57, arg0, var56, arg3);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var52 = 0; var52 < 104; var52++) {
                    class162 var53 = class280.field4931[class99.field1937][var22][var52];
                    if (var53 != null) {
                        int var54 = var22 * 4 + 2 - (class223.field4069.field1571 / 32);
                        int var55 = var52 * 4 + 2 - (class223.field4069.field1534 / 32);
                        class279.method1887(class97.field1896[0], arg4, (byte) 111, var55, arg0, var54, arg3);
                    }
                }
            }
            for (int var23 = 0; var23 < class219.field3996; var23++) {
                class163 var48 = class60.field1207[class249.field4492[var23]];
                if (var48 != null && var48.method576(false)) {
                    class237 var49 = var48.field2969;
                    if (var49 != null && var49.field4295 != null) {
                        var49 = var49.method1636(94);
                    }
                    if (var49 != null && var49.field4249 && var49.field4245) {
                        int var50 = var48.field1571 / 32 - (class223.field4069.field1571 / 32);
                        int var51 = var48.field1534 / 32 - (class223.field4069.field1534 / 32);
                        if (var49.field4284 == -1) {
                            class279.method1887(class97.field1896[1], arg4, (byte) 84, var51, arg0, var50, arg3);
                        } else {
                            class279.method1887(class230.field4186[var49.field4284], arg4, (byte) 111, var51, arg0, var50, arg3);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class250.field4502; var24++) {
                class108 var38 = class103.field1993[class82.field1653[var24]];
                if (var38 != null && var38.method576(false)) {
                    int var39 = var38.field1534 / 32 - (class223.field4069.field1534 / 32);
                    boolean var40 = false;
                    int var41 = var38.field1571 / 32 - class223.field4069.field1571 / 32;
                    long var42 = var38.field2140.method1448(true);
                    for (int var44 = 0; var44 < class3.field38; var44++) {
                        if (class179.field3253[var44] == var42 && class198.field3541[var44] != 0) {
                            var40 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class6.field113; var46++) {
                        if (class42.field743[var46].field596 == var42) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    if (class223.field4069.field2178 != 0 && var38.field2178 != 0 && class223.field4069.field2178 == var38.field2178) {
                        var47 = true;
                    }
                    if (var40) {
                        class279.method1887(class97.field1896[3], arg4, (byte) 118, var39, arg0, var41, arg3);
                    } else if (var45) {
                        class279.method1887(class97.field1896[5], arg4, (byte) 107, var39, arg0, var41, arg3);
                    } else if (var47) {
                        class279.method1887(class97.field1896[4], arg4, (byte) 125, var39, arg0, var41, arg3);
                    } else {
                        class279.method1887(class97.field1896[2], arg4, (byte) 101, var39, arg0, var41, arg3);
                    }
                }
            }
            class273[] var25 = class1.field21;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class273 var29 = var25[var26];
                if (var29 != null && var29.field4830 != 0 && class163.field2968 % 20 < 10) {
                    if (var29.field4830 == 1 && var29.field4839 >= 0 && var29.field4839 < class60.field1207.length) {
                        class163 var30 = class60.field1207[var29.field4839];
                        if (var30 != null) {
                            int var31 = var30.field1534 / 32 - (class223.field4069.field1534 / 32);
                            int var32 = var30.field1571 / 32 - (class223.field4069.field1571 / 32);
                            class74.method525(arg0, arg4, arg3, var31, var32, -120, var29.field4833);
                        }
                    }
                    if (var29.field4830 == 2) {
                        int var33 = (var29.field4845 - class245.field4444) * 4 + 2 - (class223.field4069.field1534 / 32);
                        int var34 = (var29.field4843 - class174.field3178) * 4 + 2 - (class223.field4069.field1571 / 32);
                        class74.method525(arg0, arg4, arg3, var33, var34, -78, var29.field4833);
                    }
                    if (var29.field4830 == 10 && var29.field4839 >= 0 && class103.field1993.length > var29.field4839) {
                        class108 var35 = class103.field1993[var29.field4839];
                        if (var35 != null) {
                            int var36 = var35.field1571 / 32 - (class223.field4069.field1571 / 32);
                            int var37 = var35.field1534 / 32 - class223.field4069.field1534 / 32;
                            class74.method525(arg0, arg4, arg3, var37, var36, -114, var29.field4833);
                        }
                    }
                }
            }
            if (class181.field3283 != 0) {
                int var27 = class181.field3283 * 4 + 2 - (class223.field4069.field1571 / 32);
                int var28 = class102.field1959 * 4 + 2 - (class223.field4069.field1534 / 32);
                class279.method1887(class176.field3223, arg4, (byte) 110, var28, arg0, var27, arg3);
            }
            class4.method39(arg3.field789 / 2 + arg0 - 1, arg4 - (-(arg3.field758 / 2) - -1), 3, 3, 16777215);
        }
        if (arg1 != 32133) {
            method334(0, false);
        }
        class31.field562[arg2] = true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lji;I)Lcc;")
    public static final class209 method330(class42 arg0, int arg1) {
        field884++;
        if (arg1 < 110) {
            field870 = null;
        }
        if (class14.method108(17, client.method1070(arg0)) == 0) {
            return null;
        } else if (arg0.field760 == null || arg0.field760.method1454(94).method1486(5) == 0) {
            return class70.field1332 ? class72.field1373 : null;
        } else {
            return arg0.field760;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIBIZ)V")
    public static final void method331(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, boolean arg6) {
        field869++;
        if (class220.field4005 == arg2 && class31.field568 == arg3 && class167.field3005 == arg5 || class186.method1273(arg4 + 5)) {
            return;
        }
        class220.field4005 = arg2;
        class31.field568 = arg3;
        class167.field3005 = arg5;
        if (class186.method1273(91)) {
            class167.field3005 = 0;
        }
        if (arg6) {
            class155.method1088(28, arg4 ^ 0xCB5);
        } else {
            class155.method1088(25, -3280);
        }
        class164.method1133(true, (byte) 78, class198.field3544);
        int var7 = class174.field3178;
        class174.field3178 = (arg2 - 6) * 8;
        if (arg4 != -123) {
            method327((byte) -85, -44, 46, -39, -102);
        }
        int var8 = class245.field4444;
        class245.field4444 = (arg3 - 6) * 8;
        class158.field2884 = class200.method1366(arg4 ^ 0xFFFFFFFD, class220.field4005 * 8, class31.field568 * 8);
        class126.field2433 = null;
        int var9 = class245.field4444 - var8;
        int var10 = class174.field3178 - var7;
        int var11 = class245.field4444;
        int var12 = class174.field3178;
        if (arg6) {
            class219.field3996 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class163 var14 = class60.field1207[var13];
                if (var14 != null) {
                    var14.field1534 -= var9 * 128;
                    var14.field1571 -= var10 * 128;
                    if (var14.field1571 >= 0 && var14.field1571 <= 13184 && var14.field1534 >= 0 && var14.field1534 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field1548[var15] -= var10;
                            var14.field1567[var15] -= var9;
                        }
                        class249.field4492[class219.field3996++] = var13;
                    } else {
                        class60.field1207[var13].field2969 = null;
                        class60.field1207[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class163 var32 = class60.field1207[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field1548[var33] -= var10;
                        var32.field1567[var33] -= var9;
                    }
                    var32.field1571 -= var10 * 128;
                    var32.field1534 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class108 var30 = class103.field1993[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field1548[var31] -= var10;
                    var30.field1567[var31] -= var9;
                }
                var30.field1534 -= var9 * 128;
                var30.field1571 -= var10 * 128;
            }
        }
        class99.field1937 = arg5;
        byte var18 = 0;
        class223.field4069.method784(arg0, false, arg1, 58);
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        byte var21 = 0;
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var22 = -1;
            var21 = 103;
            var23 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var10 + var24;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class280.field4931[var29][var24][var26] = class280.field4931[var29][var27][var28];
                    } else {
                        class280.field4931[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class111 var25 = (class111) class88.field1744.method1119(20896); var25 != null; var25 = (class111) class88.field1744.method1120(32)) {
            var25.field2234 -= var10;
            var25.field2243 -= var9;
            if (var25.field2234 < 0 || var25.field2243 < 0 || var25.field2234 >= 104 || var25.field2243 >= 104) {
                var25.method269(-214950896);
            }
        }
        if (arg6) {
            class60.field1213 -= var10 * 128;
            class49.field976 -= var10;
            class76.field1424 -= var9;
            class103.field1990 -= var9 * 128;
            class106.field2053 -= var9;
            class274.field4857 -= var10;
        } else {
            class16.field334 = 1;
        }
        class88.field1748 = 0;
        if (class181.field3283 != 0) {
            class181.field3283 -= var10;
            class102.field1959 -= var9;
        }
        class25.field471 = -1;
        class201.field3606.method1117((byte) 33);
        class261.field4693.method1117((byte) 82);
        class221.method1566();
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Z)V")
    public static void method332(boolean arg0) {
        if (!arg0) {
            field868 = null;
        }
        field873 = null;
        field890 = null;
        field868 = null;
        field870 = null;
        field878 = null;
        field879 = null;
        field876 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ltf;II)V")
    public final void method333(class106 arg0, int arg1, int arg2) {
        while (true) {
            int var4 = arg0.method774((byte) 103);
            if (var4 == 0) {
                if (arg1 != -1) {
                    this.field885 = -102;
                }
                field888++;
                return;
            }
            this.method328(arg0, var4, -15134, arg2);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
    public static final void method334(int arg0, boolean arg1) {
        field883++;
        byte[][] var2 = class247.field4475;
        byte var3 = 4;
        if (arg0 != 31254) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class117.method831(-413981948);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class34.field604[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 3 & 0x7FF;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x6) >> 1;
                            int var12 = (var10 / 8 << 8) + var9 / 8;
                            for (int var13 = 0; var13 < class47.field913.length; var13++) {
                                if (class47.field913[var13] == var12 && var2[var13] != null) {
                                    class198.method1353(arg1, var8, var6 * 8, (var10 & 0x7) * 8, var5 * 8, var4, class122.field2404, var11, var2[var13], (var9 & 0x7) * 8, arg0 ^ 0x7A6A);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZZ)V")
    public static final void method335(boolean arg0, boolean arg1) {
        if (!arg0) {
            field873 = null;
        }
        field872++;
        class234.field4212 = arg1;
        class53.field1034 = !class186.method1273(-62);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)V")
    private final void method336(int arg0, int arg1) {
        field880++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & arg0) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        double var11 = 0.0D;
        double var13 = 0.0D;
        double var15 = var3;
        if (var9 > var7) {
            var9 = var7;
        }
        if (var3 < var5) {
            var15 = var5;
        }
        if (var15 < var7) {
            var15 = var7;
        }
        double var17 = (var9 + var15) / 2.0D;
        if (var9 != var15) {
            if (var17 < 0.5D) {
                var13 = (var15 - var9) / (var9 + var15);
            }
            if (var3 == var15) {
                var11 = (var5 - var7) / (var15 - var9);
            } else if (var5 == var15) {
                var11 = (var7 - var3) / (var15 - var9) + 2.0D;
            } else if (var7 == var15) {
                var11 = (var3 - var5) / (var15 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var15 - var9) / (2.0D - var15 - var9);
            }
        }
        if ((var17 > 0.5D)) {
            this.field886 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field886 = (int) (var13 * var17 * 512.0D);
        }
        double var19 = var11 / 6.0D;
        this.field875 = (int) (var17 * 256.0D);
        if (this.field886 < 1) {
            this.field886 = 1;
        }
        this.field874 = (int) (var13 * 256.0D);
        this.field889 = (int) ((double) this.field886 * var19);
        if (this.field875 < 0) {
            this.field875 = 0;
        } else if (this.field875 > 255) {
            this.field875 = 255;
        }
        if (this.field874 < 0) {
            this.field874 = 0;
        } else if (this.field874 > 255) {
            this.field874 = 255;
        }
    }
}
